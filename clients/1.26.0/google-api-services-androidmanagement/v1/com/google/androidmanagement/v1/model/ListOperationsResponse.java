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

package com.google.androidmanagement.v1.model;

/**
 * The response message for Operations.ListOperations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListOperationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The standard List next-page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of operations that matches the specified filter in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Operation> operations;

  static {
    // hack to force ProGuard to consider Operation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Operation.class);
  }

  /**
   * The standard List next-page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The standard List next-page token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListOperationsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of operations that matches the specified filter in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<Operation> getOperations() {
    return operations;
  }

  /**
   * A list of operations that matches the specified filter in the request.
   * @param operations operations or {@code null} for none
   */
  public ListOperationsResponse setOperations(java.util.List<Operation> operations) {
    this.operations = operations;
    return this;
  }

  @Override
  public ListOperationsResponse set(String fieldName, Object value) {
    return (ListOperationsResponse) super.set(fieldName, value);
  }

  @Override
  public ListOperationsResponse clone() {
    return (ListOperationsResponse) super.clone();
  }

}
