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

package com.google.logging.v2.model;

/**
 * Describes a sink used to export log entries to one of the following destinations in any project:
 * a Cloud Storage bucket, a BigQuery dataset, or a Cloud Pub/Sub topic. A logs filter controls
 * which log entries are exported. The sink must be created within a project, organization, billing
 * account, or folder.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Logging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogSink extends com.google.api.client.json.GenericJson {

  /**
   * Required. The export destination: "storage.googleapis.com/[GCS_BUCKET]"
   * "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   * "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set
   * when the sink is created, must have permission to write to the destination or else the log
   * entries are not exported. For more information, see Exporting Logs With Sinks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * Deprecated. This field is ignored when creating or updating sinks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Optional. An advanced logs filter. The only exported log entries are those that are in the
   * resource owning the sink and that match the filter. For example:
   * logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Optional. This field applies only to sinks owned by organizations and folders. If the field is
   * false, the default, only the logs owned by the sink's parent resource are available for export.
   * If the field is true, then logs from all the projects, folders, and billing accounts contained
   * in the sink's parent resource are also available for export. Whether a particular log entry
   * from the children is exported depends on the sink's filter expression. For example, if this
   * field is true, then the filter resource.type=gce_instance would export all Compute Engine VM
   * instance log entries from all projects in the sink's parent. To only export entries from
   * certain child projects, filter on the project part of the log name: logName:("projects/test-
   * project1/" OR "projects/test-project2/") AND resource.type=gce_instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeChildren;

  /**
   * Required. The client-assigned sink identifier, unique within the project. Example: "my-syslog-
   * errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only the
   * following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and
   * periods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The log entry format to use for this sink's exported log entries. The v2 format is
   * used by default and cannot be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputVersionFormat;

  /**
   * Deprecated. This field is ignored when creating or updating sinks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. An IAM identitya service account or groupunder which Logging writes the exported
   * log entries to the sink's destination. This field is set by sinks.create and sinks.update,
   * based on the setting of unique_writer_identity in those methods.Until you grant this identity
   * write-access to the destination, log entry exports from this sink will fail. For more
   * information, see Granting access for a resource. Consult the destination service's
   * documentation to determine the appropriate IAM roles to assign to the identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String writerIdentity;

  /**
   * Required. The export destination: "storage.googleapis.com/[GCS_BUCKET]"
   * "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   * "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set
   * when the sink is created, must have permission to write to the destination or else the log
   * entries are not exported. For more information, see Exporting Logs With Sinks.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * Required. The export destination: "storage.googleapis.com/[GCS_BUCKET]"
   * "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   * "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]" The sink's writer_identity, set
   * when the sink is created, must have permission to write to the destination or else the log
   * entries are not exported. For more information, see Exporting Logs With Sinks.
   * @param destination destination or {@code null} for none
   */
  public LogSink setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Deprecated. This field is ignored when creating or updating sinks.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Deprecated. This field is ignored when creating or updating sinks.
   * @param endTime endTime or {@code null} for none
   */
  public LogSink setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Optional. An advanced logs filter. The only exported log entries are those that are in the
   * resource owning the sink and that match the filter. For example:
   * logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Optional. An advanced logs filter. The only exported log entries are those that are in the
   * resource owning the sink and that match the filter. For example:
   * logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity>=ERROR
   * @param filter filter or {@code null} for none
   */
  public LogSink setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Optional. This field applies only to sinks owned by organizations and folders. If the field is
   * false, the default, only the logs owned by the sink's parent resource are available for export.
   * If the field is true, then logs from all the projects, folders, and billing accounts contained
   * in the sink's parent resource are also available for export. Whether a particular log entry
   * from the children is exported depends on the sink's filter expression. For example, if this
   * field is true, then the filter resource.type=gce_instance would export all Compute Engine VM
   * instance log entries from all projects in the sink's parent. To only export entries from
   * certain child projects, filter on the project part of the log name: logName:("projects/test-
   * project1/" OR "projects/test-project2/") AND resource.type=gce_instance
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeChildren() {
    return includeChildren;
  }

  /**
   * Optional. This field applies only to sinks owned by organizations and folders. If the field is
   * false, the default, only the logs owned by the sink's parent resource are available for export.
   * If the field is true, then logs from all the projects, folders, and billing accounts contained
   * in the sink's parent resource are also available for export. Whether a particular log entry
   * from the children is exported depends on the sink's filter expression. For example, if this
   * field is true, then the filter resource.type=gce_instance would export all Compute Engine VM
   * instance log entries from all projects in the sink's parent. To only export entries from
   * certain child projects, filter on the project part of the log name: logName:("projects/test-
   * project1/" OR "projects/test-project2/") AND resource.type=gce_instance
   * @param includeChildren includeChildren or {@code null} for none
   */
  public LogSink setIncludeChildren(java.lang.Boolean includeChildren) {
    this.includeChildren = includeChildren;
    return this;
  }

  /**
   * Required. The client-assigned sink identifier, unique within the project. Example: "my-syslog-
   * errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only the
   * following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and
   * periods.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The client-assigned sink identifier, unique within the project. Example: "my-syslog-
   * errors-to-pubsub". Sink identifiers are limited to 100 characters and can include only the
   * following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and
   * periods.
   * @param name name or {@code null} for none
   */
  public LogSink setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The log entry format to use for this sink's exported log entries. The v2 format is
   * used by default and cannot be changed.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputVersionFormat() {
    return outputVersionFormat;
  }

  /**
   * Deprecated. The log entry format to use for this sink's exported log entries. The v2 format is
   * used by default and cannot be changed.
   * @param outputVersionFormat outputVersionFormat or {@code null} for none
   */
  public LogSink setOutputVersionFormat(java.lang.String outputVersionFormat) {
    this.outputVersionFormat = outputVersionFormat;
    return this;
  }

  /**
   * Deprecated. This field is ignored when creating or updating sinks.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Deprecated. This field is ignored when creating or updating sinks.
   * @param startTime startTime or {@code null} for none
   */
  public LogSink setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. An IAM identitya service account or groupunder which Logging writes the exported
   * log entries to the sink's destination. This field is set by sinks.create and sinks.update,
   * based on the setting of unique_writer_identity in those methods.Until you grant this identity
   * write-access to the destination, log entry exports from this sink will fail. For more
   * information, see Granting access for a resource. Consult the destination service's
   * documentation to determine the appropriate IAM roles to assign to the identity.
   * @return value or {@code null} for none
   */
  public java.lang.String getWriterIdentity() {
    return writerIdentity;
  }

  /**
   * Output only. An IAM identitya service account or groupunder which Logging writes the exported
   * log entries to the sink's destination. This field is set by sinks.create and sinks.update,
   * based on the setting of unique_writer_identity in those methods.Until you grant this identity
   * write-access to the destination, log entry exports from this sink will fail. For more
   * information, see Granting access for a resource. Consult the destination service's
   * documentation to determine the appropriate IAM roles to assign to the identity.
   * @param writerIdentity writerIdentity or {@code null} for none
   */
  public LogSink setWriterIdentity(java.lang.String writerIdentity) {
    this.writerIdentity = writerIdentity;
    return this;
  }

  @Override
  public LogSink set(String fieldName, Object value) {
    return (LogSink) super.set(fieldName, value);
  }

  @Override
  public LogSink clone() {
    return (LogSink) super.clone();
  }

}
