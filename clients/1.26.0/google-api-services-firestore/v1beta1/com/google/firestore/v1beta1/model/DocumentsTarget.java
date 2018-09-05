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

package com.google.firestore.v1beta1.model;

/**
 * A target specified by a set of documents names.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentsTarget extends com.google.api.client.json.GenericJson {

  /**
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will
   * fail if any of the document is not a child resource of the given `database`. Duplicate names
   * will be elided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> documents;

  /**
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will
   * fail if any of the document is not a child resource of the given `database`. Duplicate names
   * will be elided.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDocuments() {
    return documents;
  }

  /**
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will
   * fail if any of the document is not a child resource of the given `database`. Duplicate names
   * will be elided.
   * @param documents documents or {@code null} for none
   */
  public DocumentsTarget setDocuments(java.util.List<java.lang.String> documents) {
    this.documents = documents;
    return this;
  }

  @Override
  public DocumentsTarget set(String fieldName, Object value) {
    return (DocumentsTarget) super.set(fieldName, value);
  }

  @Override
  public DocumentsTarget clone() {
    return (DocumentsTarget) super.clone();
  }

}
