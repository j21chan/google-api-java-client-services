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
 * A Cloud Spanner database.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Database extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the database. Values are of the form `projects//instances//databases/`,
   * where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other
   * API methods to identify the database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The current database state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. The name of the database. Values are of the form `projects//instances//databases/`,
   * where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other
   * API methods to identify the database.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the database. Values are of the form `projects//instances//databases/`,
   * where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to other
   * API methods to identify the database.
   * @param name name or {@code null} for none
   */
  public Database setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The current database state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current database state.
   * @param state state or {@code null} for none
   */
  public Database setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Database set(String fieldName, Object value) {
    return (Database) super.set(fieldName, value);
  }

  @Override
  public Database clone() {
    return (Database) super.clone();
  }

}
