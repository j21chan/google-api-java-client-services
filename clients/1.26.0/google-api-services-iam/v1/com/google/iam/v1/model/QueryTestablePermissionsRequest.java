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
 * A request to get permissions which can be tested on a resource.
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
public final class QueryTestablePermissionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The full resource name to query from the list of testable permissions.
   *
   * The name follows the Google Cloud Platform resource format. For example, a Cloud Platform
   * project with id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-
   * project`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullResourceName;

  /**
   * Optional limit on the number of permissions to include in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional pagination token returned in an earlier QueryTestablePermissionsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Required. The full resource name to query from the list of testable permissions.
   *
   * The name follows the Google Cloud Platform resource format. For example, a Cloud Platform
   * project with id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-
   * project`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullResourceName() {
    return fullResourceName;
  }

  /**
   * Required. The full resource name to query from the list of testable permissions.
   *
   * The name follows the Google Cloud Platform resource format. For example, a Cloud Platform
   * project with id `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-
   * project`.
   * @param fullResourceName fullResourceName or {@code null} for none
   */
  public QueryTestablePermissionsRequest setFullResourceName(java.lang.String fullResourceName) {
    this.fullResourceName = fullResourceName;
    return this;
  }

  /**
   * Optional limit on the number of permissions to include in the response.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Optional limit on the number of permissions to include in the response.
   * @param pageSize pageSize or {@code null} for none
   */
  public QueryTestablePermissionsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional pagination token returned in an earlier QueryTestablePermissionsRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional pagination token returned in an earlier QueryTestablePermissionsRequest.
   * @param pageToken pageToken or {@code null} for none
   */
  public QueryTestablePermissionsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  @Override
  public QueryTestablePermissionsRequest set(String fieldName, Object value) {
    return (QueryTestablePermissionsRequest) super.set(fieldName, value);
  }

  @Override
  public QueryTestablePermissionsRequest clone() {
    return (QueryTestablePermissionsRequest) super.clone();
  }

}
