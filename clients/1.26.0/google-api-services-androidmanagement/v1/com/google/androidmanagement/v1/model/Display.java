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
 * Device display information.
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
public final class Display extends com.google.api.client.json.GenericJson {

  /**
   * Display density expressed as dots-per-inch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer density;

  /**
   * Unique display id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer displayId;

  /**
   * Display height in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * Name of the display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Refresh rate of the display in frames per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer refreshRate;

  /**
   * State of the display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Display width in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * Display density expressed as dots-per-inch.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDensity() {
    return density;
  }

  /**
   * Display density expressed as dots-per-inch.
   * @param density density or {@code null} for none
   */
  public Display setDensity(java.lang.Integer density) {
    this.density = density;
    return this;
  }

  /**
   * Unique display id.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDisplayId() {
    return displayId;
  }

  /**
   * Unique display id.
   * @param displayId displayId or {@code null} for none
   */
  public Display setDisplayId(java.lang.Integer displayId) {
    this.displayId = displayId;
    return this;
  }

  /**
   * Display height in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Display height in pixels.
   * @param height height or {@code null} for none
   */
  public Display setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Name of the display.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the display.
   * @param name name or {@code null} for none
   */
  public Display setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Refresh rate of the display in frames per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRefreshRate() {
    return refreshRate;
  }

  /**
   * Refresh rate of the display in frames per second.
   * @param refreshRate refreshRate or {@code null} for none
   */
  public Display setRefreshRate(java.lang.Integer refreshRate) {
    this.refreshRate = refreshRate;
    return this;
  }

  /**
   * State of the display.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the display.
   * @param state state or {@code null} for none
   */
  public Display setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Display width in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Display width in pixels.
   * @param width width or {@code null} for none
   */
  public Display setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Display set(String fieldName, Object value) {
    return (Display) super.set(fieldName, value);
  }

  @Override
  public Display clone() {
    return (Display) super.clone();
  }

}
