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
 * The result of the find/replace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FindReplaceResponse extends com.google.api.client.json.GenericJson {

  /**
   * The number of formula cells changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer formulasChanged;

  /**
   * The number of occurrences (possibly multiple within a cell) changed. For example, if replacing
   * `"e"` with `"o"` in `"Google Sheets"`, this would be `"3"` because `"Google Sheets"` ->
   * `"Googlo Shoots"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer occurrencesChanged;

  /**
   * The number of rows changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowsChanged;

  /**
   * The number of sheets changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sheetsChanged;

  /**
   * The number of non-formula cells changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer valuesChanged;

  /**
   * The number of formula cells changed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFormulasChanged() {
    return formulasChanged;
  }

  /**
   * The number of formula cells changed.
   * @param formulasChanged formulasChanged or {@code null} for none
   */
  public FindReplaceResponse setFormulasChanged(java.lang.Integer formulasChanged) {
    this.formulasChanged = formulasChanged;
    return this;
  }

  /**
   * The number of occurrences (possibly multiple within a cell) changed. For example, if replacing
   * `"e"` with `"o"` in `"Google Sheets"`, this would be `"3"` because `"Google Sheets"` ->
   * `"Googlo Shoots"`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOccurrencesChanged() {
    return occurrencesChanged;
  }

  /**
   * The number of occurrences (possibly multiple within a cell) changed. For example, if replacing
   * `"e"` with `"o"` in `"Google Sheets"`, this would be `"3"` because `"Google Sheets"` ->
   * `"Googlo Shoots"`.
   * @param occurrencesChanged occurrencesChanged or {@code null} for none
   */
  public FindReplaceResponse setOccurrencesChanged(java.lang.Integer occurrencesChanged) {
    this.occurrencesChanged = occurrencesChanged;
    return this;
  }

  /**
   * The number of rows changed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowsChanged() {
    return rowsChanged;
  }

  /**
   * The number of rows changed.
   * @param rowsChanged rowsChanged or {@code null} for none
   */
  public FindReplaceResponse setRowsChanged(java.lang.Integer rowsChanged) {
    this.rowsChanged = rowsChanged;
    return this;
  }

  /**
   * The number of sheets changed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSheetsChanged() {
    return sheetsChanged;
  }

  /**
   * The number of sheets changed.
   * @param sheetsChanged sheetsChanged or {@code null} for none
   */
  public FindReplaceResponse setSheetsChanged(java.lang.Integer sheetsChanged) {
    this.sheetsChanged = sheetsChanged;
    return this;
  }

  /**
   * The number of non-formula cells changed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getValuesChanged() {
    return valuesChanged;
  }

  /**
   * The number of non-formula cells changed.
   * @param valuesChanged valuesChanged or {@code null} for none
   */
  public FindReplaceResponse setValuesChanged(java.lang.Integer valuesChanged) {
    this.valuesChanged = valuesChanged;
    return this;
  }

  @Override
  public FindReplaceResponse set(String fieldName, Object value) {
    return (FindReplaceResponse) super.set(fieldName, value);
  }

  @Override
  public FindReplaceResponse clone() {
    return (FindReplaceResponse) super.clone();
  }

}
