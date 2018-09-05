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
 * The headers for each of the pivot sections defined in the request.
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
public final class PivotHeader extends com.google.api.client.json.GenericJson {

  /**
   * A single pivot section header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PivotHeaderEntry> pivotHeaderEntries;

  static {
    // hack to force ProGuard to consider PivotHeaderEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PivotHeaderEntry.class);
  }

  /**
   * The total number of groups for this pivot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalPivotGroupsCount;

  /**
   * A single pivot section header.
   * @return value or {@code null} for none
   */
  public java.util.List<PivotHeaderEntry> getPivotHeaderEntries() {
    return pivotHeaderEntries;
  }

  /**
   * A single pivot section header.
   * @param pivotHeaderEntries pivotHeaderEntries or {@code null} for none
   */
  public PivotHeader setPivotHeaderEntries(java.util.List<PivotHeaderEntry> pivotHeaderEntries) {
    this.pivotHeaderEntries = pivotHeaderEntries;
    return this;
  }

  /**
   * The total number of groups for this pivot.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalPivotGroupsCount() {
    return totalPivotGroupsCount;
  }

  /**
   * The total number of groups for this pivot.
   * @param totalPivotGroupsCount totalPivotGroupsCount or {@code null} for none
   */
  public PivotHeader setTotalPivotGroupsCount(java.lang.Integer totalPivotGroupsCount) {
    this.totalPivotGroupsCount = totalPivotGroupsCount;
    return this;
  }

  @Override
  public PivotHeader set(String fieldName, Object value) {
    return (PivotHeader) super.set(fieldName, value);
  }

  @Override
  public PivotHeader clone() {
    return (PivotHeader) super.clone();
  }

}
