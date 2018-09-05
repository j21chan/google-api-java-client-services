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

package com.google.youtubeAnalytics.model;

/**
 * Contains a single result table. The table is returned as an array of rows that contain the values
 * for the cells of the table. Depending on the metric or dimension, the cell can contain a string
 * (video ID, country code) or a number (number of views or number of likes).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Analytics API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResultTable extends com.google.api.client.json.GenericJson {

  /**
   * This value specifies information about the data returned in the rows fields. Each item in the
   * columnHeaders list identifies a field returned in the rows value, which contains a list of
   * comma-delimited data. The columnHeaders list will begin with the dimensions specified in the
   * API request, which will be followed by the metrics specified in the API request. The order of
   * both dimensions and metrics will match the ordering in the API request. For example, if the API
   * request contains the parameters dimensions=ageGroup,gender=viewerPercentage, the API response
   * will return columns in this order: ageGroup,gender,viewerPercentage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ColumnHeaders> columnHeaders;

  static {
    // hack to force ProGuard to consider ColumnHeaders used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ColumnHeaders.class);
  }

  /**
   * This value specifies the type of data included in the API response. For the query method, the
   * kind property value will be youtubeAnalytics#resultTable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The list contains all rows of the result table. Each item in the list is an array that contains
   * comma-delimited data corresponding to a single row of data. The order of the comma-delimited
   * data fields will match the order of the columns listed in the columnHeaders field. If no data
   * is available for the given query, the rows element will be omitted from the response. The
   * response for a query with the day dimension will not contain rows for the most recent days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.List<java.lang.Object>> rows;

  /**
   * This value specifies information about the data returned in the rows fields. Each item in the
   * columnHeaders list identifies a field returned in the rows value, which contains a list of
   * comma-delimited data. The columnHeaders list will begin with the dimensions specified in the
   * API request, which will be followed by the metrics specified in the API request. The order of
   * both dimensions and metrics will match the ordering in the API request. For example, if the API
   * request contains the parameters dimensions=ageGroup,gender=viewerPercentage, the API response
   * will return columns in this order: ageGroup,gender,viewerPercentage.
   * @return value or {@code null} for none
   */
  public java.util.List<ColumnHeaders> getColumnHeaders() {
    return columnHeaders;
  }

  /**
   * This value specifies information about the data returned in the rows fields. Each item in the
   * columnHeaders list identifies a field returned in the rows value, which contains a list of
   * comma-delimited data. The columnHeaders list will begin with the dimensions specified in the
   * API request, which will be followed by the metrics specified in the API request. The order of
   * both dimensions and metrics will match the ordering in the API request. For example, if the API
   * request contains the parameters dimensions=ageGroup,gender=viewerPercentage, the API response
   * will return columns in this order: ageGroup,gender,viewerPercentage.
   * @param columnHeaders columnHeaders or {@code null} for none
   */
  public ResultTable setColumnHeaders(java.util.List<ColumnHeaders> columnHeaders) {
    this.columnHeaders = columnHeaders;
    return this;
  }

  /**
   * This value specifies the type of data included in the API response. For the query method, the
   * kind property value will be youtubeAnalytics#resultTable.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This value specifies the type of data included in the API response. For the query method, the
   * kind property value will be youtubeAnalytics#resultTable.
   * @param kind kind or {@code null} for none
   */
  public ResultTable setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The list contains all rows of the result table. Each item in the list is an array that contains
   * comma-delimited data corresponding to a single row of data. The order of the comma-delimited
   * data fields will match the order of the columns listed in the columnHeaders field. If no data
   * is available for the given query, the rows element will be omitted from the response. The
   * response for a query with the day dimension will not contain rows for the most recent days.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.List<java.lang.Object>> getRows() {
    return rows;
  }

  /**
   * The list contains all rows of the result table. Each item in the list is an array that contains
   * comma-delimited data corresponding to a single row of data. The order of the comma-delimited
   * data fields will match the order of the columns listed in the columnHeaders field. If no data
   * is available for the given query, the rows element will be omitted from the response. The
   * response for a query with the day dimension will not contain rows for the most recent days.
   * @param rows rows or {@code null} for none
   */
  public ResultTable setRows(java.util.List<java.util.List<java.lang.Object>> rows) {
    this.rows = rows;
    return this;
  }

  @Override
  public ResultTable set(String fieldName, Object value) {
    return (ResultTable) super.set(fieldName, value);
  }

  @Override
  public ResultTable clone() {
    return (ResultTable) super.clone();
  }

  /**
   * Model definition for ResultTableColumnHeaders.
   */
  public static final class ColumnHeaders extends com.google.api.client.json.GenericJson {

    /**
     * The type of the column (DIMENSION or METRIC).
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String columnType;

    /**
     * The type of the data in the column (STRING, INTEGER, FLOAT, etc.).
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String dataType;

    /**
     * The name of the dimension or metric.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The type of the column (DIMENSION or METRIC).
     * @return value or {@code null} for none
     */
    public java.lang.String getColumnType() {
      return columnType;
    }

    /**
     * The type of the column (DIMENSION or METRIC).
     * @param columnType columnType or {@code null} for none
     */
    public ColumnHeaders setColumnType(java.lang.String columnType) {
      this.columnType = columnType;
      return this;
    }

    /**
     * The type of the data in the column (STRING, INTEGER, FLOAT, etc.).
     * @return value or {@code null} for none
     */
    public java.lang.String getDataType() {
      return dataType;
    }

    /**
     * The type of the data in the column (STRING, INTEGER, FLOAT, etc.).
     * @param dataType dataType or {@code null} for none
     */
    public ColumnHeaders setDataType(java.lang.String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * The name of the dimension or metric.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * The name of the dimension or metric.
     * @param name name or {@code null} for none
     */
    public ColumnHeaders setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    @Override
    public ColumnHeaders set(String fieldName, Object value) {
      return (ColumnHeaders) super.set(fieldName, value);
    }

    @Override
    public ColumnHeaders clone() {
      return (ColumnHeaders) super.clone();
    }

  }

}
