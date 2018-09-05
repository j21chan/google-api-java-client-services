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
 * Configuration for determining how redaction of images should occur.
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
public final class GooglePrivacyDlpV2ImageRedactionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Only one per info_type should be provided per request. If not specified, and redact_all_text is
   * false, the DLP API will redact all text that it matches against all info_types that are found,
   * but not specified in another ImageRedactionConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoType infoType;

  /**
   * If true, all text found in the image, regardless whether it matches an info_type, is redacted.
   * Only one should be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean redactAllText;

  /**
   * The color to use when redacting content from an image. If not specified, the default is black.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Color redactionColor;

  /**
   * Only one per info_type should be provided per request. If not specified, and redact_all_text is
   * false, the DLP API will redact all text that it matches against all info_types that are found,
   * but not specified in another ImageRedactionConfig.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType getInfoType() {
    return infoType;
  }

  /**
   * Only one per info_type should be provided per request. If not specified, and redact_all_text is
   * false, the DLP API will redact all text that it matches against all info_types that are found,
   * but not specified in another ImageRedactionConfig.
   * @param infoType infoType or {@code null} for none
   */
  public GooglePrivacyDlpV2ImageRedactionConfig setInfoType(GooglePrivacyDlpV2InfoType infoType) {
    this.infoType = infoType;
    return this;
  }

  /**
   * If true, all text found in the image, regardless whether it matches an info_type, is redacted.
   * Only one should be provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRedactAllText() {
    return redactAllText;
  }

  /**
   * If true, all text found in the image, regardless whether it matches an info_type, is redacted.
   * Only one should be provided.
   * @param redactAllText redactAllText or {@code null} for none
   */
  public GooglePrivacyDlpV2ImageRedactionConfig setRedactAllText(java.lang.Boolean redactAllText) {
    this.redactAllText = redactAllText;
    return this;
  }

  /**
   * The color to use when redacting content from an image. If not specified, the default is black.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Color getRedactionColor() {
    return redactionColor;
  }

  /**
   * The color to use when redacting content from an image. If not specified, the default is black.
   * @param redactionColor redactionColor or {@code null} for none
   */
  public GooglePrivacyDlpV2ImageRedactionConfig setRedactionColor(GooglePrivacyDlpV2Color redactionColor) {
    this.redactionColor = redactionColor;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2ImageRedactionConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2ImageRedactionConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2ImageRedactionConfig clone() {
    return (GooglePrivacyDlpV2ImageRedactionConfig) super.clone();
  }

}
