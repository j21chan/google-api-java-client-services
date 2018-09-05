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
 * An Instance resource is the computing unit that App Engine uses to automatically scale an
 * application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * App Engine release this instance is running on.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appEngineRelease;

  /**
   * Availability of the instance.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availability;

  /**
   * Average latency (ms) over the last minute.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer averageLatency;

  /**
   * Number of errors since this instance was started.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer errors;

  /**
   * Relative name of the instance within the version. Example: instance-1.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Total memory in use (bytes).@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long memoryUsage;

  /**
   * Full path to the Instance resource in the API. Example:
   * apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Average queries per second (QPS) over the last minute.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float qps;

  /**
   * Number of requests since this instance was started.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer requests;

  /**
   * Time that this instance was started.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Whether this instance is in debug mode. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean vmDebugEnabled;

  /**
   * Virtual machine ID of this instance. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmId;

  /**
   * The IP address of this instance. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmIp;

  /**
   * Name of the virtual machine where this instance lives. Only applicable for instances in App
   * Engine flexible environment.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmName;

  /**
   * Status of the virtual machine where this instance lives. Only applicable for instances in App
   * Engine flexible environment.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmStatus;

  /**
   * Zone where the virtual machine is located. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmZoneName;

  /**
   * App Engine release this instance is running on.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getAppEngineRelease() {
    return appEngineRelease;
  }

  /**
   * App Engine release this instance is running on.@OutputOnly
   * @param appEngineRelease appEngineRelease or {@code null} for none
   */
  public Instance setAppEngineRelease(java.lang.String appEngineRelease) {
    this.appEngineRelease = appEngineRelease;
    return this;
  }

  /**
   * Availability of the instance.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailability() {
    return availability;
  }

  /**
   * Availability of the instance.@OutputOnly
   * @param availability availability or {@code null} for none
   */
  public Instance setAvailability(java.lang.String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Average latency (ms) over the last minute.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAverageLatency() {
    return averageLatency;
  }

  /**
   * Average latency (ms) over the last minute.@OutputOnly
   * @param averageLatency averageLatency or {@code null} for none
   */
  public Instance setAverageLatency(java.lang.Integer averageLatency) {
    this.averageLatency = averageLatency;
    return this;
  }

  /**
   * Number of errors since this instance was started.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Integer getErrors() {
    return errors;
  }

  /**
   * Number of errors since this instance was started.@OutputOnly
   * @param errors errors or {@code null} for none
   */
  public Instance setErrors(java.lang.Integer errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Relative name of the instance within the version. Example: instance-1.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Relative name of the instance within the version. Example: instance-1.@OutputOnly
   * @param id id or {@code null} for none
   */
  public Instance setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Total memory in use (bytes).@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Long getMemoryUsage() {
    return memoryUsage;
  }

  /**
   * Total memory in use (bytes).@OutputOnly
   * @param memoryUsage memoryUsage or {@code null} for none
   */
  public Instance setMemoryUsage(java.lang.Long memoryUsage) {
    this.memoryUsage = memoryUsage;
    return this;
  }

  /**
   * Full path to the Instance resource in the API. Example:
   * apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full path to the Instance resource in the API. Example:
   * apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Average queries per second (QPS) over the last minute.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Float getQps() {
    return qps;
  }

  /**
   * Average queries per second (QPS) over the last minute.@OutputOnly
   * @param qps qps or {@code null} for none
   */
  public Instance setQps(java.lang.Float qps) {
    this.qps = qps;
    return this;
  }

  /**
   * Number of requests since this instance was started.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRequests() {
    return requests;
  }

  /**
   * Number of requests since this instance was started.@OutputOnly
   * @param requests requests or {@code null} for none
   */
  public Instance setRequests(java.lang.Integer requests) {
    this.requests = requests;
    return this;
  }

  /**
   * Time that this instance was started.@OutputOnly
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time that this instance was started.@OutputOnly
   * @param startTime startTime or {@code null} for none
   */
  public Instance setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Whether this instance is in debug mode. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVmDebugEnabled() {
    return vmDebugEnabled;
  }

  /**
   * Whether this instance is in debug mode. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @param vmDebugEnabled vmDebugEnabled or {@code null} for none
   */
  public Instance setVmDebugEnabled(java.lang.Boolean vmDebugEnabled) {
    this.vmDebugEnabled = vmDebugEnabled;
    return this;
  }

  /**
   * Virtual machine ID of this instance. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getVmId() {
    return vmId;
  }

  /**
   * Virtual machine ID of this instance. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @param vmId vmId or {@code null} for none
   */
  public Instance setVmId(java.lang.String vmId) {
    this.vmId = vmId;
    return this;
  }

  /**
   * The IP address of this instance. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getVmIp() {
    return vmIp;
  }

  /**
   * The IP address of this instance. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @param vmIp vmIp or {@code null} for none
   */
  public Instance setVmIp(java.lang.String vmIp) {
    this.vmIp = vmIp;
    return this;
  }

  /**
   * Name of the virtual machine where this instance lives. Only applicable for instances in App
   * Engine flexible environment.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getVmName() {
    return vmName;
  }

  /**
   * Name of the virtual machine where this instance lives. Only applicable for instances in App
   * Engine flexible environment.@OutputOnly
   * @param vmName vmName or {@code null} for none
   */
  public Instance setVmName(java.lang.String vmName) {
    this.vmName = vmName;
    return this;
  }

  /**
   * Status of the virtual machine where this instance lives. Only applicable for instances in App
   * Engine flexible environment.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getVmStatus() {
    return vmStatus;
  }

  /**
   * Status of the virtual machine where this instance lives. Only applicable for instances in App
   * Engine flexible environment.@OutputOnly
   * @param vmStatus vmStatus or {@code null} for none
   */
  public Instance setVmStatus(java.lang.String vmStatus) {
    this.vmStatus = vmStatus;
    return this;
  }

  /**
   * Zone where the virtual machine is located. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getVmZoneName() {
    return vmZoneName;
  }

  /**
   * Zone where the virtual machine is located. Only applicable for instances in App Engine flexible
   * environment.@OutputOnly
   * @param vmZoneName vmZoneName or {@code null} for none
   */
  public Instance setVmZoneName(java.lang.String vmZoneName) {
    this.vmZoneName = vmZoneName;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}
