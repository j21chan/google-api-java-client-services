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
 * A managed property of a managed configuration. The property must match one of the properties in
 * the app restrictions schema of the product. Exactly one of the value fields must be populated,
 * and it must match the property's type in the app restrictions schema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedProperty extends com.google.api.client.json.GenericJson {

  /**
   * The unique key that identifies the property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The boolean value - this will only be present if type of the property is bool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean valueBool;

  /**
   * The bundle of managed properties - this will only be present if type of the property is bundle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedPropertyBundle valueBundle;

  /**
   * The list of bundles of properties - this will only be present if type of the property is
   * bundle_array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ManagedPropertyBundle> valueBundleArray;

  /**
   * The integer value - this will only be present if type of the property is integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer valueInteger;

  /**
   * The string value - this will only be present if type of the property is string, choice or
   * hidden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueString;

  /**
   * The list of string values - this will only be present if type of the property is multiselect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> valueStringArray;

  /**
   * The unique key that identifies the property.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The unique key that identifies the property.
   * @param key key or {@code null} for none
   */
  public ManagedProperty setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The boolean value - this will only be present if type of the property is bool.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getValueBool() {
    return valueBool;
  }

  /**
   * The boolean value - this will only be present if type of the property is bool.
   * @param valueBool valueBool or {@code null} for none
   */
  public ManagedProperty setValueBool(java.lang.Boolean valueBool) {
    this.valueBool = valueBool;
    return this;
  }

  /**
   * The bundle of managed properties - this will only be present if type of the property is bundle.
   * @return value or {@code null} for none
   */
  public ManagedPropertyBundle getValueBundle() {
    return valueBundle;
  }

  /**
   * The bundle of managed properties - this will only be present if type of the property is bundle.
   * @param valueBundle valueBundle or {@code null} for none
   */
  public ManagedProperty setValueBundle(ManagedPropertyBundle valueBundle) {
    this.valueBundle = valueBundle;
    return this;
  }

  /**
   * The list of bundles of properties - this will only be present if type of the property is
   * bundle_array.
   * @return value or {@code null} for none
   */
  public java.util.List<ManagedPropertyBundle> getValueBundleArray() {
    return valueBundleArray;
  }

  /**
   * The list of bundles of properties - this will only be present if type of the property is
   * bundle_array.
   * @param valueBundleArray valueBundleArray or {@code null} for none
   */
  public ManagedProperty setValueBundleArray(java.util.List<ManagedPropertyBundle> valueBundleArray) {
    this.valueBundleArray = valueBundleArray;
    return this;
  }

  /**
   * The integer value - this will only be present if type of the property is integer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getValueInteger() {
    return valueInteger;
  }

  /**
   * The integer value - this will only be present if type of the property is integer.
   * @param valueInteger valueInteger or {@code null} for none
   */
  public ManagedProperty setValueInteger(java.lang.Integer valueInteger) {
    this.valueInteger = valueInteger;
    return this;
  }

  /**
   * The string value - this will only be present if type of the property is string, choice or
   * hidden.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueString() {
    return valueString;
  }

  /**
   * The string value - this will only be present if type of the property is string, choice or
   * hidden.
   * @param valueString valueString or {@code null} for none
   */
  public ManagedProperty setValueString(java.lang.String valueString) {
    this.valueString = valueString;
    return this;
  }

  /**
   * The list of string values - this will only be present if type of the property is multiselect.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValueStringArray() {
    return valueStringArray;
  }

  /**
   * The list of string values - this will only be present if type of the property is multiselect.
   * @param valueStringArray valueStringArray or {@code null} for none
   */
  public ManagedProperty setValueStringArray(java.util.List<java.lang.String> valueStringArray) {
    this.valueStringArray = valueStringArray;
    return this;
  }

  @Override
  public ManagedProperty set(String fieldName, Object value) {
    return (ManagedProperty) super.set(fieldName, value);
  }

  @Override
  public ManagedProperty clone() {
    return (ManagedProperty) super.clone();
  }

}
