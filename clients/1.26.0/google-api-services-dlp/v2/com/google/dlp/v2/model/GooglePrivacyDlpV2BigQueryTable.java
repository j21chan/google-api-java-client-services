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

package com.google.dlp.v2.model;

/**
 * Message defining the location of a BigQuery table. A table is uniquely identified  by its
 * project_id, dataset_id, and table_name. Within a query a table is often referenced with a string
 * in the format of: `:.` or `..`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2BigQueryTable extends com.google.api.client.json.GenericJson {

  /**
   * Dataset ID of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetId;

  /**
   * The Google Cloud Platform project ID of the project containing the table. If omitted, project
   * ID is inferred from the API call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Name of the table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableId;

  /**
   * Dataset ID of the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetId() {
    return datasetId;
  }

  /**
   * Dataset ID of the table.
   * @param datasetId datasetId or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable setDatasetId(java.lang.String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * The Google Cloud Platform project ID of the project containing the table. If omitted, project
   * ID is inferred from the API call.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The Google Cloud Platform project ID of the project containing the table. If omitted, project
   * ID is inferred from the API call.
   * @param projectId projectId or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Name of the table.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableId() {
    return tableId;
  }

  /**
   * Name of the table.
   * @param tableId tableId or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable setTableId(java.lang.String tableId) {
    this.tableId = tableId;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2BigQueryTable set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2BigQueryTable) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2BigQueryTable clone() {
    return (GooglePrivacyDlpV2BigQueryTable) super.clone();
  }

}
