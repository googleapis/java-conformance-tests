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

public interface PolicyOutputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.conformance.storage.v1.PolicyOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();

  /**
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   *
   * Expectations
   *
   * E.1: PolicyInput.fields must be prepended to form expectedDecodedPolicy
   * for consistent result across languages. Ordering doesn't matter to the
   * service but the decision is made to make it easier to conform implementations
   * in implementation.
   *
   * Example:
   *
   * # Step 1
   *
   * PolicyInput.fields has:
   * {
   * "content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;"",
   * "content-encoding":"gzip",
   * "content-type":"text/plain",
   * "success_action_redirect":"http://www.google.com/"
   * }
   *
   * # Step 2
   *
   * The expectedDecodedPolicy before prepending the PolicyInput.fields
   * would look like this:
   *
   * {
   * "conditions":[
   * ...prepend here in the same order provided in PolicyInput.fields...
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   *
   * # Step 3
   *
   * Then expectedDecodedPolicy should prepends PolicyInput.fields in
   * the same order to PolicyOutput.expectedDecodedPolicy `conditions` key.
   *
   * {
   * "conditions":[
   * {"content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;""},
   * {"content-encoding":"gzip"},
   * {"content-type":"text/plain"},
   * {"success_action_redirect":"http://www.google.com/"},
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  int getFieldsCount();

  /**
   *
   *
   * <pre>
   *
   * Expectations
   *
   * E.1: PolicyInput.fields must be prepended to form expectedDecodedPolicy
   * for consistent result across languages. Ordering doesn't matter to the
   * service but the decision is made to make it easier to conform implementations
   * in implementation.
   *
   * Example:
   *
   * # Step 1
   *
   * PolicyInput.fields has:
   * {
   * "content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;"",
   * "content-encoding":"gzip",
   * "content-type":"text/plain",
   * "success_action_redirect":"http://www.google.com/"
   * }
   *
   * # Step 2
   *
   * The expectedDecodedPolicy before prepending the PolicyInput.fields
   * would look like this:
   *
   * {
   * "conditions":[
   * ...prepend here in the same order provided in PolicyInput.fields...
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   *
   * # Step 3
   *
   * Then expectedDecodedPolicy should prepends PolicyInput.fields in
   * the same order to PolicyOutput.expectedDecodedPolicy `conditions` key.
   *
   * {
   * "conditions":[
   * {"content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;""},
   * {"content-encoding":"gzip"},
   * {"content-type":"text/plain"},
   * {"success_action_redirect":"http://www.google.com/"},
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  boolean containsFields(java.lang.String key);

  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getFields();

  /**
   *
   *
   * <pre>
   *
   * Expectations
   *
   * E.1: PolicyInput.fields must be prepended to form expectedDecodedPolicy
   * for consistent result across languages. Ordering doesn't matter to the
   * service but the decision is made to make it easier to conform implementations
   * in implementation.
   *
   * Example:
   *
   * # Step 1
   *
   * PolicyInput.fields has:
   * {
   * "content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;"",
   * "content-encoding":"gzip",
   * "content-type":"text/plain",
   * "success_action_redirect":"http://www.google.com/"
   * }
   *
   * # Step 2
   *
   * The expectedDecodedPolicy before prepending the PolicyInput.fields
   * would look like this:
   *
   * {
   * "conditions":[
   * ...prepend here in the same order provided in PolicyInput.fields...
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   *
   * # Step 3
   *
   * Then expectedDecodedPolicy should prepends PolicyInput.fields in
   * the same order to PolicyOutput.expectedDecodedPolicy `conditions` key.
   *
   * {
   * "conditions":[
   * {"content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;""},
   * {"content-encoding":"gzip"},
   * {"content-type":"text/plain"},
   * {"success_action_redirect":"http://www.google.com/"},
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getFieldsMap();

  /**
   *
   *
   * <pre>
   *
   * Expectations
   *
   * E.1: PolicyInput.fields must be prepended to form expectedDecodedPolicy
   * for consistent result across languages. Ordering doesn't matter to the
   * service but the decision is made to make it easier to conform implementations
   * in implementation.
   *
   * Example:
   *
   * # Step 1
   *
   * PolicyInput.fields has:
   * {
   * "content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;"",
   * "content-encoding":"gzip",
   * "content-type":"text/plain",
   * "success_action_redirect":"http://www.google.com/"
   * }
   *
   * # Step 2
   *
   * The expectedDecodedPolicy before prepending the PolicyInput.fields
   * would look like this:
   *
   * {
   * "conditions":[
   * ...prepend here in the same order provided in PolicyInput.fields...
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   *
   * # Step 3
   *
   * Then expectedDecodedPolicy should prepends PolicyInput.fields in
   * the same order to PolicyOutput.expectedDecodedPolicy `conditions` key.
   *
   * {
   * "conditions":[
   * {"content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;""},
   * {"content-encoding":"gzip"},
   * {"content-type":"text/plain"},
   * {"success_action_redirect":"http://www.google.com/"},
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  /* nullable */
  java.lang.String getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   *
   * Expectations
   *
   * E.1: PolicyInput.fields must be prepended to form expectedDecodedPolicy
   * for consistent result across languages. Ordering doesn't matter to the
   * service but the decision is made to make it easier to conform implementations
   * in implementation.
   *
   * Example:
   *
   * # Step 1
   *
   * PolicyInput.fields has:
   * {
   * "content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;"",
   * "content-encoding":"gzip",
   * "content-type":"text/plain",
   * "success_action_redirect":"http://www.google.com/"
   * }
   *
   * # Step 2
   *
   * The expectedDecodedPolicy before prepending the PolicyInput.fields
   * would look like this:
   *
   * {
   * "conditions":[
   * ...prepend here in the same order provided in PolicyInput.fields...
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   *
   * # Step 3
   *
   * Then expectedDecodedPolicy should prepends PolicyInput.fields in
   * the same order to PolicyOutput.expectedDecodedPolicy `conditions` key.
   *
   * {
   * "conditions":[
   * {"content-disposition":"attachment; filename=&#92;"~._-%=/é0Aa&#92;""},
   * {"content-encoding":"gzip"},
   * {"content-type":"text/plain"},
   * {"success_action_redirect":"http://www.google.com/"},
   * {"bucket":"bucket-name"},
   * {"key":"test-object"},
   * {"x-goog-date":"20200123T043530Z"},
   * {"x-goog-credential":"test-iam-credentials&#64;dummy-project-id.iam.gserviceaccount.com/20200123/auto/storage/goog4_request"},
   * {"x-goog-algorithm":"GOOG4-RSA-SHA256"}
   * ],
   * "expiration":"2020-01-23T04:35:40Z"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; fields = 2;</code>
   */
  java.lang.String getFieldsOrThrow(java.lang.String key);

  /**
   * <code>string expectedDecodedPolicy = 3;</code>
   *
   * @return The expectedDecodedPolicy.
   */
  java.lang.String getExpectedDecodedPolicy();

  /**
   * <code>string expectedDecodedPolicy = 3;</code>
   *
   * @return The bytes for expectedDecodedPolicy.
   */
  com.google.protobuf.ByteString getExpectedDecodedPolicyBytes();
}
