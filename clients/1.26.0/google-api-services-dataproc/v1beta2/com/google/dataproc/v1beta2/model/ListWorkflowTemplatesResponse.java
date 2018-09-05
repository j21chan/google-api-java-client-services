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
 * A response to a request to list workflow templates in a project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListWorkflowTemplatesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. This token is included in the response if there are more results to fetch. To
   * fetch additional results, provide this value as the page_token in a subsequent
   * ListWorkflowTemplatesRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. WorkflowTemplates list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WorkflowTemplate> templates;

  /**
   * Output only. This token is included in the response if there are more results to fetch. To
   * fetch additional results, provide this value as the page_token in a subsequent
   * ListWorkflowTemplatesRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. This token is included in the response if there are more results to fetch. To
   * fetch additional results, provide this value as the page_token in a subsequent
   * ListWorkflowTemplatesRequest.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListWorkflowTemplatesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Output only. WorkflowTemplates list.
   * @return value or {@code null} for none
   */
  public java.util.List<WorkflowTemplate> getTemplates() {
    return templates;
  }

  /**
   * Output only. WorkflowTemplates list.
   * @param templates templates or {@code null} for none
   */
  public ListWorkflowTemplatesResponse setTemplates(java.util.List<WorkflowTemplate> templates) {
    this.templates = templates;
    return this;
  }

  @Override
  public ListWorkflowTemplatesResponse set(String fieldName, Object value) {
    return (ListWorkflowTemplatesResponse) super.set(fieldName, value);
  }

  @Override
  public ListWorkflowTemplatesResponse clone() {
    return (ListWorkflowTemplatesResponse) super.clone();
  }

}
