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
 * Automatically resizes one or more dimensions based on the contents of the cells in that
 * dimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoResizeDimensionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The dimensions to automatically resize.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionRange dimensions;

  /**
   * The dimensions to automatically resize.
   * @return value or {@code null} for none
   */
  public DimensionRange getDimensions() {
    return dimensions;
  }

  /**
   * The dimensions to automatically resize.
   * @param dimensions dimensions or {@code null} for none
   */
  public AutoResizeDimensionsRequest setDimensions(DimensionRange dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  @Override
  public AutoResizeDimensionsRequest set(String fieldName, Object value) {
    return (AutoResizeDimensionsRequest) super.set(fieldName, value);
  }

  @Override
  public AutoResizeDimensionsRequest clone() {
    return (AutoResizeDimensionsRequest) super.clone();
  }

}
