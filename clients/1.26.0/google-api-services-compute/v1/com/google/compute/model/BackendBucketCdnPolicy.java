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

package com.google.compute.model;

/**
 * Message containing Cloud CDN configuration for a backend bucket.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendBucketCdnPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After
   * this time period, the response will be revalidated before being served. Defaults to 1hr
   * (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   * though all responses from this backend had a ?Cache-Control: public, max-age=[TTL]? header,
   * regardless of any existing Cache-Control header. The actual headers served in responses will
   * not be altered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long signedUrlCacheMaxAgeSec;

  /**
   * [Output Only] Names of the keys for signing request URLs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> signedUrlKeyNames;

  /**
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After
   * this time period, the response will be revalidated before being served. Defaults to 1hr
   * (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   * though all responses from this backend had a ?Cache-Control: public, max-age=[TTL]? header,
   * regardless of any existing Cache-Control header. The actual headers served in responses will
   * not be altered.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSignedUrlCacheMaxAgeSec() {
    return signedUrlCacheMaxAgeSec;
  }

  /**
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After
   * this time period, the response will be revalidated before being served. Defaults to 1hr
   * (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   * though all responses from this backend had a ?Cache-Control: public, max-age=[TTL]? header,
   * regardless of any existing Cache-Control header. The actual headers served in responses will
   * not be altered.
   * @param signedUrlCacheMaxAgeSec signedUrlCacheMaxAgeSec or {@code null} for none
   */
  public BackendBucketCdnPolicy setSignedUrlCacheMaxAgeSec(java.lang.Long signedUrlCacheMaxAgeSec) {
    this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    return this;
  }

  /**
   * [Output Only] Names of the keys for signing request URLs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSignedUrlKeyNames() {
    return signedUrlKeyNames;
  }

  /**
   * [Output Only] Names of the keys for signing request URLs.
   * @param signedUrlKeyNames signedUrlKeyNames or {@code null} for none
   */
  public BackendBucketCdnPolicy setSignedUrlKeyNames(java.util.List<java.lang.String> signedUrlKeyNames) {
    this.signedUrlKeyNames = signedUrlKeyNames;
    return this;
  }

  @Override
  public BackendBucketCdnPolicy set(String fieldName, Object value) {
    return (BackendBucketCdnPolicy) super.set(fieldName, value);
  }

  @Override
  public BackendBucketCdnPolicy clone() {
    return (BackendBucketCdnPolicy) super.clone();
  }

}
