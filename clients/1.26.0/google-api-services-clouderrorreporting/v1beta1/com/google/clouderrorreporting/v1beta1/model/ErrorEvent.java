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

package com.google.clouderrorreporting.v1beta1.model;

/**
 * An error event which is returned by the Error Reporting system.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Error Reporting API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorEvent extends com.google.api.client.json.GenericJson {

  /**
   * Data about the context in which the error occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ErrorContext context;

  /**
   * Time when the event occurred as provided in the error report. If the report did not contain a
   * timestamp, the time the error was received by the Error Reporting system is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * The stack trace that was reported or logged by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The `ServiceContext` for which this error was reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceContext serviceContext;

  /**
   * Data about the context in which the error occurred.
   * @return value or {@code null} for none
   */
  public ErrorContext getContext() {
    return context;
  }

  /**
   * Data about the context in which the error occurred.
   * @param context context or {@code null} for none
   */
  public ErrorEvent setContext(ErrorContext context) {
    this.context = context;
    return this;
  }

  /**
   * Time when the event occurred as provided in the error report. If the report did not contain a
   * timestamp, the time the error was received by the Error Reporting system is used.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * Time when the event occurred as provided in the error report. If the report did not contain a
   * timestamp, the time the error was received by the Error Reporting system is used.
   * @param eventTime eventTime or {@code null} for none
   */
  public ErrorEvent setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * The stack trace that was reported or logged by the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * The stack trace that was reported or logged by the service.
   * @param message message or {@code null} for none
   */
  public ErrorEvent setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * The `ServiceContext` for which this error was reported.
   * @return value or {@code null} for none
   */
  public ServiceContext getServiceContext() {
    return serviceContext;
  }

  /**
   * The `ServiceContext` for which this error was reported.
   * @param serviceContext serviceContext or {@code null} for none
   */
  public ErrorEvent setServiceContext(ServiceContext serviceContext) {
    this.serviceContext = serviceContext;
    return this;
  }

  @Override
  public ErrorEvent set(String fieldName, Object value) {
    return (ErrorEvent) super.set(fieldName, value);
  }

  @Override
  public ErrorEvent clone() {
    return (ErrorEvent) super.clone();
  }

}
