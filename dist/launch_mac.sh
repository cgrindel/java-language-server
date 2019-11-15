#!/bin/sh
JLINK_VM_OPTIONS="\
--add-exports jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED \
--add-exports jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED \
--add-opens jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED"
DIR=$(dirname $0)
CP_DIR="${DIR}/classpath"
CLASSPATH_OPTIONS="-classpath $CP_DIR/guava-28.1-jre.jar:$CP_DIR/gson-2.8.5.jar:$CP_DIR/protobuf-java-3.9.1.jar:$CP_DIR/java-language-server.jar"
$DIR/mac/bin/java $JLINK_VM_OPTIONS $CLASSPATH_OPTIONS $@
