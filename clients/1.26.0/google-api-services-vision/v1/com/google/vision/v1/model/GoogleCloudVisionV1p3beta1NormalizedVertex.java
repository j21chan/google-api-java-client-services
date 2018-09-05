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
 * A vertex represents a 2D point in the image. NOTE: the normalized vertex coordinates are relative
 * to the original image and range from 0 to 1.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1NormalizedVertex extends com.google.api.client.json.GenericJson {

  /**
   * X coordinate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float x;

  /**
   * Y coordinate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float y;

  /**
   * X coordinate.
   * @return value or {@code null} for none
   */
  public java.lang.Float getX() {
    return x;
  }

  /**
   * X coordinate.
   * @param x x or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1NormalizedVertex setX(java.lang.Float x) {
    this.x = x;
    return this;
  }

  /**
   * Y coordinate.
   * @return value or {@code null} for none
   */
  public java.lang.Float getY() {
    return y;
  }

  /**
   * Y coordinate.
   * @param y y or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1NormalizedVertex setY(java.lang.Float y) {
    this.y = y;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1NormalizedVertex set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1NormalizedVertex) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1NormalizedVertex clone() {
    return (GoogleCloudVisionV1p3beta1NormalizedVertex) super.clone();
  }

}
