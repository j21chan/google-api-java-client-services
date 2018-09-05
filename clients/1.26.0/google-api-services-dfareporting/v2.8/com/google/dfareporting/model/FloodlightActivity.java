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
 * Contains properties of a Floodlight activity.
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
public final class FloodlightActivity extends com.google.api.client.json.GenericJson {

  /**
   * Account ID of this floodlight activity. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Advertiser ID of this floodlight activity. If this field is left blank, the value will be
   * copied over either from the activity group's advertiser or the existing activity's advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue advertiserIdDimensionValue;

  /**
   * Code type used for cache busting in the generated tag. Applicable only when
   * floodlightActivityGroupType is COUNTER and countingMethod is STANDARD_COUNTING or
   * UNIQUE_COUNTING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cacheBustingType;

  /**
   * Counting method for conversions for this floodlight activity. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countingMethod;

  /**
   * Dynamic floodlight tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FloodlightActivityDynamicTag> defaultTags;

  /**
   * URL where this tag will be deployed. If specified, must be less than 256 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expectedUrl;

  /**
   * Floodlight activity group ID of this floodlight activity. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long floodlightActivityGroupId;

  /**
   * Name of the associated floodlight activity group. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String floodlightActivityGroupName;

  /**
   * Tag string of the associated floodlight activity group. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String floodlightActivityGroupTagString;

  /**
   * Type of the associated floodlight activity group. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String floodlightActivityGroupType;

  /**
   * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value
   * will be copied over either from the activity group's floodlight configuration or from the
   * existing activity's floodlight configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long floodlightConfigurationId;

  /**
   * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue floodlightConfigurationIdDimensionValue;

  /**
   * Whether this activity is archived.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hidden;

  /**
   * ID of this floodlight activity. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue idDimensionValue;

  /**
   * Whether the image tag is enabled for this activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean imageTagEnabled;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#floodlightActivity".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this floodlight activity. This is a required field. Must be less than 129 characters
   * long and cannot contain quotes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * General notes or implementation instructions for the tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notes;

  /**
   * Publisher dynamic floodlight tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FloodlightActivityPublisherDynamicTag> publisherTags;

  /**
   * Whether this tag should use SSL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean secure;

  /**
   * Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected
   * by the system from the floodlight tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sslCompliant;

  /**
   * Whether this floodlight activity must be SSL-compliant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sslRequired;

  /**
   * Subaccount ID of this floodlight activity. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subaccountId;

  /**
   * Tag format type for the floodlight activity. If left blank, the tag format will default to
   * HTML.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagFormat;

  /**
   * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the
   * activity. This is optional: if empty, a new tag string will be generated for you. This string
   * must be 1 to 8 characters long, with valid characters being [a-z][A-Z][0-9][-][ _ ]. This tag
   * string must also be unique among activities of the same activity group. This field is read-only
   * after insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagString;

  /**
   * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in
   * the tags. Each of these can have a user defined type. Acceptable values are U1 to U100,
   * inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> userDefinedVariableTypes;

  /**
   * Account ID of this floodlight activity. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Account ID of this floodlight activity. This is a read-only field that can be left blank.
   * @param accountId accountId or {@code null} for none
   */
  public FloodlightActivity setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Advertiser ID of this floodlight activity. If this field is left blank, the value will be
   * copied over either from the activity group's advertiser or the existing activity's advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Advertiser ID of this floodlight activity. If this field is left blank, the value will be
   * copied over either from the activity group's advertiser or the existing activity's advertiser.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public FloodlightActivity setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getAdvertiserIdDimensionValue() {
    return advertiserIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @param advertiserIdDimensionValue advertiserIdDimensionValue or {@code null} for none
   */
  public FloodlightActivity setAdvertiserIdDimensionValue(DimensionValue advertiserIdDimensionValue) {
    this.advertiserIdDimensionValue = advertiserIdDimensionValue;
    return this;
  }

  /**
   * Code type used for cache busting in the generated tag. Applicable only when
   * floodlightActivityGroupType is COUNTER and countingMethod is STANDARD_COUNTING or
   * UNIQUE_COUNTING.
   * @return value or {@code null} for none
   */
  public java.lang.String getCacheBustingType() {
    return cacheBustingType;
  }

  /**
   * Code type used for cache busting in the generated tag. Applicable only when
   * floodlightActivityGroupType is COUNTER and countingMethod is STANDARD_COUNTING or
   * UNIQUE_COUNTING.
   * @param cacheBustingType cacheBustingType or {@code null} for none
   */
  public FloodlightActivity setCacheBustingType(java.lang.String cacheBustingType) {
    this.cacheBustingType = cacheBustingType;
    return this;
  }

  /**
   * Counting method for conversions for this floodlight activity. This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountingMethod() {
    return countingMethod;
  }

  /**
   * Counting method for conversions for this floodlight activity. This is a required field.
   * @param countingMethod countingMethod or {@code null} for none
   */
  public FloodlightActivity setCountingMethod(java.lang.String countingMethod) {
    this.countingMethod = countingMethod;
    return this;
  }

  /**
   * Dynamic floodlight tags.
   * @return value or {@code null} for none
   */
  public java.util.List<FloodlightActivityDynamicTag> getDefaultTags() {
    return defaultTags;
  }

  /**
   * Dynamic floodlight tags.
   * @param defaultTags defaultTags or {@code null} for none
   */
  public FloodlightActivity setDefaultTags(java.util.List<FloodlightActivityDynamicTag> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  /**
   * URL where this tag will be deployed. If specified, must be less than 256 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpectedUrl() {
    return expectedUrl;
  }

  /**
   * URL where this tag will be deployed. If specified, must be less than 256 characters long.
   * @param expectedUrl expectedUrl or {@code null} for none
   */
  public FloodlightActivity setExpectedUrl(java.lang.String expectedUrl) {
    this.expectedUrl = expectedUrl;
    return this;
  }

  /**
   * Floodlight activity group ID of this floodlight activity. This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFloodlightActivityGroupId() {
    return floodlightActivityGroupId;
  }

  /**
   * Floodlight activity group ID of this floodlight activity. This is a required field.
   * @param floodlightActivityGroupId floodlightActivityGroupId or {@code null} for none
   */
  public FloodlightActivity setFloodlightActivityGroupId(java.lang.Long floodlightActivityGroupId) {
    this.floodlightActivityGroupId = floodlightActivityGroupId;
    return this;
  }

  /**
   * Name of the associated floodlight activity group. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getFloodlightActivityGroupName() {
    return floodlightActivityGroupName;
  }

  /**
   * Name of the associated floodlight activity group. This is a read-only field.
   * @param floodlightActivityGroupName floodlightActivityGroupName or {@code null} for none
   */
  public FloodlightActivity setFloodlightActivityGroupName(java.lang.String floodlightActivityGroupName) {
    this.floodlightActivityGroupName = floodlightActivityGroupName;
    return this;
  }

  /**
   * Tag string of the associated floodlight activity group. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getFloodlightActivityGroupTagString() {
    return floodlightActivityGroupTagString;
  }

  /**
   * Tag string of the associated floodlight activity group. This is a read-only field.
   * @param floodlightActivityGroupTagString floodlightActivityGroupTagString or {@code null} for none
   */
  public FloodlightActivity setFloodlightActivityGroupTagString(java.lang.String floodlightActivityGroupTagString) {
    this.floodlightActivityGroupTagString = floodlightActivityGroupTagString;
    return this;
  }

  /**
   * Type of the associated floodlight activity group. This is a read-only field.
   * @return value or {@code null} for none
   */
  public java.lang.String getFloodlightActivityGroupType() {
    return floodlightActivityGroupType;
  }

  /**
   * Type of the associated floodlight activity group. This is a read-only field.
   * @param floodlightActivityGroupType floodlightActivityGroupType or {@code null} for none
   */
  public FloodlightActivity setFloodlightActivityGroupType(java.lang.String floodlightActivityGroupType) {
    this.floodlightActivityGroupType = floodlightActivityGroupType;
    return this;
  }

  /**
   * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value
   * will be copied over either from the activity group's floodlight configuration or from the
   * existing activity's floodlight configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFloodlightConfigurationId() {
    return floodlightConfigurationId;
  }

  /**
   * Floodlight configuration ID of this floodlight activity. If this field is left blank, the value
   * will be copied over either from the activity group's floodlight configuration or from the
   * existing activity's floodlight configuration.
   * @param floodlightConfigurationId floodlightConfigurationId or {@code null} for none
   */
  public FloodlightActivity setFloodlightConfigurationId(java.lang.Long floodlightConfigurationId) {
    this.floodlightConfigurationId = floodlightConfigurationId;
    return this;
  }

  /**
   * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated
   * field.
   * @return value or {@code null} for none
   */
  public DimensionValue getFloodlightConfigurationIdDimensionValue() {
    return floodlightConfigurationIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated
   * field.
   * @param floodlightConfigurationIdDimensionValue floodlightConfigurationIdDimensionValue or {@code null} for none
   */
  public FloodlightActivity setFloodlightConfigurationIdDimensionValue(DimensionValue floodlightConfigurationIdDimensionValue) {
    this.floodlightConfigurationIdDimensionValue = floodlightConfigurationIdDimensionValue;
    return this;
  }

  /**
   * Whether this activity is archived.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHidden() {
    return hidden;
  }

  /**
   * Whether this activity is archived.
   * @param hidden hidden or {@code null} for none
   */
  public FloodlightActivity setHidden(java.lang.Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * ID of this floodlight activity. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this floodlight activity. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public FloodlightActivity setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated
   * field.
   * @return value or {@code null} for none
   */
  public DimensionValue getIdDimensionValue() {
    return idDimensionValue;
  }

  /**
   * Dimension value for the ID of this floodlight activity. This is a read-only, auto-generated
   * field.
   * @param idDimensionValue idDimensionValue or {@code null} for none
   */
  public FloodlightActivity setIdDimensionValue(DimensionValue idDimensionValue) {
    this.idDimensionValue = idDimensionValue;
    return this;
  }

  /**
   * Whether the image tag is enabled for this activity.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getImageTagEnabled() {
    return imageTagEnabled;
  }

  /**
   * Whether the image tag is enabled for this activity.
   * @param imageTagEnabled imageTagEnabled or {@code null} for none
   */
  public FloodlightActivity setImageTagEnabled(java.lang.Boolean imageTagEnabled) {
    this.imageTagEnabled = imageTagEnabled;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#floodlightActivity".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#floodlightActivity".
   * @param kind kind or {@code null} for none
   */
  public FloodlightActivity setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this floodlight activity. This is a required field. Must be less than 129 characters
   * long and cannot contain quotes.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this floodlight activity. This is a required field. Must be less than 129 characters
   * long and cannot contain quotes.
   * @param name name or {@code null} for none
   */
  public FloodlightActivity setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * General notes or implementation instructions for the tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotes() {
    return notes;
  }

  /**
   * General notes or implementation instructions for the tag.
   * @param notes notes or {@code null} for none
   */
  public FloodlightActivity setNotes(java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Publisher dynamic floodlight tags.
   * @return value or {@code null} for none
   */
  public java.util.List<FloodlightActivityPublisherDynamicTag> getPublisherTags() {
    return publisherTags;
  }

  /**
   * Publisher dynamic floodlight tags.
   * @param publisherTags publisherTags or {@code null} for none
   */
  public FloodlightActivity setPublisherTags(java.util.List<FloodlightActivityPublisherDynamicTag> publisherTags) {
    this.publisherTags = publisherTags;
    return this;
  }

  /**
   * Whether this tag should use SSL.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSecure() {
    return secure;
  }

  /**
   * Whether this tag should use SSL.
   * @param secure secure or {@code null} for none
   */
  public FloodlightActivity setSecure(java.lang.Boolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected
   * by the system from the floodlight tags.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSslCompliant() {
    return sslCompliant;
  }

  /**
   * Whether the floodlight activity is SSL-compliant. This is a read-only field, its value detected
   * by the system from the floodlight tags.
   * @param sslCompliant sslCompliant or {@code null} for none
   */
  public FloodlightActivity setSslCompliant(java.lang.Boolean sslCompliant) {
    this.sslCompliant = sslCompliant;
    return this;
  }

  /**
   * Whether this floodlight activity must be SSL-compliant.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSslRequired() {
    return sslRequired;
  }

  /**
   * Whether this floodlight activity must be SSL-compliant.
   * @param sslRequired sslRequired or {@code null} for none
   */
  public FloodlightActivity setSslRequired(java.lang.Boolean sslRequired) {
    this.sslRequired = sslRequired;
    return this;
  }

  /**
   * Subaccount ID of this floodlight activity. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubaccountId() {
    return subaccountId;
  }

  /**
   * Subaccount ID of this floodlight activity. This is a read-only field that can be left blank.
   * @param subaccountId subaccountId or {@code null} for none
   */
  public FloodlightActivity setSubaccountId(java.lang.Long subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

  /**
   * Tag format type for the floodlight activity. If left blank, the tag format will default to
   * HTML.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagFormat() {
    return tagFormat;
  }

  /**
   * Tag format type for the floodlight activity. If left blank, the tag format will default to
   * HTML.
   * @param tagFormat tagFormat or {@code null} for none
   */
  public FloodlightActivity setTagFormat(java.lang.String tagFormat) {
    this.tagFormat = tagFormat;
    return this;
  }

  /**
   * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the
   * activity. This is optional: if empty, a new tag string will be generated for you. This string
   * must be 1 to 8 characters long, with valid characters being [a-z][A-Z][0-9][-][ _ ]. This tag
   * string must also be unique among activities of the same activity group. This field is read-only
   * after insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagString() {
    return tagString;
  }

  /**
   * Value of the cat= parameter in the floodlight tag, which the ad servers use to identify the
   * activity. This is optional: if empty, a new tag string will be generated for you. This string
   * must be 1 to 8 characters long, with valid characters being [a-z][A-Z][0-9][-][ _ ]. This tag
   * string must also be unique among activities of the same activity group. This field is read-only
   * after insertion.
   * @param tagString tagString or {@code null} for none
   */
  public FloodlightActivity setTagString(java.lang.String tagString) {
    this.tagString = tagString;
    return this;
  }

  /**
   * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in
   * the tags. Each of these can have a user defined type. Acceptable values are U1 to U100,
   * inclusive.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUserDefinedVariableTypes() {
    return userDefinedVariableTypes;
  }

  /**
   * List of the user-defined variables used by this conversion tag. These map to the "u[1-100]=" in
   * the tags. Each of these can have a user defined type. Acceptable values are U1 to U100,
   * inclusive.
   * @param userDefinedVariableTypes userDefinedVariableTypes or {@code null} for none
   */
  public FloodlightActivity setUserDefinedVariableTypes(java.util.List<java.lang.String> userDefinedVariableTypes) {
    this.userDefinedVariableTypes = userDefinedVariableTypes;
    return this;
  }

  @Override
  public FloodlightActivity set(String fieldName, Object value) {
    return (FloodlightActivity) super.set(fieldName, value);
  }

  @Override
  public FloodlightActivity clone() {
    return (FloodlightActivity) super.clone();
  }

}
