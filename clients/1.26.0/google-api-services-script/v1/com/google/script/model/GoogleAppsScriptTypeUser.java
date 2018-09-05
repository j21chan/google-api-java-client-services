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

package com.google.script.model;

/**
 * A simple user profile resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsScriptTypeUser extends com.google.api.client.json.GenericJson {

  /**
   * The user's domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * The user's identifying email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The user's display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The user's photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoUrl;

  /**
   * The user's domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * The user's domain.
   * @param domain domain or {@code null} for none
   */
  public GoogleAppsScriptTypeUser setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The user's identifying email address.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The user's identifying email address.
   * @param email email or {@code null} for none
   */
  public GoogleAppsScriptTypeUser setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The user's display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The user's display name.
   * @param name name or {@code null} for none
   */
  public GoogleAppsScriptTypeUser setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The user's photo.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoUrl() {
    return photoUrl;
  }

  /**
   * The user's photo.
   * @param photoUrl photoUrl or {@code null} for none
   */
  public GoogleAppsScriptTypeUser setPhotoUrl(java.lang.String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  @Override
  public GoogleAppsScriptTypeUser set(String fieldName, Object value) {
    return (GoogleAppsScriptTypeUser) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsScriptTypeUser clone() {
    return (GoogleAppsScriptTypeUser) super.clone();
  }

}
