#!/bin/sh

chmod +x gradle/wrapper/gradle-wrapper.jar

java -jar gradle/wrapper/gradle-wrapper.jar "$@"
