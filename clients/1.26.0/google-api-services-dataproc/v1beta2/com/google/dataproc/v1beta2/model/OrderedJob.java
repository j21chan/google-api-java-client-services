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

package com.google.dataproc.v1beta2.model;

/**
 * A job executed by the workflow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderedJob extends com.google.api.client.json.GenericJson {

  /**
   * Job is a Hadoop job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HadoopJob hadoopJob;

  /**
   * Job is a Hive job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HiveJob hiveJob;

  /**
   * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters
   * long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must
   * be between 1 and 63 characters long, and must conform to the following regular expression:
   * \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Job is a Pig job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PigJob pigJob;

  /**
   * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start
   * at the beginning of workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> prerequisiteStepIds;

  /**
   * Job is a Pyspark job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PySparkJob pysparkJob;

  /**
   * Optional. Job scheduling configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobScheduling scheduling;

  /**
   * Job is a Spark job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SparkJob sparkJob;

  /**
   * Job is a SparkSql job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SparkSqlJob sparkSqlJob;

  /**
   * Required. The step id. The id must be unique among all jobs within the template.The step id is
   * used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in
   * prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers
   * (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must
   * consist of between 3 and 50 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stepId;

  /**
   * Job is a Hadoop job.
   * @return value or {@code null} for none
   */
  public HadoopJob getHadoopJob() {
    return hadoopJob;
  }

  /**
   * Job is a Hadoop job.
   * @param hadoopJob hadoopJob or {@code null} for none
   */
  public OrderedJob setHadoopJob(HadoopJob hadoopJob) {
    this.hadoopJob = hadoopJob;
    return this;
  }

  /**
   * Job is a Hive job.
   * @return value or {@code null} for none
   */
  public HiveJob getHiveJob() {
    return hiveJob;
  }

  /**
   * Job is a Hive job.
   * @param hiveJob hiveJob or {@code null} for none
   */
  public OrderedJob setHiveJob(HiveJob hiveJob) {
    this.hiveJob = hiveJob;
    return this;
  }

  /**
   * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters
   * long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must
   * be between 1 and 63 characters long, and must conform to the following regular expression:
   * \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters
   * long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must
   * be between 1 and 63 characters long, and must conform to the following regular expression:
   * \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
   * @param labels labels or {@code null} for none
   */
  public OrderedJob setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Job is a Pig job.
   * @return value or {@code null} for none
   */
  public PigJob getPigJob() {
    return pigJob;
  }

  /**
   * Job is a Pig job.
   * @param pigJob pigJob or {@code null} for none
   */
  public OrderedJob setPigJob(PigJob pigJob) {
    this.pigJob = pigJob;
    return this;
  }

  /**
   * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start
   * at the beginning of workflow.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrerequisiteStepIds() {
    return prerequisiteStepIds;
  }

  /**
   * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start
   * at the beginning of workflow.
   * @param prerequisiteStepIds prerequisiteStepIds or {@code null} for none
   */
  public OrderedJob setPrerequisiteStepIds(java.util.List<java.lang.String> prerequisiteStepIds) {
    this.prerequisiteStepIds = prerequisiteStepIds;
    return this;
  }

  /**
   * Job is a Pyspark job.
   * @return value or {@code null} for none
   */
  public PySparkJob getPysparkJob() {
    return pysparkJob;
  }

  /**
   * Job is a Pyspark job.
   * @param pysparkJob pysparkJob or {@code null} for none
   */
  public OrderedJob setPysparkJob(PySparkJob pysparkJob) {
    this.pysparkJob = pysparkJob;
    return this;
  }

  /**
   * Optional. Job scheduling configuration.
   * @return value or {@code null} for none
   */
  public JobScheduling getScheduling() {
    return scheduling;
  }

  /**
   * Optional. Job scheduling configuration.
   * @param scheduling scheduling or {@code null} for none
   */
  public OrderedJob setScheduling(JobScheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

  /**
   * Job is a Spark job.
   * @return value or {@code null} for none
   */
  public SparkJob getSparkJob() {
    return sparkJob;
  }

  /**
   * Job is a Spark job.
   * @param sparkJob sparkJob or {@code null} for none
   */
  public OrderedJob setSparkJob(SparkJob sparkJob) {
    this.sparkJob = sparkJob;
    return this;
  }

  /**
   * Job is a SparkSql job.
   * @return value or {@code null} for none
   */
  public SparkSqlJob getSparkSqlJob() {
    return sparkSqlJob;
  }

  /**
   * Job is a SparkSql job.
   * @param sparkSqlJob sparkSqlJob or {@code null} for none
   */
  public OrderedJob setSparkSqlJob(SparkSqlJob sparkSqlJob) {
    this.sparkSqlJob = sparkSqlJob;
    return this;
  }

  /**
   * Required. The step id. The id must be unique among all jobs within the template.The step id is
   * used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in
   * prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers
   * (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must
   * consist of between 3 and 50 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getStepId() {
    return stepId;
  }

  /**
   * Required. The step id. The id must be unique among all jobs within the template.The step id is
   * used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in
   * prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers
   * (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must
   * consist of between 3 and 50 characters.
   * @param stepId stepId or {@code null} for none
   */
  public OrderedJob setStepId(java.lang.String stepId) {
    this.stepId = stepId;
    return this;
  }

  @Override
  public OrderedJob set(String fieldName, Object value) {
    return (OrderedJob) super.set(fieldName, value);
  }

  @Override
  public OrderedJob clone() {
    return (OrderedJob) super.clone();
  }

}
