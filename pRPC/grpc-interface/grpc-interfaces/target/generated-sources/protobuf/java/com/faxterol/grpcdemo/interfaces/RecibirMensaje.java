// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat-service.proto

package com.faxterol.grpcdemo.interfaces;

/**
 * <pre>
 *Objeto de tipo mensaje, es lo que va a responder un método.
 * </pre>
 *
 * Protobuf type {@code com.faxterol.grpcdemo.interfaces.RecibirMensaje}
 */
public final class RecibirMensaje extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.faxterol.grpcdemo.interfaces.RecibirMensaje)
    RecibirMensajeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecibirMensaje.newBuilder() to construct.
  private RecibirMensaje(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecibirMensaje() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecibirMensaje();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecibirMensaje(
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
          case 8: {

            from_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
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
    return com.faxterol.grpcdemo.interfaces.ChatServiceProto.internal_static_com_faxterol_grpcdemo_interfaces_RecibirMensaje_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.faxterol.grpcdemo.interfaces.ChatServiceProto.internal_static_com_faxterol_grpcdemo_interfaces_RecibirMensaje_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.faxterol.grpcdemo.interfaces.RecibirMensaje.class, com.faxterol.grpcdemo.interfaces.RecibirMensaje.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  private int from_;
  /**
   * <code>uint32 from = 1;</code>
   * @return The from.
   */
  @java.lang.Override
  public int getFrom() {
    return from_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (from_ != 0) {
      output.writeUInt32(1, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (from_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
    if (!(obj instanceof com.faxterol.grpcdemo.interfaces.RecibirMensaje)) {
      return super.equals(obj);
    }
    com.faxterol.grpcdemo.interfaces.RecibirMensaje other = (com.faxterol.grpcdemo.interfaces.RecibirMensaje) obj;

    if (getFrom()
        != other.getFrom()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje parseFrom(
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
  public static Builder newBuilder(com.faxterol.grpcdemo.interfaces.RecibirMensaje prototype) {
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
   *Objeto de tipo mensaje, es lo que va a responder un método.
   * </pre>
   *
   * Protobuf type {@code com.faxterol.grpcdemo.interfaces.RecibirMensaje}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.faxterol.grpcdemo.interfaces.RecibirMensaje)
      com.faxterol.grpcdemo.interfaces.RecibirMensajeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.faxterol.grpcdemo.interfaces.ChatServiceProto.internal_static_com_faxterol_grpcdemo_interfaces_RecibirMensaje_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.faxterol.grpcdemo.interfaces.ChatServiceProto.internal_static_com_faxterol_grpcdemo_interfaces_RecibirMensaje_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.faxterol.grpcdemo.interfaces.RecibirMensaje.class, com.faxterol.grpcdemo.interfaces.RecibirMensaje.Builder.class);
    }

    // Construct using com.faxterol.grpcdemo.interfaces.RecibirMensaje.newBuilder()
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
      from_ = 0;

      message_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.faxterol.grpcdemo.interfaces.ChatServiceProto.internal_static_com_faxterol_grpcdemo_interfaces_RecibirMensaje_descriptor;
    }

    @java.lang.Override
    public com.faxterol.grpcdemo.interfaces.RecibirMensaje getDefaultInstanceForType() {
      return com.faxterol.grpcdemo.interfaces.RecibirMensaje.getDefaultInstance();
    }

    @java.lang.Override
    public com.faxterol.grpcdemo.interfaces.RecibirMensaje build() {
      com.faxterol.grpcdemo.interfaces.RecibirMensaje result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.faxterol.grpcdemo.interfaces.RecibirMensaje buildPartial() {
      com.faxterol.grpcdemo.interfaces.RecibirMensaje result = new com.faxterol.grpcdemo.interfaces.RecibirMensaje(this);
      result.from_ = from_;
      result.message_ = message_;
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
      if (other instanceof com.faxterol.grpcdemo.interfaces.RecibirMensaje) {
        return mergeFrom((com.faxterol.grpcdemo.interfaces.RecibirMensaje)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.faxterol.grpcdemo.interfaces.RecibirMensaje other) {
      if (other == com.faxterol.grpcdemo.interfaces.RecibirMensaje.getDefaultInstance()) return this;
      if (other.getFrom() != 0) {
        setFrom(other.getFrom());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
      com.faxterol.grpcdemo.interfaces.RecibirMensaje parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.faxterol.grpcdemo.interfaces.RecibirMensaje) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int from_ ;
    /**
     * <code>uint32 from = 1;</code>
     * @return The from.
     */
    @java.lang.Override
    public int getFrom() {
      return from_;
    }
    /**
     * <code>uint32 from = 1;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(int value) {
      
      from_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 from = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      
      from_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.faxterol.grpcdemo.interfaces.RecibirMensaje)
  }

  // @@protoc_insertion_point(class_scope:com.faxterol.grpcdemo.interfaces.RecibirMensaje)
  private static final com.faxterol.grpcdemo.interfaces.RecibirMensaje DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.faxterol.grpcdemo.interfaces.RecibirMensaje();
  }

  public static com.faxterol.grpcdemo.interfaces.RecibirMensaje getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecibirMensaje>
      PARSER = new com.google.protobuf.AbstractParser<RecibirMensaje>() {
    @java.lang.Override
    public RecibirMensaje parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecibirMensaje(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecibirMensaje> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecibirMensaje> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.faxterol.grpcdemo.interfaces.RecibirMensaje getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

