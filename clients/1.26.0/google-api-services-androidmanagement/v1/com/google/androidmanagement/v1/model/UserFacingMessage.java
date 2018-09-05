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

package com.google.androidmanagement.v1.model;

/**
 * Provides a user-facing message with locale info. The maximum message length is 4096 characters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserFacingMessage extends com.google.api.client.json.GenericJson {

  /**
   * The default message displayed if no localized message is specified or the user's locale doesn't
   * match with any of the localized messages. A default message must be provided if any localized
   * messages are provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultMessage;

  /**
   * A map containing  pairs, where locale is a well-formed BCP 47 language
   * (https://www.w3.org/International/articles/language-tags/) code, such as en-US, es-ES, or fr.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> localizedMessages;

  /**
   * The default message displayed if no localized message is specified or the user's locale doesn't
   * match with any of the localized messages. A default message must be provided if any localized
   * messages are provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultMessage() {
    return defaultMessage;
  }

  /**
   * The default message displayed if no localized message is specified or the user's locale doesn't
   * match with any of the localized messages. A default message must be provided if any localized
   * messages are provided.
   * @param defaultMessage defaultMessage or {@code null} for none
   */
  public UserFacingMessage setDefaultMessage(java.lang.String defaultMessage) {
    this.defaultMessage = defaultMessage;
    return this;
  }

  /**
   * A map containing  pairs, where locale is a well-formed BCP 47 language
   * (https://www.w3.org/International/articles/language-tags/) code, such as en-US, es-ES, or fr.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLocalizedMessages() {
    return localizedMessages;
  }

  /**
   * A map containing  pairs, where locale is a well-formed BCP 47 language
   * (https://www.w3.org/International/articles/language-tags/) code, such as en-US, es-ES, or fr.
   * @param localizedMessages localizedMessages or {@code null} for none
   */
  public UserFacingMessage setLocalizedMessages(java.util.Map<String, java.lang.String> localizedMessages) {
    this.localizedMessages = localizedMessages;
    return this;
  }

  @Override
  public UserFacingMessage set(String fieldName, Object value) {
    return (UserFacingMessage) super.set(fieldName, value);
  }

  @Override
  public UserFacingMessage clone() {
    return (UserFacingMessage) super.clone();
  }

}
