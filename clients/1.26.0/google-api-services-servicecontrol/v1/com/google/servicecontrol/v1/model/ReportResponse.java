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

package com.google.servicecontrol.v1.model;

/**
 * Response message for the Report method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportResponse extends com.google.api.client.json.GenericJson {

  /**
   * Partial failures, one for each `Operation` in the request that failed processing. There are
   * three possible combinations of the RPC status:
   *
   * 1. The combination of a successful RPC status and an empty `report_errors`    list indicates a
   * complete success where all `Operations` in the    request are processed successfully. 2. The
   * combination of a successful RPC status and a non-empty    `report_errors` list indicates a
   * partial success where some    `Operations` in the request succeeded. Each    `Operation` that
   * failed processing has a corresponding item    in this list. 3. A failed RPC status indicates a
   * general non-deterministic failure.    When this happens, it's impossible to know which of the
   * 'Operations' in the request succeeded or failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReportError> reportErrors;

  static {
    // hack to force ProGuard to consider ReportError used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ReportError.class);
  }

  /**
   * Quota usage for each quota release `Operation` request.
   *
   * Fully or partially failed quota release request may or may not be present in
   * `report_quota_info`. For example, a failed quota release request will have the current quota
   * usage info when precise quota library returns the info. A deadline exceeded quota request will
   * not have quota usage info.
   *
   * If there is no quota release request, report_quota_info will be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReportInfo> reportInfos;

  static {
    // hack to force ProGuard to consider ReportInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ReportInfo.class);
  }

  /**
   * The actual config id used to process the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceConfigId;

  /**
   * Partial failures, one for each `Operation` in the request that failed processing. There are
   * three possible combinations of the RPC status:
   *
   * 1. The combination of a successful RPC status and an empty `report_errors`    list indicates a
   * complete success where all `Operations` in the    request are processed successfully. 2. The
   * combination of a successful RPC status and a non-empty    `report_errors` list indicates a
   * partial success where some    `Operations` in the request succeeded. Each    `Operation` that
   * failed processing has a corresponding item    in this list. 3. A failed RPC status indicates a
   * general non-deterministic failure.    When this happens, it's impossible to know which of the
   * 'Operations' in the request succeeded or failed.
   * @return value or {@code null} for none
   */
  public java.util.List<ReportError> getReportErrors() {
    return reportErrors;
  }

  /**
   * Partial failures, one for each `Operation` in the request that failed processing. There are
   * three possible combinations of the RPC status:
   *
   * 1. The combination of a successful RPC status and an empty `report_errors`    list indicates a
   * complete success where all `Operations` in the    request are processed successfully. 2. The
   * combination of a successful RPC status and a non-empty    `report_errors` list indicates a
   * partial success where some    `Operations` in the request succeeded. Each    `Operation` that
   * failed processing has a corresponding item    in this list. 3. A failed RPC status indicates a
   * general non-deterministic failure.    When this happens, it's impossible to know which of the
   * 'Operations' in the request succeeded or failed.
   * @param reportErrors reportErrors or {@code null} for none
   */
  public ReportResponse setReportErrors(java.util.List<ReportError> reportErrors) {
    this.reportErrors = reportErrors;
    return this;
  }

  /**
   * Quota usage for each quota release `Operation` request.
   *
   * Fully or partially failed quota release request may or may not be present in
   * `report_quota_info`. For example, a failed quota release request will have the current quota
   * usage info when precise quota library returns the info. A deadline exceeded quota request will
   * not have quota usage info.
   *
   * If there is no quota release request, report_quota_info will be empty.
   * @return value or {@code null} for none
   */
  public java.util.List<ReportInfo> getReportInfos() {
    return reportInfos;
  }

  /**
   * Quota usage for each quota release `Operation` request.
   *
   * Fully or partially failed quota release request may or may not be present in
   * `report_quota_info`. For example, a failed quota release request will have the current quota
   * usage info when precise quota library returns the info. A deadline exceeded quota request will
   * not have quota usage info.
   *
   * If there is no quota release request, report_quota_info will be empty.
   * @param reportInfos reportInfos or {@code null} for none
   */
  public ReportResponse setReportInfos(java.util.List<ReportInfo> reportInfos) {
    this.reportInfos = reportInfos;
    return this;
  }

  /**
   * The actual config id used to process the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceConfigId() {
    return serviceConfigId;
  }

  /**
   * The actual config id used to process the request.
   * @param serviceConfigId serviceConfigId or {@code null} for none
   */
  public ReportResponse setServiceConfigId(java.lang.String serviceConfigId) {
    this.serviceConfigId = serviceConfigId;
    return this;
  }

  @Override
  public ReportResponse set(String fieldName, Object value) {
    return (ReportResponse) super.set(fieldName, value);
  }

  @Override
  public ReportResponse clone() {
    return (ReportResponse) super.clone();
  }

}
