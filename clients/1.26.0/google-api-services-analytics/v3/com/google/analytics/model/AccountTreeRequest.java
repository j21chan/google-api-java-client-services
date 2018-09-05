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

package com.google.analytics.model;

/**
 * JSON template for an Analytics account tree requests. The account tree request is used in the
 * provisioning api to create an account, property, and view (profile). It contains the basic
 * information required to make these fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountTreeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountSettings accountSettings;

  /**
   * Resource type for account ticket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String profileName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timezone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webpropertyName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String websiteUrl;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountName() {
    return accountName;
  }

  /**
   * @param accountName accountName or {@code null} for none
   */
  public AccountTreeRequest setAccountName(java.lang.String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AccountSettings getAccountSettings() {
    return accountSettings;
  }

  /**
   * @param accountSettings accountSettings or {@code null} for none
   */
  public AccountTreeRequest setAccountSettings(AccountSettings accountSettings) {
    this.accountSettings = accountSettings;
    return this;
  }

  /**
   * Resource type for account ticket.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for account ticket.
   * @param kind kind or {@code null} for none
   */
  public AccountTreeRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProfileName() {
    return profileName;
  }

  /**
   * @param profileName profileName or {@code null} for none
   */
  public AccountTreeRequest setProfileName(java.lang.String profileName) {
    this.profileName = profileName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTimezone() {
    return timezone;
  }

  /**
   * @param timezone timezone or {@code null} for none
   */
  public AccountTreeRequest setTimezone(java.lang.String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWebpropertyName() {
    return webpropertyName;
  }

  /**
   * @param webpropertyName webpropertyName or {@code null} for none
   */
  public AccountTreeRequest setWebpropertyName(java.lang.String webpropertyName) {
    this.webpropertyName = webpropertyName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWebsiteUrl() {
    return websiteUrl;
  }

  /**
   * @param websiteUrl websiteUrl or {@code null} for none
   */
  public AccountTreeRequest setWebsiteUrl(java.lang.String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  @Override
  public AccountTreeRequest set(String fieldName, Object value) {
    return (AccountTreeRequest) super.set(fieldName, value);
  }

  @Override
  public AccountTreeRequest clone() {
    return (AccountTreeRequest) super.clone();
  }

  /**
   * Model definition for AccountTreeRequestAccountSettings.
   */
  public static final class AccountSettings extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean shareAnonymouslyWithOthers;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean shareWithGoogleProducts;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean shareWithSpecialists;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean shareWithSupport;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getShareAnonymouslyWithOthers() {
      return shareAnonymouslyWithOthers;
    }

    /**
     * @param shareAnonymouslyWithOthers shareAnonymouslyWithOthers or {@code null} for none
     */
    public AccountSettings setShareAnonymouslyWithOthers(java.lang.Boolean shareAnonymouslyWithOthers) {
      this.shareAnonymouslyWithOthers = shareAnonymouslyWithOthers;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getShareWithGoogleProducts() {
      return shareWithGoogleProducts;
    }

    /**
     * @param shareWithGoogleProducts shareWithGoogleProducts or {@code null} for none
     */
    public AccountSettings setShareWithGoogleProducts(java.lang.Boolean shareWithGoogleProducts) {
      this.shareWithGoogleProducts = shareWithGoogleProducts;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getShareWithSpecialists() {
      return shareWithSpecialists;
    }

    /**
     * @param shareWithSpecialists shareWithSpecialists or {@code null} for none
     */
    public AccountSettings setShareWithSpecialists(java.lang.Boolean shareWithSpecialists) {
      this.shareWithSpecialists = shareWithSpecialists;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getShareWithSupport() {
      return shareWithSupport;
    }

    /**
     * @param shareWithSupport shareWithSupport or {@code null} for none
     */
    public AccountSettings setShareWithSupport(java.lang.Boolean shareWithSupport) {
      this.shareWithSupport = shareWithSupport;
      return this;
    }

    @Override
    public AccountSettings set(String fieldName, Object value) {
      return (AccountSettings) super.set(fieldName, value);
    }

    @Override
    public AccountSettings clone() {
      return (AccountSettings) super.clone();
    }

  }

}
