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

package com.google.content.model;

/**
 * Model definition for UnitInvoiceAdditionalCharge.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UnitInvoiceAdditionalCharge extends com.google.api.client.json.GenericJson {

  /**
   * [required] Amount of the additional charge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount additionalChargeAmount;

  /**
   * Promotions applied to the additional charge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Promotion> additionalChargePromotions;

  static {
    // hack to force ProGuard to consider Promotion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Promotion.class);
  }

  /**
   * [required] Type of the additional charge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [required] Amount of the additional charge.
   * @return value or {@code null} for none
   */
  public Amount getAdditionalChargeAmount() {
    return additionalChargeAmount;
  }

  /**
   * [required] Amount of the additional charge.
   * @param additionalChargeAmount additionalChargeAmount or {@code null} for none
   */
  public UnitInvoiceAdditionalCharge setAdditionalChargeAmount(Amount additionalChargeAmount) {
    this.additionalChargeAmount = additionalChargeAmount;
    return this;
  }

  /**
   * Promotions applied to the additional charge.
   * @return value or {@code null} for none
   */
  public java.util.List<Promotion> getAdditionalChargePromotions() {
    return additionalChargePromotions;
  }

  /**
   * Promotions applied to the additional charge.
   * @param additionalChargePromotions additionalChargePromotions or {@code null} for none
   */
  public UnitInvoiceAdditionalCharge setAdditionalChargePromotions(java.util.List<Promotion> additionalChargePromotions) {
    this.additionalChargePromotions = additionalChargePromotions;
    return this;
  }

  /**
   * [required] Type of the additional charge.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * [required] Type of the additional charge.
   * @param type type or {@code null} for none
   */
  public UnitInvoiceAdditionalCharge setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public UnitInvoiceAdditionalCharge set(String fieldName, Object value) {
    return (UnitInvoiceAdditionalCharge) super.set(fieldName, value);
  }

  @Override
  public UnitInvoiceAdditionalCharge clone() {
    return (UnitInvoiceAdditionalCharge) super.clone();
  }

}
