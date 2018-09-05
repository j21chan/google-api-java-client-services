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

package com.google.iam.v1.model;

/**
 * A permission which can be included by a role.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Permission extends com.google.api.client.json.GenericJson {

  /**
   * The service API associated with the permission is not enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean apiDisabled;

  /**
   * The current custom role support level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customRolesSupportLevel;

  /**
   * A brief description of what this Permission is used for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The name of this Permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * This permission can ONLY be used in predefined roles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean onlyInPredefinedRoles;

  /**
   * The current launch stage of the permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stage;

  /**
   * The title of this Permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The service API associated with the permission is not enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApiDisabled() {
    return apiDisabled;
  }

  /**
   * The service API associated with the permission is not enabled.
   * @param apiDisabled apiDisabled or {@code null} for none
   */
  public Permission setApiDisabled(java.lang.Boolean apiDisabled) {
    this.apiDisabled = apiDisabled;
    return this;
  }

  /**
   * The current custom role support level.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomRolesSupportLevel() {
    return customRolesSupportLevel;
  }

  /**
   * The current custom role support level.
   * @param customRolesSupportLevel customRolesSupportLevel or {@code null} for none
   */
  public Permission setCustomRolesSupportLevel(java.lang.String customRolesSupportLevel) {
    this.customRolesSupportLevel = customRolesSupportLevel;
    return this;
  }

  /**
   * A brief description of what this Permission is used for.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A brief description of what this Permission is used for.
   * @param description description or {@code null} for none
   */
  public Permission setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The name of this Permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this Permission.
   * @param name name or {@code null} for none
   */
  public Permission setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * This permission can ONLY be used in predefined roles.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOnlyInPredefinedRoles() {
    return onlyInPredefinedRoles;
  }

  /**
   * This permission can ONLY be used in predefined roles.
   * @param onlyInPredefinedRoles onlyInPredefinedRoles or {@code null} for none
   */
  public Permission setOnlyInPredefinedRoles(java.lang.Boolean onlyInPredefinedRoles) {
    this.onlyInPredefinedRoles = onlyInPredefinedRoles;
    return this;
  }

  /**
   * The current launch stage of the permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getStage() {
    return stage;
  }

  /**
   * The current launch stage of the permission.
   * @param stage stage or {@code null} for none
   */
  public Permission setStage(java.lang.String stage) {
    this.stage = stage;
    return this;
  }

  /**
   * The title of this Permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this Permission.
   * @param title title or {@code null} for none
   */
  public Permission setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Permission set(String fieldName, Object value) {
    return (Permission) super.set(fieldName, value);
  }

  @Override
  public Permission clone() {
    return (Permission) super.clone();
  }

}
