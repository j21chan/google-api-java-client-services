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

package com.google.dlp.v2.model;

/**
 * Response message for ListStoredInfoTypes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2ListStoredInfoTypesResponse extends com.google.api.client.json.GenericJson {

  /**
   * If the next page is available then the next page token to be used in following
   * ListStoredInfoTypes request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2StoredInfoType> storedInfoTypes;

  /**
   * If the next page is available then the next page token to be used in following
   * ListStoredInfoTypes request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If the next page is available then the next page token to be used in following
   * ListStoredInfoTypes request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GooglePrivacyDlpV2ListStoredInfoTypesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2StoredInfoType> getStoredInfoTypes() {
    return storedInfoTypes;
  }

  /**
   * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
   * @param storedInfoTypes storedInfoTypes or {@code null} for none
   */
  public GooglePrivacyDlpV2ListStoredInfoTypesResponse setStoredInfoTypes(java.util.List<GooglePrivacyDlpV2StoredInfoType> storedInfoTypes) {
    this.storedInfoTypes = storedInfoTypes;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2ListStoredInfoTypesResponse set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2ListStoredInfoTypesResponse) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2ListStoredInfoTypesResponse clone() {
    return (GooglePrivacyDlpV2ListStoredInfoTypesResponse) super.clone();
  }

}
