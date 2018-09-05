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
 * Contains properties of a DCM campaign.
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
public final class Campaign extends com.google.api.client.json.GenericJson {

  /**
   * Account ID of this campaign. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Ad blocking settings for this campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdBlockingConfiguration adBlockingConfiguration;

  /**
   * Additional creative optimization configurations for the campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CreativeOptimizationConfiguration> additionalCreativeOptimizationConfigurations;

  /**
   * Advertiser group ID of the associated advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserGroupId;

  /**
   * Advertiser ID of this campaign. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Dimension value for the advertiser ID of this campaign. This is a read-only, auto-generated
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue advertiserIdDimensionValue;

  /**
   * Whether this campaign has been archived.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean archived;

  /**
   * Audience segment groups assigned to this campaign. Cannot have more than 300 segment groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AudienceSegmentGroup> audienceSegmentGroups;

  static {
    // hack to force ProGuard to consider AudienceSegmentGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AudienceSegmentGroup.class);
  }

  /**
   * Billing invoice code included in the DCM client billing invoices associated with the campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String billingInvoiceCode;

  /**
   * Click-through URL suffix override properties for this campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClickThroughUrlSuffixProperties clickThroughUrlSuffixProperties;

  /**
   * Arbitrary comments about this campaign. Must be less than 256 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * Information about the creation of this campaign. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LastModifiedInfo createInfo;

  /**
   * List of creative group IDs that are assigned to the campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> creativeGroupIds;

  /**
   * Creative optimization configuration for the campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreativeOptimizationConfiguration creativeOptimizationConfiguration;

  /**
   * Click-through event tag ID override properties for this campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DefaultClickThroughEventTagProperties defaultClickThroughEventTagProperties;

  /**
   * The default landing page ID for this campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long defaultLandingPageId;

  /**
   * Date on which the campaign will stop running. On insert, the end date must be today or a future
   * date. The end date must be later than or be the same as the start date. If, for example, you
   * set 6/25/2015 as both the start and end dates, the effective campaign run date is just that day
   * only, 6/25/2015. The hours, minutes, and seconds of the end date should not be set, as doing so
   * will result in an error. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * Overrides that can be used to activate or deactivate advertiser event tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EventTagOverride> eventTagOverrides;

  /**
   * External ID for this campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalId;

  /**
   * ID of this campaign. This is a read-only auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Dimension value for the ID of this campaign. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue idDimensionValue;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaign".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Information about the most recent modification of this campaign. This is a read-only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LastModifiedInfo lastModifiedInfo;

  /**
   * Lookback window settings for the campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LookbackConfiguration lookbackConfiguration;

  /**
   * Name of this campaign. This is a required field and must be less than 256 characters long and
   * unique among campaigns of the same advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Whether Nielsen reports are enabled for this campaign.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean nielsenOcrEnabled;

  /**
   * Date on which the campaign starts running. The start date can be any date. The hours, minutes,
   * and seconds of the start date should not be set, as doing so will result in an error. This is a
   * required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * Subaccount ID of this campaign. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subaccountId;

  /**
   * Campaign trafficker contact emails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> traffickerEmails;

  /**
   * Account ID of this campaign. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Account ID of this campaign. This is a read-only field that can be left blank.
   * @param accountId accountId or {@code null} for none
   */
  public Campaign setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Ad blocking settings for this campaign.
   * @return value or {@code null} for none
   */
  public AdBlockingConfiguration getAdBlockingConfiguration() {
    return adBlockingConfiguration;
  }

  /**
   * Ad blocking settings for this campaign.
   * @param adBlockingConfiguration adBlockingConfiguration or {@code null} for none
   */
  public Campaign setAdBlockingConfiguration(AdBlockingConfiguration adBlockingConfiguration) {
    this.adBlockingConfiguration = adBlockingConfiguration;
    return this;
  }

  /**
   * Additional creative optimization configurations for the campaign.
   * @return value or {@code null} for none
   */
  public java.util.List<CreativeOptimizationConfiguration> getAdditionalCreativeOptimizationConfigurations() {
    return additionalCreativeOptimizationConfigurations;
  }

  /**
   * Additional creative optimization configurations for the campaign.
   * @param additionalCreativeOptimizationConfigurations additionalCreativeOptimizationConfigurations or {@code null} for none
   */
  public Campaign setAdditionalCreativeOptimizationConfigurations(java.util.List<CreativeOptimizationConfiguration> additionalCreativeOptimizationConfigurations) {
    this.additionalCreativeOptimizationConfigurations = additionalCreativeOptimizationConfigurations;
    return this;
  }

  /**
   * Advertiser group ID of the associated advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserGroupId() {
    return advertiserGroupId;
  }

  /**
   * Advertiser group ID of the associated advertiser.
   * @param advertiserGroupId advertiserGroupId or {@code null} for none
   */
  public Campaign setAdvertiserGroupId(java.lang.Long advertiserGroupId) {
    this.advertiserGroupId = advertiserGroupId;
    return this;
  }

  /**
   * Advertiser ID of this campaign. This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Advertiser ID of this campaign. This is a required field.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public Campaign setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Dimension value for the advertiser ID of this campaign. This is a read-only, auto-generated
   * field.
   * @return value or {@code null} for none
   */
  public DimensionValue getAdvertiserIdDimensionValue() {
    return advertiserIdDimensionValue;
  }

  /**
   * Dimension value for the advertiser ID of this campaign. This is a read-only, auto-generated
   * field.
   * @param advertiserIdDimensionValue advertiserIdDimensionValue or {@code null} for none
   */
  public Campaign setAdvertiserIdDimensionValue(DimensionValue advertiserIdDimensionValue) {
    this.advertiserIdDimensionValue = advertiserIdDimensionValue;
    return this;
  }

  /**
   * Whether this campaign has been archived.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getArchived() {
    return archived;
  }

  /**
   * Whether this campaign has been archived.
   * @param archived archived or {@code null} for none
   */
  public Campaign setArchived(java.lang.Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Audience segment groups assigned to this campaign. Cannot have more than 300 segment groups.
   * @return value or {@code null} for none
   */
  public java.util.List<AudienceSegmentGroup> getAudienceSegmentGroups() {
    return audienceSegmentGroups;
  }

  /**
   * Audience segment groups assigned to this campaign. Cannot have more than 300 segment groups.
   * @param audienceSegmentGroups audienceSegmentGroups or {@code null} for none
   */
  public Campaign setAudienceSegmentGroups(java.util.List<AudienceSegmentGroup> audienceSegmentGroups) {
    this.audienceSegmentGroups = audienceSegmentGroups;
    return this;
  }

  /**
   * Billing invoice code included in the DCM client billing invoices associated with the campaign.
   * @return value or {@code null} for none
   */
  public java.lang.String getBillingInvoiceCode() {
    return billingInvoiceCode;
  }

  /**
   * Billing invoice code included in the DCM client billing invoices associated with the campaign.
   * @param billingInvoiceCode billingInvoiceCode or {@code null} for none
   */
  public Campaign setBillingInvoiceCode(java.lang.String billingInvoiceCode) {
    this.billingInvoiceCode = billingInvoiceCode;
    return this;
  }

  /**
   * Click-through URL suffix override properties for this campaign.
   * @return value or {@code null} for none
   */
  public ClickThroughUrlSuffixProperties getClickThroughUrlSuffixProperties() {
    return clickThroughUrlSuffixProperties;
  }

  /**
   * Click-through URL suffix override properties for this campaign.
   * @param clickThroughUrlSuffixProperties clickThroughUrlSuffixProperties or {@code null} for none
   */
  public Campaign setClickThroughUrlSuffixProperties(ClickThroughUrlSuffixProperties clickThroughUrlSuffixProperties) {
    this.clickThroughUrlSuffixProperties = clickThroughUrlSuffixProperties;
    return this;
  }

  /**
   * Arbitrary comments about this campaign. Must be less than 256 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Arbitrary comments about this campaign. Must be less than 256 characters long.
   * @param comment comment or {@code null} for none
   */
  public Campaign setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Information about the creation of this campaign. This is a read-only field.
   * @return value or {@code null} for none
   */
  public LastModifiedInfo getCreateInfo() {
    return createInfo;
  }

  /**
   * Information about the creation of this campaign. This is a read-only field.
   * @param createInfo createInfo or {@code null} for none
   */
  public Campaign setCreateInfo(LastModifiedInfo createInfo) {
    this.createInfo = createInfo;
    return this;
  }

  /**
   * List of creative group IDs that are assigned to the campaign.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getCreativeGroupIds() {
    return creativeGroupIds;
  }

  /**
   * List of creative group IDs that are assigned to the campaign.
   * @param creativeGroupIds creativeGroupIds or {@code null} for none
   */
  public Campaign setCreativeGroupIds(java.util.List<java.lang.Long> creativeGroupIds) {
    this.creativeGroupIds = creativeGroupIds;
    return this;
  }

  /**
   * Creative optimization configuration for the campaign.
   * @return value or {@code null} for none
   */
  public CreativeOptimizationConfiguration getCreativeOptimizationConfiguration() {
    return creativeOptimizationConfiguration;
  }

  /**
   * Creative optimization configuration for the campaign.
   * @param creativeOptimizationConfiguration creativeOptimizationConfiguration or {@code null} for none
   */
  public Campaign setCreativeOptimizationConfiguration(CreativeOptimizationConfiguration creativeOptimizationConfiguration) {
    this.creativeOptimizationConfiguration = creativeOptimizationConfiguration;
    return this;
  }

  /**
   * Click-through event tag ID override properties for this campaign.
   * @return value or {@code null} for none
   */
  public DefaultClickThroughEventTagProperties getDefaultClickThroughEventTagProperties() {
    return defaultClickThroughEventTagProperties;
  }

  /**
   * Click-through event tag ID override properties for this campaign.
   * @param defaultClickThroughEventTagProperties defaultClickThroughEventTagProperties or {@code null} for none
   */
  public Campaign setDefaultClickThroughEventTagProperties(DefaultClickThroughEventTagProperties defaultClickThroughEventTagProperties) {
    this.defaultClickThroughEventTagProperties = defaultClickThroughEventTagProperties;
    return this;
  }

  /**
   * The default landing page ID for this campaign.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDefaultLandingPageId() {
    return defaultLandingPageId;
  }

  /**
   * The default landing page ID for this campaign.
   * @param defaultLandingPageId defaultLandingPageId or {@code null} for none
   */
  public Campaign setDefaultLandingPageId(java.lang.Long defaultLandingPageId) {
    this.defaultLandingPageId = defaultLandingPageId;
    return this;
  }

  /**
   * Date on which the campaign will stop running. On insert, the end date must be today or a future
   * date. The end date must be later than or be the same as the start date. If, for example, you
   * set 6/25/2015 as both the start and end dates, the effective campaign run date is just that day
   * only, 6/25/2015. The hours, minutes, and seconds of the end date should not be set, as doing so
   * will result in an error. This is a required field.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * Date on which the campaign will stop running. On insert, the end date must be today or a future
   * date. The end date must be later than or be the same as the start date. If, for example, you
   * set 6/25/2015 as both the start and end dates, the effective campaign run date is just that day
   * only, 6/25/2015. The hours, minutes, and seconds of the end date should not be set, as doing so
   * will result in an error. This is a required field.
   * @param endDate endDate or {@code null} for none
   */
  public Campaign setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Overrides that can be used to activate or deactivate advertiser event tags.
   * @return value or {@code null} for none
   */
  public java.util.List<EventTagOverride> getEventTagOverrides() {
    return eventTagOverrides;
  }

  /**
   * Overrides that can be used to activate or deactivate advertiser event tags.
   * @param eventTagOverrides eventTagOverrides or {@code null} for none
   */
  public Campaign setEventTagOverrides(java.util.List<EventTagOverride> eventTagOverrides) {
    this.eventTagOverrides = eventTagOverrides;
    return this;
  }

  /**
   * External ID for this campaign.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalId() {
    return externalId;
  }

  /**
   * External ID for this campaign.
   * @param externalId externalId or {@code null} for none
   */
  public Campaign setExternalId(java.lang.String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID of this campaign. This is a read-only auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this campaign. This is a read-only auto-generated field.
   * @param id id or {@code null} for none
   */
  public Campaign setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Dimension value for the ID of this campaign. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getIdDimensionValue() {
    return idDimensionValue;
  }

  /**
   * Dimension value for the ID of this campaign. This is a read-only, auto-generated field.
   * @param idDimensionValue idDimensionValue or {@code null} for none
   */
  public Campaign setIdDimensionValue(DimensionValue idDimensionValue) {
    this.idDimensionValue = idDimensionValue;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaign".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaign".
   * @param kind kind or {@code null} for none
   */
  public Campaign setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Information about the most recent modification of this campaign. This is a read-only field.
   * @return value or {@code null} for none
   */
  public LastModifiedInfo getLastModifiedInfo() {
    return lastModifiedInfo;
  }

  /**
   * Information about the most recent modification of this campaign. This is a read-only field.
   * @param lastModifiedInfo lastModifiedInfo or {@code null} for none
   */
  public Campaign setLastModifiedInfo(LastModifiedInfo lastModifiedInfo) {
    this.lastModifiedInfo = lastModifiedInfo;
    return this;
  }

  /**
   * Lookback window settings for the campaign.
   * @return value or {@code null} for none
   */
  public LookbackConfiguration getLookbackConfiguration() {
    return lookbackConfiguration;
  }

  /**
   * Lookback window settings for the campaign.
   * @param lookbackConfiguration lookbackConfiguration or {@code null} for none
   */
  public Campaign setLookbackConfiguration(LookbackConfiguration lookbackConfiguration) {
    this.lookbackConfiguration = lookbackConfiguration;
    return this;
  }

  /**
   * Name of this campaign. This is a required field and must be less than 256 characters long and
   * unique among campaigns of the same advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this campaign. This is a required field and must be less than 256 characters long and
   * unique among campaigns of the same advertiser.
   * @param name name or {@code null} for none
   */
  public Campaign setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Whether Nielsen reports are enabled for this campaign.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNielsenOcrEnabled() {
    return nielsenOcrEnabled;
  }

  /**
   * Whether Nielsen reports are enabled for this campaign.
   * @param nielsenOcrEnabled nielsenOcrEnabled or {@code null} for none
   */
  public Campaign setNielsenOcrEnabled(java.lang.Boolean nielsenOcrEnabled) {
    this.nielsenOcrEnabled = nielsenOcrEnabled;
    return this;
  }

  /**
   * Date on which the campaign starts running. The start date can be any date. The hours, minutes,
   * and seconds of the start date should not be set, as doing so will result in an error. This is a
   * required field.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * Date on which the campaign starts running. The start date can be any date. The hours, minutes,
   * and seconds of the start date should not be set, as doing so will result in an error. This is a
   * required field.
   * @param startDate startDate or {@code null} for none
   */
  public Campaign setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Subaccount ID of this campaign. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubaccountId() {
    return subaccountId;
  }

  /**
   * Subaccount ID of this campaign. This is a read-only field that can be left blank.
   * @param subaccountId subaccountId or {@code null} for none
   */
  public Campaign setSubaccountId(java.lang.Long subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

  /**
   * Campaign trafficker contact emails.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTraffickerEmails() {
    return traffickerEmails;
  }

  /**
   * Campaign trafficker contact emails.
   * @param traffickerEmails traffickerEmails or {@code null} for none
   */
  public Campaign setTraffickerEmails(java.util.List<java.lang.String> traffickerEmails) {
    this.traffickerEmails = traffickerEmails;
    return this;
  }

  @Override
  public Campaign set(String fieldName, Object value) {
    return (Campaign) super.set(fieldName, value);
  }

  @Override
  public Campaign clone() {
    return (Campaign) super.clone();
  }

}
