/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/common/v1/common.proto

package io.opentelemetry.proto.common.v1;

public interface AnyValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.common.v1.AnyValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string string_value = 1;</code>
   */
  java.lang.String getStringValue();

  /**
   * <code>string string_value = 1;</code>
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   * <code>bool bool_value = 2;</code>
   */
  boolean getBoolValue();

  /**
   * <code>int64 int_value = 3;</code>
   */
  long getIntValue();

  /**
   * <code>double double_value = 4;</code>
   */
  double getDoubleValue();

  /**
   * <code>.opentelemetry.proto.common.v1.ArrayValue array_value = 5;</code>
   */
  boolean hasArrayValue();

  /**
   * <code>.opentelemetry.proto.common.v1.ArrayValue array_value = 5;</code>
   */
  io.opentelemetry.proto.common.v1.ArrayValue getArrayValue();

  /**
   * <code>.opentelemetry.proto.common.v1.ArrayValue array_value = 5;</code>
   */
  io.opentelemetry.proto.common.v1.ArrayValueOrBuilder getArrayValueOrBuilder();

  /**
   * <code>.opentelemetry.proto.common.v1.KeyValueList kvlist_value = 6;</code>
   */
  boolean hasKvlistValue();

  /**
   * <code>.opentelemetry.proto.common.v1.KeyValueList kvlist_value = 6;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValueList getKvlistValue();

  /**
   * <code>.opentelemetry.proto.common.v1.KeyValueList kvlist_value = 6;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValueListOrBuilder getKvlistValueOrBuilder();

  /**
   * <code>bytes bytes_value = 7;</code>
   */
  com.google.protobuf.ByteString getBytesValue();

  public io.opentelemetry.proto.common.v1.AnyValue.ValueCase getValueCase();
}
