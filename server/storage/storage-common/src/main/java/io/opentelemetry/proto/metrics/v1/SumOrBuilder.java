/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

public interface SumOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.Sum)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.metrics.v1.NumberDataPoint> getDataPointsList();

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.NumberDataPoint getDataPoints(int index);

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  int getDataPointsCount();

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.metrics.v1.NumberDataPointOrBuilder> getDataPointsOrBuilderList();

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.NumberDataPointOrBuilder getDataPointsOrBuilder(int index);

  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   */
  int getAggregationTemporalityValue();

  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   */
  io.opentelemetry.proto.metrics.v1.AggregationTemporality getAggregationTemporality();

  /**
   * <pre>
   * If "true" means that the sum is monotonic.
   * </pre>
   *
   * <code>bool is_monotonic = 3;</code>
   */
  boolean getIsMonotonic();
}
