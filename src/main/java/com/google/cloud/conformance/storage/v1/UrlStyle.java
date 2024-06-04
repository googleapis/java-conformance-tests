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

/** Protobuf enum {@code google.cloud.conformance.storage.v1.UrlStyle} */
public enum UrlStyle implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>PATH_STYLE = 0;</code> */
  PATH_STYLE(0),
  /** <code>VIRTUAL_HOSTED_STYLE = 1;</code> */
  VIRTUAL_HOSTED_STYLE(1),
  /** <code>BUCKET_BOUND_HOSTNAME = 2;</code> */
  BUCKET_BOUND_HOSTNAME(2),
  UNRECOGNIZED(-1),
  ;

  /** <code>PATH_STYLE = 0;</code> */
  public static final int PATH_STYLE_VALUE = 0;

  /** <code>VIRTUAL_HOSTED_STYLE = 1;</code> */
  public static final int VIRTUAL_HOSTED_STYLE_VALUE = 1;

  /** <code>BUCKET_BOUND_HOSTNAME = 2;</code> */
  public static final int BUCKET_BOUND_HOSTNAME_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UrlStyle valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UrlStyle forNumber(int value) {
    switch (value) {
      case 0:
        return PATH_STYLE;
      case 1:
        return VIRTUAL_HOSTED_STYLE;
      case 2:
        return BUCKET_BOUND_HOSTNAME;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UrlStyle> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UrlStyle> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<UrlStyle>() {
        public UrlStyle findValueByNumber(int number) {
          return UrlStyle.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.conformance.storage.v1.Tests.getDescriptor().getEnumTypes().get(0);
  }

  private static final UrlStyle[] VALUES = values();

  public static UrlStyle valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UrlStyle(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.conformance.storage.v1.UrlStyle)
}
