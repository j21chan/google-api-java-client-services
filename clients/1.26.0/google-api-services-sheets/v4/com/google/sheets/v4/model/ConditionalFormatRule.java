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
 * A rule describing a conditional format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConditionalFormatRule extends com.google.api.client.json.GenericJson {

  /**
   * The formatting is either "on" or "off" according to the rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BooleanRule booleanRule;

  /**
   * The formatting will vary based on the gradients in the rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GradientRule gradientRule;

  /**
   * The ranges that are formatted if the condition is true. All the ranges must be on the same
   * grid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GridRange> ranges;

  /**
   * The formatting is either "on" or "off" according to the rule.
   * @return value or {@code null} for none
   */
  public BooleanRule getBooleanRule() {
    return booleanRule;
  }

  /**
   * The formatting is either "on" or "off" according to the rule.
   * @param booleanRule booleanRule or {@code null} for none
   */
  public ConditionalFormatRule setBooleanRule(BooleanRule booleanRule) {
    this.booleanRule = booleanRule;
    return this;
  }

  /**
   * The formatting will vary based on the gradients in the rule.
   * @return value or {@code null} for none
   */
  public GradientRule getGradientRule() {
    return gradientRule;
  }

  /**
   * The formatting will vary based on the gradients in the rule.
   * @param gradientRule gradientRule or {@code null} for none
   */
  public ConditionalFormatRule setGradientRule(GradientRule gradientRule) {
    this.gradientRule = gradientRule;
    return this;
  }

  /**
   * The ranges that are formatted if the condition is true. All the ranges must be on the same
   * grid.
   * @return value or {@code null} for none
   */
  public java.util.List<GridRange> getRanges() {
    return ranges;
  }

  /**
   * The ranges that are formatted if the condition is true. All the ranges must be on the same
   * grid.
   * @param ranges ranges or {@code null} for none
   */
  public ConditionalFormatRule setRanges(java.util.List<GridRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  @Override
  public ConditionalFormatRule set(String fieldName, Object value) {
    return (ConditionalFormatRule) super.set(fieldName, value);
  }

  @Override
  public ConditionalFormatRule clone() {
    return (ConditionalFormatRule) super.clone();
  }

}
