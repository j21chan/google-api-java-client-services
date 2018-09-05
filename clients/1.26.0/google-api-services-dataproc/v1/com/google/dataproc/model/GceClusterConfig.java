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
 * Common config settings for resources of Compute Engine cluster instances, applicable to all
 * instances in the cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GceClusterConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If true, all instances in the cluster will only have internal IP addresses. By
   * default, clusters are not restricted to internal IP addresses, and will have ephemeral external
   * IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled
   * for subnetwork enabled networks, and all off-cluster dependencies must be configured to be
   * accessible without external IP addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean internalIpOnly;

  /**
   * The Compute Engine metadata entries to add to all instances (see Project and instance metadata
   * (https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#project_and_instance_metadata)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Optional. The Compute Engine network to be used for machine communications. Cannot be specified
   * with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the "default"
   * network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using
   * Subnetworks for more information).A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default
   * projects/[project_id]/regions/global/default default
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkUri;

  /**
   * Optional. The service account of the instances. Defaults to the default Compute Engine service
   * account. Custom service accounts need permissions equivalent to the following IAM roles:
   * roles/logging.logWriter roles/storage.objectAdmin(see
   * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts for more
   * information). Example: [account_id]@[project_id].iam.gserviceaccount.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Optional. The URIs of service account scopes to be included in Compute Engine instances. The
   * following base set of scopes is always included:
   * https://www.googleapis.com/auth/cloud.useraccounts.readonly
   * https://www.googleapis.com/auth/devstorage.read_write
   * https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults
   * are also provided: https://www.googleapis.com/auth/bigquery
   * https://www.googleapis.com/auth/bigtable.admin.table
   * https://www.googleapis.com/auth/bigtable.data
   * https://www.googleapis.com/auth/devstorage.full_control
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> serviceAccountScopes;

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be
   * specified with network_uri.A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/sub0
   * projects/[project_id]/regions/us-east1/sub0 sub0
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetworkUri;

  /**
   * The Compute Engine tags to add to all instances (see Tagging instances).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is
   * required in the "global" region. If omitted in a non-global Cloud Dataproc region, the service
   * will pick a zone in the corresponding Compute Engine region. On a get request, zone will always
   * be present.A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]
   * projects/[project_id]/zones/[zone] us-central1-f
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zoneUri;

  /**
   * Optional. If true, all instances in the cluster will only have internal IP addresses. By
   * default, clusters are not restricted to internal IP addresses, and will have ephemeral external
   * IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled
   * for subnetwork enabled networks, and all off-cluster dependencies must be configured to be
   * accessible without external IP addresses.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInternalIpOnly() {
    return internalIpOnly;
  }

  /**
   * Optional. If true, all instances in the cluster will only have internal IP addresses. By
   * default, clusters are not restricted to internal IP addresses, and will have ephemeral external
   * IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled
   * for subnetwork enabled networks, and all off-cluster dependencies must be configured to be
   * accessible without external IP addresses.
   * @param internalIpOnly internalIpOnly or {@code null} for none
   */
  public GceClusterConfig setInternalIpOnly(java.lang.Boolean internalIpOnly) {
    this.internalIpOnly = internalIpOnly;
    return this;
  }

  /**
   * The Compute Engine metadata entries to add to all instances (see Project and instance metadata
   * (https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#project_and_instance_metadata)).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * The Compute Engine metadata entries to add to all instances (see Project and instance metadata
   * (https://cloud.google.com/compute/docs/storing-retrieving-
   * metadata#project_and_instance_metadata)).
   * @param metadata metadata or {@code null} for none
   */
  public GceClusterConfig setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Optional. The Compute Engine network to be used for machine communications. Cannot be specified
   * with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the "default"
   * network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using
   * Subnetworks for more information).A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default
   * projects/[project_id]/regions/global/default default
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkUri() {
    return networkUri;
  }

  /**
   * Optional. The Compute Engine network to be used for machine communications. Cannot be specified
   * with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the "default"
   * network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using
   * Subnetworks for more information).A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default
   * projects/[project_id]/regions/global/default default
   * @param networkUri networkUri or {@code null} for none
   */
  public GceClusterConfig setNetworkUri(java.lang.String networkUri) {
    this.networkUri = networkUri;
    return this;
  }

  /**
   * Optional. The service account of the instances. Defaults to the default Compute Engine service
   * account. Custom service accounts need permissions equivalent to the following IAM roles:
   * roles/logging.logWriter roles/storage.objectAdmin(see
   * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts for more
   * information). Example: [account_id]@[project_id].iam.gserviceaccount.com
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. The service account of the instances. Defaults to the default Compute Engine service
   * account. Custom service accounts need permissions equivalent to the following IAM roles:
   * roles/logging.logWriter roles/storage.objectAdmin(see
   * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts for more
   * information). Example: [account_id]@[project_id].iam.gserviceaccount.com
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GceClusterConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Optional. The URIs of service account scopes to be included in Compute Engine instances. The
   * following base set of scopes is always included:
   * https://www.googleapis.com/auth/cloud.useraccounts.readonly
   * https://www.googleapis.com/auth/devstorage.read_write
   * https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults
   * are also provided: https://www.googleapis.com/auth/bigquery
   * https://www.googleapis.com/auth/bigtable.admin.table
   * https://www.googleapis.com/auth/bigtable.data
   * https://www.googleapis.com/auth/devstorage.full_control
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServiceAccountScopes() {
    return serviceAccountScopes;
  }

  /**
   * Optional. The URIs of service account scopes to be included in Compute Engine instances. The
   * following base set of scopes is always included:
   * https://www.googleapis.com/auth/cloud.useraccounts.readonly
   * https://www.googleapis.com/auth/devstorage.read_write
   * https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults
   * are also provided: https://www.googleapis.com/auth/bigquery
   * https://www.googleapis.com/auth/bigtable.admin.table
   * https://www.googleapis.com/auth/bigtable.data
   * https://www.googleapis.com/auth/devstorage.full_control
   * @param serviceAccountScopes serviceAccountScopes or {@code null} for none
   */
  public GceClusterConfig setServiceAccountScopes(java.util.List<java.lang.String> serviceAccountScopes) {
    this.serviceAccountScopes = serviceAccountScopes;
    return this;
  }

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be
   * specified with network_uri.A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/sub0
   * projects/[project_id]/regions/us-east1/sub0 sub0
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetworkUri() {
    return subnetworkUri;
  }

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be
   * specified with network_uri.A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/sub0
   * projects/[project_id]/regions/us-east1/sub0 sub0
   * @param subnetworkUri subnetworkUri or {@code null} for none
   */
  public GceClusterConfig setSubnetworkUri(java.lang.String subnetworkUri) {
    this.subnetworkUri = subnetworkUri;
    return this;
  }

  /**
   * The Compute Engine tags to add to all instances (see Tagging instances).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * The Compute Engine tags to add to all instances (see Tagging instances).
   * @param tags tags or {@code null} for none
   */
  public GceClusterConfig setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is
   * required in the "global" region. If omitted in a non-global Cloud Dataproc region, the service
   * will pick a zone in the corresponding Compute Engine region. On a get request, zone will always
   * be present.A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]
   * projects/[project_id]/zones/[zone] us-central1-f
   * @return value or {@code null} for none
   */
  public java.lang.String getZoneUri() {
    return zoneUri;
  }

  /**
   * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is
   * required in the "global" region. If omitted in a non-global Cloud Dataproc region, the service
   * will pick a zone in the corresponding Compute Engine region. On a get request, zone will always
   * be present.A full URL, partial URI, or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]
   * projects/[project_id]/zones/[zone] us-central1-f
   * @param zoneUri zoneUri or {@code null} for none
   */
  public GceClusterConfig setZoneUri(java.lang.String zoneUri) {
    this.zoneUri = zoneUri;
    return this;
  }

  @Override
  public GceClusterConfig set(String fieldName, Object value) {
    return (GceClusterConfig) super.set(fieldName, value);
  }

  @Override
  public GceClusterConfig clone() {
    return (GceClusterConfig) super.clone();
  }

}
