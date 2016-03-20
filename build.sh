#!/bin/bash
export JAVA_HOME=/usr/jdk/jdk-9-jigsaw
export javac=$JAVA_HOME/bin/javac
export jar=$JAVA_HOME/bin/jar
export jlink=$JAVA_HOME/bin/jlink

# modulify tatoo-runtime.jar to fr.umlv.tatoo.runtime
$javac -d build/modules \
       -modulesourcepath lib2module \
       $(find lib2module/ -name "*.java")
cp lib/tatoo-runtime.jar mlib/fr.umlv.tatoo.runtime-1.0.jar
$jar --update \
     --file mlib/fr.umlv.tatoo.runtime-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.tatoo.runtime module-info.class

# build fr.umlv.dragon.rt
$javac -d build/modules \
       -modulesourcepath src \
       $(find src/fr.umlv.dragon.rt -name "*.java")
$jar --create \
     --file mlib/fr.umlv.dragon.rt-1.0.jar \
     --module-version=1.0 \
     -C build/modules/fr.umlv.dragon.rt .

# build fr.umlv.dragon.grammar
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

# build an image
rm -fr image
$jlink --modulepath  $JAVA_HOME/jmods:mlib \
       --addmods fr.umlv.dragon.main \
       --compress=2 \
       --strip-debug \
       --output image

