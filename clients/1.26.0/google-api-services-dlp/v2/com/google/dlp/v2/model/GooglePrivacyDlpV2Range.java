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
 * Generic half-open interval [start, end)
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
public final class GooglePrivacyDlpV2Range extends com.google.api.client.json.GenericJson {

  /**
   * Index of the last character of the range (exclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long end;

  /**
   * Index of the first character of the range (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long start;

  /**
   * Index of the last character of the range (exclusive).
   * @return value or {@code null} for none
   */
  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * Index of the last character of the range (exclusive).
   * @param end end or {@code null} for none
   */
  public GooglePrivacyDlpV2Range setEnd(java.lang.Long end) {
    this.end = end;
    return this;
  }

  /**
   * Index of the first character of the range (inclusive).
   * @return value or {@code null} for none
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * Index of the first character of the range (inclusive).
   * @param start start or {@code null} for none
   */
  public GooglePrivacyDlpV2Range setStart(java.lang.Long start) {
    this.start = start;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Range set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Range) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Range clone() {
    return (GooglePrivacyDlpV2Range) super.clone();
  }

}
