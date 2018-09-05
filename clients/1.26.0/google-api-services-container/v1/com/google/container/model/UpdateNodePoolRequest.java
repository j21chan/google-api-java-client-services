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

package com.google.container.model;

/**
 * UpdateNodePoolRequests update a node pool's image and/or version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateNodePoolRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * The desired image type for the node pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageType;

  /**
   * The name (project, location, cluster, node pool) of the node pool to update. Specified in the
   * format 'projects/locations/clusters/nodePools'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodePoolId;

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes
   * master version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeVersion;

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public UpdateNodePoolRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The desired image type for the node pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageType() {
    return imageType;
  }

  /**
   * The desired image type for the node pool.
   * @param imageType imageType or {@code null} for none
   */
  public UpdateNodePoolRequest setImageType(java.lang.String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * The name (project, location, cluster, node pool) of the node pool to update. Specified in the
   * format 'projects/locations/clusters/nodePools'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster, node pool) of the node pool to update. Specified in the
   * format 'projects/locations/clusters/nodePools'.
   * @param name name or {@code null} for none
   */
  public UpdateNodePoolRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodePoolId() {
    return nodePoolId;
  }

  /**
   * Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced
   * by the name field.
   * @param nodePoolId nodePoolId or {@code null} for none
   */
  public UpdateNodePoolRequest setNodePoolId(java.lang.String nodePoolId) {
    this.nodePoolId = nodePoolId;
    return this;
  }

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes
   * master version
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeVersion() {
    return nodeVersion;
  }

  /**
   * The Kubernetes version to change the nodes to (typically an upgrade).
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the Kubernetes
   * master version
   * @param nodeVersion nodeVersion or {@code null} for none
   */
  public UpdateNodePoolRequest setNodeVersion(java.lang.String nodeVersion) {
    this.nodeVersion = nodeVersion;
    return this;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public UpdateNodePoolRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in
   * which the cluster resides. This field has been deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public UpdateNodePoolRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public UpdateNodePoolRequest set(String fieldName, Object value) {
    return (UpdateNodePoolRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateNodePoolRequest clone() {
    return (UpdateNodePoolRequest) super.clone();
  }

}
