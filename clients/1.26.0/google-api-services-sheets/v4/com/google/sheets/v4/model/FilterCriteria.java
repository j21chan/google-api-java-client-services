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
 * Criteria for showing/hiding rows in a filter or filter view.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FilterCriteria extends com.google.api.client.json.GenericJson {

  /**
   * A condition that must be true for values to be shown. (This does not override hiddenValues --
   * if a value is listed there,  it will still be hidden.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BooleanCondition condition;

  /**
   * Values that should be hidden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> hiddenValues;

  /**
   * A condition that must be true for values to be shown. (This does not override hiddenValues --
   * if a value is listed there,  it will still be hidden.)
   * @return value or {@code null} for none
   */
  public BooleanCondition getCondition() {
    return condition;
  }

  /**
   * A condition that must be true for values to be shown. (This does not override hiddenValues --
   * if a value is listed there,  it will still be hidden.)
   * @param condition condition or {@code null} for none
   */
  public FilterCriteria setCondition(BooleanCondition condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Values that should be hidden.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getHiddenValues() {
    return hiddenValues;
  }

  /**
   * Values that should be hidden.
   * @param hiddenValues hiddenValues or {@code null} for none
   */
  public FilterCriteria setHiddenValues(java.util.List<java.lang.String> hiddenValues) {
    this.hiddenValues = hiddenValues;
    return this;
  }

  @Override
  public FilterCriteria set(String fieldName, Object value) {
    return (FilterCriteria) super.set(fieldName, value);
  }

  @Override
  public FilterCriteria clone() {
    return (FilterCriteria) super.clone();
  }

}
