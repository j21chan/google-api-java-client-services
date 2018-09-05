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
 * The response for GetDatabaseDdl.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetDatabaseDdlResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of formatted DDL statements defining the schema of the database specified in the
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> statements;

  /**
   * A list of formatted DDL statements defining the schema of the database specified in the
   * request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStatements() {
    return statements;
  }

  /**
   * A list of formatted DDL statements defining the schema of the database specified in the
   * request.
   * @param statements statements or {@code null} for none
   */
  public GetDatabaseDdlResponse setStatements(java.util.List<java.lang.String> statements) {
    this.statements = statements;
    return this;
  }

  @Override
  public GetDatabaseDdlResponse set(String fieldName, Object value) {
    return (GetDatabaseDdlResponse) super.set(fieldName, value);
  }

  @Override
  public GetDatabaseDdlResponse clone() {
    return (GetDatabaseDdlResponse) super.clone();
  }

}
