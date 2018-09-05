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
 * Basic details about a video category, such as its localized title.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoCategorySnippet extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean assignable;

  /**
   * The YouTube channel that created the video category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The video category's title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAssignable() {
    return assignable;
  }

  /**
   * @param assignable assignable or {@code null} for none
   */
  public VideoCategorySnippet setAssignable(java.lang.Boolean assignable) {
    this.assignable = assignable;
    return this;
  }

  /**
   * The YouTube channel that created the video category.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The YouTube channel that created the video category.
   * @param channelId channelId or {@code null} for none
   */
  public VideoCategorySnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The video category's title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The video category's title.
   * @param title title or {@code null} for none
   */
  public VideoCategorySnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public VideoCategorySnippet set(String fieldName, Object value) {
    return (VideoCategorySnippet) super.set(fieldName, value);
  }

  @Override
  public VideoCategorySnippet clone() {
    return (VideoCategorySnippet) super.clone();
  }

}
