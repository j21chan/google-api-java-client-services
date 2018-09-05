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
 * A change in the proposal's status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkspaceProposalHistoryStatusChange extends com.google.api.client.json.GenericJson {

  /**
   * The new proposal status after that status change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newStatus;

  /**
   * The old proposal status before the status change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oldStatus;

  /**
   * The new proposal status after that status change.
   * @return value or {@code null} for none
   */
  public java.lang.String getNewStatus() {
    return newStatus;
  }

  /**
   * The new proposal status after that status change.
   * @param newStatus newStatus or {@code null} for none
   */
  public WorkspaceProposalHistoryStatusChange setNewStatus(java.lang.String newStatus) {
    this.newStatus = newStatus;
    return this;
  }

  /**
   * The old proposal status before the status change.
   * @return value or {@code null} for none
   */
  public java.lang.String getOldStatus() {
    return oldStatus;
  }

  /**
   * The old proposal status before the status change.
   * @param oldStatus oldStatus or {@code null} for none
   */
  public WorkspaceProposalHistoryStatusChange setOldStatus(java.lang.String oldStatus) {
    this.oldStatus = oldStatus;
    return this;
  }

  @Override
  public WorkspaceProposalHistoryStatusChange set(String fieldName, Object value) {
    return (WorkspaceProposalHistoryStatusChange) super.set(fieldName, value);
  }

  @Override
  public WorkspaceProposalHistoryStatusChange clone() {
    return (WorkspaceProposalHistoryStatusChange) super.clone();
  }

}
