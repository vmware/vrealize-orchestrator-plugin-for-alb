#!/bin/bash
assets=""
echo "Usage ./create_release.sh <branch> <version> <is_final> <build_number>"
REL=$2
BRANCH=$1
IS_FINAL=$3
BUILD_NUMBER=$4
if [ $BRANCH = "eng" ]; then
    BRANCH="master"
fi
if [ -z $REL ]; then
    echo "Pl. give the release version eg. 18.2.6"
    exit 1
fi
if [ -z $IS_FINAL ]; then
	IS_FINAL=false
    echo "Not a final release creating beta release for $REL"
fi
if [ -z $BUILD_NUMBER ]; then
	BUILD_NUMBER=1
    echo "Build number is $BUILD_NUMBER for release version $REL"
fi

if [ $IS_FINAL = true ]; then
    mvn versions:set -DnewVersion=$REL
else
	mvn versions:set -DnewVersion=$REL-beta-$BUILD_NUMBER
fi
mvn clean install -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dbuild.number=$BUILD_NUMBER


