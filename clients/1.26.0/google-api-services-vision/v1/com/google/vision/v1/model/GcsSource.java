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

package com.google.vision.v1.model;

/**
 * The Google Cloud Storage location where the input will be read from.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GcsSource extends com.google.api.client.json.GenericJson {

  /**
   * Google Cloud Storage URI for the input file. This must only be a Google Cloud Storage object.
   * Wildcards are not currently supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Google Cloud Storage URI for the input file. This must only be a Google Cloud Storage object.
   * Wildcards are not currently supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Google Cloud Storage URI for the input file. This must only be a Google Cloud Storage object.
   * Wildcards are not currently supported.
   * @param uri uri or {@code null} for none
   */
  public GcsSource setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GcsSource set(String fieldName, Object value) {
    return (GcsSource) super.set(fieldName, value);
  }

  @Override
  public GcsSource clone() {
    return (GcsSource) super.clone();
  }

}
