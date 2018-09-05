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

package com.google.dfareporting.model;

/**
 * Contains information about a browser that can be targeted by ads.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Browser extends com.google.api.client.json.GenericJson {

  /**
   * ID referring to this grouping of browser and version numbers. This is the ID used for
   * targeting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long browserVersionId;

  /**
   * DART ID of this browser. This is the ID used when generating reports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dartId;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#browser".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Major version number (leftmost number) of this browser. For example, for Chrome 5.0.376.86
   * beta, this field should be set to 5. An asterisk (*) may be used to target any version number,
   * and a question mark (?) may be used to target cases where the version number cannot be
   * identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so on.
   * Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad server
   * knows the browser is Firefox but can't tell which version it is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String majorVersion;

  /**
   * Minor version number (number after first dot on left) of this browser. For example, for Chrome
   * 5.0.375.86 beta, this field should be set to 0. An asterisk (*) may be used to target any
   * version number, and a question mark (?) may be used to target cases where the version number
   * cannot be identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and
   * so on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad
   * server knows the browser is Firefox but can't tell which version it is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minorVersion;

  /**
   * Name of this browser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * ID referring to this grouping of browser and version numbers. This is the ID used for
   * targeting.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBrowserVersionId() {
    return browserVersionId;
  }

  /**
   * ID referring to this grouping of browser and version numbers. This is the ID used for
   * targeting.
   * @param browserVersionId browserVersionId or {@code null} for none
   */
  public Browser setBrowserVersionId(java.lang.Long browserVersionId) {
    this.browserVersionId = browserVersionId;
    return this;
  }

  /**
   * DART ID of this browser. This is the ID used when generating reports.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDartId() {
    return dartId;
  }

  /**
   * DART ID of this browser. This is the ID used when generating reports.
   * @param dartId dartId or {@code null} for none
   */
  public Browser setDartId(java.lang.Long dartId) {
    this.dartId = dartId;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#browser".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#browser".
   * @param kind kind or {@code null} for none
   */
  public Browser setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Major version number (leftmost number) of this browser. For example, for Chrome 5.0.376.86
   * beta, this field should be set to 5. An asterisk (*) may be used to target any version number,
   * and a question mark (?) may be used to target cases where the version number cannot be
   * identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so on.
   * Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad server
   * knows the browser is Firefox but can't tell which version it is.
   * @return value or {@code null} for none
   */
  public java.lang.String getMajorVersion() {
    return majorVersion;
  }

  /**
   * Major version number (leftmost number) of this browser. For example, for Chrome 5.0.376.86
   * beta, this field should be set to 5. An asterisk (*) may be used to target any version number,
   * and a question mark (?) may be used to target cases where the version number cannot be
   * identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so on.
   * Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad server
   * knows the browser is Firefox but can't tell which version it is.
   * @param majorVersion majorVersion or {@code null} for none
   */
  public Browser setMajorVersion(java.lang.String majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

  /**
   * Minor version number (number after first dot on left) of this browser. For example, for Chrome
   * 5.0.375.86 beta, this field should be set to 0. An asterisk (*) may be used to target any
   * version number, and a question mark (?) may be used to target cases where the version number
   * cannot be identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and
   * so on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad
   * server knows the browser is Firefox but can't tell which version it is.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinorVersion() {
    return minorVersion;
  }

  /**
   * Minor version number (number after first dot on left) of this browser. For example, for Chrome
   * 5.0.375.86 beta, this field should be set to 0. An asterisk (*) may be used to target any
   * version number, and a question mark (?) may be used to target cases where the version number
   * cannot be identified. For example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and
   * so on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets cases where the ad
   * server knows the browser is Firefox but can't tell which version it is.
   * @param minorVersion minorVersion or {@code null} for none
   */
  public Browser setMinorVersion(java.lang.String minorVersion) {
    this.minorVersion = minorVersion;
    return this;
  }

  /**
   * Name of this browser.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this browser.
   * @param name name or {@code null} for none
   */
  public Browser setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Browser set(String fieldName, Object value) {
    return (Browser) super.set(fieldName, value);
  }

  @Override
  public Browser clone() {
    return (Browser) super.clone();
  }

}
