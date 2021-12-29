// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/issuer/v1/genesis.proto

package em.issuer.v1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:em.issuer.v1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    java.util.List<em.issuer.v1.IssuerOuterClass.Issuer> 
        getIssuersList();
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    em.issuer.v1.IssuerOuterClass.Issuer getIssuers(int index);
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    int getIssuersCount();
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    java.util.List<? extends em.issuer.v1.IssuerOuterClass.IssuerOrBuilder> 
        getIssuersOrBuilderList();
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    em.issuer.v1.IssuerOuterClass.IssuerOrBuilder getIssuersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code em.issuer.v1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:em.issuer.v1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      issuers_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GenesisState(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                issuers_ = new java.util.ArrayList<em.issuer.v1.IssuerOuterClass.Issuer>();
                mutable_bitField0_ |= 0x00000001;
              }
              issuers_.add(
                  input.readMessage(em.issuer.v1.IssuerOuterClass.Issuer.parser(), extensionRegistry));
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
          issuers_ = java.util.Collections.unmodifiableList(issuers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return em.issuer.v1.Genesis.internal_static_em_issuer_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return em.issuer.v1.Genesis.internal_static_em_issuer_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              em.issuer.v1.Genesis.GenesisState.class, em.issuer.v1.Genesis.GenesisState.Builder.class);
    }

    public static final int ISSUERS_FIELD_NUMBER = 1;
    private java.util.List<em.issuer.v1.IssuerOuterClass.Issuer> issuers_;
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<em.issuer.v1.IssuerOuterClass.Issuer> getIssuersList() {
      return issuers_;
    }
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<? extends em.issuer.v1.IssuerOuterClass.IssuerOrBuilder> 
        getIssuersOrBuilderList() {
      return issuers_;
    }
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    @java.lang.Override
    public int getIssuersCount() {
      return issuers_.size();
    }
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    @java.lang.Override
    public em.issuer.v1.IssuerOuterClass.Issuer getIssuers(int index) {
      return issuers_.get(index);
    }
    /**
     * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
     */
    @java.lang.Override
    public em.issuer.v1.IssuerOuterClass.IssuerOrBuilder getIssuersOrBuilder(
        int index) {
      return issuers_.get(index);
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
      for (int i = 0; i < issuers_.size(); i++) {
        output.writeMessage(1, issuers_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < issuers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, issuers_.get(i));
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
      if (!(obj instanceof em.issuer.v1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      em.issuer.v1.Genesis.GenesisState other = (em.issuer.v1.Genesis.GenesisState) obj;

      if (!getIssuersList()
          .equals(other.getIssuersList())) return false;
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
      if (getIssuersCount() > 0) {
        hash = (37 * hash) + ISSUERS_FIELD_NUMBER;
        hash = (53 * hash) + getIssuersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static em.issuer.v1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static em.issuer.v1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static em.issuer.v1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static em.issuer.v1.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(em.issuer.v1.Genesis.GenesisState prototype) {
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
     * Protobuf type {@code em.issuer.v1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:em.issuer.v1.GenesisState)
        em.issuer.v1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return em.issuer.v1.Genesis.internal_static_em_issuer_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return em.issuer.v1.Genesis.internal_static_em_issuer_v1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                em.issuer.v1.Genesis.GenesisState.class, em.issuer.v1.Genesis.GenesisState.Builder.class);
      }

      // Construct using em.issuer.v1.Genesis.GenesisState.newBuilder()
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
          getIssuersFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (issuersBuilder_ == null) {
          issuers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          issuersBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return em.issuer.v1.Genesis.internal_static_em_issuer_v1_GenesisState_descriptor;
      }

      @java.lang.Override
      public em.issuer.v1.Genesis.GenesisState getDefaultInstanceForType() {
        return em.issuer.v1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public em.issuer.v1.Genesis.GenesisState build() {
        em.issuer.v1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public em.issuer.v1.Genesis.GenesisState buildPartial() {
        em.issuer.v1.Genesis.GenesisState result = new em.issuer.v1.Genesis.GenesisState(this);
        int from_bitField0_ = bitField0_;
        if (issuersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            issuers_ = java.util.Collections.unmodifiableList(issuers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.issuers_ = issuers_;
        } else {
          result.issuers_ = issuersBuilder_.build();
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
        if (other instanceof em.issuer.v1.Genesis.GenesisState) {
          return mergeFrom((em.issuer.v1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(em.issuer.v1.Genesis.GenesisState other) {
        if (other == em.issuer.v1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (issuersBuilder_ == null) {
          if (!other.issuers_.isEmpty()) {
            if (issuers_.isEmpty()) {
              issuers_ = other.issuers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureIssuersIsMutable();
              issuers_.addAll(other.issuers_);
            }
            onChanged();
          }
        } else {
          if (!other.issuers_.isEmpty()) {
            if (issuersBuilder_.isEmpty()) {
              issuersBuilder_.dispose();
              issuersBuilder_ = null;
              issuers_ = other.issuers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              issuersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getIssuersFieldBuilder() : null;
            } else {
              issuersBuilder_.addAllMessages(other.issuers_);
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
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        em.issuer.v1.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (em.issuer.v1.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<em.issuer.v1.IssuerOuterClass.Issuer> issuers_ =
        java.util.Collections.emptyList();
      private void ensureIssuersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          issuers_ = new java.util.ArrayList<em.issuer.v1.IssuerOuterClass.Issuer>(issuers_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          em.issuer.v1.IssuerOuterClass.Issuer, em.issuer.v1.IssuerOuterClass.Issuer.Builder, em.issuer.v1.IssuerOuterClass.IssuerOrBuilder> issuersBuilder_;

      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public java.util.List<em.issuer.v1.IssuerOuterClass.Issuer> getIssuersList() {
        if (issuersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(issuers_);
        } else {
          return issuersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public int getIssuersCount() {
        if (issuersBuilder_ == null) {
          return issuers_.size();
        } else {
          return issuersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public em.issuer.v1.IssuerOuterClass.Issuer getIssuers(int index) {
        if (issuersBuilder_ == null) {
          return issuers_.get(index);
        } else {
          return issuersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder setIssuers(
          int index, em.issuer.v1.IssuerOuterClass.Issuer value) {
        if (issuersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIssuersIsMutable();
          issuers_.set(index, value);
          onChanged();
        } else {
          issuersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder setIssuers(
          int index, em.issuer.v1.IssuerOuterClass.Issuer.Builder builderForValue) {
        if (issuersBuilder_ == null) {
          ensureIssuersIsMutable();
          issuers_.set(index, builderForValue.build());
          onChanged();
        } else {
          issuersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder addIssuers(em.issuer.v1.IssuerOuterClass.Issuer value) {
        if (issuersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIssuersIsMutable();
          issuers_.add(value);
          onChanged();
        } else {
          issuersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder addIssuers(
          int index, em.issuer.v1.IssuerOuterClass.Issuer value) {
        if (issuersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIssuersIsMutable();
          issuers_.add(index, value);
          onChanged();
        } else {
          issuersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder addIssuers(
          em.issuer.v1.IssuerOuterClass.Issuer.Builder builderForValue) {
        if (issuersBuilder_ == null) {
          ensureIssuersIsMutable();
          issuers_.add(builderForValue.build());
          onChanged();
        } else {
          issuersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder addIssuers(
          int index, em.issuer.v1.IssuerOuterClass.Issuer.Builder builderForValue) {
        if (issuersBuilder_ == null) {
          ensureIssuersIsMutable();
          issuers_.add(index, builderForValue.build());
          onChanged();
        } else {
          issuersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder addAllIssuers(
          java.lang.Iterable<? extends em.issuer.v1.IssuerOuterClass.Issuer> values) {
        if (issuersBuilder_ == null) {
          ensureIssuersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, issuers_);
          onChanged();
        } else {
          issuersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder clearIssuers() {
        if (issuersBuilder_ == null) {
          issuers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          issuersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public Builder removeIssuers(int index) {
        if (issuersBuilder_ == null) {
          ensureIssuersIsMutable();
          issuers_.remove(index);
          onChanged();
        } else {
          issuersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public em.issuer.v1.IssuerOuterClass.Issuer.Builder getIssuersBuilder(
          int index) {
        return getIssuersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public em.issuer.v1.IssuerOuterClass.IssuerOrBuilder getIssuersOrBuilder(
          int index) {
        if (issuersBuilder_ == null) {
          return issuers_.get(index);  } else {
          return issuersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public java.util.List<? extends em.issuer.v1.IssuerOuterClass.IssuerOrBuilder> 
           getIssuersOrBuilderList() {
        if (issuersBuilder_ != null) {
          return issuersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(issuers_);
        }
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public em.issuer.v1.IssuerOuterClass.Issuer.Builder addIssuersBuilder() {
        return getIssuersFieldBuilder().addBuilder(
            em.issuer.v1.IssuerOuterClass.Issuer.getDefaultInstance());
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public em.issuer.v1.IssuerOuterClass.Issuer.Builder addIssuersBuilder(
          int index) {
        return getIssuersFieldBuilder().addBuilder(
            index, em.issuer.v1.IssuerOuterClass.Issuer.getDefaultInstance());
      }
      /**
       * <code>repeated .em.issuer.v1.Issuer issuers = 1 [(.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issuers&#92;""];</code>
       */
      public java.util.List<em.issuer.v1.IssuerOuterClass.Issuer.Builder> 
           getIssuersBuilderList() {
        return getIssuersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          em.issuer.v1.IssuerOuterClass.Issuer, em.issuer.v1.IssuerOuterClass.Issuer.Builder, em.issuer.v1.IssuerOuterClass.IssuerOrBuilder> 
          getIssuersFieldBuilder() {
        if (issuersBuilder_ == null) {
          issuersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              em.issuer.v1.IssuerOuterClass.Issuer, em.issuer.v1.IssuerOuterClass.Issuer.Builder, em.issuer.v1.IssuerOuterClass.IssuerOrBuilder>(
                  issuers_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          issuers_ = null;
        }
        return issuersBuilder_;
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


      // @@protoc_insertion_point(builder_scope:em.issuer.v1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:em.issuer.v1.GenesisState)
    private static final em.issuer.v1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new em.issuer.v1.Genesis.GenesisState();
    }

    public static em.issuer.v1.Genesis.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GenesisState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public em.issuer.v1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_issuer_v1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_issuer_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032em/issuer/v1/genesis.proto\022\014em.issuer." +
      "v1\032\024gogoproto/gogo.proto\032\031em/issuer/v1/i" +
      "ssuer.proto\"M\n\014GenesisState\022=\n\007issuers\030\001" +
      " \003(\0132\024.em.issuer.v1.IssuerB\026\362\336\037\016yaml:\"is" +
      "suers\"\310\336\037\000B-Z+github.com/e-money/em-ledg" +
      "er/x/issuer/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf3.GoGoProtos.getDescriptor(),
          em.issuer.v1.IssuerOuterClass.getDescriptor(),
        });
    internal_static_em_issuer_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_em_issuer_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_issuer_v1_GenesisState_descriptor,
        new java.lang.String[] { "Issuers", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf3.GoGoProtos.moretags);
    registry.add(com.google.protobuf3.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf3.GoGoProtos.getDescriptor();
    em.issuer.v1.IssuerOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
