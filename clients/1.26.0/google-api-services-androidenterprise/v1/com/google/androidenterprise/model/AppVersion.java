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
 * This represents a single version of the app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppVersion extends com.google.api.client.json.GenericJson {

  /**
   * The track that this app was published in. For example if track is "alpha", this is an alpha
   * version of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String track;

  /**
   * Unique increasing identifier for the app version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer versionCode;

  /**
   * The string used in the Play store by the app developer to identify the version. The string is
   * not necessarily unique or localized (for example, the string could be "1.4").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String versionString;

  /**
   * The track that this app was published in. For example if track is "alpha", this is an alpha
   * version of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrack() {
    return track;
  }

  /**
   * The track that this app was published in. For example if track is "alpha", this is an alpha
   * version of the app.
   * @param track track or {@code null} for none
   */
  public AppVersion setTrack(java.lang.String track) {
    this.track = track;
    return this;
  }

  /**
   * Unique increasing identifier for the app version.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersionCode() {
    return versionCode;
  }

  /**
   * Unique increasing identifier for the app version.
   * @param versionCode versionCode or {@code null} for none
   */
  public AppVersion setVersionCode(java.lang.Integer versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * The string used in the Play store by the app developer to identify the version. The string is
   * not necessarily unique or localized (for example, the string could be "1.4").
   * @return value or {@code null} for none
   */
  public java.lang.String getVersionString() {
    return versionString;
  }

  /**
   * The string used in the Play store by the app developer to identify the version. The string is
   * not necessarily unique or localized (for example, the string could be "1.4").
   * @param versionString versionString or {@code null} for none
   */
  public AppVersion setVersionString(java.lang.String versionString) {
    this.versionString = versionString;
    return this;
  }

  @Override
  public AppVersion set(String fieldName, Object value) {
    return (AppVersion) super.set(fieldName, value);
  }

  @Override
  public AppVersion clone() {
    return (AppVersion) super.clone();
  }

}
