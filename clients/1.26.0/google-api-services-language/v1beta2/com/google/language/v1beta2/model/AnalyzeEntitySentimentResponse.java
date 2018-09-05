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

package com.google.language.v1beta2.model;

/**
 * The entity-level sentiment analysis response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnalyzeEntitySentimentResponse extends com.google.api.client.json.GenericJson {

  /**
   * The recognized entities in the input document with associated sentiments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Entity> entities;

  static {
    // hack to force ProGuard to consider Entity used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Entity.class);
  }

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language field for more
   * details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The recognized entities in the input document with associated sentiments.
   * @return value or {@code null} for none
   */
  public java.util.List<Entity> getEntities() {
    return entities;
  }

  /**
   * The recognized entities in the input document with associated sentiments.
   * @param entities entities or {@code null} for none
   */
  public AnalyzeEntitySentimentResponse setEntities(java.util.List<Entity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language field for more
   * details.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The language of the text, which will be the same as the language specified in the request or,
   * if not specified, the automatically-detected language. See Document.language field for more
   * details.
   * @param language language or {@code null} for none
   */
  public AnalyzeEntitySentimentResponse setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  @Override
  public AnalyzeEntitySentimentResponse set(String fieldName, Object value) {
    return (AnalyzeEntitySentimentResponse) super.set(fieldName, value);
  }

  @Override
  public AnalyzeEntitySentimentResponse clone() {
    return (AnalyzeEntitySentimentResponse) super.clone();
  }

}
