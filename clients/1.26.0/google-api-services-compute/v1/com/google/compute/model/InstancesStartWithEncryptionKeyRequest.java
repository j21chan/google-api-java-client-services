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
 * Model definition for InstancesStartWithEncryptionKeyRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesStartWithEncryptionKeyRequest extends com.google.api.client.json.GenericJson {

  /**
   * Array of disks associated with this instance that are protected with a customer-supplied
   * encryption key.
   *
   * In order to start the instance, the disk url and its corresponding key must be provided.
   *
   * If the disk is not protected with a customer-supplied encryption key it should not be
   * specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomerEncryptionKeyProtectedDisk> disks;

  static {
    // hack to force ProGuard to consider CustomerEncryptionKeyProtectedDisk used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomerEncryptionKeyProtectedDisk.class);
  }

  /**
   * Array of disks associated with this instance that are protected with a customer-supplied
   * encryption key.
   *
   * In order to start the instance, the disk url and its corresponding key must be provided.
   *
   * If the disk is not protected with a customer-supplied encryption key it should not be
   * specified.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomerEncryptionKeyProtectedDisk> getDisks() {
    return disks;
  }

  /**
   * Array of disks associated with this instance that are protected with a customer-supplied
   * encryption key.
   *
   * In order to start the instance, the disk url and its corresponding key must be provided.
   *
   * If the disk is not protected with a customer-supplied encryption key it should not be
   * specified.
   * @param disks disks or {@code null} for none
   */
  public InstancesStartWithEncryptionKeyRequest setDisks(java.util.List<CustomerEncryptionKeyProtectedDisk> disks) {
    this.disks = disks;
    return this;
  }

  @Override
  public InstancesStartWithEncryptionKeyRequest set(String fieldName, Object value) {
    return (InstancesStartWithEncryptionKeyRequest) super.set(fieldName, value);
  }

  @Override
  public InstancesStartWithEncryptionKeyRequest clone() {
    return (InstancesStartWithEncryptionKeyRequest) super.clone();
  }

}
