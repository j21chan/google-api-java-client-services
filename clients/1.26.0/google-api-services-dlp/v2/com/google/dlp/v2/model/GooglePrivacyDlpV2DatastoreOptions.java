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

package com.google.dlp.v2.model;

/**
 * Options defining a data set within Google Cloud Datastore.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2DatastoreOptions extends com.google.api.client.json.GenericJson {

  /**
   * The kind to process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2KindExpression kind;

  /**
   * A partition ID identifies a grouping of entities. The grouping is always by project and
   * namespace, however the namespace ID may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2PartitionId partitionId;

  /**
   * The kind to process.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2KindExpression getKind() {
    return kind;
  }

  /**
   * The kind to process.
   * @param kind kind or {@code null} for none
   */
  public GooglePrivacyDlpV2DatastoreOptions setKind(GooglePrivacyDlpV2KindExpression kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A partition ID identifies a grouping of entities. The grouping is always by project and
   * namespace, however the namespace ID may be empty.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2PartitionId getPartitionId() {
    return partitionId;
  }

  /**
   * A partition ID identifies a grouping of entities. The grouping is always by project and
   * namespace, however the namespace ID may be empty.
   * @param partitionId partitionId or {@code null} for none
   */
  public GooglePrivacyDlpV2DatastoreOptions setPartitionId(GooglePrivacyDlpV2PartitionId partitionId) {
    this.partitionId = partitionId;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DatastoreOptions set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DatastoreOptions) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DatastoreOptions clone() {
    return (GooglePrivacyDlpV2DatastoreOptions) super.clone();
  }

}
