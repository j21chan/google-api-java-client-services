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

package com.google.manufacturers.v1.model;

/**
 * The number of products in a single package. For more information, see
 * https://support.google.com/manufacturers/answer/6124116#count.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Manufacturer Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Count extends com.google.api.client.json.GenericJson {

  /**
   * The unit in which these products are counted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The numeric value of the number of products in a package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long value;

  /**
   * The unit in which these products are counted.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The unit in which these products are counted.
   * @param unit unit or {@code null} for none
   */
  public Count setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * The numeric value of the number of products in a package.
   * @return value or {@code null} for none
   */
  public java.lang.Long getValue() {
    return value;
  }

  /**
   * The numeric value of the number of products in a package.
   * @param value value or {@code null} for none
   */
  public Count setValue(java.lang.Long value) {
    this.value = value;
    return this;
  }

  @Override
  public Count set(String fieldName, Object value) {
    return (Count) super.set(fieldName, value);
  }

  @Override
  public Count clone() {
    return (Count) super.clone();
  }

}
