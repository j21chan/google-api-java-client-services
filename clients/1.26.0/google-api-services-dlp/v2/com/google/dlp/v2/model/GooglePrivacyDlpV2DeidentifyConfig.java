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
 * The configuration that controls how the data will change.
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
public final class GooglePrivacyDlpV2DeidentifyConfig extends com.google.api.client.json.GenericJson {

  /**
   * Treat the dataset as free-form text and apply the same free text transformation everywhere.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoTypeTransformations infoTypeTransformations;

  /**
   * Treat the dataset as structured. Transformations can be applied to specific locations within
   * structured datasets, such as transforming a column within a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2RecordTransformations recordTransformations;

  /**
   * Treat the dataset as free-form text and apply the same free text transformation everywhere.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoTypeTransformations getInfoTypeTransformations() {
    return infoTypeTransformations;
  }

  /**
   * Treat the dataset as free-form text and apply the same free text transformation everywhere.
   * @param infoTypeTransformations infoTypeTransformations or {@code null} for none
   */
  public GooglePrivacyDlpV2DeidentifyConfig setInfoTypeTransformations(GooglePrivacyDlpV2InfoTypeTransformations infoTypeTransformations) {
    this.infoTypeTransformations = infoTypeTransformations;
    return this;
  }

  /**
   * Treat the dataset as structured. Transformations can be applied to specific locations within
   * structured datasets, such as transforming a column within a table.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2RecordTransformations getRecordTransformations() {
    return recordTransformations;
  }

  /**
   * Treat the dataset as structured. Transformations can be applied to specific locations within
   * structured datasets, such as transforming a column within a table.
   * @param recordTransformations recordTransformations or {@code null} for none
   */
  public GooglePrivacyDlpV2DeidentifyConfig setRecordTransformations(GooglePrivacyDlpV2RecordTransformations recordTransformations) {
    this.recordTransformations = recordTransformations;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DeidentifyConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DeidentifyConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DeidentifyConfig clone() {
    return (GooglePrivacyDlpV2DeidentifyConfig) super.clone();
  }

}
