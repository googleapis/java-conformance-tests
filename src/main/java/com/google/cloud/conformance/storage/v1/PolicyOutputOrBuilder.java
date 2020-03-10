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

  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  int getFieldsCount();
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  boolean containsFields(java.lang.String key);
  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getFields();
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  java.util.Map<java.lang.String, java.lang.String> getFieldsMap();
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  java.lang.String getFieldsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
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
