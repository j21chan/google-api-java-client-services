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
 * A PageElement kind representing a table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Table extends com.google.api.client.json.GenericJson {

  /**
   * Number of columns in the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columns;

  /**
   * Properties of horizontal cell borders.
   *
   * A table's horizontal cell borders are represented as a grid. The grid has one more row than the
   * number of rows in the table and the same number of columns as the table. For example, if the
   * table is 3 x 3, its horizontal borders will be represented as a grid with 4 rows and 3 columns.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableBorderRow> horizontalBorderRows;

  /**
   * Number of rows in the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rows;

  /**
   * Properties of each column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableColumnProperties> tableColumns;

  /**
   * Properties and contents of each row.
   *
   * Cells that span multiple rows are contained in only one of these rows and have a row_span
   * greater than 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableRow> tableRows;

  /**
   * Properties of vertical cell borders.
   *
   * A table's vertical cell borders are represented as a grid. The grid has the same number of rows
   * as the table and one more column than the number of columns in the table. For example, if the
   * table is 3 x 3, its vertical borders will be represented as a grid with 3 rows and 4 columns.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableBorderRow> verticalBorderRows;

  /**
   * Number of columns in the table.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumns() {
    return columns;
  }

  /**
   * Number of columns in the table.
   * @param columns columns or {@code null} for none
   */
  public Table setColumns(java.lang.Integer columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Properties of horizontal cell borders.
   *
   * A table's horizontal cell borders are represented as a grid. The grid has one more row than the
   * number of rows in the table and the same number of columns as the table. For example, if the
   * table is 3 x 3, its horizontal borders will be represented as a grid with 4 rows and 3 columns.
   * @return value or {@code null} for none
   */
  public java.util.List<TableBorderRow> getHorizontalBorderRows() {
    return horizontalBorderRows;
  }

  /**
   * Properties of horizontal cell borders.
   *
   * A table's horizontal cell borders are represented as a grid. The grid has one more row than the
   * number of rows in the table and the same number of columns as the table. For example, if the
   * table is 3 x 3, its horizontal borders will be represented as a grid with 4 rows and 3 columns.
   * @param horizontalBorderRows horizontalBorderRows or {@code null} for none
   */
  public Table setHorizontalBorderRows(java.util.List<TableBorderRow> horizontalBorderRows) {
    this.horizontalBorderRows = horizontalBorderRows;
    return this;
  }

  /**
   * Number of rows in the table.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRows() {
    return rows;
  }

  /**
   * Number of rows in the table.
   * @param rows rows or {@code null} for none
   */
  public Table setRows(java.lang.Integer rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Properties of each column.
   * @return value or {@code null} for none
   */
  public java.util.List<TableColumnProperties> getTableColumns() {
    return tableColumns;
  }

  /**
   * Properties of each column.
   * @param tableColumns tableColumns or {@code null} for none
   */
  public Table setTableColumns(java.util.List<TableColumnProperties> tableColumns) {
    this.tableColumns = tableColumns;
    return this;
  }

  /**
   * Properties and contents of each row.
   *
   * Cells that span multiple rows are contained in only one of these rows and have a row_span
   * greater than 1.
   * @return value or {@code null} for none
   */
  public java.util.List<TableRow> getTableRows() {
    return tableRows;
  }

  /**
   * Properties and contents of each row.
   *
   * Cells that span multiple rows are contained in only one of these rows and have a row_span
   * greater than 1.
   * @param tableRows tableRows or {@code null} for none
   */
  public Table setTableRows(java.util.List<TableRow> tableRows) {
    this.tableRows = tableRows;
    return this;
  }

  /**
   * Properties of vertical cell borders.
   *
   * A table's vertical cell borders are represented as a grid. The grid has the same number of rows
   * as the table and one more column than the number of columns in the table. For example, if the
   * table is 3 x 3, its vertical borders will be represented as a grid with 3 rows and 4 columns.
   * @return value or {@code null} for none
   */
  public java.util.List<TableBorderRow> getVerticalBorderRows() {
    return verticalBorderRows;
  }

  /**
   * Properties of vertical cell borders.
   *
   * A table's vertical cell borders are represented as a grid. The grid has the same number of rows
   * as the table and one more column than the number of columns in the table. For example, if the
   * table is 3 x 3, its vertical borders will be represented as a grid with 3 rows and 4 columns.
   * @param verticalBorderRows verticalBorderRows or {@code null} for none
   */
  public Table setVerticalBorderRows(java.util.List<TableBorderRow> verticalBorderRows) {
    this.verticalBorderRows = verticalBorderRows;
    return this;
  }

  @Override
  public Table set(String fieldName, Object value) {
    return (Table) super.set(fieldName, value);
  }

  @Override
  public Table clone() {
    return (Table) super.clone();
  }

}
