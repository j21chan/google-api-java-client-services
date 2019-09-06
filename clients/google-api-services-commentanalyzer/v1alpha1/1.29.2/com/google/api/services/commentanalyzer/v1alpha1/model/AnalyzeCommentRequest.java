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

package com.google.api.services.commentanalyzer.v1alpha1.model;

/**
 * The comment analysis request message. LINT.IfChange
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Perspective Comment Analyzer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnalyzeCommentRequest extends com.google.api.client.json.GenericJson {

  /**
   * Opaque token that is echoed from the request to the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientToken;

  /**
   * The comment to analyze.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextEntry comment;

  /**
   * Optional identifier associating this AnalyzeCommentRequest with a particular client's
   * community. Different communities may have different norms and rules. Specifying this value
   * enables us to explore building community-specific models for clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String communityId;

  /**
   * The context of the comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Context context;

  /**
   * Do not store the comment or context sent in this request. By default, the service may store
   * comments/context for debugging purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean doNotStore;

  /**
   * The language(s) of the comment and context (if none are specified, the language is
   * automatically detected). If multiple languages are specified, the text is checked in all of
   * them that are supported. Both ISO and BCP-47 language codes are accepted. Current Language
   * Restrictions:  * Only English text ("en") is supported. If none of the languages specified by
   * the caller are supported, an `UNIMPLEMENTED` error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languages;

  /**
   * Specification of requested attributes. The AttributeParameters serve as configuration for each
   * associated attribute. The map keys are attribute names. The following attributes are available:
   * "ATTACK_ON_AUTHOR" - Attack on author of original article or post. "ATTACK_ON_COMMENTER" -
   * Attack on fellow commenter. "ATTACK_ON_PUBLISHER" - Attack on publisher of article/post.
   * "INCOHERENT" - Difficult to understand, nonsensical. "INFLAMMATORY" - Intending to provoke or
   * inflame. "OBSCENE" - Obscene, such as cursing. "OFF_TOPIC" - Not related to the original topic.
   * "SPAM" - Commercial/advertising spam content. "UNSUBSTANTIAL" - Trivial.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AttributeParameters> requestedAttributes;

  /**
   * Session ID. Used to join related RPCs into a single session. For example, an interactive tool
   * that calls both the AnalyzeComment and SuggestCommentScore RPCs should set all invocations of
   * both RPCs to the same Session ID, typically a random 64-bit integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionId;

  /**
   * An advisory parameter that will return span annotations if the model is capable of providing
   * scores with sub-comment resolution. This will likely increase the size of the returned message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean spanAnnotations;

  /**
   * Opaque token that is echoed from the request to the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientToken() {
    return clientToken;
  }

  /**
   * Opaque token that is echoed from the request to the response.
   * @param clientToken clientToken or {@code null} for none
   */
  public AnalyzeCommentRequest setClientToken(java.lang.String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  /**
   * The comment to analyze.
   * @return value or {@code null} for none
   */
  public TextEntry getComment() {
    return comment;
  }

  /**
   * The comment to analyze.
   * @param comment comment or {@code null} for none
   */
  public AnalyzeCommentRequest setComment(TextEntry comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Optional identifier associating this AnalyzeCommentRequest with a particular client's
   * community. Different communities may have different norms and rules. Specifying this value
   * enables us to explore building community-specific models for clients.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommunityId() {
    return communityId;
  }

  /**
   * Optional identifier associating this AnalyzeCommentRequest with a particular client's
   * community. Different communities may have different norms and rules. Specifying this value
   * enables us to explore building community-specific models for clients.
   * @param communityId communityId or {@code null} for none
   */
  public AnalyzeCommentRequest setCommunityId(java.lang.String communityId) {
    this.communityId = communityId;
    return this;
  }

  /**
   * The context of the comment.
   * @return value or {@code null} for none
   */
  public Context getContext() {
    return context;
  }

  /**
   * The context of the comment.
   * @param context context or {@code null} for none
   */
  public AnalyzeCommentRequest setContext(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Do not store the comment or context sent in this request. By default, the service may store
   * comments/context for debugging purposes.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDoNotStore() {
    return doNotStore;
  }

  /**
   * Do not store the comment or context sent in this request. By default, the service may store
   * comments/context for debugging purposes.
   * @param doNotStore doNotStore or {@code null} for none
   */
  public AnalyzeCommentRequest setDoNotStore(java.lang.Boolean doNotStore) {
    this.doNotStore = doNotStore;
    return this;
  }

  /**
   * The language(s) of the comment and context (if none are specified, the language is
   * automatically detected). If multiple languages are specified, the text is checked in all of
   * them that are supported. Both ISO and BCP-47 language codes are accepted. Current Language
   * Restrictions:  * Only English text ("en") is supported. If none of the languages specified by
   * the caller are supported, an `UNIMPLEMENTED` error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguages() {
    return languages;
  }

  /**
   * The language(s) of the comment and context (if none are specified, the language is
   * automatically detected). If multiple languages are specified, the text is checked in all of
   * them that are supported. Both ISO and BCP-47 language codes are accepted. Current Language
   * Restrictions:  * Only English text ("en") is supported. If none of the languages specified by
   * the caller are supported, an `UNIMPLEMENTED` error is returned.
   * @param languages languages or {@code null} for none
   */
  public AnalyzeCommentRequest setLanguages(java.util.List<java.lang.String> languages) {
    this.languages = languages;
    return this;
  }

  /**
   * Specification of requested attributes. The AttributeParameters serve as configuration for each
   * associated attribute. The map keys are attribute names. The following attributes are available:
   * "ATTACK_ON_AUTHOR" - Attack on author of original article or post. "ATTACK_ON_COMMENTER" -
   * Attack on fellow commenter. "ATTACK_ON_PUBLISHER" - Attack on publisher of article/post.
   * "INCOHERENT" - Difficult to understand, nonsensical. "INFLAMMATORY" - Intending to provoke or
   * inflame. "OBSCENE" - Obscene, such as cursing. "OFF_TOPIC" - Not related to the original topic.
   * "SPAM" - Commercial/advertising spam content. "UNSUBSTANTIAL" - Trivial.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AttributeParameters> getRequestedAttributes() {
    return requestedAttributes;
  }

  /**
   * Specification of requested attributes. The AttributeParameters serve as configuration for each
   * associated attribute. The map keys are attribute names. The following attributes are available:
   * "ATTACK_ON_AUTHOR" - Attack on author of original article or post. "ATTACK_ON_COMMENTER" -
   * Attack on fellow commenter. "ATTACK_ON_PUBLISHER" - Attack on publisher of article/post.
   * "INCOHERENT" - Difficult to understand, nonsensical. "INFLAMMATORY" - Intending to provoke or
   * inflame. "OBSCENE" - Obscene, such as cursing. "OFF_TOPIC" - Not related to the original topic.
   * "SPAM" - Commercial/advertising spam content. "UNSUBSTANTIAL" - Trivial.
   * @param requestedAttributes requestedAttributes or {@code null} for none
   */
  public AnalyzeCommentRequest setRequestedAttributes(java.util.Map<String, AttributeParameters> requestedAttributes) {
    this.requestedAttributes = requestedAttributes;
    return this;
  }

  /**
   * Session ID. Used to join related RPCs into a single session. For example, an interactive tool
   * that calls both the AnalyzeComment and SuggestCommentScore RPCs should set all invocations of
   * both RPCs to the same Session ID, typically a random 64-bit integer.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Session ID. Used to join related RPCs into a single session. For example, an interactive tool
   * that calls both the AnalyzeComment and SuggestCommentScore RPCs should set all invocations of
   * both RPCs to the same Session ID, typically a random 64-bit integer.
   * @param sessionId sessionId or {@code null} for none
   */
  public AnalyzeCommentRequest setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * An advisory parameter that will return span annotations if the model is capable of providing
   * scores with sub-comment resolution. This will likely increase the size of the returned message.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSpanAnnotations() {
    return spanAnnotations;
  }

  /**
   * An advisory parameter that will return span annotations if the model is capable of providing
   * scores with sub-comment resolution. This will likely increase the size of the returned message.
   * @param spanAnnotations spanAnnotations or {@code null} for none
   */
  public AnalyzeCommentRequest setSpanAnnotations(java.lang.Boolean spanAnnotations) {
    this.spanAnnotations = spanAnnotations;
    return this;
  }

  @Override
  public AnalyzeCommentRequest set(String fieldName, Object value) {
    return (AnalyzeCommentRequest) super.set(fieldName, value);
  }

  @Override
  public AnalyzeCommentRequest clone() {
    return (AnalyzeCommentRequest) super.clone();
  }

}
