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

package com.google.cloudkms.v1.model;

/**
 * Response message for KeyManagementService.ListKeyRings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListKeyRingsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of KeyRings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<KeyRing> keyRings;

  static {
    // hack to force ProGuard to consider KeyRing used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(KeyRing.class);
  }

  /**
   * A token to retrieve next page of results. Pass this value in ListKeyRingsRequest.page_token to
   * retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The total number of KeyRings that matched the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * The list of KeyRings.
   * @return value or {@code null} for none
   */
  public java.util.List<KeyRing> getKeyRings() {
    return keyRings;
  }

  /**
   * The list of KeyRings.
   * @param keyRings keyRings or {@code null} for none
   */
  public ListKeyRingsResponse setKeyRings(java.util.List<KeyRing> keyRings) {
    this.keyRings = keyRings;
    return this;
  }

  /**
   * A token to retrieve next page of results. Pass this value in ListKeyRingsRequest.page_token to
   * retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve next page of results. Pass this value in ListKeyRingsRequest.page_token to
   * retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListKeyRingsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The total number of KeyRings that matched the query.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The total number of KeyRings that matched the query.
   * @param totalSize totalSize or {@code null} for none
   */
  public ListKeyRingsResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public ListKeyRingsResponse set(String fieldName, Object value) {
    return (ListKeyRingsResponse) super.set(fieldName, value);
  }

  @Override
  public ListKeyRingsResponse clone() {
    return (ListKeyRingsResponse) super.clone();
  }

}
