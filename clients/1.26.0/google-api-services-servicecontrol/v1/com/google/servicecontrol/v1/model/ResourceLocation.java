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

package com.google.servicecontrol.v1.model;

/**
 * Location information about a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceLocation extends com.google.api.client.json.GenericJson {

  /**
   * The locations of a resource after the execution of the operation. For example:
   *
   *     "europe-west1-a"     "us-east1"     "nam3"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> currentLocations;

  /**
   * The locations of a resource after the execution of the operation. For example:
   *
   *     "europe-west1-a"     "us-east1"     "nam3"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCurrentLocations() {
    return currentLocations;
  }

  /**
   * The locations of a resource after the execution of the operation. For example:
   *
   *     "europe-west1-a"     "us-east1"     "nam3"
   * @param currentLocations currentLocations or {@code null} for none
   */
  public ResourceLocation setCurrentLocations(java.util.List<java.lang.String> currentLocations) {
    this.currentLocations = currentLocations;
    return this;
  }

  @Override
  public ResourceLocation set(String fieldName, Object value) {
    return (ResourceLocation) super.set(fieldName, value);
  }

  @Override
  public ResourceLocation clone() {
    return (ResourceLocation) super.clone();
  }

}
