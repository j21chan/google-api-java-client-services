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

package com.google.serviceusage.v1.model;

/**
 * Quota configuration helps to achieve fairness and budgeting in service usage.
 *
 * The quota configuration works this way: - The service configuration defines a set of metrics. -
 * For API calls, the quota.metric_rules maps methods to metrics with   corresponding costs. - The
 * quota.limits defines limits on the metrics, which will be used for   quota checks at runtime.
 *
 * An example quota configuration in yaml format:
 *
 *    quota:
 *
 *      - name: apiWriteQpsPerProject        metric: library.googleapis.com/write_calls        unit:
 * "1/min/{project}"  # rate limit for consumer projects        values:          STANDARD: 10000
 *
 *      # The metric rules bind all methods to the read_calls metric,      # except for the
 * UpdateBook and DeleteBook methods. These two methods      # are mapped to the write_calls metric,
 * with the UpdateBook method      # consuming at twice rate as the DeleteBook method.
 * metric_rules:      - selector: "*"        metric_costs:
 * library.googleapis.com/read_calls: 1      - selector:
 * google.example.library.v1.LibraryService.UpdateBook        metric_costs:
 * library.googleapis.com/write_calls: 2      - selector:
 * google.example.library.v1.LibraryService.DeleteBook        metric_costs:
 * library.googleapis.com/write_calls: 1
 *
 *  Corresponding Metric definition:
 *
 *      metrics:      - name: library.googleapis.com/read_calls        display_name: Read requests
 * metric_kind: DELTA        value_type: INT64
 *
 *      - name: library.googleapis.com/write_calls        display_name: Write requests
 * metric_kind: DELTA        value_type: INT64
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Quota extends com.google.api.client.json.GenericJson {

  /**
   * List of `QuotaLimit` definitions for the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QuotaLimit> limits;

  /**
   * List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricRule> metricRules;

  static {
    // hack to force ProGuard to consider MetricRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricRule.class);
  }

  /**
   * List of `QuotaLimit` definitions for the service.
   * @return value or {@code null} for none
   */
  public java.util.List<QuotaLimit> getLimits() {
    return limits;
  }

  /**
   * List of `QuotaLimit` definitions for the service.
   * @param limits limits or {@code null} for none
   */
  public Quota setLimits(java.util.List<QuotaLimit> limits) {
    this.limits = limits;
    return this;
  }

  /**
   * List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricRule> getMetricRules() {
    return metricRules;
  }

  /**
   * List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
   * @param metricRules metricRules or {@code null} for none
   */
  public Quota setMetricRules(java.util.List<MetricRule> metricRules) {
    this.metricRules = metricRules;
    return this;
  }

  @Override
  public Quota set(String fieldName, Object value) {
    return (Quota) super.set(fieldName, value);
  }

  @Override
  public Quota clone() {
    return (Quota) super.clone();
  }

}
