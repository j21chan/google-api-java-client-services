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

package com.google.dfareporting.model;

/**
 * Contains information about a landing page deep link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeepLink extends com.google.api.client.json.GenericJson {

  /**
   * The URL of the mobile app being linked to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appUrl;

  /**
   * The fallback URL. This URL will be served to users who do not have the mobile app installed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fallbackUrl;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#deepLink".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The mobile app targeted by this deep link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MobileApp mobileApp;

  /**
   * Ads served to users on these remarketing lists will use this deep link. Applicable when
   * mobileApp.directory is APPLE_APP_STORE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> remarketingListIds;

  /**
   * The URL of the mobile app being linked to.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppUrl() {
    return appUrl;
  }

  /**
   * The URL of the mobile app being linked to.
   * @param appUrl appUrl or {@code null} for none
   */
  public DeepLink setAppUrl(java.lang.String appUrl) {
    this.appUrl = appUrl;
    return this;
  }

  /**
   * The fallback URL. This URL will be served to users who do not have the mobile app installed.
   * @return value or {@code null} for none
   */
  public java.lang.String getFallbackUrl() {
    return fallbackUrl;
  }

  /**
   * The fallback URL. This URL will be served to users who do not have the mobile app installed.
   * @param fallbackUrl fallbackUrl or {@code null} for none
   */
  public DeepLink setFallbackUrl(java.lang.String fallbackUrl) {
    this.fallbackUrl = fallbackUrl;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#deepLink".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#deepLink".
   * @param kind kind or {@code null} for none
   */
  public DeepLink setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The mobile app targeted by this deep link.
   * @return value or {@code null} for none
   */
  public MobileApp getMobileApp() {
    return mobileApp;
  }

  /**
   * The mobile app targeted by this deep link.
   * @param mobileApp mobileApp or {@code null} for none
   */
  public DeepLink setMobileApp(MobileApp mobileApp) {
    this.mobileApp = mobileApp;
    return this;
  }

  /**
   * Ads served to users on these remarketing lists will use this deep link. Applicable when
   * mobileApp.directory is APPLE_APP_STORE.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getRemarketingListIds() {
    return remarketingListIds;
  }

  /**
   * Ads served to users on these remarketing lists will use this deep link. Applicable when
   * mobileApp.directory is APPLE_APP_STORE.
   * @param remarketingListIds remarketingListIds or {@code null} for none
   */
  public DeepLink setRemarketingListIds(java.util.List<java.lang.Long> remarketingListIds) {
    this.remarketingListIds = remarketingListIds;
    return this;
  }

  @Override
  public DeepLink set(String fieldName, Object value) {
    return (DeepLink) super.set(fieldName, value);
  }

  @Override
  public DeepLink clone() {
    return (DeepLink) super.clone();
  }

}
