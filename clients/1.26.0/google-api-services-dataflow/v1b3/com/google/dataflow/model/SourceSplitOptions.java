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

package com.google.dataflow.model;

/**
 * Hints for splitting a Source into bundles (parts for parallel processing) using
 * SourceSplitRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceSplitOptions extends com.google.api.client.json.GenericJson {

  /**
   * The source should be split into a set of bundles where the estimated size of each is
   * approximately this many bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long desiredBundleSizeBytes;

  /**
   * DEPRECATED in favor of desired_bundle_size_bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long desiredShardSizeBytes;

  /**
   * The source should be split into a set of bundles where the estimated size of each is
   * approximately this many bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDesiredBundleSizeBytes() {
    return desiredBundleSizeBytes;
  }

  /**
   * The source should be split into a set of bundles where the estimated size of each is
   * approximately this many bytes.
   * @param desiredBundleSizeBytes desiredBundleSizeBytes or {@code null} for none
   */
  public SourceSplitOptions setDesiredBundleSizeBytes(java.lang.Long desiredBundleSizeBytes) {
    this.desiredBundleSizeBytes = desiredBundleSizeBytes;
    return this;
  }

  /**
   * DEPRECATED in favor of desired_bundle_size_bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDesiredShardSizeBytes() {
    return desiredShardSizeBytes;
  }

  /**
   * DEPRECATED in favor of desired_bundle_size_bytes.
   * @param desiredShardSizeBytes desiredShardSizeBytes or {@code null} for none
   */
  public SourceSplitOptions setDesiredShardSizeBytes(java.lang.Long desiredShardSizeBytes) {
    this.desiredShardSizeBytes = desiredShardSizeBytes;
    return this;
  }

  @Override
  public SourceSplitOptions set(String fieldName, Object value) {
    return (SourceSplitOptions) super.set(fieldName, value);
  }

  @Override
  public SourceSplitOptions clone() {
    return (SourceSplitOptions) super.clone();
  }

}
