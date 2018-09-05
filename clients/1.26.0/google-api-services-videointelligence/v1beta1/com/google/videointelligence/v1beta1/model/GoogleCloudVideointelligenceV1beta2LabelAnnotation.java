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

package com.google.videointelligence.v1beta1.model;

/**
 * Label annotation.
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
public final class GoogleCloudVideointelligenceV1beta2LabelAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Common categories for the detected entity. E.g. when the label is `Terrier` the category is
   * likely `dog`. And in some cases there might be more than one categories e.g. `Terrier` could
   * also be a `pet`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2Entity> categoryEntities;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1beta2Entity used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1beta2Entity.class);
  }

  /**
   * Detected entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1beta2Entity entity;

  /**
   * All video frames where a label was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2LabelFrame> frames;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1beta2LabelFrame used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1beta2LabelFrame.class);
  }

  /**
   * All video segments where a label was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1beta2LabelSegment> segments;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1beta2LabelSegment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1beta2LabelSegment.class);
  }

  /**
   * Common categories for the detected entity. E.g. when the label is `Terrier` the category is
   * likely `dog`. And in some cases there might be more than one categories e.g. `Terrier` could
   * also be a `pet`.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2Entity> getCategoryEntities() {
    return categoryEntities;
  }

  /**
   * Common categories for the detected entity. E.g. when the label is `Terrier` the category is
   * likely `dog`. And in some cases there might be more than one categories e.g. `Terrier` could
   * also be a `pet`.
   * @param categoryEntities categoryEntities or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2LabelAnnotation setCategoryEntities(java.util.List<GoogleCloudVideointelligenceV1beta2Entity> categoryEntities) {
    this.categoryEntities = categoryEntities;
    return this;
  }

  /**
   * Detected entity.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2Entity getEntity() {
    return entity;
  }

  /**
   * Detected entity.
   * @param entity entity or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2LabelAnnotation setEntity(GoogleCloudVideointelligenceV1beta2Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * All video frames where a label was detected.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2LabelFrame> getFrames() {
    return frames;
  }

  /**
   * All video frames where a label was detected.
   * @param frames frames or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2LabelAnnotation setFrames(java.util.List<GoogleCloudVideointelligenceV1beta2LabelFrame> frames) {
    this.frames = frames;
    return this;
  }

  /**
   * All video segments where a label was detected.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1beta2LabelSegment> getSegments() {
    return segments;
  }

  /**
   * All video segments where a label was detected.
   * @param segments segments or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2LabelAnnotation setSegments(java.util.List<GoogleCloudVideointelligenceV1beta2LabelSegment> segments) {
    this.segments = segments;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2LabelAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta2LabelAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2LabelAnnotation clone() {
    return (GoogleCloudVideointelligenceV1beta2LabelAnnotation) super.clone();
  }

}
