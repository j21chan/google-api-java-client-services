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

package com.google.monitoring.v3.model;

/**
 * The ListGroups response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListGroupsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The groups that match the specified filters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Group> group;

  /**
   * If there are more results than have been returned, then this field is set to a non-empty value.
   * To see the additional results, use that value as pageToken in the next call to this method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The groups that match the specified filters.
   * @return value or {@code null} for none
   */
  public java.util.List<Group> getGroup() {
    return group;
  }

  /**
   * The groups that match the specified filters.
   * @param group group or {@code null} for none
   */
  public ListGroupsResponse setGroup(java.util.List<Group> group) {
    this.group = group;
    return this;
  }

  /**
   * If there are more results than have been returned, then this field is set to a non-empty value.
   * To see the additional results, use that value as pageToken in the next call to this method.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there are more results than have been returned, then this field is set to a non-empty value.
   * To see the additional results, use that value as pageToken in the next call to this method.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListGroupsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListGroupsResponse set(String fieldName, Object value) {
    return (ListGroupsResponse) super.set(fieldName, value);
  }

  @Override
  public ListGroupsResponse clone() {
    return (ListGroupsResponse) super.clone();
  }

}
