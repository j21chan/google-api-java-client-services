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

package com.google.fitness.model;

/**
 * Representation of an integrated device (such as a phone or a wearable) that can hold sensors.
 * Each sensor is exposed as a data source.
 *
 * The main purpose of the device information contained in this class is to identify the hardware of
 * a particular data source. This can be useful in different ways, including:   - Distinguishing two
 * similar sensors on different devices (the step counter on two nexus 5 phones, for instance) -
 * Display the source of data to the user (by using the device make / model) - Treat data
 * differently depending on sensor type (accelerometers on a watch may give different patterns than
 * those on a phone) - Build different analysis models for each device/version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Device extends com.google.api.client.json.GenericJson {

  /**
   * Manufacturer of the product/hardware.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manufacturer;

  /**
   * End-user visible model name for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * A constant representing the type of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The serial number or other unique ID for the hardware. This field is obfuscated when read by
   * any REST or Android client that did not create the data source. Only the data source creator
   * will see the uid field in clear and normal form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Version string for the device hardware/software.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Manufacturer of the product/hardware.
   * @return value or {@code null} for none
   */
  public java.lang.String getManufacturer() {
    return manufacturer;
  }

  /**
   * Manufacturer of the product/hardware.
   * @param manufacturer manufacturer or {@code null} for none
   */
  public Device setManufacturer(java.lang.String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * End-user visible model name for the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * End-user visible model name for the device.
   * @param model model or {@code null} for none
   */
  public Device setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * A constant representing the type of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * A constant representing the type of the device.
   * @param type type or {@code null} for none
   */
  public Device setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The serial number or other unique ID for the hardware. This field is obfuscated when read by
   * any REST or Android client that did not create the data source. Only the data source creator
   * will see the uid field in clear and normal form.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * The serial number or other unique ID for the hardware. This field is obfuscated when read by
   * any REST or Android client that did not create the data source. Only the data source creator
   * will see the uid field in clear and normal form.
   * @param uid uid or {@code null} for none
   */
  public Device setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Version string for the device hardware/software.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Version string for the device hardware/software.
   * @param version version or {@code null} for none
   */
  public Device setVersion(java.lang.String version) {
    this.version = version;
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
