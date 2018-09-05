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

package com.google.androidmanagement.v1.model;

/**
 * Configuration for an always-on VPN connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AlwaysOnVpnPackage extends com.google.api.client.json.GenericJson {

  /**
   * Disallows networking when the VPN is not connected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean lockdownEnabled;

  /**
   * The package name of the VPN app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Disallows networking when the VPN is not connected.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLockdownEnabled() {
    return lockdownEnabled;
  }

  /**
   * Disallows networking when the VPN is not connected.
   * @param lockdownEnabled lockdownEnabled or {@code null} for none
   */
  public AlwaysOnVpnPackage setLockdownEnabled(java.lang.Boolean lockdownEnabled) {
    this.lockdownEnabled = lockdownEnabled;
    return this;
  }

  /**
   * The package name of the VPN app.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * The package name of the VPN app.
   * @param packageName packageName or {@code null} for none
   */
  public AlwaysOnVpnPackage setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  @Override
  public AlwaysOnVpnPackage set(String fieldName, Object value) {
    return (AlwaysOnVpnPackage) super.set(fieldName, value);
  }

  @Override
  public AlwaysOnVpnPackage clone() {
    return (AlwaysOnVpnPackage) super.clone();
  }

}
