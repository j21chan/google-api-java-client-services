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

package com.google.cloudiot.v1.model;

/**
 * The device resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud IoT API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Device extends com.google.api.client.json.GenericJson {

  /**
   * If a device is blocked, connections or requests from this device will fail. Can be used to
   * temporarily prevent the device from connecting if, for example, the sensor is generating bad
   * data and needs maintenance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean blocked;

  /**
   * The most recent device configuration, which is eventually sent from Cloud IoT Core to the
   * device. If not present on creation, the configuration will be initialized with an empty payload
   * and version value of `1`. To update this field after creation, use the
   * `DeviceManager.ModifyCloudToDeviceConfig` method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceConfig config;

  /**
   * The credentials used to authenticate this device. To allow credential rotation without
   * interruption, multiple device credentials can be bound to this device. No more than 3
   * credentials can be bound to a single device at a time. When new credentials are added to a
   * device, they are verified against the registry credentials. For details, see the description of
   * the `DeviceRegistry.credentials` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeviceCredential> credentials;

  static {
    // hack to force ProGuard to consider DeviceCredential used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DeviceCredential.class);
  }

  /**
   * The user-defined device identifier. The device ID must be unique within a device registry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * [Output only] The last time a cloud-to-device config version acknowledgment was received from
   * the device. This field is only for configurations sent through MQTT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastConfigAckTime;

  /**
   * [Output only] The last time a cloud-to-device config version was sent to the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastConfigSendTime;

  /**
   * [Output only] The error message of the most recent error, such as a failure to publish to Cloud
   * Pub/Sub. 'last_error_time' is the timestamp of this field. If no errors have occurred, this
   * field has an empty message and the status code 0 == OK. Otherwise, this field is expected to
   * have a status code other than OK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status lastErrorStatus;

  /**
   * [Output only] The time the most recent error occurred, such as a failure to publish to Cloud
   * Pub/Sub. This field is the timestamp of 'last_error_status'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastErrorTime;

  /**
   * [Output only] The last time a telemetry event was received. Timestamps are periodically
   * collected and written to storage; they may be stale by a few minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastEventTime;

  /**
   * [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to devices
   * connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the connection is
   * idle, and no other messages have been sent. Timestamps are periodically collected and written
   * to storage; they may be stale by a few minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastHeartbeatTime;

  /**
   * [Output only] The last time a state event was received. Timestamps are periodically collected
   * and written to storage; they may be stale by a few minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastStateTime;

  /**
   * The metadata key-value pairs assigned to the device. This metadata is not interpreted or
   * indexed by Cloud IoT Core. It can be used to add contextual information for the device.
   *
   * Keys must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length.
   *
   * Values are free-form strings. Each value must be less than or equal to 32 KB in size.
   *
   * The total size of all keys and values must be less than 256 KB, and the maximum number of key-
   * value pairs is 500.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * The resource path name. For example, `projects/p1/locations/us-
   * central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-
   * central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from
   * the service, it always ends in the device numeric ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output only] A server-defined unique numeric ID for the device. This is a more compact way to
   * identify devices, and it is globally unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger numId;

  /**
   * [Output only] The state most recently received from the device. If no state has been reported,
   * this field is not present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceState state;

  /**
   * If a device is blocked, connections or requests from this device will fail. Can be used to
   * temporarily prevent the device from connecting if, for example, the sensor is generating bad
   * data and needs maintenance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBlocked() {
    return blocked;
  }

  /**
   * If a device is blocked, connections or requests from this device will fail. Can be used to
   * temporarily prevent the device from connecting if, for example, the sensor is generating bad
   * data and needs maintenance.
   * @param blocked blocked or {@code null} for none
   */
  public Device setBlocked(java.lang.Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * The most recent device configuration, which is eventually sent from Cloud IoT Core to the
   * device. If not present on creation, the configuration will be initialized with an empty payload
   * and version value of `1`. To update this field after creation, use the
   * `DeviceManager.ModifyCloudToDeviceConfig` method.
   * @return value or {@code null} for none
   */
  public DeviceConfig getConfig() {
    return config;
  }

  /**
   * The most recent device configuration, which is eventually sent from Cloud IoT Core to the
   * device. If not present on creation, the configuration will be initialized with an empty payload
   * and version value of `1`. To update this field after creation, use the
   * `DeviceManager.ModifyCloudToDeviceConfig` method.
   * @param config config or {@code null} for none
   */
  public Device setConfig(DeviceConfig config) {
    this.config = config;
    return this;
  }

  /**
   * The credentials used to authenticate this device. To allow credential rotation without
   * interruption, multiple device credentials can be bound to this device. No more than 3
   * credentials can be bound to a single device at a time. When new credentials are added to a
   * device, they are verified against the registry credentials. For details, see the description of
   * the `DeviceRegistry.credentials` field.
   * @return value or {@code null} for none
   */
  public java.util.List<DeviceCredential> getCredentials() {
    return credentials;
  }

  /**
   * The credentials used to authenticate this device. To allow credential rotation without
   * interruption, multiple device credentials can be bound to this device. No more than 3
   * credentials can be bound to a single device at a time. When new credentials are added to a
   * device, they are verified against the registry credentials. For details, see the description of
   * the `DeviceRegistry.credentials` field.
   * @param credentials credentials or {@code null} for none
   */
  public Device setCredentials(java.util.List<DeviceCredential> credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * The user-defined device identifier. The device ID must be unique within a device registry.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The user-defined device identifier. The device ID must be unique within a device registry.
   * @param id id or {@code null} for none
   */
  public Device setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * [Output only] The last time a cloud-to-device config version acknowledgment was received from
   * the device. This field is only for configurations sent through MQTT.
   * @return value or {@code null} for none
   */
  public String getLastConfigAckTime() {
    return lastConfigAckTime;
  }

  /**
   * [Output only] The last time a cloud-to-device config version acknowledgment was received from
   * the device. This field is only for configurations sent through MQTT.
   * @param lastConfigAckTime lastConfigAckTime or {@code null} for none
   */
  public Device setLastConfigAckTime(String lastConfigAckTime) {
    this.lastConfigAckTime = lastConfigAckTime;
    return this;
  }

  /**
   * [Output only] The last time a cloud-to-device config version was sent to the device.
   * @return value or {@code null} for none
   */
  public String getLastConfigSendTime() {
    return lastConfigSendTime;
  }

  /**
   * [Output only] The last time a cloud-to-device config version was sent to the device.
   * @param lastConfigSendTime lastConfigSendTime or {@code null} for none
   */
  public Device setLastConfigSendTime(String lastConfigSendTime) {
    this.lastConfigSendTime = lastConfigSendTime;
    return this;
  }

  /**
   * [Output only] The error message of the most recent error, such as a failure to publish to Cloud
   * Pub/Sub. 'last_error_time' is the timestamp of this field. If no errors have occurred, this
   * field has an empty message and the status code 0 == OK. Otherwise, this field is expected to
   * have a status code other than OK.
   * @return value or {@code null} for none
   */
  public Status getLastErrorStatus() {
    return lastErrorStatus;
  }

  /**
   * [Output only] The error message of the most recent error, such as a failure to publish to Cloud
   * Pub/Sub. 'last_error_time' is the timestamp of this field. If no errors have occurred, this
   * field has an empty message and the status code 0 == OK. Otherwise, this field is expected to
   * have a status code other than OK.
   * @param lastErrorStatus lastErrorStatus or {@code null} for none
   */
  public Device setLastErrorStatus(Status lastErrorStatus) {
    this.lastErrorStatus = lastErrorStatus;
    return this;
  }

  /**
   * [Output only] The time the most recent error occurred, such as a failure to publish to Cloud
   * Pub/Sub. This field is the timestamp of 'last_error_status'.
   * @return value or {@code null} for none
   */
  public String getLastErrorTime() {
    return lastErrorTime;
  }

  /**
   * [Output only] The time the most recent error occurred, such as a failure to publish to Cloud
   * Pub/Sub. This field is the timestamp of 'last_error_status'.
   * @param lastErrorTime lastErrorTime or {@code null} for none
   */
  public Device setLastErrorTime(String lastErrorTime) {
    this.lastErrorTime = lastErrorTime;
    return this;
  }

  /**
   * [Output only] The last time a telemetry event was received. Timestamps are periodically
   * collected and written to storage; they may be stale by a few minutes.
   * @return value or {@code null} for none
   */
  public String getLastEventTime() {
    return lastEventTime;
  }

  /**
   * [Output only] The last time a telemetry event was received. Timestamps are periodically
   * collected and written to storage; they may be stale by a few minutes.
   * @param lastEventTime lastEventTime or {@code null} for none
   */
  public Device setLastEventTime(String lastEventTime) {
    this.lastEventTime = lastEventTime;
    return this;
  }

  /**
   * [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to devices
   * connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the connection is
   * idle, and no other messages have been sent. Timestamps are periodically collected and written
   * to storage; they may be stale by a few minutes.
   * @return value or {@code null} for none
   */
  public String getLastHeartbeatTime() {
    return lastHeartbeatTime;
  }

  /**
   * [Output only] The last time an MQTT `PINGREQ` was received. This field applies only to devices
   * connecting through MQTT. MQTT clients usually only send `PINGREQ` messages if the connection is
   * idle, and no other messages have been sent. Timestamps are periodically collected and written
   * to storage; they may be stale by a few minutes.
   * @param lastHeartbeatTime lastHeartbeatTime or {@code null} for none
   */
  public Device setLastHeartbeatTime(String lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
    return this;
  }

  /**
   * [Output only] The last time a state event was received. Timestamps are periodically collected
   * and written to storage; they may be stale by a few minutes.
   * @return value or {@code null} for none
   */
  public String getLastStateTime() {
    return lastStateTime;
  }

  /**
   * [Output only] The last time a state event was received. Timestamps are periodically collected
   * and written to storage; they may be stale by a few minutes.
   * @param lastStateTime lastStateTime or {@code null} for none
   */
  public Device setLastStateTime(String lastStateTime) {
    this.lastStateTime = lastStateTime;
    return this;
  }

  /**
   * The metadata key-value pairs assigned to the device. This metadata is not interpreted or
   * indexed by Cloud IoT Core. It can be used to add contextual information for the device.
   *
   * Keys must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length.
   *
   * Values are free-form strings. Each value must be less than or equal to 32 KB in size.
   *
   * The total size of all keys and values must be less than 256 KB, and the maximum number of key-
   * value pairs is 500.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * The metadata key-value pairs assigned to the device. This metadata is not interpreted or
   * indexed by Cloud IoT Core. It can be used to add contextual information for the device.
   *
   * Keys must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length.
   *
   * Values are free-form strings. Each value must be less than or equal to 32 KB in size.
   *
   * The total size of all keys and values must be less than 256 KB, and the maximum number of key-
   * value pairs is 500.
   * @param metadata metadata or {@code null} for none
   */
  public Device setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The resource path name. For example, `projects/p1/locations/us-
   * central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-
   * central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from
   * the service, it always ends in the device numeric ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource path name. For example, `projects/p1/locations/us-
   * central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-
   * central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from
   * the service, it always ends in the device numeric ID.
   * @param name name or {@code null} for none
   */
  public Device setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output only] A server-defined unique numeric ID for the device. This is a more compact way to
   * identify devices, and it is globally unique.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getNumId() {
    return numId;
  }

  /**
   * [Output only] A server-defined unique numeric ID for the device. This is a more compact way to
   * identify devices, and it is globally unique.
   * @param numId numId or {@code null} for none
   */
  public Device setNumId(java.math.BigInteger numId) {
    this.numId = numId;
    return this;
  }

  /**
   * [Output only] The state most recently received from the device. If no state has been reported,
   * this field is not present.
   * @return value or {@code null} for none
   */
  public DeviceState getState() {
    return state;
  }

  /**
   * [Output only] The state most recently received from the device. If no state has been reported,
   * this field is not present.
   * @param state state or {@code null} for none
   */
  public Device setState(DeviceState state) {
    this.state = state;
    return this;
  }

  @Override
  public Device set(String fieldName, Object value) {
    return (Device) super.set(fieldName, value);
  }

  @Override
  public Device clone() {
    return (Device) super.clone();
  }

}
