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

// Protobuf Java Version: 3.25.3
package com.google.cloud.conformance.storage.v1;

public interface PostPolicyV4TestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.conformance.storage.v1.PostPolicyV4Test)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code>
   *
   * @return Whether the policyInput field is set.
   */
  boolean hasPolicyInput();

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code>
   *
   * @return The policyInput.
   */
  com.google.cloud.conformance.storage.v1.PolicyInput getPolicyInput();

  /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
  com.google.cloud.conformance.storage.v1.PolicyInputOrBuilder getPolicyInputOrBuilder();

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code>
   *
   * @return Whether the policyOutput field is set.
   */
  boolean hasPolicyOutput();

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code>
   *
   * @return The policyOutput.
   */
  com.google.cloud.conformance.storage.v1.PolicyOutput getPolicyOutput();

  /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
  com.google.cloud.conformance.storage.v1.PolicyOutputOrBuilder getPolicyOutputOrBuilder();
}
