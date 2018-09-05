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
 * Updates the state of the specified group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateDimensionGroupRequest extends com.google.api.client.json.GenericJson {

  /**
   * The group whose state should be updated. The range and depth of the group should specify a
   * valid group on the sheet, and all other fields updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionGroup dimensionGroup;

  /**
   * The fields that should be updated.  At least one field must be specified. The root
   * `dimensionGroup` is implied and should not be specified. A single `"*"` can be used as short-
   * hand for listing every field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * The group whose state should be updated. The range and depth of the group should specify a
   * valid group on the sheet, and all other fields updated.
   * @return value or {@code null} for none
   */
  public DimensionGroup getDimensionGroup() {
    return dimensionGroup;
  }

  /**
   * The group whose state should be updated. The range and depth of the group should specify a
   * valid group on the sheet, and all other fields updated.
   * @param dimensionGroup dimensionGroup or {@code null} for none
   */
  public UpdateDimensionGroupRequest setDimensionGroup(DimensionGroup dimensionGroup) {
    this.dimensionGroup = dimensionGroup;
    return this;
  }

  /**
   * The fields that should be updated.  At least one field must be specified. The root
   * `dimensionGroup` is implied and should not be specified. A single `"*"` can be used as short-
   * hand for listing every field.
   * @return value or {@code null} for none
   */
  public String getFields() {
    return fields;
  }

  /**
   * The fields that should be updated.  At least one field must be specified. The root
   * `dimensionGroup` is implied and should not be specified. A single `"*"` can be used as short-
   * hand for listing every field.
   * @param fields fields or {@code null} for none
   */
  public UpdateDimensionGroupRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  @Override
  public UpdateDimensionGroupRequest set(String fieldName, Object value) {
    return (UpdateDimensionGroupRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateDimensionGroupRequest clone() {
    return (UpdateDimensionGroupRequest) super.clone();
  }

}
