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

public final class Tests {
  private Tests() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_TestFile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_TestFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_SigningV4Test_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_SigningV4Test_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_SigningV4Test_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_SigningV4Test_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_SigningV4Test_QueryParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_SigningV4Test_QueryParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_PolicyConditions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_PolicyConditions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_PolicyInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_PolicyInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_PolicyInput_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_PolicyInput_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_PolicyOutput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_PolicyOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_PolicyOutput_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_PolicyOutput_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/conformance/storage/v1/te"
          + "sts.proto\022#google.cloud.conformance.stor"
          + "age.v1\032\037google/protobuf/timestamp.proto\""
          + "\255\001\n\010TestFile\022L\n\020signing_v4_tests\030\001 \003(\01322"
          + ".google.cloud.conformance.storage.v1.Sig"
          + "ningV4Test\022S\n\024post_policy_v4_tests\030\002 \003(\013"
          + "25.google.cloud.conformance.storage.v1.P"
          + "ostPolicyV4Test\"\344\005\n\rSigningV4Test\022\020\n\010fil"
          + "eName\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022\016\n\006buck"
          + "et\030\003 \001(\t\022\016\n\006object\030\004 \001(\t\022\016\n\006method\030\005 \001(\t"
          + "\022\022\n\nexpiration\030\006 \001(\003\022-\n\ttimestamp\030\007 \001(\0132"
          + "\032.google.protobuf.Timestamp\022\023\n\013expectedU"
          + "rl\030\010 \001(\t\022P\n\007headers\030\t \003(\0132?.google.cloud"
          + ".conformance.storage.v1.SigningV4Test.He"
          + "adersEntry\022a\n\020query_parameters\030\n \003(\0132G.g"
          + "oogle.cloud.conformance.storage.v1.Signi"
          + "ngV4Test.QueryParametersEntry\022\016\n\006scheme\030"
          + "\013 \001(\t\022M\n\010urlStyle\030\014 \001(\0162;.google.cloud.c"
          + "onformance.storage.v1.SigningV4Test.UrlS"
          + "tyle\022\031\n\021bucketBoundDomain\030\r \001(\t\022 \n\030expec"
          + "tedCanonicalRequest\030\016 \001(\t\022\034\n\024expectedStr"
          + "ingToSign\030\017 \001(\t\032.\n\014HeadersEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0326\n\024QueryParamete"
          + "rsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "M\n\010UrlStyle\022\016\n\nPATH_STYLE\020\000\022\030\n\024VIRTUAL_H"
          + "OSTED_STYLE\020\001\022\027\n\023BUCKET_BOUND_DOMAIN\020\002\"("
          + "\n\022ConditionalMatches\022\022\n\nexpression\030\001 \003(\t"
          + "\"\230\001\n\020PolicyConditions\022\033\n\023successActionSt"
          + "atus\030\001 \001(\t\022\035\n\025successActionRedirect\030\002 \001("
          + "\t\022H\n\007matches\030\003 \003(\01327.google.cloud.confor"
          + "mance.storage.v1.ConditionalMatches\"\313\002\n\013"
          + "PolicyInput\022\016\n\006scheme\030\001 \001(\t\022\016\n\006bucket\030\002 "
          + "\001(\t\022\016\n\006object\030\003 \001(\t\022\022\n\nexpiration\030\004 \001(\003\022"
          + "-\n\ttimestamp\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022N\n\007headers\030\006 \003(\0132=.google.cloud.c"
          + "onformance.storage.v1.PolicyInput.Header"
          + "sEntry\022I\n\nconditions\030\007 \001(\01325.google.clou"
          + "d.conformance.storage.v1.PolicyCondition"
          + "s\032.\n\014HeadersEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\"\305\001\n\014PolicyOutput\022\013\n\003url\030\001 \001(\t\022"
          + "\013\n\003key\030\002 \001(\t\022M\n\006fields\030\003 \003(\0132=.google.cl"
          + "oud.conformance.storage.v1.PolicyOutput."
          + "FieldsEntry\022\035\n\025expectedDecodedPolicy\030\004 \001"
          + "(\t\032-\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\"\267\001\n\020PostPolicyV4Test\022\023\n\013descri"
          + "ption\030\001 \001(\t\022E\n\013policyInput\030\002 \001(\01320.googl"
          + "e.cloud.conformance.storage.v1.PolicyInp"
          + "ut\022G\n\014policyOutput\030\003 \001(\01321.google.cloud."
          + "conformance.storage.v1.PolicyOutputBW\n\'c"
          + "om.google.cloud.conformance.storage.v1P\001"
          + "\252\002)Google.Cloud.Storage.V1.Tests.Conform"
          + "anceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_conformance_storage_v1_TestFile_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_conformance_storage_v1_TestFile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_TestFile_descriptor,
            new java.lang.String[] {
              "SigningV4Tests", "PostPolicyV4Tests",
            });
    internal_static_google_cloud_conformance_storage_v1_SigningV4Test_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_conformance_storage_v1_SigningV4Test_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_SigningV4Test_descriptor,
            new java.lang.String[] {
              "FileName",
              "Description",
              "Bucket",
              "Object",
              "Method",
              "Expiration",
              "Timestamp",
              "ExpectedUrl",
              "Headers",
              "QueryParameters",
              "Scheme",
              "UrlStyle",
              "BucketBoundDomain",
              "ExpectedCanonicalRequest",
              "ExpectedStringToSign",
            });
    internal_static_google_cloud_conformance_storage_v1_SigningV4Test_HeadersEntry_descriptor =
        internal_static_google_cloud_conformance_storage_v1_SigningV4Test_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_conformance_storage_v1_SigningV4Test_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_SigningV4Test_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_conformance_storage_v1_SigningV4Test_QueryParametersEntry_descriptor =
        internal_static_google_cloud_conformance_storage_v1_SigningV4Test_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_conformance_storage_v1_SigningV4Test_QueryParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_SigningV4Test_QueryParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_descriptor,
            new java.lang.String[] {
              "Expression",
            });
    internal_static_google_cloud_conformance_storage_v1_PolicyConditions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_conformance_storage_v1_PolicyConditions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_PolicyConditions_descriptor,
            new java.lang.String[] {
              "SuccessActionStatus", "SuccessActionRedirect", "Matches",
            });
    internal_static_google_cloud_conformance_storage_v1_PolicyInput_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_conformance_storage_v1_PolicyInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_PolicyInput_descriptor,
            new java.lang.String[] {
              "Scheme", "Bucket", "Object", "Expiration", "Timestamp", "Headers", "Conditions",
            });
    internal_static_google_cloud_conformance_storage_v1_PolicyInput_HeadersEntry_descriptor =
        internal_static_google_cloud_conformance_storage_v1_PolicyInput_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_conformance_storage_v1_PolicyInput_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_PolicyInput_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_conformance_storage_v1_PolicyOutput_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_conformance_storage_v1_PolicyOutput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_PolicyOutput_descriptor,
            new java.lang.String[] {
              "Url", "Key", "Fields", "ExpectedDecodedPolicy",
            });
    internal_static_google_cloud_conformance_storage_v1_PolicyOutput_FieldsEntry_descriptor =
        internal_static_google_cloud_conformance_storage_v1_PolicyOutput_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_conformance_storage_v1_PolicyOutput_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_PolicyOutput_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_descriptor,
            new java.lang.String[] {
              "Description", "PolicyInput", "PolicyOutput",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
