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

package com.google.dlp.v2.model;

/**
 * The field type of `value` and `field` do not need to match to be considered equal, but not all
 * comparisons are possible.
 *
 * A `value` of type:
 *
 * - `string` can be compared against all other types - `boolean` can only be compared against other
 * booleans - `integer` can be compared against doubles or a string if the string value can be
 * parsed as an integer. - `double` can be compared against integers or a string if the string can
 * be parsed as a double. - `Timestamp` can be compared against strings in RFC 3339 date string
 * format. - `TimeOfDay` can be compared against timestamps and strings in the format of 'HH:mm:ss'.
 *
 * If we fail to compare do to type mismatch, a warning will be given and the condition will
 * evaluate to false.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2Condition extends com.google.api.client.json.GenericJson {

  /**
   * Field within the record this condition is evaluated against. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId field;

  /**
   * Operator used to compare the field or infoType to the value. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operator;

  /**
   * Value to compare against. [Required, except for `EXISTS` tests.]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Value value;

  /**
   * Field within the record this condition is evaluated against. [required]
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getField() {
    return field;
  }

  /**
   * Field within the record this condition is evaluated against. [required]
   * @param field field or {@code null} for none
   */
  public GooglePrivacyDlpV2Condition setField(GooglePrivacyDlpV2FieldId field) {
    this.field = field;
    return this;
  }

  /**
   * Operator used to compare the field or infoType to the value. [required]
   * @return value or {@code null} for none
   */
  public java.lang.String getOperator() {
    return operator;
  }

  /**
   * Operator used to compare the field or infoType to the value. [required]
   * @param operator operator or {@code null} for none
   */
  public GooglePrivacyDlpV2Condition setOperator(java.lang.String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Value to compare against. [Required, except for `EXISTS` tests.]
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Value getValue() {
    return value;
  }

  /**
   * Value to compare against. [Required, except for `EXISTS` tests.]
   * @param value value or {@code null} for none
   */
  public GooglePrivacyDlpV2Condition setValue(GooglePrivacyDlpV2Value value) {
    this.value = value;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Condition set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Condition) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Condition clone() {
    return (GooglePrivacyDlpV2Condition) super.clone();
  }

}
