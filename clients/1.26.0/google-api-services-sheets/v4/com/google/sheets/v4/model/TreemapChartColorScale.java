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
 * A color scale for a treemap chart.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TreemapChartColorScale extends com.google.api.client.json.GenericJson {

  /**
   * The background color for cells with a color value greater than or equal to maxValue. Defaults
   * to #109618 if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color maxValueColor;

  /**
   * The background color for cells with a color value at the midpoint between minValue and
   * maxValue. Defaults to #efe6dc if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color midValueColor;

  /**
   * The background color for cells with a color value less than or equal to minValue. Defaults to
   * #dc3912 if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color minValueColor;

  /**
   * The background color for cells that have no color data associated with them. Defaults to
   * #000000 if not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color noDataColor;

  /**
   * The background color for cells with a color value greater than or equal to maxValue. Defaults
   * to #109618 if not specified.
   * @return value or {@code null} for none
   */
  public Color getMaxValueColor() {
    return maxValueColor;
  }

  /**
   * The background color for cells with a color value greater than or equal to maxValue. Defaults
   * to #109618 if not specified.
   * @param maxValueColor maxValueColor or {@code null} for none
   */
  public TreemapChartColorScale setMaxValueColor(Color maxValueColor) {
    this.maxValueColor = maxValueColor;
    return this;
  }

  /**
   * The background color for cells with a color value at the midpoint between minValue and
   * maxValue. Defaults to #efe6dc if not specified.
   * @return value or {@code null} for none
   */
  public Color getMidValueColor() {
    return midValueColor;
  }

  /**
   * The background color for cells with a color value at the midpoint between minValue and
   * maxValue. Defaults to #efe6dc if not specified.
   * @param midValueColor midValueColor or {@code null} for none
   */
  public TreemapChartColorScale setMidValueColor(Color midValueColor) {
    this.midValueColor = midValueColor;
    return this;
  }

  /**
   * The background color for cells with a color value less than or equal to minValue. Defaults to
   * #dc3912 if not specified.
   * @return value or {@code null} for none
   */
  public Color getMinValueColor() {
    return minValueColor;
  }

  /**
   * The background color for cells with a color value less than or equal to minValue. Defaults to
   * #dc3912 if not specified.
   * @param minValueColor minValueColor or {@code null} for none
   */
  public TreemapChartColorScale setMinValueColor(Color minValueColor) {
    this.minValueColor = minValueColor;
    return this;
  }

  /**
   * The background color for cells that have no color data associated with them. Defaults to
   * #000000 if not specified.
   * @return value or {@code null} for none
   */
  public Color getNoDataColor() {
    return noDataColor;
  }

  /**
   * The background color for cells that have no color data associated with them. Defaults to
   * #000000 if not specified.
   * @param noDataColor noDataColor or {@code null} for none
   */
  public TreemapChartColorScale setNoDataColor(Color noDataColor) {
    this.noDataColor = noDataColor;
    return this;
  }

  @Override
  public TreemapChartColorScale set(String fieldName, Object value) {
    return (TreemapChartColorScale) super.set(fieldName, value);
  }

  @Override
  public TreemapChartColorScale clone() {
    return (TreemapChartColorScale) super.clone();
  }

}
