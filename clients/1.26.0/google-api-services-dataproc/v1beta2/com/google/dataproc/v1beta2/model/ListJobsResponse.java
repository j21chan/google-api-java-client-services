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

package com.google.dataproc.v1beta2.model;

/**
 * A list of jobs in a project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListJobsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Jobs list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Job> jobs;

  /**
   * Optional. This token is included in the response if there are more results to fetch. To fetch
   * additional results, provide this value as the page_token in a subsequent ListJobsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. Jobs list.
   * @return value or {@code null} for none
   */
  public java.util.List<Job> getJobs() {
    return jobs;
  }

  /**
   * Output only. Jobs list.
   * @param jobs jobs or {@code null} for none
   */
  public ListJobsResponse setJobs(java.util.List<Job> jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * Optional. This token is included in the response if there are more results to fetch. To fetch
   * additional results, provide this value as the page_token in a subsequent ListJobsRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Optional. This token is included in the response if there are more results to fetch. To fetch
   * additional results, provide this value as the page_token in a subsequent ListJobsRequest.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListJobsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListJobsResponse set(String fieldName, Object value) {
    return (ListJobsResponse) super.set(fieldName, value);
  }

  @Override
  public ListJobsResponse clone() {
    return (ListJobsResponse) super.clone();
  }

}
