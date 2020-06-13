// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inter_node_rpc_service.proto

package com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc;

/**
 * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse}
 */
public  final class PublishResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse)
    PublishResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishResponse.newBuilder() to construct.
  private PublishResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishResponse() {
    dataStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PublishResponse(
      com.google.protobuf.CodedInputStream input,
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
          case 8: {
            int rawValue = input.readEnum();

            dataStatus_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_PublishResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_PublishResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus}
   */
  public enum PublishResponseStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SUCCESS = 0;</code>
     */
    SUCCESS(0),
    /**
     * <code>NODE_SHUTDOWN = 1;</code>
     */
    NODE_SHUTDOWN(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SUCCESS = 0;</code>
     */
    public static final int SUCCESS_VALUE = 0;
    /**
     * <code>NODE_SHUTDOWN = 1;</code>
     */
    public static final int NODE_SHUTDOWN_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PublishResponseStatus valueOf(int value) {
      return forNumber(value);
    }

    public static PublishResponseStatus forNumber(int value) {
      switch (value) {
        case 0: return SUCCESS;
        case 1: return NODE_SHUTDOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PublishResponseStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PublishResponseStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PublishResponseStatus>() {
            public PublishResponseStatus findValueByNumber(int number) {
              return PublishResponseStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final PublishResponseStatus[] VALUES = values();

    public static PublishResponseStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PublishResponseStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus)
  }

  public static final int DATA_STATUS_FIELD_NUMBER = 1;
  private int dataStatus_;
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus data_status = 1;</code>
   */
  public int getDataStatusValue() {
    return dataStatus_;
  }
  /**
   * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus data_status = 1;</code>
   */
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus getDataStatus() {
    @SuppressWarnings("deprecation")
    com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus.valueOf(dataStatus_);
    return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (dataStatus_ != com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus.SUCCESS.getNumber()) {
      output.writeEnum(1, dataStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataStatus_ != com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dataStatus_);
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
    if (!(obj instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse)) {
      return super.equals(obj);
    }
    com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse other = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse) obj;

    if (dataStatus_ != other.dataStatus_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATA_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + dataStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse)
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_PublishResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_PublishResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.Builder.class);
    }

    // Construct using com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dataStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_PublishResponse_descriptor;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse getDefaultInstanceForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse build() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse buildPartial() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse result = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse(this);
      result.dataStatus_ = dataStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse) {
        return mergeFrom((com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse other) {
      if (other == com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.getDefaultInstance()) return this;
      if (other.dataStatus_ != 0) {
        setDataStatusValue(other.getDataStatusValue());
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
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dataStatus_ = 0;
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus data_status = 1;</code>
     */
    public int getDataStatusValue() {
      return dataStatus_;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus data_status = 1;</code>
     */
    public Builder setDataStatusValue(int value) {
      dataStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus data_status = 1;</code>
     */
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus getDataStatus() {
      @SuppressWarnings("deprecation")
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus result = com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus.valueOf(dataStatus_);
      return result == null ? com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus data_status = 1;</code>
     */
    public Builder setDataStatus(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dataStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse.PublishResponseStatus data_status = 1;</code>
     */
    public Builder clearDataStatus() {
      
      dataStatus_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse)
  }

  // @@protoc_insertion_point(class_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse)
  private static final com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse();
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishResponse>
      PARSER = new com.google.protobuf.AbstractParser<PublishResponse>() {
    @java.lang.Override
    public PublishResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PublishResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PublishResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PublishResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
