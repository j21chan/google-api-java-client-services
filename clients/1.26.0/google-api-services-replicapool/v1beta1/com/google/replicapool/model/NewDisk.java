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

package com.google.replicapool.model;

/**
 * A Persistent Disk resource that will be created and attached to each Replica in the Pool. Each
 * Replica will have a unique persistent disk that is created and attached to that Replica in
 * READ_WRITE mode.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Replica Pool API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NewDisk extends com.google.api.client.json.GenericJson {

  /**
   * How the disk will be attached to the Replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskAttachment attachment;

  /**
   * If true, then this disk will be deleted when the instance is deleted. The default value is
   * true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoDelete;

  /**
   * If true, indicates that this is the root persistent disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boot;

  /**
   * Create the new disk using these parameters. The name of the disk will be -
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NewDiskInitializeParams initializeParams;

  /**
   * How the disk will be attached to the Replica.
   * @return value or {@code null} for none
   */
  public DiskAttachment getAttachment() {
    return attachment;
  }

  /**
   * How the disk will be attached to the Replica.
   * @param attachment attachment or {@code null} for none
   */
  public NewDisk setAttachment(DiskAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * If true, then this disk will be deleted when the instance is deleted. The default value is
   * true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoDelete() {
    return autoDelete;
  }

  /**
   * If true, then this disk will be deleted when the instance is deleted. The default value is
   * true.
   * @param autoDelete autoDelete or {@code null} for none
   */
  public NewDisk setAutoDelete(java.lang.Boolean autoDelete) {
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * If true, indicates that this is the root persistent disk.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoot() {
    return boot;
  }

  /**
   * If true, indicates that this is the root persistent disk.
   * @param boot boot or {@code null} for none
   */
  public NewDisk setBoot(java.lang.Boolean boot) {
    this.boot = boot;
    return this;
  }

  /**
   * Create the new disk using these parameters. The name of the disk will be -
   * @return value or {@code null} for none
   */
  public NewDiskInitializeParams getInitializeParams() {
    return initializeParams;
  }

  /**
   * Create the new disk using these parameters. The name of the disk will be -
   * @param initializeParams initializeParams or {@code null} for none
   */
  public NewDisk setInitializeParams(NewDiskInitializeParams initializeParams) {
    this.initializeParams = initializeParams;
    return this;
  }

  @Override
  public NewDisk set(String fieldName, Object value) {
    return (NewDisk) super.set(fieldName, value);
  }

  @Override
  public NewDisk clone() {
    return (NewDisk) super.clone();
  }

}
