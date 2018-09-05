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
 * The cluster config.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A Cloud Storage staging bucket used for sharing generated SSH keys and config. If you
   * do not specify a staging bucket, Cloud Dataproc will determine an appropriate Cloud Storage
   * location (US, ASIA, or EU) for your cluster's staging bucket according to the Google Compute
   * Engine zone where your cluster is deployed, and then it will create and manage this project-
   * level, per-location bucket for you.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configBucket;

  /**
   * Optional. Encryption settings for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionConfig encryptionConfig;

  /**
   * Required. The shared Compute Engine config settings for all instances in a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GceClusterConfig gceClusterConfig;

  /**
   * Optional. Commands to execute on each node after config is completed. By default, executables
   * are run on master and all worker nodes. You can test a node's role metadata to run an
   * executable on a master or worker node, as shown below using curl (you can also use wget):
   * ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes
   * /dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then   ... master specific actions ... else
   * ... worker specific actions ... fi
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NodeInitializationAction> initializationActions;

  /**
   * Optional. The Compute Engine config settings for the master instance in a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupConfig masterConfig;

  /**
   * Optional. The Compute Engine config settings for additional worker instances in a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupConfig secondaryWorkerConfig;

  /**
   * Optional. The config settings for software inside the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SoftwareConfig softwareConfig;

  /**
   * Optional. The Compute Engine config settings for worker instances in a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupConfig workerConfig;

  /**
   * Optional. A Cloud Storage staging bucket used for sharing generated SSH keys and config. If you
   * do not specify a staging bucket, Cloud Dataproc will determine an appropriate Cloud Storage
   * location (US, ASIA, or EU) for your cluster's staging bucket according to the Google Compute
   * Engine zone where your cluster is deployed, and then it will create and manage this project-
   * level, per-location bucket for you.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigBucket() {
    return configBucket;
  }

  /**
   * Optional. A Cloud Storage staging bucket used for sharing generated SSH keys and config. If you
   * do not specify a staging bucket, Cloud Dataproc will determine an appropriate Cloud Storage
   * location (US, ASIA, or EU) for your cluster's staging bucket according to the Google Compute
   * Engine zone where your cluster is deployed, and then it will create and manage this project-
   * level, per-location bucket for you.
   * @param configBucket configBucket or {@code null} for none
   */
  public ClusterConfig setConfigBucket(java.lang.String configBucket) {
    this.configBucket = configBucket;
    return this;
  }

  /**
   * Optional. Encryption settings for the cluster.
   * @return value or {@code null} for none
   */
  public EncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  /**
   * Optional. Encryption settings for the cluster.
   * @param encryptionConfig encryptionConfig or {@code null} for none
   */
  public ClusterConfig setEncryptionConfig(EncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

  /**
   * Required. The shared Compute Engine config settings for all instances in a cluster.
   * @return value or {@code null} for none
   */
  public GceClusterConfig getGceClusterConfig() {
    return gceClusterConfig;
  }

  /**
   * Required. The shared Compute Engine config settings for all instances in a cluster.
   * @param gceClusterConfig gceClusterConfig or {@code null} for none
   */
  public ClusterConfig setGceClusterConfig(GceClusterConfig gceClusterConfig) {
    this.gceClusterConfig = gceClusterConfig;
    return this;
  }

  /**
   * Optional. Commands to execute on each node after config is completed. By default, executables
   * are run on master and all worker nodes. You can test a node's role metadata to run an
   * executable on a master or worker node, as shown below using curl (you can also use wget):
   * ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes
   * /dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then   ... master specific actions ... else
   * ... worker specific actions ... fi
   * @return value or {@code null} for none
   */
  public java.util.List<NodeInitializationAction> getInitializationActions() {
    return initializationActions;
  }

  /**
   * Optional. Commands to execute on each node after config is completed. By default, executables
   * are run on master and all worker nodes. You can test a node's role metadata to run an
   * executable on a master or worker node, as shown below using curl (you can also use wget):
   * ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes
   * /dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then   ... master specific actions ... else
   * ... worker specific actions ... fi
   * @param initializationActions initializationActions or {@code null} for none
   */
  public ClusterConfig setInitializationActions(java.util.List<NodeInitializationAction> initializationActions) {
    this.initializationActions = initializationActions;
    return this;
  }

  /**
   * Optional. The Compute Engine config settings for the master instance in a cluster.
   * @return value or {@code null} for none
   */
  public InstanceGroupConfig getMasterConfig() {
    return masterConfig;
  }

  /**
   * Optional. The Compute Engine config settings for the master instance in a cluster.
   * @param masterConfig masterConfig or {@code null} for none
   */
  public ClusterConfig setMasterConfig(InstanceGroupConfig masterConfig) {
    this.masterConfig = masterConfig;
    return this;
  }

  /**
   * Optional. The Compute Engine config settings for additional worker instances in a cluster.
   * @return value or {@code null} for none
   */
  public InstanceGroupConfig getSecondaryWorkerConfig() {
    return secondaryWorkerConfig;
  }

  /**
   * Optional. The Compute Engine config settings for additional worker instances in a cluster.
   * @param secondaryWorkerConfig secondaryWorkerConfig or {@code null} for none
   */
  public ClusterConfig setSecondaryWorkerConfig(InstanceGroupConfig secondaryWorkerConfig) {
    this.secondaryWorkerConfig = secondaryWorkerConfig;
    return this;
  }

  /**
   * Optional. The config settings for software inside the cluster.
   * @return value or {@code null} for none
   */
  public SoftwareConfig getSoftwareConfig() {
    return softwareConfig;
  }

  /**
   * Optional. The config settings for software inside the cluster.
   * @param softwareConfig softwareConfig or {@code null} for none
   */
  public ClusterConfig setSoftwareConfig(SoftwareConfig softwareConfig) {
    this.softwareConfig = softwareConfig;
    return this;
  }

  /**
   * Optional. The Compute Engine config settings for worker instances in a cluster.
   * @return value or {@code null} for none
   */
  public InstanceGroupConfig getWorkerConfig() {
    return workerConfig;
  }

  /**
   * Optional. The Compute Engine config settings for worker instances in a cluster.
   * @param workerConfig workerConfig or {@code null} for none
   */
  public ClusterConfig setWorkerConfig(InstanceGroupConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
  }

  @Override
  public ClusterConfig set(String fieldName, Object value) {
    return (ClusterConfig) super.set(fieldName, value);
  }

  @Override
  public ClusterConfig clone() {
    return (ClusterConfig) super.clone();
  }

}
