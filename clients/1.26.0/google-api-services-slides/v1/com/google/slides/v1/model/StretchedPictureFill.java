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
 * The stretched picture fill. The page or page element is filled entirely with the specified
 * picture. The picture is stretched to fit its container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StretchedPictureFill extends com.google.api.client.json.GenericJson {

  /**
   * Reading the content_url:
   *
   * An URL to a picture with a default lifetime of 30 minutes. This URL is tagged with the account
   * of the requester. Anyone with the URL effectively accesses the picture as the original
   * requester. Access to the picture may be lost if the presentation's sharing settings change.
   *
   * Writing the content_url:
   *
   * The picture is fetched once at insertion time and a copy is stored for display inside the
   * presentation. Pictures must be less than 50MB in size, cannot exceed 25 megapixels, and must be
   * in one of PNG, JPEG, or GIF format.
   *
   * The provided URL can be at most 2 kB in length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentUrl;

  /**
   * The original size of the picture fill. This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size size;

  /**
   * Reading the content_url:
   *
   * An URL to a picture with a default lifetime of 30 minutes. This URL is tagged with the account
   * of the requester. Anyone with the URL effectively accesses the picture as the original
   * requester. Access to the picture may be lost if the presentation's sharing settings change.
   *
   * Writing the content_url:
   *
   * The picture is fetched once at insertion time and a copy is stored for display inside the
   * presentation. Pictures must be less than 50MB in size, cannot exceed 25 megapixels, and must be
   * in one of PNG, JPEG, or GIF format.
   *
   * The provided URL can be at most 2 kB in length.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentUrl() {
    return contentUrl;
  }

  /**
   * Reading the content_url:
   *
   * An URL to a picture with a default lifetime of 30 minutes. This URL is tagged with the account
   * of the requester. Anyone with the URL effectively accesses the picture as the original
   * requester. Access to the picture may be lost if the presentation's sharing settings change.
   *
   * Writing the content_url:
   *
   * The picture is fetched once at insertion time and a copy is stored for display inside the
   * presentation. Pictures must be less than 50MB in size, cannot exceed 25 megapixels, and must be
   * in one of PNG, JPEG, or GIF format.
   *
   * The provided URL can be at most 2 kB in length.
   * @param contentUrl contentUrl or {@code null} for none
   */
  public StretchedPictureFill setContentUrl(java.lang.String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * The original size of the picture fill. This field is read-only.
   * @return value or {@code null} for none
   */
  public Size getSize() {
    return size;
  }

  /**
   * The original size of the picture fill. This field is read-only.
   * @param size size or {@code null} for none
   */
  public StretchedPictureFill setSize(Size size) {
    this.size = size;
    return this;
  }

  @Override
  public StretchedPictureFill set(String fieldName, Object value) {
    return (StretchedPictureFill) super.set(fieldName, value);
  }

  @Override
  public StretchedPictureFill clone() {
    return (StretchedPictureFill) super.clone();
  }

}
