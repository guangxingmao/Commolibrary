// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/query.proto

package panacea.aol.v2;

/**
 * <pre>
 * QueryTopicsResponse is the response type for the Query/Topics RPC method.
 * </pre>
 *
 * Protobuf type {@code panacea.aol.v2.QueryTopicsResponse}
 */
public final class QueryTopicsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.aol.v2.QueryTopicsResponse)
    QueryTopicsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTopicsResponse.newBuilder() to construct.
  private QueryTopicsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTopicsResponse() {
    topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTopicsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryTopicsResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              topicNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            topicNames_.add(s);
            break;
          }
          case 18: {
            cosmos.base.query.v1beta1.Pagination.PageResponse.Builder subBuilder = null;
            if (pagination_ != null) {
              subBuilder = pagination_.toBuilder();
            }
            pagination_ = input.readMessage(cosmos.base.query.v1beta1.Pagination.PageResponse.parser(), extensionRegistry);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        topicNames_ = topicNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryTopicsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryTopicsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.aol.v2.QueryTopicsResponse.class, panacea.aol.v2.QueryTopicsResponse.Builder.class);
  }

  public static final int TOPIC_NAMES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList topicNames_;
  /**
   * <code>repeated string topic_names = 1;</code>
   * @return A list containing the topicNames.
   */
  public com.google.protobuf.ProtocolStringList
      getTopicNamesList() {
    return topicNames_;
  }
  /**
   * <code>repeated string topic_names = 1;</code>
   * @return The count of topicNames.
   */
  public int getTopicNamesCount() {
    return topicNames_.size();
  }
  /**
   * <code>repeated string topic_names = 1;</code>
   * @param index The index of the element to return.
   * @return The topicNames at the given index.
   */
  public java.lang.String getTopicNames(int index) {
    return topicNames_.get(index);
  }
  /**
   * <code>repeated string topic_names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the topicNames at the given index.
   */
  public com.google.protobuf.ByteString
      getTopicNamesBytes(int index) {
    return topicNames_.getByteString(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private cosmos.base.query.v1beta1.Pagination.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   * @return The pagination.
   */
  @java.lang.Override
  public cosmos.base.query.v1beta1.Pagination.PageResponse getPagination() {
    return pagination_ == null ? cosmos.base.query.v1beta1.Pagination.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
   */
  @java.lang.Override
  public cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder getPaginationOrBuilder() {
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
    for (int i = 0; i < topicNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topicNames_.getRaw(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < topicNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(topicNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTopicNamesList().size();
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof panacea.aol.v2.QueryTopicsResponse)) {
      return super.equals(obj);
    }
    panacea.aol.v2.QueryTopicsResponse other = (panacea.aol.v2.QueryTopicsResponse) obj;

    if (!getTopicNamesList()
        .equals(other.getTopicNamesList())) return false;
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
    if (getTopicNamesCount() > 0) {
      hash = (37 * hash) + TOPIC_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getTopicNamesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryTopicsResponse parseFrom(
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
  public static Builder newBuilder(panacea.aol.v2.QueryTopicsResponse prototype) {
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
   * QueryTopicsResponse is the response type for the Query/Topics RPC method.
   * </pre>
   *
   * Protobuf type {@code panacea.aol.v2.QueryTopicsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.aol.v2.QueryTopicsResponse)
      panacea.aol.v2.QueryTopicsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryTopicsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryTopicsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.aol.v2.QueryTopicsResponse.class, panacea.aol.v2.QueryTopicsResponse.Builder.class);
    }

    // Construct using panacea.aol.v2.QueryTopicsResponse.newBuilder()
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
      topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
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
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryTopicsResponse_descriptor;
    }

    @java.lang.Override
    public panacea.aol.v2.QueryTopicsResponse getDefaultInstanceForType() {
      return panacea.aol.v2.QueryTopicsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.aol.v2.QueryTopicsResponse build() {
      panacea.aol.v2.QueryTopicsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.aol.v2.QueryTopicsResponse buildPartial() {
      panacea.aol.v2.QueryTopicsResponse result = new panacea.aol.v2.QueryTopicsResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        topicNames_ = topicNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.topicNames_ = topicNames_;
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
      if (other instanceof panacea.aol.v2.QueryTopicsResponse) {
        return mergeFrom((panacea.aol.v2.QueryTopicsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.aol.v2.QueryTopicsResponse other) {
      if (other == panacea.aol.v2.QueryTopicsResponse.getDefaultInstance()) return this;
      if (!other.topicNames_.isEmpty()) {
        if (topicNames_.isEmpty()) {
          topicNames_ = other.topicNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTopicNamesIsMutable();
          topicNames_.addAll(other.topicNames_);
        }
        onChanged();
      }
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
      panacea.aol.v2.QueryTopicsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.aol.v2.QueryTopicsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTopicNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        topicNames_ = new com.google.protobuf.LazyStringArrayList(topicNames_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @return A list containing the topicNames.
     */
    public com.google.protobuf.ProtocolStringList
        getTopicNamesList() {
      return topicNames_.getUnmodifiableView();
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @return The count of topicNames.
     */
    public int getTopicNamesCount() {
      return topicNames_.size();
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @param index The index of the element to return.
     * @return The topicNames at the given index.
     */
    public java.lang.String getTopicNames(int index) {
      return topicNames_.get(index);
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the topicNames at the given index.
     */
    public com.google.protobuf.ByteString
        getTopicNamesBytes(int index) {
      return topicNames_.getByteString(index);
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @param index The index to set the value at.
     * @param value The topicNames to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTopicNamesIsMutable();
      topicNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @param value The topicNames to add.
     * @return This builder for chaining.
     */
    public Builder addTopicNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTopicNamesIsMutable();
      topicNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @param values The topicNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllTopicNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureTopicNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, topicNames_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicNames() {
      topicNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string topic_names = 1;</code>
     * @param value The bytes of the topicNames to add.
     * @return This builder for chaining.
     */
    public Builder addTopicNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTopicNamesIsMutable();
      topicNames_.add(value);
      onChanged();
      return this;
    }

    private cosmos.base.query.v1beta1.Pagination.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.Pagination.PageResponse, cosmos.base.query.v1beta1.Pagination.PageResponse.Builder, cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return paginationBuilder_ != null || pagination_ != null;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return The pagination.
     */
    public cosmos.base.query.v1beta1.Pagination.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? cosmos.base.query.v1beta1.Pagination.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder setPagination(cosmos.base.query.v1beta1.Pagination.PageResponse value) {
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder setPagination(
        cosmos.base.query.v1beta1.Pagination.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
        onChanged();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public Builder mergePagination(cosmos.base.query.v1beta1.Pagination.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (pagination_ != null) {
          pagination_ =
            cosmos.base.query.v1beta1.Pagination.PageResponse.newBuilder(pagination_).mergeFrom(value).buildPartial();
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.Pagination.PageResponse.Builder getPaginationBuilder() {
      
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    public cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            cosmos.base.query.v1beta1.Pagination.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.query.v1beta1.Pagination.PageResponse, cosmos.base.query.v1beta1.Pagination.PageResponse.Builder, cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.query.v1beta1.Pagination.PageResponse, cosmos.base.query.v1beta1.Pagination.PageResponse.Builder, cosmos.base.query.v1beta1.Pagination.PageResponseOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:panacea.aol.v2.QueryTopicsResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.aol.v2.QueryTopicsResponse)
  private static final panacea.aol.v2.QueryTopicsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.aol.v2.QueryTopicsResponse();
  }

  public static panacea.aol.v2.QueryTopicsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTopicsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTopicsResponse>() {
    @java.lang.Override
    public QueryTopicsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryTopicsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryTopicsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTopicsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.aol.v2.QueryTopicsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

