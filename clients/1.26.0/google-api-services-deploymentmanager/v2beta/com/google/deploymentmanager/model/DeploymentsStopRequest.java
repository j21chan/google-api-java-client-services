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

package com.google.deploymentmanager.model;

/**
 * Model definition for DeploymentsStopRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API V2Beta Methods.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeploymentsStopRequest extends com.google.api.client.json.GenericJson {

  /**
   * Specifies a fingerprint for stop() requests. A fingerprint is a randomly generated value that
   * must be provided in stop() requests to perform optimistic locking. This ensures optimistic
   * concurrency so that the deployment does not have conflicting requests (e.g. if someone attempts
   * to make a new update request while another user attempts to stop an ongoing update request,
   * this would prevent a collision).
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify a deployment. To get the latest fingerprint value, perform a get() request on the
   * deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Specifies a fingerprint for stop() requests. A fingerprint is a randomly generated value that
   * must be provided in stop() requests to perform optimistic locking. This ensures optimistic
   * concurrency so that the deployment does not have conflicting requests (e.g. if someone attempts
   * to make a new update request while another user attempts to stop an ongoing update request,
   * this would prevent a collision).
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify a deployment. To get the latest fingerprint value, perform a get() request on the
   * deployment.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Specifies a fingerprint for stop() requests. A fingerprint is a randomly generated value that
   * must be provided in stop() requests to perform optimistic locking. This ensures optimistic
   * concurrency so that the deployment does not have conflicting requests (e.g. if someone attempts
   * to make a new update request while another user attempts to stop an ongoing update request,
   * this would prevent a collision).
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify a deployment. To get the latest fingerprint value, perform a get() request on the
   * deployment.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Specifies a fingerprint for stop() requests. A fingerprint is a randomly generated value that
   * must be provided in stop() requests to perform optimistic locking. This ensures optimistic
   * concurrency so that the deployment does not have conflicting requests (e.g. if someone attempts
   * to make a new update request while another user attempts to stop an ongoing update request,
   * this would prevent a collision).
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify a deployment. To get the latest fingerprint value, perform a get() request on the
   * deployment.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public DeploymentsStopRequest setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Specifies a fingerprint for stop() requests. A fingerprint is a randomly generated value that
   * must be provided in stop() requests to perform optimistic locking. This ensures optimistic
   * concurrency so that the deployment does not have conflicting requests (e.g. if someone attempts
   * to make a new update request while another user attempts to stop an ongoing update request,
   * this would prevent a collision).
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify a deployment. To get the latest fingerprint value, perform a get() request on the
   * deployment.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public DeploymentsStopRequest encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  @Override
  public DeploymentsStopRequest set(String fieldName, Object value) {
    return (DeploymentsStopRequest) super.set(fieldName, value);
  }

  @Override
  public DeploymentsStopRequest clone() {
    return (DeploymentsStopRequest) super.clone();
  }

}
