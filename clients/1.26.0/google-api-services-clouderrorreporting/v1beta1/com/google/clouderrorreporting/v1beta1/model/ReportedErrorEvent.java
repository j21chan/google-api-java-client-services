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
 * An error event which is reported to the Error Reporting system.
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
public final class ReportedErrorEvent extends com.google.api.client.json.GenericJson {

  /**
   * [Optional] A description of the context in which the error occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ErrorContext context;

  /**
   * [Optional] Time when the event occurred. If not provided, the time when the event was received
   * by the Error Reporting system will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * [Required] The error message. If no `context.reportLocation` is provided, the message must
   * contain a header (typically consisting of the exception type name and an error message) and an
   * exception stack trace in one of the supported programming languages and formats. Supported
   * languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go. Supported stack trace formats
   * are:
   *
   * * **Java**: Must be the return value of [`Throwable.printStackTrace()`](https://docs.oracle.com
   * /javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29). * **Python**: Must be the
   * return value of [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#tra
   * ceback.format_exc). * **JavaScript**: Must be the value of
   * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as returned by V8. * **Ruby**:
   * Must contain frames returned by [`Exception.backtrace`](https://ruby-
   * doc.org/core-2.2.0/Exception.html#method-i-backtrace). * **C#**: Must be the return value of
   * [`Exception.ToString()`](https://msdn.microsoft.com/en-
   * us/library/system.exception.tostring.aspx). * **PHP**: Must start with `PHP (Notice|Parse
   * error|Fatal error|Warning)` and contain the result of
   * [`(string)$exception`](http://php.net/manual/en/exception.tostring.php). * **Go**: Must be the
   * return value of [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * [Required] The service context in which this error has occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceContext serviceContext;

  /**
   * [Optional] A description of the context in which the error occurred.
   * @return value or {@code null} for none
   */
  public ErrorContext getContext() {
    return context;
  }

  /**
   * [Optional] A description of the context in which the error occurred.
   * @param context context or {@code null} for none
   */
  public ReportedErrorEvent setContext(ErrorContext context) {
    this.context = context;
    return this;
  }

  /**
   * [Optional] Time when the event occurred. If not provided, the time when the event was received
   * by the Error Reporting system will be used.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * [Optional] Time when the event occurred. If not provided, the time when the event was received
   * by the Error Reporting system will be used.
   * @param eventTime eventTime or {@code null} for none
   */
  public ReportedErrorEvent setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * [Required] The error message. If no `context.reportLocation` is provided, the message must
   * contain a header (typically consisting of the exception type name and an error message) and an
   * exception stack trace in one of the supported programming languages and formats. Supported
   * languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go. Supported stack trace formats
   * are:
   *
   * * **Java**: Must be the return value of [`Throwable.printStackTrace()`](https://docs.oracle.com
   * /javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29). * **Python**: Must be the
   * return value of [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#tra
   * ceback.format_exc). * **JavaScript**: Must be the value of
   * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as returned by V8. * **Ruby**:
   * Must contain frames returned by [`Exception.backtrace`](https://ruby-
   * doc.org/core-2.2.0/Exception.html#method-i-backtrace). * **C#**: Must be the return value of
   * [`Exception.ToString()`](https://msdn.microsoft.com/en-
   * us/library/system.exception.tostring.aspx). * **PHP**: Must start with `PHP (Notice|Parse
   * error|Fatal error|Warning)` and contain the result of
   * [`(string)$exception`](http://php.net/manual/en/exception.tostring.php). * **Go**: Must be the
   * return value of [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * [Required] The error message. If no `context.reportLocation` is provided, the message must
   * contain a header (typically consisting of the exception type name and an error message) and an
   * exception stack trace in one of the supported programming languages and formats. Supported
   * languages are Java, Python, JavaScript, Ruby, C#, PHP, and Go. Supported stack trace formats
   * are:
   *
   * * **Java**: Must be the return value of [`Throwable.printStackTrace()`](https://docs.oracle.com
   * /javase/7/docs/api/java/lang/Throwable.html#printStackTrace%28%29). * **Python**: Must be the
   * return value of [`traceback.format_exc()`](https://docs.python.org/2/library/traceback.html#tra
   * ceback.format_exc). * **JavaScript**: Must be the value of
   * [`error.stack`](https://github.com/v8/v8/wiki/Stack-Trace-API) as returned by V8. * **Ruby**:
   * Must contain frames returned by [`Exception.backtrace`](https://ruby-
   * doc.org/core-2.2.0/Exception.html#method-i-backtrace). * **C#**: Must be the return value of
   * [`Exception.ToString()`](https://msdn.microsoft.com/en-
   * us/library/system.exception.tostring.aspx). * **PHP**: Must start with `PHP (Notice|Parse
   * error|Fatal error|Warning)` and contain the result of
   * [`(string)$exception`](http://php.net/manual/en/exception.tostring.php). * **Go**: Must be the
   * return value of [`runtime.Stack()`](https://golang.org/pkg/runtime/debug/#Stack).
   * @param message message or {@code null} for none
   */
  public ReportedErrorEvent setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * [Required] The service context in which this error has occurred.
   * @return value or {@code null} for none
   */
  public ServiceContext getServiceContext() {
    return serviceContext;
  }

  /**
   * [Required] The service context in which this error has occurred.
   * @param serviceContext serviceContext or {@code null} for none
   */
  public ReportedErrorEvent setServiceContext(ServiceContext serviceContext) {
    this.serviceContext = serviceContext;
    return this;
  }

  @Override
  public ReportedErrorEvent set(String fieldName, Object value) {
    return (ReportedErrorEvent) super.set(fieldName, value);
  }

  @Override
  public ReportedErrorEvent clone() {
    return (ReportedErrorEvent) super.clone();
  }

}
