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

package com.google.replicapoolupdater.model;

/**
 * Update of a single instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Compute Engine Instance Group Updater API. For
 * a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceUpdate extends com.google.api.client.json.GenericJson {

  /**
   * Errors that occurred during the instance update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Error error;

  /**
   * Fully-qualified URL of the instance being updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * Status of the instance update. Possible values are: - "PENDING": The instance update is pending
   * execution.  - "ROLLING_FORWARD": The instance update is going forward.  - "ROLLING_BACK": The
   * instance update is being rolled back.  - "PAUSED": The instance update is temporarily paused
   * (inactive).  - "ROLLED_OUT": The instance update is finished, the instance is running the new
   * template.  - "ROLLED_BACK": The instance update is finished, the instance has been reverted to
   * the previous template.  - "CANCELLED": The instance update is paused and no longer can be
   * resumed, undefined in which template the instance is running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Errors that occurred during the instance update.
   * @return value or {@code null} for none
   */
  public Error getError() {
    return error;
  }

  /**
   * Errors that occurred during the instance update.
   * @param error error or {@code null} for none
   */
  public InstanceUpdate setError(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Fully-qualified URL of the instance being updated.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * Fully-qualified URL of the instance being updated.
   * @param instance instance or {@code null} for none
   */
  public InstanceUpdate setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Status of the instance update. Possible values are: - "PENDING": The instance update is pending
   * execution.  - "ROLLING_FORWARD": The instance update is going forward.  - "ROLLING_BACK": The
   * instance update is being rolled back.  - "PAUSED": The instance update is temporarily paused
   * (inactive).  - "ROLLED_OUT": The instance update is finished, the instance is running the new
   * template.  - "ROLLED_BACK": The instance update is finished, the instance has been reverted to
   * the previous template.  - "CANCELLED": The instance update is paused and no longer can be
   * resumed, undefined in which template the instance is running.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the instance update. Possible values are: - "PENDING": The instance update is pending
   * execution.  - "ROLLING_FORWARD": The instance update is going forward.  - "ROLLING_BACK": The
   * instance update is being rolled back.  - "PAUSED": The instance update is temporarily paused
   * (inactive).  - "ROLLED_OUT": The instance update is finished, the instance is running the new
   * template.  - "ROLLED_BACK": The instance update is finished, the instance has been reverted to
   * the previous template.  - "CANCELLED": The instance update is paused and no longer can be
   * resumed, undefined in which template the instance is running.
   * @param status status or {@code null} for none
   */
  public InstanceUpdate setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public InstanceUpdate set(String fieldName, Object value) {
    return (InstanceUpdate) super.set(fieldName, value);
  }

  @Override
  public InstanceUpdate clone() {
    return (InstanceUpdate) super.clone();
  }

  /**
   * Errors that occurred during the instance update.
   */
  public static final class Error extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Errors> errors;

    static {
      // hack to force ProGuard to consider Errors used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Errors.class);
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @return value or {@code null} for none
     */
    public java.util.List<Errors> getErrors() {
      return errors;
    }

    /**
     * [Output Only] The array of errors encountered while processing this operation.
     * @param errors errors or {@code null} for none
     */
    public Error setErrors(java.util.List<Errors> errors) {
      this.errors = errors;
      return this;
    }

    @Override
    public Error set(String fieldName, Object value) {
      return (Error) super.set(fieldName, value);
    }

    @Override
    public Error clone() {
      return (Error) super.clone();
    }

    /**
     * Model definition for InstanceUpdateErrorErrors.
     */
    public static final class Errors extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] The error type identifier for this error.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String code;

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String location;

      /**
       * [Output Only] An optional, human-readable error message.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String message;

      /**
       * [Output Only] The error type identifier for this error.
       * @return value or {@code null} for none
       */
      public java.lang.String getCode() {
        return code;
      }

      /**
       * [Output Only] The error type identifier for this error.
       * @param code code or {@code null} for none
       */
      public Errors setCode(java.lang.String code) {
        this.code = code;
        return this;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @return value or {@code null} for none
       */
      public java.lang.String getLocation() {
        return location;
      }

      /**
       * [Output Only] Indicates the field in the request that caused the error. This property is
       * optional.
       * @param location location or {@code null} for none
       */
      public Errors setLocation(java.lang.String location) {
        this.location = location;
        return this;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @return value or {@code null} for none
       */
      public java.lang.String getMessage() {
        return message;
      }

      /**
       * [Output Only] An optional, human-readable error message.
       * @param message message or {@code null} for none
       */
      public Errors setMessage(java.lang.String message) {
        this.message = message;
        return this;
      }

      @Override
      public Errors set(String fieldName, Object value) {
        return (Errors) super.set(fieldName, value);
      }

      @Override
      public Errors clone() {
        return (Errors) super.clone();
      }

    }
  }

}
