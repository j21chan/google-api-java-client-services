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

package com.google.drive.model;

/**
 * Model definition for StartPageToken.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StartPageToken extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The starting page token for listing changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startPageToken;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken".
   * @param kind kind or {@code null} for none
   */
  public StartPageToken setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The starting page token for listing changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartPageToken() {
    return startPageToken;
  }

  /**
   * The starting page token for listing changes.
   * @param startPageToken startPageToken or {@code null} for none
   */
  public StartPageToken setStartPageToken(java.lang.String startPageToken) {
    this.startPageToken = startPageToken;
    return this;
  }

  @Override
  public StartPageToken set(String fieldName, Object value) {
    return (StartPageToken) super.set(fieldName, value);
  }

  @Override
  public StartPageToken clone() {
    return (StartPageToken) super.clone();
  }

}
