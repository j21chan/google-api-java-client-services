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

package com.google.compute.model;

/**
 * Model definition for LicenseCodeLicenseAlias.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LicenseCodeLicenseAlias extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Description of this License Code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] URL of license corresponding to this License Code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Description of this License Code.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * [Output Only] Description of this License Code.
   * @param description description or {@code null} for none
   */
  public LicenseCodeLicenseAlias setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] URL of license corresponding to this License Code.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] URL of license corresponding to this License Code.
   * @param selfLink selfLink or {@code null} for none
   */
  public LicenseCodeLicenseAlias setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public LicenseCodeLicenseAlias set(String fieldName, Object value) {
    return (LicenseCodeLicenseAlias) super.set(fieldName, value);
  }

  @Override
  public LicenseCodeLicenseAlias clone() {
    return (LicenseCodeLicenseAlias) super.clone();
  }

}
