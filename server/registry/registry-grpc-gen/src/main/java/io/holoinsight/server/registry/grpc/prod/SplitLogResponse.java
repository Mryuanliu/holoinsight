/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: registry-for-prod.proto

package io.holoinsight.server.registry.grpc.prod;

/**
 * Protobuf type {@code io.holoinsight.server.registry.grpc.prod.SplitLogResponse}
 */
public final class SplitLogResponse extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.registry.grpc.prod.SplitLogResponse)
    SplitLogResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SplitLogResponse.newBuilder() to construct.
  private SplitLogResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SplitLogResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SplitLogResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SplitLogResponse(com.google.protobuf.CodedInputStream input,
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
            io.holoinsight.server.common.grpc.CommonResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(
                io.holoinsight.server.common.grpc.CommonResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              result_ =
                  com.google.protobuf.MapField.newMapField(ResultDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String> result__ =
                input.readMessage(ResultDefaultEntryHolder.defaultEntry.getParserForType(),
                    extensionRegistry);
            result_.getMutableMap().put(result__.getKey(), result__.getValue());
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
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetResult();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.registry.grpc.prod.SplitLogResponse.class,
            io.holoinsight.server.registry.grpc.prod.SplitLogResponse.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private io.holoinsight.server.common.grpc.CommonResponseHeader header_;

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  public io.holoinsight.server.common.grpc.CommonResponseHeader getHeader() {
    return header_ == null
        ? io.holoinsight.server.common.grpc.CommonResponseHeader.getDefaultInstance()
        : header_;
  }

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  public io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int RESULT_FIELD_NUMBER = 2;

  private static final class ResultDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogResponse_ResultEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING, "",
            com.google.protobuf.WireFormat.FieldType.STRING, "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> result_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetResult() {
    if (result_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ResultDefaultEntryHolder.defaultEntry);
    }
    return result_;
  }

  public int getResultCount() {
    return internalGetResult().getMap().size();
  }

  /**
   * <code>map&lt;string, string&gt; result = 2;</code>
   */

  public boolean containsResult(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetResult().getMap().containsKey(key);
  }

  /**
   * Use {@link #getResultMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getResult() {
    return getResultMap();
  }

  /**
   * <code>map&lt;string, string&gt; result = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getResultMap() {
    return internalGetResult().getMap();
  }

  /**
   * <code>map&lt;string, string&gt; result = 2;</code>
   */

  public java.lang.String getResultOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetResult().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   * <code>map&lt;string, string&gt; result = 2;</code>
   */

  public java.lang.String getResultOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetResult().getMap();
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(output, internalGetResult(),
        ResultDefaultEntryHolder.defaultEntry, 2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getHeader());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : internalGetResult()
        .getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> result__ =
          ResultDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey())
              .setValue(entry.getValue()).build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, result__);
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
    if (!(obj instanceof io.holoinsight.server.registry.grpc.prod.SplitLogResponse)) {
      return super.equals(obj);
    }
    io.holoinsight.server.registry.grpc.prod.SplitLogResponse other =
        (io.holoinsight.server.registry.grpc.prod.SplitLogResponse) obj;

    if (hasHeader() != other.hasHeader())
      return false;
    if (hasHeader()) {
      if (!getHeader().equals(other.getHeader()))
        return false;
    }
    if (!internalGetResult().equals(other.internalGetResult()))
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (!internalGetResult().getMap().isEmpty()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse parseFrom(
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

  public static Builder newBuilder(
      io.holoinsight.server.registry.grpc.prod.SplitLogResponse prototype) {
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
   * Protobuf type {@code io.holoinsight.server.registry.grpc.prod.SplitLogResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.registry.grpc.prod.SplitLogResponse)
      io.holoinsight.server.registry.grpc.prod.SplitLogResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetResult();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableResult();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.registry.grpc.prod.SplitLogResponse.class,
              io.holoinsight.server.registry.grpc.prod.SplitLogResponse.Builder.class);
    }

    // Construct using io.holoinsight.server.registry.grpc.prod.SplitLogResponse.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      internalGetMutableResult().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_SplitLogResponse_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.SplitLogResponse getDefaultInstanceForType() {
      return io.holoinsight.server.registry.grpc.prod.SplitLogResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.SplitLogResponse build() {
      io.holoinsight.server.registry.grpc.prod.SplitLogResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.SplitLogResponse buildPartial() {
      io.holoinsight.server.registry.grpc.prod.SplitLogResponse result =
          new io.holoinsight.server.registry.grpc.prod.SplitLogResponse(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.result_ = internalGetResult();
      result.result_.makeImmutable();
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
      if (other instanceof io.holoinsight.server.registry.grpc.prod.SplitLogResponse) {
        return mergeFrom((io.holoinsight.server.registry.grpc.prod.SplitLogResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.registry.grpc.prod.SplitLogResponse other) {
      if (other == io.holoinsight.server.registry.grpc.prod.SplitLogResponse.getDefaultInstance())
        return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      internalGetMutableResult().mergeFrom(other.internalGetResult());
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
      io.holoinsight.server.registry.grpc.prod.SplitLogResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (io.holoinsight.server.registry.grpc.prod.SplitLogResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private io.holoinsight.server.common.grpc.CommonResponseHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.common.grpc.CommonResponseHeader, io.holoinsight.server.common.grpc.CommonResponseHeader.Builder, io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder> headerBuilder_;

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null
            ? io.holoinsight.server.common.grpc.CommonResponseHeader.getDefaultInstance()
            : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder setHeader(io.holoinsight.server.common.grpc.CommonResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        io.holoinsight.server.common.grpc.CommonResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(io.holoinsight.server.common.grpc.CommonResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ = io.holoinsight.server.common.grpc.CommonResponseHeader.newBuilder(header_)
              .mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonResponseHeader.Builder getHeaderBuilder() {

      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null
            ? io.holoinsight.server.common.grpc.CommonResponseHeader.getDefaultInstance()
            : header_;
      }
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.common.grpc.CommonResponseHeader, io.holoinsight.server.common.grpc.CommonResponseHeader.Builder, io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder> getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.common.grpc.CommonResponseHeader, io.holoinsight.server.common.grpc.CommonResponseHeader.Builder, io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder>(
                getHeader(), getParentForChildren(), isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> result_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetResult() {
      if (result_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ResultDefaultEntryHolder.defaultEntry);
      }
      return result_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMutableResult() {
      onChanged();;
      if (result_ == null) {
        result_ = com.google.protobuf.MapField.newMapField(ResultDefaultEntryHolder.defaultEntry);
      }
      if (!result_.isMutable()) {
        result_ = result_.copy();
      }
      return result_;
    }

    public int getResultCount() {
      return internalGetResult().getMap().size();
    }

    /**
     * <code>map&lt;string, string&gt; result = 2;</code>
     */

    public boolean containsResult(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetResult().getMap().containsKey(key);
    }

    /**
     * Use {@link #getResultMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getResult() {
      return getResultMap();
    }

    /**
     * <code>map&lt;string, string&gt; result = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getResultMap() {
      return internalGetResult().getMap();
    }

    /**
     * <code>map&lt;string, string&gt; result = 2;</code>
     */

    public java.lang.String getResultOrDefault(java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetResult().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     * <code>map&lt;string, string&gt; result = 2;</code>
     */

    public java.lang.String getResultOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetResult().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearResult() {
      internalGetMutableResult().getMutableMap().clear();
      return this;
    }

    /**
     * <code>map&lt;string, string&gt; result = 2;</code>
     */

    public Builder removeResult(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableResult().getMutableMap().remove(key);
      return this;
    }

    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableResult() {
      return internalGetMutableResult().getMutableMap();
    }

    /**
     * <code>map&lt;string, string&gt; result = 2;</code>
     */
    public Builder putResult(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableResult().getMutableMap().put(key, value);
      return this;
    }

    /**
     * <code>map&lt;string, string&gt; result = 2;</code>
     */

    public Builder putAllResult(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableResult().getMutableMap().putAll(values);
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.registry.grpc.prod.SplitLogResponse)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.registry.grpc.prod.SplitLogResponse)
  private static final io.holoinsight.server.registry.grpc.prod.SplitLogResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.registry.grpc.prod.SplitLogResponse();
  }

  public static io.holoinsight.server.registry.grpc.prod.SplitLogResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SplitLogResponse> PARSER =
      new com.google.protobuf.AbstractParser<SplitLogResponse>() {
        @java.lang.Override
        public SplitLogResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SplitLogResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SplitLogResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SplitLogResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.registry.grpc.prod.SplitLogResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

