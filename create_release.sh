#!/bin/bash
set -x
assets=""
echo "Usage ./create_release.sh <branch> <version>"
REL=$2
BRANCH=$1
if [ $BRANCH = "eng" ]; then
    BRANCH="master"
fi
if [ -z $REL ]; then
    echo "Pl. give the release version eg. 18.2.6, 20.1.3b1, 20.1.5post1"
    exit 1
fi

# Convert version number to java standers
JAVA_VERSION=$REL
if [[ "$REL" == *"post"* ]]; then
  version_array=($(echo "$REL" | tr 'post' '\n'))
  VERSION_POSTFIX="${version_array[1]}"
  JAVA_VERSION="${REL/post/\.}"
elif  [[ "$REL" == *"b"* ]]; then
  version_array=($(echo "$REL" | tr 'b' '\n'))
  VERSION_POSTFIX="${version_array[1]}"
  JAVA_VERSION="${REL/b/-beta-}"
    echo "Not a final release creating beta release for $REL"
else
  JAVA_VERSION=$JAVA_VERSION.RELEASE
fi

# Set maven version
mvn versions:set -DnewVersion=$JAVA_VERSION
echo "Using java version as $JAVA_VERSION"
REL_TAG=tag-$JAVA_VERSION
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

if [ -z $VERSION_POSTFIX ]; then
	BUILD_NUMBER=1
else
  BUILD_NUMBER=$VERSION_POSTFIX
fi

# Build Project
mvn clean install -DskipTests -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dbuild.number=$BUILD_NUMBER
cp o11nplugin-vro-core/target/o11nplugin-vro-core-$JAVA_VERSION-javadoc.jar .
cp o11nplugin-vro/target/o11nplugin-vro-$JAVA_VERSION.dar .
assets="$assets -a o11nplugin-vro-$JAVA_VERSION.dar -a o11nplugin-vro-core-$JAVA_VERSION-javadoc.jar"

# Push release assets
/usr/local/bin/hub release $hub_op $assets -F ReleaseNote $REL_TAG

rm -rf o11nplugin-vro-*.dar
