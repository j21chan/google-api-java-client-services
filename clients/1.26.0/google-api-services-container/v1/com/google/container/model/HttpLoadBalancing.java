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
 * Configuration options for the HTTP (L7) load balancing controller addon, which makes it easy to
 * set up HTTP load balancers for services in a cluster.
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
public final class HttpLoadBalancing extends com.google.api.client.json.GenericJson {

  /**
   * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a
   * small pod in the cluster that manages the load balancers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a
   * small pod in the cluster that manages the load balancers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a
   * small pod in the cluster that manages the load balancers.
   * @param disabled disabled or {@code null} for none
   */
  public HttpLoadBalancing setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  @Override
  public HttpLoadBalancing set(String fieldName, Object value) {
    return (HttpLoadBalancing) super.set(fieldName, value);
  }

  @Override
  public HttpLoadBalancing clone() {
    return (HttpLoadBalancing) super.clone();
  }

}
