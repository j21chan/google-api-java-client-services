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

package com.google.cloudiot.v1beta1.model;

/**
 * The device configuration and its metadata. Eventually delivered to devices.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud IoT API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceConfig extends com.google.api.client.json.GenericJson {

  /**
   * [Output only] The time when this version state was updated in the Cloud IoT Core service. This
   * timestamp is set by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cloudUpdateTime;

  /**
   * The device configuration data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceConfigData data;

  /**
   * [Output only] The time when the Cloud IoT Core server received the acknowledgment from the
   * device, indicating that the device has received this configuration version. If this field is
   * not present, the device has not yet acknowledged that it received this version. Note that when
   * sending the config to the device, there may have been many config versions on the Cloud IoT
   * Core service while the device was disconnected; and on connection, only the latest version is
   * sent to the device. Some of the versions may never be sent to the device, and therefore are
   * never acknowledged. This timestamp is set by the Cloud IoT Core service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deviceAckTime;

  /**
   * [Output only] The version of this update. The version number is assigned by the server, and is
   * always greater than zero after device creation. The version must be zero on the `CreateDevice`
   * request if a `config` is specified; the response of `CreateDevice` will always have a value of
   * one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long version;

  /**
   * [Output only] The time when this version state was updated in the Cloud IoT Core service. This
   * timestamp is set by the server.
   * @return value or {@code null} for none
   */
  public String getCloudUpdateTime() {
    return cloudUpdateTime;
  }

  /**
   * [Output only] The time when this version state was updated in the Cloud IoT Core service. This
   * timestamp is set by the server.
   * @param cloudUpdateTime cloudUpdateTime or {@code null} for none
   */
  public DeviceConfig setCloudUpdateTime(String cloudUpdateTime) {
    this.cloudUpdateTime = cloudUpdateTime;
    return this;
  }

  /**
   * The device configuration data.
   * @return value or {@code null} for none
   */
  public DeviceConfigData getData() {
    return data;
  }

  /**
   * The device configuration data.
   * @param data data or {@code null} for none
   */
  public DeviceConfig setData(DeviceConfigData data) {
    this.data = data;
    return this;
  }

  /**
   * [Output only] The time when the Cloud IoT Core server received the acknowledgment from the
   * device, indicating that the device has received this configuration version. If this field is
   * not present, the device has not yet acknowledged that it received this version. Note that when
   * sending the config to the device, there may have been many config versions on the Cloud IoT
   * Core service while the device was disconnected; and on connection, only the latest version is
   * sent to the device. Some of the versions may never be sent to the device, and therefore are
   * never acknowledged. This timestamp is set by the Cloud IoT Core service.
   * @return value or {@code null} for none
   */
  public String getDeviceAckTime() {
    return deviceAckTime;
  }

  /**
   * [Output only] The time when the Cloud IoT Core server received the acknowledgment from the
   * device, indicating that the device has received this configuration version. If this field is
   * not present, the device has not yet acknowledged that it received this version. Note that when
   * sending the config to the device, there may have been many config versions on the Cloud IoT
   * Core service while the device was disconnected; and on connection, only the latest version is
   * sent to the device. Some of the versions may never be sent to the device, and therefore are
   * never acknowledged. This timestamp is set by the Cloud IoT Core service.
   * @param deviceAckTime deviceAckTime or {@code null} for none
   */
  public DeviceConfig setDeviceAckTime(String deviceAckTime) {
    this.deviceAckTime = deviceAckTime;
    return this;
  }

  /**
   * [Output only] The version of this update. The version number is assigned by the server, and is
   * always greater than zero after device creation. The version must be zero on the `CreateDevice`
   * request if a `config` is specified; the response of `CreateDevice` will always have a value of
   * one.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersion() {
    return version;
  }

  /**
   * [Output only] The version of this update. The version number is assigned by the server, and is
   * always greater than zero after device creation. The version must be zero on the `CreateDevice`
   * request if a `config` is specified; the response of `CreateDevice` will always have a value of
   * one.
   * @param version version or {@code null} for none
   */
  public DeviceConfig setVersion(java.lang.Long version) {
    this.version = version;
    return this;
  }

  @Override
  public DeviceConfig set(String fieldName, Object value) {
    return (DeviceConfig) super.set(fieldName, value);
  }

  @Override
  public DeviceConfig clone() {
    return (DeviceConfig) super.clone();
  }

}
