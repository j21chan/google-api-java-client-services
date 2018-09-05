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
 * Response message for leasing tasks using LeaseTasks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LeaseTasksResponse extends com.google.api.client.json.GenericJson {

  /**
   * The leased tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Task> tasks;

  /**
   * The leased tasks.
   * @return value or {@code null} for none
   */
  public java.util.List<Task> getTasks() {
    return tasks;
  }

  /**
   * The leased tasks.
   * @param tasks tasks or {@code null} for none
   */
  public LeaseTasksResponse setTasks(java.util.List<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  @Override
  public LeaseTasksResponse set(String fieldName, Object value) {
    return (LeaseTasksResponse) super.set(fieldName, value);
  }

  @Override
  public LeaseTasksResponse clone() {
    return (LeaseTasksResponse) super.clone();
  }

}
