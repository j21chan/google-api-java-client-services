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
 * Holder object for the value of a single field in a data point.
 *
 * A field value has a particular format and is only ever set to one of an integer or a floating
 * point value. LINT.IfChange
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Value extends com.google.api.client.json.GenericJson {

  /**
   * Floating point value. When this is set, other values must not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double fpVal;

  /**
   * Integer value. When this is set, other values must not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer intVal;

  /**
   * Map value. The valid key space and units for the corresponding value of each entry should be
   * documented as part of the data type definition. Keys should be kept small whenever possible.
   * Data streams with large keys and high data frequency may be down sampled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ValueMapValEntry> mapVal;

  /**
   * String value. When this is set, other values must not be set. Strings should be kept small
   * whenever possible. Data streams with large string values and high data frequency may be down
   * sampled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringVal;

  /**
   * Floating point value. When this is set, other values must not be set.
   * @return value or {@code null} for none
   */
  public java.lang.Double getFpVal() {
    return fpVal;
  }

  /**
   * Floating point value. When this is set, other values must not be set.
   * @param fpVal fpVal or {@code null} for none
   */
  public Value setFpVal(java.lang.Double fpVal) {
    this.fpVal = fpVal;
    return this;
  }

  /**
   * Integer value. When this is set, other values must not be set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIntVal() {
    return intVal;
  }

  /**
   * Integer value. When this is set, other values must not be set.
   * @param intVal intVal or {@code null} for none
   */
  public Value setIntVal(java.lang.Integer intVal) {
    this.intVal = intVal;
    return this;
  }

  /**
   * Map value. The valid key space and units for the corresponding value of each entry should be
   * documented as part of the data type definition. Keys should be kept small whenever possible.
   * Data streams with large keys and high data frequency may be down sampled.
   * @return value or {@code null} for none
   */
  public java.util.List<ValueMapValEntry> getMapVal() {
    return mapVal;
  }

  /**
   * Map value. The valid key space and units for the corresponding value of each entry should be
   * documented as part of the data type definition. Keys should be kept small whenever possible.
   * Data streams with large keys and high data frequency may be down sampled.
   * @param mapVal mapVal or {@code null} for none
   */
  public Value setMapVal(java.util.List<ValueMapValEntry> mapVal) {
    this.mapVal = mapVal;
    return this;
  }

  /**
   * String value. When this is set, other values must not be set. Strings should be kept small
   * whenever possible. Data streams with large string values and high data frequency may be down
   * sampled.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringVal() {
    return stringVal;
  }

  /**
   * String value. When this is set, other values must not be set. Strings should be kept small
   * whenever possible. Data streams with large string values and high data frequency may be down
   * sampled.
   * @param stringVal stringVal or {@code null} for none
   */
  public Value setStringVal(java.lang.String stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  @Override
  public Value set(String fieldName, Object value) {
    return (Value) super.set(fieldName, value);
  }

  @Override
  public Value clone() {
    return (Value) super.clone();
  }

}
