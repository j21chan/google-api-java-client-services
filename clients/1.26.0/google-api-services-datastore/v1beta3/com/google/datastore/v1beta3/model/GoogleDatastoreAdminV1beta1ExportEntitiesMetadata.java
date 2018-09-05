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

package com.google.datastore.v1beta3.model;

/**
 * Metadata for ExportEntities operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1beta1ExportEntitiesMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Metadata common to all Datastore Admin operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1beta1CommonMetadata common;

  /**
   * Description of which entities are being exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1beta1EntityFilter entityFilter;

  /**
   * Location for the export metadata and data files. This will be the same value as the
   * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix field. The final output
   * location is provided in google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUrlPrefix;

  /**
   * An estimate of the number of bytes processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1beta1Progress progressBytes;

  /**
   * An estimate of the number of entities processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1beta1Progress progressEntities;

  /**
   * Metadata common to all Datastore Admin operations.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1CommonMetadata getCommon() {
    return common;
  }

  /**
   * Metadata common to all Datastore Admin operations.
   * @param common common or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1ExportEntitiesMetadata setCommon(GoogleDatastoreAdminV1beta1CommonMetadata common) {
    this.common = common;
    return this;
  }

  /**
   * Description of which entities are being exported.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1EntityFilter getEntityFilter() {
    return entityFilter;
  }

  /**
   * Description of which entities are being exported.
   * @param entityFilter entityFilter or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1ExportEntitiesMetadata setEntityFilter(GoogleDatastoreAdminV1beta1EntityFilter entityFilter) {
    this.entityFilter = entityFilter;
    return this;
  }

  /**
   * Location for the export metadata and data files. This will be the same value as the
   * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix field. The final output
   * location is provided in google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUrlPrefix() {
    return outputUrlPrefix;
  }

  /**
   * Location for the export metadata and data files. This will be the same value as the
   * google.datastore.admin.v1beta1.ExportEntitiesRequest.output_url_prefix field. The final output
   * location is provided in google.datastore.admin.v1beta1.ExportEntitiesResponse.output_url.
   * @param outputUrlPrefix outputUrlPrefix or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1ExportEntitiesMetadata setOutputUrlPrefix(java.lang.String outputUrlPrefix) {
    this.outputUrlPrefix = outputUrlPrefix;
    return this;
  }

  /**
   * An estimate of the number of bytes processed.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1Progress getProgressBytes() {
    return progressBytes;
  }

  /**
   * An estimate of the number of bytes processed.
   * @param progressBytes progressBytes or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1ExportEntitiesMetadata setProgressBytes(GoogleDatastoreAdminV1beta1Progress progressBytes) {
    this.progressBytes = progressBytes;
    return this;
  }

  /**
   * An estimate of the number of entities processed.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1Progress getProgressEntities() {
    return progressEntities;
  }

  /**
   * An estimate of the number of entities processed.
   * @param progressEntities progressEntities or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1ExportEntitiesMetadata setProgressEntities(GoogleDatastoreAdminV1beta1Progress progressEntities) {
    this.progressEntities = progressEntities;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1beta1ExportEntitiesMetadata set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1beta1ExportEntitiesMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1beta1ExportEntitiesMetadata clone() {
    return (GoogleDatastoreAdminV1beta1ExportEntitiesMetadata) super.clone();
  }

}
