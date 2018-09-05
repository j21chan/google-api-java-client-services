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
 * HTTP request data that is related to a reported error. This data should be provided by the
 * application when reporting an error, unless the error report has been generated automatically
 * from Google App Engine logs.
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
public final class HttpRequestContext extends com.google.api.client.json.GenericJson {

  /**
   * The type of HTTP request, such as `GET`, `POST`, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * The referrer information that is provided with the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referrer;

  /**
   * The IP address from which the request originated. This can be IPv4, IPv6, or a token which is
   * derived from the IP address, depending on the data that has been provided in the error report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String remoteIp;

  /**
   * The HTTP response status code for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer responseStatusCode;

  /**
   * The URL of the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The user agent information that is provided with the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userAgent;

  /**
   * The type of HTTP request, such as `GET`, `POST`, etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * The type of HTTP request, such as `GET`, `POST`, etc.
   * @param method method or {@code null} for none
   */
  public HttpRequestContext setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * The referrer information that is provided with the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferrer() {
    return referrer;
  }

  /**
   * The referrer information that is provided with the request.
   * @param referrer referrer or {@code null} for none
   */
  public HttpRequestContext setReferrer(java.lang.String referrer) {
    this.referrer = referrer;
    return this;
  }

  /**
   * The IP address from which the request originated. This can be IPv4, IPv6, or a token which is
   * derived from the IP address, depending on the data that has been provided in the error report.
   * @return value or {@code null} for none
   */
  public java.lang.String getRemoteIp() {
    return remoteIp;
  }

  /**
   * The IP address from which the request originated. This can be IPv4, IPv6, or a token which is
   * derived from the IP address, depending on the data that has been provided in the error report.
   * @param remoteIp remoteIp or {@code null} for none
   */
  public HttpRequestContext setRemoteIp(java.lang.String remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }

  /**
   * The HTTP response status code for the request.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  /**
   * The HTTP response status code for the request.
   * @param responseStatusCode responseStatusCode or {@code null} for none
   */
  public HttpRequestContext setResponseStatusCode(java.lang.Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
    return this;
  }

  /**
   * The URL of the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL of the request.
   * @param url url or {@code null} for none
   */
  public HttpRequestContext setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * The user agent information that is provided with the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * The user agent information that is provided with the request.
   * @param userAgent userAgent or {@code null} for none
   */
  public HttpRequestContext setUserAgent(java.lang.String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  @Override
  public HttpRequestContext set(String fieldName, Object value) {
    return (HttpRequestContext) super.set(fieldName, value);
  }

  @Override
  public HttpRequestContext clone() {
    return (HttpRequestContext) super.clone();
  }

}
