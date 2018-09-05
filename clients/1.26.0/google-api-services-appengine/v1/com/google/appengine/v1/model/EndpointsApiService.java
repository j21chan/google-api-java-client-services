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

package com.google.appengine.v1.model;

/**
 * Cloud Endpoints (https://cloud.google.com/endpoints) configuration. The Endpoints API Service
 * provides tooling for serving Open API and gRPC endpoints via an NGINX proxy. Only valid for App
 * Engine Flexible environment deployments.The fields here refer to the name and configuration ID of
 * a "service" resource in the Service Management API (https://cloud.google.com/service-
 * management/overview).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EndpointsApiService extends com.google.api.client.json.GenericJson {

  /**
   * Endpoints service configuration ID as specified by the Service Management API. For example
   * "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This
   * means that Endpoints starts up with a particular configuration ID. When a new configuration is
   * rolled out, Endpoints must be given the new configuration ID. The config_id field is used to
   * give the configuration ID and is required in this case.Endpoints also has a rollout strategy
   * called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and
   * does not need the configuration ID. In this case, config_id must be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configId;

  /**
   * Endpoints service name which is the name of the "service" resource in the Service Management
   * API. For example "myapi.endpoints.myproject.cloud.goog"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must
   * be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutStrategy;

  /**
   * Endpoints service configuration ID as specified by the Service Management API. For example
   * "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This
   * means that Endpoints starts up with a particular configuration ID. When a new configuration is
   * rolled out, Endpoints must be given the new configuration ID. The config_id field is used to
   * give the configuration ID and is required in this case.Endpoints also has a rollout strategy
   * called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and
   * does not need the configuration ID. In this case, config_id must be omitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigId() {
    return configId;
  }

  /**
   * Endpoints service configuration ID as specified by the Service Management API. For example
   * "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This
   * means that Endpoints starts up with a particular configuration ID. When a new configuration is
   * rolled out, Endpoints must be given the new configuration ID. The config_id field is used to
   * give the configuration ID and is required in this case.Endpoints also has a rollout strategy
   * called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and
   * does not need the configuration ID. In this case, config_id must be omitted.
   * @param configId configId or {@code null} for none
   */
  public EndpointsApiService setConfigId(java.lang.String configId) {
    this.configId = configId;
    return this;
  }

  /**
   * Endpoints service name which is the name of the "service" resource in the Service Management
   * API. For example "myapi.endpoints.myproject.cloud.goog"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Endpoints service name which is the name of the "service" resource in the Service Management
   * API. For example "myapi.endpoints.myproject.cloud.goog"
   * @param name name or {@code null} for none
   */
  public EndpointsApiService setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must
   * be omitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutStrategy() {
    return rolloutStrategy;
  }

  /**
   * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must
   * be omitted.
   * @param rolloutStrategy rolloutStrategy or {@code null} for none
   */
  public EndpointsApiService setRolloutStrategy(java.lang.String rolloutStrategy) {
    this.rolloutStrategy = rolloutStrategy;
    return this;
  }

  @Override
  public EndpointsApiService set(String fieldName, Object value) {
    return (EndpointsApiService) super.set(fieldName, value);
  }

  @Override
  public EndpointsApiService clone() {
    return (EndpointsApiService) super.clone();
  }

}
