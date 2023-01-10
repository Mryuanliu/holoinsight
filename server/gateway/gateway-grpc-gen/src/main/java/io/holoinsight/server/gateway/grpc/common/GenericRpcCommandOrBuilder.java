/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: common.proto

package io.holoinsight.server.gateway.grpc.common;

public interface GenericRpcCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.holoinsight.server.gateway.grpc.common.GenericRpcCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 描述data的类型, 这是需要agent与registry约定好的
   * 0: oneway
   * 1: req
   * 2: resp
   * 3: client_handshake
   * 4: server_handshake
   * 因为这个字段名称如果交租type很容易用错... 所以故意加个 rpc 前缀
   * </pre>
   *
   * <code>int32 rpc_type = 1;</code>
   * 
   * @return The rpcType.
   */
  int getRpcType();

  /**
   * <pre>
   * req_id for req and resp case
   * </pre>
   *
   * <code>int64 req_id = 2;</code>
   * 
   * @return The reqId.
   */
  long getReqId();

  /**
   * <pre>
   * user data type
   * </pre>
   *
   * <code>int32 biz_type = 3;</code>
   * 
   * @return The bizType.
   */
  int getBizType();

  /**
   * <pre>
   * user data
   * </pre>
   *
   * <code>bytes data = 4;</code>
   * 
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
