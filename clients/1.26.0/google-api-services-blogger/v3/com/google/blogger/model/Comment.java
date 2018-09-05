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

package com.google.blogger.model;

/**
 * Model definition for Comment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Blogger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Comment extends com.google.api.client.json.GenericJson {

  /**
   * The author of this Comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Author author;

  /**
   * Data about the blog containing this comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Blog blog;

  /**
   * The actual content of the comment. May include HTML markup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The identifier for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Data about the comment this is in reply to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InReplyTo inReplyTo;

  /**
   * The kind of this entry. Always blogger#comment
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Data about the post containing this comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Post post;

  /**
   * RFC 3339 date-time when this comment was published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime published;

  /**
   * The API REST URL to fetch this resource from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The status of the comment (only populated for admin users)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * RFC 3339 date-time when this comment was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * The author of this Comment.
   * @return value or {@code null} for none
   */
  public Author getAuthor() {
    return author;
  }

  /**
   * The author of this Comment.
   * @param author author or {@code null} for none
   */
  public Comment setAuthor(Author author) {
    this.author = author;
    return this;
  }

  /**
   * Data about the blog containing this comment.
   * @return value or {@code null} for none
   */
  public Blog getBlog() {
    return blog;
  }

  /**
   * Data about the blog containing this comment.
   * @param blog blog or {@code null} for none
   */
  public Comment setBlog(Blog blog) {
    this.blog = blog;
    return this;
  }

  /**
   * The actual content of the comment. May include HTML markup.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The actual content of the comment. May include HTML markup.
   * @param content content or {@code null} for none
   */
  public Comment setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The identifier for this resource.
   * @param id id or {@code null} for none
   */
  public Comment setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Data about the comment this is in reply to.
   * @return value or {@code null} for none
   */
  public InReplyTo getInReplyTo() {
    return inReplyTo;
  }

  /**
   * Data about the comment this is in reply to.
   * @param inReplyTo inReplyTo or {@code null} for none
   */
  public Comment setInReplyTo(InReplyTo inReplyTo) {
    this.inReplyTo = inReplyTo;
    return this;
  }

  /**
   * The kind of this entry. Always blogger#comment
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this entry. Always blogger#comment
   * @param kind kind or {@code null} for none
   */
  public Comment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Data about the post containing this comment.
   * @return value or {@code null} for none
   */
  public Post getPost() {
    return post;
  }

  /**
   * Data about the post containing this comment.
   * @param post post or {@code null} for none
   */
  public Comment setPost(Post post) {
    this.post = post;
    return this;
  }

  /**
   * RFC 3339 date-time when this comment was published.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublished() {
    return published;
  }

  /**
   * RFC 3339 date-time when this comment was published.
   * @param published published or {@code null} for none
   */
  public Comment setPublished(com.google.api.client.util.DateTime published) {
    this.published = published;
    return this;
  }

  /**
   * The API REST URL to fetch this resource from.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The API REST URL to fetch this resource from.
   * @param selfLink selfLink or {@code null} for none
   */
  public Comment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The status of the comment (only populated for admin users)
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the comment (only populated for admin users)
   * @param status status or {@code null} for none
   */
  public Comment setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * RFC 3339 date-time when this comment was last updated.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * RFC 3339 date-time when this comment was last updated.
   * @param updated updated or {@code null} for none
   */
  public Comment setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  @Override
  public Comment set(String fieldName, Object value) {
    return (Comment) super.set(fieldName, value);
  }

  @Override
  public Comment clone() {
    return (Comment) super.clone();
  }

  /**
   * The author of this Comment.
   */
  public static final class Author extends com.google.api.client.json.GenericJson {

    /**
     * The display name.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String displayName;

    /**
     * The identifier of the Comment creator.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The comment creator's avatar.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Image image;

    /**
     * The URL of the Comment creator's Profile page.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * The display name.
     * @return value or {@code null} for none
     */
    public java.lang.String getDisplayName() {
      return displayName;
    }

    /**
     * The display name.
     * @param displayName displayName or {@code null} for none
     */
    public Author setDisplayName(java.lang.String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The identifier of the Comment creator.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identifier of the Comment creator.
     * @param id id or {@code null} for none
     */
    public Author setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The comment creator's avatar.
     * @return value or {@code null} for none
     */
    public Image getImage() {
      return image;
    }

    /**
     * The comment creator's avatar.
     * @param image image or {@code null} for none
     */
    public Author setImage(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The URL of the Comment creator's Profile page.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * The URL of the Comment creator's Profile page.
     * @param url url or {@code null} for none
     */
    public Author setUrl(java.lang.String url) {
      this.url = url;
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

    /**
     * The comment creator's avatar.
     */
    public static final class Image extends com.google.api.client.json.GenericJson {

      /**
       * The comment creator's avatar URL.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /**
       * The comment creator's avatar URL.
       * @return value or {@code null} for none
       */
      public java.lang.String getUrl() {
        return url;
      }

      /**
       * The comment creator's avatar URL.
       * @param url url or {@code null} for none
       */
      public Image setUrl(java.lang.String url) {
        this.url = url;
        return this;
      }

      @Override
      public Image set(String fieldName, Object value) {
        return (Image) super.set(fieldName, value);
      }

      @Override
      public Image clone() {
        return (Image) super.clone();
      }

    }
  }

  /**
   * Data about the blog containing this comment.
   */
  public static final class Blog extends com.google.api.client.json.GenericJson {

    /**
     * The identifier of the blog containing this comment.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The identifier of the blog containing this comment.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identifier of the blog containing this comment.
     * @param id id or {@code null} for none
     */
    public Blog setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public Blog set(String fieldName, Object value) {
      return (Blog) super.set(fieldName, value);
    }

    @Override
    public Blog clone() {
      return (Blog) super.clone();
    }

  }

  /**
   * Data about the comment this is in reply to.
   */
  public static final class InReplyTo extends com.google.api.client.json.GenericJson {

    /**
     * The identified of the parent of this comment.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The identified of the parent of this comment.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identified of the parent of this comment.
     * @param id id or {@code null} for none
     */
    public InReplyTo setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public InReplyTo set(String fieldName, Object value) {
      return (InReplyTo) super.set(fieldName, value);
    }

    @Override
    public InReplyTo clone() {
      return (InReplyTo) super.clone();
    }

  }

  /**
   * Data about the post containing this comment.
   */
  public static final class Post extends com.google.api.client.json.GenericJson {

    /**
     * The identifier of the post containing this comment.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The identifier of the post containing this comment.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identifier of the post containing this comment.
     * @param id id or {@code null} for none
     */
    public Post setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public Post set(String fieldName, Object value) {
      return (Post) super.set(fieldName, value);
    }

    @Override
    public Post clone() {
      return (Post) super.clone();
    }

  }

}
