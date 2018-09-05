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
 * Identifies a metric, by describing the source which generated the metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricStructuredName extends com.google.api.client.json.GenericJson {

  /**
   * Zero or more labeled fields which identify the part of the job this metric is associated with,
   * such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have context['step'] = . Counters
   * associated with PCollections in the SDK will have context['pcollection'] = .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> context;

  /**
   * Worker-defined metric name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Origin (namespace) of metric name. May be blank for user-define metrics; will be "dataflow" for
   * metrics defined by the Dataflow service or SDK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String origin;

  /**
   * Zero or more labeled fields which identify the part of the job this metric is associated with,
   * such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have context['step'] = . Counters
   * associated with PCollections in the SDK will have context['pcollection'] = .
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getContext() {
    return context;
  }

  /**
   * Zero or more labeled fields which identify the part of the job this metric is associated with,
   * such as the name of a step or collection.
   *
   * For example, built-in counters associated with steps will have context['step'] = . Counters
   * associated with PCollections in the SDK will have context['pcollection'] = .
   * @param context context or {@code null} for none
   */
  public MetricStructuredName setContext(java.util.Map<String, java.lang.String> context) {
    this.context = context;
    return this;
  }

  /**
   * Worker-defined metric name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Worker-defined metric name.
   * @param name name or {@code null} for none
   */
  public MetricStructuredName setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Origin (namespace) of metric name. May be blank for user-define metrics; will be "dataflow" for
   * metrics defined by the Dataflow service or SDK.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrigin() {
    return origin;
  }

  /**
   * Origin (namespace) of metric name. May be blank for user-define metrics; will be "dataflow" for
   * metrics defined by the Dataflow service or SDK.
   * @param origin origin or {@code null} for none
   */
  public MetricStructuredName setOrigin(java.lang.String origin) {
    this.origin = origin;
    return this;
  }

  @Override
  public MetricStructuredName set(String fieldName, Object value) {
    return (MetricStructuredName) super.set(fieldName, value);
  }

  @Override
  public MetricStructuredName clone() {
    return (MetricStructuredName) super.clone();
  }

}
