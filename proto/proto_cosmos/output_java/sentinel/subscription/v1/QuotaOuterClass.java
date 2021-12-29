// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v1/quota.proto

package sentinel.subscription.v1;

public final class QuotaOuterClass {
  private QuotaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuotaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.subscription.v1.Quota)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    java.lang.String getAddress();
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The allocated.
     */
    java.lang.String getAllocated();
    /**
     * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for allocated.
     */
    com.google.protobuf.ByteString
        getAllocatedBytes();

    /**
     * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The consumed.
     */
    java.lang.String getConsumed();
    /**
     * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for consumed.
     */
    com.google.protobuf.ByteString
        getConsumedBytes();
  }
  /**
   * Protobuf type {@code sentinel.subscription.v1.Quota}
   */
  public static final class Quota extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.subscription.v1.Quota)
      QuotaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Quota.newBuilder() to construct.
    private Quota(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Quota() {
      address_ = "";
      allocated_ = "";
      consumed_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Quota();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Quota(
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

              address_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              allocated_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              consumed_ = s;
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
      return sentinel.subscription.v1.QuotaOuterClass.internal_static_sentinel_subscription_v1_Quota_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sentinel.subscription.v1.QuotaOuterClass.internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sentinel.subscription.v1.QuotaOuterClass.Quota.class, sentinel.subscription.v1.QuotaOuterClass.Quota.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private volatile java.lang.Object address_;
    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOCATED_FIELD_NUMBER = 2;
    private volatile java.lang.Object allocated_;
    /**
     * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The allocated.
     */
    @java.lang.Override
    public java.lang.String getAllocated() {
      java.lang.Object ref = allocated_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        allocated_ = s;
        return s;
      }
    }
    /**
     * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for allocated.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAllocatedBytes() {
      java.lang.Object ref = allocated_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        allocated_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONSUMED_FIELD_NUMBER = 3;
    private volatile java.lang.Object consumed_;
    /**
     * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The consumed.
     */
    @java.lang.Override
    public java.lang.String getConsumed() {
      java.lang.Object ref = consumed_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumed_ = s;
        return s;
      }
    }
    /**
     * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for consumed.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getConsumedBytes() {
      java.lang.Object ref = consumed_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consumed_ = b;
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
      if (!getAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
      }
      if (!getAllocatedBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, allocated_);
      }
      if (!getConsumedBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, consumed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
      }
      if (!getAllocatedBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, allocated_);
      }
      if (!getConsumedBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, consumed_);
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
      if (!(obj instanceof sentinel.subscription.v1.QuotaOuterClass.Quota)) {
        return super.equals(obj);
      }
      sentinel.subscription.v1.QuotaOuterClass.Quota other = (sentinel.subscription.v1.QuotaOuterClass.Quota) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!getAllocated()
          .equals(other.getAllocated())) return false;
      if (!getConsumed()
          .equals(other.getConsumed())) return false;
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
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + ALLOCATED_FIELD_NUMBER;
      hash = (53 * hash) + getAllocated().hashCode();
      hash = (37 * hash) + CONSUMED_FIELD_NUMBER;
      hash = (53 * hash) + getConsumed().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.subscription.v1.QuotaOuterClass.Quota parseFrom(
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
    public static Builder newBuilder(sentinel.subscription.v1.QuotaOuterClass.Quota prototype) {
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
     * Protobuf type {@code sentinel.subscription.v1.Quota}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.subscription.v1.Quota)
        sentinel.subscription.v1.QuotaOuterClass.QuotaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sentinel.subscription.v1.QuotaOuterClass.internal_static_sentinel_subscription_v1_Quota_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sentinel.subscription.v1.QuotaOuterClass.internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sentinel.subscription.v1.QuotaOuterClass.Quota.class, sentinel.subscription.v1.QuotaOuterClass.Quota.Builder.class);
      }

      // Construct using sentinel.subscription.v1.QuotaOuterClass.Quota.newBuilder()
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
        address_ = "";

        allocated_ = "";

        consumed_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sentinel.subscription.v1.QuotaOuterClass.internal_static_sentinel_subscription_v1_Quota_descriptor;
      }

      @java.lang.Override
      public sentinel.subscription.v1.QuotaOuterClass.Quota getDefaultInstanceForType() {
        return sentinel.subscription.v1.QuotaOuterClass.Quota.getDefaultInstance();
      }

      @java.lang.Override
      public sentinel.subscription.v1.QuotaOuterClass.Quota build() {
        sentinel.subscription.v1.QuotaOuterClass.Quota result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sentinel.subscription.v1.QuotaOuterClass.Quota buildPartial() {
        sentinel.subscription.v1.QuotaOuterClass.Quota result = new sentinel.subscription.v1.QuotaOuterClass.Quota(this);
        result.address_ = address_;
        result.allocated_ = allocated_;
        result.consumed_ = consumed_;
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
        if (other instanceof sentinel.subscription.v1.QuotaOuterClass.Quota) {
          return mergeFrom((sentinel.subscription.v1.QuotaOuterClass.Quota)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sentinel.subscription.v1.QuotaOuterClass.Quota other) {
        if (other == sentinel.subscription.v1.QuotaOuterClass.Quota.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          onChanged();
        }
        if (!other.getAllocated().isEmpty()) {
          allocated_ = other.allocated_;
          onChanged();
        }
        if (!other.getConsumed().isEmpty()) {
          consumed_ = other.consumed_;
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
        sentinel.subscription.v1.QuotaOuterClass.Quota parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sentinel.subscription.v1.QuotaOuterClass.Quota) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object address_ = "";
      /**
       * <code>string address = 1;</code>
       * @return The address.
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string address = 1;</code>
       * @return The bytes for address.
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string address = 1;</code>
       * @param value The address to set.
       * @return This builder for chaining.
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <code>string address = 1;</code>
       * @param value The bytes for address to set.
       * @return This builder for chaining.
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        address_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object allocated_ = "";
      /**
       * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The allocated.
       */
      public java.lang.String getAllocated() {
        java.lang.Object ref = allocated_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          allocated_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for allocated.
       */
      public com.google.protobuf.ByteString
          getAllocatedBytes() {
        java.lang.Object ref = allocated_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          allocated_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The allocated to set.
       * @return This builder for chaining.
       */
      public Builder setAllocated(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        allocated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocated() {
        
        allocated_ = getDefaultInstance().getAllocated();
        onChanged();
        return this;
      }
      /**
       * <code>string allocated = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for allocated to set.
       * @return This builder for chaining.
       */
      public Builder setAllocatedBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        allocated_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object consumed_ = "";
      /**
       * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The consumed.
       */
      public java.lang.String getConsumed() {
        java.lang.Object ref = consumed_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          consumed_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return The bytes for consumed.
       */
      public com.google.protobuf.ByteString
          getConsumedBytes() {
        java.lang.Object ref = consumed_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          consumed_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The consumed to set.
       * @return This builder for chaining.
       */
      public Builder setConsumed(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        consumed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @return This builder for chaining.
       */
      public Builder clearConsumed() {
        
        consumed_ = getDefaultInstance().getConsumed();
        onChanged();
        return this;
      }
      /**
       * <code>string consumed = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
       * @param value The bytes for consumed to set.
       * @return This builder for chaining.
       */
      public Builder setConsumedBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        consumed_ = value;
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


      // @@protoc_insertion_point(builder_scope:sentinel.subscription.v1.Quota)
    }

    // @@protoc_insertion_point(class_scope:sentinel.subscription.v1.Quota)
    private static final sentinel.subscription.v1.QuotaOuterClass.Quota DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sentinel.subscription.v1.QuotaOuterClass.Quota();
    }

    public static sentinel.subscription.v1.QuotaOuterClass.Quota getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Quota>
        PARSER = new com.google.protobuf.AbstractParser<Quota>() {
      @java.lang.Override
      public Quota parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Quota(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Quota> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Quota> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sentinel.subscription.v1.QuotaOuterClass.Quota getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_subscription_v1_Quota_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$sentinel/subscription/v1/quota.proto\022\030" +
      "sentinel.subscription.v1\032\024gogoproto/gogo" +
      ".proto\"\235\001\n\005Quota\022\017\n\007address\030\001 \001(\t\022A\n\tall" +
      "ocated\030\002 \001(\tB.\332\336\037&github.com/cosmos/cosm" +
      "os-sdk/types.Int\310\336\037\000\022@\n\010consumed\030\003 \001(\tB." +
      "\332\336\037&github.com/cosmos/cosmos-sdk/types.I" +
      "nt\310\336\037\000B?Z5github.com/sentinel-official/h" +
      "ub/x/subscription/types\250\342\036\000\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf3.GoGoProtos.getDescriptor(),
        });
    internal_static_sentinel_subscription_v1_Quota_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_subscription_v1_Quota_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_subscription_v1_Quota_descriptor,
        new java.lang.String[] { "Address", "Allocated", "Consumed", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf3.GoGoProtos.customtype);
    registry.add(com.google.protobuf3.GoGoProtos.equalAll);
    registry.add(com.google.protobuf3.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf3.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf3.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
