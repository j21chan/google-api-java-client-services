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
 * A table range represents a reference to a subset of a table.
 *
 * It's important to note that the cells specified by a table range do not necessarily form a
 * rectangle. For example, let's say we have a 3 x 3 table where all the cells of the last row are
 * merged together. The table looks like this:
 *
 *                     [             ]
 *
 * A table range with location = (0, 0), row span = 3 and column span = 2 specifies the following
 * cells:
 *
 *       x     x       [      x      ]
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableRange extends com.google.api.client.json.GenericJson {

  /**
   * The column span of the table range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnSpan;

  /**
   * The starting location of the table range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellLocation location;

  /**
   * The row span of the table range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowSpan;

  /**
   * The column span of the table range.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnSpan() {
    return columnSpan;
  }

  /**
   * The column span of the table range.
   * @param columnSpan columnSpan or {@code null} for none
   */
  public TableRange setColumnSpan(java.lang.Integer columnSpan) {
    this.columnSpan = columnSpan;
    return this;
  }

  /**
   * The starting location of the table range.
   * @return value or {@code null} for none
   */
  public TableCellLocation getLocation() {
    return location;
  }

  /**
   * The starting location of the table range.
   * @param location location or {@code null} for none
   */
  public TableRange setLocation(TableCellLocation location) {
    this.location = location;
    return this;
  }

  /**
   * The row span of the table range.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowSpan() {
    return rowSpan;
  }

  /**
   * The row span of the table range.
   * @param rowSpan rowSpan or {@code null} for none
   */
  public TableRange setRowSpan(java.lang.Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

  @Override
  public TableRange set(String fieldName, Object value) {
    return (TableRange) super.set(fieldName, value);
  }

  @Override
  public TableRange clone() {
    return (TableRange) super.clone();
  }

}
