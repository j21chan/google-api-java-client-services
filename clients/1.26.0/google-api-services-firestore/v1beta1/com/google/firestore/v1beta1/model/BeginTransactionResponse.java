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

package com.google.firestore.v1beta1.model;

/**
 * The response for Firestore.BeginTransaction.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BeginTransactionResponse extends com.google.api.client.json.GenericJson {

  /**
   * The transaction that was started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transaction;

  /**
   * The transaction that was started.
   * @see #decodeTransaction()
   * @return value or {@code null} for none
   */
  public java.lang.String getTransaction() {
    return transaction;
  }

  /**
   * The transaction that was started.
   * @see #getTransaction()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTransaction() {
    return com.google.api.client.util.Base64.decodeBase64(transaction);
  }

  /**
   * The transaction that was started.
   * @see #encodeTransaction()
   * @param transaction transaction or {@code null} for none
   */
  public BeginTransactionResponse setTransaction(java.lang.String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * The transaction that was started.
   * @see #setTransaction()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public BeginTransactionResponse encodeTransaction(byte[] transaction) {
    this.transaction = com.google.api.client.util.Base64.encodeBase64URLSafeString(transaction);
    return this;
  }

  @Override
  public BeginTransactionResponse set(String fieldName, Object value) {
    return (BeginTransactionResponse) super.set(fieldName, value);
  }

  @Override
  public BeginTransactionResponse clone() {
    return (BeginTransactionResponse) super.clone();
  }

}
