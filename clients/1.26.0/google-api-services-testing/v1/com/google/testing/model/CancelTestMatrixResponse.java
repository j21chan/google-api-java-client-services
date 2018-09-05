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

package com.google.testing.model;

/**
 * Response containing the current state of the specified test matrix.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CancelTestMatrixResponse extends com.google.api.client.json.GenericJson {

  /**
   * The current rolled-up state of the test matrix. If this state is already final, then the
   * cancelation request will have no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String testState;

  /**
   * The current rolled-up state of the test matrix. If this state is already final, then the
   * cancelation request will have no effect.
   * @return value or {@code null} for none
   */
  public java.lang.String getTestState() {
    return testState;
  }

  /**
   * The current rolled-up state of the test matrix. If this state is already final, then the
   * cancelation request will have no effect.
   * @param testState testState or {@code null} for none
   */
  public CancelTestMatrixResponse setTestState(java.lang.String testState) {
    this.testState = testState;
    return this;
  }

  @Override
  public CancelTestMatrixResponse set(String fieldName, Object value) {
    return (CancelTestMatrixResponse) super.set(fieldName, value);
  }

  @Override
  public CancelTestMatrixResponse clone() {
    return (CancelTestMatrixResponse) super.clone();
  }

}
