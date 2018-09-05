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

package com.google.firestore.v1beta1.model;

/**
 * A Document has been deleted.
 *
 * May be the result of multiple writes, including updates, the last of which deleted the Document.
 *
 * Multiple DocumentDelete messages may be returned for the same logical delete, if multiple targets
 * are affected.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentDelete extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the Document that was deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String document;

  /**
   * The read timestamp at which the delete was observed.
   *
   * Greater or equal to the `commit_time` of the delete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * A set of target IDs for targets that previously matched this entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> removedTargetIds;

  /**
   * The resource name of the Document that was deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocument() {
    return document;
  }

  /**
   * The resource name of the Document that was deleted.
   * @param document document or {@code null} for none
   */
  public DocumentDelete setDocument(java.lang.String document) {
    this.document = document;
    return this;
  }

  /**
   * The read timestamp at which the delete was observed.
   *
   * Greater or equal to the `commit_time` of the delete.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * The read timestamp at which the delete was observed.
   *
   * Greater or equal to the `commit_time` of the delete.
   * @param readTime readTime or {@code null} for none
   */
  public DocumentDelete setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  /**
   * A set of target IDs for targets that previously matched this entity.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getRemovedTargetIds() {
    return removedTargetIds;
  }

  /**
   * A set of target IDs for targets that previously matched this entity.
   * @param removedTargetIds removedTargetIds or {@code null} for none
   */
  public DocumentDelete setRemovedTargetIds(java.util.List<java.lang.Integer> removedTargetIds) {
    this.removedTargetIds = removedTargetIds;
    return this;
  }

  @Override
  public DocumentDelete set(String fieldName, Object value) {
    return (DocumentDelete) super.set(fieldName, value);
  }

  @Override
  public DocumentDelete clone() {
    return (DocumentDelete) super.clone();
  }

}
