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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * Response message for listing all reasons for which a buyer was not billed for a winning bid.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListNonBillableWinningBidsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to retrieve the next page of results. Pass this value in the
   * ListNonBillableWinningBidsRequest.pageToken field in the subsequent call to the
   * nonBillableWinningBids.list method to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * List of rows, with counts of bids not billed aggregated by reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NonBillableWinningBidStatusRow> nonBillableWinningBidStatusRows;

  /**
   * A token to retrieve the next page of results. Pass this value in the
   * ListNonBillableWinningBidsRequest.pageToken field in the subsequent call to the
   * nonBillableWinningBids.list method to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results. Pass this value in the
   * ListNonBillableWinningBidsRequest.pageToken field in the subsequent call to the
   * nonBillableWinningBids.list method to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListNonBillableWinningBidsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * List of rows, with counts of bids not billed aggregated by reason.
   * @return value or {@code null} for none
   */
  public java.util.List<NonBillableWinningBidStatusRow> getNonBillableWinningBidStatusRows() {
    return nonBillableWinningBidStatusRows;
  }

  /**
   * List of rows, with counts of bids not billed aggregated by reason.
   * @param nonBillableWinningBidStatusRows nonBillableWinningBidStatusRows or {@code null} for none
   */
  public ListNonBillableWinningBidsResponse setNonBillableWinningBidStatusRows(java.util.List<NonBillableWinningBidStatusRow> nonBillableWinningBidStatusRows) {
    this.nonBillableWinningBidStatusRows = nonBillableWinningBidStatusRows;
    return this;
  }

  @Override
  public ListNonBillableWinningBidsResponse set(String fieldName, Object value) {
    return (ListNonBillableWinningBidsResponse) super.set(fieldName, value);
  }

  @Override
  public ListNonBillableWinningBidsResponse clone() {
    return (ListNonBillableWinningBidsResponse) super.clone();
  }

}
