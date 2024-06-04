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

/** Protobuf type {@code google.cloud.conformance.storage.v1.PolicyConditions} */
public final class PolicyConditions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.conformance.storage.v1.PolicyConditions)
    PolicyConditionsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PolicyConditions.newBuilder() to construct.
  private PolicyConditions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PolicyConditions() {
    contentLengthRange_ = emptyIntList();
    startsWith_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PolicyConditions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_PolicyConditions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_PolicyConditions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.conformance.storage.v1.PolicyConditions.class,
            com.google.cloud.conformance.storage.v1.PolicyConditions.Builder.class);
  }

  public static final int CONTENTLENGTHRANGE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList contentLengthRange_ = emptyIntList();

  /**
   * <code>repeated int32 contentLengthRange = 1;</code>
   *
   * @return A list containing the contentLengthRange.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getContentLengthRangeList() {
    return contentLengthRange_;
  }

  /**
   * <code>repeated int32 contentLengthRange = 1;</code>
   *
   * @return The count of contentLengthRange.
   */
  public int getContentLengthRangeCount() {
    return contentLengthRange_.size();
  }

  /**
   * <code>repeated int32 contentLengthRange = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The contentLengthRange at the given index.
   */
  public int getContentLengthRange(int index) {
    return contentLengthRange_.getInt(index);
  }

  private int contentLengthRangeMemoizedSerializedSize = -1;

  public static final int STARTSWITH_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList startsWith_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   * <code>repeated string startsWith = 2;</code>
   *
   * @return A list containing the startsWith.
   */
  public com.google.protobuf.ProtocolStringList getStartsWithList() {
    return startsWith_;
  }

  /**
   * <code>repeated string startsWith = 2;</code>
   *
   * @return The count of startsWith.
   */
  public int getStartsWithCount() {
    return startsWith_.size();
  }

  /**
   * <code>repeated string startsWith = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The startsWith at the given index.
   */
  public java.lang.String getStartsWith(int index) {
    return startsWith_.get(index);
  }

  /**
   * <code>repeated string startsWith = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the startsWith at the given index.
   */
  public com.google.protobuf.ByteString getStartsWithBytes(int index) {
    return startsWith_.getByteString(index);
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
    getSerializedSize();
    if (getContentLengthRangeList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(contentLengthRangeMemoizedSerializedSize);
    }
    for (int i = 0; i < contentLengthRange_.size(); i++) {
      output.writeInt32NoTag(contentLengthRange_.getInt(i));
    }
    for (int i = 0; i < startsWith_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, startsWith_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < contentLengthRange_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(
                contentLengthRange_.getInt(i));
      }
      size += dataSize;
      if (!getContentLengthRangeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      contentLengthRangeMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < startsWith_.size(); i++) {
        dataSize += computeStringSizeNoTag(startsWith_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStartsWithList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.conformance.storage.v1.PolicyConditions)) {
      return super.equals(obj);
    }
    com.google.cloud.conformance.storage.v1.PolicyConditions other =
        (com.google.cloud.conformance.storage.v1.PolicyConditions) obj;

    if (!getContentLengthRangeList().equals(other.getContentLengthRangeList())) return false;
    if (!getStartsWithList().equals(other.getStartsWithList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getContentLengthRangeCount() > 0) {
      hash = (37 * hash) + CONTENTLENGTHRANGE_FIELD_NUMBER;
      hash = (53 * hash) + getContentLengthRangeList().hashCode();
    }
    if (getStartsWithCount() > 0) {
      hash = (37 * hash) + STARTSWITH_FIELD_NUMBER;
      hash = (53 * hash) + getStartsWithList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.conformance.storage.v1.PolicyConditions prototype) {
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

  /** Protobuf type {@code google.cloud.conformance.storage.v1.PolicyConditions} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.conformance.storage.v1.PolicyConditions)
      com.google.cloud.conformance.storage.v1.PolicyConditionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PolicyConditions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PolicyConditions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.conformance.storage.v1.PolicyConditions.class,
              com.google.cloud.conformance.storage.v1.PolicyConditions.Builder.class);
    }

    // Construct using com.google.cloud.conformance.storage.v1.PolicyConditions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      contentLengthRange_ = emptyIntList();
      startsWith_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PolicyConditions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PolicyConditions getDefaultInstanceForType() {
      return com.google.cloud.conformance.storage.v1.PolicyConditions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PolicyConditions build() {
      com.google.cloud.conformance.storage.v1.PolicyConditions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PolicyConditions buildPartial() {
      com.google.cloud.conformance.storage.v1.PolicyConditions result =
          new com.google.cloud.conformance.storage.v1.PolicyConditions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.conformance.storage.v1.PolicyConditions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        contentLengthRange_.makeImmutable();
        result.contentLengthRange_ = contentLengthRange_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        startsWith_.makeImmutable();
        result.startsWith_ = startsWith_;
      }
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
      if (other instanceof com.google.cloud.conformance.storage.v1.PolicyConditions) {
        return mergeFrom((com.google.cloud.conformance.storage.v1.PolicyConditions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.conformance.storage.v1.PolicyConditions other) {
      if (other == com.google.cloud.conformance.storage.v1.PolicyConditions.getDefaultInstance())
        return this;
      if (!other.contentLengthRange_.isEmpty()) {
        if (contentLengthRange_.isEmpty()) {
          contentLengthRange_ = other.contentLengthRange_;
          contentLengthRange_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureContentLengthRangeIsMutable();
          contentLengthRange_.addAll(other.contentLengthRange_);
        }
        onChanged();
      }
      if (!other.startsWith_.isEmpty()) {
        if (startsWith_.isEmpty()) {
          startsWith_ = other.startsWith_;
          bitField0_ |= 0x00000002;
        } else {
          ensureStartsWithIsMutable();
          startsWith_.addAll(other.startsWith_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                int v = input.readInt32();
                ensureContentLengthRangeIsMutable();
                contentLengthRange_.addInt(v);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureContentLengthRangeIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  contentLengthRange_.addInt(input.readInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureStartsWithIsMutable();
                startsWith_.add(s);
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Internal.IntList contentLengthRange_ = emptyIntList();

    private void ensureContentLengthRangeIsMutable() {
      if (!contentLengthRange_.isModifiable()) {
        contentLengthRange_ = makeMutableCopy(contentLengthRange_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     * <code>repeated int32 contentLengthRange = 1;</code>
     *
     * @return A list containing the contentLengthRange.
     */
    public java.util.List<java.lang.Integer> getContentLengthRangeList() {
      contentLengthRange_.makeImmutable();
      return contentLengthRange_;
    }

    /**
     * <code>repeated int32 contentLengthRange = 1;</code>
     *
     * @return The count of contentLengthRange.
     */
    public int getContentLengthRangeCount() {
      return contentLengthRange_.size();
    }

    /**
     * <code>repeated int32 contentLengthRange = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The contentLengthRange at the given index.
     */
    public int getContentLengthRange(int index) {
      return contentLengthRange_.getInt(index);
    }

    /**
     * <code>repeated int32 contentLengthRange = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The contentLengthRange to set.
     * @return This builder for chaining.
     */
    public Builder setContentLengthRange(int index, int value) {

      ensureContentLengthRangeIsMutable();
      contentLengthRange_.setInt(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>repeated int32 contentLengthRange = 1;</code>
     *
     * @param value The contentLengthRange to add.
     * @return This builder for chaining.
     */
    public Builder addContentLengthRange(int value) {

      ensureContentLengthRangeIsMutable();
      contentLengthRange_.addInt(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>repeated int32 contentLengthRange = 1;</code>
     *
     * @param values The contentLengthRange to add.
     * @return This builder for chaining.
     */
    public Builder addAllContentLengthRange(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureContentLengthRangeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, contentLengthRange_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>repeated int32 contentLengthRange = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContentLengthRange() {
      contentLengthRange_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList startsWith_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureStartsWithIsMutable() {
      if (!startsWith_.isModifiable()) {
        startsWith_ = new com.google.protobuf.LazyStringArrayList(startsWith_);
      }
      bitField0_ |= 0x00000002;
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @return A list containing the startsWith.
     */
    public com.google.protobuf.ProtocolStringList getStartsWithList() {
      startsWith_.makeImmutable();
      return startsWith_;
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @return The count of startsWith.
     */
    public int getStartsWithCount() {
      return startsWith_.size();
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The startsWith at the given index.
     */
    public java.lang.String getStartsWith(int index) {
      return startsWith_.get(index);
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the startsWith at the given index.
     */
    public com.google.protobuf.ByteString getStartsWithBytes(int index) {
      return startsWith_.getByteString(index);
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The startsWith to set.
     * @return This builder for chaining.
     */
    public Builder setStartsWith(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStartsWithIsMutable();
      startsWith_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @param value The startsWith to add.
     * @return This builder for chaining.
     */
    public Builder addStartsWith(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStartsWithIsMutable();
      startsWith_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @param values The startsWith to add.
     * @return This builder for chaining.
     */
    public Builder addAllStartsWith(java.lang.Iterable<java.lang.String> values) {
      ensureStartsWithIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, startsWith_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStartsWith() {
      startsWith_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string startsWith = 2;</code>
     *
     * @param value The bytes of the startsWith to add.
     * @return This builder for chaining.
     */
    public Builder addStartsWithBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureStartsWithIsMutable();
      startsWith_.add(value);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.conformance.storage.v1.PolicyConditions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.conformance.storage.v1.PolicyConditions)
  private static final com.google.cloud.conformance.storage.v1.PolicyConditions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.conformance.storage.v1.PolicyConditions();
  }

  public static com.google.cloud.conformance.storage.v1.PolicyConditions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyConditions> PARSER =
      new com.google.protobuf.AbstractParser<PolicyConditions>() {
        @java.lang.Override
        public PolicyConditions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PolicyConditions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyConditions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.PolicyConditions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
