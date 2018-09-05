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
 * The text annotations response message.
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
public final class AnnotateTextResponse extends com.google.api.client.json.GenericJson {

  /**
   * Categories identified in the input document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ClassificationCategory> categories;

  static {
    // hack to force ProGuard to consider ClassificationCategory used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ClassificationCategory.class);
  }

  /**
   * The overall sentiment for the document. Populated if the user enables
   * AnnotateTextRequest.Features.extract_document_sentiment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Sentiment documentSentiment;

  /**
   * Entities, along with their semantic information, in the input document. Populated if the user
   * enables AnnotateTextRequest.Features.extract_entities.
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
   * Sentences in the input document. Populated if the user enables
   * AnnotateTextRequest.Features.extract_syntax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Sentence> sentences;

  /**
   * Tokens, along with their syntactic information, in the input document. Populated if the user
   * enables AnnotateTextRequest.Features.extract_syntax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Token> tokens;

  /**
   * Categories identified in the input document.
   * @return value or {@code null} for none
   */
  public java.util.List<ClassificationCategory> getCategories() {
    return categories;
  }

  /**
   * Categories identified in the input document.
   * @param categories categories or {@code null} for none
   */
  public AnnotateTextResponse setCategories(java.util.List<ClassificationCategory> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * The overall sentiment for the document. Populated if the user enables
   * AnnotateTextRequest.Features.extract_document_sentiment.
   * @return value or {@code null} for none
   */
  public Sentiment getDocumentSentiment() {
    return documentSentiment;
  }

  /**
   * The overall sentiment for the document. Populated if the user enables
   * AnnotateTextRequest.Features.extract_document_sentiment.
   * @param documentSentiment documentSentiment or {@code null} for none
   */
  public AnnotateTextResponse setDocumentSentiment(Sentiment documentSentiment) {
    this.documentSentiment = documentSentiment;
    return this;
  }

  /**
   * Entities, along with their semantic information, in the input document. Populated if the user
   * enables AnnotateTextRequest.Features.extract_entities.
   * @return value or {@code null} for none
   */
  public java.util.List<Entity> getEntities() {
    return entities;
  }

  /**
   * Entities, along with their semantic information, in the input document. Populated if the user
   * enables AnnotateTextRequest.Features.extract_entities.
   * @param entities entities or {@code null} for none
   */
  public AnnotateTextResponse setEntities(java.util.List<Entity> entities) {
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
  public AnnotateTextResponse setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * Sentences in the input document. Populated if the user enables
   * AnnotateTextRequest.Features.extract_syntax.
   * @return value or {@code null} for none
   */
  public java.util.List<Sentence> getSentences() {
    return sentences;
  }

  /**
   * Sentences in the input document. Populated if the user enables
   * AnnotateTextRequest.Features.extract_syntax.
   * @param sentences sentences or {@code null} for none
   */
  public AnnotateTextResponse setSentences(java.util.List<Sentence> sentences) {
    this.sentences = sentences;
    return this;
  }

  /**
   * Tokens, along with their syntactic information, in the input document. Populated if the user
   * enables AnnotateTextRequest.Features.extract_syntax.
   * @return value or {@code null} for none
   */
  public java.util.List<Token> getTokens() {
    return tokens;
  }

  /**
   * Tokens, along with their syntactic information, in the input document. Populated if the user
   * enables AnnotateTextRequest.Features.extract_syntax.
   * @param tokens tokens or {@code null} for none
   */
  public AnnotateTextResponse setTokens(java.util.List<Token> tokens) {
    this.tokens = tokens;
    return this;
  }

  @Override
  public AnnotateTextResponse set(String fieldName, Object value) {
    return (AnnotateTextResponse) super.set(fieldName, value);
  }

  @Override
  public AnnotateTextResponse clone() {
    return (AnnotateTextResponse) super.clone();
  }

}
