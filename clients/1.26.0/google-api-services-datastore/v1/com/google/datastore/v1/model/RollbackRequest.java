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

package com.google.datastore.v1.model;

/**
 * The request for Datastore.Rollback.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RollbackRequest extends com.google.api.client.json.GenericJson {

  /**
   * The transaction identifier, returned by a call to Datastore.BeginTransaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transaction;

  /**
   * The transaction identifier, returned by a call to Datastore.BeginTransaction.
   * @see #decodeTransaction()
   * @return value or {@code null} for none
   */
  public java.lang.String getTransaction() {
    return transaction;
  }

  /**
   * The transaction identifier, returned by a call to Datastore.BeginTransaction.
   * @see #getTransaction()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTransaction() {
    return com.google.api.client.util.Base64.decodeBase64(transaction);
  }

  /**
   * The transaction identifier, returned by a call to Datastore.BeginTransaction.
   * @see #encodeTransaction()
   * @param transaction transaction or {@code null} for none
   */
  public RollbackRequest setTransaction(java.lang.String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * The transaction identifier, returned by a call to Datastore.BeginTransaction.
   * @see #setTransaction()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public RollbackRequest encodeTransaction(byte[] transaction) {
    this.transaction = com.google.api.client.util.Base64.encodeBase64URLSafeString(transaction);
    return this;
  }

  @Override
  public RollbackRequest set(String fieldName, Object value) {
    return (RollbackRequest) super.set(fieldName, value);
  }

  @Override
  public RollbackRequest clone() {
    return (RollbackRequest) super.clone();
  }

}
