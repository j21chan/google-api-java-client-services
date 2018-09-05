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

package com.google.serviceusage.v1.model;

/**
 * Response message for the `DisableService` method. This response message is assigned to the
 * `response` field of the returned Operation when that operation is done.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DisableServiceResponse extends com.google.api.client.json.GenericJson {

  /**
   * The new state of the service after disabling.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleApiServiceusageV1Service service;

  /**
   * The new state of the service after disabling.
   * @return value or {@code null} for none
   */
  public GoogleApiServiceusageV1Service getService() {
    return service;
  }

  /**
   * The new state of the service after disabling.
   * @param service service or {@code null} for none
   */
  public DisableServiceResponse setService(GoogleApiServiceusageV1Service service) {
    this.service = service;
    return this;
  }

  @Override
  public DisableServiceResponse set(String fieldName, Object value) {
    return (DisableServiceResponse) super.set(fieldName, value);
  }

  @Override
  public DisableServiceResponse clone() {
    return (DisableServiceResponse) super.clone();
  }

}
