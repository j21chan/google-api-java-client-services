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

package com.google.genomics.model;

/**
 * The call set search request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchCallSetsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Only return call sets for which a substring of the name matches this string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The maximum number of results to return in a single page. If unspecified, defaults to 1024.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of `nextPageToken` from the previous response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Restrict the query to call sets within the given variant sets. At least one ID must be
   * provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> variantSetIds;

  /**
   * Only return call sets for which a substring of the name matches this string.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Only return call sets for which a substring of the name matches this string.
   * @param name name or {@code null} for none
   */
  public SearchCallSetsRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The maximum number of results to return in a single page. If unspecified, defaults to 1024.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * The maximum number of results to return in a single page. If unspecified, defaults to 1024.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchCallSetsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of `nextPageToken` from the previous response.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of `nextPageToken` from the previous response.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchCallSetsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Restrict the query to call sets within the given variant sets. At least one ID must be
   * provided.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVariantSetIds() {
    return variantSetIds;
  }

  /**
   * Restrict the query to call sets within the given variant sets. At least one ID must be
   * provided.
   * @param variantSetIds variantSetIds or {@code null} for none
   */
  public SearchCallSetsRequest setVariantSetIds(java.util.List<java.lang.String> variantSetIds) {
    this.variantSetIds = variantSetIds;
    return this;
  }

  @Override
  public SearchCallSetsRequest set(String fieldName, Object value) {
    return (SearchCallSetsRequest) super.set(fieldName, value);
  }

  @Override
  public SearchCallSetsRequest clone() {
    return (SearchCallSetsRequest) super.clone();
  }

}
