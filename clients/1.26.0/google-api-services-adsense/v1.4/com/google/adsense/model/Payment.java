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

package com.google.adsense.model;

/**
 * Model definition for Payment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Payment extends com.google.api.client.json.GenericJson {

  /**
   * Unique identifier of this Payment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Kind of resource this is, in this case adsense#payment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The amount to be paid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentAmount;

  /**
   * The currency code for the amount to be paid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentAmountCurrencyCode;

  /**
   * The date this payment was/will be credited to the user, or none if the payment threshold has
   * not been met.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String paymentDate;

  /**
   * Unique identifier of this Payment.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier of this Payment.
   * @param id id or {@code null} for none
   */
  public Payment setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Kind of resource this is, in this case adsense#payment.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is, in this case adsense#payment.
   * @param kind kind or {@code null} for none
   */
  public Payment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The amount to be paid.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentAmount() {
    return paymentAmount;
  }

  /**
   * The amount to be paid.
   * @param paymentAmount paymentAmount or {@code null} for none
   */
  public Payment setPaymentAmount(java.lang.String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The currency code for the amount to be paid.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentAmountCurrencyCode() {
    return paymentAmountCurrencyCode;
  }

  /**
   * The currency code for the amount to be paid.
   * @param paymentAmountCurrencyCode paymentAmountCurrencyCode or {@code null} for none
   */
  public Payment setPaymentAmountCurrencyCode(java.lang.String paymentAmountCurrencyCode) {
    this.paymentAmountCurrencyCode = paymentAmountCurrencyCode;
    return this;
  }

  /**
   * The date this payment was/will be credited to the user, or none if the payment threshold has
   * not been met.
   * @return value or {@code null} for none
   */
  public java.lang.String getPaymentDate() {
    return paymentDate;
  }

  /**
   * The date this payment was/will be credited to the user, or none if the payment threshold has
   * not been met.
   * @param paymentDate paymentDate or {@code null} for none
   */
  public Payment setPaymentDate(java.lang.String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  @Override
  public Payment set(String fieldName, Object value) {
    return (Payment) super.set(fieldName, value);
  }

  @Override
  public Payment clone() {
    return (Payment) super.clone();
  }

}
