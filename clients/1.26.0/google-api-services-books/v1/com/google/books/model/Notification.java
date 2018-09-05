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

package com.google.books.model;

/**
 * Model definition for Notification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Notification extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * The list of crm experiment ids.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> crmExperimentIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("doc_id")
  private java.lang.String docId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("doc_type")
  private java.lang.String docType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("dont_show_notification")
  private java.lang.Boolean dontShowNotification;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_document_mature")
  private java.lang.Boolean isDocumentMature;

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notificationGroup;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("notification_type")
  private java.lang.String notificationType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("pcampaign_id")
  private java.lang.String pcampaignId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("show_notification_settings_action")
  private java.lang.Boolean showNotificationSettingsAction;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * @param body body or {@code null} for none
   */
  public Notification setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * The list of crm experiment ids.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getCrmExperimentIds() {
    return crmExperimentIds;
  }

  /**
   * The list of crm experiment ids.
   * @param crmExperimentIds crmExperimentIds or {@code null} for none
   */
  public Notification setCrmExperimentIds(java.util.List<java.lang.Long> crmExperimentIds) {
    this.crmExperimentIds = crmExperimentIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDocId() {
    return docId;
  }

  /**
   * @param docId docId or {@code null} for none
   */
  public Notification setDocId(java.lang.String docId) {
    this.docId = docId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDocType() {
    return docType;
  }

  /**
   * @param docType docType or {@code null} for none
   */
  public Notification setDocType(java.lang.String docType) {
    this.docType = docType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDontShowNotification() {
    return dontShowNotification;
  }

  /**
   * @param dontShowNotification dontShowNotification or {@code null} for none
   */
  public Notification setDontShowNotification(java.lang.Boolean dontShowNotification) {
    this.dontShowNotification = dontShowNotification;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * @param iconUrl iconUrl or {@code null} for none
   */
  public Notification setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDocumentMature() {
    return isDocumentMature;
  }

  /**
   * @param isDocumentMature isDocumentMature or {@code null} for none
   */
  public Notification setIsDocumentMature(java.lang.Boolean isDocumentMature) {
    this.isDocumentMature = isDocumentMature;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Notification setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNotificationGroup() {
    return notificationGroup;
  }

  /**
   * @param notificationGroup notificationGroup or {@code null} for none
   */
  public Notification setNotificationGroup(java.lang.String notificationGroup) {
    this.notificationGroup = notificationGroup;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNotificationType() {
    return notificationType;
  }

  /**
   * @param notificationType notificationType or {@code null} for none
   */
  public Notification setNotificationType(java.lang.String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPcampaignId() {
    return pcampaignId;
  }

  /**
   * @param pcampaignId pcampaignId or {@code null} for none
   */
  public Notification setPcampaignId(java.lang.String pcampaignId) {
    this.pcampaignId = pcampaignId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * @param reason reason or {@code null} for none
   */
  public Notification setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShowNotificationSettingsAction() {
    return showNotificationSettingsAction;
  }

  /**
   * @param showNotificationSettingsAction showNotificationSettingsAction or {@code null} for none
   */
  public Notification setShowNotificationSettingsAction(java.lang.Boolean showNotificationSettingsAction) {
    this.showNotificationSettingsAction = showNotificationSettingsAction;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetUrl() {
    return targetUrl;
  }

  /**
   * @param targetUrl targetUrl or {@code null} for none
   */
  public Notification setTargetUrl(java.lang.String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public Notification setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Notification set(String fieldName, Object value) {
    return (Notification) super.set(fieldName, value);
  }

  @Override
  public Notification clone() {
    return (Notification) super.clone();
  }

}
