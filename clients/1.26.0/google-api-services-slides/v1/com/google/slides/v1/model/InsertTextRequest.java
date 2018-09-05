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
 * Inserts text into a shape or a table cell.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InsertTextRequest extends com.google.api.client.json.GenericJson {

  /**
   * The optional table cell location if the text is to be inserted into a table cell. If present,
   * the object_id must refer to a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellLocation cellLocation;

  /**
   * The index where the text will be inserted, in Unicode code units, based on TextElement indexes.
   *
   * The index is zero-based and is computed from the start of the string. The index may be adjusted
   * to prevent insertions inside Unicode grapheme clusters. In these cases, the text will be
   * inserted immediately after the grapheme cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer insertionIndex;

  /**
   * The object ID of the shape or table where the text will be inserted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The text to be inserted.
   *
   * Inserting a newline character will implicitly create a new ParagraphMarker at that index. The
   * paragraph style of the new paragraph will be copied from the paragraph at the current insertion
   * index, including lists and bullets.
   *
   * Text styles for inserted text will be determined automatically, generally preserving the
   * styling of neighboring text. In most cases, the text will be added to the TextRun that exists
   * at the insertion index.
   *
   * Some control characters (U+0000-U+0008, U+000C-U+001F) and characters from the Unicode Basic
   * Multilingual Plane Private Use Area (U+E000-U+F8FF) will be stripped out of the inserted text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The optional table cell location if the text is to be inserted into a table cell. If present,
   * the object_id must refer to a table.
   * @return value or {@code null} for none
   */
  public TableCellLocation getCellLocation() {
    return cellLocation;
  }

  /**
   * The optional table cell location if the text is to be inserted into a table cell. If present,
   * the object_id must refer to a table.
   * @param cellLocation cellLocation or {@code null} for none
   */
  public InsertTextRequest setCellLocation(TableCellLocation cellLocation) {
    this.cellLocation = cellLocation;
    return this;
  }

  /**
   * The index where the text will be inserted, in Unicode code units, based on TextElement indexes.
   *
   * The index is zero-based and is computed from the start of the string. The index may be adjusted
   * to prevent insertions inside Unicode grapheme clusters. In these cases, the text will be
   * inserted immediately after the grapheme cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInsertionIndex() {
    return insertionIndex;
  }

  /**
   * The index where the text will be inserted, in Unicode code units, based on TextElement indexes.
   *
   * The index is zero-based and is computed from the start of the string. The index may be adjusted
   * to prevent insertions inside Unicode grapheme clusters. In these cases, the text will be
   * inserted immediately after the grapheme cluster.
   * @param insertionIndex insertionIndex or {@code null} for none
   */
  public InsertTextRequest setInsertionIndex(java.lang.Integer insertionIndex) {
    this.insertionIndex = insertionIndex;
    return this;
  }

  /**
   * The object ID of the shape or table where the text will be inserted.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID of the shape or table where the text will be inserted.
   * @param objectId objectId or {@code null} for none
   */
  public InsertTextRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The text to be inserted.
   *
   * Inserting a newline character will implicitly create a new ParagraphMarker at that index. The
   * paragraph style of the new paragraph will be copied from the paragraph at the current insertion
   * index, including lists and bullets.
   *
   * Text styles for inserted text will be determined automatically, generally preserving the
   * styling of neighboring text. In most cases, the text will be added to the TextRun that exists
   * at the insertion index.
   *
   * Some control characters (U+0000-U+0008, U+000C-U+001F) and characters from the Unicode Basic
   * Multilingual Plane Private Use Area (U+E000-U+F8FF) will be stripped out of the inserted text.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The text to be inserted.
   *
   * Inserting a newline character will implicitly create a new ParagraphMarker at that index. The
   * paragraph style of the new paragraph will be copied from the paragraph at the current insertion
   * index, including lists and bullets.
   *
   * Text styles for inserted text will be determined automatically, generally preserving the
   * styling of neighboring text. In most cases, the text will be added to the TextRun that exists
   * at the insertion index.
   *
   * Some control characters (U+0000-U+0008, U+000C-U+001F) and characters from the Unicode Basic
   * Multilingual Plane Private Use Area (U+E000-U+F8FF) will be stripped out of the inserted text.
   * @param text text or {@code null} for none
   */
  public InsertTextRequest setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public InsertTextRequest set(String fieldName, Object value) {
    return (InsertTextRequest) super.set(fieldName, value);
  }

  @Override
  public InsertTextRequest clone() {
    return (InsertTextRequest) super.clone();
  }

}
