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

package com.google.acceleratedmobilepageurl.v1.model;

/**
 * AMP URL response for a requested URL.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Accelerated Mobile Pages (AMP) URL API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AmpUrl extends com.google.api.client.json.GenericJson {

  /**
   * The AMP URL pointing to the publisher's web server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ampUrl;

  /**
   * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to the cached document
   * in the Google AMP Cache.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cdnAmpUrl;

  /**
   * The original non-AMP URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalUrl;

  /**
   * The AMP URL pointing to the publisher's web server.
   * @return value or {@code null} for none
   */
  public java.lang.String getAmpUrl() {
    return ampUrl;
  }

  /**
   * The AMP URL pointing to the publisher's web server.
   * @param ampUrl ampUrl or {@code null} for none
   */
  public AmpUrl setAmpUrl(java.lang.String ampUrl) {
    this.ampUrl = ampUrl;
    return this;
  }

  /**
   * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to the cached document
   * in the Google AMP Cache.
   * @return value or {@code null} for none
   */
  public java.lang.String getCdnAmpUrl() {
    return cdnAmpUrl;
  }

  /**
   * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to the cached document
   * in the Google AMP Cache.
   * @param cdnAmpUrl cdnAmpUrl or {@code null} for none
   */
  public AmpUrl setCdnAmpUrl(java.lang.String cdnAmpUrl) {
    this.cdnAmpUrl = cdnAmpUrl;
    return this;
  }

  /**
   * The original non-AMP URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalUrl() {
    return originalUrl;
  }

  /**
   * The original non-AMP URL.
   * @param originalUrl originalUrl or {@code null} for none
   */
  public AmpUrl setOriginalUrl(java.lang.String originalUrl) {
    this.originalUrl = originalUrl;
    return this;
  }

  @Override
  public AmpUrl set(String fieldName, Object value) {
    return (AmpUrl) super.set(fieldName, value);
  }

  @Override
  public AmpUrl clone() {
    return (AmpUrl) super.clone();
  }

}
