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

package com.google.videointelligence.v1beta2.model;

/**
 * Video context and/or feature-specific parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1beta2VideoContext extends com.google.api.client.json.GenericJson {

  /**
   * Config for EXPLICIT_CONTENT_DETECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig explicitContentDetectionConfig;

  /**
   * Config for LABEL_DETECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1beta2LabelDetectionConfig labelDetectionConfig;

  /**
   * Video segments to annotate. The segments may overlap and are not required to be contiguous or
   * span the whole video. If unspecified, each video is treated as a single segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2VideoSegment> segments;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1beta2VideoSegment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1beta2VideoSegment.class);
  }

  /**
   * Config for SHOT_CHANGE_DETECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig shotChangeDetectionConfig;

  /**
   * Config for EXPLICIT_CONTENT_DETECTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig getExplicitContentDetectionConfig() {
    return explicitContentDetectionConfig;
  }

  /**
   * Config for EXPLICIT_CONTENT_DETECTION.
   * @param explicitContentDetectionConfig explicitContentDetectionConfig or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2VideoContext setExplicitContentDetectionConfig(GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig explicitContentDetectionConfig) {
    this.explicitContentDetectionConfig = explicitContentDetectionConfig;
    return this;
  }

  /**
   * Config for LABEL_DETECTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2LabelDetectionConfig getLabelDetectionConfig() {
    return labelDetectionConfig;
  }

  /**
   * Config for LABEL_DETECTION.
   * @param labelDetectionConfig labelDetectionConfig or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2VideoContext setLabelDetectionConfig(GoogleCloudVideointelligenceV1beta2LabelDetectionConfig labelDetectionConfig) {
    this.labelDetectionConfig = labelDetectionConfig;
    return this;
  }

  /**
   * Video segments to annotate. The segments may overlap and are not required to be contiguous or
   * span the whole video. If unspecified, each video is treated as a single segment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2VideoSegment> getSegments() {
    return segments;
  }

  /**
   * Video segments to annotate. The segments may overlap and are not required to be contiguous or
   * span the whole video. If unspecified, each video is treated as a single segment.
   * @param segments segments or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2VideoContext setSegments(java.util.List<GoogleCloudVideointelligenceV1beta2VideoSegment> segments) {
    this.segments = segments;
    return this;
  }

  /**
   * Config for SHOT_CHANGE_DETECTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig getShotChangeDetectionConfig() {
    return shotChangeDetectionConfig;
  }

  /**
   * Config for SHOT_CHANGE_DETECTION.
   * @param shotChangeDetectionConfig shotChangeDetectionConfig or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2VideoContext setShotChangeDetectionConfig(GoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig shotChangeDetectionConfig) {
    this.shotChangeDetectionConfig = shotChangeDetectionConfig;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2VideoContext set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta2VideoContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2VideoContext clone() {
    return (GoogleCloudVideointelligenceV1beta2VideoContext) super.clone();
  }

}
