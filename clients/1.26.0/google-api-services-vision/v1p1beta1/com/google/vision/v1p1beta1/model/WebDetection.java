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

package com.google.vision.v1p1beta1.model;

/**
 * Relevant information for the image from the Internet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WebDetection extends com.google.api.client.json.GenericJson {

  /**
   * The service's best guess as to the topic of the request image. Inferred from similar images on
   * the open web.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebLabel> bestGuessLabels;

  /**
   * Fully matching images from the Internet. Can include resized copies of the query image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebImage> fullMatchingImages;

  /**
   * Web pages containing the matching images from the Internet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebPage> pagesWithMatchingImages;

  /**
   * Partial matching images from the Internet. Those images are similar enough to share some key-
   * point features. For example an original image will likely have partial matching for its crops.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebImage> partialMatchingImages;

  /**
   * The visually similar image results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebImage> visuallySimilarImages;

  /**
   * Deduced entities from similar images on the Internet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebEntity> webEntities;

  /**
   * The service's best guess as to the topic of the request image. Inferred from similar images on
   * the open web.
   * @return value or {@code null} for none
   */
  public java.util.List<WebLabel> getBestGuessLabels() {
    return bestGuessLabels;
  }

  /**
   * The service's best guess as to the topic of the request image. Inferred from similar images on
   * the open web.
   * @param bestGuessLabels bestGuessLabels or {@code null} for none
   */
  public WebDetection setBestGuessLabels(java.util.List<WebLabel> bestGuessLabels) {
    this.bestGuessLabels = bestGuessLabels;
    return this;
  }

  /**
   * Fully matching images from the Internet. Can include resized copies of the query image.
   * @return value or {@code null} for none
   */
  public java.util.List<WebImage> getFullMatchingImages() {
    return fullMatchingImages;
  }

  /**
   * Fully matching images from the Internet. Can include resized copies of the query image.
   * @param fullMatchingImages fullMatchingImages or {@code null} for none
   */
  public WebDetection setFullMatchingImages(java.util.List<WebImage> fullMatchingImages) {
    this.fullMatchingImages = fullMatchingImages;
    return this;
  }

  /**
   * Web pages containing the matching images from the Internet.
   * @return value or {@code null} for none
   */
  public java.util.List<WebPage> getPagesWithMatchingImages() {
    return pagesWithMatchingImages;
  }

  /**
   * Web pages containing the matching images from the Internet.
   * @param pagesWithMatchingImages pagesWithMatchingImages or {@code null} for none
   */
  public WebDetection setPagesWithMatchingImages(java.util.List<WebPage> pagesWithMatchingImages) {
    this.pagesWithMatchingImages = pagesWithMatchingImages;
    return this;
  }

  /**
   * Partial matching images from the Internet. Those images are similar enough to share some key-
   * point features. For example an original image will likely have partial matching for its crops.
   * @return value or {@code null} for none
   */
  public java.util.List<WebImage> getPartialMatchingImages() {
    return partialMatchingImages;
  }

  /**
   * Partial matching images from the Internet. Those images are similar enough to share some key-
   * point features. For example an original image will likely have partial matching for its crops.
   * @param partialMatchingImages partialMatchingImages or {@code null} for none
   */
  public WebDetection setPartialMatchingImages(java.util.List<WebImage> partialMatchingImages) {
    this.partialMatchingImages = partialMatchingImages;
    return this;
  }

  /**
   * The visually similar image results.
   * @return value or {@code null} for none
   */
  public java.util.List<WebImage> getVisuallySimilarImages() {
    return visuallySimilarImages;
  }

  /**
   * The visually similar image results.
   * @param visuallySimilarImages visuallySimilarImages or {@code null} for none
   */
  public WebDetection setVisuallySimilarImages(java.util.List<WebImage> visuallySimilarImages) {
    this.visuallySimilarImages = visuallySimilarImages;
    return this;
  }

  /**
   * Deduced entities from similar images on the Internet.
   * @return value or {@code null} for none
   */
  public java.util.List<WebEntity> getWebEntities() {
    return webEntities;
  }

  /**
   * Deduced entities from similar images on the Internet.
   * @param webEntities webEntities or {@code null} for none
   */
  public WebDetection setWebEntities(java.util.List<WebEntity> webEntities) {
    this.webEntities = webEntities;
    return this;
  }

  @Override
  public WebDetection set(String fieldName, Object value) {
    return (WebDetection) super.set(fieldName, value);
  }

  @Override
  public WebDetection clone() {
    return (WebDetection) super.clone();
  }

}
