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

package com.google.dialogflow.v2beta1.model;

/**
 * An item in the carousel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The body text of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. The image to display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageImage image;

  /**
   * Required. Additional info about the option item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo info;

  /**
   * Required. Title of the carousel item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. The body text of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The body text of the card.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. The image to display.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageImage getImage() {
    return image;
  }

  /**
   * Optional. The image to display.
   * @param image image or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem setImage(GoogleCloudDialogflowV2beta1IntentMessageImage image) {
    this.image = image;
    return this;
  }

  /**
   * Required. Additional info about the option item.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo getInfo() {
    return info;
  }

  /**
   * Required. Additional info about the option item.
   * @param info info or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem setInfo(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Required. Title of the carousel item.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. Title of the carousel item.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem clone() {
    return (GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem) super.clone();
  }

}
