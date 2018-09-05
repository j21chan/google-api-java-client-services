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

package com.google.books.model;

/**
 * Model definition for Annotationdata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Annotationdata extends com.google.api.client.json.GenericJson {

  /**
   * The type of annotation this data is for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object data;

  /**
   * Base64 encoded data for this annotation data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("encoded_data")
  private java.lang.String encodedData;

  /**
   * Unique id for this annotation data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Resource Type
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The Layer id for this data. *
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layerId;

  /**
   * URL for this resource. *
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * The volume id for this data. *
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String volumeId;

  /**
   * The type of annotation this data is for.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationType() {
    return annotationType;
  }

  /**
   * The type of annotation this data is for.
   * @param annotationType annotationType or {@code null} for none
   */
  public Annotationdata setAnnotationType(java.lang.String annotationType) {
    this.annotationType = annotationType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getData() {
    return data;
  }

  /**
   * @param data data or {@code null} for none
   */
  public Annotationdata setData(java.lang.Object data) {
    this.data = data;
    return this;
  }

  /**
   * Base64 encoded data for this annotation data.
   * @see #decodeEncodedData()
   * @return value or {@code null} for none
   */
  public java.lang.String getEncodedData() {
    return encodedData;
  }

  /**
   * Base64 encoded data for this annotation data.
   * @see #getEncodedData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEncodedData() {
    return com.google.api.client.util.Base64.decodeBase64(encodedData);
  }

  /**
   * Base64 encoded data for this annotation data.
   * @see #encodeEncodedData()
   * @param encodedData encodedData or {@code null} for none
   */
  public Annotationdata setEncodedData(java.lang.String encodedData) {
    this.encodedData = encodedData;
    return this;
  }

  /**
   * Base64 encoded data for this annotation data.
   * @see #setEncodedData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Annotationdata encodeEncodedData(byte[] encodedData) {
    this.encodedData = com.google.api.client.util.Base64.encodeBase64URLSafeString(encodedData);
    return this;
  }

  /**
   * Unique id for this annotation data.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique id for this annotation data.
   * @param id id or {@code null} for none
   */
  public Annotationdata setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Resource Type
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource Type
   * @param kind kind or {@code null} for none
   */
  public Annotationdata setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The Layer id for this data. *
   * @return value or {@code null} for none
   */
  public java.lang.String getLayerId() {
    return layerId;
  }

  /**
   * The Layer id for this data. *
   * @param layerId layerId or {@code null} for none
   */
  public Annotationdata setLayerId(java.lang.String layerId) {
    this.layerId = layerId;
    return this;
  }

  /**
   * URL for this resource. *
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * URL for this resource. *
   * @param selfLink selfLink or {@code null} for none
   */
  public Annotationdata setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format).
   * @param updated updated or {@code null} for none
   */
  public Annotationdata setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The volume id for this data. *
   * @return value or {@code null} for none
   */
  public java.lang.String getVolumeId() {
    return volumeId;
  }

  /**
   * The volume id for this data. *
   * @param volumeId volumeId or {@code null} for none
   */
  public Annotationdata setVolumeId(java.lang.String volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  @Override
  public Annotationdata set(String fieldName, Object value) {
    return (Annotationdata) super.set(fieldName, value);
  }

  @Override
  public Annotationdata clone() {
    return (Annotationdata) super.clone();
  }

}
