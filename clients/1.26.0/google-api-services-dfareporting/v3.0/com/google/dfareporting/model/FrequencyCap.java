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

package com.google.dfareporting.model;

/**
 * Frequency Cap.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FrequencyCap extends com.google.api.client.json.GenericJson {

  /**
   * Duration of time, in seconds, for this frequency cap. The maximum duration is 90 days.
   * Acceptable values are 1 to 7776000, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long duration;

  /**
   * Number of times an individual user can be served the ad within the specified duration.
   * Acceptable values are 1 to 15, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long impressions;

  /**
   * Duration of time, in seconds, for this frequency cap. The maximum duration is 90 days.
   * Acceptable values are 1 to 7776000, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDuration() {
    return duration;
  }

  /**
   * Duration of time, in seconds, for this frequency cap. The maximum duration is 90 days.
   * Acceptable values are 1 to 7776000, inclusive.
   * @param duration duration or {@code null} for none
   */
  public FrequencyCap setDuration(java.lang.Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Number of times an individual user can be served the ad within the specified duration.
   * Acceptable values are 1 to 15, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getImpressions() {
    return impressions;
  }

  /**
   * Number of times an individual user can be served the ad within the specified duration.
   * Acceptable values are 1 to 15, inclusive.
   * @param impressions impressions or {@code null} for none
   */
  public FrequencyCap setImpressions(java.lang.Long impressions) {
    this.impressions = impressions;
    return this;
  }

  @Override
  public FrequencyCap set(String fieldName, Object value) {
    return (FrequencyCap) super.set(fieldName, value);
  }

  @Override
  public FrequencyCap clone() {
    return (FrequencyCap) super.clone();
  }

}
