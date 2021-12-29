// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/ed25519/keys.proto

package cosmos.crypto.ed25519;

public final class Keys {
  private Keys() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PubKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.crypto.ed25519.PubKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
     * @return The key.
     */
    com.google.protobuf.ByteString getKey();
  }
  /**
   * <pre>
   * PubKey is an ed25519 public key for handling Tendermint keys in SDK.
   * It's needed for Any serialization and SDK compatibility.
   * It must not be used in a non Tendermint key context because it doesn't implement
   * ADR-28. Nevertheless, you will like to use ed25519 in app user level
   * then you must create a new proto message and follow ADR-28 for Address construction.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.ed25519.PubKey}
   */
  public static final class PubKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.crypto.ed25519.PubKey)
      PubKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PubKey.newBuilder() to construct.
    private PubKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PubKey() {
      key_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PubKey();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PubKey(
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

              key_ = input.readBytes();
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
      return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.crypto.ed25519.Keys.PubKey.class, cosmos.crypto.ed25519.Keys.PubKey.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString key_;
    /**
     * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
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
      if (!key_.isEmpty()) {
        output.writeBytes(1, key_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!key_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, key_);
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
      if (!(obj instanceof cosmos.crypto.ed25519.Keys.PubKey)) {
        return super.equals(obj);
      }
      cosmos.crypto.ed25519.Keys.PubKey other = (cosmos.crypto.ed25519.Keys.PubKey) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.ed25519.Keys.PubKey parseFrom(
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
    public static Builder newBuilder(cosmos.crypto.ed25519.Keys.PubKey prototype) {
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
     * PubKey is an ed25519 public key for handling Tendermint keys in SDK.
     * It's needed for Any serialization and SDK compatibility.
     * It must not be used in a non Tendermint key context because it doesn't implement
     * ADR-28. Nevertheless, you will like to use ed25519 in app user level
     * then you must create a new proto message and follow ADR-28 for Address construction.
     * </pre>
     *
     * Protobuf type {@code cosmos.crypto.ed25519.PubKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.crypto.ed25519.PubKey)
        cosmos.crypto.ed25519.Keys.PubKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.crypto.ed25519.Keys.PubKey.class, cosmos.crypto.ed25519.Keys.PubKey.Builder.class);
      }

      // Construct using cosmos.crypto.ed25519.Keys.PubKey.newBuilder()
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
        key_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
      }

      @java.lang.Override
      public cosmos.crypto.ed25519.Keys.PubKey getDefaultInstanceForType() {
        return cosmos.crypto.ed25519.Keys.PubKey.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.crypto.ed25519.Keys.PubKey build() {
        cosmos.crypto.ed25519.Keys.PubKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.crypto.ed25519.Keys.PubKey buildPartial() {
        cosmos.crypto.ed25519.Keys.PubKey result = new cosmos.crypto.ed25519.Keys.PubKey(this);
        result.key_ = key_;
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
        if (other instanceof cosmos.crypto.ed25519.Keys.PubKey) {
          return mergeFrom((cosmos.crypto.ed25519.Keys.PubKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.crypto.ed25519.Keys.PubKey other) {
        if (other == cosmos.crypto.ed25519.Keys.PubKey.getDefaultInstance()) return this;
        if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
          setKey(other.getKey());
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
        cosmos.crypto.ed25519.Keys.PubKey parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cosmos.crypto.ed25519.Keys.PubKey) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
       * @return The key.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getKey() {
        return key_;
      }
      /**
       * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PublicKey"];</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = getDefaultInstance().getKey();
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


      // @@protoc_insertion_point(builder_scope:cosmos.crypto.ed25519.PubKey)
    }

    // @@protoc_insertion_point(class_scope:cosmos.crypto.ed25519.PubKey)
    private static final cosmos.crypto.ed25519.Keys.PubKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.crypto.ed25519.Keys.PubKey();
    }

    public static cosmos.crypto.ed25519.Keys.PubKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PubKey>
        PARSER = new com.google.protobuf.AbstractParser<PubKey>() {
      @java.lang.Override
      public PubKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PubKey(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PubKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PubKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.crypto.ed25519.Keys.PubKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface PrivKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.crypto.ed25519.PrivKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
     * @return The key.
     */
    com.google.protobuf.ByteString getKey();
  }
  /**
   * <pre>
   * Deprecated: PrivKey defines a ed25519 private key.
   * NOTE: ed25519 keys must not be used in SDK apps except in a tendermint validator context.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.ed25519.PrivKey}
   */
  public static final class PrivKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.crypto.ed25519.PrivKey)
      PrivKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PrivKey.newBuilder() to construct.
    private PrivKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PrivKey() {
      key_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PrivKey();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PrivKey(
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

              key_ = input.readBytes();
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
      return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.crypto.ed25519.Keys.PrivKey.class, cosmos.crypto.ed25519.Keys.PrivKey.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString key_;
    /**
     * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
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
      if (!key_.isEmpty()) {
        output.writeBytes(1, key_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!key_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, key_);
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
      if (!(obj instanceof cosmos.crypto.ed25519.Keys.PrivKey)) {
        return super.equals(obj);
      }
      cosmos.crypto.ed25519.Keys.PrivKey other = (cosmos.crypto.ed25519.Keys.PrivKey) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.ed25519.Keys.PrivKey parseFrom(
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
    public static Builder newBuilder(cosmos.crypto.ed25519.Keys.PrivKey prototype) {
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
     * Deprecated: PrivKey defines a ed25519 private key.
     * NOTE: ed25519 keys must not be used in SDK apps except in a tendermint validator context.
     * </pre>
     *
     * Protobuf type {@code cosmos.crypto.ed25519.PrivKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.crypto.ed25519.PrivKey)
        cosmos.crypto.ed25519.Keys.PrivKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.crypto.ed25519.Keys.PrivKey.class, cosmos.crypto.ed25519.Keys.PrivKey.Builder.class);
      }

      // Construct using cosmos.crypto.ed25519.Keys.PrivKey.newBuilder()
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
        key_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.crypto.ed25519.Keys.internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
      }

      @java.lang.Override
      public cosmos.crypto.ed25519.Keys.PrivKey getDefaultInstanceForType() {
        return cosmos.crypto.ed25519.Keys.PrivKey.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.crypto.ed25519.Keys.PrivKey build() {
        cosmos.crypto.ed25519.Keys.PrivKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.crypto.ed25519.Keys.PrivKey buildPartial() {
        cosmos.crypto.ed25519.Keys.PrivKey result = new cosmos.crypto.ed25519.Keys.PrivKey(this);
        result.key_ = key_;
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
        if (other instanceof cosmos.crypto.ed25519.Keys.PrivKey) {
          return mergeFrom((cosmos.crypto.ed25519.Keys.PrivKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.crypto.ed25519.Keys.PrivKey other) {
        if (other == cosmos.crypto.ed25519.Keys.PrivKey.getDefaultInstance()) return this;
        if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
          setKey(other.getKey());
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
        cosmos.crypto.ed25519.Keys.PrivKey parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cosmos.crypto.ed25519.Keys.PrivKey) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
       * @return The key.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getKey() {
        return key_;
      }
      /**
       * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes key = 1 [(.gogoproto.casttype) = "crypto/ed25519.PrivateKey"];</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = getDefaultInstance().getKey();
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


      // @@protoc_insertion_point(builder_scope:cosmos.crypto.ed25519.PrivKey)
    }

    // @@protoc_insertion_point(class_scope:cosmos.crypto.ed25519.PrivKey)
    private static final cosmos.crypto.ed25519.Keys.PrivKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.crypto.ed25519.Keys.PrivKey();
    }

    public static cosmos.crypto.ed25519.Keys.PrivKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PrivKey>
        PARSER = new com.google.protobuf.AbstractParser<PrivKey>() {
      @java.lang.Override
      public PrivKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PrivKey(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PrivKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PrivKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.crypto.ed25519.Keys.PrivKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/crypto/ed25519/keys.proto\022\025cosm" +
      "os.crypto.ed25519\032\024gogoproto/gogo.proto\"" +
      "9\n\006PubKey\022)\n\003key\030\001 \001(\014B\034\372\336\037\030crypto/ed255" +
      "19.PublicKey:\004\230\240\037\000\"5\n\007PrivKey\022*\n\003key\030\001 \001" +
      "(\014B\035\372\336\037\031crypto/ed25519.PrivateKeyB2Z0git" +
      "hub.com/cosmos/cosmos-sdk/crypto/keys/ed" +
      "25519b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf3.GoGoProtos.getDescriptor(),
        });
    internal_static_cosmos_crypto_ed25519_PubKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_ed25519_PubKey_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_cosmos_crypto_ed25519_PrivKey_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_ed25519_PrivKey_descriptor,
        new java.lang.String[] { "Key", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf3.GoGoProtos.casttype);
    registry.add(com.google.protobuf3.GoGoProtos.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf3.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
