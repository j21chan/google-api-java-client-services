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

package com.google.composer.v1beta1.model;

/**
 * An environment for running orchestration tasks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Environment extends com.google.api.client.json.GenericJson {

  /**
   * Configuration parameters for this environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnvironmentConfig config;

  /**
   * Output only. The time at which this environment was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. User-defined labels for this environment. The labels map can contain no more than 64
   * entries. Entries of the labels map are UTF8 strings that comply with the following
   * restrictions:
   *
   * * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128
   * bytes in size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The resource name of the environment, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The current state of the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time at which this environment was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The UUID (Universally Unique IDentifier) associated with this environment. This
   * value is generated when the environment is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uuid;

  /**
   * Configuration parameters for this environment.
   * @return value or {@code null} for none
   */
  public EnvironmentConfig getConfig() {
    return config;
  }

  /**
   * Configuration parameters for this environment.
   * @param config config or {@code null} for none
   */
  public Environment setConfig(EnvironmentConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Output only. The time at which this environment was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which this environment was created.
   * @param createTime createTime or {@code null} for none
   */
  public Environment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. User-defined labels for this environment. The labels map can contain no more than 64
   * entries. Entries of the labels map are UTF8 strings that comply with the following
   * restrictions:
   *
   * * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128
   * bytes in size.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. User-defined labels for this environment. The labels map can contain no more than 64
   * entries. Entries of the labels map are UTF8 strings that comply with the following
   * restrictions:
   *
   * * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128
   * bytes in size.
   * @param labels labels or {@code null} for none
   */
  public Environment setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The resource name of the environment, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the environment, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * @param name name or {@code null} for none
   */
  public Environment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The current state of the environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the environment.
   * @param state state or {@code null} for none
   */
  public Environment setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time at which this environment was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time at which this environment was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public Environment setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. The UUID (Universally Unique IDentifier) associated with this environment. This
   * value is generated when the environment is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getUuid() {
    return uuid;
  }

  /**
   * Output only. The UUID (Universally Unique IDentifier) associated with this environment. This
   * value is generated when the environment is created.
   * @param uuid uuid or {@code null} for none
   */
  public Environment setUuid(java.lang.String uuid) {
    this.uuid = uuid;
    return this;
  }

  @Override
  public Environment set(String fieldName, Object value) {
    return (Environment) super.set(fieldName, value);
  }

  @Override
  public Environment clone() {
    return (Environment) super.clone();
  }

}
