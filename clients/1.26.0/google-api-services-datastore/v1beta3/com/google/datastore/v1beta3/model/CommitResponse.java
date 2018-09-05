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

package com.google.datastore.v1beta3.model;

/**
 * The response for Datastore.Commit.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommitResponse extends com.google.api.client.json.GenericJson {

  /**
   * The number of index entries updated during the commit, or zero if none were updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer indexUpdates;

  /**
   * The result of performing the mutations. The i-th mutation result corresponds to the i-th
   * mutation in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MutationResult> mutationResults;

  static {
    // hack to force ProGuard to consider MutationResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MutationResult.class);
  }

  /**
   * The number of index entries updated during the commit, or zero if none were updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndexUpdates() {
    return indexUpdates;
  }

  /**
   * The number of index entries updated during the commit, or zero if none were updated.
   * @param indexUpdates indexUpdates or {@code null} for none
   */
  public CommitResponse setIndexUpdates(java.lang.Integer indexUpdates) {
    this.indexUpdates = indexUpdates;
    return this;
  }

  /**
   * The result of performing the mutations. The i-th mutation result corresponds to the i-th
   * mutation in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<MutationResult> getMutationResults() {
    return mutationResults;
  }

  /**
   * The result of performing the mutations. The i-th mutation result corresponds to the i-th
   * mutation in the request.
   * @param mutationResults mutationResults or {@code null} for none
   */
  public CommitResponse setMutationResults(java.util.List<MutationResult> mutationResults) {
    this.mutationResults = mutationResults;
    return this;
  }

  @Override
  public CommitResponse set(String fieldName, Object value) {
    return (CommitResponse) super.set(fieldName, value);
  }

  @Override
  public CommitResponse clone() {
    return (CommitResponse) super.clone();
  }

}
