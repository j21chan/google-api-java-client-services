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

package com.google.deploymentmanager.model;

/**
 * Options allows customized resource handling by Deployment Manager.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API V2Beta Methods.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Options extends com.google.api.client.json.GenericJson {

  /**
   * Options regarding how to thread async requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AsyncOptions> asyncOptions;

  static {
    // hack to force ProGuard to consider AsyncOptions used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AsyncOptions.class);
  }

  /**
   * The mappings that apply for requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InputMapping> inputMappings;

  static {
    // hack to force ProGuard to consider InputMapping used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(InputMapping.class);
  }

  /**
   * Options for how to validate and process properties on a resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ValidationOptions validationOptions;

  /**
   * Additional properties block described as a jsonSchema, these properties will never be part of
   * the json payload, but they can be consumed by InputMappings, this must be a valid json schema
   * draft-04. The properties specified here will be decouple in a different section. This schema
   * will be merged to the schema validation, and properties here will be extracted From the payload
   * and consumed explicitly by InputMappings. ex: field1: type: string field2: type: number
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String virtualProperties;

  /**
   * Options regarding how to thread async requests.
   * @return value or {@code null} for none
   */
  public java.util.List<AsyncOptions> getAsyncOptions() {
    return asyncOptions;
  }

  /**
   * Options regarding how to thread async requests.
   * @param asyncOptions asyncOptions or {@code null} for none
   */
  public Options setAsyncOptions(java.util.List<AsyncOptions> asyncOptions) {
    this.asyncOptions = asyncOptions;
    return this;
  }

  /**
   * The mappings that apply for requests.
   * @return value or {@code null} for none
   */
  public java.util.List<InputMapping> getInputMappings() {
    return inputMappings;
  }

  /**
   * The mappings that apply for requests.
   * @param inputMappings inputMappings or {@code null} for none
   */
  public Options setInputMappings(java.util.List<InputMapping> inputMappings) {
    this.inputMappings = inputMappings;
    return this;
  }

  /**
   * Options for how to validate and process properties on a resource.
   * @return value or {@code null} for none
   */
  public ValidationOptions getValidationOptions() {
    return validationOptions;
  }

  /**
   * Options for how to validate and process properties on a resource.
   * @param validationOptions validationOptions or {@code null} for none
   */
  public Options setValidationOptions(ValidationOptions validationOptions) {
    this.validationOptions = validationOptions;
    return this;
  }

  /**
   * Additional properties block described as a jsonSchema, these properties will never be part of
   * the json payload, but they can be consumed by InputMappings, this must be a valid json schema
   * draft-04. The properties specified here will be decouple in a different section. This schema
   * will be merged to the schema validation, and properties here will be extracted From the payload
   * and consumed explicitly by InputMappings. ex: field1: type: string field2: type: number
   * @return value or {@code null} for none
   */
  public java.lang.String getVirtualProperties() {
    return virtualProperties;
  }

  /**
   * Additional properties block described as a jsonSchema, these properties will never be part of
   * the json payload, but they can be consumed by InputMappings, this must be a valid json schema
   * draft-04. The properties specified here will be decouple in a different section. This schema
   * will be merged to the schema validation, and properties here will be extracted From the payload
   * and consumed explicitly by InputMappings. ex: field1: type: string field2: type: number
   * @param virtualProperties virtualProperties or {@code null} for none
   */
  public Options setVirtualProperties(java.lang.String virtualProperties) {
    this.virtualProperties = virtualProperties;
    return this;
  }

  @Override
  public Options set(String fieldName, Object value) {
    return (Options) super.set(fieldName, value);
  }

  @Override
  public Options clone() {
    return (Options) super.clone();
  }

}
