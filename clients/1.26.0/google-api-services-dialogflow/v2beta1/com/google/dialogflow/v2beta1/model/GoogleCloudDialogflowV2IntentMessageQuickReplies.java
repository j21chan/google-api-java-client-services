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
 * The quick replies response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageQuickReplies extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The collection of quick replies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> quickReplies;

  /**
   * Optional. The title of the collection of quick replies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. The collection of quick replies.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getQuickReplies() {
    return quickReplies;
  }

  /**
   * Optional. The collection of quick replies.
   * @param quickReplies quickReplies or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageQuickReplies setQuickReplies(java.util.List<java.lang.String> quickReplies) {
    this.quickReplies = quickReplies;
    return this;
  }

  /**
   * Optional. The title of the collection of quick replies.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional. The title of the collection of quick replies.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageQuickReplies setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageQuickReplies set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageQuickReplies) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageQuickReplies clone() {
    return (GoogleCloudDialogflowV2IntentMessageQuickReplies) super.clone();
  }

}
