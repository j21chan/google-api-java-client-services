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

package com.google.container.v1beta1.model;

/**
 * Time window specified for daily maintenance operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DailyMaintenanceWindow extends com.google.api.client.json.GenericJson {

  /**
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the
   * given scenario.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String duration;

  /**
   * Time within the maintenance window to start the maintenance operations. It must be in format
   * "HH:MM”, where HH : [00-23] and MM : [00-59] GMT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the
   * given scenario.
   * @return value or {@code null} for none
   */
  public java.lang.String getDuration() {
    return duration;
  }

  /**
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the
   * given scenario.
   * @param duration duration or {@code null} for none
   */
  public DailyMaintenanceWindow setDuration(java.lang.String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Time within the maintenance window to start the maintenance operations. It must be in format
   * "HH:MM”, where HH : [00-23] and MM : [00-59] GMT.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * Time within the maintenance window to start the maintenance operations. It must be in format
   * "HH:MM”, where HH : [00-23] and MM : [00-59] GMT.
   * @param startTime startTime or {@code null} for none
   */
  public DailyMaintenanceWindow setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public DailyMaintenanceWindow set(String fieldName, Object value) {
    return (DailyMaintenanceWindow) super.set(fieldName, value);
  }

  @Override
  public DailyMaintenanceWindow clone() {
    return (DailyMaintenanceWindow) super.clone();
  }

}
