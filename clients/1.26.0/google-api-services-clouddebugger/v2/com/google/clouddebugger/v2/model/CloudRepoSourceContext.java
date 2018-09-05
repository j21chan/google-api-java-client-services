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

package com.google.clouddebugger.v2.model;

/**
 * A CloudRepoSourceContext denotes a particular revision in a cloud repo (a repo hosted by the
 * Google Cloud Platform).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Debugger API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudRepoSourceContext extends com.google.api.client.json.GenericJson {

  /**
   * An alias, which may be a branch or tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AliasContext aliasContext;

  /**
   * The name of an alias (branch, tag, etc.).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aliasName;

  /**
   * The ID of the repo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepoId repoId;

  /**
   * A revision ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * An alias, which may be a branch or tag.
   * @return value or {@code null} for none
   */
  public AliasContext getAliasContext() {
    return aliasContext;
  }

  /**
   * An alias, which may be a branch or tag.
   * @param aliasContext aliasContext or {@code null} for none
   */
  public CloudRepoSourceContext setAliasContext(AliasContext aliasContext) {
    this.aliasContext = aliasContext;
    return this;
  }

  /**
   * The name of an alias (branch, tag, etc.).
   * @return value or {@code null} for none
   */
  public java.lang.String getAliasName() {
    return aliasName;
  }

  /**
   * The name of an alias (branch, tag, etc.).
   * @param aliasName aliasName or {@code null} for none
   */
  public CloudRepoSourceContext setAliasName(java.lang.String aliasName) {
    this.aliasName = aliasName;
    return this;
  }

  /**
   * The ID of the repo.
   * @return value or {@code null} for none
   */
  public RepoId getRepoId() {
    return repoId;
  }

  /**
   * The ID of the repo.
   * @param repoId repoId or {@code null} for none
   */
  public CloudRepoSourceContext setRepoId(RepoId repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * A revision ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * A revision ID.
   * @param revisionId revisionId or {@code null} for none
   */
  public CloudRepoSourceContext setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  @Override
  public CloudRepoSourceContext set(String fieldName, Object value) {
    return (CloudRepoSourceContext) super.set(fieldName, value);
  }

  @Override
  public CloudRepoSourceContext clone() {
    return (CloudRepoSourceContext) super.clone();
  }

}
