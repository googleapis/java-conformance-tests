# Google cloud conformance tests
This Maven project functions as a central location for integration with
[googleapis/conformance-tests](https://github.com/googleapis/conformance-tests).

In this directory `conformance-tests` which is a git-submodule, containing the reference for which
the various conformance test resources are updated to.

This project contains scripts to help with updating the resources based on the state of the
`conformance-tests` submodule. As well as performing the heavy lifting to ensure all resources
are in the correct locations, generate protobuf classes from proto files and represent a
released versioned jar of the conformance tests. 

## Updating conformance-tests

#### Prerequisites

Part of the process of updating the conformance tests involves running a maven build for
this project. Ensure that maven 3.6+ is on your `PATH`.

The code formatter we use `google-java-format` requires Java 11+ in order to run. Please
ensure the version of Java used to run Maven meets this requirement.

#### Performing the update

A bash script is available to perform an update. The script can be run for any branch, if you
need to update for a branch other than `main` update the following snippet with your
branch name. 

To update the conformance tests run the following commands from the repository root:
```bash
git checkout main
git pull upstream main
./bump-conformance-tests.sh
git push
```

Upon successful run of the bump script, you will be on a new branch matching the pattern
`bump/yyyy-mm-dd_HHMMSS`. Push this new branch up to GitHub and open a pull request.


If an error occurs while trying to perform the update please check the `bump.log`
written to the working directory for details.

If an error occurs while generating the new resources please check the `generate.log`
written to the working directory.

## Test Suites

### Firestore

The conformance test suites for Firestore are located in the `com.google.cloud.conformance.firestore`
package.

#### Files

There are a number of files that together define the format of the tests as well as the tests
themselves.

* `src/main/java/com/google/cloud/conformance/firestore/v1/TestDefinition.java`
  * The generated protobuf objects used to read the tests definitions
* `src/main/proto/google/cloud/conformance/firestore/v1/tests.proto`
  * The proto definition for the tests. `TestDefinition.java` is generated from this definition.
* `src/main/resources/com/google/cloud/conformance/firestore/v1/*.json`
  * Each files is a json serialized `TestFile` definition (defined in tests.proto).

### BigTable

The conformance test suites for BigTable are located in the `com.google.cloud.conformance.bigtable`
package.

### Storage

The conformance test suites for Storage are located in the `com.google.cloud.conformance.storage`
package
