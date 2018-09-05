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

package com.google.adexchangebuyer.model;

/**
 * Model definition for DealTermsGuaranteedFixedPriceTerms.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DealTermsGuaranteedFixedPriceTerms extends com.google.api.client.json.GenericJson {

  /**
   * External billing info for this Deal. This field is relevant when external billing info such as
   * price has a different currency code than DFP/AdX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DealTermsGuaranteedFixedPriceTermsBillingInfo billingInfo;

  /**
   * Fixed price for the specified buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PricePerBuyer> fixedPrices;

  /**
   * Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the
   * buyer is guaranteeing to buy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long guaranteedImpressions;

  /**
   * Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer
   * changes to guaranteed_looks will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long guaranteedLooks;

  /**
   * Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this
   * field instead of guaranteed_looks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minimumDailyLooks;

  /**
   * External billing info for this Deal. This field is relevant when external billing info such as
   * price has a different currency code than DFP/AdX.
   * @return value or {@code null} for none
   */
  public DealTermsGuaranteedFixedPriceTermsBillingInfo getBillingInfo() {
    return billingInfo;
  }

  /**
   * External billing info for this Deal. This field is relevant when external billing info such as
   * price has a different currency code than DFP/AdX.
   * @param billingInfo billingInfo or {@code null} for none
   */
  public DealTermsGuaranteedFixedPriceTerms setBillingInfo(DealTermsGuaranteedFixedPriceTermsBillingInfo billingInfo) {
    this.billingInfo = billingInfo;
    return this;
  }

  /**
   * Fixed price for the specified buyer.
   * @return value or {@code null} for none
   */
  public java.util.List<PricePerBuyer> getFixedPrices() {
    return fixedPrices;
  }

  /**
   * Fixed price for the specified buyer.
   * @param fixedPrices fixedPrices or {@code null} for none
   */
  public DealTermsGuaranteedFixedPriceTerms setFixedPrices(java.util.List<PricePerBuyer> fixedPrices) {
    this.fixedPrices = fixedPrices;
    return this;
  }

  /**
   * Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the
   * buyer is guaranteeing to buy.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGuaranteedImpressions() {
    return guaranteedImpressions;
  }

  /**
   * Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the
   * buyer is guaranteeing to buy.
   * @param guaranteedImpressions guaranteedImpressions or {@code null} for none
   */
  public DealTermsGuaranteedFixedPriceTerms setGuaranteedImpressions(java.lang.Long guaranteedImpressions) {
    this.guaranteedImpressions = guaranteedImpressions;
    return this;
  }

  /**
   * Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer
   * changes to guaranteed_looks will be ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGuaranteedLooks() {
    return guaranteedLooks;
  }

  /**
   * Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer
   * changes to guaranteed_looks will be ignored.
   * @param guaranteedLooks guaranteedLooks or {@code null} for none
   */
  public DealTermsGuaranteedFixedPriceTerms setGuaranteedLooks(java.lang.Long guaranteedLooks) {
    this.guaranteedLooks = guaranteedLooks;
    return this;
  }

  /**
   * Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this
   * field instead of guaranteed_looks.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinimumDailyLooks() {
    return minimumDailyLooks;
  }

  /**
   * Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this
   * field instead of guaranteed_looks.
   * @param minimumDailyLooks minimumDailyLooks or {@code null} for none
   */
  public DealTermsGuaranteedFixedPriceTerms setMinimumDailyLooks(java.lang.Long minimumDailyLooks) {
    this.minimumDailyLooks = minimumDailyLooks;
    return this;
  }

  @Override
  public DealTermsGuaranteedFixedPriceTerms set(String fieldName, Object value) {
    return (DealTermsGuaranteedFixedPriceTerms) super.set(fieldName, value);
  }

  @Override
  public DealTermsGuaranteedFixedPriceTerms clone() {
    return (DealTermsGuaranteedFixedPriceTerms) super.clone();
  }

}
