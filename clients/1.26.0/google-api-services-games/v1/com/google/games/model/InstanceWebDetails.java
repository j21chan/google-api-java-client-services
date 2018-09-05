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

package com.google.games.model;

/**
 * This is a JSON template for the Web details resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceWebDetails extends com.google.api.client.json.GenericJson {

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#instanceWebDetails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Launch URL for the game.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchUrl;

  /**
   * Indicates that this instance is the default for new installations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preferred;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#instanceWebDetails.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#instanceWebDetails.
   * @param kind kind or {@code null} for none
   */
  public InstanceWebDetails setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Launch URL for the game.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchUrl() {
    return launchUrl;
  }

  /**
   * Launch URL for the game.
   * @param launchUrl launchUrl or {@code null} for none
   */
  public InstanceWebDetails setLaunchUrl(java.lang.String launchUrl) {
    this.launchUrl = launchUrl;
    return this;
  }

  /**
   * Indicates that this instance is the default for new installations.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreferred() {
    return preferred;
  }

  /**
   * Indicates that this instance is the default for new installations.
   * @param preferred preferred or {@code null} for none
   */
  public InstanceWebDetails setPreferred(java.lang.Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  @Override
  public InstanceWebDetails set(String fieldName, Object value) {
    return (InstanceWebDetails) super.set(fieldName, value);
  }

  @Override
  public InstanceWebDetails clone() {
    return (InstanceWebDetails) super.clone();
  }

}
