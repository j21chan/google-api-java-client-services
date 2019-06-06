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

package com.google.api.services.container.model;

/**
 * Configuration for the addons that can be automatically spun up in the cluster, enabling
 * additional functionality.
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
public final class AddonsConfig extends com.google.api.client.json.GenericJson {

  /**
   * Configuration for the horizontal pod autoscaling feature, which increases or decreases the
   * number of replica pods a replication controller has based on the resource usage of the existing
   * pods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HorizontalPodAutoscaling horizontalPodAutoscaling;

  /**
   * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up
   * HTTP load balancers for services in a cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpLoadBalancing httpLoadBalancing;

  /**
   * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in
   * 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes
   * clusters, workloads and applications. For more information, see: https://cloud.google.com
   * /kubernetes-engine/docs/concepts/dashboards
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KubernetesDashboard kubernetesDashboard;

  /**
   * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the
   * Master, it does not track whether network policy is enabled for the nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkPolicyConfig networkPolicyConfig;

  /**
   * Configuration for the horizontal pod autoscaling feature, which increases or decreases the
   * number of replica pods a replication controller has based on the resource usage of the existing
   * pods.
   * @return value or {@code null} for none
   */
  public HorizontalPodAutoscaling getHorizontalPodAutoscaling() {
    return horizontalPodAutoscaling;
  }

  /**
   * Configuration for the horizontal pod autoscaling feature, which increases or decreases the
   * number of replica pods a replication controller has based on the resource usage of the existing
   * pods.
   * @param horizontalPodAutoscaling horizontalPodAutoscaling or {@code null} for none
   */
  public AddonsConfig setHorizontalPodAutoscaling(HorizontalPodAutoscaling horizontalPodAutoscaling) {
    this.horizontalPodAutoscaling = horizontalPodAutoscaling;
    return this;
  }

  /**
   * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up
   * HTTP load balancers for services in a cluster.
   * @return value or {@code null} for none
   */
  public HttpLoadBalancing getHttpLoadBalancing() {
    return httpLoadBalancing;
  }

  /**
   * Configuration for the HTTP (L7) load balancing controller addon, which makes it easy to set up
   * HTTP load balancers for services in a cluster.
   * @param httpLoadBalancing httpLoadBalancing or {@code null} for none
   */
  public AddonsConfig setHttpLoadBalancing(HttpLoadBalancing httpLoadBalancing) {
    this.httpLoadBalancing = httpLoadBalancing;
    return this;
  }

  /**
   * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in
   * 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes
   * clusters, workloads and applications. For more information, see: https://cloud.google.com
   * /kubernetes-engine/docs/concepts/dashboards
   * @return value or {@code null} for none
   */
  public KubernetesDashboard getKubernetesDashboard() {
    return kubernetesDashboard;
  }

  /**
   * Configuration for the Kubernetes Dashboard. This addon is deprecated, and will be disabled in
   * 1.15. It is recommended to use the Cloud Console to manage and monitor your Kubernetes
   * clusters, workloads and applications. For more information, see: https://cloud.google.com
   * /kubernetes-engine/docs/concepts/dashboards
   * @param kubernetesDashboard kubernetesDashboard or {@code null} for none
   */
  public AddonsConfig setKubernetesDashboard(KubernetesDashboard kubernetesDashboard) {
    this.kubernetesDashboard = kubernetesDashboard;
    return this;
  }

  /**
   * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the
   * Master, it does not track whether network policy is enabled for the nodes.
   * @return value or {@code null} for none
   */
  public NetworkPolicyConfig getNetworkPolicyConfig() {
    return networkPolicyConfig;
  }

  /**
   * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the
   * Master, it does not track whether network policy is enabled for the nodes.
   * @param networkPolicyConfig networkPolicyConfig or {@code null} for none
   */
  public AddonsConfig setNetworkPolicyConfig(NetworkPolicyConfig networkPolicyConfig) {
    this.networkPolicyConfig = networkPolicyConfig;
    return this;
  }

  @Override
  public AddonsConfig set(String fieldName, Object value) {
    return (AddonsConfig) super.set(fieldName, value);
  }

  @Override
  public AddonsConfig clone() {
    return (AddonsConfig) super.clone();
  }

}
