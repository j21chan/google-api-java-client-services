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

package com.google.genomics.v2alpha1.model;

/**
 * An event that occurred during an Operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationEvent extends com.google.api.client.json.GenericJson {

  /**
   * Required description of event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional time of when event finished. An event can have a start time and no finish time. If an
   * event has a finish time, there must be a start time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Optional time of when event started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Required description of event.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Required description of event.
   * @param description description or {@code null} for none
   */
  public OperationEvent setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional time of when event finished. An event can have a start time and no finish time. If an
   * event has a finish time, there must be a start time.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Optional time of when event finished. An event can have a start time and no finish time. If an
   * event has a finish time, there must be a start time.
   * @param endTime endTime or {@code null} for none
   */
  public OperationEvent setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Optional time of when event started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Optional time of when event started.
   * @param startTime startTime or {@code null} for none
   */
  public OperationEvent setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public OperationEvent set(String fieldName, Object value) {
    return (OperationEvent) super.set(fieldName, value);
  }

  @Override
  public OperationEvent clone() {
    return (OperationEvent) super.clone();
  }

}
