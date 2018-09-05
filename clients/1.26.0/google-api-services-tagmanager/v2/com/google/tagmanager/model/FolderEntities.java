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

package com.google.tagmanager.model;

/**
 * Represents a Google Tag Manager Folder's contents.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FolderEntities extends com.google.api.client.json.GenericJson {

  /**
   * Continuation token for fetching the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of tags inside the folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Tag> tag;

  /**
   * The list of triggers inside the folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Trigger> trigger;

  /**
   * The list of variables inside the folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Variable> variable;

  /**
   * Continuation token for fetching the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Continuation token for fetching the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public FolderEntities setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of tags inside the folder.
   * @return value or {@code null} for none
   */
  public java.util.List<Tag> getTag() {
    return tag;
  }

  /**
   * The list of tags inside the folder.
   * @param tag tag or {@code null} for none
   */
  public FolderEntities setTag(java.util.List<Tag> tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The list of triggers inside the folder.
   * @return value or {@code null} for none
   */
  public java.util.List<Trigger> getTrigger() {
    return trigger;
  }

  /**
   * The list of triggers inside the folder.
   * @param trigger trigger or {@code null} for none
   */
  public FolderEntities setTrigger(java.util.List<Trigger> trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * The list of variables inside the folder.
   * @return value or {@code null} for none
   */
  public java.util.List<Variable> getVariable() {
    return variable;
  }

  /**
   * The list of variables inside the folder.
   * @param variable variable or {@code null} for none
   */
  public FolderEntities setVariable(java.util.List<Variable> variable) {
    this.variable = variable;
    return this;
  }

  @Override
  public FolderEntities set(String fieldName, Object value) {
    return (FolderEntities) super.set(fieldName, value);
  }

  @Override
  public FolderEntities clone() {
    return (FolderEntities) super.clone();
  }

}
