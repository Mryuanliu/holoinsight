/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: registry-for-agent.proto

package io.holoinsight.server.registry.grpc.agent;

public interface SendAgentHeartbeatResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.registry.grpc.agent.SendAgentHeartbeatResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  boolean hasHeader();

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonResponseHeader getHeader();

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder getHeaderOrBuilder();
}
