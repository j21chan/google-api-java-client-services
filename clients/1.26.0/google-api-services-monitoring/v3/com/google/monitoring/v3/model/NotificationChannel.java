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

package com.google.monitoring.v3.model;

/**
 * A NotificationChannel is a medium through which an alert is delivered when a policy violation is
 * detected. Examples of channels include email, SMS, and third-party messaging applications. Fields
 * containing sensitive information like authentication tokens or contact info are only partially
 * populated on retrieval.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotificationChannel extends com.google.api.client.json.GenericJson {

  /**
   * An optional human-readable description of this notification channel. This description may
   * provide additional details, beyond the display name, for the channel. This may not exceeed 1024
   * Unicode characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * An optional human-readable name for this notification channel. It is recommended that you
   * specify a non-empty and unique name in order to make it easier to identify the channels in your
   * project, though this is not enforced. The display name is limited to 512 Unicode characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Whether notifications are forwarded to the described channel. This makes it possible to disable
   * delivery of notifications to a particular channel without removing the channel from all
   * alerting policies that reference the channel. This is a more convenient approach when the
   * change is temporary and you want to receive notifications from the same set of alerting
   * policies on the channel at some point in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Configuration fields that define the channel and its behavior. The permissible and required
   * labels are specified in the NotificationChannelDescriptor.labels of the
   * NotificationChannelDescriptor corresponding to the type field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The full REST resource name for this channel. The syntax is:
   * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically
   * assigned by the server on creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The type of the notification channel. This field matches the value of the
   * NotificationChannelDescriptor.type field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * User-supplied key/value data that does not need to conform to the corresponding
   * NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be
   * used for organizing and identifying the NotificationChannel objects.The field can contain up to
   * 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is
   * smaller. Labels and values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> userLabels;

  /**
   * Indicates whether this channel has been verified or not. On a ListNotificationChannels or
   * GetNotificationChannel operation, this field is expected to be populated.If the value is
   * UNVERIFIED, then it indicates that the channel is non-functioning (it both requires
   * verification and lacks verification); otherwise, it is assumed that the channel works.If the
   * channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does
   * not require verification or that this specific channel has been exempted from verification
   * because it was created prior to verification being required for channels of this type.This
   * field cannot be modified using a standard UpdateNotificationChannel operation. To change the
   * value of this field, you must call VerifyNotificationChannel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verificationStatus;

  /**
   * An optional human-readable description of this notification channel. This description may
   * provide additional details, beyond the display name, for the channel. This may not exceeed 1024
   * Unicode characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional human-readable description of this notification channel. This description may
   * provide additional details, beyond the display name, for the channel. This may not exceeed 1024
   * Unicode characters.
   * @param description description or {@code null} for none
   */
  public NotificationChannel setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * An optional human-readable name for this notification channel. It is recommended that you
   * specify a non-empty and unique name in order to make it easier to identify the channels in your
   * project, though this is not enforced. The display name is limited to 512 Unicode characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * An optional human-readable name for this notification channel. It is recommended that you
   * specify a non-empty and unique name in order to make it easier to identify the channels in your
   * project, though this is not enforced. The display name is limited to 512 Unicode characters.
   * @param displayName displayName or {@code null} for none
   */
  public NotificationChannel setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Whether notifications are forwarded to the described channel. This makes it possible to disable
   * delivery of notifications to a particular channel without removing the channel from all
   * alerting policies that reference the channel. This is a more convenient approach when the
   * change is temporary and you want to receive notifications from the same set of alerting
   * policies on the channel at some point in the future.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether notifications are forwarded to the described channel. This makes it possible to disable
   * delivery of notifications to a particular channel without removing the channel from all
   * alerting policies that reference the channel. This is a more convenient approach when the
   * change is temporary and you want to receive notifications from the same set of alerting
   * policies on the channel at some point in the future.
   * @param enabled enabled or {@code null} for none
   */
  public NotificationChannel setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Configuration fields that define the channel and its behavior. The permissible and required
   * labels are specified in the NotificationChannelDescriptor.labels of the
   * NotificationChannelDescriptor corresponding to the type field.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Configuration fields that define the channel and its behavior. The permissible and required
   * labels are specified in the NotificationChannelDescriptor.labels of the
   * NotificationChannelDescriptor corresponding to the type field.
   * @param labels labels or {@code null} for none
   */
  public NotificationChannel setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The full REST resource name for this channel. The syntax is:
   * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically
   * assigned by the server on creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The full REST resource name for this channel. The syntax is:
   * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically
   * assigned by the server on creation.
   * @param name name or {@code null} for none
   */
  public NotificationChannel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The type of the notification channel. This field matches the value of the
   * NotificationChannelDescriptor.type field.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the notification channel. This field matches the value of the
   * NotificationChannelDescriptor.type field.
   * @param type type or {@code null} for none
   */
  public NotificationChannel setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * User-supplied key/value data that does not need to conform to the corresponding
   * NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be
   * used for organizing and identifying the NotificationChannel objects.The field can contain up to
   * 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is
   * smaller. Labels and values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getUserLabels() {
    return userLabels;
  }

  /**
   * User-supplied key/value data that does not need to conform to the corresponding
   * NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be
   * used for organizing and identifying the NotificationChannel objects.The field can contain up to
   * 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is
   * smaller. Labels and values can contain only lowercase letters, numerals, underscores, and
   * dashes. Keys must begin with a letter.
   * @param userLabels userLabels or {@code null} for none
   */
  public NotificationChannel setUserLabels(java.util.Map<String, java.lang.String> userLabels) {
    this.userLabels = userLabels;
    return this;
  }

  /**
   * Indicates whether this channel has been verified or not. On a ListNotificationChannels or
   * GetNotificationChannel operation, this field is expected to be populated.If the value is
   * UNVERIFIED, then it indicates that the channel is non-functioning (it both requires
   * verification and lacks verification); otherwise, it is assumed that the channel works.If the
   * channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does
   * not require verification or that this specific channel has been exempted from verification
   * because it was created prior to verification being required for channels of this type.This
   * field cannot be modified using a standard UpdateNotificationChannel operation. To change the
   * value of this field, you must call VerifyNotificationChannel.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerificationStatus() {
    return verificationStatus;
  }

  /**
   * Indicates whether this channel has been verified or not. On a ListNotificationChannels or
   * GetNotificationChannel operation, this field is expected to be populated.If the value is
   * UNVERIFIED, then it indicates that the channel is non-functioning (it both requires
   * verification and lacks verification); otherwise, it is assumed that the channel works.If the
   * channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does
   * not require verification or that this specific channel has been exempted from verification
   * because it was created prior to verification being required for channels of this type.This
   * field cannot be modified using a standard UpdateNotificationChannel operation. To change the
   * value of this field, you must call VerifyNotificationChannel.
   * @param verificationStatus verificationStatus or {@code null} for none
   */
  public NotificationChannel setVerificationStatus(java.lang.String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

  @Override
  public NotificationChannel set(String fieldName, Object value) {
    return (NotificationChannel) super.set(fieldName, value);
  }

  @Override
  public NotificationChannel clone() {
    return (NotificationChannel) super.clone();
  }

}
