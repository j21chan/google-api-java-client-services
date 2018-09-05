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

package com.google.testing.model;

/**
 * Directs Robo to interact with a specific UI element if it is encountered during the crawl.
 * Currently, Robo can perform text entry or element click.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoboDirective extends com.google.api.client.json.GenericJson {

  /**
   * The type of action that Robo should perform on the specified element. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionType;

  /**
   * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK
   * on the element matching the resource_name. Optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputText;

  /**
   * The android resource name of the target UI element For example,    in Java: R.string.foo    in
   * xml: @string/foo Only the “foo” part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * The type of action that Robo should perform on the specified element. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionType() {
    return actionType;
  }

  /**
   * The type of action that Robo should perform on the specified element. Required.
   * @param actionType actionType or {@code null} for none
   */
  public RoboDirective setActionType(java.lang.String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK
   * on the element matching the resource_name. Optional
   * @return value or {@code null} for none
   */
  public java.lang.String getInputText() {
    return inputText;
  }

  /**
   * The text that Robo is directed to set. If left empty, the directive will be treated as a CLICK
   * on the element matching the resource_name. Optional
   * @param inputText inputText or {@code null} for none
   */
  public RoboDirective setInputText(java.lang.String inputText) {
    this.inputText = inputText;
    return this;
  }

  /**
   * The android resource name of the target UI element For example,    in Java: R.string.foo    in
   * xml: @string/foo Only the “foo” part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html Required
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * The android resource name of the target UI element For example,    in Java: R.string.foo    in
   * xml: @string/foo Only the “foo” part is needed. Reference doc:
   * https://developer.android.com/guide/topics/resources/accessing-resources.html Required
   * @param resourceName resourceName or {@code null} for none
   */
  public RoboDirective setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  @Override
  public RoboDirective set(String fieldName, Object value) {
    return (RoboDirective) super.set(fieldName, value);
  }

  @Override
  public RoboDirective clone() {
    return (RoboDirective) super.clone();
  }

}
