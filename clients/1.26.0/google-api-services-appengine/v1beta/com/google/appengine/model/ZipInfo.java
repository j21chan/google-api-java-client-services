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

package com.google.appengine.model;

/**
 * The zip file information for a zip deployment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ZipInfo extends com.google.api.client.json.GenericJson {

  /**
   * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than
   * or equal to the actual number of files. Used for optimizing performance; if not provided,
   * deployment may be slow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer filesCount;

  /**
   * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the
   * form 'http(s)://storage.googleapis.com//'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUrl;

  /**
   * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than
   * or equal to the actual number of files. Used for optimizing performance; if not provided,
   * deployment may be slow.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFilesCount() {
    return filesCount;
  }

  /**
   * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than
   * or equal to the actual number of files. Used for optimizing performance; if not provided,
   * deployment may be slow.
   * @param filesCount filesCount or {@code null} for none
   */
  public ZipInfo setFilesCount(java.lang.Integer filesCount) {
    this.filesCount = filesCount;
    return this;
  }

  /**
   * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the
   * form 'http(s)://storage.googleapis.com//'.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUrl() {
    return sourceUrl;
  }

  /**
   * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the
   * form 'http(s)://storage.googleapis.com//'.
   * @param sourceUrl sourceUrl or {@code null} for none
   */
  public ZipInfo setSourceUrl(java.lang.String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  @Override
  public ZipInfo set(String fieldName, Object value) {
    return (ZipInfo) super.set(fieldName, value);
  }

  @Override
  public ZipInfo clone() {
    return (ZipInfo) super.clone();
  }

}
