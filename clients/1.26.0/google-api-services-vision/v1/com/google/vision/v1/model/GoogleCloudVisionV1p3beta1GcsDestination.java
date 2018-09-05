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
 * The Google Cloud Storage location where the output will be written to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1GcsDestination extends com.google.api.client.json.GenericJson {

  /**
   * Google Cloud Storage URI where the results will be stored. Results will be in JSON format and
   * preceded by its corresponding input URI. This field can either represent a single file, or a
   * prefix for multiple outputs. Prefixes must end in a `/`.
   *
   * Examples:
   *
   * *    File: gs://bucket-name/filename.json *    Prefix: gs://bucket-name/prefix/here/ *    File:
   * gs://bucket-name/prefix/here
   *
   * If multiple outputs, each response is still AnnotateFileResponse, each of which contains some
   * subset of the full list of AnnotateImageResponse. Multiple outputs can happen if, for example,
   * the output JSON is too large and overflows into multiple sharded files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Google Cloud Storage URI where the results will be stored. Results will be in JSON format and
   * preceded by its corresponding input URI. This field can either represent a single file, or a
   * prefix for multiple outputs. Prefixes must end in a `/`.
   *
   * Examples:
   *
   * *    File: gs://bucket-name/filename.json *    Prefix: gs://bucket-name/prefix/here/ *    File:
   * gs://bucket-name/prefix/here
   *
   * If multiple outputs, each response is still AnnotateFileResponse, each of which contains some
   * subset of the full list of AnnotateImageResponse. Multiple outputs can happen if, for example,
   * the output JSON is too large and overflows into multiple sharded files.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Google Cloud Storage URI where the results will be stored. Results will be in JSON format and
   * preceded by its corresponding input URI. This field can either represent a single file, or a
   * prefix for multiple outputs. Prefixes must end in a `/`.
   *
   * Examples:
   *
   * *    File: gs://bucket-name/filename.json *    Prefix: gs://bucket-name/prefix/here/ *    File:
   * gs://bucket-name/prefix/here
   *
   * If multiple outputs, each response is still AnnotateFileResponse, each of which contains some
   * subset of the full list of AnnotateImageResponse. Multiple outputs can happen if, for example,
   * the output JSON is too large and overflows into multiple sharded files.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1GcsDestination setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1GcsDestination set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1GcsDestination) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1GcsDestination clone() {
    return (GoogleCloudVisionV1p3beta1GcsDestination) super.clone();
  }

}
