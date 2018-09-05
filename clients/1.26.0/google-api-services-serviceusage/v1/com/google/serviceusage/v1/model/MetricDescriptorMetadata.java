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
 * Additional annotations that can be used to guide the usage of a metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricDescriptorMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The delay of data points caused by ingestion. Data points older than this age are guaranteed to
   * be ingested and available to be read, excluding data loss due to errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String ingestDelay;

  /**
   * The launch stage of the metric definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchStage;

  /**
   * The sampling period of metric data points. For metrics which are written periodically,
   * consecutive data points are stored at this time interval, excluding data loss due to errors.
   * Metrics with a higher granularity have a smaller sampling period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String samplePeriod;

  /**
   * The delay of data points caused by ingestion. Data points older than this age are guaranteed to
   * be ingested and available to be read, excluding data loss due to errors.
   * @return value or {@code null} for none
   */
  public String getIngestDelay() {
    return ingestDelay;
  }

  /**
   * The delay of data points caused by ingestion. Data points older than this age are guaranteed to
   * be ingested and available to be read, excluding data loss due to errors.
   * @param ingestDelay ingestDelay or {@code null} for none
   */
  public MetricDescriptorMetadata setIngestDelay(String ingestDelay) {
    this.ingestDelay = ingestDelay;
    return this;
  }

  /**
   * The launch stage of the metric definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchStage() {
    return launchStage;
  }

  /**
   * The launch stage of the metric definition.
   * @param launchStage launchStage or {@code null} for none
   */
  public MetricDescriptorMetadata setLaunchStage(java.lang.String launchStage) {
    this.launchStage = launchStage;
    return this;
  }

  /**
   * The sampling period of metric data points. For metrics which are written periodically,
   * consecutive data points are stored at this time interval, excluding data loss due to errors.
   * Metrics with a higher granularity have a smaller sampling period.
   * @return value or {@code null} for none
   */
  public String getSamplePeriod() {
    return samplePeriod;
  }

  /**
   * The sampling period of metric data points. For metrics which are written periodically,
   * consecutive data points are stored at this time interval, excluding data loss due to errors.
   * Metrics with a higher granularity have a smaller sampling period.
   * @param samplePeriod samplePeriod or {@code null} for none
   */
  public MetricDescriptorMetadata setSamplePeriod(String samplePeriod) {
    this.samplePeriod = samplePeriod;
    return this;
  }

  @Override
  public MetricDescriptorMetadata set(String fieldName, Object value) {
    return (MetricDescriptorMetadata) super.set(fieldName, value);
  }

  @Override
  public MetricDescriptorMetadata clone() {
    return (MetricDescriptorMetadata) super.clone();
  }

}
