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

package com.google.analytics.model;

/**
 * JSON template for an AdWords account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdWordsAccount extends com.google.api.client.json.GenericJson {

  /**
   * True if auto-tagging is enabled on the AdWords account. Read-only after the insert operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoTaggingEnabled;

  /**
   * Customer ID. This field is required when creating an AdWords link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * Resource type for AdWords account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * True if auto-tagging is enabled on the AdWords account. Read-only after the insert operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }

  /**
   * True if auto-tagging is enabled on the AdWords account. Read-only after the insert operation.
   * @param autoTaggingEnabled autoTaggingEnabled or {@code null} for none
   */
  public AdWordsAccount setAutoTaggingEnabled(java.lang.Boolean autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
    return this;
  }

  /**
   * Customer ID. This field is required when creating an AdWords link.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * Customer ID. This field is required when creating an AdWords link.
   * @param customerId customerId or {@code null} for none
   */
  public AdWordsAccount setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Resource type for AdWords account.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for AdWords account.
   * @param kind kind or {@code null} for none
   */
  public AdWordsAccount setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public AdWordsAccount set(String fieldName, Object value) {
    return (AdWordsAccount) super.set(fieldName, value);
  }

  @Override
  public AdWordsAccount clone() {
    return (AdWordsAccount) super.clone();
  }

}
