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
 * A request for sending worker messages to the service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SendWorkerMessagesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The location which contains the job
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The WorkerMessages to send.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WorkerMessage> workerMessages;

  static {
    // hack to force ProGuard to consider WorkerMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WorkerMessage.class);
  }

  /**
   * The location which contains the job
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The location which contains the job
   * @param location location or {@code null} for none
   */
  public SendWorkerMessagesRequest setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The WorkerMessages to send.
   * @return value or {@code null} for none
   */
  public java.util.List<WorkerMessage> getWorkerMessages() {
    return workerMessages;
  }

  /**
   * The WorkerMessages to send.
   * @param workerMessages workerMessages or {@code null} for none
   */
  public SendWorkerMessagesRequest setWorkerMessages(java.util.List<WorkerMessage> workerMessages) {
    this.workerMessages = workerMessages;
    return this;
  }

  @Override
  public SendWorkerMessagesRequest set(String fieldName, Object value) {
    return (SendWorkerMessagesRequest) super.set(fieldName, value);
  }

  @Override
  public SendWorkerMessagesRequest clone() {
    return (SendWorkerMessagesRequest) super.clone();
  }

}
