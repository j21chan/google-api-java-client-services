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
 * Represents a piece of potentially sensitive content.
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
public final class GooglePrivacyDlpV2Finding extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp when finding was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The type of content that might have been found. Provided if `excluded_types` is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoType infoType;

  /**
   * Confidence of how likely it is that the `info_type` is correct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String likelihood;

  /**
   * Where the content was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2Location location;

  /**
   * The content that was found. Even if the content is not textual, it may be converted to a
   * textual representation here. Provided if `include_quote` is true and the finding is less than
   * or equal to 4096 bytes long. If the finding exceeds 4096 bytes in length, the quote may be
   * omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quote;

  /**
   * Contains data parsed from quotes. Only populated if include_quote was set to true and a
   * supported infoType was requested. Currently supported infoTypes: DATE, DATE_OF_BIRTH and TIME.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2QuoteInfo quoteInfo;

  /**
   * Timestamp when finding was detected.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Timestamp when finding was detected.
   * @param createTime createTime or {@code null} for none
   */
  public GooglePrivacyDlpV2Finding setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The type of content that might have been found. Provided if `excluded_types` is false.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType getInfoType() {
    return infoType;
  }

  /**
   * The type of content that might have been found. Provided if `excluded_types` is false.
   * @param infoType infoType or {@code null} for none
   */
  public GooglePrivacyDlpV2Finding setInfoType(GooglePrivacyDlpV2InfoType infoType) {
    this.infoType = infoType;
    return this;
  }

  /**
   * Confidence of how likely it is that the `info_type` is correct.
   * @return value or {@code null} for none
   */
  public java.lang.String getLikelihood() {
    return likelihood;
  }

  /**
   * Confidence of how likely it is that the `info_type` is correct.
   * @param likelihood likelihood or {@code null} for none
   */
  public GooglePrivacyDlpV2Finding setLikelihood(java.lang.String likelihood) {
    this.likelihood = likelihood;
    return this;
  }

  /**
   * Where the content was found.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2Location getLocation() {
    return location;
  }

  /**
   * Where the content was found.
   * @param location location or {@code null} for none
   */
  public GooglePrivacyDlpV2Finding setLocation(GooglePrivacyDlpV2Location location) {
    this.location = location;
    return this;
  }

  /**
   * The content that was found. Even if the content is not textual, it may be converted to a
   * textual representation here. Provided if `include_quote` is true and the finding is less than
   * or equal to 4096 bytes long. If the finding exceeds 4096 bytes in length, the quote may be
   * omitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuote() {
    return quote;
  }

  /**
   * The content that was found. Even if the content is not textual, it may be converted to a
   * textual representation here. Provided if `include_quote` is true and the finding is less than
   * or equal to 4096 bytes long. If the finding exceeds 4096 bytes in length, the quote may be
   * omitted.
   * @param quote quote or {@code null} for none
   */
  public GooglePrivacyDlpV2Finding setQuote(java.lang.String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Contains data parsed from quotes. Only populated if include_quote was set to true and a
   * supported infoType was requested. Currently supported infoTypes: DATE, DATE_OF_BIRTH and TIME.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2QuoteInfo getQuoteInfo() {
    return quoteInfo;
  }

  /**
   * Contains data parsed from quotes. Only populated if include_quote was set to true and a
   * supported infoType was requested. Currently supported infoTypes: DATE, DATE_OF_BIRTH and TIME.
   * @param quoteInfo quoteInfo or {@code null} for none
   */
  public GooglePrivacyDlpV2Finding setQuoteInfo(GooglePrivacyDlpV2QuoteInfo quoteInfo) {
    this.quoteInfo = quoteInfo;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Finding set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Finding) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Finding clone() {
    return (GooglePrivacyDlpV2Finding) super.clone();
  }

}
