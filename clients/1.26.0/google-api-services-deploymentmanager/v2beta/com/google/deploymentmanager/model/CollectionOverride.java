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
 * CollectionOverride allows resource handling overrides for specific resources within a BaseType
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
public final class CollectionOverride extends com.google.api.client.json.GenericJson {

  /**
   * The collection that identifies this resource within its service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collection;

  /**
   * The options to apply to this resource-level override
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Options options;

  /**
   * The collection that identifies this resource within its service.
   * @return value or {@code null} for none
   */
  public java.lang.String getCollection() {
    return collection;
  }

  /**
   * The collection that identifies this resource within its service.
   * @param collection collection or {@code null} for none
   */
  public CollectionOverride setCollection(java.lang.String collection) {
    this.collection = collection;
    return this;
  }

  /**
   * The options to apply to this resource-level override
   * @return value or {@code null} for none
   */
  public Options getOptions() {
    return options;
  }

  /**
   * The options to apply to this resource-level override
   * @param options options or {@code null} for none
   */
  public CollectionOverride setOptions(Options options) {
    this.options = options;
    return this;
  }

  @Override
  public CollectionOverride set(String fieldName, Object value) {
    return (CollectionOverride) super.set(fieldName, value);
  }

  @Override
  public CollectionOverride clone() {
    return (CollectionOverride) super.clone();
  }

}
