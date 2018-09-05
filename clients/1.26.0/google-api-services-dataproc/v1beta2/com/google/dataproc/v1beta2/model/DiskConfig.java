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

package com.google.dataproc.v1beta2.model;

/**
 * Specifies the config of disk options for a group of VM instances.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiskConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Size in GB of the boot disk (default is 500GB).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bootDiskSizeGb;

  /**
   * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent
   * Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootDiskType;

  /**
   * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the
   * boot disk is used to store runtime logs and HDFS
   * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are
   * attached, this runtime bulk data is spread across them, and the boot disk contains only basic
   * config and installed binaries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numLocalSsds;

  /**
   * Optional. Size in GB of the boot disk (default is 500GB).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBootDiskSizeGb() {
    return bootDiskSizeGb;
  }

  /**
   * Optional. Size in GB of the boot disk (default is 500GB).
   * @param bootDiskSizeGb bootDiskSizeGb or {@code null} for none
   */
  public DiskConfig setBootDiskSizeGb(java.lang.Integer bootDiskSizeGb) {
    this.bootDiskSizeGb = bootDiskSizeGb;
    return this;
  }

  /**
   * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent
   * Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive).
   * @return value or {@code null} for none
   */
  public java.lang.String getBootDiskType() {
    return bootDiskType;
  }

  /**
   * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent
   * Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive).
   * @param bootDiskType bootDiskType or {@code null} for none
   */
  public DiskConfig setBootDiskType(java.lang.String bootDiskType) {
    this.bootDiskType = bootDiskType;
    return this;
  }

  /**
   * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the
   * boot disk is used to store runtime logs and HDFS
   * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are
   * attached, this runtime bulk data is spread across them, and the boot disk contains only basic
   * config and installed binaries.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumLocalSsds() {
    return numLocalSsds;
  }

  /**
   * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the
   * boot disk is used to store runtime logs and HDFS
   * (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are
   * attached, this runtime bulk data is spread across them, and the boot disk contains only basic
   * config and installed binaries.
   * @param numLocalSsds numLocalSsds or {@code null} for none
   */
  public DiskConfig setNumLocalSsds(java.lang.Integer numLocalSsds) {
    this.numLocalSsds = numLocalSsds;
    return this;
  }

  @Override
  public DiskConfig set(String fieldName, Object value) {
    return (DiskConfig) super.set(fieldName, value);
  }

  @Override
  public DiskConfig clone() {
    return (DiskConfig) super.clone();
  }

}
