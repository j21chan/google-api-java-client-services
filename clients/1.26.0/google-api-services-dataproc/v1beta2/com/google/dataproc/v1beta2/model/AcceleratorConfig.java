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

package com.google.dataproc.v1beta2.model;

/**
 * Specifies the type and number of accelerator cards attached to the instances of an instance group
 * (see GPUs on Compute Engine).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AcceleratorConfig extends com.google.api.client.json.GenericJson {

  /**
   * The number of the accelerator cards of this type exposed to this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer acceleratorCount;

  /**
   * Full URL, partial URI, or short name of the accelerator type resource to expose to this
   * instance. See Compute Engine AcceleratorTypes(
   * /compute/docs/reference/beta/acceleratorTypes)Examples *
   * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes
   * /nvidia-tesla-k80 * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 *
   * nvidia-tesla-k80Auto Zone Exception: If you are using the Cloud Dataproc Auto Zone Placement
   * feature, you must use the short name of the accelerator type resource, for example, nvidia-
   * tesla-k80.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acceleratorTypeUri;

  /**
   * The number of the accelerator cards of this type exposed to this instance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAcceleratorCount() {
    return acceleratorCount;
  }

  /**
   * The number of the accelerator cards of this type exposed to this instance.
   * @param acceleratorCount acceleratorCount or {@code null} for none
   */
  public AcceleratorConfig setAcceleratorCount(java.lang.Integer acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  /**
   * Full URL, partial URI, or short name of the accelerator type resource to expose to this
   * instance. See Compute Engine AcceleratorTypes(
   * /compute/docs/reference/beta/acceleratorTypes)Examples *
   * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes
   * /nvidia-tesla-k80 * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 *
   * nvidia-tesla-k80Auto Zone Exception: If you are using the Cloud Dataproc Auto Zone Placement
   * feature, you must use the short name of the accelerator type resource, for example, nvidia-
   * tesla-k80.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcceleratorTypeUri() {
    return acceleratorTypeUri;
  }

  /**
   * Full URL, partial URI, or short name of the accelerator type resource to expose to this
   * instance. See Compute Engine AcceleratorTypes(
   * /compute/docs/reference/beta/acceleratorTypes)Examples *
   * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes
   * /nvidia-tesla-k80 * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80 *
   * nvidia-tesla-k80Auto Zone Exception: If you are using the Cloud Dataproc Auto Zone Placement
   * feature, you must use the short name of the accelerator type resource, for example, nvidia-
   * tesla-k80.
   * @param acceleratorTypeUri acceleratorTypeUri or {@code null} for none
   */
  public AcceleratorConfig setAcceleratorTypeUri(java.lang.String acceleratorTypeUri) {
    this.acceleratorTypeUri = acceleratorTypeUri;
    return this;
  }

  @Override
  public AcceleratorConfig set(String fieldName, Object value) {
    return (AcceleratorConfig) super.set(fieldName, value);
  }

  @Override
  public AcceleratorConfig clone() {
    return (AcceleratorConfig) super.clone();
  }

}
