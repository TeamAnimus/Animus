#!/bin/bash

javac -classpath "libs/*" -d target $1/*.java $1/*/*.java
