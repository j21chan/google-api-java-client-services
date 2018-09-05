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
 * Parameters that describe the nodes in a cluster.
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
public final class NodeConfig extends com.google.api.client.json.GenericJson {

  /**
   * A list of hardware accelerators to be attached to each node. See
   * https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AcceleratorConfig> accelerators;

  /**
   * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is
   * 10GB.
   *
   * If unspecified, the default disk size is 100GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer diskSizeGb;

  /**
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd')
   *
   * If unspecified, the default disk type is 'pd-standard'
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * The image type to use for this node. Note that for a given image type, the latest version of it
   * will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageType;

  /**
   * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in
   * addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in
   * label keys, the applied set may differ depending on the Kubernetes version -- it's best to
   * assume the behavior is undefined and conflicts should be avoided. For more information,
   * including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview
   * /working-with-objects/labels/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The number of local SSD disks to be attached to the node.
   *
   * The limit for this value is dependant upon the maximum number of disks available on a machine
   * per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd#local_ssd_limits for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer localSsdCount;

  /**
   * The name of a Google Compute Engine [machine type](/compute/docs/machine-types) (e.g.
   * `n1-standard-1`).
   *
   * If unspecified, the default machine type is `n1-standard-1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The metadata key/value pairs assigned to instances in the cluster.
   *
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes in length. These are
   * reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must
   * not conflict with any other metadata keys for the project or be one of the reserved keys:
   * "cluster-location"  "cluster-name"  "cluster-uid"  "configure-sh"  "gci-update-strategy"  "gci-
   * ensure-gke-docker"  "instance-template"  "kube-env"  "startup-script"  "user-data"
   *
   * Values are free-form strings, and only have meaning as interpreted by the image running in the
   * instance. The only restriction placed on them is that each value's size must be less than or
   * equal to 32 KB.
   *
   * The total size of all keys and values must be less than 512 KB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Minimum CPU platform to be used by this instance. The instance may be scheduled on the
   * specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minCpuPlatform;

  /**
   * The set of Google API scopes to be made available on all of the node VMs under the "default"
   * service account.
   *
   * The following scopes are recommended, but not required, and by default are not included:
   *
   * * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your
   * nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating
   * with **gcr.io** (the [Google Container Registry](/container-registry/)).
   *
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in
   * which case their required scopes will be added.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> oauthScopes;

  /**
   * Whether the nodes are created as preemptible VM instances. See:
   * https://cloud.google.com/compute/docs/instances/preemptible for more information about
   * preemptible VM instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preemptible;

  /**
   * The Google Cloud Platform Service Account to be used by the node VMs. If no Service Account is
   * specified, the "default" service account is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * The list of instance tags applied to all nodes. Tags are used to identify valid sources or
   * targets for network firewalls and are specified by the client during cluster or node pool
   * creation. Each tag within the list must comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * A list of hardware accelerators to be attached to each node. See
   * https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
   * @return value or {@code null} for none
   */
  public java.util.List<AcceleratorConfig> getAccelerators() {
    return accelerators;
  }

  /**
   * A list of hardware accelerators to be attached to each node. See
   * https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
   * @param accelerators accelerators or {@code null} for none
   */
  public NodeConfig setAccelerators(java.util.List<AcceleratorConfig> accelerators) {
    this.accelerators = accelerators;
    return this;
  }

  /**
   * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is
   * 10GB.
   *
   * If unspecified, the default disk size is 100GB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is
   * 10GB.
   *
   * If unspecified, the default disk size is 100GB.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public NodeConfig setDiskSizeGb(java.lang.Integer diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd')
   *
   * If unspecified, the default disk type is 'pd-standard'
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd')
   *
   * If unspecified, the default disk type is 'pd-standard'
   * @param diskType diskType or {@code null} for none
   */
  public NodeConfig setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * The image type to use for this node. Note that for a given image type, the latest version of it
   * will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageType() {
    return imageType;
  }

  /**
   * The image type to use for this node. Note that for a given image type, the latest version of it
   * will be used.
   * @param imageType imageType or {@code null} for none
   */
  public NodeConfig setImageType(java.lang.String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in
   * addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in
   * label keys, the applied set may differ depending on the Kubernetes version -- it's best to
   * assume the behavior is undefined and conflicts should be avoided. For more information,
   * including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview
   * /working-with-objects/labels/
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in
   * addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in
   * label keys, the applied set may differ depending on the Kubernetes version -- it's best to
   * assume the behavior is undefined and conflicts should be avoided. For more information,
   * including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview
   * /working-with-objects/labels/
   * @param labels labels or {@code null} for none
   */
  public NodeConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The number of local SSD disks to be attached to the node.
   *
   * The limit for this value is dependant upon the maximum number of disks available on a machine
   * per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd#local_ssd_limits for more
   * information.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLocalSsdCount() {
    return localSsdCount;
  }

  /**
   * The number of local SSD disks to be attached to the node.
   *
   * The limit for this value is dependant upon the maximum number of disks available on a machine
   * per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd#local_ssd_limits for more
   * information.
   * @param localSsdCount localSsdCount or {@code null} for none
   */
  public NodeConfig setLocalSsdCount(java.lang.Integer localSsdCount) {
    this.localSsdCount = localSsdCount;
    return this;
  }

  /**
   * The name of a Google Compute Engine [machine type](/compute/docs/machine-types) (e.g.
   * `n1-standard-1`).
   *
   * If unspecified, the default machine type is `n1-standard-1`.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * The name of a Google Compute Engine [machine type](/compute/docs/machine-types) (e.g.
   * `n1-standard-1`).
   *
   * If unspecified, the default machine type is `n1-standard-1`.
   * @param machineType machineType or {@code null} for none
   */
  public NodeConfig setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The metadata key/value pairs assigned to instances in the cluster.
   *
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes in length. These are
   * reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must
   * not conflict with any other metadata keys for the project or be one of the reserved keys:
   * "cluster-location"  "cluster-name"  "cluster-uid"  "configure-sh"  "gci-update-strategy"  "gci-
   * ensure-gke-docker"  "instance-template"  "kube-env"  "startup-script"  "user-data"
   *
   * Values are free-form strings, and only have meaning as interpreted by the image running in the
   * instance. The only restriction placed on them is that each value's size must be less than or
   * equal to 32 KB.
   *
   * The total size of all keys and values must be less than 512 KB.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * The metadata key/value pairs assigned to instances in the cluster.
   *
   * Keys must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes in length. These are
   * reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must
   * not conflict with any other metadata keys for the project or be one of the reserved keys:
   * "cluster-location"  "cluster-name"  "cluster-uid"  "configure-sh"  "gci-update-strategy"  "gci-
   * ensure-gke-docker"  "instance-template"  "kube-env"  "startup-script"  "user-data"
   *
   * Values are free-form strings, and only have meaning as interpreted by the image running in the
   * instance. The only restriction placed on them is that each value's size must be less than or
   * equal to 32 KB.
   *
   * The total size of all keys and values must be less than 512 KB.
   * @param metadata metadata or {@code null} for none
   */
  public NodeConfig setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Minimum CPU platform to be used by this instance. The instance may be scheduled on the
   * specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * @return value or {@code null} for none
   */
  public java.lang.String getMinCpuPlatform() {
    return minCpuPlatform;
  }

  /**
   * Minimum CPU platform to be used by this instance. The instance may be scheduled on the
   * specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: Intel Haswell or minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * @param minCpuPlatform minCpuPlatform or {@code null} for none
   */
  public NodeConfig setMinCpuPlatform(java.lang.String minCpuPlatform) {
    this.minCpuPlatform = minCpuPlatform;
    return this;
  }

  /**
   * The set of Google API scopes to be made available on all of the node VMs under the "default"
   * service account.
   *
   * The following scopes are recommended, but not required, and by default are not included:
   *
   * * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your
   * nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating
   * with **gcr.io** (the [Google Container Registry](/container-registry/)).
   *
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in
   * which case their required scopes will be added.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOauthScopes() {
    return oauthScopes;
  }

  /**
   * The set of Google API scopes to be made available on all of the node VMs under the "default"
   * service account.
   *
   * The following scopes are recommended, but not required, and by default are not included:
   *
   * * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your
   * nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating
   * with **gcr.io** (the [Google Container Registry](/container-registry/)).
   *
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in
   * which case their required scopes will be added.
   * @param oauthScopes oauthScopes or {@code null} for none
   */
  public NodeConfig setOauthScopes(java.util.List<java.lang.String> oauthScopes) {
    this.oauthScopes = oauthScopes;
    return this;
  }

  /**
   * Whether the nodes are created as preemptible VM instances. See:
   * https://cloud.google.com/compute/docs/instances/preemptible for more information about
   * preemptible VM instances.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreemptible() {
    return preemptible;
  }

  /**
   * Whether the nodes are created as preemptible VM instances. See:
   * https://cloud.google.com/compute/docs/instances/preemptible for more information about
   * preemptible VM instances.
   * @param preemptible preemptible or {@code null} for none
   */
  public NodeConfig setPreemptible(java.lang.Boolean preemptible) {
    this.preemptible = preemptible;
    return this;
  }

  /**
   * The Google Cloud Platform Service Account to be used by the node VMs. If no Service Account is
   * specified, the "default" service account is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The Google Cloud Platform Service Account to be used by the node VMs. If no Service Account is
   * specified, the "default" service account is used.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public NodeConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The list of instance tags applied to all nodes. Tags are used to identify valid sources or
   * targets for network firewalls and are specified by the client during cluster or node pool
   * creation. Each tag within the list must comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * The list of instance tags applied to all nodes. Tags are used to identify valid sources or
   * targets for network firewalls and are specified by the client during cluster or node pool
   * creation. Each tag within the list must comply with RFC1035.
   * @param tags tags or {@code null} for none
   */
  public NodeConfig setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public NodeConfig set(String fieldName, Object value) {
    return (NodeConfig) super.set(fieldName, value);
  }

  @Override
  public NodeConfig clone() {
    return (NodeConfig) super.clone();
  }

}
