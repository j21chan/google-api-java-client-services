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
 * A tuple of values for the quasi-identifier columns.
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
public final class GooglePrivacyDlpV2KMapEstimationQuasiIdValues extends com.google.api.client.json.GenericJson {

  /**
   * The estimated anonymity for these quasi-identifier values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long estimatedAnonymity;

  /**
   * The quasi-identifier values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2Value> quasiIdsValues;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2Value used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2Value.class);
  }

  /**
   * The estimated anonymity for these quasi-identifier values.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEstimatedAnonymity() {
    return estimatedAnonymity;
  }

  /**
   * The estimated anonymity for these quasi-identifier values.
   * @param estimatedAnonymity estimatedAnonymity or {@code null} for none
   */
  public GooglePrivacyDlpV2KMapEstimationQuasiIdValues setEstimatedAnonymity(java.lang.Long estimatedAnonymity) {
    this.estimatedAnonymity = estimatedAnonymity;
    return this;
  }

  /**
   * The quasi-identifier values.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2Value> getQuasiIdsValues() {
    return quasiIdsValues;
  }

  /**
   * The quasi-identifier values.
   * @param quasiIdsValues quasiIdsValues or {@code null} for none
   */
  public GooglePrivacyDlpV2KMapEstimationQuasiIdValues setQuasiIdsValues(java.util.List<GooglePrivacyDlpV2Value> quasiIdsValues) {
    this.quasiIdsValues = quasiIdsValues;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2KMapEstimationQuasiIdValues set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2KMapEstimationQuasiIdValues) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2KMapEstimationQuasiIdValues clone() {
    return (GooglePrivacyDlpV2KMapEstimationQuasiIdValues) super.clone();
  }

}
