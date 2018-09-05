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
 * Rectangle determined by min and max `LatLng` pairs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1LatLongRect extends com.google.api.client.json.GenericJson {

  /**
   * Max lat/long pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng maxLatLng;

  /**
   * Min lat/long pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng minLatLng;

  /**
   * Max lat/long pair.
   * @return value or {@code null} for none
   */
  public LatLng getMaxLatLng() {
    return maxLatLng;
  }

  /**
   * Max lat/long pair.
   * @param maxLatLng maxLatLng or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1LatLongRect setMaxLatLng(LatLng maxLatLng) {
    this.maxLatLng = maxLatLng;
    return this;
  }

  /**
   * Min lat/long pair.
   * @return value or {@code null} for none
   */
  public LatLng getMinLatLng() {
    return minLatLng;
  }

  /**
   * Min lat/long pair.
   * @param minLatLng minLatLng or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1LatLongRect setMinLatLng(LatLng minLatLng) {
    this.minLatLng = minLatLng;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1LatLongRect set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1LatLongRect) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1LatLongRect clone() {
    return (GoogleCloudVisionV1p1beta1LatLongRect) super.clone();
  }

}
