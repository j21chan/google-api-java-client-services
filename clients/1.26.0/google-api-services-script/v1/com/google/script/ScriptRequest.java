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

package com.google.script;

/**
 * Script request.
 *
 * @since 1.3
 */
@SuppressWarnings("javadoc")
public abstract class ScriptRequest<T> extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T> {

  /**
   * @param client Google client
   * @param method HTTP Method
   * @param uriTemplate URI template for the path relative to the base URL. If it starts with a "/"
   *        the base path from the base URL will be stripped out. The URI template can also be a
   *        full URL. URI template expansion is done using
   *        {@link com.google.api.client.http.UriTemplate#expand(String, String, Object, boolean)}
   * @param content A POJO that can be serialized into JSON or {@code null} for none
   * @param responseClass response class to parse into
   */
  public ScriptRequest(
      Script client, String method, String uriTemplate, Object content, Class<T> responseClass) {
    super(
        client,
        method,
        uriTemplate,
        content,
        responseClass);
  }

  /** V1 error format. */
  @com.google.api.client.util.Key("$.xgafv")
  private java.lang.String $Xgafv;

  /**
   * V1 error format.
   */
  public java.lang.String get$Xgafv() {
    return $Xgafv;
  }

  /** V1 error format. */
  public ScriptRequest<T> set$Xgafv(java.lang.String $Xgafv) {
    this.$Xgafv = $Xgafv;
    return this;
  }

  /** OAuth access token. */
  @com.google.api.client.util.Key("access_token")
  private java.lang.String accessToken;

  /**
   * OAuth access token.
   */
  public java.lang.String getAccessToken() {
    return accessToken;
  }

  /** OAuth access token. */
  public ScriptRequest<T> setAccessToken(java.lang.String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /** Data format for response. */
  @com.google.api.client.util.Key
  private java.lang.String alt;

  /**
   * Data format for response. [default: json]
   */
  public java.lang.String getAlt() {
    return alt;
  }

  /** Data format for response. */
  public ScriptRequest<T> setAlt(java.lang.String alt) {
    this.alt = alt;
    return this;
  }

  /** JSONP */
  @com.google.api.client.util.Key
  private java.lang.String callback;

  /**
   * JSONP
   */
  public java.lang.String getCallback() {
    return callback;
  }

  /** JSONP */
  public ScriptRequest<T> setCallback(java.lang.String callback) {
    this.callback = callback;
    return this;
  }

  /** Selector specifying which fields to include in a partial response. */
  @com.google.api.client.util.Key
  private java.lang.String fields;

  /**
   * Selector specifying which fields to include in a partial response.
   */
  public java.lang.String getFields() {
    return fields;
  }

  /** Selector specifying which fields to include in a partial response. */
  public ScriptRequest<T> setFields(java.lang.String fields) {
    this.fields = fields;
    return this;
  }

  /**
   * API key. Your API key identifies your project and provides you with API access, quota, and
   * reports. Required unless you provide an OAuth 2.0 token.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * API key. Your API key identifies your project and provides you with API access, quota, and
   * reports. Required unless you provide an OAuth 2.0 token.
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * API key. Your API key identifies your project and provides you with API access, quota, and
   * reports. Required unless you provide an OAuth 2.0 token.
   */
  public ScriptRequest<T> setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /** OAuth 2.0 token for the current user. */
  @com.google.api.client.util.Key("oauth_token")
  private java.lang.String oauthToken;

  /**
   * OAuth 2.0 token for the current user.
   */
  public java.lang.String getOauthToken() {
    return oauthToken;
  }

  /** OAuth 2.0 token for the current user. */
  public ScriptRequest<T> setOauthToken(java.lang.String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  /** Returns response with indentations and line breaks. */
  @com.google.api.client.util.Key
  private java.lang.Boolean prettyPrint;

  /**
   * Returns response with indentations and line breaks. [default: true]
   */
  public java.lang.Boolean getPrettyPrint() {
    return prettyPrint;
  }

  /** Returns response with indentations and line breaks. */
  public ScriptRequest<T> setPrettyPrint(java.lang.Boolean prettyPrint) {
    this.prettyPrint = prettyPrint;
    return this;
  }

  /**
   * Available to use for quota purposes for server-side applications. Can be any arbitrary string
   * assigned to a user, but should not exceed 40 characters.
   */
  @com.google.api.client.util.Key
  private java.lang.String quotaUser;

  /**
   * Available to use for quota purposes for server-side applications. Can be any arbitrary string
   * assigned to a user, but should not exceed 40 characters.
   */
  public java.lang.String getQuotaUser() {
    return quotaUser;
  }

  /**
   * Available to use for quota purposes for server-side applications. Can be any arbitrary string
   * assigned to a user, but should not exceed 40 characters.
   */
  public ScriptRequest<T> setQuotaUser(java.lang.String quotaUser) {
    this.quotaUser = quotaUser;
    return this;
  }

  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  @com.google.api.client.util.Key
  private java.lang.String uploadType;

  /**
   * Legacy upload protocol for media (e.g. "media", "multipart").
   */
  public java.lang.String getUploadType() {
    return uploadType;
  }

  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  public ScriptRequest<T> setUploadType(java.lang.String uploadType) {
    this.uploadType = uploadType;
    return this;
  }

  /** Upload protocol for media (e.g. "raw", "multipart"). */
  @com.google.api.client.util.Key("upload_protocol")
  private java.lang.String uploadProtocol;

  /**
   * Upload protocol for media (e.g. "raw", "multipart").
   */
  public java.lang.String getUploadProtocol() {
    return uploadProtocol;
  }

  /** Upload protocol for media (e.g. "raw", "multipart"). */
  public ScriptRequest<T> setUploadProtocol(java.lang.String uploadProtocol) {
    this.uploadProtocol = uploadProtocol;
    return this;
  }

  @Override
  public final Script getAbstractGoogleClient() {
    return (Script) super.getAbstractGoogleClient();
  }

  @Override
  public ScriptRequest<T> setDisableGZipContent(boolean disableGZipContent) {
    return (ScriptRequest<T>) super.setDisableGZipContent(disableGZipContent);
  }

  @Override
  public ScriptRequest<T> setRequestHeaders(com.google.api.client.http.HttpHeaders headers) {
    return (ScriptRequest<T>) super.setRequestHeaders(headers);
  }

  @Override
  public ScriptRequest<T> set(String parameterName, Object value) {
    return (ScriptRequest<T>) super.set(parameterName, value);
  }
}
