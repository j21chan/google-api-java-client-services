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

package com.google.slides.v1.model;

/**
 * Inserts rows into a table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InsertTableRowsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The reference table cell location from which rows will be inserted.
   *
   * A new row will be inserted above (or below) the row where the reference cell is. If the
   * reference cell is a merged cell, a new row will be inserted above (or below) the merged cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellLocation cellLocation;

  /**
   * Whether to insert new rows below the reference cell location.
   *
   * - `True`: insert below the cell. - `False`: insert above the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean insertBelow;

  /**
   * The number of rows to be inserted. Maximum 20 per request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer number;

  /**
   * The table to insert rows into.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableObjectId;

  /**
   * The reference table cell location from which rows will be inserted.
   *
   * A new row will be inserted above (or below) the row where the reference cell is. If the
   * reference cell is a merged cell, a new row will be inserted above (or below) the merged cell.
   * @return value or {@code null} for none
   */
  public TableCellLocation getCellLocation() {
    return cellLocation;
  }

  /**
   * The reference table cell location from which rows will be inserted.
   *
   * A new row will be inserted above (or below) the row where the reference cell is. If the
   * reference cell is a merged cell, a new row will be inserted above (or below) the merged cell.
   * @param cellLocation cellLocation or {@code null} for none
   */
  public InsertTableRowsRequest setCellLocation(TableCellLocation cellLocation) {
    this.cellLocation = cellLocation;
    return this;
  }

  /**
   * Whether to insert new rows below the reference cell location.
   *
   * - `True`: insert below the cell. - `False`: insert above the cell.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInsertBelow() {
    return insertBelow;
  }

  /**
   * Whether to insert new rows below the reference cell location.
   *
   * - `True`: insert below the cell. - `False`: insert above the cell.
   * @param insertBelow insertBelow or {@code null} for none
   */
  public InsertTableRowsRequest setInsertBelow(java.lang.Boolean insertBelow) {
    this.insertBelow = insertBelow;
    return this;
  }

  /**
   * The number of rows to be inserted. Maximum 20 per request.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumber() {
    return number;
  }

  /**
   * The number of rows to be inserted. Maximum 20 per request.
   * @param number number or {@code null} for none
   */
  public InsertTableRowsRequest setNumber(java.lang.Integer number) {
    this.number = number;
    return this;
  }

  /**
   * The table to insert rows into.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableObjectId() {
    return tableObjectId;
  }

  /**
   * The table to insert rows into.
   * @param tableObjectId tableObjectId or {@code null} for none
   */
  public InsertTableRowsRequest setTableObjectId(java.lang.String tableObjectId) {
    this.tableObjectId = tableObjectId;
    return this;
  }

  @Override
  public InsertTableRowsRequest set(String fieldName, Object value) {
    return (InsertTableRowsRequest) super.set(fieldName, value);
  }

  @Override
  public InsertTableRowsRequest clone() {
    return (InsertTableRowsRequest) super.clone();
  }

}
