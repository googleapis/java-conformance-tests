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

/**
 *
 *
 * <pre>
 * A particular storage API method and required resources in order to test it.
 * Methods must be implemented in tests for each language.
 * </pre>
 *
 * Protobuf type {@code google.cloud.conformance.storage.v1.Method}
 */
public final class Method extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.conformance.storage.v1.Method)
    MethodOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Method.newBuilder() to construct.
  private Method(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Method() {
    name_ = "";
    resources_ = java.util.Collections.emptyList();
    group_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Method();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_Method_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_Method_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.conformance.storage.v1.Method.class,
            com.google.cloud.conformance.storage.v1.Method.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * e.g. storage.objects.get
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * e.g. storage.objects.get
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> resources_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.cloud.conformance.storage.v1.Resource>
      resources_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.cloud.conformance.storage.v1.Resource>() {
            public com.google.cloud.conformance.storage.v1.Resource convert(
                java.lang.Integer from) {
              com.google.cloud.conformance.storage.v1.Resource result =
                  com.google.cloud.conformance.storage.v1.Resource.forNumber(from);
              return result == null
                  ? com.google.cloud.conformance.storage.v1.Resource.UNRECOGNIZED
                  : result;
            }
          };

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
   *
   * @return A list containing the resources.
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.conformance.storage.v1.Resource> getResourcesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.cloud.conformance.storage.v1.Resource>(
        resources_, resources_converter_);
  }

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
   *
   * @return The count of resources.
   */
  @java.lang.Override
  public int getResourcesCount() {
    return resources_.size();
  }

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The resources at the given index.
   */
  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.Resource getResources(int index) {
    return resources_converter_.convert(resources_.get(index));
  }

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
   *
   * @return A list containing the enum numeric values on the wire for resources.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getResourcesValueList() {
    return resources_;
  }

  /**
   * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of resources at the given index.
   */
  @java.lang.Override
  public int getResourcesValue(int index) {
    return resources_.get(index);
  }

  private int resourcesMemoizedSerializedSize;

  public static final int GROUP_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object group_ = "";

  /**
   *
   *
   * <pre>
   * e.g. storage.resumable.upload
   * </pre>
   *
   * <code>string group = 3;</code>
   *
   * @return The group.
   */
  @java.lang.Override
  public java.lang.String getGroup() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      group_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * e.g. storage.resumable.upload
   * </pre>
   *
   * <code>string group = 3;</code>
   *
   * @return The bytes for group.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGroupBytes() {
    java.lang.Object ref = group_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      group_ = b;
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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (getResourcesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(resourcesMemoizedSerializedSize);
    }
    for (int i = 0; i < resources_.size(); i++) {
      output.writeEnumNoTag(resources_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(group_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, group_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < resources_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(resources_.get(i));
      }
      size += dataSize;
      if (!getResourcesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      resourcesMemoizedSerializedSize = dataSize;
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(group_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, group_);
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
    if (!(obj instanceof com.google.cloud.conformance.storage.v1.Method)) {
      return super.equals(obj);
    }
    com.google.cloud.conformance.storage.v1.Method other =
        (com.google.cloud.conformance.storage.v1.Method) obj;

    if (!getName().equals(other.getName())) return false;
    if (!resources_.equals(other.resources_)) return false;
    if (!getGroup().equals(other.getGroup())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getResourcesCount() > 0) {
      hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + resources_.hashCode();
    }
    hash = (37 * hash) + GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getGroup().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.Method parseFrom(
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

  public static Builder newBuilder(com.google.cloud.conformance.storage.v1.Method prototype) {
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

  /**
   *
   *
   * <pre>
   * A particular storage API method and required resources in order to test it.
   * Methods must be implemented in tests for each language.
   * </pre>
   *
   * Protobuf type {@code google.cloud.conformance.storage.v1.Method}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.conformance.storage.v1.Method)
      com.google.cloud.conformance.storage.v1.MethodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_Method_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_Method_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.conformance.storage.v1.Method.class,
              com.google.cloud.conformance.storage.v1.Method.Builder.class);
    }

    // Construct using com.google.cloud.conformance.storage.v1.Method.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      resources_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      group_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_Method_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.Method getDefaultInstanceForType() {
      return com.google.cloud.conformance.storage.v1.Method.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.Method build() {
      com.google.cloud.conformance.storage.v1.Method result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.Method buildPartial() {
      com.google.cloud.conformance.storage.v1.Method result =
          new com.google.cloud.conformance.storage.v1.Method(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.conformance.storage.v1.Method result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        resources_ = java.util.Collections.unmodifiableList(resources_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.resources_ = resources_;
    }

    private void buildPartial0(com.google.cloud.conformance.storage.v1.Method result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.group_ = group_;
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
      if (other instanceof com.google.cloud.conformance.storage.v1.Method) {
        return mergeFrom((com.google.cloud.conformance.storage.v1.Method) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.conformance.storage.v1.Method other) {
      if (other == com.google.cloud.conformance.storage.v1.Method.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.resources_.isEmpty()) {
        if (resources_.isEmpty()) {
          resources_ = other.resources_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureResourcesIsMutable();
          resources_.addAll(other.resources_);
        }
        onChanged();
      }
      if (!other.getGroup().isEmpty()) {
        group_ = other.group_;
        bitField0_ |= 0x00000004;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                int tmpRaw = input.readEnum();
                ensureResourcesIsMutable();
                resources_.add(tmpRaw);
                break;
              } // case 16
            case 18:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureResourcesIsMutable();
                  resources_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
                break;
              } // case 18
            case 26:
              {
                group_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * e.g. storage.objects.get
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.objects.get
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.objects.get
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.objects.get
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.objects.get
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> resources_ = java.util.Collections.emptyList();

    private void ensureResourcesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        resources_ = new java.util.ArrayList<java.lang.Integer>(resources_);
        bitField0_ |= 0x00000002;
      }
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @return A list containing the resources.
     */
    public java.util.List<com.google.cloud.conformance.storage.v1.Resource> getResourcesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.cloud.conformance.storage.v1.Resource>(
          resources_, resources_converter_);
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @return The count of resources.
     */
    public int getResourcesCount() {
      return resources_.size();
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The resources at the given index.
     */
    public com.google.cloud.conformance.storage.v1.Resource getResources(int index) {
      return resources_converter_.convert(resources_.get(index));
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The resources to set.
     * @return This builder for chaining.
     */
    public Builder setResources(int index, com.google.cloud.conformance.storage.v1.Resource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourcesIsMutable();
      resources_.set(index, value.getNumber());
      onChanged();
      return this;
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param value The resources to add.
     * @return This builder for chaining.
     */
    public Builder addResources(com.google.cloud.conformance.storage.v1.Resource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourcesIsMutable();
      resources_.add(value.getNumber());
      onChanged();
      return this;
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param values The resources to add.
     * @return This builder for chaining.
     */
    public Builder addAllResources(
        java.lang.Iterable<? extends com.google.cloud.conformance.storage.v1.Resource> values) {
      ensureResourcesIsMutable();
      for (com.google.cloud.conformance.storage.v1.Resource value : values) {
        resources_.add(value.getNumber());
      }
      onChanged();
      return this;
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResources() {
      resources_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @return A list containing the enum numeric values on the wire for resources.
     */
    public java.util.List<java.lang.Integer> getResourcesValueList() {
      return java.util.Collections.unmodifiableList(resources_);
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of resources at the given index.
     */
    public int getResourcesValue(int index) {
      return resources_.get(index);
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for resources to set.
     * @return This builder for chaining.
     */
    public Builder setResourcesValue(int index, int value) {
      ensureResourcesIsMutable();
      resources_.set(index, value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param value The enum numeric value on the wire for resources to add.
     * @return This builder for chaining.
     */
    public Builder addResourcesValue(int value) {
      ensureResourcesIsMutable();
      resources_.add(value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated .google.cloud.conformance.storage.v1.Resource resources = 2;</code>
     *
     * @param values The enum numeric values on the wire for resources to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourcesValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureResourcesIsMutable();
      for (int value : values) {
        resources_.add(value);
      }
      onChanged();
      return this;
    }

    private java.lang.Object group_ = "";

    /**
     *
     *
     * <pre>
     * e.g. storage.resumable.upload
     * </pre>
     *
     * <code>string group = 3;</code>
     *
     * @return The group.
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.resumable.upload
     * </pre>
     *
     * <code>string group = 3;</code>
     *
     * @return The bytes for group.
     */
    public com.google.protobuf.ByteString getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.resumable.upload
     * </pre>
     *
     * <code>string group = 3;</code>
     *
     * @param value The group to set.
     * @return This builder for chaining.
     */
    public Builder setGroup(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      group_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.resumable.upload
     * </pre>
     *
     * <code>string group = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGroup() {
      group_ = getDefaultInstance().getGroup();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * e.g. storage.resumable.upload
     * </pre>
     *
     * <code>string group = 3;</code>
     *
     * @param value The bytes for group to set.
     * @return This builder for chaining.
     */
    public Builder setGroupBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      group_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.conformance.storage.v1.Method)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.conformance.storage.v1.Method)
  private static final com.google.cloud.conformance.storage.v1.Method DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.conformance.storage.v1.Method();
  }

  public static com.google.cloud.conformance.storage.v1.Method getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Method> PARSER =
      new com.google.protobuf.AbstractParser<Method>() {
        @java.lang.Override
        public Method parsePartialFrom(
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

  public static com.google.protobuf.Parser<Method> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Method> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.Method getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
