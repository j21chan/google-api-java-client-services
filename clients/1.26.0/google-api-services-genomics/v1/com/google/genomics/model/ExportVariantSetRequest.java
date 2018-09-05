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

package com.google.genomics.model;

/**
 * The variant data export request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportVariantSetRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The BigQuery dataset to export data to. This dataset must already exist. Note that
   * this is distinct from the Genomics concept of "dataset".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bigqueryDataset;

  /**
   * Required. The BigQuery table to export data to. If the table doesn't exist, it will be created.
   * If it already exists, it will be overwritten.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bigqueryTable;

  /**
   * If provided, only variant call information from the specified call sets will be exported. By
   * default all variant calls are exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> callSetIds;

  /**
   * The format for the exported data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Required. The Google Cloud project ID that owns the destination BigQuery dataset. The caller
   * must have WRITE access to this project.  This project will also own the resulting export job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. The BigQuery dataset to export data to. This dataset must already exist. Note that
   * this is distinct from the Genomics concept of "dataset".
   * @return value or {@code null} for none
   */
  public java.lang.String getBigqueryDataset() {
    return bigqueryDataset;
  }

  /**
   * Required. The BigQuery dataset to export data to. This dataset must already exist. Note that
   * this is distinct from the Genomics concept of "dataset".
   * @param bigqueryDataset bigqueryDataset or {@code null} for none
   */
  public ExportVariantSetRequest setBigqueryDataset(java.lang.String bigqueryDataset) {
    this.bigqueryDataset = bigqueryDataset;
    return this;
  }

  /**
   * Required. The BigQuery table to export data to. If the table doesn't exist, it will be created.
   * If it already exists, it will be overwritten.
   * @return value or {@code null} for none
   */
  public java.lang.String getBigqueryTable() {
    return bigqueryTable;
  }

  /**
   * Required. The BigQuery table to export data to. If the table doesn't exist, it will be created.
   * If it already exists, it will be overwritten.
   * @param bigqueryTable bigqueryTable or {@code null} for none
   */
  public ExportVariantSetRequest setBigqueryTable(java.lang.String bigqueryTable) {
    this.bigqueryTable = bigqueryTable;
    return this;
  }

  /**
   * If provided, only variant call information from the specified call sets will be exported. By
   * default all variant calls are exported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCallSetIds() {
    return callSetIds;
  }

  /**
   * If provided, only variant call information from the specified call sets will be exported. By
   * default all variant calls are exported.
   * @param callSetIds callSetIds or {@code null} for none
   */
  public ExportVariantSetRequest setCallSetIds(java.util.List<java.lang.String> callSetIds) {
    this.callSetIds = callSetIds;
    return this;
  }

  /**
   * The format for the exported data.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The format for the exported data.
   * @param format format or {@code null} for none
   */
  public ExportVariantSetRequest setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Required. The Google Cloud project ID that owns the destination BigQuery dataset. The caller
   * must have WRITE access to this project.  This project will also own the resulting export job.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. The Google Cloud project ID that owns the destination BigQuery dataset. The caller
   * must have WRITE access to this project.  This project will also own the resulting export job.
   * @param projectId projectId or {@code null} for none
   */
  public ExportVariantSetRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public ExportVariantSetRequest set(String fieldName, Object value) {
    return (ExportVariantSetRequest) super.set(fieldName, value);
  }

  @Override
  public ExportVariantSetRequest clone() {
    return (ExportVariantSetRequest) super.clone();
  }

}
