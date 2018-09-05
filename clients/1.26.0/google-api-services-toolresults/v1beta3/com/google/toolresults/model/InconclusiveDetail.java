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

package com.google.toolresults.model;

/**
 * Model definition for InconclusiveDetail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InconclusiveDetail extends com.google.api.client.json.GenericJson {

  /**
   * If the end user aborted the test execution before a pass or fail could be determined. For
   * example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was
   * running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean abortedByUser;

  /**
   * If the test runner could not determine success or failure because the test depends on a
   * component other than the system under test which failed.
   *
   * For example, a mobile test requires provisioning a device where the test executes, and that
   * provisioning can fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean infrastructureFailure;

  /**
   * If the end user aborted the test execution before a pass or fail could be determined. For
   * example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was
   * running.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAbortedByUser() {
    return abortedByUser;
  }

  /**
   * If the end user aborted the test execution before a pass or fail could be determined. For
   * example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was
   * running.
   * @param abortedByUser abortedByUser or {@code null} for none
   */
  public InconclusiveDetail setAbortedByUser(java.lang.Boolean abortedByUser) {
    this.abortedByUser = abortedByUser;
    return this;
  }

  /**
   * If the test runner could not determine success or failure because the test depends on a
   * component other than the system under test which failed.
   *
   * For example, a mobile test requires provisioning a device where the test executes, and that
   * provisioning can fail.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInfrastructureFailure() {
    return infrastructureFailure;
  }

  /**
   * If the test runner could not determine success or failure because the test depends on a
   * component other than the system under test which failed.
   *
   * For example, a mobile test requires provisioning a device where the test executes, and that
   * provisioning can fail.
   * @param infrastructureFailure infrastructureFailure or {@code null} for none
   */
  public InconclusiveDetail setInfrastructureFailure(java.lang.Boolean infrastructureFailure) {
    this.infrastructureFailure = infrastructureFailure;
    return this;
  }

  @Override
  public InconclusiveDetail set(String fieldName, Object value) {
    return (InconclusiveDetail) super.set(fieldName, value);
  }

  @Override
  public InconclusiveDetail clone() {
    return (InconclusiveDetail) super.clone();
  }

}
