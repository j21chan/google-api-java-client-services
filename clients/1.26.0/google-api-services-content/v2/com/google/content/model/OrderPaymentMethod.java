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
 * Model definition for OrderPaymentMethod.
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
public final class OrderPaymentMethod extends com.google.api.client.json.GenericJson {

  /**
   * The billing address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderAddress billingAddress;

  /**
   * The card expiration month (January = 1, February = 2 etc.).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer expirationMonth;

  /**
   * The card expiration year (4-digit, e.g. 2015).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer expirationYear;

  /**
   * The last four digits of the card number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastFourDigits;

  /**
   * The billing phone number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * The type of instrument.
   *
   * Acceptable values are:   - "AMEX"  - "DISCOVER"  - "JCB"  - "MASTERCARD"  - "UNIONPAY"  -
   * "VISA"  - ""
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The billing address.
   * @return value or {@code null} for none
   */
  public OrderAddress getBillingAddress() {
    return billingAddress;
  }

  /**
   * The billing address.
   * @param billingAddress billingAddress or {@code null} for none
   */
  public OrderPaymentMethod setBillingAddress(OrderAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * The card expiration month (January = 1, February = 2 etc.).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExpirationMonth() {
    return expirationMonth;
  }

  /**
   * The card expiration month (January = 1, February = 2 etc.).
   * @param expirationMonth expirationMonth or {@code null} for none
   */
  public OrderPaymentMethod setExpirationMonth(java.lang.Integer expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

  /**
   * The card expiration year (4-digit, e.g. 2015).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getExpirationYear() {
    return expirationYear;
  }

  /**
   * The card expiration year (4-digit, e.g. 2015).
   * @param expirationYear expirationYear or {@code null} for none
   */
  public OrderPaymentMethod setExpirationYear(java.lang.Integer expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

  /**
   * The last four digits of the card number.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastFourDigits() {
    return lastFourDigits;
  }

  /**
   * The last four digits of the card number.
   * @param lastFourDigits lastFourDigits or {@code null} for none
   */
  public OrderPaymentMethod setLastFourDigits(java.lang.String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
    return this;
  }

  /**
   * The billing phone number.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * The billing phone number.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public OrderPaymentMethod setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The type of instrument.
   *
   * Acceptable values are:   - "AMEX"  - "DISCOVER"  - "JCB"  - "MASTERCARD"  - "UNIONPAY"  -
   * "VISA"  - ""
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of instrument.
   *
   * Acceptable values are:   - "AMEX"  - "DISCOVER"  - "JCB"  - "MASTERCARD"  - "UNIONPAY"  -
   * "VISA"  - ""
   * @param type type or {@code null} for none
   */
  public OrderPaymentMethod setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public OrderPaymentMethod set(String fieldName, Object value) {
    return (OrderPaymentMethod) super.set(fieldName, value);
  }

  @Override
  public OrderPaymentMethod clone() {
    return (OrderPaymentMethod) super.clone();
  }

}
