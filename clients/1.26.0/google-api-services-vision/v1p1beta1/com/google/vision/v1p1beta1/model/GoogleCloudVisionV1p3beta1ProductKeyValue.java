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
 * A product label represented as a key-value pair.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1ProductKeyValue extends com.google.api.client.json.GenericJson {

  /**
   * The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
   * @param key key or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ProductKeyValue setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
   * @param value value or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ProductKeyValue setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1ProductKeyValue set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1ProductKeyValue) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1ProductKeyValue clone() {
    return (GoogleCloudVisionV1p3beta1ProductKeyValue) super.clone();
  }

}
