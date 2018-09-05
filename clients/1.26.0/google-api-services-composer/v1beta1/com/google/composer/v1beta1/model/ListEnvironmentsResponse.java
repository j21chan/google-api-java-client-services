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

package com.google.composer.v1beta1.model;

/**
 * The environments in a project and location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListEnvironmentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of environments returned by a ListEnvironmentsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Environment> environments;

  static {
    // hack to force ProGuard to consider Environment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Environment.class);
  }

  /**
   * The page token used to query for the next page if one exists.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of environments returned by a ListEnvironmentsRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<Environment> getEnvironments() {
    return environments;
  }

  /**
   * The list of environments returned by a ListEnvironmentsRequest.
   * @param environments environments or {@code null} for none
   */
  public ListEnvironmentsResponse setEnvironments(java.util.List<Environment> environments) {
    this.environments = environments;
    return this;
  }

  /**
   * The page token used to query for the next page if one exists.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token used to query for the next page if one exists.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListEnvironmentsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListEnvironmentsResponse set(String fieldName, Object value) {
    return (ListEnvironmentsResponse) super.set(fieldName, value);
  }

  @Override
  public ListEnvironmentsResponse clone() {
    return (ListEnvironmentsResponse) super.clone();
  }

}
