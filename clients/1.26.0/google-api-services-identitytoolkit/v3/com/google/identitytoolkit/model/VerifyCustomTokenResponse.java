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

package com.google.identitytoolkit.model;

/**
 * Response from verifying a custom token
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Identity Toolkit API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VerifyCustomTokenResponse extends com.google.api.client.json.GenericJson {

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresIn;

  /**
   * The GITKit token for authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * True if it's a new user sign-in, false if it's a returning user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isNewUser;

  /**
   * The fixed string "identitytoolkit#VerifyCustomTokenResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String refreshToken;

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresIn() {
    return expiresIn;
  }

  /**
   * If idToken is STS id token, then this field will be expiration time of STS id token in seconds.
   * @param expiresIn expiresIn or {@code null} for none
   */
  public VerifyCustomTokenResponse setExpiresIn(java.lang.Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * The GITKit token for authenticated user.
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * The GITKit token for authenticated user.
   * @param idToken idToken or {@code null} for none
   */
  public VerifyCustomTokenResponse setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * True if it's a new user sign-in, false if it's a returning user.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsNewUser() {
    return isNewUser;
  }

  /**
   * True if it's a new user sign-in, false if it's a returning user.
   * @param isNewUser isNewUser or {@code null} for none
   */
  public VerifyCustomTokenResponse setIsNewUser(java.lang.Boolean isNewUser) {
    this.isNewUser = isNewUser;
    return this;
  }

  /**
   * The fixed string "identitytoolkit#VerifyCustomTokenResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The fixed string "identitytoolkit#VerifyCustomTokenResponse".
   * @param kind kind or {@code null} for none
   */
  public VerifyCustomTokenResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * @return value or {@code null} for none
   */
  public java.lang.String getRefreshToken() {
    return refreshToken;
  }

  /**
   * If idToken is STS id token, then this field will be refresh token.
   * @param refreshToken refreshToken or {@code null} for none
   */
  public VerifyCustomTokenResponse setRefreshToken(java.lang.String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  @Override
  public VerifyCustomTokenResponse set(String fieldName, Object value) {
    return (VerifyCustomTokenResponse) super.set(fieldName, value);
  }

  @Override
  public VerifyCustomTokenResponse clone() {
    return (VerifyCustomTokenResponse) super.clone();
  }

}
