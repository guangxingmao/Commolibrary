// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/token/v2/token.proto

package panacea.token.v2;

/**
 * <pre>
 * Token defines a token.
 * </pre>
 *
 * Protobuf type {@code panacea.token.v2.Token}
 */
public final class Token extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.token.v2.Token)
    TokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Token.newBuilder() to construct.
  private Token(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Token() {
    name_ = "";
    symbol_ = "";
    ownerAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Token();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Token(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            symbol_ = s;
            break;
          }
          case 26: {
            cosmos.base.v1beta1.CoinOuterClass.Coin.Builder subBuilder = null;
            if (totalSupply_ != null) {
              subBuilder = totalSupply_.toBuilder();
            }
            totalSupply_ = input.readMessage(cosmos.base.v1beta1.CoinOuterClass.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(totalSupply_);
              totalSupply_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            mintable_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            ownerAddress_ = s;
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
    return panacea.token.v2.TokenOuterClass.internal_static_panacea_token_v2_Token_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return panacea.token.v2.TokenOuterClass.internal_static_panacea_token_v2_Token_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            panacea.token.v2.Token.class, panacea.token.v2.Token.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SYMBOL_FIELD_NUMBER = 2;
  private volatile java.lang.Object symbol_;
  /**
   * <code>string symbol = 2;</code>
   * @return The symbol.
   */
  @java.lang.Override
  public java.lang.String getSymbol() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      symbol_ = s;
      return s;
    }
  }
  /**
   * <code>string symbol = 2;</code>
   * @return The bytes for symbol.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSymbolBytes() {
    java.lang.Object ref = symbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      symbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SUPPLY_FIELD_NUMBER = 3;
  private cosmos.base.v1beta1.CoinOuterClass.Coin totalSupply_;
  /**
   * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
   * @return Whether the totalSupply field is set.
   */
  @java.lang.Override
  public boolean hasTotalSupply() {
    return totalSupply_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
   * @return The totalSupply.
   */
  @java.lang.Override
  public cosmos.base.v1beta1.CoinOuterClass.Coin getTotalSupply() {
    return totalSupply_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : totalSupply_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getTotalSupplyOrBuilder() {
    return getTotalSupply();
  }

  public static final int MINTABLE_FIELD_NUMBER = 4;
  private boolean mintable_;
  /**
   * <code>bool mintable = 4;</code>
   * @return The mintable.
   */
  @java.lang.Override
  public boolean getMintable() {
    return mintable_;
  }

  public static final int OWNER_ADDRESS_FIELD_NUMBER = 5;
  private volatile java.lang.Object ownerAddress_;
  /**
   * <code>string owner_address = 5;</code>
   * @return The ownerAddress.
   */
  @java.lang.Override
  public java.lang.String getOwnerAddress() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ownerAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string owner_address = 5;</code>
   * @return The bytes for ownerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerAddressBytes() {
    java.lang.Object ref = ownerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ownerAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, symbol_);
    }
    if (totalSupply_ != null) {
      output.writeMessage(3, getTotalSupply());
    }
    if (mintable_ != false) {
      output.writeBool(4, mintable_);
    }
    if (!getOwnerAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, ownerAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, symbol_);
    }
    if (totalSupply_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTotalSupply());
    }
    if (mintable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, mintable_);
    }
    if (!getOwnerAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, ownerAddress_);
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
    if (!(obj instanceof panacea.token.v2.Token)) {
      return super.equals(obj);
    }
    panacea.token.v2.Token other = (panacea.token.v2.Token) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getSymbol()
        .equals(other.getSymbol())) return false;
    if (hasTotalSupply() != other.hasTotalSupply()) return false;
    if (hasTotalSupply()) {
      if (!getTotalSupply()
          .equals(other.getTotalSupply())) return false;
    }
    if (getMintable()
        != other.getMintable()) return false;
    if (!getOwnerAddress()
        .equals(other.getOwnerAddress())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
    hash = (53 * hash) + getSymbol().hashCode();
    if (hasTotalSupply()) {
      hash = (37 * hash) + TOTAL_SUPPLY_FIELD_NUMBER;
      hash = (53 * hash) + getTotalSupply().hashCode();
    }
    hash = (37 * hash) + MINTABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMintable());
    hash = (37 * hash) + OWNER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOwnerAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static panacea.token.v2.Token parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.token.v2.Token parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.token.v2.Token parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.token.v2.Token parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.token.v2.Token parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static panacea.token.v2.Token parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static panacea.token.v2.Token parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.token.v2.Token parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.token.v2.Token parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static panacea.token.v2.Token parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static panacea.token.v2.Token parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static panacea.token.v2.Token parseFrom(
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
  public static Builder newBuilder(panacea.token.v2.Token prototype) {
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
   * Token defines a token.
   * </pre>
   *
   * Protobuf type {@code panacea.token.v2.Token}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.token.v2.Token)
      panacea.token.v2.TokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return panacea.token.v2.TokenOuterClass.internal_static_panacea_token_v2_Token_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return panacea.token.v2.TokenOuterClass.internal_static_panacea_token_v2_Token_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              panacea.token.v2.Token.class, panacea.token.v2.Token.Builder.class);
    }

    // Construct using panacea.token.v2.Token.newBuilder()
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
      name_ = "";

      symbol_ = "";

      if (totalSupplyBuilder_ == null) {
        totalSupply_ = null;
      } else {
        totalSupply_ = null;
        totalSupplyBuilder_ = null;
      }
      mintable_ = false;

      ownerAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return panacea.token.v2.TokenOuterClass.internal_static_panacea_token_v2_Token_descriptor;
    }

    @java.lang.Override
    public panacea.token.v2.Token getDefaultInstanceForType() {
      return panacea.token.v2.Token.getDefaultInstance();
    }

    @java.lang.Override
    public panacea.token.v2.Token build() {
      panacea.token.v2.Token result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public panacea.token.v2.Token buildPartial() {
      panacea.token.v2.Token result = new panacea.token.v2.Token(this);
      result.name_ = name_;
      result.symbol_ = symbol_;
      if (totalSupplyBuilder_ == null) {
        result.totalSupply_ = totalSupply_;
      } else {
        result.totalSupply_ = totalSupplyBuilder_.build();
      }
      result.mintable_ = mintable_;
      result.ownerAddress_ = ownerAddress_;
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
      if (other instanceof panacea.token.v2.Token) {
        return mergeFrom((panacea.token.v2.Token)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(panacea.token.v2.Token other) {
      if (other == panacea.token.v2.Token.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getSymbol().isEmpty()) {
        symbol_ = other.symbol_;
        onChanged();
      }
      if (other.hasTotalSupply()) {
        mergeTotalSupply(other.getTotalSupply());
      }
      if (other.getMintable() != false) {
        setMintable(other.getMintable());
      }
      if (!other.getOwnerAddress().isEmpty()) {
        ownerAddress_ = other.ownerAddress_;
        onChanged();
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
      panacea.token.v2.Token parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (panacea.token.v2.Token) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object symbol_ = "";
    /**
     * <code>string symbol = 2;</code>
     * @return The symbol.
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string symbol = 2;</code>
     * @return The bytes for symbol.
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string symbol = 2;</code>
     * @param value The symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      symbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSymbol() {
      
      symbol_ = getDefaultInstance().getSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>string symbol = 2;</code>
     * @param value The bytes for symbol to set.
     * @return This builder for chaining.
     */
    public Builder setSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      symbol_ = value;
      onChanged();
      return this;
    }

    private cosmos.base.v1beta1.CoinOuterClass.Coin totalSupply_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> totalSupplyBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the totalSupply field is set.
     */
    public boolean hasTotalSupply() {
      return totalSupplyBuilder_ != null || totalSupply_ != null;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     * @return The totalSupply.
     */
    public cosmos.base.v1beta1.CoinOuterClass.Coin getTotalSupply() {
      if (totalSupplyBuilder_ == null) {
        return totalSupply_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : totalSupply_;
      } else {
        return totalSupplyBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setTotalSupply(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
      if (totalSupplyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        totalSupply_ = value;
        onChanged();
      } else {
        totalSupplyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder setTotalSupply(
        cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
      if (totalSupplyBuilder_ == null) {
        totalSupply_ = builderForValue.build();
        onChanged();
      } else {
        totalSupplyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder mergeTotalSupply(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
      if (totalSupplyBuilder_ == null) {
        if (totalSupply_ != null) {
          totalSupply_ =
            cosmos.base.v1beta1.CoinOuterClass.Coin.newBuilder(totalSupply_).mergeFrom(value).buildPartial();
        } else {
          totalSupply_ = value;
        }
        onChanged();
      } else {
        totalSupplyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     */
    public Builder clearTotalSupply() {
      if (totalSupplyBuilder_ == null) {
        totalSupply_ = null;
        onChanged();
      } else {
        totalSupply_ = null;
        totalSupplyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getTotalSupplyBuilder() {
      
      onChanged();
      return getTotalSupplyFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     */
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getTotalSupplyOrBuilder() {
      if (totalSupplyBuilder_ != null) {
        return totalSupplyBuilder_.getMessageOrBuilder();
      } else {
        return totalSupply_ == null ?
            cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : totalSupply_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin total_supply = 3 [(.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
        getTotalSupplyFieldBuilder() {
      if (totalSupplyBuilder_ == null) {
        totalSupplyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                getTotalSupply(),
                getParentForChildren(),
                isClean());
        totalSupply_ = null;
      }
      return totalSupplyBuilder_;
    }

    private boolean mintable_ ;
    /**
     * <code>bool mintable = 4;</code>
     * @return The mintable.
     */
    @java.lang.Override
    public boolean getMintable() {
      return mintable_;
    }
    /**
     * <code>bool mintable = 4;</code>
     * @param value The mintable to set.
     * @return This builder for chaining.
     */
    public Builder setMintable(boolean value) {
      
      mintable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mintable = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMintable() {
      
      mintable_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object ownerAddress_ = "";
    /**
     * <code>string owner_address = 5;</code>
     * @return The ownerAddress.
     */
    public java.lang.String getOwnerAddress() {
      java.lang.Object ref = ownerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ownerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner_address = 5;</code>
     * @return The bytes for ownerAddress.
     */
    public com.google.protobuf.ByteString
        getOwnerAddressBytes() {
      java.lang.Object ref = ownerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner_address = 5;</code>
     * @param value The ownerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ownerAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string owner_address = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOwnerAddress() {
      
      ownerAddress_ = getDefaultInstance().getOwnerAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string owner_address = 5;</code>
     * @param value The bytes for ownerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ownerAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:panacea.token.v2.Token)
  }

  // @@protoc_insertion_point(class_scope:panacea.token.v2.Token)
  private static final panacea.token.v2.Token DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new panacea.token.v2.Token();
  }

  public static panacea.token.v2.Token getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Token>
      PARSER = new com.google.protobuf.AbstractParser<Token>() {
    @java.lang.Override
    public Token parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Token(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Token> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Token> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public panacea.token.v2.Token getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

