#!/bin/bash
export JAVA_HOME=/usr/jdk/jdk-9-jigsaw
export javac=$JAVA_HOME/bin/javac
export jar=$JAVA_HOME/bin/jar
export jlink=$JAVA_HOME/bin/jlink

# remove compilation artefacts
rm -fr build

# modulify tatoo-runtime.jar to fr.umlv.tatoo.runtime
echo "modulify tatoo-runtime.jar"
$javac -d build/modules \
       --module-source-path lib2module \
       $(find lib2module/ -name "*.java")
cp lib/tatoo-runtime.jar mlib/fr.umlv.tatoo.runtime-1.0.jar
$jar --update \
     --file mlib/fr.umlv.tatoo.runtime-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.tatoo.runtime module-info.class

# build fr.umlv.dragon.rt
echo "build fr.umlv.dragon.rt"
$javac -d build/modules \
       --module-source-path src \
       $(find src/fr.umlv.dragon.rt -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.rt-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.rt .

# build fr.umlv.dragon.grammar
#echo "build fr.umlv.dragon.grammar"
#$javac -d build/modules \
#       --module-source-path grammar/gen-src \
#       --module-path mlib \
#       $(find grammar/gen-src/fr.umlv.dragon.grammar -name "*.java")
#$jar --create \
#     --file mlib/fr.umlv.dragon.grammar-1.0.jar \
#     --module-version=1.0 \
#     -C build/modules/fr.umlv.dragon.grammar .

# build fr.umlv.dragon.ast
#$javac -d build/modules \
#       --module-source-path src \
#       --module-path mlib \
#       $(find src/fr.umlv.dragon.ast -name "*.java")
#$jar --create \
#     --file mlib/fr.umlv.dragon.ast-1.0.jar \
#     --module-version=1.0 \
#     -C build/modules/fr.umlv.dragon.ast .

# build fr.umlv.dragon.main
#$javac -d build/modules \
#       --module-source-path src \
#       --module-path mlib \
#       $(find src/fr.umlv.dragon.main -name "*.java")
#$jar --create \
#     --file mlib/fr.umlv.dragon.main-1.0.jar \
#     --module-version=1.0 \
#     --main-class fr.umlv.dragon.main.Main \
#     -C build/modules/fr.umlv.dragon.main .

# build fr.umlv.dragon.ast & fr.umlv.dragon.main
echo "build fr.umlv.dragon.grammar, fr.umlv.dragon.ast, fr.umlv.dragon.eval and fr.umlv.dragon.main"
$javac -d build/modules \
       --module-source-path grammar/gen-src:src \
       --module-path mlib \
       $(find src -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.grammar-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.grammar .
$jar --create \
     --file mlib/fr.umlv.dragon.ast-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.ast .
$jar --create \
     --file mlib/fr.umlv.dragon.eval-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.eval .
$jar --create \
     --file mlib/fr.umlv.dragon.main-1.0.jar \
     --module-version=1.0 \
     --main-class fr.umlv.dragon.main.Main \
     -C build/modules/fr.umlv.dragon.main .

# build fr.umlv.dragon.jlinkplugin
echo "build fr.umlv.dragon.jlinkplugin"
$javac -d build/modules \
       --module-source-path jlink-plugin/src \
       --module-path mlib \
       $(find jlink-plugin/src -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.jlinkplugin-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.jlinkplugin .

# create a image
#       --plugin-module-path mlib \
#       --genclasslist=image/lib/classlist2 \
#       --shrink=shrinklist \
#       --compress=2 \
#       --strip-debug \
#       --class-optim=all:log=jlink-optim.log \
#       --vm=server \
echo "create image"
rm -fr image
$jlink --module-path $JAVA_HOME/jmods:mlib \
       --add-modules "fr.umlv.dragon.main,fr.umlv.dragon.eval" \
       --plugin-module-path mlib \
       --genclasslist=image/lib/classlist2 \
       --strip-debug \
       --output image

# create CDS mapped file
# image/bin/java -Xshare:dump \
#                -XX:SharedClassListFile=image/lib/classlist2 \
#                -XX:SharedReadWriteSize=20m
 echo "create CDS mapped file"
 image/bin/java -Xshare:dump \
                -XX:SharedClassListFile=image/lib/classlist2

