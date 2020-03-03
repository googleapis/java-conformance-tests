#!/bin/bash
set -o errexit -o nounset -o pipefail

__SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
LOG_FILE_NAME="bump.log"
LOG_FILE=${__SCRIPT_DIR}/${LOG_FILE_NAME}

function gitSha() {
  git rev-parse --verify HEAD
}

function cleanLogLine() {
  echo ${1} \
    | sed -E 's@^@https://github.com/googleapis/conformance-tests/commit/@g' \
    | sed -E 's@#([1-9][0-9]+)@[#\1](https://github.com/googleapis/conformance-tests/pull/\1)@g'
}

function gitLog() {

  local rawLog=$(git log --decorate=no --oneline $1..$2)
  local formattedLog=""
  IFS=$'\n'
  for line in ${rawLog}; do
    msg "Including revision: $line"
    formattedLine=$(cleanLogLine "${line}")
    formattedLog="$formattedLog\n$formattedLine"
  done

  echo -e "$formattedLog"
}

function main() { (
  cd ${__SCRIPT_DIR}
  pushd conformance-tests > /dev/null
  currentSha=$(gitSha)
  msg "Current revision: conformance-tests@$currentSha"
  git pull >> ${LOG_FILE} 2>&1
  updatedSha=$(gitSha)
  msg "Updated revision: conformance-tests@$updatedSha"

  changes=$(gitLog ${currentSha} ${updatedSha})
  popd > /dev/null

  msg "Generating code..."
  ./generate-conformance-tests.sh

  branchName=bump/$(date +"%Y-%m-%d_%H%M%S")
  msg "Creating branch: $branchName"
  git checkout -b ${branchName}  >> ${LOG_FILE} 2>&1

  git add conformance-tests src  >> ${LOG_FILE} 2>&1

  git commit -F- <<EOF >> ${LOG_FILE} 2>&1
deps: bump conformance-tests to ${updatedSha}

${changes}

Full diff: https://github.com/googleapis/conformance-tests/compare/${currentSha}...${updatedSha}
EOF

  msg "Bump complete"

) }

function now { date +"%Y-%m-%d %H:%M:%S" | tr -d '\n' ;}
function msg { println "$*" | tee -a ${LOG_FILE} >&2 ;}
function err { local x=$? ; msg "$*" ; return $(( $x == 0 ? 1 : $x )) ;}
function println { printf '%s\n' "$(now) $*" ;}
function print { printf '%s ' "$(now) $*" ;}

main
