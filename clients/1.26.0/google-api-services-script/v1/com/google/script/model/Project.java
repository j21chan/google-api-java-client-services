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
 * The script project resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Project extends com.google.api.client.json.GenericJson {

  /**
   * When the script was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * User who originally created the script.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsScriptTypeUser creator;

  /**
   * User who last modified the script.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsScriptTypeUser lastModifyUser;

  /**
   * The parent's Drive ID that the script will be attached to. This is usually the ID of a Google
   * Document or Google Sheet. This filed is optional, and if not set, a stand-alone script will be
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentId;

  /**
   * The script project's Drive ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scriptId;

  /**
   * The title for the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * When the script was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * When the script was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * When the script was created.
   * @param createTime createTime or {@code null} for none
   */
  public Project setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * User who originally created the script.
   * @return value or {@code null} for none
   */
  public GoogleAppsScriptTypeUser getCreator() {
    return creator;
  }

  /**
   * User who originally created the script.
   * @param creator creator or {@code null} for none
   */
  public Project setCreator(GoogleAppsScriptTypeUser creator) {
    this.creator = creator;
    return this;
  }

  /**
   * User who last modified the script.
   * @return value or {@code null} for none
   */
  public GoogleAppsScriptTypeUser getLastModifyUser() {
    return lastModifyUser;
  }

  /**
   * User who last modified the script.
   * @param lastModifyUser lastModifyUser or {@code null} for none
   */
  public Project setLastModifyUser(GoogleAppsScriptTypeUser lastModifyUser) {
    this.lastModifyUser = lastModifyUser;
    return this;
  }

  /**
   * The parent's Drive ID that the script will be attached to. This is usually the ID of a Google
   * Document or Google Sheet. This filed is optional, and if not set, a stand-alone script will be
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentId() {
    return parentId;
  }

  /**
   * The parent's Drive ID that the script will be attached to. This is usually the ID of a Google
   * Document or Google Sheet. This filed is optional, and if not set, a stand-alone script will be
   * created.
   * @param parentId parentId or {@code null} for none
   */
  public Project setParentId(java.lang.String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The script project's Drive ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getScriptId() {
    return scriptId;
  }

  /**
   * The script project's Drive ID.
   * @param scriptId scriptId or {@code null} for none
   */
  public Project setScriptId(java.lang.String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  /**
   * The title for the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title for the project.
   * @param title title or {@code null} for none
   */
  public Project setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * When the script was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * When the script was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Project setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Project set(String fieldName, Object value) {
    return (Project) super.set(fieldName, value);
  }

  @Override
  public Project clone() {
    return (Project) super.clone();
  }

}
