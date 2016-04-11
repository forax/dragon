#!/bin/bash
export JAVA_HOME=/usr/jdk/jdk-9
export javac=$JAVA_HOME/bin/javac
export jar=$JAVA_HOME/bin/jar
export jlink=$JAVA_HOME/bin/jlink

# modulify tatoo-runtime.jar to fr.umlv.tatoo.runtime
echo "modulify tatoo-runtime.jar"
$javac -d build/modules \
       -modulesourcepath lib2module \
       $(find lib2module/ -name "*.java")
cp lib/tatoo-runtime.jar mlib/fr.umlv.tatoo.runtime-1.0.jar
$jar --update \
     --file mlib/fr.umlv.tatoo.runtime-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.tatoo.runtime module-info.class

# build fr.umlv.dragon.rt
echo "build fr.umlv.dragon.rt"
$javac -d build/modules \
       -modulesourcepath src \
       $(find src/fr.umlv.dragon.rt -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.rt-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.rt .

# build fr.umlv.dragon.grammar
echo "build fr.umlv.dragon.grammar"
$javac -d build/modules \
       -modulesourcepath grammar/gen-src \
       -modulepath mlib \
       $(find grammar/gen-src/fr.umlv.dragon.grammar -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.grammar-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.grammar .

# build fr.umlv.dragon.ast
#$javac -d build/modules \
#       -modulesourcepath src \
#       -modulepath mlib \
#       $(find src/fr.umlv.dragon.ast -name "*.java")
#$jar --create \
#     --file mlib/fr.umlv.dragon.ast-1.0.jar \
#     --module-version=1.0 \
#     -C build/modules/fr.umlv.dragon.ast .

# build fr.umlv.dragon.main
#$javac -d build/modules \
#       -modulesourcepath src \
#       -modulepath mlib \
#       $(find src/fr.umlv.dragon.main -name "*.java")
#$jar --create \
#     --file mlib/fr.umlv.dragon.main-1.0.jar \
#     --module-version=1.0 \
#     --main-class fr.umlv.dragon.main.Main \
#     -C build/modules/fr.umlv.dragon.main .

# build fr.umlv.dragon.ast & fr.umlv.dragon.main
echo "build fr.umlv.dragon.ast and fr.umlv.dragon.main"
$javac -d build/modules \
       -modulesourcepath src \
       -modulepath mlib \
       $(find src -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.ast-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.ast .
$jar --create \
     --file mlib/fr.umlv.dragon.main-1.0.jar \
     --module-version=1.0 \
     --main-class fr.umlv.dragon.main.Main \
     -C build/modules/fr.umlv.dragon.main .

# build fr.umlv.dragon.jlinkplugin
echo "build fr.umlv.dragon.jlinkplugin"
$javac -d build/modules \
       -modulesourcepath jlink-plugin/src \
       -modulepath mlib \
       $(find jlink-plugin/src -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.jlinkplugin-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.jlinkplugin .

# create a image
#       --plugin-module-path mlib \
#       --genclasslist \
#       --vm=server \
echo "create image"
rm -fr image
$jlink --modulepath $JAVA_HOME/jmods:mlib \
       --plugin-module-path mlib \
       --genclasslist=image/lib/classlist2 \
       --addmods fr.umlv.dragon.main \
       --compress=2 \
       --strip-debug \
       --output image

# create CDS mapped file
echo "create CDS mapped file"
image/bin/java -Xshare:dump \
               -XX:SharedClassListFile=image/lib/classlist2 \
               -XX:SharedReadWriteSize=20m

