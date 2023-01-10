/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: DataService.proto

package io.holoinsight.server.meta.proto.data;

/**
 * Protobuf type {@code scheduler.DataHello}
 */
public final class DataHello extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scheduler.DataHello)
    DataHelloOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DataHello.newBuilder() to construct.
  private DataHello(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataHello() {
    count_ = 0;
    fromApp_ = "";
    fromIp_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DataHello(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            count_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fromApp_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fromIp_ = s;
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
    return io.holoinsight.server.meta.proto.data.DataServiceProto.internal_static_scheduler_DataHello_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.meta.proto.data.DataServiceProto.internal_static_scheduler_DataHello_fieldAccessorTable
        .ensureFieldAccessorsInitialized(io.holoinsight.server.meta.proto.data.DataHello.class,
            io.holoinsight.server.meta.proto.data.DataHello.Builder.class);
  }

  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;

  /**
   * <code>int32 count = 1;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int FROMAPP_FIELD_NUMBER = 2;
  private volatile java.lang.Object fromApp_;

  /**
   * <code>string fromApp = 2;</code>
   */
  public java.lang.String getFromApp() {
    java.lang.Object ref = fromApp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromApp_ = s;
      return s;
    }
  }

  /**
   * <code>string fromApp = 2;</code>
   */
  public com.google.protobuf.ByteString getFromAppBytes() {
    java.lang.Object ref = fromApp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fromApp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROMIP_FIELD_NUMBER = 3;
  private volatile java.lang.Object fromIp_;

  /**
   * <code>string fromIp = 3;</code>
   */
  public java.lang.String getFromIp() {
    java.lang.Object ref = fromIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromIp_ = s;
      return s;
    }
  }

  /**
   * <code>string fromIp = 3;</code>
   */
  public com.google.protobuf.ByteString getFromIpBytes() {
    java.lang.Object ref = fromIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fromIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (count_ != 0) {
      output.writeInt32(1, count_);
    }
    if (!getFromAppBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fromApp_);
    }
    if (!getFromIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fromIp_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, count_);
    }
    if (!getFromAppBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fromApp_);
    }
    if (!getFromIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fromIp_);
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
    if (!(obj instanceof io.holoinsight.server.meta.proto.data.DataHello)) {
      return super.equals(obj);
    }
    io.holoinsight.server.meta.proto.data.DataHello other =
        (io.holoinsight.server.meta.proto.data.DataHello) obj;

    boolean result = true;
    result = result && (getCount() == other.getCount());
    result = result && getFromApp().equals(other.getFromApp());
    result = result && getFromIp().equals(other.getFromIp());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + FROMAPP_FIELD_NUMBER;
    hash = (53 * hash) + getFromApp().hashCode();
    hash = (37 * hash) + FROMIP_FIELD_NUMBER;
    hash = (53 * hash) + getFromIp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.meta.proto.data.DataHello parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.holoinsight.server.meta.proto.data.DataHello prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   * Protobuf type {@code scheduler.DataHello}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:scheduler.DataHello)
      io.holoinsight.server.meta.proto.data.DataHelloOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.meta.proto.data.DataServiceProto.internal_static_scheduler_DataHello_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.meta.proto.data.DataServiceProto.internal_static_scheduler_DataHello_fieldAccessorTable
          .ensureFieldAccessorsInitialized(io.holoinsight.server.meta.proto.data.DataHello.class,
              io.holoinsight.server.meta.proto.data.DataHello.Builder.class);
    }

    // Construct using io.holoinsight.server.meta.proto.data.DataHello.newBuilder()
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

    public Builder clear() {
      super.clear();
      count_ = 0;

      fromApp_ = "";

      fromIp_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.meta.proto.data.DataServiceProto.internal_static_scheduler_DataHello_descriptor;
    }

    public io.holoinsight.server.meta.proto.data.DataHello getDefaultInstanceForType() {
      return io.holoinsight.server.meta.proto.data.DataHello.getDefaultInstance();
    }

    public io.holoinsight.server.meta.proto.data.DataHello build() {
      io.holoinsight.server.meta.proto.data.DataHello result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.holoinsight.server.meta.proto.data.DataHello buildPartial() {
      io.holoinsight.server.meta.proto.data.DataHello result =
          new io.holoinsight.server.meta.proto.data.DataHello(this);
      result.count_ = count_;
      result.fromApp_ = fromApp_;
      result.fromIp_ = fromIp_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }

    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.meta.proto.data.DataHello) {
        return mergeFrom((io.holoinsight.server.meta.proto.data.DataHello) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.meta.proto.data.DataHello other) {
      if (other == io.holoinsight.server.meta.proto.data.DataHello.getDefaultInstance())
        return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (!other.getFromApp().isEmpty()) {
        fromApp_ = other.fromApp_;
        onChanged();
      }
      if (!other.getFromIp().isEmpty()) {
        fromIp_ = other.fromIp_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      io.holoinsight.server.meta.proto.data.DataHello parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.meta.proto.data.DataHello) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int count_;

    /**
     * <code>int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }

    /**
     * <code>int32 count = 1;</code>
     */
    public Builder setCount(int value) {

      count_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 count = 1;</code>
     */
    public Builder clearCount() {

      count_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fromApp_ = "";

    /**
     * <code>string fromApp = 2;</code>
     */
    public java.lang.String getFromApp() {
      java.lang.Object ref = fromApp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromApp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string fromApp = 2;</code>
     */
    public com.google.protobuf.ByteString getFromAppBytes() {
      java.lang.Object ref = fromApp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fromApp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string fromApp = 2;</code>
     */
    public Builder setFromApp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      fromApp_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string fromApp = 2;</code>
     */
    public Builder clearFromApp() {

      fromApp_ = getDefaultInstance().getFromApp();
      onChanged();
      return this;
    }

    /**
     * <code>string fromApp = 2;</code>
     */
    public Builder setFromAppBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      fromApp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fromIp_ = "";

    /**
     * <code>string fromIp = 3;</code>
     */
    public java.lang.String getFromIp() {
      java.lang.Object ref = fromIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string fromIp = 3;</code>
     */
    public com.google.protobuf.ByteString getFromIpBytes() {
      java.lang.Object ref = fromIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fromIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string fromIp = 3;</code>
     */
    public Builder setFromIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      fromIp_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string fromIp = 3;</code>
     */
    public Builder clearFromIp() {

      fromIp_ = getDefaultInstance().getFromIp();
      onChanged();
      return this;
    }

    /**
     * <code>string fromIp = 3;</code>
     */
    public Builder setFromIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      fromIp_ = value;
      onChanged();
      return this;
    }

    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:scheduler.DataHello)
  }

  // @@protoc_insertion_point(class_scope:scheduler.DataHello)
  private static final io.holoinsight.server.meta.proto.data.DataHello DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.meta.proto.data.DataHello();
  }

  public static io.holoinsight.server.meta.proto.data.DataHello getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataHello> PARSER =
      new com.google.protobuf.AbstractParser<DataHello>() {
        public DataHello parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DataHello(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DataHello> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataHello> getParserForType() {
    return PARSER;
  }

  public io.holoinsight.server.meta.proto.data.DataHello getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

