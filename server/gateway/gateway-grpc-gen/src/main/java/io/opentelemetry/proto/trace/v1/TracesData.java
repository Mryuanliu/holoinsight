/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/trace/v1/trace.proto

package io.opentelemetry.proto.trace.v1;

/**
 * <pre>
 * TracesData represents the traces data that can be stored in a persistent storage,
 * OR can be embedded by other protocols that transfer OTLP traces data but do
 * not implement the OTLP protocol.
 * The main difference between this message and collector protocol is that
 * in this message there will not be any "control" or "metadata" specific to
 * OTLP protocol.
 * When new fields are added into this message, the OTLP request MUST be updated
 * as well.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.trace.v1.TracesData}
 */
public final class TracesData extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.trace.v1.TracesData)
    TracesDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TracesData.newBuilder() to construct.
  private TracesData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TracesData() {
    resourceSpans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TracesData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TracesData(com.google.protobuf.CodedInputStream input,
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              resourceSpans_ =
                  new java.util.ArrayList<io.opentelemetry.proto.trace.v1.ResourceSpans>();
              mutable_bitField0_ |= 0x00000001;
            }
            resourceSpans_.add(input.readMessage(
                io.opentelemetry.proto.trace.v1.ResourceSpans.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        resourceSpans_ = java.util.Collections.unmodifiableList(resourceSpans_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_TracesData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_TracesData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(io.opentelemetry.proto.trace.v1.TracesData.class,
            io.opentelemetry.proto.trace.v1.TracesData.Builder.class);
  }

  public static final int RESOURCE_SPANS_FIELD_NUMBER = 1;
  private java.util.List<io.opentelemetry.proto.trace.v1.ResourceSpans> resourceSpans_;

  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.opentelemetry.proto.trace.v1.ResourceSpans> getResourceSpansList() {
    return resourceSpans_;
  }

  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder> getResourceSpansOrBuilderList() {
    return resourceSpans_;
  }

  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  @java.lang.Override
  public int getResourceSpansCount() {
    return resourceSpans_.size();
  }

  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  @java.lang.Override
  public io.opentelemetry.proto.trace.v1.ResourceSpans getResourceSpans(int index) {
    return resourceSpans_.get(index);
  }

  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain
   * one element. Intermediary nodes that receive data from multiple origins
   * typically batch the data before forwarding further and in that case this
   * array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  @java.lang.Override
  public io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder getResourceSpansOrBuilder(
      int index) {
    return resourceSpans_.get(index);
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
    for (int i = 0; i < resourceSpans_.size(); i++) {
      output.writeMessage(1, resourceSpans_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    for (int i = 0; i < resourceSpans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, resourceSpans_.get(i));
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
    if (!(obj instanceof io.opentelemetry.proto.trace.v1.TracesData)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.trace.v1.TracesData other =
        (io.opentelemetry.proto.trace.v1.TracesData) obj;

    if (!getResourceSpansList().equals(other.getResourceSpansList()))
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
    if (getResourceSpansCount() > 0) {
      hash = (37 * hash) + RESOURCE_SPANS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceSpansList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.trace.v1.TracesData parseFrom(
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

  public static Builder newBuilder(io.opentelemetry.proto.trace.v1.TracesData prototype) {
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
   * <pre>
   * TracesData represents the traces data that can be stored in a persistent storage,
   * OR can be embedded by other protocols that transfer OTLP traces data but do
   * not implement the OTLP protocol.
   * The main difference between this message and collector protocol is that
   * in this message there will not be any "control" or "metadata" specific to
   * OTLP protocol.
   * When new fields are added into this message, the OTLP request MUST be updated
   * as well.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.trace.v1.TracesData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.trace.v1.TracesData)
      io.opentelemetry.proto.trace.v1.TracesDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_TracesData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_TracesData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(io.opentelemetry.proto.trace.v1.TracesData.class,
              io.opentelemetry.proto.trace.v1.TracesData.Builder.class);
    }

    // Construct using io.opentelemetry.proto.trace.v1.TracesData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResourceSpansFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resourceSpansBuilder_ == null) {
        resourceSpans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resourceSpansBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.opentelemetry.proto.trace.v1.TraceProto.internal_static_opentelemetry_proto_trace_v1_TracesData_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.trace.v1.TracesData getDefaultInstanceForType() {
      return io.opentelemetry.proto.trace.v1.TracesData.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.trace.v1.TracesData build() {
      io.opentelemetry.proto.trace.v1.TracesData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.trace.v1.TracesData buildPartial() {
      io.opentelemetry.proto.trace.v1.TracesData result =
          new io.opentelemetry.proto.trace.v1.TracesData(this);
      int from_bitField0_ = bitField0_;
      if (resourceSpansBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          resourceSpans_ = java.util.Collections.unmodifiableList(resourceSpans_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceSpans_ = resourceSpans_;
      } else {
        result.resourceSpans_ = resourceSpansBuilder_.build();
      }
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
      if (other instanceof io.opentelemetry.proto.trace.v1.TracesData) {
        return mergeFrom((io.opentelemetry.proto.trace.v1.TracesData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentelemetry.proto.trace.v1.TracesData other) {
      if (other == io.opentelemetry.proto.trace.v1.TracesData.getDefaultInstance())
        return this;
      if (resourceSpansBuilder_ == null) {
        if (!other.resourceSpans_.isEmpty()) {
          if (resourceSpans_.isEmpty()) {
            resourceSpans_ = other.resourceSpans_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceSpansIsMutable();
            resourceSpans_.addAll(other.resourceSpans_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceSpans_.isEmpty()) {
          if (resourceSpansBuilder_.isEmpty()) {
            resourceSpansBuilder_.dispose();
            resourceSpansBuilder_ = null;
            resourceSpans_ = other.resourceSpans_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceSpansBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                ? getResourceSpansFieldBuilder()
                : null;
          } else {
            resourceSpansBuilder_.addAllMessages(other.resourceSpans_);
          }
        }
      }
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
      io.opentelemetry.proto.trace.v1.TracesData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.trace.v1.TracesData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<io.opentelemetry.proto.trace.v1.ResourceSpans> resourceSpans_ =
        java.util.Collections.emptyList();

    private void ensureResourceSpansIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourceSpans_ =
            new java.util.ArrayList<io.opentelemetry.proto.trace.v1.ResourceSpans>(resourceSpans_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.opentelemetry.proto.trace.v1.ResourceSpans, io.opentelemetry.proto.trace.v1.ResourceSpans.Builder, io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder> resourceSpansBuilder_;

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public java.util.List<io.opentelemetry.proto.trace.v1.ResourceSpans> getResourceSpansList() {
      if (resourceSpansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceSpans_);
      } else {
        return resourceSpansBuilder_.getMessageList();
      }
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public int getResourceSpansCount() {
      if (resourceSpansBuilder_ == null) {
        return resourceSpans_.size();
      } else {
        return resourceSpansBuilder_.getCount();
      }
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public io.opentelemetry.proto.trace.v1.ResourceSpans getResourceSpans(int index) {
      if (resourceSpansBuilder_ == null) {
        return resourceSpans_.get(index);
      } else {
        return resourceSpansBuilder_.getMessage(index);
      }
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder setResourceSpans(int index,
        io.opentelemetry.proto.trace.v1.ResourceSpans value) {
      if (resourceSpansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceSpansIsMutable();
        resourceSpans_.set(index, value);
        onChanged();
      } else {
        resourceSpansBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder setResourceSpans(int index,
        io.opentelemetry.proto.trace.v1.ResourceSpans.Builder builderForValue) {
      if (resourceSpansBuilder_ == null) {
        ensureResourceSpansIsMutable();
        resourceSpans_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceSpansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder addResourceSpans(io.opentelemetry.proto.trace.v1.ResourceSpans value) {
      if (resourceSpansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceSpansIsMutable();
        resourceSpans_.add(value);
        onChanged();
      } else {
        resourceSpansBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder addResourceSpans(int index,
        io.opentelemetry.proto.trace.v1.ResourceSpans value) {
      if (resourceSpansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceSpansIsMutable();
        resourceSpans_.add(index, value);
        onChanged();
      } else {
        resourceSpansBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder addResourceSpans(
        io.opentelemetry.proto.trace.v1.ResourceSpans.Builder builderForValue) {
      if (resourceSpansBuilder_ == null) {
        ensureResourceSpansIsMutable();
        resourceSpans_.add(builderForValue.build());
        onChanged();
      } else {
        resourceSpansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder addResourceSpans(int index,
        io.opentelemetry.proto.trace.v1.ResourceSpans.Builder builderForValue) {
      if (resourceSpansBuilder_ == null) {
        ensureResourceSpansIsMutable();
        resourceSpans_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceSpansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder addAllResourceSpans(
        java.lang.Iterable<? extends io.opentelemetry.proto.trace.v1.ResourceSpans> values) {
      if (resourceSpansBuilder_ == null) {
        ensureResourceSpansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceSpans_);
        onChanged();
      } else {
        resourceSpansBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder clearResourceSpans() {
      if (resourceSpansBuilder_ == null) {
        resourceSpans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceSpansBuilder_.clear();
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public Builder removeResourceSpans(int index) {
      if (resourceSpansBuilder_ == null) {
        ensureResourceSpansIsMutable();
        resourceSpans_.remove(index);
        onChanged();
      } else {
        resourceSpansBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public io.opentelemetry.proto.trace.v1.ResourceSpans.Builder getResourceSpansBuilder(
        int index) {
      return getResourceSpansFieldBuilder().getBuilder(index);
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder getResourceSpansOrBuilder(
        int index) {
      if (resourceSpansBuilder_ == null) {
        return resourceSpans_.get(index);
      } else {
        return resourceSpansBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public java.util.List<? extends io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder> getResourceSpansOrBuilderList() {
      if (resourceSpansBuilder_ != null) {
        return resourceSpansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceSpans_);
      }
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public io.opentelemetry.proto.trace.v1.ResourceSpans.Builder addResourceSpansBuilder() {
      return getResourceSpansFieldBuilder()
          .addBuilder(io.opentelemetry.proto.trace.v1.ResourceSpans.getDefaultInstance());
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public io.opentelemetry.proto.trace.v1.ResourceSpans.Builder addResourceSpansBuilder(
        int index) {
      return getResourceSpansFieldBuilder().addBuilder(index,
          io.opentelemetry.proto.trace.v1.ResourceSpans.getDefaultInstance());
    }

    /**
     * <pre>
     * An array of ResourceSpans.
     * For data coming from a single resource this array will typically contain
     * one element. Intermediary nodes that receive data from multiple origins
     * typically batch the data before forwarding further and in that case this
     * array will contain multiple elements.
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
     */
    public java.util.List<io.opentelemetry.proto.trace.v1.ResourceSpans.Builder> getResourceSpansBuilderList() {
      return getResourceSpansFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.opentelemetry.proto.trace.v1.ResourceSpans, io.opentelemetry.proto.trace.v1.ResourceSpans.Builder, io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder> getResourceSpansFieldBuilder() {
      if (resourceSpansBuilder_ == null) {
        resourceSpansBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<io.opentelemetry.proto.trace.v1.ResourceSpans, io.opentelemetry.proto.trace.v1.ResourceSpans.Builder, io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder>(
                resourceSpans_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(),
                isClean());
        resourceSpans_ = null;
      }
      return resourceSpansBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.trace.v1.TracesData)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.trace.v1.TracesData)
  private static final io.opentelemetry.proto.trace.v1.TracesData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentelemetry.proto.trace.v1.TracesData();
  }

  public static io.opentelemetry.proto.trace.v1.TracesData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TracesData> PARSER =
      new com.google.protobuf.AbstractParser<TracesData>() {
        @java.lang.Override
        public TracesData parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TracesData(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TracesData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TracesData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.trace.v1.TracesData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

