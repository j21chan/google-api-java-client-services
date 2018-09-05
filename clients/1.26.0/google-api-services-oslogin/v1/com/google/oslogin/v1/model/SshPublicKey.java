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
 * The SSH public key information associated with a Google account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Login API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SshPublicKey extends com.google.api.client.json.GenericJson {

  /**
   * An expiration time in microseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expirationTimeUsec;

  /**
   * Output only. The SHA-256 fingerprint of the SSH public key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Public key text in SSH format, defined by RFC4253 section 6.6.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * An expiration time in microseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpirationTimeUsec() {
    return expirationTimeUsec;
  }

  /**
   * An expiration time in microseconds since epoch.
   * @param expirationTimeUsec expirationTimeUsec or {@code null} for none
   */
  public SshPublicKey setExpirationTimeUsec(java.lang.Long expirationTimeUsec) {
    this.expirationTimeUsec = expirationTimeUsec;
    return this;
  }

  /**
   * Output only. The SHA-256 fingerprint of the SSH public key.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Output only. The SHA-256 fingerprint of the SSH public key.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public SshPublicKey setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Public key text in SSH format, defined by RFC4253 section 6.6.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Public key text in SSH format, defined by RFC4253 section 6.6.
   * @param key key or {@code null} for none
   */
  public SshPublicKey setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  @Override
  public SshPublicKey set(String fieldName, Object value) {
    return (SshPublicKey) super.set(fieldName, value);
  }

  @Override
  public SshPublicKey clone() {
    return (SshPublicKey) super.clone();
  }

}
