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
 * Properties that describe the style of a line.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LineStyle extends com.google.api.client.json.GenericJson {

  /**
   * The dash type of the line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The thickness of the line, in px.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * The dash type of the line.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The dash type of the line.
   * @param type type or {@code null} for none
   */
  public LineStyle setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The thickness of the line, in px.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * The thickness of the line, in px.
   * @param width width or {@code null} for none
   */
  public LineStyle setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public LineStyle set(String fieldName, Object value) {
    return (LineStyle) super.set(fieldName, value);
  }

  @Override
  public LineStyle clone() {
    return (LineStyle) super.clone();
  }

}
