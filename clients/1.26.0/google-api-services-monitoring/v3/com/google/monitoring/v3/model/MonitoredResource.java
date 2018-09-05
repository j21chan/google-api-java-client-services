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

package com.google.monitoring.v3.model;

/**
 * An object representing a resource that can be used for monitoring, logging, billing, or other
 * purposes. Examples include virtual machine instances, databases, and storage devices such as
 * disks. The type field identifies a MonitoredResourceDescriptor object that describes the
 * resource's schema. Information in the labels field identifies the actual resource and its
 * attributes according to the schema. For example, a particular Compute Engine VM instance could be
 * represented by the following object, because the MonitoredResourceDescriptor for "gce_instance"
 * has labels "instance_id" and "zone": { "type": "gce_instance",   "labels": { "instance_id":
 * "12345678901234",               "zone": "us-central1-a" }}
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MonitoredResource extends com.google.api.client.json.GenericJson {

  /**
   * Required. Values for all of the labels listed in the associated monitored resource descriptor.
   * For example, Compute Engine VM instances use the labels "project_id", "instance_id", and
   * "zone".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The monitored resource type. This field must match the type field of a
   * MonitoredResourceDescriptor object. For example, the type of a Compute Engine VM instance is
   * gce_instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required. Values for all of the labels listed in the associated monitored resource descriptor.
   * For example, Compute Engine VM instances use the labels "project_id", "instance_id", and
   * "zone".
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Required. Values for all of the labels listed in the associated monitored resource descriptor.
   * For example, Compute Engine VM instances use the labels "project_id", "instance_id", and
   * "zone".
   * @param labels labels or {@code null} for none
   */
  public MonitoredResource setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The monitored resource type. This field must match the type field of a
   * MonitoredResourceDescriptor object. For example, the type of a Compute Engine VM instance is
   * gce_instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The monitored resource type. This field must match the type field of a
   * MonitoredResourceDescriptor object. For example, the type of a Compute Engine VM instance is
   * gce_instance.
   * @param type type or {@code null} for none
   */
  public MonitoredResource setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public MonitoredResource set(String fieldName, Object value) {
    return (MonitoredResource) super.set(fieldName, value);
  }

  @Override
  public MonitoredResource clone() {
    return (MonitoredResource) super.clone();
  }

}
