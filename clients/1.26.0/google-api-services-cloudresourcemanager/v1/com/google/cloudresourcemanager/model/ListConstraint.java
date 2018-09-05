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

package com.google.cloudresourcemanager.model;

/**
 * A `Constraint` that allows or disallows a list of string values, which are configured by an
 * Organization's policy administrator with a `Policy`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListConstraint extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Google Cloud Console will try to default to a configuration that matches the
   * value specified in this `Constraint`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestedValue;

  /**
   * Indicates whether subtrees of Cloud Resource Manager resource hierarchy can be used in
   * `Policy.allowed_values` and `Policy.denied_values`. For example, `"under:folders/123"` would
   * match any resource under the 'folders/123' folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean supportsUnder;

  /**
   * Optional. The Google Cloud Console will try to default to a configuration that matches the
   * value specified in this `Constraint`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestedValue() {
    return suggestedValue;
  }

  /**
   * Optional. The Google Cloud Console will try to default to a configuration that matches the
   * value specified in this `Constraint`.
   * @param suggestedValue suggestedValue or {@code null} for none
   */
  public ListConstraint setSuggestedValue(java.lang.String suggestedValue) {
    this.suggestedValue = suggestedValue;
    return this;
  }

  /**
   * Indicates whether subtrees of Cloud Resource Manager resource hierarchy can be used in
   * `Policy.allowed_values` and `Policy.denied_values`. For example, `"under:folders/123"` would
   * match any resource under the 'folders/123' folder.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSupportsUnder() {
    return supportsUnder;
  }

  /**
   * Indicates whether subtrees of Cloud Resource Manager resource hierarchy can be used in
   * `Policy.allowed_values` and `Policy.denied_values`. For example, `"under:folders/123"` would
   * match any resource under the 'folders/123' folder.
   * @param supportsUnder supportsUnder or {@code null} for none
   */
  public ListConstraint setSupportsUnder(java.lang.Boolean supportsUnder) {
    this.supportsUnder = supportsUnder;
    return this;
  }

  @Override
  public ListConstraint set(String fieldName, Object value) {
    return (ListConstraint) super.set(fieldName, value);
  }

  @Override
  public ListConstraint clone() {
    return (ListConstraint) super.clone();
  }

}
