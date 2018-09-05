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

package com.google.appengine.model;

/**
 * URL pattern and description of how the URL should be handled. App Engine can handle URLs by
 * executing application code or by serving static files uploaded with the version, such as images,
 * CSS, or JavaScript.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlMap extends com.google.api.client.json.GenericJson {

  /**
   * Uses API Endpoints to handle requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApiEndpointHandler apiEndpoint;

  /**
   * Action to take when users access resources that require authentication. Defaults to redirect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authFailAction;

  /**
   * Level of login required to access this resource. Not supported for Node.js in the App Engine
   * standard environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String login;

  /**
   * 30x code to use when performing redirects for the secure field. Defaults to 302.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redirectHttpResponseCode;

  /**
   * Executes a script to handle the requests that match this URL pattern. Only the auto value is
   * supported for Node.js in the App Engine standard environment, for example "script": "auto".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ScriptHandler script;

  /**
   * Security (HTTPS) enforcement for this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityLevel;

  /**
   * Returns the contents of a file, such as an image, as the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StaticFilesHandler staticFiles;

  /**
   * URL prefix. Uses regular expression syntax, which means regexp special characters must be
   * escaped, but should not contain groupings. All URLs that begin with this prefix are handled by
   * this handler, using the portion of the URL after the prefix as part of the file path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String urlRegex;

  /**
   * Uses API Endpoints to handle requests.
   * @return value or {@code null} for none
   */
  public ApiEndpointHandler getApiEndpoint() {
    return apiEndpoint;
  }

  /**
   * Uses API Endpoints to handle requests.
   * @param apiEndpoint apiEndpoint or {@code null} for none
   */
  public UrlMap setApiEndpoint(ApiEndpointHandler apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
    return this;
  }

  /**
   * Action to take when users access resources that require authentication. Defaults to redirect.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthFailAction() {
    return authFailAction;
  }

  /**
   * Action to take when users access resources that require authentication. Defaults to redirect.
   * @param authFailAction authFailAction or {@code null} for none
   */
  public UrlMap setAuthFailAction(java.lang.String authFailAction) {
    this.authFailAction = authFailAction;
    return this;
  }

  /**
   * Level of login required to access this resource. Not supported for Node.js in the App Engine
   * standard environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogin() {
    return login;
  }

  /**
   * Level of login required to access this resource. Not supported for Node.js in the App Engine
   * standard environment.
   * @param login login or {@code null} for none
   */
  public UrlMap setLogin(java.lang.String login) {
    this.login = login;
    return this;
  }

  /**
   * 30x code to use when performing redirects for the secure field. Defaults to 302.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedirectHttpResponseCode() {
    return redirectHttpResponseCode;
  }

  /**
   * 30x code to use when performing redirects for the secure field. Defaults to 302.
   * @param redirectHttpResponseCode redirectHttpResponseCode or {@code null} for none
   */
  public UrlMap setRedirectHttpResponseCode(java.lang.String redirectHttpResponseCode) {
    this.redirectHttpResponseCode = redirectHttpResponseCode;
    return this;
  }

  /**
   * Executes a script to handle the requests that match this URL pattern. Only the auto value is
   * supported for Node.js in the App Engine standard environment, for example "script": "auto".
   * @return value or {@code null} for none
   */
  public ScriptHandler getScript() {
    return script;
  }

  /**
   * Executes a script to handle the requests that match this URL pattern. Only the auto value is
   * supported for Node.js in the App Engine standard environment, for example "script": "auto".
   * @param script script or {@code null} for none
   */
  public UrlMap setScript(ScriptHandler script) {
    this.script = script;
    return this;
  }

  /**
   * Security (HTTPS) enforcement for this URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityLevel() {
    return securityLevel;
  }

  /**
   * Security (HTTPS) enforcement for this URL.
   * @param securityLevel securityLevel or {@code null} for none
   */
  public UrlMap setSecurityLevel(java.lang.String securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

  /**
   * Returns the contents of a file, such as an image, as the response.
   * @return value or {@code null} for none
   */
  public StaticFilesHandler getStaticFiles() {
    return staticFiles;
  }

  /**
   * Returns the contents of a file, such as an image, as the response.
   * @param staticFiles staticFiles or {@code null} for none
   */
  public UrlMap setStaticFiles(StaticFilesHandler staticFiles) {
    this.staticFiles = staticFiles;
    return this;
  }

  /**
   * URL prefix. Uses regular expression syntax, which means regexp special characters must be
   * escaped, but should not contain groupings. All URLs that begin with this prefix are handled by
   * this handler, using the portion of the URL after the prefix as part of the file path.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrlRegex() {
    return urlRegex;
  }

  /**
   * URL prefix. Uses regular expression syntax, which means regexp special characters must be
   * escaped, but should not contain groupings. All URLs that begin with this prefix are handled by
   * this handler, using the portion of the URL after the prefix as part of the file path.
   * @param urlRegex urlRegex or {@code null} for none
   */
  public UrlMap setUrlRegex(java.lang.String urlRegex) {
    this.urlRegex = urlRegex;
    return this;
  }

  @Override
  public UrlMap set(String fieldName, Object value) {
    return (UrlMap) super.set(fieldName, value);
  }

  @Override
  public UrlMap clone() {
    return (UrlMap) super.clone();
  }

}
