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

package com.google.serviceusage.v1beta1.model;

/**
 * Method represents a method of an API interface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Method extends com.google.api.client.json.GenericJson {

  /**
   * The simple name of this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Any metadata attached to the method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Option> options;

  static {
    // hack to force ProGuard to consider Option used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Option.class);
  }

  /**
   * If true, the request is streamed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requestStreaming;

  /**
   * A URL of the input message type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestTypeUrl;

  /**
   * If true, the response is streamed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean responseStreaming;

  /**
   * The URL of the output message type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseTypeUrl;

  /**
   * The source syntax of this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syntax;

  /**
   * The simple name of this method.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The simple name of this method.
   * @param name name or {@code null} for none
   */
  public Method setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Any metadata attached to the method.
   * @return value or {@code null} for none
   */
  public java.util.List<Option> getOptions() {
    return options;
  }

  /**
   * Any metadata attached to the method.
   * @param options options or {@code null} for none
   */
  public Method setOptions(java.util.List<Option> options) {
    this.options = options;
    return this;
  }

  /**
   * If true, the request is streamed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequestStreaming() {
    return requestStreaming;
  }

  /**
   * If true, the request is streamed.
   * @param requestStreaming requestStreaming or {@code null} for none
   */
  public Method setRequestStreaming(java.lang.Boolean requestStreaming) {
    this.requestStreaming = requestStreaming;
    return this;
  }

  /**
   * A URL of the input message type.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestTypeUrl() {
    return requestTypeUrl;
  }

  /**
   * A URL of the input message type.
   * @param requestTypeUrl requestTypeUrl or {@code null} for none
   */
  public Method setRequestTypeUrl(java.lang.String requestTypeUrl) {
    this.requestTypeUrl = requestTypeUrl;
    return this;
  }

  /**
   * If true, the response is streamed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getResponseStreaming() {
    return responseStreaming;
  }

  /**
   * If true, the response is streamed.
   * @param responseStreaming responseStreaming or {@code null} for none
   */
  public Method setResponseStreaming(java.lang.Boolean responseStreaming) {
    this.responseStreaming = responseStreaming;
    return this;
  }

  /**
   * The URL of the output message type.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseTypeUrl() {
    return responseTypeUrl;
  }

  /**
   * The URL of the output message type.
   * @param responseTypeUrl responseTypeUrl or {@code null} for none
   */
  public Method setResponseTypeUrl(java.lang.String responseTypeUrl) {
    this.responseTypeUrl = responseTypeUrl;
    return this;
  }

  /**
   * The source syntax of this method.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyntax() {
    return syntax;
  }

  /**
   * The source syntax of this method.
   * @param syntax syntax or {@code null} for none
   */
  public Method setSyntax(java.lang.String syntax) {
    this.syntax = syntax;
    return this;
  }

  @Override
  public Method set(String fieldName, Object value) {
    return (Method) super.set(fieldName, value);
  }

  @Override
  public Method clone() {
    return (Method) super.clone();
  }

}
