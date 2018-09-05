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
 * Model definition for CustomerEncryptionKeyProtectedDisk.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomerEncryptionKeyProtectedDisk extends com.google.api.client.json.GenericJson {

  /**
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey diskEncryptionKey;

  /**
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is
   * only applicable for persistent disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getDiskEncryptionKey() {
    return diskEncryptionKey;
  }

  /**
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * @param diskEncryptionKey diskEncryptionKey or {@code null} for none
   */
  public CustomerEncryptionKeyProtectedDisk setDiskEncryptionKey(CustomerEncryptionKey diskEncryptionKey) {
    this.diskEncryptionKey = diskEncryptionKey;
    return this;
  }

  /**
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is
   * only applicable for persistent disks.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is
   * only applicable for persistent disks.
   * @param source source or {@code null} for none
   */
  public CustomerEncryptionKeyProtectedDisk setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public CustomerEncryptionKeyProtectedDisk set(String fieldName, Object value) {
    return (CustomerEncryptionKeyProtectedDisk) super.set(fieldName, value);
  }

  @Override
  public CustomerEncryptionKeyProtectedDisk clone() {
    return (CustomerEncryptionKeyProtectedDisk) super.clone();
  }

}
