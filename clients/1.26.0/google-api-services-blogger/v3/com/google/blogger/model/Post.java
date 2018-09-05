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
 * Model definition for Post.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Blogger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Post extends com.google.api.client.json.GenericJson {

  /**
   * The author of this Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Author author;

  /**
   * Data about the blog containing this Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Blog blog;

  /**
   * The content of the Post. May contain HTML markup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The JSON meta-data for the Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customMetaData;

  /**
   * Etag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The identifier of this Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Display image for the Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Images> images;

  static {
    // hack to force ProGuard to consider Images used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Images.class);
  }

  /**
   * The kind of this entity. Always blogger#post
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The list of labels this Post was tagged with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> labels;

  /**
   * The location for geotagged posts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Location location;

  /**
   * RFC 3339 date-time when this Post was published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime published;

  /**
   * Comment control and display setting for readers of this post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String readerComments;

  /**
   * The container of comments on this Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Replies replies;

  /**
   * The API REST URL to fetch this resource from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Status of the post. Only set for admin-level requests
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The title of the Post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The title link URL, similar to atom's related link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String titleLink;

  /**
   * RFC 3339 date-time when this Post was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * The URL where this Post is displayed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The author of this Post.
   * @return value or {@code null} for none
   */
  public Author getAuthor() {
    return author;
  }

  /**
   * The author of this Post.
   * @param author author or {@code null} for none
   */
  public Post setAuthor(Author author) {
    this.author = author;
    return this;
  }

  /**
   * Data about the blog containing this Post.
   * @return value or {@code null} for none
   */
  public Blog getBlog() {
    return blog;
  }

  /**
   * Data about the blog containing this Post.
   * @param blog blog or {@code null} for none
   */
  public Post setBlog(Blog blog) {
    this.blog = blog;
    return this;
  }

  /**
   * The content of the Post. May contain HTML markup.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The content of the Post. May contain HTML markup.
   * @param content content or {@code null} for none
   */
  public Post setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The JSON meta-data for the Post.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomMetaData() {
    return customMetaData;
  }

  /**
   * The JSON meta-data for the Post.
   * @param customMetaData customMetaData or {@code null} for none
   */
  public Post setCustomMetaData(java.lang.String customMetaData) {
    this.customMetaData = customMetaData;
    return this;
  }

  /**
   * Etag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of the resource.
   * @param etag etag or {@code null} for none
   */
  public Post setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The identifier of this Post.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The identifier of this Post.
   * @param id id or {@code null} for none
   */
  public Post setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Display image for the Post.
   * @return value or {@code null} for none
   */
  public java.util.List<Images> getImages() {
    return images;
  }

  /**
   * Display image for the Post.
   * @param images images or {@code null} for none
   */
  public Post setImages(java.util.List<Images> images) {
    this.images = images;
    return this;
  }

  /**
   * The kind of this entity. Always blogger#post
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this entity. Always blogger#post
   * @param kind kind or {@code null} for none
   */
  public Post setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The list of labels this Post was tagged with.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The list of labels this Post was tagged with.
   * @param labels labels or {@code null} for none
   */
  public Post setLabels(java.util.List<java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The location for geotagged posts.
   * @return value or {@code null} for none
   */
  public Location getLocation() {
    return location;
  }

  /**
   * The location for geotagged posts.
   * @param location location or {@code null} for none
   */
  public Post setLocation(Location location) {
    this.location = location;
    return this;
  }

  /**
   * RFC 3339 date-time when this Post was published.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublished() {
    return published;
  }

  /**
   * RFC 3339 date-time when this Post was published.
   * @param published published or {@code null} for none
   */
  public Post setPublished(com.google.api.client.util.DateTime published) {
    this.published = published;
    return this;
  }

  /**
   * Comment control and display setting for readers of this post.
   * @return value or {@code null} for none
   */
  public java.lang.String getReaderComments() {
    return readerComments;
  }

  /**
   * Comment control and display setting for readers of this post.
   * @param readerComments readerComments or {@code null} for none
   */
  public Post setReaderComments(java.lang.String readerComments) {
    this.readerComments = readerComments;
    return this;
  }

  /**
   * The container of comments on this Post.
   * @return value or {@code null} for none
   */
  public Replies getReplies() {
    return replies;
  }

  /**
   * The container of comments on this Post.
   * @param replies replies or {@code null} for none
   */
  public Post setReplies(Replies replies) {
    this.replies = replies;
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
  public Post setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Status of the post. Only set for admin-level requests
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the post. Only set for admin-level requests
   * @param status status or {@code null} for none
   */
  public Post setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The title of the Post.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the Post.
   * @param title title or {@code null} for none
   */
  public Post setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The title link URL, similar to atom's related link.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitleLink() {
    return titleLink;
  }

  /**
   * The title link URL, similar to atom's related link.
   * @param titleLink titleLink or {@code null} for none
   */
  public Post setTitleLink(java.lang.String titleLink) {
    this.titleLink = titleLink;
    return this;
  }

  /**
   * RFC 3339 date-time when this Post was last updated.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * RFC 3339 date-time when this Post was last updated.
   * @param updated updated or {@code null} for none
   */
  public Post setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The URL where this Post is displayed.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL where this Post is displayed.
   * @param url url or {@code null} for none
   */
  public Post setUrl(java.lang.String url) {
    this.url = url;
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

  /**
   * The author of this Post.
   */
  public static final class Author extends com.google.api.client.json.GenericJson {

    /**
     * The display name.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String displayName;

    /**
     * The identifier of the Post creator.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The Post author's avatar.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Image image;

    /**
     * The URL of the Post creator's Profile page.
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
     * The identifier of the Post creator.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identifier of the Post creator.
     * @param id id or {@code null} for none
     */
    public Author setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The Post author's avatar.
     * @return value or {@code null} for none
     */
    public Image getImage() {
      return image;
    }

    /**
     * The Post author's avatar.
     * @param image image or {@code null} for none
     */
    public Author setImage(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The URL of the Post creator's Profile page.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * The URL of the Post creator's Profile page.
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
     * The Post author's avatar.
     */
    public static final class Image extends com.google.api.client.json.GenericJson {

      /**
       * The Post author's avatar URL.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /**
       * The Post author's avatar URL.
       * @return value or {@code null} for none
       */
      public java.lang.String getUrl() {
        return url;
      }

      /**
       * The Post author's avatar URL.
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
   * Data about the blog containing this Post.
   */
  public static final class Blog extends com.google.api.client.json.GenericJson {

    /**
     * The identifier of the Blog that contains this Post.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The identifier of the Blog that contains this Post.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The identifier of the Blog that contains this Post.
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
   * Model definition for PostImages.
   */
  public static final class Images extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * @param url url or {@code null} for none
     */
    public Images setUrl(java.lang.String url) {
      this.url = url;
      return this;
    }

    @Override
    public Images set(String fieldName, Object value) {
      return (Images) super.set(fieldName, value);
    }

    @Override
    public Images clone() {
      return (Images) super.clone();
    }

  }

  /**
   * The location for geotagged posts.
   */
  public static final class Location extends com.google.api.client.json.GenericJson {

    /**
     * Location's latitude.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double lat;

    /**
     * Location's longitude.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double lng;

    /**
     * Location name.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * Location's viewport span. Can be used when rendering a map preview.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String span;

    /**
     * Location's latitude.
     * @return value or {@code null} for none
     */
    public java.lang.Double getLat() {
      return lat;
    }

    /**
     * Location's latitude.
     * @param lat lat or {@code null} for none
     */
    public Location setLat(java.lang.Double lat) {
      this.lat = lat;
      return this;
    }

    /**
     * Location's longitude.
     * @return value or {@code null} for none
     */
    public java.lang.Double getLng() {
      return lng;
    }

    /**
     * Location's longitude.
     * @param lng lng or {@code null} for none
     */
    public Location setLng(java.lang.Double lng) {
      this.lng = lng;
      return this;
    }

    /**
     * Location name.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * Location name.
     * @param name name or {@code null} for none
     */
    public Location setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    /**
     * Location's viewport span. Can be used when rendering a map preview.
     * @return value or {@code null} for none
     */
    public java.lang.String getSpan() {
      return span;
    }

    /**
     * Location's viewport span. Can be used when rendering a map preview.
     * @param span span or {@code null} for none
     */
    public Location setSpan(java.lang.String span) {
      this.span = span;
      return this;
    }

    @Override
    public Location set(String fieldName, Object value) {
      return (Location) super.set(fieldName, value);
    }

    @Override
    public Location clone() {
      return (Location) super.clone();
    }

  }

  /**
   * The container of comments on this Post.
   */
  public static final class Replies extends com.google.api.client.json.GenericJson {

    /**
     * The List of Comments for this Post.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Comment> items;

    static {
      // hack to force ProGuard to consider Comment used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Comment.class);
    }

    /**
     * The URL of the comments on this post.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String selfLink;

    /**
     * The count of comments on this post.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long totalItems;

    /**
     * The List of Comments for this Post.
     * @return value or {@code null} for none
     */
    public java.util.List<Comment> getItems() {
      return items;
    }

    /**
     * The List of Comments for this Post.
     * @param items items or {@code null} for none
     */
    public Replies setItems(java.util.List<Comment> items) {
      this.items = items;
      return this;
    }

    /**
     * The URL of the comments on this post.
     * @return value or {@code null} for none
     */
    public java.lang.String getSelfLink() {
      return selfLink;
    }

    /**
     * The URL of the comments on this post.
     * @param selfLink selfLink or {@code null} for none
     */
    public Replies setSelfLink(java.lang.String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    /**
     * The count of comments on this post.
     * @return value or {@code null} for none
     */
    public java.lang.Long getTotalItems() {
      return totalItems;
    }

    /**
     * The count of comments on this post.
     * @param totalItems totalItems or {@code null} for none
     */
    public Replies setTotalItems(java.lang.Long totalItems) {
      this.totalItems = totalItems;
      return this;
    }

    @Override
    public Replies set(String fieldName, Object value) {
      return (Replies) super.set(fieldName, value);
    }

    @Override
    public Replies clone() {
      return (Replies) super.clone();
    }

  }

}
