// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/genesis.proto

package cosmos.evidence.v1beta1;

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
      // @@protoc_insertion_point(interface_extends:cosmos.evidence.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    java.util.List<com.google.protobuf3.Any> 
        getEvidenceList();
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    com.google.protobuf3.Any getEvidence(int index);
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    int getEvidenceCount();
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    java.util.List<? extends com.google.protobuf3.AnyOrBuilder> 
        getEvidenceOrBuilderList();
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    com.google.protobuf3.AnyOrBuilder getEvidenceOrBuilder(
        int index);
  }
  /**
   * <pre>
   * GenesisState defines the evidence module's genesis state.
   * </pre>
   *
   * Protobuf type {@code cosmos.evidence.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.evidence.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      evidence_ = java.util.Collections.emptyList();
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
                evidence_ = new java.util.ArrayList<com.google.protobuf3.Any>();
                mutable_bitField0_ |= 0x00000001;
              }
              evidence_.add(
                  input.readMessage(com.google.protobuf3.Any.parser(), extensionRegistry));
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
          evidence_ = java.util.Collections.unmodifiableList(evidence_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.evidence.v1beta1.Genesis.internal_static_cosmos_evidence_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.evidence.v1beta1.Genesis.internal_static_cosmos_evidence_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.evidence.v1beta1.Genesis.GenesisState.class, cosmos.evidence.v1beta1.Genesis.GenesisState.Builder.class);
    }

    public static final int EVIDENCE_FIELD_NUMBER = 1;
    private java.util.List<com.google.protobuf3.Any> evidence_;
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf3.Any> getEvidenceList() {
      return evidence_;
    }
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.google.protobuf3.AnyOrBuilder> 
        getEvidenceOrBuilderList() {
      return evidence_;
    }
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    @java.lang.Override
    public int getEvidenceCount() {
      return evidence_.size();
    }
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf3.Any getEvidence(int index) {
      return evidence_.get(index);
    }
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf2.Any evidence = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf3.AnyOrBuilder getEvidenceOrBuilder(
        int index) {
      return evidence_.get(index);
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
      for (int i = 0; i < evidence_.size(); i++) {
        output.writeMessage(1, evidence_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < evidence_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, evidence_.get(i));
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
      if (!(obj instanceof cosmos.evidence.v1beta1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      cosmos.evidence.v1beta1.Genesis.GenesisState other = (cosmos.evidence.v1beta1.Genesis.GenesisState) obj;

      if (!getEvidenceList()
          .equals(other.getEvidenceList())) return false;
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
      if (getEvidenceCount() > 0) {
        hash = (37 * hash) + EVIDENCE_FIELD_NUMBER;
        hash = (53 * hash) + getEvidenceList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.evidence.v1beta1.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(cosmos.evidence.v1beta1.Genesis.GenesisState prototype) {
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
     * GenesisState defines the evidence module's genesis state.
     * </pre>
     *
     * Protobuf type {@code cosmos.evidence.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.evidence.v1beta1.GenesisState)
        cosmos.evidence.v1beta1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.evidence.v1beta1.Genesis.internal_static_cosmos_evidence_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.evidence.v1beta1.Genesis.internal_static_cosmos_evidence_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.evidence.v1beta1.Genesis.GenesisState.class, cosmos.evidence.v1beta1.Genesis.GenesisState.Builder.class);
      }

      // Construct using cosmos.evidence.v1beta1.Genesis.GenesisState.newBuilder()
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
          getEvidenceFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (evidenceBuilder_ == null) {
          evidence_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          evidenceBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.evidence.v1beta1.Genesis.internal_static_cosmos_evidence_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public cosmos.evidence.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
        return cosmos.evidence.v1beta1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.evidence.v1beta1.Genesis.GenesisState build() {
        cosmos.evidence.v1beta1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.evidence.v1beta1.Genesis.GenesisState buildPartial() {
        cosmos.evidence.v1beta1.Genesis.GenesisState result = new cosmos.evidence.v1beta1.Genesis.GenesisState(this);
        int from_bitField0_ = bitField0_;
        if (evidenceBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            evidence_ = java.util.Collections.unmodifiableList(evidence_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.evidence_ = evidence_;
        } else {
          result.evidence_ = evidenceBuilder_.build();
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
        if (other instanceof cosmos.evidence.v1beta1.Genesis.GenesisState) {
          return mergeFrom((cosmos.evidence.v1beta1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.evidence.v1beta1.Genesis.GenesisState other) {
        if (other == cosmos.evidence.v1beta1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (evidenceBuilder_ == null) {
          if (!other.evidence_.isEmpty()) {
            if (evidence_.isEmpty()) {
              evidence_ = other.evidence_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEvidenceIsMutable();
              evidence_.addAll(other.evidence_);
            }
            onChanged();
          }
        } else {
          if (!other.evidence_.isEmpty()) {
            if (evidenceBuilder_.isEmpty()) {
              evidenceBuilder_.dispose();
              evidenceBuilder_ = null;
              evidence_ = other.evidence_;
              bitField0_ = (bitField0_ & ~0x00000001);
              evidenceBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEvidenceFieldBuilder() : null;
            } else {
              evidenceBuilder_.addAllMessages(other.evidence_);
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
        cosmos.evidence.v1beta1.Genesis.GenesisState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cosmos.evidence.v1beta1.Genesis.GenesisState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.google.protobuf3.Any> evidence_ =
        java.util.Collections.emptyList();
      private void ensureEvidenceIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          evidence_ = new java.util.ArrayList<com.google.protobuf3.Any>(evidence_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf3.Any, com.google.protobuf3.Any.Builder, com.google.protobuf3.AnyOrBuilder> evidenceBuilder_;

      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public java.util.List<com.google.protobuf3.Any> getEvidenceList() {
        if (evidenceBuilder_ == null) {
          return java.util.Collections.unmodifiableList(evidence_);
        } else {
          return evidenceBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public int getEvidenceCount() {
        if (evidenceBuilder_ == null) {
          return evidence_.size();
        } else {
          return evidenceBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public com.google.protobuf3.Any getEvidence(int index) {
        if (evidenceBuilder_ == null) {
          return evidence_.get(index);
        } else {
          return evidenceBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder setEvidence(
          int index, com.google.protobuf3.Any value) {
        if (evidenceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEvidenceIsMutable();
          evidence_.set(index, value);
          onChanged();
        } else {
          evidenceBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder setEvidence(
          int index, com.google.protobuf3.Any.Builder builderForValue) {
        if (evidenceBuilder_ == null) {
          ensureEvidenceIsMutable();
          evidence_.set(index, builderForValue.build());
          onChanged();
        } else {
          evidenceBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder addEvidence(com.google.protobuf3.Any value) {
        if (evidenceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEvidenceIsMutable();
          evidence_.add(value);
          onChanged();
        } else {
          evidenceBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder addEvidence(
          int index, com.google.protobuf3.Any value) {
        if (evidenceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEvidenceIsMutable();
          evidence_.add(index, value);
          onChanged();
        } else {
          evidenceBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder addEvidence(
          com.google.protobuf3.Any.Builder builderForValue) {
        if (evidenceBuilder_ == null) {
          ensureEvidenceIsMutable();
          evidence_.add(builderForValue.build());
          onChanged();
        } else {
          evidenceBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder addEvidence(
          int index, com.google.protobuf3.Any.Builder builderForValue) {
        if (evidenceBuilder_ == null) {
          ensureEvidenceIsMutable();
          evidence_.add(index, builderForValue.build());
          onChanged();
        } else {
          evidenceBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder addAllEvidence(
          java.lang.Iterable<? extends com.google.protobuf3.Any> values) {
        if (evidenceBuilder_ == null) {
          ensureEvidenceIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, evidence_);
          onChanged();
        } else {
          evidenceBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder clearEvidence() {
        if (evidenceBuilder_ == null) {
          evidence_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          evidenceBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public Builder removeEvidence(int index) {
        if (evidenceBuilder_ == null) {
          ensureEvidenceIsMutable();
          evidence_.remove(index);
          onChanged();
        } else {
          evidenceBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public com.google.protobuf3.Any.Builder getEvidenceBuilder(
          int index) {
        return getEvidenceFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public com.google.protobuf3.AnyOrBuilder getEvidenceOrBuilder(
          int index) {
        if (evidenceBuilder_ == null) {
          return evidence_.get(index);  } else {
          return evidenceBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public java.util.List<? extends com.google.protobuf3.AnyOrBuilder> 
           getEvidenceOrBuilderList() {
        if (evidenceBuilder_ != null) {
          return evidenceBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(evidence_);
        }
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public com.google.protobuf3.Any.Builder addEvidenceBuilder() {
        return getEvidenceFieldBuilder().addBuilder(
            com.google.protobuf3.Any.getDefaultInstance());
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public com.google.protobuf3.Any.Builder addEvidenceBuilder(
          int index) {
        return getEvidenceFieldBuilder().addBuilder(
            index, com.google.protobuf3.Any.getDefaultInstance());
      }
      /**
       * <pre>
       * evidence defines all the evidence at genesis.
       * </pre>
       *
       * <code>repeated .google.protobuf2.Any evidence = 1;</code>
       */
      public java.util.List<com.google.protobuf3.Any.Builder> 
           getEvidenceBuilderList() {
        return getEvidenceFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf3.Any, com.google.protobuf3.Any.Builder, com.google.protobuf3.AnyOrBuilder> 
          getEvidenceFieldBuilder() {
        if (evidenceBuilder_ == null) {
          evidenceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.google.protobuf3.Any, com.google.protobuf3.Any.Builder, com.google.protobuf3.AnyOrBuilder>(
                  evidence_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          evidence_ = null;
        }
        return evidenceBuilder_;
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


      // @@protoc_insertion_point(builder_scope:cosmos.evidence.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:cosmos.evidence.v1beta1.GenesisState)
    private static final cosmos.evidence.v1beta1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.evidence.v1beta1.Genesis.GenesisState();
    }

    public static cosmos.evidence.v1beta1.Genesis.GenesisState getDefaultInstance() {
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
    public cosmos.evidence.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%cosmos/evidence/v1beta1/genesis.proto\022" +
      "\027cosmos.evidence.v1beta1\032\032google/protobu" +
      "f2/any.proto\"7\n\014GenesisState\022\'\n\010evidence" +
      "\030\001 \003(\0132\025.google.protobuf2.AnyB/Z-github." +
      "com/cosmos/cosmos-sdk/x/evidence/typesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf3.AnyProto.getDescriptor(),
        });
    internal_static_cosmos_evidence_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_evidence_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Evidence", });
    com.google.protobuf3.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
