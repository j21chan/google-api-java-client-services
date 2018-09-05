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

package com.google.datastore.v1beta3.model;

/**
 * The options shared by read requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReadOptions extends com.google.api.client.json.GenericJson {

  /**
   * The non-transactional read consistency to use. Cannot be set to `STRONG` for global queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String readConsistency;

  /**
   * The identifier of the transaction in which to read. A transaction identifier is returned by a
   * call to Datastore.BeginTransaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transaction;

  /**
   * The non-transactional read consistency to use. Cannot be set to `STRONG` for global queries.
   * @return value or {@code null} for none
   */
  public java.lang.String getReadConsistency() {
    return readConsistency;
  }

  /**
   * The non-transactional read consistency to use. Cannot be set to `STRONG` for global queries.
   * @param readConsistency readConsistency or {@code null} for none
   */
  public ReadOptions setReadConsistency(java.lang.String readConsistency) {
    this.readConsistency = readConsistency;
    return this;
  }

  /**
   * The identifier of the transaction in which to read. A transaction identifier is returned by a
   * call to Datastore.BeginTransaction.
   * @see #decodeTransaction()
   * @return value or {@code null} for none
   */
  public java.lang.String getTransaction() {
    return transaction;
  }

  /**
   * The identifier of the transaction in which to read. A transaction identifier is returned by a
   * call to Datastore.BeginTransaction.
   * @see #getTransaction()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTransaction() {
    return com.google.api.client.util.Base64.decodeBase64(transaction);
  }

  /**
   * The identifier of the transaction in which to read. A transaction identifier is returned by a
   * call to Datastore.BeginTransaction.
   * @see #encodeTransaction()
   * @param transaction transaction or {@code null} for none
   */
  public ReadOptions setTransaction(java.lang.String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * The identifier of the transaction in which to read. A transaction identifier is returned by a
   * call to Datastore.BeginTransaction.
   * @see #setTransaction()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ReadOptions encodeTransaction(byte[] transaction) {
    this.transaction = com.google.api.client.util.Base64.encodeBase64URLSafeString(transaction);
    return this;
  }

  @Override
  public ReadOptions set(String fieldName, Object value) {
    return (ReadOptions) super.set(fieldName, value);
  }

  @Override
  public ReadOptions clone() {
    return (ReadOptions) super.clone();
  }

}
