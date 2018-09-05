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

package com.google.datastore.v1.model;

/**
 * The response for Datastore.RunQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunQueryResponse extends com.google.api.client.json.GenericJson {

  /**
   * A batch of query results (always present).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueryResultBatch batch;

  /**
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Query query;

  /**
   * A batch of query results (always present).
   * @return value or {@code null} for none
   */
  public QueryResultBatch getBatch() {
    return batch;
  }

  /**
   * A batch of query results (always present).
   * @param batch batch or {@code null} for none
   */
  public RunQueryResponse setBatch(QueryResultBatch batch) {
    this.batch = batch;
    return this;
  }

  /**
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * @return value or {@code null} for none
   */
  public Query getQuery() {
    return query;
  }

  /**
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * @param query query or {@code null} for none
   */
  public RunQueryResponse setQuery(Query query) {
    this.query = query;
    return this;
  }

  @Override
  public RunQueryResponse set(String fieldName, Object value) {
    return (RunQueryResponse) super.set(fieldName, value);
  }

  @Override
  public RunQueryResponse clone() {
    return (RunQueryResponse) super.clone();
  }

}
