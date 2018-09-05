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
 * The request for updating more than one range of values in a spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchUpdateValuesByDataFilterRequest extends com.google.api.client.json.GenericJson {

  /**
   * The new values to apply to the spreadsheet.  If more than one range is matched by the specified
   * DataFilter the specified values will be applied to all of those ranges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataFilterValueRange> data;

  /**
   * Determines if the update response should include the values of the cells that were updated. By
   * default, responses do not include the updated values. The `updatedData` field within each of
   * the BatchUpdateValuesResponse.responses will contain the updated values. If the range to write
   * was larger than than the range actually written, the response will include all values in the
   * requested range (excluding trailing empty rows and columns).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeValuesInResponse;

  /**
   * Determines how dates, times, and durations in the response should be rendered. This is ignored
   * if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is
   * DateTimeRenderOption.SERIAL_NUMBER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseDateTimeRenderOption;

  /**
   * Determines how values in the response should be rendered. The default render option is
   * ValueRenderOption.FORMATTED_VALUE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseValueRenderOption;

  /**
   * How the input data should be interpreted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueInputOption;

  /**
   * The new values to apply to the spreadsheet.  If more than one range is matched by the specified
   * DataFilter the specified values will be applied to all of those ranges.
   * @return value or {@code null} for none
   */
  public java.util.List<DataFilterValueRange> getData() {
    return data;
  }

  /**
   * The new values to apply to the spreadsheet.  If more than one range is matched by the specified
   * DataFilter the specified values will be applied to all of those ranges.
   * @param data data or {@code null} for none
   */
  public BatchUpdateValuesByDataFilterRequest setData(java.util.List<DataFilterValueRange> data) {
    this.data = data;
    return this;
  }

  /**
   * Determines if the update response should include the values of the cells that were updated. By
   * default, responses do not include the updated values. The `updatedData` field within each of
   * the BatchUpdateValuesResponse.responses will contain the updated values. If the range to write
   * was larger than than the range actually written, the response will include all values in the
   * requested range (excluding trailing empty rows and columns).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeValuesInResponse() {
    return includeValuesInResponse;
  }

  /**
   * Determines if the update response should include the values of the cells that were updated. By
   * default, responses do not include the updated values. The `updatedData` field within each of
   * the BatchUpdateValuesResponse.responses will contain the updated values. If the range to write
   * was larger than than the range actually written, the response will include all values in the
   * requested range (excluding trailing empty rows and columns).
   * @param includeValuesInResponse includeValuesInResponse or {@code null} for none
   */
  public BatchUpdateValuesByDataFilterRequest setIncludeValuesInResponse(java.lang.Boolean includeValuesInResponse) {
    this.includeValuesInResponse = includeValuesInResponse;
    return this;
  }

  /**
   * Determines how dates, times, and durations in the response should be rendered. This is ignored
   * if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is
   * DateTimeRenderOption.SERIAL_NUMBER.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseDateTimeRenderOption() {
    return responseDateTimeRenderOption;
  }

  /**
   * Determines how dates, times, and durations in the response should be rendered. This is ignored
   * if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is
   * DateTimeRenderOption.SERIAL_NUMBER.
   * @param responseDateTimeRenderOption responseDateTimeRenderOption or {@code null} for none
   */
  public BatchUpdateValuesByDataFilterRequest setResponseDateTimeRenderOption(java.lang.String responseDateTimeRenderOption) {
    this.responseDateTimeRenderOption = responseDateTimeRenderOption;
    return this;
  }

  /**
   * Determines how values in the response should be rendered. The default render option is
   * ValueRenderOption.FORMATTED_VALUE.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseValueRenderOption() {
    return responseValueRenderOption;
  }

  /**
   * Determines how values in the response should be rendered. The default render option is
   * ValueRenderOption.FORMATTED_VALUE.
   * @param responseValueRenderOption responseValueRenderOption or {@code null} for none
   */
  public BatchUpdateValuesByDataFilterRequest setResponseValueRenderOption(java.lang.String responseValueRenderOption) {
    this.responseValueRenderOption = responseValueRenderOption;
    return this;
  }

  /**
   * How the input data should be interpreted.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueInputOption() {
    return valueInputOption;
  }

  /**
   * How the input data should be interpreted.
   * @param valueInputOption valueInputOption or {@code null} for none
   */
  public BatchUpdateValuesByDataFilterRequest setValueInputOption(java.lang.String valueInputOption) {
    this.valueInputOption = valueInputOption;
    return this;
  }

  @Override
  public BatchUpdateValuesByDataFilterRequest set(String fieldName, Object value) {
    return (BatchUpdateValuesByDataFilterRequest) super.set(fieldName, value);
  }

  @Override
  public BatchUpdateValuesByDataFilterRequest clone() {
    return (BatchUpdateValuesByDataFilterRequest) super.clone();
  }

}
