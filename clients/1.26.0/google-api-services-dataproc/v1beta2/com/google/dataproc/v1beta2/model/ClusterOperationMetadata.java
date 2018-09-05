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
 * Metadata describing the operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Name of the cluster for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterName;

  /**
   * Output only. Cluster UUID for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterUuid;

  /**
   * Output only. Short description of operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Labels associated with the operation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The operation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * Output only. Current operation status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterOperationStatus status;

  /**
   * Output only. The previous operation status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ClusterOperationStatus> statusHistory;

  /**
   * Output only. Errors encountered during operation execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> warnings;

  /**
   * Output only. Name of the cluster for the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterName() {
    return clusterName;
  }

  /**
   * Output only. Name of the cluster for the operation.
   * @param clusterName clusterName or {@code null} for none
   */
  public ClusterOperationMetadata setClusterName(java.lang.String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Output only. Cluster UUID for the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterUuid() {
    return clusterUuid;
  }

  /**
   * Output only. Cluster UUID for the operation.
   * @param clusterUuid clusterUuid or {@code null} for none
   */
  public ClusterOperationMetadata setClusterUuid(java.lang.String clusterUuid) {
    this.clusterUuid = clusterUuid;
    return this;
  }

  /**
   * Output only. Short description of operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. Short description of operation.
   * @param description description or {@code null} for none
   */
  public ClusterOperationMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Labels associated with the operation
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Output only. Labels associated with the operation
   * @param labels labels or {@code null} for none
   */
  public ClusterOperationMetadata setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The operation type.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * Output only. The operation type.
   * @param operationType operationType or {@code null} for none
   */
  public ClusterOperationMetadata setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Output only. Current operation status.
   * @return value or {@code null} for none
   */
  public ClusterOperationStatus getStatus() {
    return status;
  }

  /**
   * Output only. Current operation status.
   * @param status status or {@code null} for none
   */
  public ClusterOperationMetadata setStatus(ClusterOperationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. The previous operation status.
   * @return value or {@code null} for none
   */
  public java.util.List<ClusterOperationStatus> getStatusHistory() {
    return statusHistory;
  }

  /**
   * Output only. The previous operation status.
   * @param statusHistory statusHistory or {@code null} for none
   */
  public ClusterOperationMetadata setStatusHistory(java.util.List<ClusterOperationStatus> statusHistory) {
    this.statusHistory = statusHistory;
    return this;
  }

  /**
   * Output only. Errors encountered during operation execution.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWarnings() {
    return warnings;
  }

  /**
   * Output only. Errors encountered during operation execution.
   * @param warnings warnings or {@code null} for none
   */
  public ClusterOperationMetadata setWarnings(java.util.List<java.lang.String> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public ClusterOperationMetadata set(String fieldName, Object value) {
    return (ClusterOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public ClusterOperationMetadata clone() {
    return (ClusterOperationMetadata) super.clone();
  }

}
