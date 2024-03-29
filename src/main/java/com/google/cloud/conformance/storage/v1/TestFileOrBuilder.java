/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/conformance/storage/v1/tests.proto

package com.google.cloud.conformance.storage.v1;

public interface TestFileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.conformance.storage.v1.TestFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  java.util.List<com.google.cloud.conformance.storage.v1.SigningV4Test> getSigningV4TestsList();

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  com.google.cloud.conformance.storage.v1.SigningV4Test getSigningV4Tests(int index);

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  int getSigningV4TestsCount();

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder>
      getSigningV4TestsOrBuilderList();

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.SigningV4Test signing_v4_tests = 1;</code>
   */
  com.google.cloud.conformance.storage.v1.SigningV4TestOrBuilder getSigningV4TestsOrBuilder(
      int index);

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.PostPolicyV4Test post_policy_v4_tests = 2;
   * </code>
   */
  java.util.List<com.google.cloud.conformance.storage.v1.PostPolicyV4Test>
      getPostPolicyV4TestsList();

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.PostPolicyV4Test post_policy_v4_tests = 2;
   * </code>
   */
  com.google.cloud.conformance.storage.v1.PostPolicyV4Test getPostPolicyV4Tests(int index);

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.PostPolicyV4Test post_policy_v4_tests = 2;
   * </code>
   */
  int getPostPolicyV4TestsCount();

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.PostPolicyV4Test post_policy_v4_tests = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.conformance.storage.v1.PostPolicyV4TestOrBuilder>
      getPostPolicyV4TestsOrBuilderList();

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.PostPolicyV4Test post_policy_v4_tests = 2;
   * </code>
   */
  com.google.cloud.conformance.storage.v1.PostPolicyV4TestOrBuilder getPostPolicyV4TestsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Note: type is RetryTest rather than RetryTests.
   * The data file can be loaded as either a TestFile or
   * a RetryTests.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.RetryTest retry_tests = 3;</code>
   */
  java.util.List<com.google.cloud.conformance.storage.v1.RetryTest> getRetryTestsList();

  /**
   *
   *
   * <pre>
   * Note: type is RetryTest rather than RetryTests.
   * The data file can be loaded as either a TestFile or
   * a RetryTests.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.RetryTest retry_tests = 3;</code>
   */
  com.google.cloud.conformance.storage.v1.RetryTest getRetryTests(int index);

  /**
   *
   *
   * <pre>
   * Note: type is RetryTest rather than RetryTests.
   * The data file can be loaded as either a TestFile or
   * a RetryTests.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.RetryTest retry_tests = 3;</code>
   */
  int getRetryTestsCount();

  /**
   *
   *
   * <pre>
   * Note: type is RetryTest rather than RetryTests.
   * The data file can be loaded as either a TestFile or
   * a RetryTests.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.RetryTest retry_tests = 3;</code>
   */
  java.util.List<? extends com.google.cloud.conformance.storage.v1.RetryTestOrBuilder>
      getRetryTestsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Note: type is RetryTest rather than RetryTests.
   * The data file can be loaded as either a TestFile or
   * a RetryTests.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.RetryTest retry_tests = 3;</code>
   */
  com.google.cloud.conformance.storage.v1.RetryTestOrBuilder getRetryTestsOrBuilder(int index);
}
