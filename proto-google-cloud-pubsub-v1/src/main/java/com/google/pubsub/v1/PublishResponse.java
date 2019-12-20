/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * Response for the `Publish` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.PublishResponse}
 */
public final class PublishResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.PublishResponse)
    PublishResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PublishResponse.newBuilder() to construct.
  private PublishResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PublishResponse() {
    messageIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PublishResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PublishResponse(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                messageIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              messageIds_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        messageIds_ = messageIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_PublishResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_PublishResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.PublishResponse.class,
            com.google.pubsub.v1.PublishResponse.Builder.class);
  }

  public static final int MESSAGE_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList messageIds_;
  /**
   *
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1;</code>
   *
   * @return A list containing the messageIds.
   */
  public com.google.protobuf.ProtocolStringList getMessageIdsList() {
    return messageIds_;
  }
  /**
   *
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1;</code>
   *
   * @return The count of messageIds.
   */
  public int getMessageIdsCount() {
    return messageIds_.size();
  }
  /**
   *
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The messageIds at the given index.
   */
  public java.lang.String getMessageIds(int index) {
    return messageIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The server-assigned ID of each published message, in the same order as
   * the messages in the request. IDs are guaranteed to be unique within
   * the topic.
   * </pre>
   *
   * <code>repeated string message_ids = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the messageIds at the given index.
   */
  public com.google.protobuf.ByteString getMessageIdsBytes(int index) {
    return messageIds_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < messageIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageIds_.getRaw(i));
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
      for (int i = 0; i < messageIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(messageIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessageIdsList().size();
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
    if (!(obj instanceof com.google.pubsub.v1.PublishResponse)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.PublishResponse other = (com.google.pubsub.v1.PublishResponse) obj;

    if (!getMessageIdsList().equals(other.getMessageIdsList())) return false;
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
    if (getMessageIdsCount() > 0) {
      hash = (37 * hash) + MESSAGE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getMessageIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PublishResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PublishResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.PublishResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the `Publish` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.PublishResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.PublishResponse)
      com.google.pubsub.v1.PublishResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PublishResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PublishResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.PublishResponse.class,
              com.google.pubsub.v1.PublishResponse.Builder.class);
    }

    // Construct using com.google.pubsub.v1.PublishResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      messageIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PublishResponse_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PublishResponse getDefaultInstanceForType() {
      return com.google.pubsub.v1.PublishResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.PublishResponse build() {
      com.google.pubsub.v1.PublishResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PublishResponse buildPartial() {
      com.google.pubsub.v1.PublishResponse result = new com.google.pubsub.v1.PublishResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        messageIds_ = messageIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.messageIds_ = messageIds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.PublishResponse) {
        return mergeFrom((com.google.pubsub.v1.PublishResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.PublishResponse other) {
      if (other == com.google.pubsub.v1.PublishResponse.getDefaultInstance()) return this;
      if (!other.messageIds_.isEmpty()) {
        if (messageIds_.isEmpty()) {
          messageIds_ = other.messageIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessageIdsIsMutable();
          messageIds_.addAll(other.messageIds_);
        }
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
      com.google.pubsub.v1.PublishResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.PublishResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList messageIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureMessageIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messageIds_ = new com.google.protobuf.LazyStringArrayList(messageIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @return A list containing the messageIds.
     */
    public com.google.protobuf.ProtocolStringList getMessageIdsList() {
      return messageIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @return The count of messageIds.
     */
    public int getMessageIdsCount() {
      return messageIds_.size();
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The messageIds at the given index.
     */
    public java.lang.String getMessageIds(int index) {
      return messageIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the messageIds at the given index.
     */
    public com.google.protobuf.ByteString getMessageIdsBytes(int index) {
      return messageIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The messageIds to set.
     * @return This builder for chaining.
     */
    public Builder setMessageIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMessageIdsIsMutable();
      messageIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @param value The messageIds to add.
     * @return This builder for chaining.
     */
    public Builder addMessageIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMessageIdsIsMutable();
      messageIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @param values The messageIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllMessageIds(java.lang.Iterable<java.lang.String> values) {
      ensureMessageIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, messageIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessageIds() {
      messageIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The server-assigned ID of each published message, in the same order as
     * the messages in the request. IDs are guaranteed to be unique within
     * the topic.
     * </pre>
     *
     * <code>repeated string message_ids = 1;</code>
     *
     * @param value The bytes of the messageIds to add.
     * @return This builder for chaining.
     */
    public Builder addMessageIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMessageIdsIsMutable();
      messageIds_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.PublishResponse)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.PublishResponse)
  private static final com.google.pubsub.v1.PublishResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.PublishResponse();
  }

  public static com.google.pubsub.v1.PublishResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishResponse> PARSER =
      new com.google.protobuf.AbstractParser<PublishResponse>() {
        @java.lang.Override
        public PublishResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PublishResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PublishResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.PublishResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
