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

package com.google.dataflow.model;

/**
 * Response from a request to report the status of WorkItems.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportWorkItemStatusResponse extends com.google.api.client.json.GenericJson {

  /**
   * A set of messages indicating the service-side state for each WorkItem whose status was
   * reported, in the same order as the WorkItemStatus messages in the ReportWorkItemStatusRequest
   * which resulting in this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WorkItemServiceState> workItemServiceStates;

  static {
    // hack to force ProGuard to consider WorkItemServiceState used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WorkItemServiceState.class);
  }

  /**
   * A set of messages indicating the service-side state for each WorkItem whose status was
   * reported, in the same order as the WorkItemStatus messages in the ReportWorkItemStatusRequest
   * which resulting in this response.
   * @return value or {@code null} for none
   */
  public java.util.List<WorkItemServiceState> getWorkItemServiceStates() {
    return workItemServiceStates;
  }

  /**
   * A set of messages indicating the service-side state for each WorkItem whose status was
   * reported, in the same order as the WorkItemStatus messages in the ReportWorkItemStatusRequest
   * which resulting in this response.
   * @param workItemServiceStates workItemServiceStates or {@code null} for none
   */
  public ReportWorkItemStatusResponse setWorkItemServiceStates(java.util.List<WorkItemServiceState> workItemServiceStates) {
    this.workItemServiceStates = workItemServiceStates;
    return this;
  }

  @Override
  public ReportWorkItemStatusResponse set(String fieldName, Object value) {
    return (ReportWorkItemStatusResponse) super.set(fieldName, value);
  }

  @Override
  public ReportWorkItemStatusResponse clone() {
    return (ReportWorkItemStatusResponse) super.clone();
  }

}
