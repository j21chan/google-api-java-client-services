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

package com.google.calendar.model;

/**
 * Model definition for Calendar.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Calendar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Calendar extends com.google.api.client.json.GenericJson {

  /**
   * Conferencing properties for this calendar, for example what types of conferences are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConferenceProperties conferenceProperties;

  /**
   * Description of the calendar. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Identifier of the calendar. To retrieve IDs call the calendarList.list() method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Type of the resource ("calendar#calendar").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Geographic location of the calendar as free-form text. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Title of the calendar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summary;

  /**
   * The time zone of the calendar. (Formatted as an IANA Time Zone Database name, e.g.
   * "Europe/Zurich".) Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Conferencing properties for this calendar, for example what types of conferences are allowed.
   * @return value or {@code null} for none
   */
  public ConferenceProperties getConferenceProperties() {
    return conferenceProperties;
  }

  /**
   * Conferencing properties for this calendar, for example what types of conferences are allowed.
   * @param conferenceProperties conferenceProperties or {@code null} for none
   */
  public Calendar setConferenceProperties(ConferenceProperties conferenceProperties) {
    this.conferenceProperties = conferenceProperties;
    return this;
  }

  /**
   * Description of the calendar. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the calendar. Optional.
   * @param description description or {@code null} for none
   */
  public Calendar setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Calendar setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Identifier of the calendar. To retrieve IDs call the calendarList.list() method.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Identifier of the calendar. To retrieve IDs call the calendarList.list() method.
   * @param id id or {@code null} for none
   */
  public Calendar setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Type of the resource ("calendar#calendar").
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of the resource ("calendar#calendar").
   * @param kind kind or {@code null} for none
   */
  public Calendar setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Geographic location of the calendar as free-form text. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Geographic location of the calendar as free-form text. Optional.
   * @param location location or {@code null} for none
   */
  public Calendar setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Title of the calendar.
   * @return value or {@code null} for none
   */
  public java.lang.String getSummary() {
    return summary;
  }

  /**
   * Title of the calendar.
   * @param summary summary or {@code null} for none
   */
  public Calendar setSummary(java.lang.String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * The time zone of the calendar. (Formatted as an IANA Time Zone Database name, e.g.
   * "Europe/Zurich".) Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * The time zone of the calendar. (Formatted as an IANA Time Zone Database name, e.g.
   * "Europe/Zurich".) Optional.
   * @param timeZone timeZone or {@code null} for none
   */
  public Calendar setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public Calendar set(String fieldName, Object value) {
    return (Calendar) super.set(fieldName, value);
  }

  @Override
  public Calendar clone() {
    return (Calendar) super.clone();
  }

}
