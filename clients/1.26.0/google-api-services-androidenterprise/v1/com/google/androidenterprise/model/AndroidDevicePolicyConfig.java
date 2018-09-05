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

package com.google.androidenterprise.model;

/**
 * Deprecated and unused.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidDevicePolicyConfig extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#androidDevicePolicyConfig".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Deprecated and unused.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#androidDevicePolicyConfig".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#androidDevicePolicyConfig".
   * @param kind kind or {@code null} for none
   */
  public AndroidDevicePolicyConfig setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Deprecated and unused.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Deprecated and unused.
   * @param state state or {@code null} for none
   */
  public AndroidDevicePolicyConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public AndroidDevicePolicyConfig set(String fieldName, Object value) {
    return (AndroidDevicePolicyConfig) super.set(fieldName, value);
  }

  @Override
  public AndroidDevicePolicyConfig clone() {
    return (AndroidDevicePolicyConfig) super.clone();
  }

}
