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

package com.google.toolresults.model;

/**
 * Response message for HistoryService.List
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListHistoriesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Histories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<History> histories;

  static {
    // hack to force ProGuard to consider History used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(History.class);
  }

  /**
   * A continuation token to resume the query at the next item.
   *
   * Will only be set if there are more histories to fetch.
   *
   * Tokens are valid for up to one hour from the time of the first list request. For instance, if
   * you make a list request at 1PM and use the token from this first request 10 minutes later, the
   * token from this second response will only be valid for 50 minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Histories.
   * @return value or {@code null} for none
   */
  public java.util.List<History> getHistories() {
    return histories;
  }

  /**
   * Histories.
   * @param histories histories or {@code null} for none
   */
  public ListHistoriesResponse setHistories(java.util.List<History> histories) {
    this.histories = histories;
    return this;
  }

  /**
   * A continuation token to resume the query at the next item.
   *
   * Will only be set if there are more histories to fetch.
   *
   * Tokens are valid for up to one hour from the time of the first list request. For instance, if
   * you make a list request at 1PM and use the token from this first request 10 minutes later, the
   * token from this second response will only be valid for 50 minutes.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A continuation token to resume the query at the next item.
   *
   * Will only be set if there are more histories to fetch.
   *
   * Tokens are valid for up to one hour from the time of the first list request. For instance, if
   * you make a list request at 1PM and use the token from this first request 10 minutes later, the
   * token from this second response will only be valid for 50 minutes.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListHistoriesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListHistoriesResponse set(String fieldName, Object value) {
    return (ListHistoriesResponse) super.set(fieldName, value);
  }

  @Override
  public ListHistoriesResponse clone() {
    return (ListHistoriesResponse) super.clone();
  }

}
