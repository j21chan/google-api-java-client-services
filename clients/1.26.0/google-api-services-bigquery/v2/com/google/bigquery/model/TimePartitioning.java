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

package com.google.bigquery.model;

/**
 * Model definition for TimePartitioning.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimePartitioning extends com.google.api.client.json.GenericJson {

  /**
   * [Optional] Number of milliseconds for which to keep the storage for partitions in the table.
   * The storage in a partition will have an expiration time of its partition time plus this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expirationMs;

  /**
   * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either
   * '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified,
   * the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE
   * field. Its mode must be NULLABLE or REQUIRED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String field;

  /**
   * [Beta] [Optional] If set to true, queries over this table require a partition filter that can
   * be used for partition elimination to be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requirePartitionFilter;

  /**
   * [Required] The only type supported is DAY, which will generate one partition per day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * [Optional] Number of milliseconds for which to keep the storage for partitions in the table.
   * The storage in a partition will have an expiration time of its partition time plus this value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpirationMs() {
    return expirationMs;
  }

  /**
   * [Optional] Number of milliseconds for which to keep the storage for partitions in the table.
   * The storage in a partition will have an expiration time of its partition time plus this value.
   * @param expirationMs expirationMs or {@code null} for none
   */
  public TimePartitioning setExpirationMs(java.lang.Long expirationMs) {
    this.expirationMs = expirationMs;
    return this;
  }

  /**
   * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either
   * '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified,
   * the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE
   * field. Its mode must be NULLABLE or REQUIRED.
   * @return value or {@code null} for none
   */
  public java.lang.String getField() {
    return field;
  }

  /**
   * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either
   * '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified,
   * the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE
   * field. Its mode must be NULLABLE or REQUIRED.
   * @param field field or {@code null} for none
   */
  public TimePartitioning setField(java.lang.String field) {
    this.field = field;
    return this;
  }

  /**
   * [Beta] [Optional] If set to true, queries over this table require a partition filter that can
   * be used for partition elimination to be specified.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequirePartitionFilter() {
    return requirePartitionFilter;
  }

  /**
   * [Beta] [Optional] If set to true, queries over this table require a partition filter that can
   * be used for partition elimination to be specified.
   * @param requirePartitionFilter requirePartitionFilter or {@code null} for none
   */
  public TimePartitioning setRequirePartitionFilter(java.lang.Boolean requirePartitionFilter) {
    this.requirePartitionFilter = requirePartitionFilter;
    return this;
  }

  /**
   * Convenience method that returns only {@link Boolean#TRUE} or {@link Boolean#FALSE}.
   *
   * <p>
   * Boolean properties can have four possible values:
   * {@code null}, {@link com.google.api.client.util.Data#NULL_BOOLEAN}, {@link Boolean#TRUE}
   * or {@link Boolean#FALSE}.
   * </p>
   *
   * <p>
   * This method returns {@link Boolean#TRUE} if the default of the property is {@link Boolean#TRUE}
   * and it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
   * {@link Boolean#FALSE} is returned if the default of the property is {@link Boolean#FALSE} and
   * it is {@code null} or {@link com.google.api.client.util.Data#NULL_BOOLEAN}.
   * </p>
   *
   * <p>
   *[ Beta] [Optional] If set to true, queries over this table require a partition filter that can be
[ used for partition elimination to be specified.
   * </p>
   */
  public boolean isRequirePartitionFilter() {
    if (requirePartitionFilter == null || requirePartitionFilter == com.google.api.client.util.Data.NULL_BOOLEAN) {
      return false;
    }
    return requirePartitionFilter;
  }

  /**
   * [Required] The only type supported is DAY, which will generate one partition per day.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * [Required] The only type supported is DAY, which will generate one partition per day.
   * @param type type or {@code null} for none
   */
  public TimePartitioning setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public TimePartitioning set(String fieldName, Object value) {
    return (TimePartitioning) super.set(fieldName, value);
  }

  @Override
  public TimePartitioning clone() {
    return (TimePartitioning) super.clone();
  }

}
