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

package com.google.serviceusage.v1beta1.model;

/**
 * Provides error messages for the failing services.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnableFailure extends com.google.api.client.json.GenericJson {

  /**
   * An error message describing why the service could not be enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * The service id of a service that could not be enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceId;

  /**
   * An error message describing why the service could not be enabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * An error message describing why the service could not be enabled.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public EnableFailure setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The service id of a service that could not be enabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceId() {
    return serviceId;
  }

  /**
   * The service id of a service that could not be enabled.
   * @param serviceId serviceId or {@code null} for none
   */
  public EnableFailure setServiceId(java.lang.String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  @Override
  public EnableFailure set(String fieldName, Object value) {
    return (EnableFailure) super.set(fieldName, value);
  }

  @Override
  public EnableFailure clone() {
    return (EnableFailure) super.clone();
  }

}
