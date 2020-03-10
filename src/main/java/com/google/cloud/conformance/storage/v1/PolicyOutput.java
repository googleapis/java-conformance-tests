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

/** Protobuf type {@code google.cloud.conformance.storage.v1.PolicyOutput} */
public final class PolicyOutput extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.conformance.storage.v1.PolicyOutput)
    PolicyOutputOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PolicyOutput.newBuilder() to construct.
  private PolicyOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PolicyOutput() {
    url_ = "";
    expectedDecodedPolicy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PolicyOutput();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PolicyOutput(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              url_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fields_ =
                    com.google.protobuf.MapField.newMapField(FieldsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String> fields__ =
                  input.readMessage(
                      FieldsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              fields_.getMutableMap().put(fields__.getKey(), fields__.getValue());
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              expectedDecodedPolicy_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_PolicyOutput_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetFields();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_PolicyOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.conformance.storage.v1.PolicyOutput.class,
            com.google.cloud.conformance.storage.v1.PolicyOutput.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  public com.google.protobuf.ByteString getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELDS_FIELD_NUMBER = 2;

  private static final class FieldsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.conformance.storage.v1.Tests
                .internal_static_google_cloud_conformance_storage_v1_PolicyOutput_FieldsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> fields_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetFields() {
    if (fields_ == null) {
      return com.google.protobuf.MapField.emptyMapField(FieldsDefaultEntryHolder.defaultEntry);
    }
    return fields_;
  }

  public int getFieldsCount() {
    return internalGetFields().getMap().size();
  }
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  public boolean containsFields(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetFields().getMap().containsKey(key);
  }
  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getFields() {
    return getFieldsMap();
  }
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  public java.util.Map<java.lang.String, java.lang.String> getFieldsMap() {
    return internalGetFields().getMap();
  }
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  public java.lang.String getFieldsOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetFields().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /** <code>map&lt;string, string&gt; fields = 2;</code> */
  public java.lang.String getFieldsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetFields().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int EXPECTEDDECODEDPOLICY_FIELD_NUMBER = 3;
  private volatile java.lang.Object expectedDecodedPolicy_;
  /**
   * <code>string expectedDecodedPolicy = 3;</code>
   *
   * @return The expectedDecodedPolicy.
   */
  public java.lang.String getExpectedDecodedPolicy() {
    java.lang.Object ref = expectedDecodedPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expectedDecodedPolicy_ = s;
      return s;
    }
  }
  /**
   * <code>string expectedDecodedPolicy = 3;</code>
   *
   * @return The bytes for expectedDecodedPolicy.
   */
  public com.google.protobuf.ByteString getExpectedDecodedPolicyBytes() {
    java.lang.Object ref = expectedDecodedPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      expectedDecodedPolicy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetFields(), FieldsDefaultEntryHolder.defaultEntry, 2);
    if (!getExpectedDecodedPolicyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, expectedDecodedPolicy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetFields().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> fields__ =
          FieldsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, fields__);
    }
    if (!getExpectedDecodedPolicyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, expectedDecodedPolicy_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.conformance.storage.v1.PolicyOutput)) {
      return super.equals(obj);
    }
    com.google.cloud.conformance.storage.v1.PolicyOutput other =
        (com.google.cloud.conformance.storage.v1.PolicyOutput) obj;

    if (!getUrl().equals(other.getUrl())) return false;
    if (!internalGetFields().equals(other.internalGetFields())) return false;
    if (!getExpectedDecodedPolicy().equals(other.getExpectedDecodedPolicy())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    if (!internalGetFields().getMap().isEmpty()) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFields().hashCode();
    }
    hash = (37 * hash) + EXPECTEDDECODEDPOLICY_FIELD_NUMBER;
    hash = (53 * hash) + getExpectedDecodedPolicy().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.conformance.storage.v1.PolicyOutput prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code google.cloud.conformance.storage.v1.PolicyOutput} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.conformance.storage.v1.PolicyOutput)
      com.google.cloud.conformance.storage.v1.PolicyOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PolicyOutput_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetFields();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableFields();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PolicyOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.conformance.storage.v1.PolicyOutput.class,
              com.google.cloud.conformance.storage.v1.PolicyOutput.Builder.class);
    }

    // Construct using com.google.cloud.conformance.storage.v1.PolicyOutput.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      url_ = "";

      internalGetMutableFields().clear();
      expectedDecodedPolicy_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PolicyOutput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PolicyOutput getDefaultInstanceForType() {
      return com.google.cloud.conformance.storage.v1.PolicyOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PolicyOutput build() {
      com.google.cloud.conformance.storage.v1.PolicyOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PolicyOutput buildPartial() {
      com.google.cloud.conformance.storage.v1.PolicyOutput result =
          new com.google.cloud.conformance.storage.v1.PolicyOutput(this);
      int from_bitField0_ = bitField0_;
      result.url_ = url_;
      result.fields_ = internalGetFields();
      result.fields_.makeImmutable();
      result.expectedDecodedPolicy_ = expectedDecodedPolicy_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.conformance.storage.v1.PolicyOutput) {
        return mergeFrom((com.google.cloud.conformance.storage.v1.PolicyOutput) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.conformance.storage.v1.PolicyOutput other) {
      if (other == com.google.cloud.conformance.storage.v1.PolicyOutput.getDefaultInstance())
        return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      internalGetMutableFields().mergeFrom(other.internalGetFields());
      if (!other.getExpectedDecodedPolicy().isEmpty()) {
        expectedDecodedPolicy_ = other.expectedDecodedPolicy_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.conformance.storage.v1.PolicyOutput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.conformance.storage.v1.PolicyOutput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 1;</code>
     *
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 1;</code>
     *
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 1;</code>
     *
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrl() {

      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 1;</code>
     *
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      url_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> fields_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetFields() {
      if (fields_ == null) {
        return com.google.protobuf.MapField.emptyMapField(FieldsDefaultEntryHolder.defaultEntry);
      }
      return fields_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableFields() {
      onChanged();
      ;
      if (fields_ == null) {
        fields_ = com.google.protobuf.MapField.newMapField(FieldsDefaultEntryHolder.defaultEntry);
      }
      if (!fields_.isMutable()) {
        fields_ = fields_.copy();
      }
      return fields_;
    }

    public int getFieldsCount() {
      return internalGetFields().getMap().size();
    }
    /** <code>map&lt;string, string&gt; fields = 2;</code> */
    public boolean containsFields(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetFields().getMap().containsKey(key);
    }
    /** Use {@link #getFieldsMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getFields() {
      return getFieldsMap();
    }
    /** <code>map&lt;string, string&gt; fields = 2;</code> */
    public java.util.Map<java.lang.String, java.lang.String> getFieldsMap() {
      return internalGetFields().getMap();
    }
    /** <code>map&lt;string, string&gt; fields = 2;</code> */
    public java.lang.String getFieldsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetFields().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /** <code>map&lt;string, string&gt; fields = 2;</code> */
    public java.lang.String getFieldsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetFields().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFields() {
      internalGetMutableFields().getMutableMap().clear();
      return this;
    }
    /** <code>map&lt;string, string&gt; fields = 2;</code> */
    public Builder removeFields(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableFields().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableFields() {
      return internalGetMutableFields().getMutableMap();
    }
    /** <code>map&lt;string, string&gt; fields = 2;</code> */
    public Builder putFields(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableFields().getMutableMap().put(key, value);
      return this;
    }
    /** <code>map&lt;string, string&gt; fields = 2;</code> */
    public Builder putAllFields(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableFields().getMutableMap().putAll(values);
      return this;
    }

    private java.lang.Object expectedDecodedPolicy_ = "";
    /**
     * <code>string expectedDecodedPolicy = 3;</code>
     *
     * @return The expectedDecodedPolicy.
     */
    public java.lang.String getExpectedDecodedPolicy() {
      java.lang.Object ref = expectedDecodedPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expectedDecodedPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string expectedDecodedPolicy = 3;</code>
     *
     * @return The bytes for expectedDecodedPolicy.
     */
    public com.google.protobuf.ByteString getExpectedDecodedPolicyBytes() {
      java.lang.Object ref = expectedDecodedPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        expectedDecodedPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string expectedDecodedPolicy = 3;</code>
     *
     * @param value The expectedDecodedPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedDecodedPolicy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      expectedDecodedPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string expectedDecodedPolicy = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpectedDecodedPolicy() {

      expectedDecodedPolicy_ = getDefaultInstance().getExpectedDecodedPolicy();
      onChanged();
      return this;
    }
    /**
     * <code>string expectedDecodedPolicy = 3;</code>
     *
     * @param value The bytes for expectedDecodedPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedDecodedPolicyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      expectedDecodedPolicy_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.conformance.storage.v1.PolicyOutput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.conformance.storage.v1.PolicyOutput)
  private static final com.google.cloud.conformance.storage.v1.PolicyOutput DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.conformance.storage.v1.PolicyOutput();
  }

  public static com.google.cloud.conformance.storage.v1.PolicyOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyOutput> PARSER =
      new com.google.protobuf.AbstractParser<PolicyOutput>() {
        @java.lang.Override
        public PolicyOutput parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PolicyOutput(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PolicyOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.PolicyOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
