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
    println "Error while generating conformance tests";
    if [[ ${CI:-false} == true ]]; then
      println "Dumping log file to stderr..."
      println "--- ${LOG_FILE_NAME} -----------------------------------------------"
      cat ${LOG_FILE_NAME} | sed 's/^/>> /g' >&2;
      println "----------------------------------------------------------------"
    else
      println "See ${LOG_FILE_NAME} for details";
    fi
    return 1
}
trap errNotify ERR

function reportMaven() {
  if [[ ${CI:-false} == true ]]; then
    mvn --version >> $1 2>&1
  fi
}

function cpDir() {
  mkdir -p $1
  cp -R -t $1 ${@:2}
}

function main() {
  rm ${LOG_FILE} 2> /dev/null || true
  reportMaven "${LOG_FILE}"

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
  set +o errexit
  mvn -Pgen-conformance-protos clean verify >> ${LOG_FILE} 2>&1
  mvnExitCode=$?
  set -o errexit

  ## move generated proto class(es) into the main src root
  cpDir src/main/java/ target/generated-sources/protobuf/java/*

  if [ $mvnExitCode -ne 0 ]; then
    exit $mvnExitCode
  fi
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
