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

package com.google.civicinfo.model;

/**
 * Model definition for Provenance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Provenance extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StreetSegmentList collidedSegmentSource;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ctclContestUuid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ctclOfficeUuid;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long datasetId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long precinctId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long precinctSplitId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tsStreetSegmentId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vip5PrecinctId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vip5StreetSegmentId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long vipStreetSegmentId;

  /**
   * @return value or {@code null} for none
   */
  public StreetSegmentList getCollidedSegmentSource() {
    return collidedSegmentSource;
  }

  /**
   * @param collidedSegmentSource collidedSegmentSource or {@code null} for none
   */
  public Provenance setCollidedSegmentSource(StreetSegmentList collidedSegmentSource) {
    this.collidedSegmentSource = collidedSegmentSource;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCtclContestUuid() {
    return ctclContestUuid;
  }

  /**
   * @param ctclContestUuid ctclContestUuid or {@code null} for none
   */
  public Provenance setCtclContestUuid(java.lang.String ctclContestUuid) {
    this.ctclContestUuid = ctclContestUuid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCtclOfficeUuid() {
    return ctclOfficeUuid;
  }

  /**
   * @param ctclOfficeUuid ctclOfficeUuid or {@code null} for none
   */
  public Provenance setCtclOfficeUuid(java.lang.String ctclOfficeUuid) {
    this.ctclOfficeUuid = ctclOfficeUuid;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDatasetId() {
    return datasetId;
  }

  /**
   * @param datasetId datasetId or {@code null} for none
   */
  public Provenance setDatasetId(java.lang.Long datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPrecinctId() {
    return precinctId;
  }

  /**
   * @param precinctId precinctId or {@code null} for none
   */
  public Provenance setPrecinctId(java.lang.Long precinctId) {
    this.precinctId = precinctId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPrecinctSplitId() {
    return precinctSplitId;
  }

  /**
   * @param precinctSplitId precinctSplitId or {@code null} for none
   */
  public Provenance setPrecinctSplitId(java.lang.Long precinctSplitId) {
    this.precinctSplitId = precinctSplitId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTsStreetSegmentId() {
    return tsStreetSegmentId;
  }

  /**
   * @param tsStreetSegmentId tsStreetSegmentId or {@code null} for none
   */
  public Provenance setTsStreetSegmentId(java.lang.String tsStreetSegmentId) {
    this.tsStreetSegmentId = tsStreetSegmentId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVip5PrecinctId() {
    return vip5PrecinctId;
  }

  /**
   * @param vip5PrecinctId vip5PrecinctId or {@code null} for none
   */
  public Provenance setVip5PrecinctId(java.lang.String vip5PrecinctId) {
    this.vip5PrecinctId = vip5PrecinctId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVip5StreetSegmentId() {
    return vip5StreetSegmentId;
  }

  /**
   * @param vip5StreetSegmentId vip5StreetSegmentId or {@code null} for none
   */
  public Provenance setVip5StreetSegmentId(java.lang.String vip5StreetSegmentId) {
    this.vip5StreetSegmentId = vip5StreetSegmentId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getVipStreetSegmentId() {
    return vipStreetSegmentId;
  }

  /**
   * @param vipStreetSegmentId vipStreetSegmentId or {@code null} for none
   */
  public Provenance setVipStreetSegmentId(java.lang.Long vipStreetSegmentId) {
    this.vipStreetSegmentId = vipStreetSegmentId;
    return this;
  }

  @Override
  public Provenance set(String fieldName, Object value) {
    return (Provenance) super.set(fieldName, value);
  }

  @Override
  public Provenance clone() {
    return (Provenance) super.clone();
  }

}
