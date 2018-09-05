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

package com.google.websecurityscanner.v1alpha.model;

/**
 * A Finding resource represents a vulnerability instance identified during a ScanRun.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Web Security Scanner API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Finding extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The body of the request that triggered the vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * Output only. The description of the vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The URL where the browser lands when the vulnerability is detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String finalUrl;

  /**
   * Output only. The type of the Finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String findingType;

  /**
   * Output only. If the vulnerability was originated from nested IFrame, the immediate parent
   * IFrame is reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String frameUrl;

  /**
   * Output only. The URL produced by the server-side fuzzer and used in the request that triggered
   * the vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fuzzedUrl;

  /**
   * Output only. The http method of the request that triggered the vulnerability, in uppercase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpMethod;

  /**
   * Output only. The resource name of the Finding. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
   * The finding IDs are generated by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. An addon containing information about outdated libraries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OutdatedLibrary outdatedLibrary;

  /**
   * Output only. The URL containing human-readable payload that user can leverage to reproduce the
   * vulnerability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reproductionUrl;

  /**
   * Output only. The tracking ID uniquely identifies a vulnerability instance across multiple
   * ScanRuns.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingId;

  /**
   * Output only. An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ViolatingResource violatingResource;

  /**
   * Output only. An addon containing information about vulnerable or missing HTTP headers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerableHeaders vulnerableHeaders;

  /**
   * Output only. An addon containing information about request parameters which were found to be
   * vulnerable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VulnerableParameters vulnerableParameters;

  /**
   * Output only. An addon containing information reported for an XSS, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Xss xss;

  /**
   * Output only. The body of the request that triggered the vulnerability.
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * Output only. The body of the request that triggered the vulnerability.
   * @param body body or {@code null} for none
   */
  public Finding setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * Output only. The description of the vulnerability.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. The description of the vulnerability.
   * @param description description or {@code null} for none
   */
  public Finding setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The URL where the browser lands when the vulnerability is detected.
   * @return value or {@code null} for none
   */
  public java.lang.String getFinalUrl() {
    return finalUrl;
  }

  /**
   * Output only. The URL where the browser lands when the vulnerability is detected.
   * @param finalUrl finalUrl or {@code null} for none
   */
  public Finding setFinalUrl(java.lang.String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * Output only. The type of the Finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getFindingType() {
    return findingType;
  }

  /**
   * Output only. The type of the Finding.
   * @param findingType findingType or {@code null} for none
   */
  public Finding setFindingType(java.lang.String findingType) {
    this.findingType = findingType;
    return this;
  }

  /**
   * Output only. If the vulnerability was originated from nested IFrame, the immediate parent
   * IFrame is reported.
   * @return value or {@code null} for none
   */
  public java.lang.String getFrameUrl() {
    return frameUrl;
  }

  /**
   * Output only. If the vulnerability was originated from nested IFrame, the immediate parent
   * IFrame is reported.
   * @param frameUrl frameUrl or {@code null} for none
   */
  public Finding setFrameUrl(java.lang.String frameUrl) {
    this.frameUrl = frameUrl;
    return this;
  }

  /**
   * Output only. The URL produced by the server-side fuzzer and used in the request that triggered
   * the vulnerability.
   * @return value or {@code null} for none
   */
  public java.lang.String getFuzzedUrl() {
    return fuzzedUrl;
  }

  /**
   * Output only. The URL produced by the server-side fuzzer and used in the request that triggered
   * the vulnerability.
   * @param fuzzedUrl fuzzedUrl or {@code null} for none
   */
  public Finding setFuzzedUrl(java.lang.String fuzzedUrl) {
    this.fuzzedUrl = fuzzedUrl;
    return this;
  }

  /**
   * Output only. The http method of the request that triggered the vulnerability, in uppercase.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpMethod() {
    return httpMethod;
  }

  /**
   * Output only. The http method of the request that triggered the vulnerability, in uppercase.
   * @param httpMethod httpMethod or {@code null} for none
   */
  public Finding setHttpMethod(java.lang.String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * Output only. The resource name of the Finding. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
   * The finding IDs are generated by the system.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the Finding. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
   * The finding IDs are generated by the system.
   * @param name name or {@code null} for none
   */
  public Finding setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. An addon containing information about outdated libraries.
   * @return value or {@code null} for none
   */
  public OutdatedLibrary getOutdatedLibrary() {
    return outdatedLibrary;
  }

  /**
   * Output only. An addon containing information about outdated libraries.
   * @param outdatedLibrary outdatedLibrary or {@code null} for none
   */
  public Finding setOutdatedLibrary(OutdatedLibrary outdatedLibrary) {
    this.outdatedLibrary = outdatedLibrary;
    return this;
  }

  /**
   * Output only. The URL containing human-readable payload that user can leverage to reproduce the
   * vulnerability.
   * @return value or {@code null} for none
   */
  public java.lang.String getReproductionUrl() {
    return reproductionUrl;
  }

  /**
   * Output only. The URL containing human-readable payload that user can leverage to reproduce the
   * vulnerability.
   * @param reproductionUrl reproductionUrl or {@code null} for none
   */
  public Finding setReproductionUrl(java.lang.String reproductionUrl) {
    this.reproductionUrl = reproductionUrl;
    return this;
  }

  /**
   * Output only. The tracking ID uniquely identifies a vulnerability instance across multiple
   * ScanRuns.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingId() {
    return trackingId;
  }

  /**
   * Output only. The tracking ID uniquely identifies a vulnerability instance across multiple
   * ScanRuns.
   * @param trackingId trackingId or {@code null} for none
   */
  public Finding setTrackingId(java.lang.String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * Output only. An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * @return value or {@code null} for none
   */
  public ViolatingResource getViolatingResource() {
    return violatingResource;
  }

  /**
   * Output only. An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * @param violatingResource violatingResource or {@code null} for none
   */
  public Finding setViolatingResource(ViolatingResource violatingResource) {
    this.violatingResource = violatingResource;
    return this;
  }

  /**
   * Output only. An addon containing information about vulnerable or missing HTTP headers.
   * @return value or {@code null} for none
   */
  public VulnerableHeaders getVulnerableHeaders() {
    return vulnerableHeaders;
  }

  /**
   * Output only. An addon containing information about vulnerable or missing HTTP headers.
   * @param vulnerableHeaders vulnerableHeaders or {@code null} for none
   */
  public Finding setVulnerableHeaders(VulnerableHeaders vulnerableHeaders) {
    this.vulnerableHeaders = vulnerableHeaders;
    return this;
  }

  /**
   * Output only. An addon containing information about request parameters which were found to be
   * vulnerable.
   * @return value or {@code null} for none
   */
  public VulnerableParameters getVulnerableParameters() {
    return vulnerableParameters;
  }

  /**
   * Output only. An addon containing information about request parameters which were found to be
   * vulnerable.
   * @param vulnerableParameters vulnerableParameters or {@code null} for none
   */
  public Finding setVulnerableParameters(VulnerableParameters vulnerableParameters) {
    this.vulnerableParameters = vulnerableParameters;
    return this;
  }

  /**
   * Output only. An addon containing information reported for an XSS, if any.
   * @return value or {@code null} for none
   */
  public Xss getXss() {
    return xss;
  }

  /**
   * Output only. An addon containing information reported for an XSS, if any.
   * @param xss xss or {@code null} for none
   */
  public Finding setXss(Xss xss) {
    this.xss = xss;
    return this;
  }

  @Override
  public Finding set(String fieldName, Object value) {
    return (Finding) super.set(fieldName, value);
  }

  @Override
  public Finding clone() {
    return (Finding) super.clone();
  }

}
