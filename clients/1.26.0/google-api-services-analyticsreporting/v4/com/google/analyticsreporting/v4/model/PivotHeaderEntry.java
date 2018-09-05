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

package com.google.analyticsreporting.v4.model;

/**
 * The headers for the each of the metric column corresponding to the metrics requested in the
 * pivots section of the response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PivotHeaderEntry extends com.google.api.client.json.GenericJson {

  /**
   * The name of the dimensions in the pivot response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensionNames;

  /**
   * The values for the dimensions in the pivot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensionValues;

  /**
   * The metric header for the metric in the pivot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricHeaderEntry metric;

  /**
   * The name of the dimensions in the pivot response.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensionNames() {
    return dimensionNames;
  }

  /**
   * The name of the dimensions in the pivot response.
   * @param dimensionNames dimensionNames or {@code null} for none
   */
  public PivotHeaderEntry setDimensionNames(java.util.List<java.lang.String> dimensionNames) {
    this.dimensionNames = dimensionNames;
    return this;
  }

  /**
   * The values for the dimensions in the pivot.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensionValues() {
    return dimensionValues;
  }

  /**
   * The values for the dimensions in the pivot.
   * @param dimensionValues dimensionValues or {@code null} for none
   */
  public PivotHeaderEntry setDimensionValues(java.util.List<java.lang.String> dimensionValues) {
    this.dimensionValues = dimensionValues;
    return this;
  }

  /**
   * The metric header for the metric in the pivot.
   * @return value or {@code null} for none
   */
  public MetricHeaderEntry getMetric() {
    return metric;
  }

  /**
   * The metric header for the metric in the pivot.
   * @param metric metric or {@code null} for none
   */
  public PivotHeaderEntry setMetric(MetricHeaderEntry metric) {
    this.metric = metric;
    return this;
  }

  @Override
  public PivotHeaderEntry set(String fieldName, Object value) {
    return (PivotHeaderEntry) super.set(fieldName, value);
  }

  @Override
  public PivotHeaderEntry clone() {
    return (PivotHeaderEntry) super.clone();
  }

}
