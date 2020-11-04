#!/bin/bash
assets=""
echo "Usage ./create_release.sh <branch> <version> <build_number> <is_final>"
REL=$2
BRANCH=$1
IS_FINAL=$4
BUILD_NUMBER=$3
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
    REL_TAG=tag-$REL
else
	mvn versions:set -DnewVersion=$REL-beta-$BUILD_NUMBER
	REL_TAG=tag-$REL\b$BUILD_NUMBER
fi

echo "Release tag is $REL_TAG"

git tag -d $REL_TAG
git tag -d $REL
git tag $REL_TAG
git push -f origin $REL_TAG
set -e
git checkout -B $BRANCH

releases=`/usr/local/bin/hub release`
hub_op="create"
for r in $releases
do
    if [ "$r" = "$REL_TAG" ]; then
        hub_op="edit"
        break
    fi
done

mvn clean install -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dbuild.number=$BUILD_NUMBER

if [ $IS_FINAL = true ]; then
    cp o11nplugin-vro/target/o11nplugin-vro-$REL.dar .
    cp o11nplugin-vro-core/target/o11nplugin-vro-core-$REL-javadoc.jar .
    assets="$assets -a o11nplugin-vro-$REL.dar"
    assets="$assets -a o11nplugin-vro-core-$REL-javadoc.jar"
else
        cp o11nplugin-vro/target/o11nplugin-vro-$REL-beta-$BUILD_NUMBER.dar .
        cp o11nplugin-vro-core/target/o11nplugin-vro-core-$REL-beta-$BUILD_NUMBER-javadoc.jar .
        assets="$assets -a o11nplugin-vro-$REL-beta-$BUILD_NUMBER.dar"
        assets="$assets -a o11nplugin-vro-core-$REL-beta-$BUILD_NUMBER-javadoc.jar"
fi

/usr/local/bin/hub release $hub_op $assets -F ReleaseNote $REL_TAG

rm -rf o11nplugin-vro-*.dar

