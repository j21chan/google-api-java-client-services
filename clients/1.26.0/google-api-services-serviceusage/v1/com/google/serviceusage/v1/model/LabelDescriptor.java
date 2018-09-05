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

package com.google.serviceusage.v1.model;

/**
 * A description of a label.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LabelDescriptor extends com.google.api.client.json.GenericJson {

  /**
   * A human-readable description for the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The label key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The type of data that can be assigned to the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * A human-readable description for the label.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A human-readable description for the label.
   * @param description description or {@code null} for none
   */
  public LabelDescriptor setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The label key.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The label key.
   * @param key key or {@code null} for none
   */
  public LabelDescriptor setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * The type of data that can be assigned to the label.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * The type of data that can be assigned to the label.
   * @param valueType valueType or {@code null} for none
   */
  public LabelDescriptor setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public LabelDescriptor set(String fieldName, Object value) {
    return (LabelDescriptor) super.set(fieldName, value);
  }

  @Override
  public LabelDescriptor clone() {
    return (LabelDescriptor) super.clone();
  }

}
