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

package com.google.dataproc.model;

/**
 * A request to submit a job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubmitJobRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The job resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Job job;

  /**
   * Optional. A unique id used to identify the request. If the server receives two SubmitJobRequest
   * requests with the same id, then the second request will be ignored and the first Job created
   * and stored in the backend is returned.It is recommended to always set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Required. The job resource.
   * @return value or {@code null} for none
   */
  public Job getJob() {
    return job;
  }

  /**
   * Required. The job resource.
   * @param job job or {@code null} for none
   */
  public SubmitJobRequest setJob(Job job) {
    this.job = job;
    return this;
  }

  /**
   * Optional. A unique id used to identify the request. If the server receives two SubmitJobRequest
   * requests with the same id, then the second request will be ignored and the first Job created
   * and stored in the backend is returned.It is recommended to always set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Optional. A unique id used to identify the request. If the server receives two SubmitJobRequest
   * requests with the same id, then the second request will be ignored and the first Job created
   * and stored in the backend is returned.It is recommended to always set this value to a UUID
   * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters
   * (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
   * characters.
   * @param requestId requestId or {@code null} for none
   */
  public SubmitJobRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public SubmitJobRequest set(String fieldName, Object value) {
    return (SubmitJobRequest) super.set(fieldName, value);
  }

  @Override
  public SubmitJobRequest clone() {
    return (SubmitJobRequest) super.clone();
  }

}
