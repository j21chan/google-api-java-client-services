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

package com.google.sqladmin.model;

/**
 * Database instance restore backup response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesRestoreBackupResponse extends com.google.api.client.json.GenericJson {

  /**
   * This is always sql#instancesRestoreBackup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An identifier that uniquely identifies the operation. You can use this identifier to retrieve
   * the Operations resource that has information about the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operation;

  /**
   * This is always sql#instancesRestoreBackup.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#instancesRestoreBackup.
   * @param kind kind or {@code null} for none
   */
  public InstancesRestoreBackupResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * An identifier that uniquely identifies the operation. You can use this identifier to retrieve
   * the Operations resource that has information about the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperation() {
    return operation;
  }

  /**
   * An identifier that uniquely identifies the operation. You can use this identifier to retrieve
   * the Operations resource that has information about the operation.
   * @param operation operation or {@code null} for none
   */
  public InstancesRestoreBackupResponse setOperation(java.lang.String operation) {
    this.operation = operation;
    return this;
  }

  @Override
  public InstancesRestoreBackupResponse set(String fieldName, Object value) {
    return (InstancesRestoreBackupResponse) super.set(fieldName, value);
  }

  @Override
  public InstancesRestoreBackupResponse clone() {
    return (InstancesRestoreBackupResponse) super.clone();
  }

}
