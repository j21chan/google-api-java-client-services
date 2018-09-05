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

package com.google.storage.model;

/**
 * An object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StorageObject extends com.google.api.client.json.GenericJson {

  /**
   * Access controls on the object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ObjectAccessControl> acl;

  /**
   * The name of the bucket containing this object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucket;

  /**
   * Cache-Control directive for the object data. If omitted, and the object is accessible to all
   * anonymous users, the default will be public, max-age=3600.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cacheControl;

  /**
   * Number of underlying components that make up this object. Components are accumulated by compose
   * operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer componentCount;

  /**
   * Content-Disposition of the object data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentDisposition;

  /**
   * Content-Encoding of the object data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentEncoding;

  /**
   * Content-Language of the object data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentLanguage;

  /**
   * Content-Type of the object data. If an object is stored without a Content-Type, it is served as
   * application/octet-stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte
   * order. For more information about using the CRC32c checksum, see Hashes and ETags: Best
   * Practices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crc32c;

  /**
   * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryption customerEncryption;

  /**
   * HTTP 1.1 Entity tag for the object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Whether an object is under event-based hold. Event-based hold is a way to retain objects until
   * an event occurs, which is signified by the hold's release (i.e. this value is set to false).
   * After being released (set to false), such objects will be subject to bucket-level retention (if
   * any). One sample use case of this flag is for banks to hold loan documents for at least 3 years
   * after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan
   * being paid in full. In this example, these objects will be held intact for any number of years
   * until the event has occurred (event-based hold on the object is released) and then 3 more years
   * after that. That means retention duration of the objects begins from the moment event-based
   * hold transitioned from true to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean eventBasedHold;

  /**
   * The content generation of this object. Used for object versioning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long generation;

  /**
   * The ID of the object, including the bucket name, object name, and generation number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The kind of item this is. For objects, this is always storage#object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Cloud KMS Key used to encrypt this object, if the object is encrypted by such a key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see
   * Hashes and ETags: Best Practices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5Hash;

  /**
   * Media download link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaLink;

  /**
   * User-provided metadata, in key/value pairs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * The version of the metadata for this object at this generation. Used for preconditions and for
   * detecting changes in metadata. A metageneration number is only meaningful in the context of a
   * particular generation of a particular object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long metageneration;

  /**
   * The name of the object. Required if not specified by URL parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The owner of the object. This will always be the uploader of the object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Owner owner;

  /**
   * A server-determined value that specifies the earliest time that the object's retention period
   * expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with
   * an active event-based hold, since retention expiration is unknown until the hold is removed.
   * Note 2: This value can be provided even when temporary hold is set (so that the user can reason
   * about policy without having to first unset the temporary hold).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime retentionExpirationTime;

  /**
   * The link to this object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Content-Length of the data in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger size;

  /**
   * Storage class of the object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageClass;

  /**
   * Whether an object is under temporary hold. While this flag is set to true, the object is
   * protected against deletion and overwrites. A common use case of this flag is regulatory
   * investigations where objects need to be retained while the investigation is ongoing. Note that
   * unlike event-based hold, temporary hold does not impact retention expiration time of an object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean temporaryHold;

  /**
   * The creation time of the object in RFC 3339 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime timeCreated;

  /**
   * The deletion time of the object in RFC 3339 format. Will be returned if and only if this
   * version of the object has been deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime timeDeleted;

  /**
   * The time at which the object's storage class was last changed. When the object is initially
   * created, it will be set to timeCreated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime timeStorageClassUpdated;

  /**
   * The modification time of the object metadata in RFC 3339 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * Access controls on the object.
   * @return value or {@code null} for none
   */
  public java.util.List<ObjectAccessControl> getAcl() {
    return acl;
  }

  /**
   * Access controls on the object.
   * @param acl acl or {@code null} for none
   */
  public StorageObject setAcl(java.util.List<ObjectAccessControl> acl) {
    this.acl = acl;
    return this;
  }

  /**
   * The name of the bucket containing this object.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucket() {
    return bucket;
  }

  /**
   * The name of the bucket containing this object.
   * @param bucket bucket or {@code null} for none
   */
  public StorageObject setBucket(java.lang.String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Cache-Control directive for the object data. If omitted, and the object is accessible to all
   * anonymous users, the default will be public, max-age=3600.
   * @return value or {@code null} for none
   */
  public java.lang.String getCacheControl() {
    return cacheControl;
  }

  /**
   * Cache-Control directive for the object data. If omitted, and the object is accessible to all
   * anonymous users, the default will be public, max-age=3600.
   * @param cacheControl cacheControl or {@code null} for none
   */
  public StorageObject setCacheControl(java.lang.String cacheControl) {
    this.cacheControl = cacheControl;
    return this;
  }

  /**
   * Number of underlying components that make up this object. Components are accumulated by compose
   * operations.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getComponentCount() {
    return componentCount;
  }

  /**
   * Number of underlying components that make up this object. Components are accumulated by compose
   * operations.
   * @param componentCount componentCount or {@code null} for none
   */
  public StorageObject setComponentCount(java.lang.Integer componentCount) {
    this.componentCount = componentCount;
    return this;
  }

  /**
   * Content-Disposition of the object data.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentDisposition() {
    return contentDisposition;
  }

  /**
   * Content-Disposition of the object data.
   * @param contentDisposition contentDisposition or {@code null} for none
   */
  public StorageObject setContentDisposition(java.lang.String contentDisposition) {
    this.contentDisposition = contentDisposition;
    return this;
  }

  /**
   * Content-Encoding of the object data.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentEncoding() {
    return contentEncoding;
  }

  /**
   * Content-Encoding of the object data.
   * @param contentEncoding contentEncoding or {@code null} for none
   */
  public StorageObject setContentEncoding(java.lang.String contentEncoding) {
    this.contentEncoding = contentEncoding;
    return this;
  }

  /**
   * Content-Language of the object data.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentLanguage() {
    return contentLanguage;
  }

  /**
   * Content-Language of the object data.
   * @param contentLanguage contentLanguage or {@code null} for none
   */
  public StorageObject setContentLanguage(java.lang.String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * Content-Type of the object data. If an object is stored without a Content-Type, it is served as
   * application/octet-stream.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * Content-Type of the object data. If an object is stored without a Content-Type, it is served as
   * application/octet-stream.
   * @param contentType contentType or {@code null} for none
   */
  public StorageObject setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte
   * order. For more information about using the CRC32c checksum, see Hashes and ETags: Best
   * Practices.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrc32c() {
    return crc32c;
  }

  /**
   * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte
   * order. For more information about using the CRC32c checksum, see Hashes and ETags: Best
   * Practices.
   * @param crc32c crc32c or {@code null} for none
   */
  public StorageObject setCrc32c(java.lang.String crc32c) {
    this.crc32c = crc32c;
    return this;
  }

  /**
   * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
   * @return value or {@code null} for none
   */
  public CustomerEncryption getCustomerEncryption() {
    return customerEncryption;
  }

  /**
   * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
   * @param customerEncryption customerEncryption or {@code null} for none
   */
  public StorageObject setCustomerEncryption(CustomerEncryption customerEncryption) {
    this.customerEncryption = customerEncryption;
    return this;
  }

  /**
   * HTTP 1.1 Entity tag for the object.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * HTTP 1.1 Entity tag for the object.
   * @param etag etag or {@code null} for none
   */
  public StorageObject setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Whether an object is under event-based hold. Event-based hold is a way to retain objects until
   * an event occurs, which is signified by the hold's release (i.e. this value is set to false).
   * After being released (set to false), such objects will be subject to bucket-level retention (if
   * any). One sample use case of this flag is for banks to hold loan documents for at least 3 years
   * after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan
   * being paid in full. In this example, these objects will be held intact for any number of years
   * until the event has occurred (event-based hold on the object is released) and then 3 more years
   * after that. That means retention duration of the objects begins from the moment event-based
   * hold transitioned from true to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEventBasedHold() {
    return eventBasedHold;
  }

  /**
   * Whether an object is under event-based hold. Event-based hold is a way to retain objects until
   * an event occurs, which is signified by the hold's release (i.e. this value is set to false).
   * After being released (set to false), such objects will be subject to bucket-level retention (if
   * any). One sample use case of this flag is for banks to hold loan documents for at least 3 years
   * after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan
   * being paid in full. In this example, these objects will be held intact for any number of years
   * until the event has occurred (event-based hold on the object is released) and then 3 more years
   * after that. That means retention duration of the objects begins from the moment event-based
   * hold transitioned from true to false.
   * @param eventBasedHold eventBasedHold or {@code null} for none
   */
  public StorageObject setEventBasedHold(java.lang.Boolean eventBasedHold) {
    this.eventBasedHold = eventBasedHold;
    return this;
  }

  /**
   * The content generation of this object. Used for object versioning.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGeneration() {
    return generation;
  }

  /**
   * The content generation of this object. Used for object versioning.
   * @param generation generation or {@code null} for none
   */
  public StorageObject setGeneration(java.lang.Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The ID of the object, including the bucket name, object name, and generation number.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the object, including the bucket name, object name, and generation number.
   * @param id id or {@code null} for none
   */
  public StorageObject setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The kind of item this is. For objects, this is always storage#object.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For objects, this is always storage#object.
   * @param kind kind or {@code null} for none
   */
  public StorageObject setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Cloud KMS Key used to encrypt this object, if the object is encrypted by such a key.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * Cloud KMS Key used to encrypt this object, if the object is encrypted by such a key.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public StorageObject setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see
   * Hashes and ETags: Best Practices.
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5Hash() {
    return md5Hash;
  }

  /**
   * MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see
   * Hashes and ETags: Best Practices.
   * @param md5Hash md5Hash or {@code null} for none
   */
  public StorageObject setMd5Hash(java.lang.String md5Hash) {
    this.md5Hash = md5Hash;
    return this;
  }

  /**
   * Media download link.
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaLink() {
    return mediaLink;
  }

  /**
   * Media download link.
   * @param mediaLink mediaLink or {@code null} for none
   */
  public StorageObject setMediaLink(java.lang.String mediaLink) {
    this.mediaLink = mediaLink;
    return this;
  }

  /**
   * User-provided metadata, in key/value pairs.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * User-provided metadata, in key/value pairs.
   * @param metadata metadata or {@code null} for none
   */
  public StorageObject setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The version of the metadata for this object at this generation. Used for preconditions and for
   * detecting changes in metadata. A metageneration number is only meaningful in the context of a
   * particular generation of a particular object.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMetageneration() {
    return metageneration;
  }

  /**
   * The version of the metadata for this object at this generation. Used for preconditions and for
   * detecting changes in metadata. A metageneration number is only meaningful in the context of a
   * particular generation of a particular object.
   * @param metageneration metageneration or {@code null} for none
   */
  public StorageObject setMetageneration(java.lang.Long metageneration) {
    this.metageneration = metageneration;
    return this;
  }

  /**
   * The name of the object. Required if not specified by URL parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the object. Required if not specified by URL parameter.
   * @param name name or {@code null} for none
   */
  public StorageObject setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The owner of the object. This will always be the uploader of the object.
   * @return value or {@code null} for none
   */
  public Owner getOwner() {
    return owner;
  }

  /**
   * The owner of the object. This will always be the uploader of the object.
   * @param owner owner or {@code null} for none
   */
  public StorageObject setOwner(Owner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * A server-determined value that specifies the earliest time that the object's retention period
   * expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with
   * an active event-based hold, since retention expiration is unknown until the hold is removed.
   * Note 2: This value can be provided even when temporary hold is set (so that the user can reason
   * about policy without having to first unset the temporary hold).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getRetentionExpirationTime() {
    return retentionExpirationTime;
  }

  /**
   * A server-determined value that specifies the earliest time that the object's retention period
   * expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with
   * an active event-based hold, since retention expiration is unknown until the hold is removed.
   * Note 2: This value can be provided even when temporary hold is set (so that the user can reason
   * about policy without having to first unset the temporary hold).
   * @param retentionExpirationTime retentionExpirationTime or {@code null} for none
   */
  public StorageObject setRetentionExpirationTime(com.google.api.client.util.DateTime retentionExpirationTime) {
    this.retentionExpirationTime = retentionExpirationTime;
    return this;
  }

  /**
   * The link to this object.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The link to this object.
   * @param selfLink selfLink or {@code null} for none
   */
  public StorageObject setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Content-Length of the data in bytes.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getSize() {
    return size;
  }

  /**
   * Content-Length of the data in bytes.
   * @param size size or {@code null} for none
   */
  public StorageObject setSize(java.math.BigInteger size) {
    this.size = size;
    return this;
  }

  /**
   * Storage class of the object.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageClass() {
    return storageClass;
  }

  /**
   * Storage class of the object.
   * @param storageClass storageClass or {@code null} for none
   */
  public StorageObject setStorageClass(java.lang.String storageClass) {
    this.storageClass = storageClass;
    return this;
  }

  /**
   * Whether an object is under temporary hold. While this flag is set to true, the object is
   * protected against deletion and overwrites. A common use case of this flag is regulatory
   * investigations where objects need to be retained while the investigation is ongoing. Note that
   * unlike event-based hold, temporary hold does not impact retention expiration time of an object.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTemporaryHold() {
    return temporaryHold;
  }

  /**
   * Whether an object is under temporary hold. While this flag is set to true, the object is
   * protected against deletion and overwrites. A common use case of this flag is regulatory
   * investigations where objects need to be retained while the investigation is ongoing. Note that
   * unlike event-based hold, temporary hold does not impact retention expiration time of an object.
   * @param temporaryHold temporaryHold or {@code null} for none
   */
  public StorageObject setTemporaryHold(java.lang.Boolean temporaryHold) {
    this.temporaryHold = temporaryHold;
    return this;
  }

  /**
   * The creation time of the object in RFC 3339 format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getTimeCreated() {
    return timeCreated;
  }

  /**
   * The creation time of the object in RFC 3339 format.
   * @param timeCreated timeCreated or {@code null} for none
   */
  public StorageObject setTimeCreated(com.google.api.client.util.DateTime timeCreated) {
    this.timeCreated = timeCreated;
    return this;
  }

  /**
   * The deletion time of the object in RFC 3339 format. Will be returned if and only if this
   * version of the object has been deleted.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getTimeDeleted() {
    return timeDeleted;
  }

  /**
   * The deletion time of the object in RFC 3339 format. Will be returned if and only if this
   * version of the object has been deleted.
   * @param timeDeleted timeDeleted or {@code null} for none
   */
  public StorageObject setTimeDeleted(com.google.api.client.util.DateTime timeDeleted) {
    this.timeDeleted = timeDeleted;
    return this;
  }

  /**
   * The time at which the object's storage class was last changed. When the object is initially
   * created, it will be set to timeCreated.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getTimeStorageClassUpdated() {
    return timeStorageClassUpdated;
  }

  /**
   * The time at which the object's storage class was last changed. When the object is initially
   * created, it will be set to timeCreated.
   * @param timeStorageClassUpdated timeStorageClassUpdated or {@code null} for none
   */
  public StorageObject setTimeStorageClassUpdated(com.google.api.client.util.DateTime timeStorageClassUpdated) {
    this.timeStorageClassUpdated = timeStorageClassUpdated;
    return this;
  }

  /**
   * The modification time of the object metadata in RFC 3339 format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * The modification time of the object metadata in RFC 3339 format.
   * @param updated updated or {@code null} for none
   */
  public StorageObject setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  @Override
  public StorageObject set(String fieldName, Object value) {
    return (StorageObject) super.set(fieldName, value);
  }

  @Override
  public StorageObject clone() {
    return (StorageObject) super.clone();
  }

  /**
   * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
   */
  public static final class CustomerEncryption extends com.google.api.client.json.GenericJson {

    /**
     * The encryption algorithm.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String encryptionAlgorithm;

    /**
     * SHA256 hash value of the encryption key.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String keySha256;

    /**
     * The encryption algorithm.
     * @return value or {@code null} for none
     */
    public java.lang.String getEncryptionAlgorithm() {
      return encryptionAlgorithm;
    }

    /**
     * The encryption algorithm.
     * @param encryptionAlgorithm encryptionAlgorithm or {@code null} for none
     */
    public CustomerEncryption setEncryptionAlgorithm(java.lang.String encryptionAlgorithm) {
      this.encryptionAlgorithm = encryptionAlgorithm;
      return this;
    }

    /**
     * SHA256 hash value of the encryption key.
     * @return value or {@code null} for none
     */
    public java.lang.String getKeySha256() {
      return keySha256;
    }

    /**
     * SHA256 hash value of the encryption key.
     * @param keySha256 keySha256 or {@code null} for none
     */
    public CustomerEncryption setKeySha256(java.lang.String keySha256) {
      this.keySha256 = keySha256;
      return this;
    }

    @Override
    public CustomerEncryption set(String fieldName, Object value) {
      return (CustomerEncryption) super.set(fieldName, value);
    }

    @Override
    public CustomerEncryption clone() {
      return (CustomerEncryption) super.clone();
    }

  }

  /**
   * The owner of the object. This will always be the uploader of the object.
   */
  public static final class Owner extends com.google.api.client.json.GenericJson {

    /**
     * The entity, in the form user-userId.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String entity;

    /**
     * The ID for the entity.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String entityId;

    /**
     * The entity, in the form user-userId.
     * @return value or {@code null} for none
     */
    public java.lang.String getEntity() {
      return entity;
    }

    /**
     * The entity, in the form user-userId.
     * @param entity entity or {@code null} for none
     */
    public Owner setEntity(java.lang.String entity) {
      this.entity = entity;
      return this;
    }

    /**
     * The ID for the entity.
     * @return value or {@code null} for none
     */
    public java.lang.String getEntityId() {
      return entityId;
    }

    /**
     * The ID for the entity.
     * @param entityId entityId or {@code null} for none
     */
    public Owner setEntityId(java.lang.String entityId) {
      this.entityId = entityId;
      return this;
    }

    @Override
    public Owner set(String fieldName, Object value) {
      return (Owner) super.set(fieldName, value);
    }

    @Override
    public Owner clone() {
      return (Owner) super.clone();
    }

  }

}
