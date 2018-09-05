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
 * Day Part Targeting.
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
public final class DayPartTargeting extends com.google.api.client.json.GenericJson {

  /**
   * Days of the week when the ad will serve.
   *
   * Acceptable values are: - "SUNDAY" - "MONDAY" - "TUESDAY" - "WEDNESDAY" - "THURSDAY" - "FRIDAY"
   * - "SATURDAY"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> daysOfWeek;

  /**
   * Hours of the day when the ad will serve, where 0 is midnight to 1 AM and 23 is 11 PM to
   * midnight. Can be specified with days of week, in which case the ad would serve during these
   * hours on the specified days. For example if Monday, Wednesday, Friday are the days of week
   * specified and 9-10am, 3-5pm (hours 9, 15, and 16) is specified, the ad would serve Monday,
   * Wednesdays, and Fridays at 9-10am and 3-5pm. Acceptable values are 0 to 23, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> hoursOfDay;

  /**
   * Whether or not to use the user's local time. If false, the America/New York time zone applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean userLocalTime;

  /**
   * Days of the week when the ad will serve.
   *
   * Acceptable values are: - "SUNDAY" - "MONDAY" - "TUESDAY" - "WEDNESDAY" - "THURSDAY" - "FRIDAY"
   * - "SATURDAY"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Days of the week when the ad will serve.
   *
   * Acceptable values are: - "SUNDAY" - "MONDAY" - "TUESDAY" - "WEDNESDAY" - "THURSDAY" - "FRIDAY"
   * - "SATURDAY"
   * @param daysOfWeek daysOfWeek or {@code null} for none
   */
  public DayPartTargeting setDaysOfWeek(java.util.List<java.lang.String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  /**
   * Hours of the day when the ad will serve, where 0 is midnight to 1 AM and 23 is 11 PM to
   * midnight. Can be specified with days of week, in which case the ad would serve during these
   * hours on the specified days. For example if Monday, Wednesday, Friday are the days of week
   * specified and 9-10am, 3-5pm (hours 9, 15, and 16) is specified, the ad would serve Monday,
   * Wednesdays, and Fridays at 9-10am and 3-5pm. Acceptable values are 0 to 23, inclusive.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getHoursOfDay() {
    return hoursOfDay;
  }

  /**
   * Hours of the day when the ad will serve, where 0 is midnight to 1 AM and 23 is 11 PM to
   * midnight. Can be specified with days of week, in which case the ad would serve during these
   * hours on the specified days. For example if Monday, Wednesday, Friday are the days of week
   * specified and 9-10am, 3-5pm (hours 9, 15, and 16) is specified, the ad would serve Monday,
   * Wednesdays, and Fridays at 9-10am and 3-5pm. Acceptable values are 0 to 23, inclusive.
   * @param hoursOfDay hoursOfDay or {@code null} for none
   */
  public DayPartTargeting setHoursOfDay(java.util.List<java.lang.Integer> hoursOfDay) {
    this.hoursOfDay = hoursOfDay;
    return this;
  }

  /**
   * Whether or not to use the user's local time. If false, the America/New York time zone applies.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUserLocalTime() {
    return userLocalTime;
  }

  /**
   * Whether or not to use the user's local time. If false, the America/New York time zone applies.
   * @param userLocalTime userLocalTime or {@code null} for none
   */
  public DayPartTargeting setUserLocalTime(java.lang.Boolean userLocalTime) {
    this.userLocalTime = userLocalTime;
    return this;
  }

  @Override
  public DayPartTargeting set(String fieldName, Object value) {
    return (DayPartTargeting) super.set(fieldName, value);
  }

  @Override
  public DayPartTargeting clone() {
    return (DayPartTargeting) super.clone();
  }

}
