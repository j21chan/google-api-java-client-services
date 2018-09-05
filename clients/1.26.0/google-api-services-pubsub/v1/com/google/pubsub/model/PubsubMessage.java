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
 * A message that is published by publishers and consumed by subscribers. The message must contain
 * either a non-empty data field or at least one attribute.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubsubMessage extends com.google.api.client.json.GenericJson {

  /**
   * Optional attributes for this message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributes;

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * ID of this message, assigned by the server when the message is published. Guaranteed to be
   * unique within the topic. This value may be read by a subscriber that receives a `PubsubMessage`
   * via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish`
   * call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageId;

  /**
   * The time at which the message was published, populated by the server when it receives the
   * `Publish` call. It must not be populated by the publisher in a `Publish` call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String publishTime;

  /**
   * Optional attributes for this message.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Optional attributes for this message.
   * @param attributes attributes or {@code null} for none
   */
  public PubsubMessage setAttributes(java.util.Map<String, java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public PubsubMessage setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * The message data field. If this field is empty, the message must contain at least one
   * attribute.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PubsubMessage encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * ID of this message, assigned by the server when the message is published. Guaranteed to be
   * unique within the topic. This value may be read by a subscriber that receives a `PubsubMessage`
   * via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish`
   * call.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageId() {
    return messageId;
  }

  /**
   * ID of this message, assigned by the server when the message is published. Guaranteed to be
   * unique within the topic. This value may be read by a subscriber that receives a `PubsubMessage`
   * via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish`
   * call.
   * @param messageId messageId or {@code null} for none
   */
  public PubsubMessage setMessageId(java.lang.String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The time at which the message was published, populated by the server when it receives the
   * `Publish` call. It must not be populated by the publisher in a `Publish` call.
   * @return value or {@code null} for none
   */
  public String getPublishTime() {
    return publishTime;
  }

  /**
   * The time at which the message was published, populated by the server when it receives the
   * `Publish` call. It must not be populated by the publisher in a `Publish` call.
   * @param publishTime publishTime or {@code null} for none
   */
  public PubsubMessage setPublishTime(String publishTime) {
    this.publishTime = publishTime;
    return this;
  }

  @Override
  public PubsubMessage set(String fieldName, Object value) {
    return (PubsubMessage) super.set(fieldName, value);
  }

  @Override
  public PubsubMessage clone() {
    return (PubsubMessage) super.clone();
  }

}
