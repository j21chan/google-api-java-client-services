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
 * Metadata the defines how a deployment is configured.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeploymentConfig extends com.google.api.client.json.GenericJson {

  /**
   * The description for this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The manifest file name for this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manifestFileName;

  /**
   * The script project's Drive ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scriptId;

  /**
   * The version number on which this deployment is based.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer versionNumber;

  /**
   * The description for this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description for this deployment.
   * @param description description or {@code null} for none
   */
  public DeploymentConfig setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The manifest file name for this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getManifestFileName() {
    return manifestFileName;
  }

  /**
   * The manifest file name for this deployment.
   * @param manifestFileName manifestFileName or {@code null} for none
   */
  public DeploymentConfig setManifestFileName(java.lang.String manifestFileName) {
    this.manifestFileName = manifestFileName;
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
  public DeploymentConfig setScriptId(java.lang.String scriptId) {
    this.scriptId = scriptId;
    return this;
  }

  /**
   * The version number on which this deployment is based.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersionNumber() {
    return versionNumber;
  }

  /**
   * The version number on which this deployment is based.
   * @param versionNumber versionNumber or {@code null} for none
   */
  public DeploymentConfig setVersionNumber(java.lang.Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  @Override
  public DeploymentConfig set(String fieldName, Object value) {
    return (DeploymentConfig) super.set(fieldName, value);
  }

  @Override
  public DeploymentConfig clone() {
    return (DeploymentConfig) super.clone();
  }

}
