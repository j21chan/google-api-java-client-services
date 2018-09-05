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
 * Model definition for ListBasesResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListBasesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The offset position (0-based) of the given `sequence` from the start of this `Reference`. This
   * value will differ for each page in a paginated request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long offset;

  /**
   * A substring of the bases that make up this reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sequence;

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. Provide this value in
   * a subsequent request to return the next page of results. This field will be empty if there
   * aren't any additional results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListBasesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The offset position (0-based) of the given `sequence` from the start of this `Reference`. This
   * value will differ for each page in a paginated request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOffset() {
    return offset;
  }

  /**
   * The offset position (0-based) of the given `sequence` from the start of this `Reference`. This
   * value will differ for each page in a paginated request.
   * @param offset offset or {@code null} for none
   */
  public ListBasesResponse setOffset(java.lang.Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * A substring of the bases that make up this reference.
   * @return value or {@code null} for none
   */
  public java.lang.String getSequence() {
    return sequence;
  }

  /**
   * A substring of the bases that make up this reference.
   * @param sequence sequence or {@code null} for none
   */
  public ListBasesResponse setSequence(java.lang.String sequence) {
    this.sequence = sequence;
    return this;
  }

  @Override
  public ListBasesResponse set(String fieldName, Object value) {
    return (ListBasesResponse) super.set(fieldName, value);
  }

  @Override
  public ListBasesResponse clone() {
    return (ListBasesResponse) super.clone();
  }

}
