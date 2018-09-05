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
 * Styles for a waterfall chart column.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WaterfallChartColumnStyle extends com.google.api.client.json.GenericJson {

  /**
   * The color of the column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color color;

  /**
   * The label of the column's legend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * The color of the column.
   * @return value or {@code null} for none
   */
  public Color getColor() {
    return color;
  }

  /**
   * The color of the column.
   * @param color color or {@code null} for none
   */
  public WaterfallChartColumnStyle setColor(Color color) {
    this.color = color;
    return this;
  }

  /**
   * The label of the column's legend.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * The label of the column's legend.
   * @param label label or {@code null} for none
   */
  public WaterfallChartColumnStyle setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  @Override
  public WaterfallChartColumnStyle set(String fieldName, Object value) {
    return (WaterfallChartColumnStyle) super.set(fieldName, value);
  }

  @Override
  public WaterfallChartColumnStyle clone() {
    return (WaterfallChartColumnStyle) super.clone();
  }

}
