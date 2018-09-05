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

package com.google.content.model;

/**
 * Model definition for ProductAspect.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductAspect extends com.google.api.client.json.GenericJson {

  /**
   * The name of the aspect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aspectName;

  /**
   * The name of the destination. Leave out to apply to all destinations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationName;

  /**
   * Whether the aspect is required, excluded or should be validated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intention;

  /**
   * The name of the aspect.
   * @return value or {@code null} for none
   */
  public java.lang.String getAspectName() {
    return aspectName;
  }

  /**
   * The name of the aspect.
   * @param aspectName aspectName or {@code null} for none
   */
  public ProductAspect setAspectName(java.lang.String aspectName) {
    this.aspectName = aspectName;
    return this;
  }

  /**
   * The name of the destination. Leave out to apply to all destinations.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationName() {
    return destinationName;
  }

  /**
   * The name of the destination. Leave out to apply to all destinations.
   * @param destinationName destinationName or {@code null} for none
   */
  public ProductAspect setDestinationName(java.lang.String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

  /**
   * Whether the aspect is required, excluded or should be validated.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntention() {
    return intention;
  }

  /**
   * Whether the aspect is required, excluded or should be validated.
   * @param intention intention or {@code null} for none
   */
  public ProductAspect setIntention(java.lang.String intention) {
    this.intention = intention;
    return this;
  }

  @Override
  public ProductAspect set(String fieldName, Object value) {
    return (ProductAspect) super.set(fieldName, value);
  }

  @Override
  public ProductAspect clone() {
    return (ProductAspect) super.clone();
  }

}
