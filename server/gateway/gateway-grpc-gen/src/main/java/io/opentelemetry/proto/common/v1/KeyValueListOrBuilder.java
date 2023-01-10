/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/common/v1/common.proto

package io.opentelemetry.proto.common.v1;

public interface KeyValueListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.common.v1.KeyValueList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A collection of key/value pairs of key-value pairs. The list may be empty (may
   * contain 0 elements).
   * The keys MUST be unique (it is not allowed to have more than one
   * value with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue values = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.common.v1.KeyValue> getValuesList();

  /**
   * <pre>
   * A collection of key/value pairs of key-value pairs. The list may be empty (may
   * contain 0 elements).
   * The keys MUST be unique (it is not allowed to have more than one
   * value with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue values = 1;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValue getValues(int index);

  /**
   * <pre>
   * A collection of key/value pairs of key-value pairs. The list may be empty (may
   * contain 0 elements).
   * The keys MUST be unique (it is not allowed to have more than one
   * value with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue values = 1;</code>
   */
  int getValuesCount();

  /**
   * <pre>
   * A collection of key/value pairs of key-value pairs. The list may be empty (may
   * contain 0 elements).
   * The keys MUST be unique (it is not allowed to have more than one
   * value with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue values = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.common.v1.KeyValueOrBuilder> getValuesOrBuilderList();

  /**
   * <pre>
   * A collection of key/value pairs of key-value pairs. The list may be empty (may
   * contain 0 elements).
   * The keys MUST be unique (it is not allowed to have more than one
   * value with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue values = 1;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValueOrBuilder getValuesOrBuilder(int index);
}
