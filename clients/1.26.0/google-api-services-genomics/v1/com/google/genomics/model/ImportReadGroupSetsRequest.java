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

package com.google.genomics.model;

/**
 * The read group set import request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportReadGroupSetsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The ID of the dataset these read group sets will belong to. The caller must have
   * WRITE permissions to this dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetId;

  /**
   * The partition strategy describes how read groups are partitioned into read group sets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partitionStrategy;

  /**
   * The reference set to which the imported read group sets are aligned to, if any. The reference
   * names of this reference set must be a superset of those found in the imported file headers. If
   * no reference set id is provided, a best effort is made to associate with a matching reference
   * set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceSetId;

  /**
   * A list of URIs pointing at [BAM files](https://samtools.github.io/hts-specs/SAMv1.pdf) in
   * Google Cloud Storage. Those URIs can include wildcards (*), but do not add or remove matching
   * files before import has completed.
   *
   * Note that Google Cloud Storage object listing is only eventually consistent: files added may be
   * not be immediately visible to everyone. Thus, if using a wildcard it is preferable not to start
   * the import immediately after the files are created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sourceUris;

  /**
   * Required. The ID of the dataset these read group sets will belong to. The caller must have
   * WRITE permissions to this dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetId() {
    return datasetId;
  }

  /**
   * Required. The ID of the dataset these read group sets will belong to. The caller must have
   * WRITE permissions to this dataset.
   * @param datasetId datasetId or {@code null} for none
   */
  public ImportReadGroupSetsRequest setDatasetId(java.lang.String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * The partition strategy describes how read groups are partitioned into read group sets.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartitionStrategy() {
    return partitionStrategy;
  }

  /**
   * The partition strategy describes how read groups are partitioned into read group sets.
   * @param partitionStrategy partitionStrategy or {@code null} for none
   */
  public ImportReadGroupSetsRequest setPartitionStrategy(java.lang.String partitionStrategy) {
    this.partitionStrategy = partitionStrategy;
    return this;
  }

  /**
   * The reference set to which the imported read group sets are aligned to, if any. The reference
   * names of this reference set must be a superset of those found in the imported file headers. If
   * no reference set id is provided, a best effort is made to associate with a matching reference
   * set.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceSetId() {
    return referenceSetId;
  }

  /**
   * The reference set to which the imported read group sets are aligned to, if any. The reference
   * names of this reference set must be a superset of those found in the imported file headers. If
   * no reference set id is provided, a best effort is made to associate with a matching reference
   * set.
   * @param referenceSetId referenceSetId or {@code null} for none
   */
  public ImportReadGroupSetsRequest setReferenceSetId(java.lang.String referenceSetId) {
    this.referenceSetId = referenceSetId;
    return this;
  }

  /**
   * A list of URIs pointing at [BAM files](https://samtools.github.io/hts-specs/SAMv1.pdf) in
   * Google Cloud Storage. Those URIs can include wildcards (*), but do not add or remove matching
   * files before import has completed.
   *
   * Note that Google Cloud Storage object listing is only eventually consistent: files added may be
   * not be immediately visible to everyone. Thus, if using a wildcard it is preferable not to start
   * the import immediately after the files are created.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSourceUris() {
    return sourceUris;
  }

  /**
   * A list of URIs pointing at [BAM files](https://samtools.github.io/hts-specs/SAMv1.pdf) in
   * Google Cloud Storage. Those URIs can include wildcards (*), but do not add or remove matching
   * files before import has completed.
   *
   * Note that Google Cloud Storage object listing is only eventually consistent: files added may be
   * not be immediately visible to everyone. Thus, if using a wildcard it is preferable not to start
   * the import immediately after the files are created.
   * @param sourceUris sourceUris or {@code null} for none
   */
  public ImportReadGroupSetsRequest setSourceUris(java.util.List<java.lang.String> sourceUris) {
    this.sourceUris = sourceUris;
    return this;
  }

  @Override
  public ImportReadGroupSetsRequest set(String fieldName, Object value) {
    return (ImportReadGroupSetsRequest) super.set(fieldName, value);
  }

  @Override
  public ImportReadGroupSetsRequest clone() {
    return (ImportReadGroupSetsRequest) super.clone();
  }

}
