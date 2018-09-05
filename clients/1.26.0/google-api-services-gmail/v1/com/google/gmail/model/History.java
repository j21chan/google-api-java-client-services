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

package com.google.gmail.model;

/**
 * A record of a change to the user's mailbox. Each history change may affect multiple messages in
 * multiple ways.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class History extends com.google.api.client.json.GenericJson {

  /**
   * The mailbox sequence ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Labels added to messages in this history record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistoryLabelAdded> labelsAdded;

  /**
   * Labels removed from messages in this history record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistoryLabelRemoved> labelsRemoved;

  /**
   * List of messages changed in this history record. The fields for specific change types, such as
   * messagesAdded may duplicate messages in this field. We recommend using the specific change-type
   * fields instead of this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Message> messages;

  /**
   * Messages added to the mailbox in this history record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistoryMessageAdded> messagesAdded;

  /**
   * Messages deleted (not Trashed) from the mailbox in this history record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistoryMessageDeleted> messagesDeleted;

  /**
   * The mailbox sequence ID.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * The mailbox sequence ID.
   * @param id id or {@code null} for none
   */
  public History setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Labels added to messages in this history record.
   * @return value or {@code null} for none
   */
  public java.util.List<HistoryLabelAdded> getLabelsAdded() {
    return labelsAdded;
  }

  /**
   * Labels added to messages in this history record.
   * @param labelsAdded labelsAdded or {@code null} for none
   */
  public History setLabelsAdded(java.util.List<HistoryLabelAdded> labelsAdded) {
    this.labelsAdded = labelsAdded;
    return this;
  }

  /**
   * Labels removed from messages in this history record.
   * @return value or {@code null} for none
   */
  public java.util.List<HistoryLabelRemoved> getLabelsRemoved() {
    return labelsRemoved;
  }

  /**
   * Labels removed from messages in this history record.
   * @param labelsRemoved labelsRemoved or {@code null} for none
   */
  public History setLabelsRemoved(java.util.List<HistoryLabelRemoved> labelsRemoved) {
    this.labelsRemoved = labelsRemoved;
    return this;
  }

  /**
   * List of messages changed in this history record. The fields for specific change types, such as
   * messagesAdded may duplicate messages in this field. We recommend using the specific change-type
   * fields instead of this.
   * @return value or {@code null} for none
   */
  public java.util.List<Message> getMessages() {
    return messages;
  }

  /**
   * List of messages changed in this history record. The fields for specific change types, such as
   * messagesAdded may duplicate messages in this field. We recommend using the specific change-type
   * fields instead of this.
   * @param messages messages or {@code null} for none
   */
  public History setMessages(java.util.List<Message> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Messages added to the mailbox in this history record.
   * @return value or {@code null} for none
   */
  public java.util.List<HistoryMessageAdded> getMessagesAdded() {
    return messagesAdded;
  }

  /**
   * Messages added to the mailbox in this history record.
   * @param messagesAdded messagesAdded or {@code null} for none
   */
  public History setMessagesAdded(java.util.List<HistoryMessageAdded> messagesAdded) {
    this.messagesAdded = messagesAdded;
    return this;
  }

  /**
   * Messages deleted (not Trashed) from the mailbox in this history record.
   * @return value or {@code null} for none
   */
  public java.util.List<HistoryMessageDeleted> getMessagesDeleted() {
    return messagesDeleted;
  }

  /**
   * Messages deleted (not Trashed) from the mailbox in this history record.
   * @param messagesDeleted messagesDeleted or {@code null} for none
   */
  public History setMessagesDeleted(java.util.List<HistoryMessageDeleted> messagesDeleted) {
    this.messagesDeleted = messagesDeleted;
    return this;
  }

  @Override
  public History set(String fieldName, Object value) {
    return (History) super.set(fieldName, value);
  }

  @Override
  public History clone() {
    return (History) super.clone();
  }

}
