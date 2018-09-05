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

package com.google.compute.model;

/**
 * Model definition for RouterStatusResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterStatusResponse extends com.google.api.client.json.GenericJson {

  /**
   * Type of resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RouterStatus result;

  /**
   * Type of resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of resource.
   * @param kind kind or {@code null} for none
   */
  public RouterStatusResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public RouterStatus getResult() {
    return result;
  }

  /**
   * @param result result or {@code null} for none
   */
  public RouterStatusResponse setResult(RouterStatus result) {
    this.result = result;
    return this;
  }

  @Override
  public RouterStatusResponse set(String fieldName, Object value) {
    return (RouterStatusResponse) super.set(fieldName, value);
  }

  @Override
  public RouterStatusResponse clone() {
    return (RouterStatusResponse) super.clone();
  }

}
