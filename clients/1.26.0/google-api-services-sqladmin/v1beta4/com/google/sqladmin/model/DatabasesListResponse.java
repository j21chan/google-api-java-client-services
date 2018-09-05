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

package com.google.sqladmin.model;

/**
 * Database list response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatabasesListResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of database resources in the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Database> items;

  static {
    // hack to force ProGuard to consider Database used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Database.class);
  }

  /**
   * This is always sql#databasesList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * List of database resources in the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<Database> getItems() {
    return items;
  }

  /**
   * List of database resources in the instance.
   * @param items items or {@code null} for none
   */
  public DatabasesListResponse setItems(java.util.List<Database> items) {
    this.items = items;
    return this;
  }

  /**
   * This is always sql#databasesList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#databasesList.
   * @param kind kind or {@code null} for none
   */
  public DatabasesListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public DatabasesListResponse set(String fieldName, Object value) {
    return (DatabasesListResponse) super.set(fieldName, value);
  }

  @Override
  public DatabasesListResponse clone() {
    return (DatabasesListResponse) super.clone();
  }

}
