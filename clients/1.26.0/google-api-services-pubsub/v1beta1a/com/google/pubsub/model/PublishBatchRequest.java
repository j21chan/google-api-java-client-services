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

package com.google.pubsub.model;

/**
 * Request for the PublishBatch method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PublishBatchRequest extends com.google.api.client.json.GenericJson {

  /**
   * The messages to publish.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PubsubMessage> messages;

  static {
    // hack to force ProGuard to consider PubsubMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PubsubMessage.class);
  }

  /**
   * The messages in the request will be published on this topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * The messages to publish.
   * @return value or {@code null} for none
   */
  public java.util.List<PubsubMessage> getMessages() {
    return messages;
  }

  /**
   * The messages to publish.
   * @param messages messages or {@code null} for none
   */
  public PublishBatchRequest setMessages(java.util.List<PubsubMessage> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * The messages in the request will be published on this topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * The messages in the request will be published on this topic.
   * @param topic topic or {@code null} for none
   */
  public PublishBatchRequest setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  @Override
  public PublishBatchRequest set(String fieldName, Object value) {
    return (PublishBatchRequest) super.set(fieldName, value);
  }

  @Override
  public PublishBatchRequest clone() {
    return (PublishBatchRequest) super.clone();
  }

}
