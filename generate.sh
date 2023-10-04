#!/bin/sh

NAME="authclient"
PKG="com.bran.auth.client"
DESC="Personal Authentication API"
VERSION="1.0.0"
DEVELOPER_EMAIL="brannigansakwah@gmail.com"
DEVELOPER_NAME="Brannigan Sakwah"

# Set the path to the OpenAPI specification
if [ -z "$1" ]; then
    SPEC_PATH="http://localhost:8080/v3/api-docs"
else
  SPEC_PATH="$1"
fi

# Remove existing folders
rm -r */

# Generate client for dart
openapi-generator generate \
-g dart \
-i $SPEC_PATH \
-o ./dart \
--additional-properties=\
pubLibrary="$PKG",\
pubName="$NAME",\
pubVersion="$VERSION",\
pubAuthor="$DEVELOPER_NAME",\
pubAuthorEmail="$DEVELOPER_EMAIL",\
pubDescription="$DESC"

# Generate client for go
openapi-generator generate \
-g go \
-i $SPEC_PATH \
-o ./go \
--additional-properties=\
packageName="$NAME",\
packageVersion="$VERSION"

# Generate client for java
openapi-generator generate \
-g java \
-i $SPEC_PATH \
-o ./java \
--additional-properties=\
groupId="$PKG",\
artifactId="$NAME",\
artifactVersion="$VERSION",\
developerName="$DEVELOPER_NAME",\
developerEmail="$DEVELOPER_EMAIL",\
invokerPackage="$PKG",\
apiPackage="$PKG.api",\
modelPackage="$PKG.model",\
artifactDescription="$DESC",\
annotationLibrary="swagger2",\
asyncNative=true,\
dateLibrary="legacy",\
library="resttemplate",\
hideGenerationTimestamp=true

# Generate client for python
openapi-generator generate \
-g python \
-i $SPEC_PATH \
-o ./python \
--additional-properties=\
packageName="$NAME",\
packageVersion="$VERSION",\
library="asyncio"

# Generate client for rust
openapi-generator generate \
-g rust \
-i $SPEC_PATH \
-o ./rust \
--additional-properties=\
packageName="$NAME",\
packageVersion="$VERSION",\
supportMultipleResponses=true,\
library="reqwest"

# Generate client for typescript
openapi-generator generate \
-g typescript-axios \
-i $SPEC_PATH \
-o ./typescript \
--additional-properties=\
npmName="$NAME",\
npmVersion="$VERSION",\
withSeparateModelsAndApi=true,\
apiPackage="$PKG.api",\
modelPackage="$PKG.model"