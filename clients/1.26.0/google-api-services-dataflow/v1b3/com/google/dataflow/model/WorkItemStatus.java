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
 * Conveys a worker's progress through the work described by a WorkItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkItemStatus extends com.google.api.client.json.GenericJson {

  /**
   * True if the WorkItem was completed (successfully or unsuccessfully).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean completed;

  /**
   * Worker output counters for this WorkItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CounterUpdate> counterUpdates;

  static {
    // hack to force ProGuard to consider CounterUpdate used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CounterUpdate.class);
  }

  /**
   * See documentation of stop_position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DynamicSourceSplit dynamicSourceSplit;

  /**
   * Specifies errors which occurred during processing.  If errors are provided, and completed =
   * true, then the WorkItem is considered to have failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Status> errors;

  /**
   * DEPRECATED in favor of counter_updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricUpdate> metricUpdates;

  /**
   * DEPRECATED in favor of reported_progress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApproximateProgress progress;

  /**
   * The report index.  When a WorkItem is leased, the lease will contain an initial report index.
   * When a WorkItem's status is reported to the system, the report should be sent with that report
   * index, and the response will contain the index the worker should use for the next report.
   * Reports received with unexpected index values will be rejected by the service.
   *
   * In order to preserve idempotency, the worker should not alter the contents of a report, even if
   * the worker must submit the same report multiple times before getting back a response.  The
   * worker should not submit a subsequent report until the response for the previous report had
   * been received from the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reportIndex;

  /**
   * The worker's progress through this WorkItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApproximateReportedProgress reportedProgress;

  /**
   * Amount of time the worker requests for its lease.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String requestedLeaseDuration;

  /**
   * DEPRECATED in favor of dynamic_source_split.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceFork sourceFork;

  /**
   * If the work item represented a SourceOperationRequest, and the work is completed, contains the
   * result of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceOperationResponse sourceOperationResponse;

  /**
   * A worker may split an active map task in two parts, "primary" and "residual", continuing to
   * process the primary part and returning the residual part into the pool of available work. This
   * event is called a "dynamic split" and is critical to the dynamic work rebalancing feature. The
   * two obtained sub-tasks are called "parts" of the split. The parts, if concatenated, must
   * represent the same input as would be read by the current task if the split did not happen. The
   * exact way in which the original task is decomposed into the two parts is specified either as a
   * position demarcating them (stop_position), or explicitly as two DerivedSources, if this task
   * consumes a user-defined source type (dynamic_source_split).
   *
   * The "current" task is adjusted as a result of the split: after a task with range [A, B) sends a
   * stop_position update at C, its range is considered to be [A, C), e.g.: * Progress should be
   * interpreted relative to the new range, e.g.   "75% completed" means "75% of [A, C) completed" *
   * The worker should interpret proposed_stop_position relative to the   new range, e.g. "split at
   * 68%" should be interpreted as   "split at 68% of [A, C)". * If the worker chooses to split
   * again using stop_position, only   stop_positions in [A, C) will be accepted. * Etc.
   * dynamic_source_split has similar semantics: e.g., if a task with source S splits using
   * dynamic_source_split into {P, R} (where P and R must be together equivalent to S), then
   * subsequent progress and proposed_stop_position should be interpreted relative to P, and in a
   * potential subsequent dynamic_source_split into {P', R'}, P' and R' must be together equivalent
   * to P, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Position stopPosition;

  /**
   * Total time the worker spent being throttled by external systems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double totalThrottlerWaitTimeSeconds;

  /**
   * Identifies the WorkItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workItemId;

  /**
   * True if the WorkItem was completed (successfully or unsuccessfully).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCompleted() {
    return completed;
  }

  /**
   * True if the WorkItem was completed (successfully or unsuccessfully).
   * @param completed completed or {@code null} for none
   */
  public WorkItemStatus setCompleted(java.lang.Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Worker output counters for this WorkItem.
   * @return value or {@code null} for none
   */
  public java.util.List<CounterUpdate> getCounterUpdates() {
    return counterUpdates;
  }

  /**
   * Worker output counters for this WorkItem.
   * @param counterUpdates counterUpdates or {@code null} for none
   */
  public WorkItemStatus setCounterUpdates(java.util.List<CounterUpdate> counterUpdates) {
    this.counterUpdates = counterUpdates;
    return this;
  }

  /**
   * See documentation of stop_position.
   * @return value or {@code null} for none
   */
  public DynamicSourceSplit getDynamicSourceSplit() {
    return dynamicSourceSplit;
  }

  /**
   * See documentation of stop_position.
   * @param dynamicSourceSplit dynamicSourceSplit or {@code null} for none
   */
  public WorkItemStatus setDynamicSourceSplit(DynamicSourceSplit dynamicSourceSplit) {
    this.dynamicSourceSplit = dynamicSourceSplit;
    return this;
  }

  /**
   * Specifies errors which occurred during processing.  If errors are provided, and completed =
   * true, then the WorkItem is considered to have failed.
   * @return value or {@code null} for none
   */
  public java.util.List<Status> getErrors() {
    return errors;
  }

  /**
   * Specifies errors which occurred during processing.  If errors are provided, and completed =
   * true, then the WorkItem is considered to have failed.
   * @param errors errors or {@code null} for none
   */
  public WorkItemStatus setErrors(java.util.List<Status> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * DEPRECATED in favor of counter_updates.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricUpdate> getMetricUpdates() {
    return metricUpdates;
  }

  /**
   * DEPRECATED in favor of counter_updates.
   * @param metricUpdates metricUpdates or {@code null} for none
   */
  public WorkItemStatus setMetricUpdates(java.util.List<MetricUpdate> metricUpdates) {
    this.metricUpdates = metricUpdates;
    return this;
  }

  /**
   * DEPRECATED in favor of reported_progress.
   * @return value or {@code null} for none
   */
  public ApproximateProgress getProgress() {
    return progress;
  }

  /**
   * DEPRECATED in favor of reported_progress.
   * @param progress progress or {@code null} for none
   */
  public WorkItemStatus setProgress(ApproximateProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * The report index.  When a WorkItem is leased, the lease will contain an initial report index.
   * When a WorkItem's status is reported to the system, the report should be sent with that report
   * index, and the response will contain the index the worker should use for the next report.
   * Reports received with unexpected index values will be rejected by the service.
   *
   * In order to preserve idempotency, the worker should not alter the contents of a report, even if
   * the worker must submit the same report multiple times before getting back a response.  The
   * worker should not submit a subsequent report until the response for the previous report had
   * been received from the service.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReportIndex() {
    return reportIndex;
  }

  /**
   * The report index.  When a WorkItem is leased, the lease will contain an initial report index.
   * When a WorkItem's status is reported to the system, the report should be sent with that report
   * index, and the response will contain the index the worker should use for the next report.
   * Reports received with unexpected index values will be rejected by the service.
   *
   * In order to preserve idempotency, the worker should not alter the contents of a report, even if
   * the worker must submit the same report multiple times before getting back a response.  The
   * worker should not submit a subsequent report until the response for the previous report had
   * been received from the service.
   * @param reportIndex reportIndex or {@code null} for none
   */
  public WorkItemStatus setReportIndex(java.lang.Long reportIndex) {
    this.reportIndex = reportIndex;
    return this;
  }

  /**
   * The worker's progress through this WorkItem.
   * @return value or {@code null} for none
   */
  public ApproximateReportedProgress getReportedProgress() {
    return reportedProgress;
  }

  /**
   * The worker's progress through this WorkItem.
   * @param reportedProgress reportedProgress or {@code null} for none
   */
  public WorkItemStatus setReportedProgress(ApproximateReportedProgress reportedProgress) {
    this.reportedProgress = reportedProgress;
    return this;
  }

  /**
   * Amount of time the worker requests for its lease.
   * @return value or {@code null} for none
   */
  public String getRequestedLeaseDuration() {
    return requestedLeaseDuration;
  }

  /**
   * Amount of time the worker requests for its lease.
   * @param requestedLeaseDuration requestedLeaseDuration or {@code null} for none
   */
  public WorkItemStatus setRequestedLeaseDuration(String requestedLeaseDuration) {
    this.requestedLeaseDuration = requestedLeaseDuration;
    return this;
  }

  /**
   * DEPRECATED in favor of dynamic_source_split.
   * @return value or {@code null} for none
   */
  public SourceFork getSourceFork() {
    return sourceFork;
  }

  /**
   * DEPRECATED in favor of dynamic_source_split.
   * @param sourceFork sourceFork or {@code null} for none
   */
  public WorkItemStatus setSourceFork(SourceFork sourceFork) {
    this.sourceFork = sourceFork;
    return this;
  }

  /**
   * If the work item represented a SourceOperationRequest, and the work is completed, contains the
   * result of the operation.
   * @return value or {@code null} for none
   */
  public SourceOperationResponse getSourceOperationResponse() {
    return sourceOperationResponse;
  }

  /**
   * If the work item represented a SourceOperationRequest, and the work is completed, contains the
   * result of the operation.
   * @param sourceOperationResponse sourceOperationResponse or {@code null} for none
   */
  public WorkItemStatus setSourceOperationResponse(SourceOperationResponse sourceOperationResponse) {
    this.sourceOperationResponse = sourceOperationResponse;
    return this;
  }

  /**
   * A worker may split an active map task in two parts, "primary" and "residual", continuing to
   * process the primary part and returning the residual part into the pool of available work. This
   * event is called a "dynamic split" and is critical to the dynamic work rebalancing feature. The
   * two obtained sub-tasks are called "parts" of the split. The parts, if concatenated, must
   * represent the same input as would be read by the current task if the split did not happen. The
   * exact way in which the original task is decomposed into the two parts is specified either as a
   * position demarcating them (stop_position), or explicitly as two DerivedSources, if this task
   * consumes a user-defined source type (dynamic_source_split).
   *
   * The "current" task is adjusted as a result of the split: after a task with range [A, B) sends a
   * stop_position update at C, its range is considered to be [A, C), e.g.: * Progress should be
   * interpreted relative to the new range, e.g.   "75% completed" means "75% of [A, C) completed" *
   * The worker should interpret proposed_stop_position relative to the   new range, e.g. "split at
   * 68%" should be interpreted as   "split at 68% of [A, C)". * If the worker chooses to split
   * again using stop_position, only   stop_positions in [A, C) will be accepted. * Etc.
   * dynamic_source_split has similar semantics: e.g., if a task with source S splits using
   * dynamic_source_split into {P, R} (where P and R must be together equivalent to S), then
   * subsequent progress and proposed_stop_position should be interpreted relative to P, and in a
   * potential subsequent dynamic_source_split into {P', R'}, P' and R' must be together equivalent
   * to P, etc.
   * @return value or {@code null} for none
   */
  public Position getStopPosition() {
    return stopPosition;
  }

  /**
   * A worker may split an active map task in two parts, "primary" and "residual", continuing to
   * process the primary part and returning the residual part into the pool of available work. This
   * event is called a "dynamic split" and is critical to the dynamic work rebalancing feature. The
   * two obtained sub-tasks are called "parts" of the split. The parts, if concatenated, must
   * represent the same input as would be read by the current task if the split did not happen. The
   * exact way in which the original task is decomposed into the two parts is specified either as a
   * position demarcating them (stop_position), or explicitly as two DerivedSources, if this task
   * consumes a user-defined source type (dynamic_source_split).
   *
   * The "current" task is adjusted as a result of the split: after a task with range [A, B) sends a
   * stop_position update at C, its range is considered to be [A, C), e.g.: * Progress should be
   * interpreted relative to the new range, e.g.   "75% completed" means "75% of [A, C) completed" *
   * The worker should interpret proposed_stop_position relative to the   new range, e.g. "split at
   * 68%" should be interpreted as   "split at 68% of [A, C)". * If the worker chooses to split
   * again using stop_position, only   stop_positions in [A, C) will be accepted. * Etc.
   * dynamic_source_split has similar semantics: e.g., if a task with source S splits using
   * dynamic_source_split into {P, R} (where P and R must be together equivalent to S), then
   * subsequent progress and proposed_stop_position should be interpreted relative to P, and in a
   * potential subsequent dynamic_source_split into {P', R'}, P' and R' must be together equivalent
   * to P, etc.
   * @param stopPosition stopPosition or {@code null} for none
   */
  public WorkItemStatus setStopPosition(Position stopPosition) {
    this.stopPosition = stopPosition;
    return this;
  }

  /**
   * Total time the worker spent being throttled by external systems.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTotalThrottlerWaitTimeSeconds() {
    return totalThrottlerWaitTimeSeconds;
  }

  /**
   * Total time the worker spent being throttled by external systems.
   * @param totalThrottlerWaitTimeSeconds totalThrottlerWaitTimeSeconds or {@code null} for none
   */
  public WorkItemStatus setTotalThrottlerWaitTimeSeconds(java.lang.Double totalThrottlerWaitTimeSeconds) {
    this.totalThrottlerWaitTimeSeconds = totalThrottlerWaitTimeSeconds;
    return this;
  }

  /**
   * Identifies the WorkItem.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkItemId() {
    return workItemId;
  }

  /**
   * Identifies the WorkItem.
   * @param workItemId workItemId or {@code null} for none
   */
  public WorkItemStatus setWorkItemId(java.lang.String workItemId) {
    this.workItemId = workItemId;
    return this;
  }

  @Override
  public WorkItemStatus set(String fieldName, Object value) {
    return (WorkItemStatus) super.set(fieldName, value);
  }

  @Override
  public WorkItemStatus clone() {
    return (WorkItemStatus) super.clone();
  }

}
