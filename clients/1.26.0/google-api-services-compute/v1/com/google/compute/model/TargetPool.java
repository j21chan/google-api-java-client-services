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

package com.google.compute.model;

/**
 * A TargetPool resource. This resource defines a pool of instances, an associated HttpHealthCheck
 * resource, and the fallback target pool. (== resource_for beta.targetPools ==) (== resource_for
 * v1.targetPools ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetPool extends com.google.api.client.json.GenericJson {

  /**
   * This field is applicable only when the containing target pool is serving a forwarding rule as
   * the primary pool, and its failoverRatio field is properly set to a value between [0, 1].
   *
   * backupPool and failoverRatio together define the fallback behavior of the primary target pool:
   * if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic
   * arriving at the load-balanced IP will be directed to the backup pool.
   *
   * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool
   * are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where
   * traffic will be spread to the healthy instances with the best effort, or to all instances when
   * no instance is healthy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupPool;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * This field is applicable only when the containing target pool is serving a forwarding rule as
   * the primary pool (i.e., not as a backup pool to some other target pool). The value of the field
   * must be in [0, 1].
   *
   * If set, backupPool must also be set. They together define the fallback behavior of the primary
   * target pool: if the ratio of the healthy instances in the primary pool is at or below this
   * number, traffic arriving at the load-balanced IP will be directed to the backup pool.
   *
   * In case where failoverRatio is not set or all the instances in the backup pool are unhealthy,
   * the traffic will be directed back to the primary pool in the "force" mode, where traffic will
   * be spread to the healthy instances with the best effort, or to all instances when no instance
   * is healthy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float failoverRatio;

  /**
   * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy
   * if and only if the health checks pass. An empty list means all member instances will be
   * considered healthy at all times. Only HttpHealthChecks are supported. Only one health check may
   * be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> healthChecks;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * A list of resource URLs to the virtual machine instances serving this pool. They must live in
   * zones contained in the same region as this pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instances;

  /**
   * [Output Only] Type of the resource. Always compute#targetPool for target pools.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] URL of the region where the target pool resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Sesssion affinity option, must be one of the following values: NONE: Connections from the same
   * client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP
   * will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO:
   * Connections from the same client IP with the same IP protocol will go to the same instance in
   * the pool while that instance remains healthy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionAffinity;

  /**
   * This field is applicable only when the containing target pool is serving a forwarding rule as
   * the primary pool, and its failoverRatio field is properly set to a value between [0, 1].
   *
   * backupPool and failoverRatio together define the fallback behavior of the primary target pool:
   * if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic
   * arriving at the load-balanced IP will be directed to the backup pool.
   *
   * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool
   * are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where
   * traffic will be spread to the healthy instances with the best effort, or to all instances when
   * no instance is healthy.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupPool() {
    return backupPool;
  }

  /**
   * This field is applicable only when the containing target pool is serving a forwarding rule as
   * the primary pool, and its failoverRatio field is properly set to a value between [0, 1].
   *
   * backupPool and failoverRatio together define the fallback behavior of the primary target pool:
   * if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic
   * arriving at the load-balanced IP will be directed to the backup pool.
   *
   * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool
   * are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where
   * traffic will be spread to the healthy instances with the best effort, or to all instances when
   * no instance is healthy.
   * @param backupPool backupPool or {@code null} for none
   */
  public TargetPool setBackupPool(java.lang.String backupPool) {
    this.backupPool = backupPool;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public TargetPool setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public TargetPool setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * This field is applicable only when the containing target pool is serving a forwarding rule as
   * the primary pool (i.e., not as a backup pool to some other target pool). The value of the field
   * must be in [0, 1].
   *
   * If set, backupPool must also be set. They together define the fallback behavior of the primary
   * target pool: if the ratio of the healthy instances in the primary pool is at or below this
   * number, traffic arriving at the load-balanced IP will be directed to the backup pool.
   *
   * In case where failoverRatio is not set or all the instances in the backup pool are unhealthy,
   * the traffic will be directed back to the primary pool in the "force" mode, where traffic will
   * be spread to the healthy instances with the best effort, or to all instances when no instance
   * is healthy.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFailoverRatio() {
    return failoverRatio;
  }

  /**
   * This field is applicable only when the containing target pool is serving a forwarding rule as
   * the primary pool (i.e., not as a backup pool to some other target pool). The value of the field
   * must be in [0, 1].
   *
   * If set, backupPool must also be set. They together define the fallback behavior of the primary
   * target pool: if the ratio of the healthy instances in the primary pool is at or below this
   * number, traffic arriving at the load-balanced IP will be directed to the backup pool.
   *
   * In case where failoverRatio is not set or all the instances in the backup pool are unhealthy,
   * the traffic will be directed back to the primary pool in the "force" mode, where traffic will
   * be spread to the healthy instances with the best effort, or to all instances when no instance
   * is healthy.
   * @param failoverRatio failoverRatio or {@code null} for none
   */
  public TargetPool setFailoverRatio(java.lang.Float failoverRatio) {
    this.failoverRatio = failoverRatio;
    return this;
  }

  /**
   * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy
   * if and only if the health checks pass. An empty list means all member instances will be
   * considered healthy at all times. Only HttpHealthChecks are supported. Only one health check may
   * be specified.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getHealthChecks() {
    return healthChecks;
  }

  /**
   * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy
   * if and only if the health checks pass. An empty list means all member instances will be
   * considered healthy at all times. Only HttpHealthChecks are supported. Only one health check may
   * be specified.
   * @param healthChecks healthChecks or {@code null} for none
   */
  public TargetPool setHealthChecks(java.util.List<java.lang.String> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public TargetPool setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * A list of resource URLs to the virtual machine instances serving this pool. They must live in
   * zones contained in the same region as this pool.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstances() {
    return instances;
  }

  /**
   * A list of resource URLs to the virtual machine instances serving this pool. They must live in
   * zones contained in the same region as this pool.
   * @param instances instances or {@code null} for none
   */
  public TargetPool setInstances(java.util.List<java.lang.String> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#targetPool for target pools.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#targetPool for target pools.
   * @param kind kind or {@code null} for none
   */
  public TargetPool setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public TargetPool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] URL of the region where the target pool resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the target pool resides.
   * @param region region or {@code null} for none
   */
  public TargetPool setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public TargetPool setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Sesssion affinity option, must be one of the following values: NONE: Connections from the same
   * client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP
   * will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO:
   * Connections from the same client IP with the same IP protocol will go to the same instance in
   * the pool while that instance remains healthy.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionAffinity() {
    return sessionAffinity;
  }

  /**
   * Sesssion affinity option, must be one of the following values: NONE: Connections from the same
   * client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP
   * will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO:
   * Connections from the same client IP with the same IP protocol will go to the same instance in
   * the pool while that instance remains healthy.
   * @param sessionAffinity sessionAffinity or {@code null} for none
   */
  public TargetPool setSessionAffinity(java.lang.String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

  @Override
  public TargetPool set(String fieldName, Object value) {
    return (TargetPool) super.set(fieldName, value);
  }

  @Override
  public TargetPool clone() {
    return (TargetPool) super.clone();
  }

}
