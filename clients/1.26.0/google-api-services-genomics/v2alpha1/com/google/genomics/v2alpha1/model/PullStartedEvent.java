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

package com.google.genomics.v2alpha1.model;

/**
 * An event generated when the worker starts pulling an image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PullStartedEvent extends com.google.api.client.json.GenericJson {

  /**
   * The URI of the image that was pulled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * The URI of the image that was pulled.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * The URI of the image that was pulled.
   * @param imageUri imageUri or {@code null} for none
   */
  public PullStartedEvent setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  @Override
  public PullStartedEvent set(String fieldName, Object value) {
    return (PullStartedEvent) super.set(fieldName, value);
  }

  @Override
  public PullStartedEvent clone() {
    return (PullStartedEvent) super.clone();
  }

}
