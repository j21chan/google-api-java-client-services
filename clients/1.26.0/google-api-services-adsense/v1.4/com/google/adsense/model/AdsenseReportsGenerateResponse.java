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

package com.google.adsense.model;

/**
 * Model definition for AdsenseReportsGenerateResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdsenseReportsGenerateResponse extends com.google.api.client.json.GenericJson {

  /**
   * The averages of the report. This is the same length as any other row in the report; cells
   * corresponding to dimension columns are empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> averages;

  /**
   * The requested end date in yyyy-mm-dd format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * The header information of the columns requested in the report. This is a list of headers; one
   * for each dimension in the request, followed by one for each metric in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Headers> headers;

  static {
    // hack to force ProGuard to consider Headers used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Headers.class);
  }

  /**
   * Kind this is, in this case adsense#report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The output rows of the report. Each row is a list of cells; one for each dimension in the
   * request, followed by one for each metric in the request. The dimension cells contain strings,
   * and the metric cells contain numbers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.List<java.lang.String>> rows;

  /**
   * The requested start date in yyyy-mm-dd format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * The total number of rows matched by the report request. Fewer rows may be returned in the
   * response due to being limited by the row count requested or the report row limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalMatchedRows;

  /**
   * The totals of the report. This is the same length as any other row in the report; cells
   * corresponding to dimension columns are empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> totals;

  /**
   * Any warnings associated with generation of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> warnings;

  /**
   * The averages of the report. This is the same length as any other row in the report; cells
   * corresponding to dimension columns are empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAverages() {
    return averages;
  }

  /**
   * The averages of the report. This is the same length as any other row in the report; cells
   * corresponding to dimension columns are empty.
   * @param averages averages or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setAverages(java.util.List<java.lang.String> averages) {
    this.averages = averages;
    return this;
  }

  /**
   * The requested end date in yyyy-mm-dd format.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * The requested end date in yyyy-mm-dd format.
   * @param endDate endDate or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The header information of the columns requested in the report. This is a list of headers; one
   * for each dimension in the request, followed by one for each metric in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<Headers> getHeaders() {
    return headers;
  }

  /**
   * The header information of the columns requested in the report. This is a list of headers; one
   * for each dimension in the request, followed by one for each metric in the request.
   * @param headers headers or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setHeaders(java.util.List<Headers> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Kind this is, in this case adsense#report.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind this is, in this case adsense#report.
   * @param kind kind or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The output rows of the report. Each row is a list of cells; one for each dimension in the
   * request, followed by one for each metric in the request. The dimension cells contain strings,
   * and the metric cells contain numbers.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.List<java.lang.String>> getRows() {
    return rows;
  }

  /**
   * The output rows of the report. Each row is a list of cells; one for each dimension in the
   * request, followed by one for each metric in the request. The dimension cells contain strings,
   * and the metric cells contain numbers.
   * @param rows rows or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setRows(java.util.List<java.util.List<java.lang.String>> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * The requested start date in yyyy-mm-dd format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * The requested start date in yyyy-mm-dd format.
   * @param startDate startDate or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The total number of rows matched by the report request. Fewer rows may be returned in the
   * response due to being limited by the row count requested or the report row limit.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalMatchedRows() {
    return totalMatchedRows;
  }

  /**
   * The total number of rows matched by the report request. Fewer rows may be returned in the
   * response due to being limited by the row count requested or the report row limit.
   * @param totalMatchedRows totalMatchedRows or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setTotalMatchedRows(java.lang.Long totalMatchedRows) {
    this.totalMatchedRows = totalMatchedRows;
    return this;
  }

  /**
   * The totals of the report. This is the same length as any other row in the report; cells
   * corresponding to dimension columns are empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTotals() {
    return totals;
  }

  /**
   * The totals of the report. This is the same length as any other row in the report; cells
   * corresponding to dimension columns are empty.
   * @param totals totals or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setTotals(java.util.List<java.lang.String> totals) {
    this.totals = totals;
    return this;
  }

  /**
   * Any warnings associated with generation of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWarnings() {
    return warnings;
  }

  /**
   * Any warnings associated with generation of the report.
   * @param warnings warnings or {@code null} for none
   */
  public AdsenseReportsGenerateResponse setWarnings(java.util.List<java.lang.String> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public AdsenseReportsGenerateResponse set(String fieldName, Object value) {
    return (AdsenseReportsGenerateResponse) super.set(fieldName, value);
  }

  @Override
  public AdsenseReportsGenerateResponse clone() {
    return (AdsenseReportsGenerateResponse) super.clone();
  }

  /**
   * Model definition for AdsenseReportsGenerateResponseHeaders.
   */
  public static final class Headers extends com.google.api.client.json.GenericJson {

    /**
     * The currency of this column. Only present if the header type is METRIC_CURRENCY.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The name of the header.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The type of the header; one of DIMENSION, METRIC_TALLY, METRIC_RATIO, or METRIC_CURRENCY.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * The currency of this column. Only present if the header type is METRIC_CURRENCY.
     * @return value or {@code null} for none
     */
    public java.lang.String getCurrency() {
      return currency;
    }

    /**
     * The currency of this column. Only present if the header type is METRIC_CURRENCY.
     * @param currency currency or {@code null} for none
     */
    public Headers setCurrency(java.lang.String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The name of the header.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * The name of the header.
     * @param name name or {@code null} for none
     */
    public Headers setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    /**
     * The type of the header; one of DIMENSION, METRIC_TALLY, METRIC_RATIO, or METRIC_CURRENCY.
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * The type of the header; one of DIMENSION, METRIC_TALLY, METRIC_RATIO, or METRIC_CURRENCY.
     * @param type type or {@code null} for none
     */
    public Headers setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    @Override
    public Headers set(String fieldName, Object value) {
      return (Headers) super.set(fieldName, value);
    }

    @Override
    public Headers clone() {
      return (Headers) super.clone();
    }

  }

}
