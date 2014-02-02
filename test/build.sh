#!/bin/bash

cd ..
javac -classpath "libs/*" -d target test/*.java test/*/*.java
