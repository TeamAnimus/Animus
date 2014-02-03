#!/bin/bash

cd target
java -classpath "../libs/*:." $1.$(tr '[:lower:]' '[:upper:]' <<< ${1:0:1})${1:1}
