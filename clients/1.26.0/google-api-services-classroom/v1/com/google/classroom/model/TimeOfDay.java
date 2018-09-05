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

package com.google.classroom.model;

/**
 * Represents a time of day. The date and time zone are either not significant or are specified
 * elsewhere. An API may choose to allow leap seconds. Related types are google.type.Date and
 * `google.protobuf.Timestamp`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeOfDay extends com.google.api.client.json.GenericJson {

  /**
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value
   * "24:00:00" for scenarios like business closing time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hours;

  /**
   * Minutes of hour of day. Must be from 0 to 59.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minutes;

  /**
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nanos;

  /**
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if
   * it allows leap-seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer seconds;

  /**
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value
   * "24:00:00" for scenarios like business closing time.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHours() {
    return hours;
  }

  /**
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value
   * "24:00:00" for scenarios like business closing time.
   * @param hours hours or {@code null} for none
   */
  public TimeOfDay setHours(java.lang.Integer hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Minutes of hour of day. Must be from 0 to 59.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinutes() {
    return minutes;
  }

  /**
   * Minutes of hour of day. Must be from 0 to 59.
   * @param minutes minutes or {@code null} for none
   */
  public TimeOfDay setMinutes(java.lang.Integer minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNanos() {
    return nanos;
  }

  /**
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * @param nanos nanos or {@code null} for none
   */
  public TimeOfDay setNanos(java.lang.Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if
   * it allows leap-seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSeconds() {
    return seconds;
  }

  /**
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if
   * it allows leap-seconds.
   * @param seconds seconds or {@code null} for none
   */
  public TimeOfDay setSeconds(java.lang.Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  @Override
  public TimeOfDay set(String fieldName, Object value) {
    return (TimeOfDay) super.set(fieldName, value);
  }

  @Override
  public TimeOfDay clone() {
    return (TimeOfDay) super.clone();
  }

}
