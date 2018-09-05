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

package com.google.gamesManagement.model;

/**
 * This is a JSON template for multiple achievements reset all request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services Management API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AchievementResetMultipleForAllRequest extends com.google.api.client.json.GenericJson {

  /**
   * The IDs of achievements to reset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("achievement_ids")
  private java.util.List<java.lang.String> achievementIds;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * gamesManagement#achievementResetMultipleForAllRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The IDs of achievements to reset.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAchievementIds() {
    return achievementIds;
  }

  /**
   * The IDs of achievements to reset.
   * @param achievementIds achievementIds or {@code null} for none
   */
  public AchievementResetMultipleForAllRequest setAchievementIds(java.util.List<java.lang.String> achievementIds) {
    this.achievementIds = achievementIds;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * gamesManagement#achievementResetMultipleForAllRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * gamesManagement#achievementResetMultipleForAllRequest.
   * @param kind kind or {@code null} for none
   */
  public AchievementResetMultipleForAllRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public AchievementResetMultipleForAllRequest set(String fieldName, Object value) {
    return (AchievementResetMultipleForAllRequest) super.set(fieldName, value);
  }

  @Override
  public AchievementResetMultipleForAllRequest clone() {
    return (AchievementResetMultipleForAllRequest) super.clone();
  }

}
