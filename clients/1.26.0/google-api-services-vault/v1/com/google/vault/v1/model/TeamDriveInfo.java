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

package com.google.vault.v1.model;

/**
 * Team Drives to search
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TeamDriveInfo extends com.google.api.client.json.GenericJson {

  /**
   * List of Team Drive ids, as provided by Drive API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> teamDriveIds;

  /**
   * List of Team Drive ids, as provided by Drive API.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTeamDriveIds() {
    return teamDriveIds;
  }

  /**
   * List of Team Drive ids, as provided by Drive API.
   * @param teamDriveIds teamDriveIds or {@code null} for none
   */
  public TeamDriveInfo setTeamDriveIds(java.util.List<java.lang.String> teamDriveIds) {
    this.teamDriveIds = teamDriveIds;
    return this;
  }

  @Override
  public TeamDriveInfo set(String fieldName, Object value) {
    return (TeamDriveInfo) super.set(fieldName, value);
  }

  @Override
  public TeamDriveInfo clone() {
    return (TeamDriveInfo) super.clone();
  }

}
