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

package com.google.spanner.v1.model;

/**
 * Metadata type for the operation returned by CreateDatabase.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateDatabaseMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The database being created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String database;

  /**
   * The database being created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabase() {
    return database;
  }

  /**
   * The database being created.
   * @param database database or {@code null} for none
   */
  public CreateDatabaseMetadata setDatabase(java.lang.String database) {
    this.database = database;
    return this;
  }

  @Override
  public CreateDatabaseMetadata set(String fieldName, Object value) {
    return (CreateDatabaseMetadata) super.set(fieldName, value);
  }

  @Override
  public CreateDatabaseMetadata clone() {
    return (CreateDatabaseMetadata) super.clone();
  }

}
