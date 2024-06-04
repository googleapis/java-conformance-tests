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

public interface RetryTestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.conformance.storage.v1.RetryTest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Scenario number
   * </pre>
   *
   * <code>int32 id = 1;</code>
   *
   * @return The id.
   */
  int getId();

  /**
   *
   *
   * <pre>
   * Human-readable description of the test case.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Human-readable description of the test case.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * list of emulator instruction sets.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.InstructionList cases = 3;</code>
   */
  java.util.List<com.google.cloud.conformance.storage.v1.InstructionList> getCasesList();

  /**
   *
   *
   * <pre>
   * list of emulator instruction sets.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.InstructionList cases = 3;</code>
   */
  com.google.cloud.conformance.storage.v1.InstructionList getCases(int index);

  /**
   *
   *
   * <pre>
   * list of emulator instruction sets.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.InstructionList cases = 3;</code>
   */
  int getCasesCount();

  /**
   *
   *
   * <pre>
   * list of emulator instruction sets.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.InstructionList cases = 3;</code>
   */
  java.util.List<? extends com.google.cloud.conformance.storage.v1.InstructionListOrBuilder>
      getCasesOrBuilderList();

  /**
   *
   *
   * <pre>
   * list of emulator instruction sets.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.InstructionList cases = 3;</code>
   */
  com.google.cloud.conformance.storage.v1.InstructionListOrBuilder getCasesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of API methods to be tested.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.Method methods = 4;</code>
   */
  java.util.List<com.google.cloud.conformance.storage.v1.Method> getMethodsList();

  /**
   *
   *
   * <pre>
   * List of API methods to be tested.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.Method methods = 4;</code>
   */
  com.google.cloud.conformance.storage.v1.Method getMethods(int index);

  /**
   *
   *
   * <pre>
   * List of API methods to be tested.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.Method methods = 4;</code>
   */
  int getMethodsCount();

  /**
   *
   *
   * <pre>
   * List of API methods to be tested.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.Method methods = 4;</code>
   */
  java.util.List<? extends com.google.cloud.conformance.storage.v1.MethodOrBuilder>
      getMethodsOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of API methods to be tested.
   * </pre>
   *
   * <code>repeated .google.cloud.conformance.storage.v1.Method methods = 4;</code>
   */
  com.google.cloud.conformance.storage.v1.MethodOrBuilder getMethodsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Whether a precondition is provided (for conditionally-idempotent methods
   * only).
   * </pre>
   *
   * <code>bool preconditionProvided = 5;</code>
   *
   * @return The preconditionProvided.
   */
  boolean getPreconditionProvided();

  /**
   *
   *
   * <pre>
   * Whether we expect the method calls to eventually succeed after the client
   * library retries.
   * </pre>
   *
   * <code>bool expectSuccess = 6;</code>
   *
   * @return The expectSuccess.
   */
  boolean getExpectSuccess();
}
