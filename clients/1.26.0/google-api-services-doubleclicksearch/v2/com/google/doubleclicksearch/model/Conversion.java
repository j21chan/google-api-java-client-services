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

package com.google.doubleclicksearch.model;

/**
 * A conversion containing data relevant to DoubleClick Search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Search API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Conversion extends com.google.api.client.json.GenericJson {

  /**
   * DS ad group ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long adGroupId;

  /**
   * DS ad ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long adId;

  /**
   * DS advertiser ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * DS agency ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long agencyId;

  /**
   * Available to advertisers only after contacting DoubleClick Search customer support.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributionModel;

  /**
   * DS campaign ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long campaignId;

  /**
   * Sales channel for the product. Acceptable values are: - "local": a physical store  - "online":
   * an online store
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channel;

  /**
   * DS click ID for the conversion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clickId;

  /**
   * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is
   * meaningful to them. Each conversion in a request must specify a unique ID, and the combination
   * of ID and timestamp must be unique amongst all conversions within the advertiser. For online
   * conversions, DS copies the dsConversionId or floodlightOrderId into this property depending on
   * the advertiser's Floodlight instructions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversionId;

  /**
   * The time at which the conversion was last modified, in epoch millis UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger conversionModifiedTimestamp;

  /**
   * The time at which the conversion took place, in epoch millis UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger conversionTimestamp;

  /**
   * Available to advertisers only after contacting DoubleClick Search customer support.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long countMillis;

  /**
   * DS criterion (keyword) ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long criterionId;

  /**
   * The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char)
   * format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Custom dimensions for the conversion, which can be used to filter data in a report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomDimension> customDimension;

  /**
   * Custom metrics for the conversion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomMetric> customMetric;

  /**
   * The type of device on which the conversion occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceType;

  /**
   * ID that DoubleClick Search generates for each conversion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dsConversionId;

  /**
   * DS engine account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long engineAccountId;

  /**
   * The Floodlight order ID provided by the advertiser for the conversion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String floodlightOrderId;

  /**
   * ID that DS generates and uses to uniquely identify the inventory account that contains the
   * product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long inventoryAccountId;

  /**
   * The country registered for the Merchant Center feed that contains the product. Use an ISO 3166
   * code to specify a country.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productCountry;

  /**
   * DS product group ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long productGroupId;

  /**
   * The product ID (SKU).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The language registered for the Merchant Center feed that contains the product. Use an ISO 639
   * code to specify a language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productLanguage;

  /**
   * The quantity of this conversion, in millis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long quantityMillis;

  /**
   * The revenue amount of this TRANSACTION conversion, in micros (value multiplied by 1000000, no
   * decimal). For example, to specify a revenue value of "10" enter "10000000" (10 million) in your
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long revenueMicros;

  /**
   * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long segmentationId;

  /**
   * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity
   * name).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentationName;

  /**
   * The segmentation type of this conversion (for example, FLOODLIGHT).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentationType;

  /**
   * The state of the conversion, that is, either ACTIVE or REMOVED. Note: state DELETED is
   * deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The ID of the local store for which the product was advertised. Applicable only when the
   * channel is "local".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storeId;

  /**
   * The type of the conversion, that is, either ACTION or TRANSACTION. An ACTION conversion is an
   * action by the user that has no monetarily quantifiable value, while a TRANSACTION conversion is
   * an action that does have a monetarily quantifiable value. Examples are email list signups
   * (ACTION) versus ecommerce purchases (TRANSACTION).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * DS ad group ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdGroupId() {
    return adGroupId;
  }

  /**
   * DS ad group ID.
   * @param adGroupId adGroupId or {@code null} for none
   */
  public Conversion setAdGroupId(java.lang.Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * DS ad ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdId() {
    return adId;
  }

  /**
   * DS ad ID.
   * @param adId adId or {@code null} for none
   */
  public Conversion setAdId(java.lang.Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * DS advertiser ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * DS advertiser ID.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public Conversion setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * DS agency ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAgencyId() {
    return agencyId;
  }

  /**
   * DS agency ID.
   * @param agencyId agencyId or {@code null} for none
   */
  public Conversion setAgencyId(java.lang.Long agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * Available to advertisers only after contacting DoubleClick Search customer support.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributionModel() {
    return attributionModel;
  }

  /**
   * Available to advertisers only after contacting DoubleClick Search customer support.
   * @param attributionModel attributionModel or {@code null} for none
   */
  public Conversion setAttributionModel(java.lang.String attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

  /**
   * DS campaign ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCampaignId() {
    return campaignId;
  }

  /**
   * DS campaign ID.
   * @param campaignId campaignId or {@code null} for none
   */
  public Conversion setCampaignId(java.lang.Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Sales channel for the product. Acceptable values are: - "local": a physical store  - "online":
   * an online store
   * @return value or {@code null} for none
   */
  public java.lang.String getChannel() {
    return channel;
  }

  /**
   * Sales channel for the product. Acceptable values are: - "local": a physical store  - "online":
   * an online store
   * @param channel channel or {@code null} for none
   */
  public Conversion setChannel(java.lang.String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * DS click ID for the conversion.
   * @return value or {@code null} for none
   */
  public java.lang.String getClickId() {
    return clickId;
  }

  /**
   * DS click ID for the conversion.
   * @param clickId clickId or {@code null} for none
   */
  public Conversion setClickId(java.lang.String clickId) {
    this.clickId = clickId;
    return this;
  }

  /**
   * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is
   * meaningful to them. Each conversion in a request must specify a unique ID, and the combination
   * of ID and timestamp must be unique amongst all conversions within the advertiser. For online
   * conversions, DS copies the dsConversionId or floodlightOrderId into this property depending on
   * the advertiser's Floodlight instructions.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversionId() {
    return conversionId;
  }

  /**
   * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is
   * meaningful to them. Each conversion in a request must specify a unique ID, and the combination
   * of ID and timestamp must be unique amongst all conversions within the advertiser. For online
   * conversions, DS copies the dsConversionId or floodlightOrderId into this property depending on
   * the advertiser's Floodlight instructions.
   * @param conversionId conversionId or {@code null} for none
   */
  public Conversion setConversionId(java.lang.String conversionId) {
    this.conversionId = conversionId;
    return this;
  }

  /**
   * The time at which the conversion was last modified, in epoch millis UTC.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getConversionModifiedTimestamp() {
    return conversionModifiedTimestamp;
  }

  /**
   * The time at which the conversion was last modified, in epoch millis UTC.
   * @param conversionModifiedTimestamp conversionModifiedTimestamp or {@code null} for none
   */
  public Conversion setConversionModifiedTimestamp(java.math.BigInteger conversionModifiedTimestamp) {
    this.conversionModifiedTimestamp = conversionModifiedTimestamp;
    return this;
  }

  /**
   * The time at which the conversion took place, in epoch millis UTC.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getConversionTimestamp() {
    return conversionTimestamp;
  }

  /**
   * The time at which the conversion took place, in epoch millis UTC.
   * @param conversionTimestamp conversionTimestamp or {@code null} for none
   */
  public Conversion setConversionTimestamp(java.math.BigInteger conversionTimestamp) {
    this.conversionTimestamp = conversionTimestamp;
    return this;
  }

  /**
   * Available to advertisers only after contacting DoubleClick Search customer support.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCountMillis() {
    return countMillis;
  }

  /**
   * Available to advertisers only after contacting DoubleClick Search customer support.
   * @param countMillis countMillis or {@code null} for none
   */
  public Conversion setCountMillis(java.lang.Long countMillis) {
    this.countMillis = countMillis;
    return this;
  }

  /**
   * DS criterion (keyword) ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCriterionId() {
    return criterionId;
  }

  /**
   * DS criterion (keyword) ID.
   * @param criterionId criterionId or {@code null} for none
   */
  public Conversion setCriterionId(java.lang.Long criterionId) {
    this.criterionId = criterionId;
    return this;
  }

  /**
   * The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char)
   * format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char)
   * format.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public Conversion setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Custom dimensions for the conversion, which can be used to filter data in a report.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomDimension> getCustomDimension() {
    return customDimension;
  }

  /**
   * Custom dimensions for the conversion, which can be used to filter data in a report.
   * @param customDimension customDimension or {@code null} for none
   */
  public Conversion setCustomDimension(java.util.List<CustomDimension> customDimension) {
    this.customDimension = customDimension;
    return this;
  }

  /**
   * Custom metrics for the conversion.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomMetric> getCustomMetric() {
    return customMetric;
  }

  /**
   * Custom metrics for the conversion.
   * @param customMetric customMetric or {@code null} for none
   */
  public Conversion setCustomMetric(java.util.List<CustomMetric> customMetric) {
    this.customMetric = customMetric;
    return this;
  }

  /**
   * The type of device on which the conversion occurred.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceType() {
    return deviceType;
  }

  /**
   * The type of device on which the conversion occurred.
   * @param deviceType deviceType or {@code null} for none
   */
  public Conversion setDeviceType(java.lang.String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * ID that DoubleClick Search generates for each conversion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDsConversionId() {
    return dsConversionId;
  }

  /**
   * ID that DoubleClick Search generates for each conversion.
   * @param dsConversionId dsConversionId or {@code null} for none
   */
  public Conversion setDsConversionId(java.lang.Long dsConversionId) {
    this.dsConversionId = dsConversionId;
    return this;
  }

  /**
   * DS engine account ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEngineAccountId() {
    return engineAccountId;
  }

  /**
   * DS engine account ID.
   * @param engineAccountId engineAccountId or {@code null} for none
   */
  public Conversion setEngineAccountId(java.lang.Long engineAccountId) {
    this.engineAccountId = engineAccountId;
    return this;
  }

  /**
   * The Floodlight order ID provided by the advertiser for the conversion.
   * @return value or {@code null} for none
   */
  public java.lang.String getFloodlightOrderId() {
    return floodlightOrderId;
  }

  /**
   * The Floodlight order ID provided by the advertiser for the conversion.
   * @param floodlightOrderId floodlightOrderId or {@code null} for none
   */
  public Conversion setFloodlightOrderId(java.lang.String floodlightOrderId) {
    this.floodlightOrderId = floodlightOrderId;
    return this;
  }

  /**
   * ID that DS generates and uses to uniquely identify the inventory account that contains the
   * product.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInventoryAccountId() {
    return inventoryAccountId;
  }

  /**
   * ID that DS generates and uses to uniquely identify the inventory account that contains the
   * product.
   * @param inventoryAccountId inventoryAccountId or {@code null} for none
   */
  public Conversion setInventoryAccountId(java.lang.Long inventoryAccountId) {
    this.inventoryAccountId = inventoryAccountId;
    return this;
  }

  /**
   * The country registered for the Merchant Center feed that contains the product. Use an ISO 3166
   * code to specify a country.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductCountry() {
    return productCountry;
  }

  /**
   * The country registered for the Merchant Center feed that contains the product. Use an ISO 3166
   * code to specify a country.
   * @param productCountry productCountry or {@code null} for none
   */
  public Conversion setProductCountry(java.lang.String productCountry) {
    this.productCountry = productCountry;
    return this;
  }

  /**
   * DS product group ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProductGroupId() {
    return productGroupId;
  }

  /**
   * DS product group ID.
   * @param productGroupId productGroupId or {@code null} for none
   */
  public Conversion setProductGroupId(java.lang.Long productGroupId) {
    this.productGroupId = productGroupId;
    return this;
  }

  /**
   * The product ID (SKU).
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The product ID (SKU).
   * @param productId productId or {@code null} for none
   */
  public Conversion setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The language registered for the Merchant Center feed that contains the product. Use an ISO 639
   * code to specify a language.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductLanguage() {
    return productLanguage;
  }

  /**
   * The language registered for the Merchant Center feed that contains the product. Use an ISO 639
   * code to specify a language.
   * @param productLanguage productLanguage or {@code null} for none
   */
  public Conversion setProductLanguage(java.lang.String productLanguage) {
    this.productLanguage = productLanguage;
    return this;
  }

  /**
   * The quantity of this conversion, in millis.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantityMillis() {
    return quantityMillis;
  }

  /**
   * The quantity of this conversion, in millis.
   * @param quantityMillis quantityMillis or {@code null} for none
   */
  public Conversion setQuantityMillis(java.lang.Long quantityMillis) {
    this.quantityMillis = quantityMillis;
    return this;
  }

  /**
   * The revenue amount of this TRANSACTION conversion, in micros (value multiplied by 1000000, no
   * decimal). For example, to specify a revenue value of "10" enter "10000000" (10 million) in your
   * request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRevenueMicros() {
    return revenueMicros;
  }

  /**
   * The revenue amount of this TRANSACTION conversion, in micros (value multiplied by 1000000, no
   * decimal). For example, to specify a revenue value of "10" enter "10000000" (10 million) in your
   * request.
   * @param revenueMicros revenueMicros or {@code null} for none
   */
  public Conversion setRevenueMicros(java.lang.Long revenueMicros) {
    this.revenueMicros = revenueMicros;
    return this;
  }

  /**
   * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
   * @return value or {@code null} for none
   */
  public java.lang.Long getSegmentationId() {
    return segmentationId;
  }

  /**
   * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
   * @param segmentationId segmentationId or {@code null} for none
   */
  public Conversion setSegmentationId(java.lang.Long segmentationId) {
    this.segmentationId = segmentationId;
    return this;
  }

  /**
   * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity
   * name).
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentationName() {
    return segmentationName;
  }

  /**
   * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity
   * name).
   * @param segmentationName segmentationName or {@code null} for none
   */
  public Conversion setSegmentationName(java.lang.String segmentationName) {
    this.segmentationName = segmentationName;
    return this;
  }

  /**
   * The segmentation type of this conversion (for example, FLOODLIGHT).
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentationType() {
    return segmentationType;
  }

  /**
   * The segmentation type of this conversion (for example, FLOODLIGHT).
   * @param segmentationType segmentationType or {@code null} for none
   */
  public Conversion setSegmentationType(java.lang.String segmentationType) {
    this.segmentationType = segmentationType;
    return this;
  }

  /**
   * The state of the conversion, that is, either ACTIVE or REMOVED. Note: state DELETED is
   * deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the conversion, that is, either ACTIVE or REMOVED. Note: state DELETED is
   * deprecated.
   * @param state state or {@code null} for none
   */
  public Conversion setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The ID of the local store for which the product was advertised. Applicable only when the
   * channel is "local".
   * @return value or {@code null} for none
   */
  public java.lang.String getStoreId() {
    return storeId;
  }

  /**
   * The ID of the local store for which the product was advertised. Applicable only when the
   * channel is "local".
   * @param storeId storeId or {@code null} for none
   */
  public Conversion setStoreId(java.lang.String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * The type of the conversion, that is, either ACTION or TRANSACTION. An ACTION conversion is an
   * action by the user that has no monetarily quantifiable value, while a TRANSACTION conversion is
   * an action that does have a monetarily quantifiable value. Examples are email list signups
   * (ACTION) versus ecommerce purchases (TRANSACTION).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the conversion, that is, either ACTION or TRANSACTION. An ACTION conversion is an
   * action by the user that has no monetarily quantifiable value, while a TRANSACTION conversion is
   * an action that does have a monetarily quantifiable value. Examples are email list signups
   * (ACTION) versus ecommerce purchases (TRANSACTION).
   * @param type type or {@code null} for none
   */
  public Conversion setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Conversion set(String fieldName, Object value) {
    return (Conversion) super.set(fieldName, value);
  }

  @Override
  public Conversion clone() {
    return (Conversion) super.clone();
  }

}
