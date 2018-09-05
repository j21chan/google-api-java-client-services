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
 * A 3D position in the image, used primarily for Face detection landmarks. A valid Position must
 * have both x and y coordinates. The position coordinates are in the same scale as the original
 * image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p2beta1Position extends com.google.api.client.json.GenericJson {

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
   * Z coordinate (or depth).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float z;

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
  public GoogleCloudVisionV1p2beta1Position setX(java.lang.Float x) {
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
  public GoogleCloudVisionV1p2beta1Position setY(java.lang.Float y) {
    this.y = y;
    return this;
  }

  /**
   * Z coordinate (or depth).
   * @return value or {@code null} for none
   */
  public java.lang.Float getZ() {
    return z;
  }

  /**
   * Z coordinate (or depth).
   * @param z z or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Position setZ(java.lang.Float z) {
    this.z = z;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p2beta1Position set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p2beta1Position) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p2beta1Position clone() {
    return (GoogleCloudVisionV1p2beta1Position) super.clone();
  }

}
