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
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to
 * a unique revision of a single file or directory.
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
public final class SourceContext extends com.google.api.client.json.GenericJson {

  /**
   * A SourceContext referring to a revision in a cloud repo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudRepoSourceContext cloudRepo;

  /**
   * A SourceContext referring to a snapshot in a cloud workspace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudWorkspaceSourceContext cloudWorkspace;

  /**
   * A SourceContext referring to a Gerrit project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerritSourceContext gerrit;

  /**
   * A SourceContext referring to any third party Git repo (e.g. GitHub).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GitSourceContext git;

  /**
   * A SourceContext referring to a revision in a cloud repo.
   * @return value or {@code null} for none
   */
  public CloudRepoSourceContext getCloudRepo() {
    return cloudRepo;
  }

  /**
   * A SourceContext referring to a revision in a cloud repo.
   * @param cloudRepo cloudRepo or {@code null} for none
   */
  public SourceContext setCloudRepo(CloudRepoSourceContext cloudRepo) {
    this.cloudRepo = cloudRepo;
    return this;
  }

  /**
   * A SourceContext referring to a snapshot in a cloud workspace.
   * @return value or {@code null} for none
   */
  public CloudWorkspaceSourceContext getCloudWorkspace() {
    return cloudWorkspace;
  }

  /**
   * A SourceContext referring to a snapshot in a cloud workspace.
   * @param cloudWorkspace cloudWorkspace or {@code null} for none
   */
  public SourceContext setCloudWorkspace(CloudWorkspaceSourceContext cloudWorkspace) {
    this.cloudWorkspace = cloudWorkspace;
    return this;
  }

  /**
   * A SourceContext referring to a Gerrit project.
   * @return value or {@code null} for none
   */
  public GerritSourceContext getGerrit() {
    return gerrit;
  }

  /**
   * A SourceContext referring to a Gerrit project.
   * @param gerrit gerrit or {@code null} for none
   */
  public SourceContext setGerrit(GerritSourceContext gerrit) {
    this.gerrit = gerrit;
    return this;
  }

  /**
   * A SourceContext referring to any third party Git repo (e.g. GitHub).
   * @return value or {@code null} for none
   */
  public GitSourceContext getGit() {
    return git;
  }

  /**
   * A SourceContext referring to any third party Git repo (e.g. GitHub).
   * @param git git or {@code null} for none
   */
  public SourceContext setGit(GitSourceContext git) {
    this.git = git;
    return this;
  }

  @Override
  public SourceContext set(String fieldName, Object value) {
    return (SourceContext) super.set(fieldName, value);
  }

  @Override
  public SourceContext clone() {
    return (SourceContext) super.clone();
  }

}
