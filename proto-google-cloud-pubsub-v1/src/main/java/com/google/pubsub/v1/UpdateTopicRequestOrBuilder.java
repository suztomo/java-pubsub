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

public interface UpdateTopicRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.UpdateTopicRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   *
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   *
   *
   * <pre>
   * The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   *
   * @return The topic.
   */
  com.google.pubsub.v1.Topic getTopic();
  /**
   *
   *
   * <pre>
   * The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1;</code>
   */
  com.google.pubsub.v1.TopicOrBuilder getTopicOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided topic to update. Must be specified
   * and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" then the new value will be determined based on the
   * policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided topic to update. Must be specified
   * and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" then the new value will be determined based on the
   * policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided topic to update. Must be specified
   * and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" then the new value will be determined based on the
   * policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
