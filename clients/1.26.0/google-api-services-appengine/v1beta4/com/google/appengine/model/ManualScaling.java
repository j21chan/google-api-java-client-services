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

package com.google.appengine.model;

/**
 * A module with manual scaling runs continuously, allowing you to perform complex initialization
 * and rely on the state of its memory over time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManualScaling extends com.google.api.client.json.GenericJson {

  /**
   * Number of instances to assign to the module at the start. This number can later be altered by
   * using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions)
   * set_num_instances() function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer instances;

  /**
   * Number of instances to assign to the module at the start. This number can later be altered by
   * using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions)
   * set_num_instances() function.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInstances() {
    return instances;
  }

  /**
   * Number of instances to assign to the module at the start. This number can later be altered by
   * using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions)
   * set_num_instances() function.
   * @param instances instances or {@code null} for none
   */
  public ManualScaling setInstances(java.lang.Integer instances) {
    this.instances = instances;
    return this;
  }

  @Override
  public ManualScaling set(String fieldName, Object value) {
    return (ManualScaling) super.set(fieldName, value);
  }

  @Override
  public ManualScaling clone() {
    return (ManualScaling) super.clone();
  }

}
