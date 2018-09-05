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
 * A configuration that defines how a deployment is accessed externally.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntryPoint extends com.google.api.client.json.GenericJson {

  /**
   * Add-on properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsScriptTypeAddOnEntryPoint addOn;

  /**
   * The type of the entry point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entryPointType;

  /**
   * An entry point specification for Apps Script API execution calls.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsScriptTypeExecutionApiEntryPoint executionApi;

  /**
   * An entry point specification for web apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsScriptTypeWebAppEntryPoint webApp;

  /**
   * Add-on properties.
   * @return value or {@code null} for none
   */
  public GoogleAppsScriptTypeAddOnEntryPoint getAddOn() {
    return addOn;
  }

  /**
   * Add-on properties.
   * @param addOn addOn or {@code null} for none
   */
  public EntryPoint setAddOn(GoogleAppsScriptTypeAddOnEntryPoint addOn) {
    this.addOn = addOn;
    return this;
  }

  /**
   * The type of the entry point.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntryPointType() {
    return entryPointType;
  }

  /**
   * The type of the entry point.
   * @param entryPointType entryPointType or {@code null} for none
   */
  public EntryPoint setEntryPointType(java.lang.String entryPointType) {
    this.entryPointType = entryPointType;
    return this;
  }

  /**
   * An entry point specification for Apps Script API execution calls.
   * @return value or {@code null} for none
   */
  public GoogleAppsScriptTypeExecutionApiEntryPoint getExecutionApi() {
    return executionApi;
  }

  /**
   * An entry point specification for Apps Script API execution calls.
   * @param executionApi executionApi or {@code null} for none
   */
  public EntryPoint setExecutionApi(GoogleAppsScriptTypeExecutionApiEntryPoint executionApi) {
    this.executionApi = executionApi;
    return this;
  }

  /**
   * An entry point specification for web apps.
   * @return value or {@code null} for none
   */
  public GoogleAppsScriptTypeWebAppEntryPoint getWebApp() {
    return webApp;
  }

  /**
   * An entry point specification for web apps.
   * @param webApp webApp or {@code null} for none
   */
  public EntryPoint setWebApp(GoogleAppsScriptTypeWebAppEntryPoint webApp) {
    this.webApp = webApp;
    return this;
  }

  @Override
  public EntryPoint set(String fieldName, Object value) {
    return (EntryPoint) super.set(fieldName, value);
  }

  @Override
  public EntryPoint clone() {
    return (EntryPoint) super.clone();
  }

}
