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

package com.google.iam.v1.model;

/**
 * The response containing the roles defined under a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListRolesResponse extends com.google.api.client.json.GenericJson {

  /**
   * To retrieve the next page of results, set `ListRolesRequest.page_token` to this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The Roles defined on this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Role> roles;

  static {
    // hack to force ProGuard to consider Role used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Role.class);
  }

  /**
   * To retrieve the next page of results, set `ListRolesRequest.page_token` to this value.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * To retrieve the next page of results, set `ListRolesRequest.page_token` to this value.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListRolesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The Roles defined on this resource.
   * @return value or {@code null} for none
   */
  public java.util.List<Role> getRoles() {
    return roles;
  }

  /**
   * The Roles defined on this resource.
   * @param roles roles or {@code null} for none
   */
  public ListRolesResponse setRoles(java.util.List<Role> roles) {
    this.roles = roles;
    return this;
  }

  @Override
  public ListRolesResponse set(String fieldName, Object value) {
    return (ListRolesResponse) super.set(fieldName, value);
  }

  @Override
  public ListRolesResponse clone() {
    return (ListRolesResponse) super.clone();
  }

}
