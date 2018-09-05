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
 * A Machine Type resource. (== resource_for v1.machineTypes ==) (== resource_for beta.machineTypes
 * ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MachineType extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * [Output Only] The deprecation status associated with this machine type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeprecationStatus deprecated;

  /**
   * [Output Only] An optional textual description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The number of virtual CPUs that are available to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer guestCpus;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Deprecated] This property is deprecated and will never be populated with any relevant values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer imageSpaceGb;

  /**
   * [Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSharedCpu;

  /**
   * [Output Only] The type of the resource. Always compute#machineType for machine types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] Maximum persistent disks allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maximumPersistentDisks;

  /**
   * [Output Only] Maximum total persistent disks size (GB) allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maximumPersistentDisksSizeGb;

  /**
   * [Output Only] The amount of physical memory available to the instance, defined in MB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memoryMb;

  /**
   * [Output Only] Name of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ScratchDisks> scratchDisks;

  static {
    // hack to force ProGuard to consider ScratchDisks used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ScratchDisks.class);
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The name of the zone where the machine type resides, such as us-central1-a.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public MachineType setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * [Output Only] The deprecation status associated with this machine type.
   * @return value or {@code null} for none
   */
  public DeprecationStatus getDeprecated() {
    return deprecated;
  }

  /**
   * [Output Only] The deprecation status associated with this machine type.
   * @param deprecated deprecated or {@code null} for none
   */
  public MachineType setDeprecated(DeprecationStatus deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * [Output Only] An optional textual description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * [Output Only] An optional textual description of the resource.
   * @param description description or {@code null} for none
   */
  public MachineType setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The number of virtual CPUs that are available to the instance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGuestCpus() {
    return guestCpus;
  }

  /**
   * [Output Only] The number of virtual CPUs that are available to the instance.
   * @param guestCpus guestCpus or {@code null} for none
   */
  public MachineType setGuestCpus(java.lang.Integer guestCpus) {
    this.guestCpus = guestCpus;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public MachineType setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Deprecated] This property is deprecated and will never be populated with any relevant values.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getImageSpaceGb() {
    return imageSpaceGb;
  }

  /**
   * [Deprecated] This property is deprecated and will never be populated with any relevant values.
   * @param imageSpaceGb imageSpaceGb or {@code null} for none
   */
  public MachineType setImageSpaceGb(java.lang.Integer imageSpaceGb) {
    this.imageSpaceGb = imageSpaceGb;
    return this;
  }

  /**
   * [Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSharedCpu() {
    return isSharedCpu;
  }

  /**
   * [Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for
   * more information.
   * @param isSharedCpu isSharedCpu or {@code null} for none
   */
  public MachineType setIsSharedCpu(java.lang.Boolean isSharedCpu) {
    this.isSharedCpu = isSharedCpu;
    return this;
  }

  /**
   * [Output Only] The type of the resource. Always compute#machineType for machine types.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] The type of the resource. Always compute#machineType for machine types.
   * @param kind kind or {@code null} for none
   */
  public MachineType setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] Maximum persistent disks allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaximumPersistentDisks() {
    return maximumPersistentDisks;
  }

  /**
   * [Output Only] Maximum persistent disks allowed.
   * @param maximumPersistentDisks maximumPersistentDisks or {@code null} for none
   */
  public MachineType setMaximumPersistentDisks(java.lang.Integer maximumPersistentDisks) {
    this.maximumPersistentDisks = maximumPersistentDisks;
    return this;
  }

  /**
   * [Output Only] Maximum total persistent disks size (GB) allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaximumPersistentDisksSizeGb() {
    return maximumPersistentDisksSizeGb;
  }

  /**
   * [Output Only] Maximum total persistent disks size (GB) allowed.
   * @param maximumPersistentDisksSizeGb maximumPersistentDisksSizeGb or {@code null} for none
   */
  public MachineType setMaximumPersistentDisksSizeGb(java.lang.Long maximumPersistentDisksSizeGb) {
    this.maximumPersistentDisksSizeGb = maximumPersistentDisksSizeGb;
    return this;
  }

  /**
   * [Output Only] The amount of physical memory available to the instance, defined in MB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemoryMb() {
    return memoryMb;
  }

  /**
   * [Output Only] The amount of physical memory available to the instance, defined in MB.
   * @param memoryMb memoryMb or {@code null} for none
   */
  public MachineType setMemoryMb(java.lang.Integer memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  /**
   * [Output Only] Name of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Output Only] Name of the resource.
   * @param name name or {@code null} for none
   */
  public MachineType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<ScratchDisks> getScratchDisks() {
    return scratchDisks;
  }

  /**
   * [Output Only] A list of extended scratch disks assigned to the instance.
   * @param scratchDisks scratchDisks or {@code null} for none
   */
  public MachineType setScratchDisks(java.util.List<ScratchDisks> scratchDisks) {
    this.scratchDisks = scratchDisks;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public MachineType setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The name of the zone where the machine type resides, such as us-central1-a.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] The name of the zone where the machine type resides, such as us-central1-a.
   * @param zone zone or {@code null} for none
   */
  public MachineType setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public MachineType set(String fieldName, Object value) {
    return (MachineType) super.set(fieldName, value);
  }

  @Override
  public MachineType clone() {
    return (MachineType) super.clone();
  }

  /**
   * Model definition for MachineTypeScratchDisks.
   */
  public static final class ScratchDisks extends com.google.api.client.json.GenericJson {

    /**
     * Size of the scratch disk, defined in GB.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer diskGb;

    /**
     * Size of the scratch disk, defined in GB.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getDiskGb() {
      return diskGb;
    }

    /**
     * Size of the scratch disk, defined in GB.
     * @param diskGb diskGb or {@code null} for none
     */
    public ScratchDisks setDiskGb(java.lang.Integer diskGb) {
      this.diskGb = diskGb;
      return this;
    }

    @Override
    public ScratchDisks set(String fieldName, Object value) {
      return (ScratchDisks) super.set(fieldName, value);
    }

    @Override
    public ScratchDisks clone() {
      return (ScratchDisks) super.clone();
    }

  }

}
