/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: registry-for-agent.proto

package io.holoinsight.server.registry.grpc.agent;

/**
 * Protobuf type {@code io.holoinsight.server.registry.grpc.agent.Agent}
 */
public final class Agent extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.registry.grpc.agent.Agent)
    AgentOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Agent.newBuilder() to construct.
  private Agent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Agent() {
    id_ = "";
    ip_ = "";
    hostname_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Agent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Agent(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ip_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            hostname_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              other_ =
                  com.google.protobuf.MapField.newMapField(OtherDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String> other__ =
                input.readMessage(OtherDefaultEntryHolder.defaultEntry.getParserForType(),
                    extensionRegistry);
            other_.getMutableMap().put(other__.getKey(), other__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_Agent_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 4:
        return internalGetOther();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_Agent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(io.holoinsight.server.registry.grpc.agent.Agent.class,
            io.holoinsight.server.registry.grpc.agent.Agent.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;

  /**
   * <pre>
   * 唯一识别该agent的id
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }

  /**
   * <pre>
   * 唯一识别该agent的id
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_FIELD_NUMBER = 2;
  private volatile java.lang.Object ip_;

  /**
   * <pre>
   * 该agent的ip
   * </pre>
   *
   * <code>string ip = 2;</code>
   */
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }

  /**
   * <pre>
   * 该agent的ip
   * </pre>
   *
   * <code>string ip = 2;</code>
   */
  public com.google.protobuf.ByteString getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOSTNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object hostname_;

  /**
   * <code>string hostname = 3;</code>
   */
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }

  /**
   * <code>string hostname = 3;</code>
   */
  public com.google.protobuf.ByteString getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OTHER_FIELD_NUMBER = 4;

  private static final class OtherDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_Agent_OtherEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING, "",
            com.google.protobuf.WireFormat.FieldType.STRING, "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> other_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetOther() {
    if (other_ == null) {
      return com.google.protobuf.MapField.emptyMapField(OtherDefaultEntryHolder.defaultEntry);
    }
    return other_;
  }

  public int getOtherCount() {
    return internalGetOther().getMap().size();
  }

  /**
   * <pre>
   * TODO 版本号
   * 其他扩展字段
   * </pre>
   *
   * <code>map&lt;string, string&gt; other = 4;</code>
   */

  public boolean containsOther(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetOther().getMap().containsKey(key);
  }

  /**
   * Use {@link #getOtherMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getOther() {
    return getOtherMap();
  }

  /**
   * <pre>
   * TODO 版本号
   * 其他扩展字段
   * </pre>
   *
   * <code>map&lt;string, string&gt; other = 4;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getOtherMap() {
    return internalGetOther().getMap();
  }

  /**
   * <pre>
   * TODO 版本号
   * 其他扩展字段
   * </pre>
   *
   * <code>map&lt;string, string&gt; other = 4;</code>
   */

  public java.lang.String getOtherOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetOther().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   * <pre>
   * TODO 版本号
   * 其他扩展字段
   * </pre>
   *
   * <code>map&lt;string, string&gt; other = 4;</code>
   */

  public java.lang.String getOtherOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetOther().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ip_);
    }
    if (!getHostnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hostname_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(output, internalGetOther(),
        OtherDefaultEntryHolder.defaultEntry, 4);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ip_);
    }
    if (!getHostnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hostname_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : internalGetOther().getMap()
        .entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> other__ =
          OtherDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey())
              .setValue(entry.getValue()).build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, other__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.holoinsight.server.registry.grpc.agent.Agent)) {
      return super.equals(obj);
    }
    io.holoinsight.server.registry.grpc.agent.Agent other =
        (io.holoinsight.server.registry.grpc.agent.Agent) obj;

    if (!getId().equals(other.getId()))
      return false;
    if (!getIp().equals(other.getIp()))
      return false;
    if (!getHostname().equals(other.getHostname()))
      return false;
    if (!internalGetOther().equals(other.internalGetOther()))
      return false;
    if (!unknownFields.equals(other.unknownFields))
      return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    if (!internalGetOther().getMap().isEmpty()) {
      hash = (37 * hash) + OTHER_FIELD_NUMBER;
      hash = (53 * hash) + internalGetOther().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.holoinsight.server.registry.grpc.agent.Agent prototype) {
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
   * Protobuf type {@code io.holoinsight.server.registry.grpc.agent.Agent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.registry.grpc.agent.Agent)
      io.holoinsight.server.registry.grpc.agent.AgentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_Agent_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 4:
          return internalGetOther();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 4:
          return internalGetMutableOther();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_Agent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(io.holoinsight.server.registry.grpc.agent.Agent.class,
              io.holoinsight.server.registry.grpc.agent.Agent.Builder.class);
    }

    // Construct using io.holoinsight.server.registry.grpc.agent.Agent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      ip_ = "";

      hostname_ = "";

      internalGetMutableOther().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.registry.grpc.agent.RegistryForAgentProtos.internal_static_io_holoinsight_server_registry_grpc_agent_Agent_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.agent.Agent getDefaultInstanceForType() {
      return io.holoinsight.server.registry.grpc.agent.Agent.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.agent.Agent build() {
      io.holoinsight.server.registry.grpc.agent.Agent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.agent.Agent buildPartial() {
      io.holoinsight.server.registry.grpc.agent.Agent result =
          new io.holoinsight.server.registry.grpc.agent.Agent(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.ip_ = ip_;
      result.hostname_ = hostname_;
      result.other_ = internalGetOther();
      result.other_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
    public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.registry.grpc.agent.Agent) {
        return mergeFrom((io.holoinsight.server.registry.grpc.agent.Agent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.registry.grpc.agent.Agent other) {
      if (other == io.holoinsight.server.registry.grpc.agent.Agent.getDefaultInstance())
        return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        onChanged();
      }
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        onChanged();
      }
      internalGetMutableOther().mergeFrom(other.internalGetOther());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      io.holoinsight.server.registry.grpc.agent.Agent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.registry.grpc.agent.Agent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object id_ = "";

    /**
     * <pre>
     * 唯一识别该agent的id
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <pre>
     * 唯一识别该agent的id
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <pre>
     * 唯一识别该agent的id
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      id_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 唯一识别该agent的id
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public Builder clearId() {

      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 唯一识别该agent的id
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ip_ = "";

    /**
     * <pre>
     * 该agent的ip
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <pre>
     * 该agent的ip
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public com.google.protobuf.ByteString getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <pre>
     * 该agent的ip
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public Builder setIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ip_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 该agent的ip
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public Builder clearIp() {

      ip_ = getDefaultInstance().getIp();
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 该agent的ip
     * </pre>
     *
     * <code>string ip = 2;</code>
     */
    public Builder setIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      ip_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hostname_ = "";

    /**
     * <code>string hostname = 3;</code>
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string hostname = 3;</code>
     */
    public com.google.protobuf.ByteString getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string hostname = 3;</code>
     */
    public Builder setHostname(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      hostname_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string hostname = 3;</code>
     */
    public Builder clearHostname() {

      hostname_ = getDefaultInstance().getHostname();
      onChanged();
      return this;
    }

    /**
     * <code>string hostname = 3;</code>
     */
    public Builder setHostnameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      hostname_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> other_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetOther() {
      if (other_ == null) {
        return com.google.protobuf.MapField.emptyMapField(OtherDefaultEntryHolder.defaultEntry);
      }
      return other_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMutableOther() {
      onChanged();;
      if (other_ == null) {
        other_ = com.google.protobuf.MapField.newMapField(OtherDefaultEntryHolder.defaultEntry);
      }
      if (!other_.isMutable()) {
        other_ = other_.copy();
      }
      return other_;
    }

    public int getOtherCount() {
      return internalGetOther().getMap().size();
    }

    /**
     * <pre>
     * TODO 版本号
     * 其他扩展字段
     * </pre>
     *
     * <code>map&lt;string, string&gt; other = 4;</code>
     */

    public boolean containsOther(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetOther().getMap().containsKey(key);
    }

    /**
     * Use {@link #getOtherMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getOther() {
      return getOtherMap();
    }

    /**
     * <pre>
     * TODO 版本号
     * 其他扩展字段
     * </pre>
     *
     * <code>map&lt;string, string&gt; other = 4;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getOtherMap() {
      return internalGetOther().getMap();
    }

    /**
     * <pre>
     * TODO 版本号
     * 其他扩展字段
     * </pre>
     *
     * <code>map&lt;string, string&gt; other = 4;</code>
     */

    public java.lang.String getOtherOrDefault(java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetOther().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     * <pre>
     * TODO 版本号
     * 其他扩展字段
     * </pre>
     *
     * <code>map&lt;string, string&gt; other = 4;</code>
     */

    public java.lang.String getOtherOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetOther().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearOther() {
      internalGetMutableOther().getMutableMap().clear();
      return this;
    }

    /**
     * <pre>
     * TODO 版本号
     * 其他扩展字段
     * </pre>
     *
     * <code>map&lt;string, string&gt; other = 4;</code>
     */

    public Builder removeOther(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableOther().getMutableMap().remove(key);
      return this;
    }

    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableOther() {
      return internalGetMutableOther().getMutableMap();
    }

    /**
     * <pre>
     * TODO 版本号
     * 其他扩展字段
     * </pre>
     *
     * <code>map&lt;string, string&gt; other = 4;</code>
     */
    public Builder putOther(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableOther().getMutableMap().put(key, value);
      return this;
    }

    /**
     * <pre>
     * TODO 版本号
     * 其他扩展字段
     * </pre>
     *
     * <code>map&lt;string, string&gt; other = 4;</code>
     */

    public Builder putAllOther(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableOther().getMutableMap().putAll(values);
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.registry.grpc.agent.Agent)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.registry.grpc.agent.Agent)
  private static final io.holoinsight.server.registry.grpc.agent.Agent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.registry.grpc.agent.Agent();
  }

  public static io.holoinsight.server.registry.grpc.agent.Agent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Agent> PARSER =
      new com.google.protobuf.AbstractParser<Agent>() {
        @java.lang.Override
        public Agent parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Agent(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Agent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Agent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.registry.grpc.agent.Agent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

