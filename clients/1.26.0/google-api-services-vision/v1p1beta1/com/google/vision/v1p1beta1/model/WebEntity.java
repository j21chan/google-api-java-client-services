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
 * Entity deduced from similar images on the Internet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WebEntity extends com.google.api.client.json.GenericJson {

  /**
   * Canonical description of the entity, in English.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Opaque entity ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityId;

  /**
   * Overall relevancy score for the entity. Not normalized and not comparable across different
   * image queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * Canonical description of the entity, in English.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Canonical description of the entity, in English.
   * @param description description or {@code null} for none
   */
  public WebEntity setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Opaque entity ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityId() {
    return entityId;
  }

  /**
   * Opaque entity ID.
   * @param entityId entityId or {@code null} for none
   */
  public WebEntity setEntityId(java.lang.String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Overall relevancy score for the entity. Not normalized and not comparable across different
   * image queries.
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * Overall relevancy score for the entity. Not normalized and not comparable across different
   * image queries.
   * @param score score or {@code null} for none
   */
  public WebEntity setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  @Override
  public WebEntity set(String fieldName, Object value) {
    return (WebEntity) super.set(fieldName, value);
  }

  @Override
  public WebEntity clone() {
    return (WebEntity) super.clone();
  }

}
