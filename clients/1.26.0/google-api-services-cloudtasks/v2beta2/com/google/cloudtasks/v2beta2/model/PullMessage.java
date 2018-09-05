/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.cloudtasks.v2beta2.model;

/**
 * The pull message contains data that can be used by the caller of LeaseTasks to process the task.
 *
 * This proto can only be used for tasks in a queue which has pull_target set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PullMessage extends com.google.api.client.json.GenericJson {

  /**
   * A data payload consumed by the worker to execute the task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * The task's tag.
   *
   * Tags allow similar tasks to be processed in a batch. If you label tasks with a tag, your worker
   * can lease tasks with the same tag using filter. For example, if you want to aggregate the
   * events associated with a specific user once a day, you could tag tasks with the user ID.
   *
   * The task's tag can only be set when the task is created.
   *
   * The tag must be less than 500 characters.
   *
   * SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.go
   * ogle.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.ht
   * ml#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
   * encoded, the tag will be empty when the task is returned by Cloud Tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * A data payload consumed by the worker to execute the task.
   * @see #decodePayload()
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * A data payload consumed by the worker to execute the task.
   * @see #getPayload()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePayload() {
    return com.google.api.client.util.Base64.decodeBase64(payload);
  }

  /**
   * A data payload consumed by the worker to execute the task.
   * @see #encodePayload()
   * @param payload payload or {@code null} for none
   */
  public PullMessage setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * A data payload consumed by the worker to execute the task.
   * @see #setPayload()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PullMessage encodePayload(byte[] payload) {
    this.payload = com.google.api.client.util.Base64.encodeBase64URLSafeString(payload);
    return this;
  }

  /**
   * The task's tag.
   *
   * Tags allow similar tasks to be processed in a batch. If you label tasks with a tag, your worker
   * can lease tasks with the same tag using filter. For example, if you want to aggregate the
   * events associated with a specific user once a day, you could tag tasks with the user ID.
   *
   * The task's tag can only be set when the task is created.
   *
   * The tag must be less than 500 characters.
   *
   * SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.go
   * ogle.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.ht
   * ml#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
   * encoded, the tag will be empty when the task is returned by Cloud Tasks.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * The task's tag.
   *
   * Tags allow similar tasks to be processed in a batch. If you label tasks with a tag, your worker
   * can lease tasks with the same tag using filter. For example, if you want to aggregate the
   * events associated with a specific user once a day, you could tag tasks with the user ID.
   *
   * The task's tag can only be set when the task is created.
   *
   * The tag must be less than 500 characters.
   *
   * SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.go
   * ogle.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.ht
   * ml#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn't UTF-8
   * encoded, the tag will be empty when the task is returned by Cloud Tasks.
   * @param tag tag or {@code null} for none
   */
  public PullMessage setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  @Override
  public PullMessage set(String fieldName, Object value) {
    return (PullMessage) super.set(fieldName, value);
  }

  @Override
  public PullMessage clone() {
    return (PullMessage) super.clone();
  }

}
