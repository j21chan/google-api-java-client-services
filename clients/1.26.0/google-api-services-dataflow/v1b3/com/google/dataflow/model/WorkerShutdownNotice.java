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
 * Shutdown notification from workers. This is to be sent by the shutdown script of the worker VM so
 * that the backend knows that the VM is being shut down.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkerShutdownNotice extends com.google.api.client.json.GenericJson {

  /**
   * The reason for the worker shutdown. Current possible values are:   "UNKNOWN": shutdown reason
   * is unknown.   "PREEMPTION": shutdown reason is preemption. Other possible reasons may be added
   * in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The reason for the worker shutdown. Current possible values are:   "UNKNOWN": shutdown reason
   * is unknown.   "PREEMPTION": shutdown reason is preemption. Other possible reasons may be added
   * in the future.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason for the worker shutdown. Current possible values are:   "UNKNOWN": shutdown reason
   * is unknown.   "PREEMPTION": shutdown reason is preemption. Other possible reasons may be added
   * in the future.
   * @param reason reason or {@code null} for none
   */
  public WorkerShutdownNotice setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public WorkerShutdownNotice set(String fieldName, Object value) {
    return (WorkerShutdownNotice) super.set(fieldName, value);
  }

  @Override
  public WorkerShutdownNotice clone() {
    return (WorkerShutdownNotice) super.clone();
  }

}
