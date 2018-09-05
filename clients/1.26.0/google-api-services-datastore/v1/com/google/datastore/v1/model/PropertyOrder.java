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

package com.google.datastore.v1.model;

/**
 * The desired order for a specific property.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PropertyOrder extends com.google.api.client.json.GenericJson {

  /**
   * The direction to order by. Defaults to `ASCENDING`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * The property to order by.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PropertyReference property;

  /**
   * The direction to order by. Defaults to `ASCENDING`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * The direction to order by. Defaults to `ASCENDING`.
   * @param direction direction or {@code null} for none
   */
  public PropertyOrder setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * The property to order by.
   * @return value or {@code null} for none
   */
  public PropertyReference getProperty() {
    return property;
  }

  /**
   * The property to order by.
   * @param property property or {@code null} for none
   */
  public PropertyOrder setProperty(PropertyReference property) {
    this.property = property;
    return this;
  }

  @Override
  public PropertyOrder set(String fieldName, Object value) {
    return (PropertyOrder) super.set(fieldName, value);
  }

  @Override
  public PropertyOrder clone() {
    return (PropertyOrder) super.clone();
  }

}
