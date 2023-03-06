/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/collector/metrics/v1/metrics_service.proto

package io.opentelemetry.proto.collector.metrics.v1;

public interface ExportMetricsServiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
   */
  boolean hasPartialSuccess();

  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
   */
  io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess getPartialSuccess();

  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
   */
  io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccessOrBuilder getPartialSuccessOrBuilder();
}