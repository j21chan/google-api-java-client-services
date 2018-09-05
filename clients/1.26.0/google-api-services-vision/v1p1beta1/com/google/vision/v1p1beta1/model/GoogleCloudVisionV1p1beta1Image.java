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

package com.google.vision.v1p1beta1.model;

/**
 * Client image to perform Google Cloud Vision API tasks over.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1Image extends com.google.api.client.json.GenericJson {

  /**
   * Image content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Google Cloud Storage image location, or publicly-accessible image URL. If both `content` and
   * `source` are provided for an image, `content` takes precedence and is used to perform the image
   * annotation request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1ImageSource source;

  /**
   * Image content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Image content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Image content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1Image setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Image content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers
   * use a pure binary representation, whereas JSON representations use base64.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudVisionV1p1beta1Image encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * Google Cloud Storage image location, or publicly-accessible image URL. If both `content` and
   * `source` are provided for an image, `content` takes precedence and is used to perform the image
   * annotation request.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageSource getSource() {
    return source;
  }

  /**
   * Google Cloud Storage image location, or publicly-accessible image URL. If both `content` and
   * `source` are provided for an image, `content` takes precedence and is used to perform the image
   * annotation request.
   * @param source source or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1Image setSource(GoogleCloudVisionV1p1beta1ImageSource source) {
    this.source = source;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1Image set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1Image) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1Image clone() {
    return (GoogleCloudVisionV1p1beta1Image) super.clone();
  }

}
