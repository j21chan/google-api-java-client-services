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

package com.google.dfareporting.model;

/**
 * Connection Type List Response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConnectionTypesListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Collection of connection types such as broadband and mobile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConnectionType> connectionTypes;

  static {
    // hack to force ProGuard to consider ConnectionType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConnectionType.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#connectionTypesListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Collection of connection types such as broadband and mobile.
   * @return value or {@code null} for none
   */
  public java.util.List<ConnectionType> getConnectionTypes() {
    return connectionTypes;
  }

  /**
   * Collection of connection types such as broadband and mobile.
   * @param connectionTypes connectionTypes or {@code null} for none
   */
  public ConnectionTypesListResponse setConnectionTypes(java.util.List<ConnectionType> connectionTypes) {
    this.connectionTypes = connectionTypes;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#connectionTypesListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#connectionTypesListResponse".
   * @param kind kind or {@code null} for none
   */
  public ConnectionTypesListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public ConnectionTypesListResponse set(String fieldName, Object value) {
    return (ConnectionTypesListResponse) super.set(fieldName, value);
  }

  @Override
  public ConnectionTypesListResponse clone() {
    return (ConnectionTypesListResponse) super.clone();
  }

}
