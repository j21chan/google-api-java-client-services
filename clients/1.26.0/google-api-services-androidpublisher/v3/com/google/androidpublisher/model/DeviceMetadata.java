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

package com.google.androidpublisher.model;

/**
 * Model definition for DeviceMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Device CPU make e.g. "Qualcomm"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpuMake;

  /**
   * Device CPU model e.g. "MSM8974"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpuModel;

  /**
   * Device class (e.g. tablet)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceClass;

  /**
   * OpenGL version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer glEsVersion;

  /**
   * Device manufacturer (e.g. Motorola)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manufacturer;

  /**
   * Comma separated list of native platforms (e.g. "arm", "arm7")
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nativePlatform;

  /**
   * Device model name (e.g. Droid)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productName;

  /**
   * Device RAM in Megabytes e.g. "2048"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ramMb;

  /**
   * Screen density in DPI
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer screenDensityDpi;

  /**
   * Screen height in pixels
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer screenHeightPx;

  /**
   * Screen width in pixels
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer screenWidthPx;

  /**
   * Device CPU make e.g. "Qualcomm"
   * @return value or {@code null} for none
   */
  public java.lang.String getCpuMake() {
    return cpuMake;
  }

  /**
   * Device CPU make e.g. "Qualcomm"
   * @param cpuMake cpuMake or {@code null} for none
   */
  public DeviceMetadata setCpuMake(java.lang.String cpuMake) {
    this.cpuMake = cpuMake;
    return this;
  }

  /**
   * Device CPU model e.g. "MSM8974"
   * @return value or {@code null} for none
   */
  public java.lang.String getCpuModel() {
    return cpuModel;
  }

  /**
   * Device CPU model e.g. "MSM8974"
   * @param cpuModel cpuModel or {@code null} for none
   */
  public DeviceMetadata setCpuModel(java.lang.String cpuModel) {
    this.cpuModel = cpuModel;
    return this;
  }

  /**
   * Device class (e.g. tablet)
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceClass() {
    return deviceClass;
  }

  /**
   * Device class (e.g. tablet)
   * @param deviceClass deviceClass or {@code null} for none
   */
  public DeviceMetadata setDeviceClass(java.lang.String deviceClass) {
    this.deviceClass = deviceClass;
    return this;
  }

  /**
   * OpenGL version
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGlEsVersion() {
    return glEsVersion;
  }

  /**
   * OpenGL version
   * @param glEsVersion glEsVersion or {@code null} for none
   */
  public DeviceMetadata setGlEsVersion(java.lang.Integer glEsVersion) {
    this.glEsVersion = glEsVersion;
    return this;
  }

  /**
   * Device manufacturer (e.g. Motorola)
   * @return value or {@code null} for none
   */
  public java.lang.String getManufacturer() {
    return manufacturer;
  }

  /**
   * Device manufacturer (e.g. Motorola)
   * @param manufacturer manufacturer or {@code null} for none
   */
  public DeviceMetadata setManufacturer(java.lang.String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Comma separated list of native platforms (e.g. "arm", "arm7")
   * @return value or {@code null} for none
   */
  public java.lang.String getNativePlatform() {
    return nativePlatform;
  }

  /**
   * Comma separated list of native platforms (e.g. "arm", "arm7")
   * @param nativePlatform nativePlatform or {@code null} for none
   */
  public DeviceMetadata setNativePlatform(java.lang.String nativePlatform) {
    this.nativePlatform = nativePlatform;
    return this;
  }

  /**
   * Device model name (e.g. Droid)
   * @return value or {@code null} for none
   */
  public java.lang.String getProductName() {
    return productName;
  }

  /**
   * Device model name (e.g. Droid)
   * @param productName productName or {@code null} for none
   */
  public DeviceMetadata setProductName(java.lang.String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Device RAM in Megabytes e.g. "2048"
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRamMb() {
    return ramMb;
  }

  /**
   * Device RAM in Megabytes e.g. "2048"
   * @param ramMb ramMb or {@code null} for none
   */
  public DeviceMetadata setRamMb(java.lang.Integer ramMb) {
    this.ramMb = ramMb;
    return this;
  }

  /**
   * Screen density in DPI
   * @return value or {@code null} for none
   */
  public java.lang.Integer getScreenDensityDpi() {
    return screenDensityDpi;
  }

  /**
   * Screen density in DPI
   * @param screenDensityDpi screenDensityDpi or {@code null} for none
   */
  public DeviceMetadata setScreenDensityDpi(java.lang.Integer screenDensityDpi) {
    this.screenDensityDpi = screenDensityDpi;
    return this;
  }

  /**
   * Screen height in pixels
   * @return value or {@code null} for none
   */
  public java.lang.Integer getScreenHeightPx() {
    return screenHeightPx;
  }

  /**
   * Screen height in pixels
   * @param screenHeightPx screenHeightPx or {@code null} for none
   */
  public DeviceMetadata setScreenHeightPx(java.lang.Integer screenHeightPx) {
    this.screenHeightPx = screenHeightPx;
    return this;
  }

  /**
   * Screen width in pixels
   * @return value or {@code null} for none
   */
  public java.lang.Integer getScreenWidthPx() {
    return screenWidthPx;
  }

  /**
   * Screen width in pixels
   * @param screenWidthPx screenWidthPx or {@code null} for none
   */
  public DeviceMetadata setScreenWidthPx(java.lang.Integer screenWidthPx) {
    this.screenWidthPx = screenWidthPx;
    return this;
  }

  @Override
  public DeviceMetadata set(String fieldName, Object value) {
    return (DeviceMetadata) super.set(fieldName, value);
  }

  @Override
  public DeviceMetadata clone() {
    return (DeviceMetadata) super.clone();
  }

}
