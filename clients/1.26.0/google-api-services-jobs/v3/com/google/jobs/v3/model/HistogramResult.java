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

package com.google.jobs.v3.model;

/**
 * Output only.
 *
 * Result of a histogram call. The response contains the histogram map for the search type specified
 * by HistogramResult.field. The response is a map of each filter value to the corresponding count
 * of jobs for that filter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HistogramResult extends com.google.api.client.json.GenericJson {

  /**
   * The Histogram search filters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchType;

  /**
   * A map from the values of field to the number of jobs with that value in this search result.
   *
   * Key: search type (filter names, such as the companyName).
   *
   * Values: the count of jobs that match the filter for this search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Integer> values;

  /**
   * The Histogram search filters.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchType() {
    return searchType;
  }

  /**
   * The Histogram search filters.
   * @param searchType searchType or {@code null} for none
   */
  public HistogramResult setSearchType(java.lang.String searchType) {
    this.searchType = searchType;
    return this;
  }

  /**
   * A map from the values of field to the number of jobs with that value in this search result.
   *
   * Key: search type (filter names, such as the companyName).
   *
   * Values: the count of jobs that match the filter for this search.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Integer> getValues() {
    return values;
  }

  /**
   * A map from the values of field to the number of jobs with that value in this search result.
   *
   * Key: search type (filter names, such as the companyName).
   *
   * Values: the count of jobs that match the filter for this search.
   * @param values values or {@code null} for none
   */
  public HistogramResult setValues(java.util.Map<String, java.lang.Integer> values) {
    this.values = values;
    return this;
  }

  @Override
  public HistogramResult set(String fieldName, Object value) {
    return (HistogramResult) super.set(fieldName, value);
  }

  @Override
  public HistogramResult clone() {
    return (HistogramResult) super.clone();
  }

}
