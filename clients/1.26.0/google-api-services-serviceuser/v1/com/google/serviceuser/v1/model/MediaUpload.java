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

package com.google.serviceuser.v1.model;

/**
 * Defines the Media configuration for a service in case of an upload. Use this only for Scotty
 * Requests. Do not use this for media support using Bytestream, add instead
 * [][google.bytestream.RestByteStream] as an API to your configuration for Bytestream methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service User API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MediaUpload extends com.google.api.client.json.GenericJson {

  /**
   * A boolean that determines whether a notification for the completion of an upload should be sent
   * to the backend. These notifications will not be seen by the client and will not consume quota.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean completeNotification;

  /**
   * Name of the Scotty dropzone to use for the current API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dropzone;

  /**
   * Whether upload is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Optional maximum acceptable size for an upload. The size is specified in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxSize;

  /**
   * An array of mimetype patterns. Esf will only accept uploads that match one of the given
   * patterns.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> mimeTypes;

  /**
   * Whether to receive a notification for progress changes of media upload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean progressNotification;

  /**
   * Whether to receive a notification on the start of media upload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean startNotification;

  /**
   * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
   *
   * Specify name of the upload service if one is used for upload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uploadService;

  /**
   * A boolean that determines whether a notification for the completion of an upload should be sent
   * to the backend. These notifications will not be seen by the client and will not consume quota.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCompleteNotification() {
    return completeNotification;
  }

  /**
   * A boolean that determines whether a notification for the completion of an upload should be sent
   * to the backend. These notifications will not be seen by the client and will not consume quota.
   * @param completeNotification completeNotification or {@code null} for none
   */
  public MediaUpload setCompleteNotification(java.lang.Boolean completeNotification) {
    this.completeNotification = completeNotification;
    return this;
  }

  /**
   * Name of the Scotty dropzone to use for the current API.
   * @return value or {@code null} for none
   */
  public java.lang.String getDropzone() {
    return dropzone;
  }

  /**
   * Name of the Scotty dropzone to use for the current API.
   * @param dropzone dropzone or {@code null} for none
   */
  public MediaUpload setDropzone(java.lang.String dropzone) {
    this.dropzone = dropzone;
    return this;
  }

  /**
   * Whether upload is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether upload is enabled.
   * @param enabled enabled or {@code null} for none
   */
  public MediaUpload setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Optional maximum acceptable size for an upload. The size is specified in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxSize() {
    return maxSize;
  }

  /**
   * Optional maximum acceptable size for an upload. The size is specified in bytes.
   * @param maxSize maxSize or {@code null} for none
   */
  public MediaUpload setMaxSize(java.lang.Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

  /**
   * An array of mimetype patterns. Esf will only accept uploads that match one of the given
   * patterns.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMimeTypes() {
    return mimeTypes;
  }

  /**
   * An array of mimetype patterns. Esf will only accept uploads that match one of the given
   * patterns.
   * @param mimeTypes mimeTypes or {@code null} for none
   */
  public MediaUpload setMimeTypes(java.util.List<java.lang.String> mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  /**
   * Whether to receive a notification for progress changes of media upload.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProgressNotification() {
    return progressNotification;
  }

  /**
   * Whether to receive a notification for progress changes of media upload.
   * @param progressNotification progressNotification or {@code null} for none
   */
  public MediaUpload setProgressNotification(java.lang.Boolean progressNotification) {
    this.progressNotification = progressNotification;
    return this;
  }

  /**
   * Whether to receive a notification on the start of media upload.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStartNotification() {
    return startNotification;
  }

  /**
   * Whether to receive a notification on the start of media upload.
   * @param startNotification startNotification or {@code null} for none
   */
  public MediaUpload setStartNotification(java.lang.Boolean startNotification) {
    this.startNotification = startNotification;
    return this;
  }

  /**
   * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
   *
   * Specify name of the upload service if one is used for upload.
   * @return value or {@code null} for none
   */
  public java.lang.String getUploadService() {
    return uploadService;
  }

  /**
   * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
   *
   * Specify name of the upload service if one is used for upload.
   * @param uploadService uploadService or {@code null} for none
   */
  public MediaUpload setUploadService(java.lang.String uploadService) {
    this.uploadService = uploadService;
    return this;
  }

  @Override
  public MediaUpload set(String fieldName, Object value) {
    return (MediaUpload) super.set(fieldName, value);
  }

  @Override
  public MediaUpload clone() {
    return (MediaUpload) super.clone();
  }

}
