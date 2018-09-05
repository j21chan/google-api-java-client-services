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
 * Options for beginning a new transaction.
 *
 * Transactions can be created explicitly with calls to Datastore.BeginTransaction or implicitly by
 * setting ReadOptions.new_transaction in read requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransactionOptions extends com.google.api.client.json.GenericJson {

  /**
   * The transaction should only allow reads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReadOnly readOnly;

  /**
   * The transaction should allow both reads and writes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReadWrite readWrite;

  /**
   * The transaction should only allow reads.
   * @return value or {@code null} for none
   */
  public ReadOnly getReadOnly() {
    return readOnly;
  }

  /**
   * The transaction should only allow reads.
   * @param readOnly readOnly or {@code null} for none
   */
  public TransactionOptions setReadOnly(ReadOnly readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * The transaction should allow both reads and writes.
   * @return value or {@code null} for none
   */
  public ReadWrite getReadWrite() {
    return readWrite;
  }

  /**
   * The transaction should allow both reads and writes.
   * @param readWrite readWrite or {@code null} for none
   */
  public TransactionOptions setReadWrite(ReadWrite readWrite) {
    this.readWrite = readWrite;
    return this;
  }

  @Override
  public TransactionOptions set(String fieldName, Object value) {
    return (TransactionOptions) super.set(fieldName, value);
  }

  @Override
  public TransactionOptions clone() {
    return (TransactionOptions) super.clone();
  }

}
