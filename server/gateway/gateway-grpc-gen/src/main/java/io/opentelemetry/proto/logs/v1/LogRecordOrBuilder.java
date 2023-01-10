/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/logs/v1/logs.proto

package io.opentelemetry.proto.logs.v1;

public interface LogRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.logs.v1.LogRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * time_unix_nano is the time when the event occurred.
   * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January 1970.
   * Value of 0 indicates unknown or missing timestamp.
   * </pre>
   *
   * <code>fixed64 time_unix_nano = 1;</code>
   * 
   * @return The timeUnixNano.
   */
  long getTimeUnixNano();

  /**
   * <pre>
   * Time when the event was observed by the collection system.
   * For events that originate in OpenTelemetry (e.g. using OpenTelemetry Logging SDK)
   * this timestamp is typically set at the generation time and is equal to Timestamp.
   * For events originating externally and collected by OpenTelemetry (e.g. using
   * Collector) this is the time when OpenTelemetry's code observed the event measured
   * by the clock of the OpenTelemetry code. This field MUST be set once the event is
   * observed by OpenTelemetry.
   * For converting OpenTelemetry log data to formats that support only one timestamp or
   * when receiving OpenTelemetry log data by recipients that support only one timestamp
   * internally the following logic is recommended:
   *   - Use time_unix_nano if it is present, otherwise use observed_time_unix_nano.
   * Value is UNIX Epoch time in nanoseconds since 00:00:00 UTC on 1 January 1970.
   * Value of 0 indicates unknown or missing timestamp.
   * </pre>
   *
   * <code>fixed64 observed_time_unix_nano = 11;</code>
   * 
   * @return The observedTimeUnixNano.
   */
  long getObservedTimeUnixNano();

  /**
   * <pre>
   * Numerical value of the severity, normalized to values described in Log Data Model.
   * [Optional].
   * </pre>
   *
   * <code>.opentelemetry.proto.logs.v1.SeverityNumber severity_number = 2;</code>
   * 
   * @return The enum numeric value on the wire for severityNumber.
   */
  int getSeverityNumberValue();

  /**
   * <pre>
   * Numerical value of the severity, normalized to values described in Log Data Model.
   * [Optional].
   * </pre>
   *
   * <code>.opentelemetry.proto.logs.v1.SeverityNumber severity_number = 2;</code>
   * 
   * @return The severityNumber.
   */
  io.opentelemetry.proto.logs.v1.SeverityNumber getSeverityNumber();

  /**
   * <pre>
   * The severity text (also known as log level). The original string representation as
   * it is known at the source. [Optional].
   * </pre>
   *
   * <code>string severity_text = 3;</code>
   * 
   * @return The severityText.
   */
  java.lang.String getSeverityText();

  /**
   * <pre>
   * The severity text (also known as log level). The original string representation as
   * it is known at the source. [Optional].
   * </pre>
   *
   * <code>string severity_text = 3;</code>
   * 
   * @return The bytes for severityText.
   */
  com.google.protobuf.ByteString getSeverityTextBytes();

  /**
   * <pre>
   * A value containing the body of the log record. Can be for example a human-readable
   * string message (including multi-line) describing the event in a free form or it can
   * be a structured data composed of arrays and maps of other values. [Optional].
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.AnyValue body = 5;</code>
   * 
   * @return Whether the body field is set.
   */
  boolean hasBody();

  /**
   * <pre>
   * A value containing the body of the log record. Can be for example a human-readable
   * string message (including multi-line) describing the event in a free form or it can
   * be a structured data composed of arrays and maps of other values. [Optional].
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.AnyValue body = 5;</code>
   * 
   * @return The body.
   */
  io.opentelemetry.proto.common.v1.AnyValue getBody();

  /**
   * <pre>
   * A value containing the body of the log record. Can be for example a human-readable
   * string message (including multi-line) describing the event in a free form or it can
   * be a structured data composed of arrays and maps of other values. [Optional].
   * </pre>
   *
   * <code>.opentelemetry.proto.common.v1.AnyValue body = 5;</code>
   */
  io.opentelemetry.proto.common.v1.AnyValueOrBuilder getBodyOrBuilder();

  /**
   * <pre>
   * Additional attributes that describe the specific event occurrence. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 6;</code>
   */
  java.util.List<io.opentelemetry.proto.common.v1.KeyValue> getAttributesList();

  /**
   * <pre>
   * Additional attributes that describe the specific event occurrence. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 6;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValue getAttributes(int index);

  /**
   * <pre>
   * Additional attributes that describe the specific event occurrence. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 6;</code>
   */
  int getAttributesCount();

  /**
   * <pre>
   * Additional attributes that describe the specific event occurrence. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 6;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.common.v1.KeyValueOrBuilder> getAttributesOrBuilderList();

  /**
   * <pre>
   * Additional attributes that describe the specific event occurrence. [Optional].
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 6;</code>
   */
  io.opentelemetry.proto.common.v1.KeyValueOrBuilder getAttributesOrBuilder(int index);

  /**
   * <code>uint32 dropped_attributes_count = 7;</code>
   * 
   * @return The droppedAttributesCount.
   */
  int getDroppedAttributesCount();

  /**
   * <pre>
   * Flags, a bit field. 8 least significant bits are the trace flags as
   * defined in W3C Trace Context specification. 24 most significant bits are reserved
   * and must be set to 0. Readers must not assume that 24 most significant bits
   * will be zero and must correctly mask the bits when reading 8-bit trace flag (use
   * flags &amp; TRACE_FLAGS_MASK). [Optional].
   * </pre>
   *
   * <code>fixed32 flags = 8;</code>
   * 
   * @return The flags.
   */
  int getFlags();

  /**
   * <pre>
   * A unique identifier for a trace. All logs from the same trace share
   * the same `trace_id`. The ID is a 16-byte array. An ID with all zeroes
   * is considered invalid. Can be set for logs that are part of request processing
   * and have an assigned trace id. [Optional].
   * </pre>
   *
   * <code>bytes trace_id = 9;</code>
   * 
   * @return The traceId.
   */
  com.google.protobuf.ByteString getTraceId();

  /**
   * <pre>
   * A unique identifier for a span within a trace, assigned when the span
   * is created. The ID is an 8-byte array. An ID with all zeroes is considered
   * invalid. Can be set for logs that are part of a particular processing span.
   * If span_id is present trace_id SHOULD be also present. [Optional].
   * </pre>
   *
   * <code>bytes span_id = 10;</code>
   * 
   * @return The spanId.
   */
  com.google.protobuf.ByteString getSpanId();
}
