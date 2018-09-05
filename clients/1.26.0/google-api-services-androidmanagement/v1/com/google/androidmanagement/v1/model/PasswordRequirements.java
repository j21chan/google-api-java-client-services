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

package com.google.androidmanagement.v1.model;

/**
 * Requirements for the password used to unlock a device.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PasswordRequirements extends com.google.api.client.json.GenericJson {

  /**
   * Number of incorrect device-unlock passwords that can be entered before a device is wiped. A
   * value of 0 means there is no restriction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumFailedPasswordsForWipe;

  /**
   * Password expiration timeout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String passwordExpirationTimeout;

  /**
   * The length of the password history. After setting this field, the user won't be able to enter a
   * new password that is the same as any password in the history. A value of 0 means there is no
   * restriction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordHistoryLength;

  /**
   * The minimum allowed password length. A value of 0 means there is no restriction. Only enforced
   * when password_quality is NUMERIC, NUMERIC_COMPLEX, ALPHABETIC, ALPHANUMERIC, or COMPLEX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordMinimumLength;

  /**
   * Minimum number of letters required in the password. Only enforced when password_quality is
   * COMPLEX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordMinimumLetters;

  /**
   * Minimum number of lower case letters required in the password. Only enforced when
   * password_quality is COMPLEX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordMinimumLowerCase;

  /**
   * Minimum number of non-letter characters (numerical digits or symbols) required in the password.
   * Only enforced when password_quality is COMPLEX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordMinimumNonLetter;

  /**
   * Minimum number of numerical digits required in the password. Only enforced when
   * password_quality is COMPLEX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordMinimumNumeric;

  /**
   * Minimum number of symbols required in the password. Only enforced when password_quality is
   * COMPLEX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordMinimumSymbols;

  /**
   * Minimum number of upper case letters required in the password. Only enforced when
   * password_quality is COMPLEX.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer passwordMinimumUpperCase;

  /**
   * The required password quality.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String passwordQuality;

  /**
   * Number of incorrect device-unlock passwords that can be entered before a device is wiped. A
   * value of 0 means there is no restriction.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumFailedPasswordsForWipe() {
    return maximumFailedPasswordsForWipe;
  }

  /**
   * Number of incorrect device-unlock passwords that can be entered before a device is wiped. A
   * value of 0 means there is no restriction.
   * @param maximumFailedPasswordsForWipe maximumFailedPasswordsForWipe or {@code null} for none
   */
  public PasswordRequirements setMaximumFailedPasswordsForWipe(java.lang.Integer maximumFailedPasswordsForWipe) {
    this.maximumFailedPasswordsForWipe = maximumFailedPasswordsForWipe;
    return this;
  }

  /**
   * Password expiration timeout.
   * @return value or {@code null} for none
   */
  public String getPasswordExpirationTimeout() {
    return passwordExpirationTimeout;
  }

  /**
   * Password expiration timeout.
   * @param passwordExpirationTimeout passwordExpirationTimeout or {@code null} for none
   */
  public PasswordRequirements setPasswordExpirationTimeout(String passwordExpirationTimeout) {
    this.passwordExpirationTimeout = passwordExpirationTimeout;
    return this;
  }

  /**
   * The length of the password history. After setting this field, the user won't be able to enter a
   * new password that is the same as any password in the history. A value of 0 means there is no
   * restriction.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordHistoryLength() {
    return passwordHistoryLength;
  }

  /**
   * The length of the password history. After setting this field, the user won't be able to enter a
   * new password that is the same as any password in the history. A value of 0 means there is no
   * restriction.
   * @param passwordHistoryLength passwordHistoryLength or {@code null} for none
   */
  public PasswordRequirements setPasswordHistoryLength(java.lang.Integer passwordHistoryLength) {
    this.passwordHistoryLength = passwordHistoryLength;
    return this;
  }

  /**
   * The minimum allowed password length. A value of 0 means there is no restriction. Only enforced
   * when password_quality is NUMERIC, NUMERIC_COMPLEX, ALPHABETIC, ALPHANUMERIC, or COMPLEX.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordMinimumLength() {
    return passwordMinimumLength;
  }

  /**
   * The minimum allowed password length. A value of 0 means there is no restriction. Only enforced
   * when password_quality is NUMERIC, NUMERIC_COMPLEX, ALPHABETIC, ALPHANUMERIC, or COMPLEX.
   * @param passwordMinimumLength passwordMinimumLength or {@code null} for none
   */
  public PasswordRequirements setPasswordMinimumLength(java.lang.Integer passwordMinimumLength) {
    this.passwordMinimumLength = passwordMinimumLength;
    return this;
  }

  /**
   * Minimum number of letters required in the password. Only enforced when password_quality is
   * COMPLEX.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordMinimumLetters() {
    return passwordMinimumLetters;
  }

  /**
   * Minimum number of letters required in the password. Only enforced when password_quality is
   * COMPLEX.
   * @param passwordMinimumLetters passwordMinimumLetters or {@code null} for none
   */
  public PasswordRequirements setPasswordMinimumLetters(java.lang.Integer passwordMinimumLetters) {
    this.passwordMinimumLetters = passwordMinimumLetters;
    return this;
  }

  /**
   * Minimum number of lower case letters required in the password. Only enforced when
   * password_quality is COMPLEX.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordMinimumLowerCase() {
    return passwordMinimumLowerCase;
  }

  /**
   * Minimum number of lower case letters required in the password. Only enforced when
   * password_quality is COMPLEX.
   * @param passwordMinimumLowerCase passwordMinimumLowerCase or {@code null} for none
   */
  public PasswordRequirements setPasswordMinimumLowerCase(java.lang.Integer passwordMinimumLowerCase) {
    this.passwordMinimumLowerCase = passwordMinimumLowerCase;
    return this;
  }

  /**
   * Minimum number of non-letter characters (numerical digits or symbols) required in the password.
   * Only enforced when password_quality is COMPLEX.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordMinimumNonLetter() {
    return passwordMinimumNonLetter;
  }

  /**
   * Minimum number of non-letter characters (numerical digits or symbols) required in the password.
   * Only enforced when password_quality is COMPLEX.
   * @param passwordMinimumNonLetter passwordMinimumNonLetter or {@code null} for none
   */
  public PasswordRequirements setPasswordMinimumNonLetter(java.lang.Integer passwordMinimumNonLetter) {
    this.passwordMinimumNonLetter = passwordMinimumNonLetter;
    return this;
  }

  /**
   * Minimum number of numerical digits required in the password. Only enforced when
   * password_quality is COMPLEX.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordMinimumNumeric() {
    return passwordMinimumNumeric;
  }

  /**
   * Minimum number of numerical digits required in the password. Only enforced when
   * password_quality is COMPLEX.
   * @param passwordMinimumNumeric passwordMinimumNumeric or {@code null} for none
   */
  public PasswordRequirements setPasswordMinimumNumeric(java.lang.Integer passwordMinimumNumeric) {
    this.passwordMinimumNumeric = passwordMinimumNumeric;
    return this;
  }

  /**
   * Minimum number of symbols required in the password. Only enforced when password_quality is
   * COMPLEX.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordMinimumSymbols() {
    return passwordMinimumSymbols;
  }

  /**
   * Minimum number of symbols required in the password. Only enforced when password_quality is
   * COMPLEX.
   * @param passwordMinimumSymbols passwordMinimumSymbols or {@code null} for none
   */
  public PasswordRequirements setPasswordMinimumSymbols(java.lang.Integer passwordMinimumSymbols) {
    this.passwordMinimumSymbols = passwordMinimumSymbols;
    return this;
  }

  /**
   * Minimum number of upper case letters required in the password. Only enforced when
   * password_quality is COMPLEX.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPasswordMinimumUpperCase() {
    return passwordMinimumUpperCase;
  }

  /**
   * Minimum number of upper case letters required in the password. Only enforced when
   * password_quality is COMPLEX.
   * @param passwordMinimumUpperCase passwordMinimumUpperCase or {@code null} for none
   */
  public PasswordRequirements setPasswordMinimumUpperCase(java.lang.Integer passwordMinimumUpperCase) {
    this.passwordMinimumUpperCase = passwordMinimumUpperCase;
    return this;
  }

  /**
   * The required password quality.
   * @return value or {@code null} for none
   */
  public java.lang.String getPasswordQuality() {
    return passwordQuality;
  }

  /**
   * The required password quality.
   * @param passwordQuality passwordQuality or {@code null} for none
   */
  public PasswordRequirements setPasswordQuality(java.lang.String passwordQuality) {
    this.passwordQuality = passwordQuality;
    return this;
  }

  @Override
  public PasswordRequirements set(String fieldName, Object value) {
    return (PasswordRequirements) super.set(fieldName, value);
  }

  @Override
  public PasswordRequirements clone() {
    return (PasswordRequirements) super.clone();
  }

}
