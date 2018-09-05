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

package com.google.androidenterprise.model;

/**
 * The matching enterprise resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterprisesListResponse extends com.google.api.client.json.GenericJson {

  /**
   * An enterprise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Enterprise> enterprise;

  static {
    // hack to force ProGuard to consider Enterprise used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Enterprise.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#enterprisesListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An enterprise.
   * @return value or {@code null} for none
   */
  public java.util.List<Enterprise> getEnterprise() {
    return enterprise;
  }

  /**
   * An enterprise.
   * @param enterprise enterprise or {@code null} for none
   */
  public EnterprisesListResponse setEnterprise(java.util.List<Enterprise> enterprise) {
    this.enterprise = enterprise;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#enterprisesListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#enterprisesListResponse".
   * @param kind kind or {@code null} for none
   */
  public EnterprisesListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public EnterprisesListResponse set(String fieldName, Object value) {
    return (EnterprisesListResponse) super.set(fieldName, value);
  }

  @Override
  public EnterprisesListResponse clone() {
    return (EnterprisesListResponse) super.clone();
  }

}
