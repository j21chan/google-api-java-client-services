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

package com.google.cloudshell.v1.model;

/**
 * Message included in the response field of operations returned from StartEnvironment once the
 * operation is complete.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Shell API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StartEnvironmentResponse extends com.google.api.client.json.GenericJson {

  /**
   * Environment that was started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Environment environment;

  /**
   * Environment that was started.
   * @return value or {@code null} for none
   */
  public Environment getEnvironment() {
    return environment;
  }

  /**
   * Environment that was started.
   * @param environment environment or {@code null} for none
   */
  public StartEnvironmentResponse setEnvironment(Environment environment) {
    this.environment = environment;
    return this;
  }

  @Override
  public StartEnvironmentResponse set(String fieldName, Object value) {
    return (StartEnvironmentResponse) super.set(fieldName, value);
  }

  @Override
  public StartEnvironmentResponse clone() {
    return (StartEnvironmentResponse) super.clone();
  }

}
