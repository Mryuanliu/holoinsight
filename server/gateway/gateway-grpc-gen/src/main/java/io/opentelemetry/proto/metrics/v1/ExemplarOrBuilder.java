/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

public interface ExemplarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.Exemplar)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The set of key/value pairs that were filtered out by the aggregator, but
   * recorded alongside the original measurement. Only key/value pairs that were
   * filtered out by the aggregator should be included
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue filtered_attributes = 7;</code>
   */
  java.util.List<io.opentelemetry.proto.common.v1.KeyValue> getFilteredAttributesList();

  /**
   * <pre>
   * The set of key/value pairs that were filtered out by the aggregator, but
   * recorded alongside the original measurement. Only key/value pairs that were
   * filtered out by the aggregator should be included
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue filtered_attributes = 7;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValue getFilteredAttributes(int index);

  /**
   * <pre>
   * The set of key/value pairs that were filtered out by the aggregator, but
   * recorded alongside the original measurement. Only key/value pairs that were
   * filtered out by the aggregator should be included
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue filtered_attributes = 7;</code>
   */
  int getFilteredAttributesCount();

  /**
   * <pre>
   * The set of key/value pairs that were filtered out by the aggregator, but
   * recorded alongside the original measurement. Only key/value pairs that were
   * filtered out by the aggregator should be included
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue filtered_attributes = 7;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.common.v1.KeyValueOrBuilder> getFilteredAttributesOrBuilderList();

  /**
   * <pre>
   * The set of key/value pairs that were filtered out by the aggregator, but
   * recorded alongside the original measurement. Only key/value pairs that were
   * filtered out by the aggregator should be included
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue filtered_attributes = 7;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValueOrBuilder getFilteredAttributesOrBuilder(int index);

  /**
   * <pre>
   * time_unix_nano is the exact time when this exemplar was recorded
   * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January
   * 1970.
   * </pre>
   *
   * <code>fixed64 time_unix_nano = 2;</code>
   * 
   * @return The timeUnixNano.
   */
  long getTimeUnixNano();

  /**
   * <code>double as_double = 3;</code>
   * 
   * @return Whether the asDouble field is set.
   */
  boolean hasAsDouble();

  /**
   * <code>double as_double = 3;</code>
   * 
   * @return The asDouble.
   */
  double getAsDouble();

  /**
   * <code>sfixed64 as_int = 6;</code>
   * 
   * @return Whether the asInt field is set.
   */
  boolean hasAsInt();

  /**
   * <code>sfixed64 as_int = 6;</code>
   * 
   * @return The asInt.
   */
  long getAsInt();

  /**
   * <pre>
   * (Optional) Span ID of the exemplar trace.
   * span_id may be missing if the measurement is not recorded inside a trace
   * or if the trace is not sampled.
   * </pre>
   *
   * <code>bytes span_id = 4;</code>
   * 
   * @return The spanId.
   */
  com.google.protobuf.ByteString getSpanId();

  /**
   * <pre>
   * (Optional) Trace ID of the exemplar trace.
   * trace_id may be missing if the measurement is not recorded inside a trace
   * or if the trace is not sampled.
   * </pre>
   *
   * <code>bytes trace_id = 5;</code>
   * 
   * @return The traceId.
   */
  com.google.protobuf.ByteString getTraceId();

  public io.opentelemetry.proto.metrics.v1.Exemplar.ValueCase getValueCase();
}
