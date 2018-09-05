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

package com.google.serviceuser.v1.model;

/**
 * The published version of a Service that is managed by Google Service Management.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service User API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PublishedService extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the service.
   *
   * A valid name would be: - services/serviceuser.googleapis.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The service's published configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Service service;

  /**
   * The resource name of the service.
   *
   * A valid name would be: - services/serviceuser.googleapis.com
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the service.
   *
   * A valid name would be: - services/serviceuser.googleapis.com
   * @param name name or {@code null} for none
   */
  public PublishedService setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The service's published configuration.
   * @return value or {@code null} for none
   */
  public Service getService() {
    return service;
  }

  /**
   * The service's published configuration.
   * @param service service or {@code null} for none
   */
  public PublishedService setService(Service service) {
    this.service = service;
    return this;
  }

  @Override
  public PublishedService set(String fieldName, Object value) {
    return (PublishedService) super.set(fieldName, value);
  }

  @Override
  public PublishedService clone() {
    return (PublishedService) super.clone();
  }

}
