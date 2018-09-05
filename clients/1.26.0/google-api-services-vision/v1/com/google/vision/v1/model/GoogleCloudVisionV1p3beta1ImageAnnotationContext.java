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
 * If an image was produced from a file (e.g. a PDF), this message gives information about the
 * source of that image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1ImageAnnotationContext extends com.google.api.client.json.GenericJson {

  /**
   * If the file was a PDF or TIFF, this field gives the page number within the file used to produce
   * the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageNumber;

  /**
   * The URI of the file used to produce the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * If the file was a PDF or TIFF, this field gives the page number within the file used to produce
   * the image.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageNumber() {
    return pageNumber;
  }

  /**
   * If the file was a PDF or TIFF, this field gives the page number within the file used to produce
   * the image.
   * @param pageNumber pageNumber or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ImageAnnotationContext setPageNumber(java.lang.Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * The URI of the file used to produce the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The URI of the file used to produce the image.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ImageAnnotationContext setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1ImageAnnotationContext set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1ImageAnnotationContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1ImageAnnotationContext clone() {
    return (GoogleCloudVisionV1p3beta1ImageAnnotationContext) super.clone();
  }

}
