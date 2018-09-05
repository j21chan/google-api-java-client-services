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

package com.google.spanner.v1.model;

/**
 * The response for PartitionQuery or PartitionRead
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartitionResponse extends com.google.api.client.json.GenericJson {

  /**
   * Partitions created by this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Partition> partitions;

  static {
    // hack to force ProGuard to consider Partition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Partition.class);
  }

  /**
   * Transaction created by this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Transaction transaction;

  /**
   * Partitions created by this request.
   * @return value or {@code null} for none
   */
  public java.util.List<Partition> getPartitions() {
    return partitions;
  }

  /**
   * Partitions created by this request.
   * @param partitions partitions or {@code null} for none
   */
  public PartitionResponse setPartitions(java.util.List<Partition> partitions) {
    this.partitions = partitions;
    return this;
  }

  /**
   * Transaction created by this request.
   * @return value or {@code null} for none
   */
  public Transaction getTransaction() {
    return transaction;
  }

  /**
   * Transaction created by this request.
   * @param transaction transaction or {@code null} for none
   */
  public PartitionResponse setTransaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

  @Override
  public PartitionResponse set(String fieldName, Object value) {
    return (PartitionResponse) super.set(fieldName, value);
  }

  @Override
  public PartitionResponse clone() {
    return (PartitionResponse) super.clone();
  }

}
