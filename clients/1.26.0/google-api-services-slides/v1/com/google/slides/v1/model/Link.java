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

package com.google.slides.v1.model;

/**
 * A hypertext link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Link extends com.google.api.client.json.GenericJson {

  /**
   * If set, indicates this is a link to the specific page in this presentation with this ID. A page
   * with this ID may not exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageObjectId;

  /**
   * If set, indicates this is a link to a slide in this presentation, addressed by its position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relativeLink;

  /**
   * If set, indicates this is a link to the slide at this zero-based index in the presentation.
   * There may not be a slide at this index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer slideIndex;

  /**
   * If set, indicates this is a link to the external web page at this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * If set, indicates this is a link to the specific page in this presentation with this ID. A page
   * with this ID may not exist.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageObjectId() {
    return pageObjectId;
  }

  /**
   * If set, indicates this is a link to the specific page in this presentation with this ID. A page
   * with this ID may not exist.
   * @param pageObjectId pageObjectId or {@code null} for none
   */
  public Link setPageObjectId(java.lang.String pageObjectId) {
    this.pageObjectId = pageObjectId;
    return this;
  }

  /**
   * If set, indicates this is a link to a slide in this presentation, addressed by its position.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelativeLink() {
    return relativeLink;
  }

  /**
   * If set, indicates this is a link to a slide in this presentation, addressed by its position.
   * @param relativeLink relativeLink or {@code null} for none
   */
  public Link setRelativeLink(java.lang.String relativeLink) {
    this.relativeLink = relativeLink;
    return this;
  }

  /**
   * If set, indicates this is a link to the slide at this zero-based index in the presentation.
   * There may not be a slide at this index.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSlideIndex() {
    return slideIndex;
  }

  /**
   * If set, indicates this is a link to the slide at this zero-based index in the presentation.
   * There may not be a slide at this index.
   * @param slideIndex slideIndex or {@code null} for none
   */
  public Link setSlideIndex(java.lang.Integer slideIndex) {
    this.slideIndex = slideIndex;
    return this;
  }

  /**
   * If set, indicates this is a link to the external web page at this URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * If set, indicates this is a link to the external web page at this URL.
   * @param url url or {@code null} for none
   */
  public Link setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public Link set(String fieldName, Object value) {
    return (Link) super.set(fieldName, value);
  }

  @Override
  public Link clone() {
    return (Link) super.clone();
  }

}
