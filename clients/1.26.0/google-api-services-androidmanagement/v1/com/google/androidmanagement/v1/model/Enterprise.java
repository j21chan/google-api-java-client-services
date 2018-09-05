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

package com.google.androidmanagement.v1.model;

/**
 * The configuration applied to an enterprise.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Enterprise extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated and unused.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean appAutoApprovalEnabled;

  /**
   * The types of Google Pub/Sub notifications enabled for the enterprise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enabledNotificationTypes;

  /**
   * The name of the enterprise displayed to users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enterpriseDisplayName;

  /**
   * An image displayed as a logo during device provisioning. Supported types are: image/bmp,
   * image/gif, image/x-ico, image/jpeg, image/png, image/webp, image/vnd.wap.wbmp, image/x-adobe-
   * dng.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExternalData logo;

  /**
   * The name of the enterprise which is generated by the server during creation, in the form
   * enterprises/{enterpriseId}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A color in RGB format that indicates the predominant color to display in the device management
   * app UI. The color components are stored as follows: (red << 16) | (green << 8) | blue, where
   * the value of each component is between 0 and 255, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer primaryColor;

  /**
   * The topic that Cloud Pub/Sub notifications are published to, in the form
   * projects/{project}/topics/{topic}. This field is only required if Pub/Sub notifications are
   * enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * Terms and conditions that must be accepted when provisioning a device for this enterprise. A
   * page of terms is generated for each value in this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TermsAndConditions> termsAndConditions;

  static {
    // hack to force ProGuard to consider TermsAndConditions used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TermsAndConditions.class);
  }

  /**
   * Deprecated and unused.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAppAutoApprovalEnabled() {
    return appAutoApprovalEnabled;
  }

  /**
   * Deprecated and unused.
   * @param appAutoApprovalEnabled appAutoApprovalEnabled or {@code null} for none
   */
  public Enterprise setAppAutoApprovalEnabled(java.lang.Boolean appAutoApprovalEnabled) {
    this.appAutoApprovalEnabled = appAutoApprovalEnabled;
    return this;
  }

  /**
   * The types of Google Pub/Sub notifications enabled for the enterprise.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnabledNotificationTypes() {
    return enabledNotificationTypes;
  }

  /**
   * The types of Google Pub/Sub notifications enabled for the enterprise.
   * @param enabledNotificationTypes enabledNotificationTypes or {@code null} for none
   */
  public Enterprise setEnabledNotificationTypes(java.util.List<java.lang.String> enabledNotificationTypes) {
    this.enabledNotificationTypes = enabledNotificationTypes;
    return this;
  }

  /**
   * The name of the enterprise displayed to users.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnterpriseDisplayName() {
    return enterpriseDisplayName;
  }

  /**
   * The name of the enterprise displayed to users.
   * @param enterpriseDisplayName enterpriseDisplayName or {@code null} for none
   */
  public Enterprise setEnterpriseDisplayName(java.lang.String enterpriseDisplayName) {
    this.enterpriseDisplayName = enterpriseDisplayName;
    return this;
  }

  /**
   * An image displayed as a logo during device provisioning. Supported types are: image/bmp,
   * image/gif, image/x-ico, image/jpeg, image/png, image/webp, image/vnd.wap.wbmp, image/x-adobe-
   * dng.
   * @return value or {@code null} for none
   */
  public ExternalData getLogo() {
    return logo;
  }

  /**
   * An image displayed as a logo during device provisioning. Supported types are: image/bmp,
   * image/gif, image/x-ico, image/jpeg, image/png, image/webp, image/vnd.wap.wbmp, image/x-adobe-
   * dng.
   * @param logo logo or {@code null} for none
   */
  public Enterprise setLogo(ExternalData logo) {
    this.logo = logo;
    return this;
  }

  /**
   * The name of the enterprise which is generated by the server during creation, in the form
   * enterprises/{enterpriseId}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the enterprise which is generated by the server during creation, in the form
   * enterprises/{enterpriseId}.
   * @param name name or {@code null} for none
   */
  public Enterprise setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A color in RGB format that indicates the predominant color to display in the device management
   * app UI. The color components are stored as follows: (red << 16) | (green << 8) | blue, where
   * the value of each component is between 0 and 255, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPrimaryColor() {
    return primaryColor;
  }

  /**
   * A color in RGB format that indicates the predominant color to display in the device management
   * app UI. The color components are stored as follows: (red << 16) | (green << 8) | blue, where
   * the value of each component is between 0 and 255, inclusive.
   * @param primaryColor primaryColor or {@code null} for none
   */
  public Enterprise setPrimaryColor(java.lang.Integer primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  /**
   * The topic that Cloud Pub/Sub notifications are published to, in the form
   * projects/{project}/topics/{topic}. This field is only required if Pub/Sub notifications are
   * enabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * The topic that Cloud Pub/Sub notifications are published to, in the form
   * projects/{project}/topics/{topic}. This field is only required if Pub/Sub notifications are
   * enabled.
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public Enterprise setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  /**
   * Terms and conditions that must be accepted when provisioning a device for this enterprise. A
   * page of terms is generated for each value in this list.
   * @return value or {@code null} for none
   */
  public java.util.List<TermsAndConditions> getTermsAndConditions() {
    return termsAndConditions;
  }

  /**
   * Terms and conditions that must be accepted when provisioning a device for this enterprise. A
   * page of terms is generated for each value in this list.
   * @param termsAndConditions termsAndConditions or {@code null} for none
   */
  public Enterprise setTermsAndConditions(java.util.List<TermsAndConditions> termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  @Override
  public Enterprise set(String fieldName, Object value) {
    return (Enterprise) super.set(fieldName, value);
  }

  @Override
  public Enterprise clone() {
    return (Enterprise) super.clone();
  }

}
