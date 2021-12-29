// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/query.proto

package panacea.token.v2;

/**
 * <pre>
 * QueryTokensRequest is the request type for the Query/Tokens RPC method.
 * </pre>
 *
 * Protobuf type {@code panacea.token.v2.QueryTokensRequest}
 */
public final class QueryTokensRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.token.v2.QueryTokensRequest)
    QueryTokensRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTokensRequest.newBuilder() to construct.
  private QueryTokensRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTokensRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTokensRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryTokensRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            cosmos.base.query.v1beta1.Pagination.PageRequest.Builder subBuilder = null;
            if (pagination_ != null) {
              subBuilder = pagination_.toBuilder();
            }
            pagination_ = input.readMessage(cosmos.base.query.v1beta1.Pagination.PageRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pagination_);
              pagination_ = subBuilder.buildPartial();
            }

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
    return panacea.token.v2.QueryOuterClass.internal_static_panacea_token_v2_QueryTokensRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.token.v2.QueryOuterClass.internal_static_panacea_token_v2_QueryTokensRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.token.v2.QueryTokensRequest.class, panacea.token.v2.QueryTokensRequest.Builder.class);
  }

  public static final int PAGINATION_FIELD_NUMBER = 1;
  private cosmos.base.query.v1beta1.Pagination.PageRequest pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   * @return The pagination.
   */
  @java.lang.Override
  public cosmos.base.query.v1beta1.Pagination.PageRequest getPagination() {
    return pagination_ == null ? cosmos.base.query.v1beta1.Pagination.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   */
  @java.lang.Override
  public cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder getPaginationOrBuilder() {
    return getPagination();
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
    if (pagination_ != null) {
      output.writeMessage(1, getPagination());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPagination());
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
    if (!(obj instanceof panacea.token.v2.QueryTokensRequest)) {
      return super.equals(obj);
    }
    panacea.token.v2.QueryTokensRequest other = (panacea.token.v2.QueryTokensRequest) obj;

    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
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
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.token.v2.QueryTokensRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.token.v2.QueryTokensRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.token.v2.QueryTokensRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.token.v2.QueryTokensRequest parseFrom(
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
  public static Builder newBuilder(panacea.token.v2.QueryTokensRequest prototype) {
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
   * <pre>
   * QueryTokensRequest is the request type for the Query/Tokens RPC method.
   * </pre>
   *
   * Protobuf type {@code panacea.token.v2.QueryTokensRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.token.v2.QueryTokensRequest)
      panacea.token.v2.QueryTokensRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.token.v2.QueryOuterClass.internal_static_panacea_token_v2_QueryTokensRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.token.v2.QueryOuterClass.internal_static_panacea_token_v2_QueryTokensRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.token.v2.QueryTokensRequest.class, panacea.token.v2.QueryTokensRequest.Builder.class);
    }

    // Construct using panacea.token.v2.QueryTokensRequest.newBuilder()
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
      if (paginationBuilder_ == null) {
        pagination_ = null;
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.token.v2.QueryOuterClass.internal_static_panacea_token_v2_QueryTokensRequest_descriptor;
    }

    @java.lang.Override
    public panacea.token.v2.QueryTokensRequest getDefaultInstanceForType() {
      return panacea.token.v2.QueryTokensRequest.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.token.v2.QueryTokensRequest build() {
      panacea.token.v2.QueryTokensRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.token.v2.QueryTokensRequest buildPartial() {
      panacea.token.v2.QueryTokensRequest result = new panacea.token.v2.QueryTokensRequest(this);
      if (paginationBuilder_ == null) {
        result.pagination_ = pagination_;
      } else {
        result.pagination_ = paginationBuilder_.build();
      }
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
      if (other instanceof panacea.token.v2.QueryTokensRequest) {
        return mergeFrom((panacea.token.v2.QueryTokensRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.token.v2.QueryTokensRequest other) {
      if (other == panacea.token.v2.QueryTokensRequest.getDefaultInstance()) return this;
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
      panacea.token.v2.QueryTokensRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.token.v2.QueryTokensRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cosmos.base.query.v1beta1.Pagination.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.Pagination.PageRequest, cosmos.base.query.v1beta1.Pagination.PageRequest.Builder, cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     * @return The pagination.
     */
    public cosmos.base.query.v1beta1.Pagination.PageRequest getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? cosmos.base.query.v1beta1.Pagination.PageRequest.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public Builder setPagination(cosmos.base.query.v1beta1.Pagination.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
        onChanged();
      } else {
        paginationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public Builder setPagination(
        cosmos.base.query.v1beta1.Pagination.PageRequest.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
        onChanged();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public Builder mergePagination(cosmos.base.query.v1beta1.Pagination.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (pagination_ != null) {
          pagination_ =
            cosmos.base.query.v1beta1.Pagination.PageRequest.newBuilder(pagination_).mergeFrom(value).buildPartial();
        } else {
          pagination_ = value;
        }
        onChanged();
      } else {
        paginationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public Builder clearPagination() {
      if (paginationBuilder_ == null) {
        pagination_ = null;
        onChanged();
      } else {
        pagination_ = null;
        paginationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public cosmos.base.query.v1beta1.Pagination.PageRequest.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    public cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            cosmos.base.query.v1beta1.Pagination.PageRequest.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.Pagination.PageRequest, cosmos.base.query.v1beta1.Pagination.PageRequest.Builder, cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.query.v1beta1.Pagination.PageRequest, cosmos.base.query.v1beta1.Pagination.PageRequest.Builder, cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:panacea.token.v2.QueryTokensRequest)
  }

  // @@protoc_insertion_point(class_scope:panacea.token.v2.QueryTokensRequest)
  private static final panacea.token.v2.QueryTokensRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.token.v2.QueryTokensRequest();
  }

  public static panacea.token.v2.QueryTokensRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTokensRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryTokensRequest>() {
    @java.lang.Override
    public QueryTokensRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryTokensRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryTokensRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTokensRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.token.v2.QueryTokensRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
