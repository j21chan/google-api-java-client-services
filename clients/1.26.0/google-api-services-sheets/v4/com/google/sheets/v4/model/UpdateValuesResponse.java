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

package com.google.sheets.v4.model;

/**
 * The response when updating a range of values in a spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateValuesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The spreadsheet the updates were applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spreadsheetId;

  /**
   * The number of cells updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer updatedCells;

  /**
   * The number of columns where at least one cell in the column was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer updatedColumns;

  /**
   * The values of the cells after updates were applied. This is only included if the request's
   * `includeValuesInResponse` field was `true`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ValueRange updatedData;

  /**
   * The range (in A1 notation) that updates were applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updatedRange;

  /**
   * The number of rows where at least one cell in the row was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer updatedRows;

  /**
   * The spreadsheet the updates were applied to.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpreadsheetId() {
    return spreadsheetId;
  }

  /**
   * The spreadsheet the updates were applied to.
   * @param spreadsheetId spreadsheetId or {@code null} for none
   */
  public UpdateValuesResponse setSpreadsheetId(java.lang.String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  /**
   * The number of cells updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUpdatedCells() {
    return updatedCells;
  }

  /**
   * The number of cells updated.
   * @param updatedCells updatedCells or {@code null} for none
   */
  public UpdateValuesResponse setUpdatedCells(java.lang.Integer updatedCells) {
    this.updatedCells = updatedCells;
    return this;
  }

  /**
   * The number of columns where at least one cell in the column was updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUpdatedColumns() {
    return updatedColumns;
  }

  /**
   * The number of columns where at least one cell in the column was updated.
   * @param updatedColumns updatedColumns or {@code null} for none
   */
  public UpdateValuesResponse setUpdatedColumns(java.lang.Integer updatedColumns) {
    this.updatedColumns = updatedColumns;
    return this;
  }

  /**
   * The values of the cells after updates were applied. This is only included if the request's
   * `includeValuesInResponse` field was `true`.
   * @return value or {@code null} for none
   */
  public ValueRange getUpdatedData() {
    return updatedData;
  }

  /**
   * The values of the cells after updates were applied. This is only included if the request's
   * `includeValuesInResponse` field was `true`.
   * @param updatedData updatedData or {@code null} for none
   */
  public UpdateValuesResponse setUpdatedData(ValueRange updatedData) {
    this.updatedData = updatedData;
    return this;
  }

  /**
   * The range (in A1 notation) that updates were applied to.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdatedRange() {
    return updatedRange;
  }

  /**
   * The range (in A1 notation) that updates were applied to.
   * @param updatedRange updatedRange or {@code null} for none
   */
  public UpdateValuesResponse setUpdatedRange(java.lang.String updatedRange) {
    this.updatedRange = updatedRange;
    return this;
  }

  /**
   * The number of rows where at least one cell in the row was updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUpdatedRows() {
    return updatedRows;
  }

  /**
   * The number of rows where at least one cell in the row was updated.
   * @param updatedRows updatedRows or {@code null} for none
   */
  public UpdateValuesResponse setUpdatedRows(java.lang.Integer updatedRows) {
    this.updatedRows = updatedRows;
    return this;
  }

  @Override
  public UpdateValuesResponse set(String fieldName, Object value) {
    return (UpdateValuesResponse) super.set(fieldName, value);
  }

  @Override
  public UpdateValuesResponse clone() {
    return (UpdateValuesResponse) super.clone();
  }

}
