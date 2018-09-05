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

package com.google.iam.v1.model;

/**
 * Contains information about an auditable service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuditableService extends com.google.api.client.json.GenericJson {

  /**
   * Public name of the service. For example, the service name for Cloud IAM is
   * 'iam.googleapis.com'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Public name of the service. For example, the service name for Cloud IAM is
   * 'iam.googleapis.com'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Public name of the service. For example, the service name for Cloud IAM is
   * 'iam.googleapis.com'.
   * @param name name or {@code null} for none
   */
  public AuditableService setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public AuditableService set(String fieldName, Object value) {
    return (AuditableService) super.set(fieldName, value);
  }

  @Override
  public AuditableService clone() {
    return (AuditableService) super.clone();
  }

}
