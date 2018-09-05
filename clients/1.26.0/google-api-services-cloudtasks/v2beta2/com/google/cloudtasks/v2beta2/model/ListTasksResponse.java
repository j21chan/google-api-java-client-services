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

package com.google.cloudtasks.v2beta2.model;

/**
 * Response message for listing tasks using ListTasks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTasksResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call ListTasks with this value as the page_token.
   *
   * If the next_page_token is empty, there are no more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Task> tasks;

  /**
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call ListTasks with this value as the page_token.
   *
   * If the next_page_token is empty, there are no more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call ListTasks with this value as the page_token.
   *
   * If the next_page_token is empty, there are no more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTasksResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of tasks.
   * @return value or {@code null} for none
   */
  public java.util.List<Task> getTasks() {
    return tasks;
  }

  /**
   * The list of tasks.
   * @param tasks tasks or {@code null} for none
   */
  public ListTasksResponse setTasks(java.util.List<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  @Override
  public ListTasksResponse set(String fieldName, Object value) {
    return (ListTasksResponse) super.set(fieldName, value);
  }

  @Override
  public ListTasksResponse clone() {
    return (ListTasksResponse) super.clone();
  }

}
