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

package com.google.vision.v1p2beta1.model;

/**
 * Additional information detected on the structural component.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1TextAnnotationTextProperty extends com.google.api.client.json.GenericJson {

  /**
   * Detected start or end of a text segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak detectedBreak;

  /**
   * A list of detected languages together with confidence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage> detectedLanguages;

  /**
   * Detected start or end of a text segment.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak getDetectedBreak() {
    return detectedBreak;
  }

  /**
   * Detected start or end of a text segment.
   * @param detectedBreak detectedBreak or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1TextAnnotationTextProperty setDetectedBreak(GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak detectedBreak) {
    this.detectedBreak = detectedBreak;
    return this;
  }

  /**
   * A list of detected languages together with confidence.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }

  /**
   * A list of detected languages together with confidence.
   * @param detectedLanguages detectedLanguages or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1TextAnnotationTextProperty setDetectedLanguages(java.util.List<GoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1TextAnnotationTextProperty set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1TextAnnotationTextProperty) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1TextAnnotationTextProperty clone() {
    return (GoogleCloudVisionV1p1beta1TextAnnotationTextProperty) super.clone();
  }

}
