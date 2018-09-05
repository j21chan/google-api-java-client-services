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
 * Model definition for OrderReportDisbursement.
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
public final class OrderReportDisbursement extends com.google.api.client.json.GenericJson {

  /**
   * The disbursement amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price disbursementAmount;

  /**
   * The disbursement date, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disbursementCreationDate;

  /**
   * The date the disbursement was initiated, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disbursementDate;

  /**
   * The ID of the disbursement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disbursementId;

  /**
   * The ID of the managing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * The disbursement amount.
   * @return value or {@code null} for none
   */
  public Price getDisbursementAmount() {
    return disbursementAmount;
  }

  /**
   * The disbursement amount.
   * @param disbursementAmount disbursementAmount or {@code null} for none
   */
  public OrderReportDisbursement setDisbursementAmount(Price disbursementAmount) {
    this.disbursementAmount = disbursementAmount;
    return this;
  }

  /**
   * The disbursement date, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisbursementCreationDate() {
    return disbursementCreationDate;
  }

  /**
   * The disbursement date, in ISO 8601 format.
   * @param disbursementCreationDate disbursementCreationDate or {@code null} for none
   */
  public OrderReportDisbursement setDisbursementCreationDate(java.lang.String disbursementCreationDate) {
    this.disbursementCreationDate = disbursementCreationDate;
    return this;
  }

  /**
   * The date the disbursement was initiated, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisbursementDate() {
    return disbursementDate;
  }

  /**
   * The date the disbursement was initiated, in ISO 8601 format.
   * @param disbursementDate disbursementDate or {@code null} for none
   */
  public OrderReportDisbursement setDisbursementDate(java.lang.String disbursementDate) {
    this.disbursementDate = disbursementDate;
    return this;
  }

  /**
   * The ID of the disbursement.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisbursementId() {
    return disbursementId;
  }

  /**
   * The ID of the disbursement.
   * @param disbursementId disbursementId or {@code null} for none
   */
  public OrderReportDisbursement setDisbursementId(java.lang.String disbursementId) {
    this.disbursementId = disbursementId;
    return this;
  }

  /**
   * The ID of the managing account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The ID of the managing account.
   * @param merchantId merchantId or {@code null} for none
   */
  public OrderReportDisbursement setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  @Override
  public OrderReportDisbursement set(String fieldName, Object value) {
    return (OrderReportDisbursement) super.set(fieldName, value);
  }

  @Override
  public OrderReportDisbursement clone() {
    return (OrderReportDisbursement) super.clone();
  }

}
