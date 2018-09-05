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
 * Model definition for ChannelSection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelSection extends com.google.api.client.json.GenericJson {

  /**
   * The contentDetails object contains details about the channel section content, such as a list of
   * playlists or channels featured in the section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelSectionContentDetails contentDetails;

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID that YouTube uses to uniquely identify the channel section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#channelSection".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Localizations for different languages
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ChannelSectionLocalization> localizations;

  /**
   * The snippet object contains basic details about the channel section, such as its type, style
   * and title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelSectionSnippet snippet;

  /**
   * The targeting object contains basic targeting settings about the channel section.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelSectionTargeting targeting;

  /**
   * The contentDetails object contains details about the channel section content, such as a list of
   * playlists or channels featured in the section.
   * @return value or {@code null} for none
   */
  public ChannelSectionContentDetails getContentDetails() {
    return contentDetails;
  }

  /**
   * The contentDetails object contains details about the channel section content, such as a list of
   * playlists or channels featured in the section.
   * @param contentDetails contentDetails or {@code null} for none
   */
  public ChannelSection setContentDetails(ChannelSectionContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public ChannelSection setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel section.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel section.
   * @param id id or {@code null} for none
   */
  public ChannelSection setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#channelSection".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#channelSection".
   * @param kind kind or {@code null} for none
   */
  public ChannelSection setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Localizations for different languages
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ChannelSectionLocalization> getLocalizations() {
    return localizations;
  }

  /**
   * Localizations for different languages
   * @param localizations localizations or {@code null} for none
   */
  public ChannelSection setLocalizations(java.util.Map<String, ChannelSectionLocalization> localizations) {
    this.localizations = localizations;
    return this;
  }

  /**
   * The snippet object contains basic details about the channel section, such as its type, style
   * and title.
   * @return value or {@code null} for none
   */
  public ChannelSectionSnippet getSnippet() {
    return snippet;
  }

  /**
   * The snippet object contains basic details about the channel section, such as its type, style
   * and title.
   * @param snippet snippet or {@code null} for none
   */
  public ChannelSection setSnippet(ChannelSectionSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * The targeting object contains basic targeting settings about the channel section.
   * @return value or {@code null} for none
   */
  public ChannelSectionTargeting getTargeting() {
    return targeting;
  }

  /**
   * The targeting object contains basic targeting settings about the channel section.
   * @param targeting targeting or {@code null} for none
   */
  public ChannelSection setTargeting(ChannelSectionTargeting targeting) {
    this.targeting = targeting;
    return this;
  }

  @Override
  public ChannelSection set(String fieldName, Object value) {
    return (ChannelSection) super.set(fieldName, value);
  }

  @Override
  public ChannelSection clone() {
    return (ChannelSection) super.clone();
  }

}
