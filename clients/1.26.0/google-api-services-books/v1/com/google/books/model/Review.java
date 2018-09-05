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

package com.google.books.model;

/**
 * Model definition for Review.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Review extends com.google.api.client.json.GenericJson {

  /**
   * Author of this review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Author author;

  /**
   * Review text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Date of this review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String date;

  /**
   * URL for the full review text, for reviews gathered from the web.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullTextUrl;

  /**
   * Resource type for a review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rating;

  /**
   * Information regarding the source of this review, when the review is not from a Google Books
   * user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Source source;

  /**
   * Title for this review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Volume that this review is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String volumeId;

  /**
   * Author of this review.
   * @return value or {@code null} for none
   */
  public Author getAuthor() {
    return author;
  }

  /**
   * Author of this review.
   * @param author author or {@code null} for none
   */
  public Review setAuthor(Author author) {
    this.author = author;
    return this;
  }

  /**
   * Review text.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Review text.
   * @param content content or {@code null} for none
   */
  public Review setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Date of this review.
   * @return value or {@code null} for none
   */
  public java.lang.String getDate() {
    return date;
  }

  /**
   * Date of this review.
   * @param date date or {@code null} for none
   */
  public Review setDate(java.lang.String date) {
    this.date = date;
    return this;
  }

  /**
   * URL for the full review text, for reviews gathered from the web.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullTextUrl() {
    return fullTextUrl;
  }

  /**
   * URL for the full review text, for reviews gathered from the web.
   * @param fullTextUrl fullTextUrl or {@code null} for none
   */
  public Review setFullTextUrl(java.lang.String fullTextUrl) {
    this.fullTextUrl = fullTextUrl;
    return this;
  }

  /**
   * Resource type for a review.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for a review.
   * @param kind kind or {@code null} for none
   */
  public Review setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED.
   * @return value or {@code null} for none
   */
  public java.lang.String getRating() {
    return rating;
  }

  /**
   * Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED.
   * @param rating rating or {@code null} for none
   */
  public Review setRating(java.lang.String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Information regarding the source of this review, when the review is not from a Google Books
   * user.
   * @return value or {@code null} for none
   */
  public Source getSource() {
    return source;
  }

  /**
   * Information regarding the source of this review, when the review is not from a Google Books
   * user.
   * @param source source or {@code null} for none
   */
  public Review setSource(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Title for this review.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title for this review.
   * @param title title or {@code null} for none
   */
  public Review setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER.
   * @param type type or {@code null} for none
   */
  public Review setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Volume that this review is for.
   * @return value or {@code null} for none
   */
  public java.lang.String getVolumeId() {
    return volumeId;
  }

  /**
   * Volume that this review is for.
   * @param volumeId volumeId or {@code null} for none
   */
  public Review setVolumeId(java.lang.String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  @Override
  public Review set(String fieldName, Object value) {
    return (Review) super.set(fieldName, value);
  }

  @Override
  public Review clone() {
    return (Review) super.clone();
  }

  /**
   * Author of this review.
   */
  public static final class Author extends com.google.api.client.json.GenericJson {

    /**
     * Name of this person.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String displayName;

    /**
     * Name of this person.
     * @return value or {@code null} for none
     */
    public java.lang.String getDisplayName() {
      return displayName;
    }

    /**
     * Name of this person.
     * @param displayName displayName or {@code null} for none
     */
    public Author setDisplayName(java.lang.String displayName) {
      this.displayName = displayName;
      return this;
    }

    @Override
    public Author set(String fieldName, Object value) {
      return (Author) super.set(fieldName, value);
    }

    @Override
    public Author clone() {
      return (Author) super.clone();
    }

  }

  /**
   * Information regarding the source of this review, when the review is not from a Google Books user.
   */
  public static final class Source extends com.google.api.client.json.GenericJson {

    /**
     * Name of the source.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String description;

    /**
     * Extra text about the source of the review.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String extraDescription;

    /**
     * URL of the source of the review.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * Name of the source.
     * @return value or {@code null} for none
     */
    public java.lang.String getDescription() {
      return description;
    }

    /**
     * Name of the source.
     * @param description description or {@code null} for none
     */
    public Source setDescription(java.lang.String description) {
      this.description = description;
      return this;
    }

    /**
     * Extra text about the source of the review.
     * @return value or {@code null} for none
     */
    public java.lang.String getExtraDescription() {
      return extraDescription;
    }

    /**
     * Extra text about the source of the review.
     * @param extraDescription extraDescription or {@code null} for none
     */
    public Source setExtraDescription(java.lang.String extraDescription) {
      this.extraDescription = extraDescription;
      return this;
    }

    /**
     * URL of the source of the review.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * URL of the source of the review.
     * @param url url or {@code null} for none
     */
    public Source setUrl(java.lang.String url) {
      this.url = url;
      return this;
    }

    @Override
    public Source set(String fieldName, Object value) {
      return (Source) super.set(fieldName, value);
    }

    @Override
    public Source clone() {
      return (Source) super.clone();
    }

  }

}
