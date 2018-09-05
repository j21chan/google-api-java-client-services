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

package com.google.webmasters.model;

/**
 * Contains information about specific crawl errors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Console API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlCrawlErrorsSample extends com.google.api.client.json.GenericJson {

  /**
   * The time the error was first detected, in RFC 3339 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("first_detected")
  private com.google.api.client.util.DateTime firstDetected;

  /**
   * The time when the URL was last crawled, in RFC 3339 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("last_crawled")
  private com.google.api.client.util.DateTime lastCrawled;

  /**
   * The URL of an error, relative to the site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageUrl;

  /**
   * The HTTP response code, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer responseCode;

  /**
   * Additional details about the URL, set only when calling get().
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UrlSampleDetails urlDetails;

  /**
   * The time the error was first detected, in RFC 3339 format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getFirstDetected() {
    return firstDetected;
  }

  /**
   * The time the error was first detected, in RFC 3339 format.
   * @param firstDetected firstDetected or {@code null} for none
   */
  public UrlCrawlErrorsSample setFirstDetected(com.google.api.client.util.DateTime firstDetected) {
    this.firstDetected = firstDetected;
    return this;
  }

  /**
   * The time when the URL was last crawled, in RFC 3339 format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getLastCrawled() {
    return lastCrawled;
  }

  /**
   * The time when the URL was last crawled, in RFC 3339 format.
   * @param lastCrawled lastCrawled or {@code null} for none
   */
  public UrlCrawlErrorsSample setLastCrawled(com.google.api.client.util.DateTime lastCrawled) {
    this.lastCrawled = lastCrawled;
    return this;
  }

  /**
   * The URL of an error, relative to the site.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageUrl() {
    return pageUrl;
  }

  /**
   * The URL of an error, relative to the site.
   * @param pageUrl pageUrl or {@code null} for none
   */
  public UrlCrawlErrorsSample setPageUrl(java.lang.String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * The HTTP response code, if any.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResponseCode() {
    return responseCode;
  }

  /**
   * The HTTP response code, if any.
   * @param responseCode responseCode or {@code null} for none
   */
  public UrlCrawlErrorsSample setResponseCode(java.lang.Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Additional details about the URL, set only when calling get().
   * @return value or {@code null} for none
   */
  public UrlSampleDetails getUrlDetails() {
    return urlDetails;
  }

  /**
   * Additional details about the URL, set only when calling get().
   * @param urlDetails urlDetails or {@code null} for none
   */
  public UrlCrawlErrorsSample setUrlDetails(UrlSampleDetails urlDetails) {
    this.urlDetails = urlDetails;
    return this;
  }

  @Override
  public UrlCrawlErrorsSample set(String fieldName, Object value) {
    return (UrlCrawlErrorsSample) super.set(fieldName, value);
  }

  @Override
  public UrlCrawlErrorsSample clone() {
    return (UrlCrawlErrorsSample) super.clone();
  }

}
