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

package com.google.tagmanager.model;

/**
 * Represents a Google Tag Manager Container Workspace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Workspace extends com.google.api.client.json.GenericJson {

  /**
   * GTM Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * GTM Container ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerId;

  /**
   * Workspace description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The fingerprint of the GTM Workspace as computed at storage time. This value is recomputed
   * whenever the workspace is modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Workspace display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * GTM Workspace's API relative path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Auto generated link to the tag manager UI
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagManagerUrl;

  /**
   * The Workspace ID uniquely identifies the GTM Workspace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workspaceId;

  /**
   * GTM Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * GTM Account ID.
   * @param accountId accountId or {@code null} for none
   */
  public Workspace setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * GTM Container ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerId() {
    return containerId;
  }

  /**
   * GTM Container ID.
   * @param containerId containerId or {@code null} for none
   */
  public Workspace setContainerId(java.lang.String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * Workspace description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Workspace description.
   * @param description description or {@code null} for none
   */
  public Workspace setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The fingerprint of the GTM Workspace as computed at storage time. This value is recomputed
   * whenever the workspace is modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The fingerprint of the GTM Workspace as computed at storage time. This value is recomputed
   * whenever the workspace is modified.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Workspace setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Workspace display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Workspace display name.
   * @param name name or {@code null} for none
   */
  public Workspace setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * GTM Workspace's API relative path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * GTM Workspace's API relative path.
   * @param path path or {@code null} for none
   */
  public Workspace setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Auto generated link to the tag manager UI
   * @return value or {@code null} for none
   */
  public java.lang.String getTagManagerUrl() {
    return tagManagerUrl;
  }

  /**
   * Auto generated link to the tag manager UI
   * @param tagManagerUrl tagManagerUrl or {@code null} for none
   */
  public Workspace setTagManagerUrl(java.lang.String tagManagerUrl) {
    this.tagManagerUrl = tagManagerUrl;
    return this;
  }

  /**
   * The Workspace ID uniquely identifies the GTM Workspace.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkspaceId() {
    return workspaceId;
  }

  /**
   * The Workspace ID uniquely identifies the GTM Workspace.
   * @param workspaceId workspaceId or {@code null} for none
   */
  public Workspace setWorkspaceId(java.lang.String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  @Override
  public Workspace set(String fieldName, Object value) {
    return (Workspace) super.set(fieldName, value);
  }

  @Override
  public Workspace clone() {
    return (Workspace) super.clone();
  }

}
