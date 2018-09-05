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

package com.google.androidenterprise.model;

/**
 * Maintenance window for managed Google Play Accounts. This allows Play store to update the apps on
 * the foreground in the designated window.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaintenanceWindow extends com.google.api.client.json.GenericJson {

  /**
   * Duration of the maintenance window, in milliseconds. The duration must be between 30 minutes
   * and 24 hours (inclusive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long durationMs;

  /**
   * Start time of the maintenance window, in milliseconds after midnight on the device. Windows can
   * span midnight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTimeAfterMidnightMs;

  /**
   * Duration of the maintenance window, in milliseconds. The duration must be between 30 minutes
   * and 24 hours (inclusive).
   * @return value or {@code null} for none
   */
  public java.lang.Long getDurationMs() {
    return durationMs;
  }

  /**
   * Duration of the maintenance window, in milliseconds. The duration must be between 30 minutes
   * and 24 hours (inclusive).
   * @param durationMs durationMs or {@code null} for none
   */
  public MaintenanceWindow setDurationMs(java.lang.Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }

  /**
   * Start time of the maintenance window, in milliseconds after midnight on the device. Windows can
   * span midnight.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTimeAfterMidnightMs() {
    return startTimeAfterMidnightMs;
  }

  /**
   * Start time of the maintenance window, in milliseconds after midnight on the device. Windows can
   * span midnight.
   * @param startTimeAfterMidnightMs startTimeAfterMidnightMs or {@code null} for none
   */
  public MaintenanceWindow setStartTimeAfterMidnightMs(java.lang.Long startTimeAfterMidnightMs) {
    this.startTimeAfterMidnightMs = startTimeAfterMidnightMs;
    return this;
  }

  @Override
  public MaintenanceWindow set(String fieldName, Object value) {
    return (MaintenanceWindow) super.set(fieldName, value);
  }

  @Override
  public MaintenanceWindow clone() {
    return (MaintenanceWindow) super.clone();
  }

}
