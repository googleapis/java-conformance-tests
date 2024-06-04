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

/** Protobuf type {@code google.cloud.conformance.storage.v1.ConditionalMatches} */
public final class ConditionalMatches extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.conformance.storage.v1.ConditionalMatches)
    ConditionalMatchesOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ConditionalMatches.newBuilder() to construct.
  private ConditionalMatches(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConditionalMatches() {
    expression_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConditionalMatches();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.conformance.storage.v1.ConditionalMatches.class,
            com.google.cloud.conformance.storage.v1.ConditionalMatches.Builder.class);
  }

  public static final int EXPRESSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList expression_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   * <code>repeated string expression = 1;</code>
   *
   * @return A list containing the expression.
   */
  public com.google.protobuf.ProtocolStringList getExpressionList() {
    return expression_;
  }

  /**
   * <code>repeated string expression = 1;</code>
   *
   * @return The count of expression.
   */
  public int getExpressionCount() {
    return expression_.size();
  }

  /**
   * <code>repeated string expression = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The expression at the given index.
   */
  public java.lang.String getExpression(int index) {
    return expression_.get(index);
  }

  /**
   * <code>repeated string expression = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the expression at the given index.
   */
  public com.google.protobuf.ByteString getExpressionBytes(int index) {
    return expression_.getByteString(index);
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
    for (int i = 0; i < expression_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, expression_.getRaw(i));
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
      for (int i = 0; i < expression_.size(); i++) {
        dataSize += computeStringSizeNoTag(expression_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getExpressionList().size();
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
    if (!(obj instanceof com.google.cloud.conformance.storage.v1.ConditionalMatches)) {
      return super.equals(obj);
    }
    com.google.cloud.conformance.storage.v1.ConditionalMatches other =
        (com.google.cloud.conformance.storage.v1.ConditionalMatches) obj;

    if (!getExpressionList().equals(other.getExpressionList())) return false;
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
    if (getExpressionCount() > 0) {
      hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getExpressionList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches parseFrom(
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
      com.google.cloud.conformance.storage.v1.ConditionalMatches prototype) {
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

  /** Protobuf type {@code google.cloud.conformance.storage.v1.ConditionalMatches} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.conformance.storage.v1.ConditionalMatches)
      com.google.cloud.conformance.storage.v1.ConditionalMatchesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.conformance.storage.v1.ConditionalMatches.class,
              com.google.cloud.conformance.storage.v1.ConditionalMatches.Builder.class);
    }

    // Construct using com.google.cloud.conformance.storage.v1.ConditionalMatches.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      expression_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_ConditionalMatches_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.ConditionalMatches getDefaultInstanceForType() {
      return com.google.cloud.conformance.storage.v1.ConditionalMatches.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.ConditionalMatches build() {
      com.google.cloud.conformance.storage.v1.ConditionalMatches result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.ConditionalMatches buildPartial() {
      com.google.cloud.conformance.storage.v1.ConditionalMatches result =
          new com.google.cloud.conformance.storage.v1.ConditionalMatches(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.conformance.storage.v1.ConditionalMatches result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        expression_.makeImmutable();
        result.expression_ = expression_;
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
      if (other instanceof com.google.cloud.conformance.storage.v1.ConditionalMatches) {
        return mergeFrom((com.google.cloud.conformance.storage.v1.ConditionalMatches) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.conformance.storage.v1.ConditionalMatches other) {
      if (other == com.google.cloud.conformance.storage.v1.ConditionalMatches.getDefaultInstance())
        return this;
      if (!other.expression_.isEmpty()) {
        if (expression_.isEmpty()) {
          expression_ = other.expression_;
          bitField0_ |= 0x00000001;
        } else {
          ensureExpressionIsMutable();
          expression_.addAll(other.expression_);
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureExpressionIsMutable();
                expression_.add(s);
                break;
              } // case 10
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

    private com.google.protobuf.LazyStringArrayList expression_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureExpressionIsMutable() {
      if (!expression_.isModifiable()) {
        expression_ = new com.google.protobuf.LazyStringArrayList(expression_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @return A list containing the expression.
     */
    public com.google.protobuf.ProtocolStringList getExpressionList() {
      expression_.makeImmutable();
      return expression_;
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @return The count of expression.
     */
    public int getExpressionCount() {
      return expression_.size();
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The expression at the given index.
     */
    public java.lang.String getExpression(int index) {
      return expression_.get(index);
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the expression at the given index.
     */
    public com.google.protobuf.ByteString getExpressionBytes(int index) {
      return expression_.getByteString(index);
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpression(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExpressionIsMutable();
      expression_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @param value The expression to add.
     * @return This builder for chaining.
     */
    public Builder addExpression(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExpressionIsMutable();
      expression_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @param values The expression to add.
     * @return This builder for chaining.
     */
    public Builder addAllExpression(java.lang.Iterable<java.lang.String> values) {
      ensureExpressionIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, expression_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpression() {
      expression_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     * <code>repeated string expression = 1;</code>
     *
     * @param value The bytes of the expression to add.
     * @return This builder for chaining.
     */
    public Builder addExpressionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureExpressionIsMutable();
      expression_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.conformance.storage.v1.ConditionalMatches)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.conformance.storage.v1.ConditionalMatches)
  private static final com.google.cloud.conformance.storage.v1.ConditionalMatches DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.conformance.storage.v1.ConditionalMatches();
  }

  public static com.google.cloud.conformance.storage.v1.ConditionalMatches getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConditionalMatches> PARSER =
      new com.google.protobuf.AbstractParser<ConditionalMatches>() {
        @java.lang.Override
        public ConditionalMatches parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConditionalMatches> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConditionalMatches> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.ConditionalMatches getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
