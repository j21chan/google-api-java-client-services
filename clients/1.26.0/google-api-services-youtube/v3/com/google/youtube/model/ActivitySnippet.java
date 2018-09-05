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

package com.google.youtube.model;

/**
 * Basic details about an activity, including title, description, thumbnails, activity type and
 * group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActivitySnippet extends com.google.api.client.json.GenericJson {

  /**
   * The ID that YouTube uses to uniquely identify the channel associated with the activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * Channel title for the channel responsible for this activity
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelTitle;

  /**
   * The description of the resource primarily associated with the activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The group ID associated with the activity. A group ID identifies user events that are
   * associated with the same user and resource. For example, if a user rates a video and marks the
   * same video as a favorite, the entries for those events would have the same group ID in the
   * user's activity feed. In your user interface, you can avoid repetition by grouping events with
   * the same groupId value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupId;

  /**
   * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime publishedAt;

  /**
   * A map of thumbnail images associated with the resource that is primarily associated with the
   * activity. For each object in the map, the key is the name of the thumbnail image, and the value
   * is an object that contains other information about the thumbnail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ThumbnailDetails thumbnails;

  /**
   * The title of the resource primarily associated with the activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The type of activity that the resource describes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The ID that YouTube uses to uniquely identify the channel associated with the activity.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel associated with the activity.
   * @param channelId channelId or {@code null} for none
   */
  public ActivitySnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Channel title for the channel responsible for this activity
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelTitle() {
    return channelTitle;
  }

  /**
   * Channel title for the channel responsible for this activity
   * @param channelTitle channelTitle or {@code null} for none
   */
  public ActivitySnippet setChannelTitle(java.lang.String channelTitle) {
    this.channelTitle = channelTitle;
    return this;
  }

  /**
   * The description of the resource primarily associated with the activity.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the resource primarily associated with the activity.
   * @param description description or {@code null} for none
   */
  public ActivitySnippet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The group ID associated with the activity. A group ID identifies user events that are
   * associated with the same user and resource. For example, if a user rates a video and marks the
   * same video as a favorite, the entries for those events would have the same group ID in the
   * user's activity feed. In your user interface, you can avoid repetition by grouping events with
   * the same groupId value.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupId() {
    return groupId;
  }

  /**
   * The group ID associated with the activity. A group ID identifies user events that are
   * associated with the same user and resource. For example, if a user rates a video and marks the
   * same video as a favorite, the entries for those events would have the same group ID in the
   * user's activity feed. In your user interface, you can avoid repetition by grouping events with
   * the same groupId value.
   * @param groupId groupId or {@code null} for none
   */
  public ActivitySnippet setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public ActivitySnippet setPublishedAt(com.google.api.client.util.DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * A map of thumbnail images associated with the resource that is primarily associated with the
   * activity. For each object in the map, the key is the name of the thumbnail image, and the value
   * is an object that contains other information about the thumbnail.
   * @return value or {@code null} for none
   */
  public ThumbnailDetails getThumbnails() {
    return thumbnails;
  }

  /**
   * A map of thumbnail images associated with the resource that is primarily associated with the
   * activity. For each object in the map, the key is the name of the thumbnail image, and the value
   * is an object that contains other information about the thumbnail.
   * @param thumbnails thumbnails or {@code null} for none
   */
  public ActivitySnippet setThumbnails(ThumbnailDetails thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  /**
   * The title of the resource primarily associated with the activity.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the resource primarily associated with the activity.
   * @param title title or {@code null} for none
   */
  public ActivitySnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The type of activity that the resource describes.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of activity that the resource describes.
   * @param type type or {@code null} for none
   */
  public ActivitySnippet setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ActivitySnippet set(String fieldName, Object value) {
    return (ActivitySnippet) super.set(fieldName, value);
  }

  @Override
  public ActivitySnippet clone() {
    return (ActivitySnippet) super.clone();
  }

}
