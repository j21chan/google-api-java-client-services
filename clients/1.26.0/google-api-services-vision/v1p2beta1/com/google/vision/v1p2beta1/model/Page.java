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

package com.google.vision.v1p2beta1.model;

/**
 * Detected page from OCR.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Page extends com.google.api.client.json.GenericJson {

  /**
   * List of blocks of text, images etc on this page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Block> blocks;

  static {
    // hack to force ProGuard to consider Block used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Block.class);
  }

  /**
   * Confidence of the OCR results on the page. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Page height. For PDFs the unit is points. For images (including TIFFs) the unit is pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * Additional information detected on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextProperty property;

  /**
   * Page width. For PDFs the unit is points. For images (including TIFFs) the unit is pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * List of blocks of text, images etc on this page.
   * @return value or {@code null} for none
   */
  public java.util.List<Block> getBlocks() {
    return blocks;
  }

  /**
   * List of blocks of text, images etc on this page.
   * @param blocks blocks or {@code null} for none
   */
  public Page setBlocks(java.util.List<Block> blocks) {
    this.blocks = blocks;
    return this;
  }

  /**
   * Confidence of the OCR results on the page. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence of the OCR results on the page. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public Page setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Page height. For PDFs the unit is points. For images (including TIFFs) the unit is pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Page height. For PDFs the unit is points. For images (including TIFFs) the unit is pixels.
   * @param height height or {@code null} for none
   */
  public Page setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Additional information detected on the page.
   * @return value or {@code null} for none
   */
  public TextProperty getProperty() {
    return property;
  }

  /**
   * Additional information detected on the page.
   * @param property property or {@code null} for none
   */
  public Page setProperty(TextProperty property) {
    this.property = property;
    return this;
  }

  /**
   * Page width. For PDFs the unit is points. For images (including TIFFs) the unit is pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Page width. For PDFs the unit is points. For images (including TIFFs) the unit is pixels.
   * @param width width or {@code null} for none
   */
  public Page setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Page set(String fieldName, Object value) {
    return (Page) super.set(fieldName, value);
  }

  @Override
  public Page clone() {
    return (Page) super.clone();
  }

}
