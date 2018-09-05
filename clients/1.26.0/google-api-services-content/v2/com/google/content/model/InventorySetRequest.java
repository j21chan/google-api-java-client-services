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
 * Model definition for InventorySetRequest.
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
public final class InventorySetRequest extends com.google.api.client.json.GenericJson {

  /**
   * The availability of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availability;

  /**
   * Number and amount of installments to pay for an item. Brazil only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Installment installment;

  /**
   * Loyalty points that users receive after purchasing the item. Japan only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LoyaltyPoints loyaltyPoints;

  /**
   * Store pickup information. Only supported for local inventory. Not setting pickup means "don't
   * update" while setting it to the empty value ({} in JSON) means "delete". Otherwise,
   * pickupMethod and pickupSla must be set together, unless pickupMethod is "not supported".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InventoryPickup pickup;

  /**
   * The price of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price price;

  /**
   * The quantity of the product. Must be equal to or greater than zero. Supported only for local
   * products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantity;

  /**
   * The sale price of the product. Mandatory if sale_price_effective_date is defined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price salePrice;

  /**
   * A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash.
   * Both dates might be specified as 'null' if undecided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String salePriceEffectiveDate;

  /**
   * The quantity of the product that is available for selling on Google. Supported only for online
   * products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long sellOnGoogleQuantity;

  /**
   * The availability of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailability() {
    return availability;
  }

  /**
   * The availability of the product.
   * @param availability availability or {@code null} for none
   */
  public InventorySetRequest setAvailability(java.lang.String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Number and amount of installments to pay for an item. Brazil only.
   * @return value or {@code null} for none
   */
  public Installment getInstallment() {
    return installment;
  }

  /**
   * Number and amount of installments to pay for an item. Brazil only.
   * @param installment installment or {@code null} for none
   */
  public InventorySetRequest setInstallment(Installment installment) {
    this.installment = installment;
    return this;
  }

  /**
   * Loyalty points that users receive after purchasing the item. Japan only.
   * @return value or {@code null} for none
   */
  public LoyaltyPoints getLoyaltyPoints() {
    return loyaltyPoints;
  }

  /**
   * Loyalty points that users receive after purchasing the item. Japan only.
   * @param loyaltyPoints loyaltyPoints or {@code null} for none
   */
  public InventorySetRequest setLoyaltyPoints(LoyaltyPoints loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
    return this;
  }

  /**
   * Store pickup information. Only supported for local inventory. Not setting pickup means "don't
   * update" while setting it to the empty value ({} in JSON) means "delete". Otherwise,
   * pickupMethod and pickupSla must be set together, unless pickupMethod is "not supported".
   * @return value or {@code null} for none
   */
  public InventoryPickup getPickup() {
    return pickup;
  }

  /**
   * Store pickup information. Only supported for local inventory. Not setting pickup means "don't
   * update" while setting it to the empty value ({} in JSON) means "delete". Otherwise,
   * pickupMethod and pickupSla must be set together, unless pickupMethod is "not supported".
   * @param pickup pickup or {@code null} for none
   */
  public InventorySetRequest setPickup(InventoryPickup pickup) {
    this.pickup = pickup;
    return this;
  }

  /**
   * The price of the product.
   * @return value or {@code null} for none
   */
  public Price getPrice() {
    return price;
  }

  /**
   * The price of the product.
   * @param price price or {@code null} for none
   */
  public InventorySetRequest setPrice(Price price) {
    this.price = price;
    return this;
  }

  /**
   * The quantity of the product. Must be equal to or greater than zero. Supported only for local
   * products.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * The quantity of the product. Must be equal to or greater than zero. Supported only for local
   * products.
   * @param quantity quantity or {@code null} for none
   */
  public InventorySetRequest setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The sale price of the product. Mandatory if sale_price_effective_date is defined.
   * @return value or {@code null} for none
   */
  public Price getSalePrice() {
    return salePrice;
  }

  /**
   * The sale price of the product. Mandatory if sale_price_effective_date is defined.
   * @param salePrice salePrice or {@code null} for none
   */
  public InventorySetRequest setSalePrice(Price salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  /**
   * A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash.
   * Both dates might be specified as 'null' if undecided.
   * @return value or {@code null} for none
   */
  public java.lang.String getSalePriceEffectiveDate() {
    return salePriceEffectiveDate;
  }

  /**
   * A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash.
   * Both dates might be specified as 'null' if undecided.
   * @param salePriceEffectiveDate salePriceEffectiveDate or {@code null} for none
   */
  public InventorySetRequest setSalePriceEffectiveDate(java.lang.String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
    return this;
  }

  /**
   * The quantity of the product that is available for selling on Google. Supported only for online
   * products.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSellOnGoogleQuantity() {
    return sellOnGoogleQuantity;
  }

  /**
   * The quantity of the product that is available for selling on Google. Supported only for online
   * products.
   * @param sellOnGoogleQuantity sellOnGoogleQuantity or {@code null} for none
   */
  public InventorySetRequest setSellOnGoogleQuantity(java.lang.Long sellOnGoogleQuantity) {
    this.sellOnGoogleQuantity = sellOnGoogleQuantity;
    return this;
  }

  @Override
  public InventorySetRequest set(String fieldName, Object value) {
    return (InventorySetRequest) super.set(fieldName, value);
  }

  @Override
  public InventorySetRequest clone() {
    return (InventorySetRequest) super.clone();
  }

}
