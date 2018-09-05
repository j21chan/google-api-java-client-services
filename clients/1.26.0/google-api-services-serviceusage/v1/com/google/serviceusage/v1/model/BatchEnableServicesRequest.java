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
 * Request message for the `BatchEnableServices` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchEnableServicesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The identifiers of the services to enable on the project.
   *
   * A valid identifier would be: serviceusage.googleapis.com
   *
   * Enabling services requires that each service is public or is shared with the user enabling the
   * service.
   *
   * Two or more services must be specified. To enable a single service, use the `EnableService`
   * method instead.
   *
   * A single request can enable a maximum of 20 services at a time. If more than 20 services are
   * specified, the request will fail, and no state changes will occur.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> serviceIds;

  /**
   * The identifiers of the services to enable on the project.
   *
   * A valid identifier would be: serviceusage.googleapis.com
   *
   * Enabling services requires that each service is public or is shared with the user enabling the
   * service.
   *
   * Two or more services must be specified. To enable a single service, use the `EnableService`
   * method instead.
   *
   * A single request can enable a maximum of 20 services at a time. If more than 20 services are
   * specified, the request will fail, and no state changes will occur.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServiceIds() {
    return serviceIds;
  }

  /**
   * The identifiers of the services to enable on the project.
   *
   * A valid identifier would be: serviceusage.googleapis.com
   *
   * Enabling services requires that each service is public or is shared with the user enabling the
   * service.
   *
   * Two or more services must be specified. To enable a single service, use the `EnableService`
   * method instead.
   *
   * A single request can enable a maximum of 20 services at a time. If more than 20 services are
   * specified, the request will fail, and no state changes will occur.
   * @param serviceIds serviceIds or {@code null} for none
   */
  public BatchEnableServicesRequest setServiceIds(java.util.List<java.lang.String> serviceIds) {
    this.serviceIds = serviceIds;
    return this;
  }

  @Override
  public BatchEnableServicesRequest set(String fieldName, Object value) {
    return (BatchEnableServicesRequest) super.set(fieldName, value);
  }

  @Override
  public BatchEnableServicesRequest clone() {
    return (BatchEnableServicesRequest) super.clone();
  }

}
