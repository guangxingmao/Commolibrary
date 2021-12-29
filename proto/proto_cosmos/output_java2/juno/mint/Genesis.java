// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/mint/genesis.proto

package juno.mint;

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
      // @@protoc_insertion_point(interface_extends:CosmosContracts.juno.mint.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the minter field is set.
     */
    boolean hasMinter();
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
     * @return The minter.
     */
    juno.mint.Mint.Minter getMinter();
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
     */
    juno.mint.Mint.MinterOrBuilder getMinterOrBuilder();

    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    juno.mint.Mint.Params getParams();
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
     */
    juno.mint.Mint.ParamsOrBuilder getParamsOrBuilder();
  }
  /**
   * <pre>
   * GenesisState defines the mint module's genesis state.
   * </pre>
   *
   * Protobuf type {@code CosmosContracts.juno.mint.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CosmosContracts.juno.mint.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
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
              juno.mint.Mint.Minter.Builder subBuilder = null;
              if (minter_ != null) {
                subBuilder = minter_.toBuilder();
              }
              minter_ = input.readMessage(juno.mint.Mint.Minter.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(minter_);
                minter_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              juno.mint.Mint.Params.Builder subBuilder = null;
              if (params_ != null) {
                subBuilder = params_.toBuilder();
              }
              params_ = input.readMessage(juno.mint.Mint.Params.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(params_);
                params_ = subBuilder.buildPartial();
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
      return juno.mint.Genesis.internal_static_CosmosContracts_juno_mint_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return juno.mint.Genesis.internal_static_CosmosContracts_juno_mint_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              juno.mint.Genesis.GenesisState.class, juno.mint.Genesis.GenesisState.Builder.class);
    }

    public static final int MINTER_FIELD_NUMBER = 1;
    private juno.mint.Mint.Minter minter_;
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the minter field is set.
     */
    @java.lang.Override
    public boolean hasMinter() {
      return minter_ != null;
    }
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
     * @return The minter.
     */
    @java.lang.Override
    public juno.mint.Mint.Minter getMinter() {
      return minter_ == null ? juno.mint.Mint.Minter.getDefaultInstance() : minter_;
    }
    /**
     * <pre>
     * minter is a space for holding current inflation information.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public juno.mint.Mint.MinterOrBuilder getMinterOrBuilder() {
      return getMinter();
    }

    public static final int PARAMS_FIELD_NUMBER = 2;
    private juno.mint.Mint.Params params_;
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public juno.mint.Mint.Params getParams() {
      return params_ == null ? juno.mint.Mint.Params.getDefaultInstance() : params_;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public juno.mint.Mint.ParamsOrBuilder getParamsOrBuilder() {
      return getParams();
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
      if (minter_ != null) {
        output.writeMessage(1, getMinter());
      }
      if (params_ != null) {
        output.writeMessage(2, getParams());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minter_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMinter());
      }
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getParams());
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
      if (!(obj instanceof juno.mint.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      juno.mint.Genesis.GenesisState other = (juno.mint.Genesis.GenesisState) obj;

      if (hasMinter() != other.hasMinter()) return false;
      if (hasMinter()) {
        if (!getMinter()
            .equals(other.getMinter())) return false;
      }
      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
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
      if (hasMinter()) {
        hash = (37 * hash) + MINTER_FIELD_NUMBER;
        hash = (53 * hash) + getMinter().hashCode();
      }
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static juno.mint.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static juno.mint.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static juno.mint.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static juno.mint.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(juno.mint.Genesis.GenesisState prototype) {
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
     * GenesisState defines the mint module's genesis state.
     * </pre>
     *
     * Protobuf type {@code CosmosContracts.juno.mint.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CosmosContracts.juno.mint.GenesisState)
        juno.mint.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return juno.mint.Genesis.internal_static_CosmosContracts_juno_mint_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return juno.mint.Genesis.internal_static_CosmosContracts_juno_mint_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                juno.mint.Genesis.GenesisState.class, juno.mint.Genesis.GenesisState.Builder.class);
      }

      // Construct using juno.mint.Genesis.GenesisState.newBuilder()
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
        if (minterBuilder_ == null) {
          minter_ = null;
        } else {
          minter_ = null;
          minterBuilder_ = null;
        }
        if (paramsBuilder_ == null) {
          params_ = null;
        } else {
          params_ = null;
          paramsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return juno.mint.Genesis.internal_static_CosmosContracts_juno_mint_GenesisState_descriptor;
      }

      @java.lang.Override
      public juno.mint.Genesis.GenesisState getDefaultInstanceForType() {
        return juno.mint.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public juno.mint.Genesis.GenesisState build() {
        juno.mint.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public juno.mint.Genesis.GenesisState buildPartial() {
        juno.mint.Genesis.GenesisState result = new juno.mint.Genesis.GenesisState(this);
        if (minterBuilder_ == null) {
          result.minter_ = minter_;
        } else {
          result.minter_ = minterBuilder_.build();
        }
        if (paramsBuilder_ == null) {
          result.params_ = params_;
        } else {
          result.params_ = paramsBuilder_.build();
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
        if (other instanceof juno.mint.Genesis.GenesisState) {
          return mergeFrom((juno.mint.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(juno.mint.Genesis.GenesisState other) {
        if (other == juno.mint.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasMinter()) {
          mergeMinter(other.getMinter());
        }
        if (other.hasParams()) {
          mergeParams(other.getParams());
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
        juno.mint.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (juno.mint.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private juno.mint.Mint.Minter minter_;
      private com.google.protobuf.SingleFieldBuilderV3<
          juno.mint.Mint.Minter, juno.mint.Mint.Minter.Builder, juno.mint.Mint.MinterOrBuilder> minterBuilder_;
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       * @return Whether the minter field is set.
       */
      public boolean hasMinter() {
        return minterBuilder_ != null || minter_ != null;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       * @return The minter.
       */
      public juno.mint.Mint.Minter getMinter() {
        if (minterBuilder_ == null) {
          return minter_ == null ? juno.mint.Mint.Minter.getDefaultInstance() : minter_;
        } else {
          return minterBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setMinter(juno.mint.Mint.Minter value) {
        if (minterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          minter_ = value;
          onChanged();
        } else {
          minterBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setMinter(
          juno.mint.Mint.Minter.Builder builderForValue) {
        if (minterBuilder_ == null) {
          minter_ = builderForValue.build();
          onChanged();
        } else {
          minterBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeMinter(juno.mint.Mint.Minter value) {
        if (minterBuilder_ == null) {
          if (minter_ != null) {
            minter_ =
              juno.mint.Mint.Minter.newBuilder(minter_).mergeFrom(value).buildPartial();
          } else {
            minter_ = value;
          }
          onChanged();
        } else {
          minterBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearMinter() {
        if (minterBuilder_ == null) {
          minter_ = null;
          onChanged();
        } else {
          minter_ = null;
          minterBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       */
      public juno.mint.Mint.Minter.Builder getMinterBuilder() {
        
        onChanged();
        return getMinterFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       */
      public juno.mint.Mint.MinterOrBuilder getMinterOrBuilder() {
        if (minterBuilder_ != null) {
          return minterBuilder_.getMessageOrBuilder();
        } else {
          return minter_ == null ?
              juno.mint.Mint.Minter.getDefaultInstance() : minter_;
        }
      }
      /**
       * <pre>
       * minter is a space for holding current inflation information.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Minter minter = 1 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          juno.mint.Mint.Minter, juno.mint.Mint.Minter.Builder, juno.mint.Mint.MinterOrBuilder> 
          getMinterFieldBuilder() {
        if (minterBuilder_ == null) {
          minterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              juno.mint.Mint.Minter, juno.mint.Mint.Minter.Builder, juno.mint.Mint.MinterOrBuilder>(
                  getMinter(),
                  getParentForChildren(),
                  isClean());
          minter_ = null;
        }
        return minterBuilder_;
      }

      private juno.mint.Mint.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          juno.mint.Mint.Params, juno.mint.Mint.Params.Builder, juno.mint.Mint.ParamsOrBuilder> paramsBuilder_;
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return paramsBuilder_ != null || params_ != null;
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public juno.mint.Mint.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? juno.mint.Mint.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(juno.mint.Mint.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
          onChanged();
        } else {
          paramsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          juno.mint.Mint.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
          onChanged();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(juno.mint.Mint.Params value) {
        if (paramsBuilder_ == null) {
          if (params_ != null) {
            params_ =
              juno.mint.Mint.Params.newBuilder(params_).mergeFrom(value).buildPartial();
          } else {
            params_ = value;
          }
          onChanged();
        } else {
          paramsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearParams() {
        if (paramsBuilder_ == null) {
          params_ = null;
          onChanged();
        } else {
          params_ = null;
          paramsBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       */
      public juno.mint.Mint.Params.Builder getParamsBuilder() {
        
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       */
      public juno.mint.Mint.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              juno.mint.Mint.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <pre>
       * params defines all the paramaters of the module.
       * </pre>
       *
       * <code>.CosmosContracts.juno.mint.Params params = 2 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          juno.mint.Mint.Params, juno.mint.Mint.Params.Builder, juno.mint.Mint.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              juno.mint.Mint.Params, juno.mint.Mint.Params.Builder, juno.mint.Mint.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CosmosContracts.juno.mint.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:CosmosContracts.juno.mint.GenesisState)
    private static final juno.mint.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new juno.mint.Genesis.GenesisState();
    }

    public static juno.mint.Genesis.GenesisState getDefaultInstance() {
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
    public juno.mint.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CosmosContracts_juno_mint_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CosmosContracts_juno_mint_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027juno/mint/genesis.proto\022\031CosmosContrac" +
      "ts.juno.mint\032\024gogoproto/gogo.proto\032\024juno" +
      "/mint/mint.proto\"\200\001\n\014GenesisState\0227\n\006min" +
      "ter\030\001 \001(\0132!.CosmosContracts.juno.mint.Mi" +
      "nterB\004\310\336\037\000\0227\n\006params\030\002 \001(\0132!.CosmosContr" +
      "acts.juno.mint.ParamsB\004\310\336\037\000B9\n\tjuno.mint" +
      "Z,github.com/CosmosContracts/juno/x/mint" +
      "/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf3.GoGoProtos.getDescriptor(),
          juno.mint.Mint.getDescriptor(),
        });
    internal_static_CosmosContracts_juno_mint_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CosmosContracts_juno_mint_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CosmosContracts_juno_mint_GenesisState_descriptor,
        new java.lang.String[] { "Minter", "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf3.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf3.GoGoProtos.getDescriptor();
    juno.mint.Mint.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
