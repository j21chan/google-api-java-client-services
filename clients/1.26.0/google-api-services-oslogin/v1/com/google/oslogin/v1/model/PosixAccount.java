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

package com.google.oslogin.v1.model;

/**
 * The POSIX account information associated with a Google account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Login API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PosixAccount extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A POSIX account identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * The GECOS (user information) entry for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gecos;

  /**
   * The default group ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long gid;

  /**
   * The path to the home directory for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String homeDirectory;

  /**
   * The operating system type where this account applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operatingSystemType;

  /**
   * Only one POSIX account can be marked as primary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean primary;

  /**
   * The path to the logic shell for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shell;

  /**
   * System identifier for which account the username or uid applies to. By default, the empty value
   * is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String systemId;

  /**
   * The user ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long uid;

  /**
   * The username of the POSIX account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * Output only. A POSIX account identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * Output only. A POSIX account identifier.
   * @param accountId accountId or {@code null} for none
   */
  public PosixAccount setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The GECOS (user information) entry for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getGecos() {
    return gecos;
  }

  /**
   * The GECOS (user information) entry for this account.
   * @param gecos gecos or {@code null} for none
   */
  public PosixAccount setGecos(java.lang.String gecos) {
    this.gecos = gecos;
    return this;
  }

  /**
   * The default group ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGid() {
    return gid;
  }

  /**
   * The default group ID.
   * @param gid gid or {@code null} for none
   */
  public PosixAccount setGid(java.lang.Long gid) {
    this.gid = gid;
    return this;
  }

  /**
   * The path to the home directory for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getHomeDirectory() {
    return homeDirectory;
  }

  /**
   * The path to the home directory for this account.
   * @param homeDirectory homeDirectory or {@code null} for none
   */
  public PosixAccount setHomeDirectory(java.lang.String homeDirectory) {
    this.homeDirectory = homeDirectory;
    return this;
  }

  /**
   * The operating system type where this account applies.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperatingSystemType() {
    return operatingSystemType;
  }

  /**
   * The operating system type where this account applies.
   * @param operatingSystemType operatingSystemType or {@code null} for none
   */
  public PosixAccount setOperatingSystemType(java.lang.String operatingSystemType) {
    this.operatingSystemType = operatingSystemType;
    return this;
  }

  /**
   * Only one POSIX account can be marked as primary.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrimary() {
    return primary;
  }

  /**
   * Only one POSIX account can be marked as primary.
   * @param primary primary or {@code null} for none
   */
  public PosixAccount setPrimary(java.lang.Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * The path to the logic shell for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getShell() {
    return shell;
  }

  /**
   * The path to the logic shell for this account.
   * @param shell shell or {@code null} for none
   */
  public PosixAccount setShell(java.lang.String shell) {
    this.shell = shell;
    return this;
  }

  /**
   * System identifier for which account the username or uid applies to. By default, the empty value
   * is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getSystemId() {
    return systemId;
  }

  /**
   * System identifier for which account the username or uid applies to. By default, the empty value
   * is used.
   * @param systemId systemId or {@code null} for none
   */
  public PosixAccount setSystemId(java.lang.String systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * The user ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUid() {
    return uid;
  }

  /**
   * The user ID.
   * @param uid uid or {@code null} for none
   */
  public PosixAccount setUid(java.lang.Long uid) {
    this.uid = uid;
    return this;
  }

  /**
   * The username of the POSIX account.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The username of the POSIX account.
   * @param username username or {@code null} for none
   */
  public PosixAccount setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public PosixAccount set(String fieldName, Object value) {
    return (PosixAccount) super.set(fieldName, value);
  }

  @Override
  public PosixAccount clone() {
    return (PosixAccount) super.clone();
  }

}
