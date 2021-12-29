// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/query.proto

package panacea.aol.v2;

/**
 * <pre>
 * QueryWritersResponse is the response type for the Query/Writers RPC method.
 * </pre>
 *
 * Protobuf type {@code panacea.aol.v2.QueryWritersResponse}
 */
public final class QueryWritersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.aol.v2.QueryWritersResponse)
    QueryWritersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryWritersResponse.newBuilder() to construct.
  private QueryWritersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryWritersResponse() {
    writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryWritersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryWritersResponse(
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
              writerAddresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            writerAddresses_.add(s);
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
        writerAddresses_ = writerAddresses_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryWritersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryWritersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.aol.v2.QueryWritersResponse.class, panacea.aol.v2.QueryWritersResponse.Builder.class);
  }

  public static final int WRITER_ADDRESSES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList writerAddresses_;
  /**
   * <code>repeated string writer_addresses = 1;</code>
   * @return A list containing the writerAddresses.
   */
  public com.google.protobuf.ProtocolStringList
      getWriterAddressesList() {
    return writerAddresses_;
  }
  /**
   * <code>repeated string writer_addresses = 1;</code>
   * @return The count of writerAddresses.
   */
  public int getWriterAddressesCount() {
    return writerAddresses_.size();
  }
  /**
   * <code>repeated string writer_addresses = 1;</code>
   * @param index The index of the element to return.
   * @return The writerAddresses at the given index.
   */
  public java.lang.String getWriterAddresses(int index) {
    return writerAddresses_.get(index);
  }
  /**
   * <code>repeated string writer_addresses = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the writerAddresses at the given index.
   */
  public com.google.protobuf.ByteString
      getWriterAddressesBytes(int index) {
    return writerAddresses_.getByteString(index);
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
    for (int i = 0; i < writerAddresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, writerAddresses_.getRaw(i));
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
      for (int i = 0; i < writerAddresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(writerAddresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWriterAddressesList().size();
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
    if (!(obj instanceof panacea.aol.v2.QueryWritersResponse)) {
      return super.equals(obj);
    }
    panacea.aol.v2.QueryWritersResponse other = (panacea.aol.v2.QueryWritersResponse) obj;

    if (!getWriterAddressesList()
        .equals(other.getWriterAddressesList())) return false;
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
    if (getWriterAddressesCount() > 0) {
      hash = (37 * hash) + WRITER_ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getWriterAddressesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.aol.v2.QueryWritersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.QueryWritersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryWritersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.aol.v2.QueryWritersResponse parseFrom(
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
  public static Builder newBuilder(panacea.aol.v2.QueryWritersResponse prototype) {
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
   * QueryWritersResponse is the response type for the Query/Writers RPC method.
   * </pre>
   *
   * Protobuf type {@code panacea.aol.v2.QueryWritersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.aol.v2.QueryWritersResponse)
      panacea.aol.v2.QueryWritersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryWritersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryWritersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.aol.v2.QueryWritersResponse.class, panacea.aol.v2.QueryWritersResponse.Builder.class);
    }

    // Construct using panacea.aol.v2.QueryWritersResponse.newBuilder()
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
      writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
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
      return panacea.aol.v2.QueryOuterClass.internal_static_panacea_aol_v2_QueryWritersResponse_descriptor;
    }

    @java.lang.Override
    public panacea.aol.v2.QueryWritersResponse getDefaultInstanceForType() {
      return panacea.aol.v2.QueryWritersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.aol.v2.QueryWritersResponse build() {
      panacea.aol.v2.QueryWritersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.aol.v2.QueryWritersResponse buildPartial() {
      panacea.aol.v2.QueryWritersResponse result = new panacea.aol.v2.QueryWritersResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        writerAddresses_ = writerAddresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.writerAddresses_ = writerAddresses_;
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
      if (other instanceof panacea.aol.v2.QueryWritersResponse) {
        return mergeFrom((panacea.aol.v2.QueryWritersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.aol.v2.QueryWritersResponse other) {
      if (other == panacea.aol.v2.QueryWritersResponse.getDefaultInstance()) return this;
      if (!other.writerAddresses_.isEmpty()) {
        if (writerAddresses_.isEmpty()) {
          writerAddresses_ = other.writerAddresses_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureWriterAddressesIsMutable();
          writerAddresses_.addAll(other.writerAddresses_);
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
      panacea.aol.v2.QueryWritersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.aol.v2.QueryWritersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureWriterAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        writerAddresses_ = new com.google.protobuf.LazyStringArrayList(writerAddresses_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @return A list containing the writerAddresses.
     */
    public com.google.protobuf.ProtocolStringList
        getWriterAddressesList() {
      return writerAddresses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @return The count of writerAddresses.
     */
    public int getWriterAddressesCount() {
      return writerAddresses_.size();
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @param index The index of the element to return.
     * @return The writerAddresses at the given index.
     */
    public java.lang.String getWriterAddresses(int index) {
      return writerAddresses_.get(index);
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the writerAddresses at the given index.
     */
    public com.google.protobuf.ByteString
        getWriterAddressesBytes(int index) {
      return writerAddresses_.getByteString(index);
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @param index The index to set the value at.
     * @param value The writerAddresses to set.
     * @return This builder for chaining.
     */
    public Builder setWriterAddresses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWriterAddressesIsMutable();
      writerAddresses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @param value The writerAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addWriterAddresses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureWriterAddressesIsMutable();
      writerAddresses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @param values The writerAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addAllWriterAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureWriterAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, writerAddresses_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWriterAddresses() {
      writerAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string writer_addresses = 1;</code>
     * @param value The bytes of the writerAddresses to add.
     * @return This builder for chaining.
     */
    public Builder addWriterAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureWriterAddressesIsMutable();
      writerAddresses_.add(value);
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


    // @@protoc_insertion_point(builder_scope:panacea.aol.v2.QueryWritersResponse)
  }

  // @@protoc_insertion_point(class_scope:panacea.aol.v2.QueryWritersResponse)
  private static final panacea.aol.v2.QueryWritersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.aol.v2.QueryWritersResponse();
  }

  public static panacea.aol.v2.QueryWritersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryWritersResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryWritersResponse>() {
    @java.lang.Override
    public QueryWritersResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryWritersResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryWritersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryWritersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.aol.v2.QueryWritersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

