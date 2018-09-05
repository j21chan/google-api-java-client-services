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
 * Schedule for triggeredJobs.
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
public final class GooglePrivacyDlpV2Schedule extends com.google.api.client.json.GenericJson {

  /**
   * With this option a job is started a regular periodic basis. For example: every day (86400
   * seconds).
   *
   * A scheduled start time will be skipped if the previous execution has not ended when its
   * scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal to 1 day and can be no longer
   * than 60 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String recurrencePeriodDuration;

  /**
   * With this option a job is started a regular periodic basis. For example: every day (86400
   * seconds).
   *
   * A scheduled start time will be skipped if the previous execution has not ended when its
   * scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal to 1 day and can be no longer
   * than 60 days.
   * @return value or {@code null} for none
   */
  public String getRecurrencePeriodDuration() {
    return recurrencePeriodDuration;
  }

  /**
   * With this option a job is started a regular periodic basis. For example: every day (86400
   * seconds).
   *
   * A scheduled start time will be skipped if the previous execution has not ended when its
   * scheduled time occurs.
   *
   * This value must be set to a time duration greater than or equal to 1 day and can be no longer
   * than 60 days.
   * @param recurrencePeriodDuration recurrencePeriodDuration or {@code null} for none
   */
  public GooglePrivacyDlpV2Schedule setRecurrencePeriodDuration(String recurrencePeriodDuration) {
    this.recurrencePeriodDuration = recurrencePeriodDuration;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Schedule set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Schedule) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Schedule clone() {
    return (GooglePrivacyDlpV2Schedule) super.clone();
  }

}
