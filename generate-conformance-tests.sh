#!/bin/bash
# Copyright 2019 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -o errexit -o errtrace -o nounset -o pipefail

MODULE_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
LOG_FILE_NAME="generate.log"
LOG_FILE=${MODULE_DIR}/${LOG_FILE_NAME}

function errNotify() {
    echo "Error while generating conformance tests" >&2;
    echo "See ${LOG_FILE_NAME} for details" >&2;
    return 1
}
trap errNotify ERR

function cpDir() {
  mkdir -p $1
  cp -R -t $1 ${@:2}
}

function main() {
  rm ${LOG_FILE} 2> /dev/null || true

  local javaBasePackage="com/google/cloud/conformance"
  local firestorePackage="${javaBasePackage}/firestore/v1"
  local storagePackage="${javaBasePackage}/storage/v1"
  local bigtablePackage="${javaBasePackage}/bigtable/v2"

  msg "Cleaning existing generated protos"
  rm -rf src/main/java/${firestorePackage}/*
  rm -rf src/main/java/${storagePackage}/*
  rm -rf src/main/java/${bigtablePackage}/*
  msg "Cleaning existing test definitions"
  rm -rf src/main/resources/${firestorePackage}/*
  rm -rf src/main/resources/${storagePackage}/*
  rm -rf src/main/resources/${bigtablePackage}/*
  msg "Cleaning existing proto files"
  rm -rf src/main/proto/google/cloud/conformance/firestore/v1/*
  rm -rf src/main/proto/google/cloud/conformance/storage/v1/*
  rm -rf src/main/proto/google/cloud/conformance/bigtable/v2/*

  msg "Copying new proto files"
  cpDir src/main/proto/ conformance-tests/firestore/v1/proto/*
  cpDir src/main/proto/ conformance-tests/storage/v1/proto/*
  cpDir src/main/proto/ conformance-tests/bigtable/v2/proto/*
  msg "Copying new test definitions"
  cpDir "src/main/resources/${firestorePackage}/" conformance-tests/firestore/v1/*.json
  cpDir "src/main/resources/${storagePackage}/" conformance-tests/storage/v1/*.json
  cpDir "src/main/resources/${bigtablePackage}/" conformance-tests/bigtable/v2/*.json

  msg "Generating protos"
  # Run maven to generate all the classes from the protos
  ## here we disable the checkstyle-tests because the generated files do not
  ## have copyright headers and will always fail. The copyright headers are
  ## added after this command completes successfully, and is verified later
  ## by running maven again with the profile not disabled.
  mvn \
    -Pgen-conformance-protos \
    -P!checkstyle-tests \
    clean verify >> ${LOG_FILE} 2>&1

  msg "Adding copyright header to generated sources"
  ## java classes generated from protoc do not include the copyright header
  ## prepend it to the generated files
  pushd target/generated-sources/protobuf/java/ > /dev/null 2>&1
  for f in $(find ./ -type f -name '*.java' | sort); do
    msg "Processing $f"
    mv ${f} ${f}.tmp
    cat ${MODULE_DIR}/copyright-header.txt > ${f}
    cat ${f}.tmp >> ${f}
    rm ${f}.tmp
  done
  popd > /dev/null 2>&1

  ## move generated proto class(es) into the main src root
  cpDir src/main/java/ target/generated-sources/protobuf/java/*

  ## cleanup any generated files that may have not been moved over
  mvn clean >> ${LOG_FILE} 2>&1

  msg "Building module..."
  ## ensure building of the module still works
  mvn clean package | tee -a ${LOG_FILE}
  msg "Complete"
}

function now { date +"%Y-%m-%d %H:%M:%S" | tr -d '\n' ;}
function msg { println "$*" | tee -a ${LOG_FILE} >&2 ;}
function println { printf '%s\n' "$(now) $*" ;}

main
