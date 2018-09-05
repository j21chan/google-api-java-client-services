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
 * Details information about an error encountered during job execution or the results of an
 * unsuccessful activation of the JobTrigger. Output only field.
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
public final class GooglePrivacyDlpV2Error extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus details;

  /**
   * The times the error occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<String> timestamps;

  /**
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getDetails() {
    return details;
  }

  /**
   * @param details details or {@code null} for none
   */
  public GooglePrivacyDlpV2Error setDetails(GoogleRpcStatus details) {
    this.details = details;
    return this;
  }

  /**
   * The times the error occurred.
   * @return value or {@code null} for none
   */
  public java.util.List<String> getTimestamps() {
    return timestamps;
  }

  /**
   * The times the error occurred.
   * @param timestamps timestamps or {@code null} for none
   */
  public GooglePrivacyDlpV2Error setTimestamps(java.util.List<String> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Error set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Error) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Error clone() {
    return (GooglePrivacyDlpV2Error) super.clone();
  }

}
