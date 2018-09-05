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

package com.google.calendar.model;

/**
 * Model definition for ColorDefinition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Calendar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ColorDefinition extends com.google.api.client.json.GenericJson {

  /**
   * The background color associated with this color definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String background;

  /**
   * The foreground color that can be used to write on top of a background with 'background' color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String foreground;

  /**
   * The background color associated with this color definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackground() {
    return background;
  }

  /**
   * The background color associated with this color definition.
   * @param background background or {@code null} for none
   */
  public ColorDefinition setBackground(java.lang.String background) {
    this.background = background;
    return this;
  }

  /**
   * The foreground color that can be used to write on top of a background with 'background' color.
   * @return value or {@code null} for none
   */
  public java.lang.String getForeground() {
    return foreground;
  }

  /**
   * The foreground color that can be used to write on top of a background with 'background' color.
   * @param foreground foreground or {@code null} for none
   */
  public ColorDefinition setForeground(java.lang.String foreground) {
    this.foreground = foreground;
    return this;
  }

  @Override
  public ColorDefinition set(String fieldName, Object value) {
    return (ColorDefinition) super.set(fieldName, value);
  }

  @Override
  public ColorDefinition clone() {
    return (ColorDefinition) super.clone();
  }

}
