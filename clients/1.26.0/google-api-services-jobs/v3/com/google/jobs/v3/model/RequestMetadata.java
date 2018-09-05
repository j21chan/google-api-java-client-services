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

package com.google.jobs.v3.model;

/**
 * Input only.
 *
 * Meta information related to the job searcher or entity conducting the job search. This
 * information is used to improve the performance of the service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RequestMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * The type of device used by the job seeker at the time of the call to the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceInfo deviceInfo;

  /**
   * Required.
   *
   * The client-defined scope or source of the service call, which typically is the domain on which
   * the service has been implemented and is currently being run.
   *
   * For example, if the service is being run by client Foo, Inc., on job board www.foo.com and
   * career site www.bar.com, then this field is set to "foo.com" for use on the job board, and
   * "bar.com" for use on the career site.
   *
   * If this field isn't available for some reason, send "UNKNOWN". Any improvements to the model
   * for a particular tenant site rely on this field being set correctly to a domain.
   *
   * The maximum number of allowed characters is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Required.
   *
   * A unique session identification string. A session is defined as the duration of an end user's
   * interaction with the service over a certain period. Obfuscate this field for privacy concerns
   * before providing it to the service.
   *
   * If this field is not available for some reason, send "UNKNOWN". Note that any improvements to
   * the model for a particular tenant site, rely on this field being set correctly to some unique
   * session_id.
   *
   * The maximum number of allowed characters is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionId;

  /**
   * Required.
   *
   * A unique user identification string, as determined by the client. To have the strongest
   * positive impact on search quality make sure the client-level is unique. Obfuscate this field
   * for privacy concerns before providing it to the service.
   *
   * If this field is not available for some reason, send "UNKNOWN". Note that any improvements to
   * the model for a particular tenant site, rely on this field being set correctly to a unique
   * user_id.
   *
   * The maximum number of allowed characters is 255.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * Optional.
   *
   * The type of device used by the job seeker at the time of the call to the service.
   * @return value or {@code null} for none
   */
  public DeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  /**
   * Optional.
   *
   * The type of device used by the job seeker at the time of the call to the service.
   * @param deviceInfo deviceInfo or {@code null} for none
   */
  public RequestMetadata setDeviceInfo(DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  /**
   * Required.
   *
   * The client-defined scope or source of the service call, which typically is the domain on which
   * the service has been implemented and is currently being run.
   *
   * For example, if the service is being run by client Foo, Inc., on job board www.foo.com and
   * career site www.bar.com, then this field is set to "foo.com" for use on the job board, and
   * "bar.com" for use on the career site.
   *
   * If this field isn't available for some reason, send "UNKNOWN". Any improvements to the model
   * for a particular tenant site rely on this field being set correctly to a domain.
   *
   * The maximum number of allowed characters is 255.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Required.
   *
   * The client-defined scope or source of the service call, which typically is the domain on which
   * the service has been implemented and is currently being run.
   *
   * For example, if the service is being run by client Foo, Inc., on job board www.foo.com and
   * career site www.bar.com, then this field is set to "foo.com" for use on the job board, and
   * "bar.com" for use on the career site.
   *
   * If this field isn't available for some reason, send "UNKNOWN". Any improvements to the model
   * for a particular tenant site rely on this field being set correctly to a domain.
   *
   * The maximum number of allowed characters is 255.
   * @param domain domain or {@code null} for none
   */
  public RequestMetadata setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Required.
   *
   * A unique session identification string. A session is defined as the duration of an end user's
   * interaction with the service over a certain period. Obfuscate this field for privacy concerns
   * before providing it to the service.
   *
   * If this field is not available for some reason, send "UNKNOWN". Note that any improvements to
   * the model for a particular tenant site, rely on this field being set correctly to some unique
   * session_id.
   *
   * The maximum number of allowed characters is 255.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Required.
   *
   * A unique session identification string. A session is defined as the duration of an end user's
   * interaction with the service over a certain period. Obfuscate this field for privacy concerns
   * before providing it to the service.
   *
   * If this field is not available for some reason, send "UNKNOWN". Note that any improvements to
   * the model for a particular tenant site, rely on this field being set correctly to some unique
   * session_id.
   *
   * The maximum number of allowed characters is 255.
   * @param sessionId sessionId or {@code null} for none
   */
  public RequestMetadata setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Required.
   *
   * A unique user identification string, as determined by the client. To have the strongest
   * positive impact on search quality make sure the client-level is unique. Obfuscate this field
   * for privacy concerns before providing it to the service.
   *
   * If this field is not available for some reason, send "UNKNOWN". Note that any improvements to
   * the model for a particular tenant site, rely on this field being set correctly to a unique
   * user_id.
   *
   * The maximum number of allowed characters is 255.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Required.
   *
   * A unique user identification string, as determined by the client. To have the strongest
   * positive impact on search quality make sure the client-level is unique. Obfuscate this field
   * for privacy concerns before providing it to the service.
   *
   * If this field is not available for some reason, send "UNKNOWN". Note that any improvements to
   * the model for a particular tenant site, rely on this field being set correctly to a unique
   * user_id.
   *
   * The maximum number of allowed characters is 255.
   * @param userId userId or {@code null} for none
   */
  public RequestMetadata setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public RequestMetadata set(String fieldName, Object value) {
    return (RequestMetadata) super.set(fieldName, value);
  }

  @Override
  public RequestMetadata clone() {
    return (RequestMetadata) super.clone();
  }

}
