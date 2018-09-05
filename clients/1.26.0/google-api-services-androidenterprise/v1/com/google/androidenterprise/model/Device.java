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

package com.google.androidenterprise.model;

/**
 * A Devices resource represents a mobile device managed by the EMM and belonging to a specific
 * enterprise user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Device extends com.google.api.client.json.GenericJson {

  /**
   * The Google Play Services Android ID for the device encoded as a lowercase hex string. For
   * example, "123456789abcdef0".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String androidId;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#device".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Identifies the extent to which the device is controlled by a managed Google Play EMM in various
   * deployment configurations.
   *
   * Possible values include:  - "managedDevice", a device that has the EMM's device policy
   * controller (DPC) as the device owner.  - "managedProfile", a device that has a profile managed
   * by the DPC (DPC is profile owner) in addition to a separate, personal profile that is
   * unavailable to the DPC.  - "containerApp", no longer used (deprecated).  - "unmanagedProfile",
   * a device that has been allowed (by the domain's admin, using the Admin Console to enable the
   * privilege) to use managed Google Play, but the profile is itself not owned by a DPC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementType;

  /**
   * The policy enforced on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Policy policy;

  /**
   * The Google Play Services Android ID for the device encoded as a lowercase hex string. For
   * example, "123456789abcdef0".
   * @return value or {@code null} for none
   */
  public java.lang.String getAndroidId() {
    return androidId;
  }

  /**
   * The Google Play Services Android ID for the device encoded as a lowercase hex string. For
   * example, "123456789abcdef0".
   * @param androidId androidId or {@code null} for none
   */
  public Device setAndroidId(java.lang.String androidId) {
    this.androidId = androidId;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#device".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "androidenterprise#device".
   * @param kind kind or {@code null} for none
   */
  public Device setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Identifies the extent to which the device is controlled by a managed Google Play EMM in various
   * deployment configurations.
   *
   * Possible values include:  - "managedDevice", a device that has the EMM's device policy
   * controller (DPC) as the device owner.  - "managedProfile", a device that has a profile managed
   * by the DPC (DPC is profile owner) in addition to a separate, personal profile that is
   * unavailable to the DPC.  - "containerApp", no longer used (deprecated).  - "unmanagedProfile",
   * a device that has been allowed (by the domain's admin, using the Admin Console to enable the
   * privilege) to use managed Google Play, but the profile is itself not owned by a DPC.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementType() {
    return managementType;
  }

  /**
   * Identifies the extent to which the device is controlled by a managed Google Play EMM in various
   * deployment configurations.
   *
   * Possible values include:  - "managedDevice", a device that has the EMM's device policy
   * controller (DPC) as the device owner.  - "managedProfile", a device that has a profile managed
   * by the DPC (DPC is profile owner) in addition to a separate, personal profile that is
   * unavailable to the DPC.  - "containerApp", no longer used (deprecated).  - "unmanagedProfile",
   * a device that has been allowed (by the domain's admin, using the Admin Console to enable the
   * privilege) to use managed Google Play, but the profile is itself not owned by a DPC.
   * @param managementType managementType or {@code null} for none
   */
  public Device setManagementType(java.lang.String managementType) {
    this.managementType = managementType;
    return this;
  }

  /**
   * The policy enforced on the device.
   * @return value or {@code null} for none
   */
  public Policy getPolicy() {
    return policy;
  }

  /**
   * The policy enforced on the device.
   * @param policy policy or {@code null} for none
   */
  public Device setPolicy(Policy policy) {
    this.policy = policy;
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
