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

package com.google.games.model;

/**
 * This is a JSON template for the Leaderboard Entry resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LeaderboardEntry extends com.google.api.client.json.GenericJson {

  /**
   * The localized string for the numerical value of this score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedScore;

  /**
   * The localized string for the rank of this score for this leaderboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedScoreRank;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#leaderboardEntry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The player who holds this score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Player player;

  /**
   * The rank of this score for this leaderboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scoreRank;

  /**
   * Additional information about the score. Values must contain no more than 64 URI-safe characters
   * as defined by section 2.3 of RFC 3986.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scoreTag;

  /**
   * The numerical value of this score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scoreValue;

  /**
   * The time span of this high score. Possible values are:   - "ALL_TIME" - The score is an all-
   * time high score.  - "WEEKLY" - The score is a weekly high score.  - "DAILY" - The score is a
   * daily high score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeSpan;

  /**
   * The timestamp at which this score was recorded, in milliseconds since the epoch in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long writeTimestampMillis;

  /**
   * The localized string for the numerical value of this score.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedScore() {
    return formattedScore;
  }

  /**
   * The localized string for the numerical value of this score.
   * @param formattedScore formattedScore or {@code null} for none
   */
  public LeaderboardEntry setFormattedScore(java.lang.String formattedScore) {
    this.formattedScore = formattedScore;
    return this;
  }

  /**
   * The localized string for the rank of this score for this leaderboard.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedScoreRank() {
    return formattedScoreRank;
  }

  /**
   * The localized string for the rank of this score for this leaderboard.
   * @param formattedScoreRank formattedScoreRank or {@code null} for none
   */
  public LeaderboardEntry setFormattedScoreRank(java.lang.String formattedScoreRank) {
    this.formattedScoreRank = formattedScoreRank;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#leaderboardEntry.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#leaderboardEntry.
   * @param kind kind or {@code null} for none
   */
  public LeaderboardEntry setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The player who holds this score.
   * @return value or {@code null} for none
   */
  public Player getPlayer() {
    return player;
  }

  /**
   * The player who holds this score.
   * @param player player or {@code null} for none
   */
  public LeaderboardEntry setPlayer(Player player) {
    this.player = player;
    return this;
  }

  /**
   * The rank of this score for this leaderboard.
   * @return value or {@code null} for none
   */
  public java.lang.Long getScoreRank() {
    return scoreRank;
  }

  /**
   * The rank of this score for this leaderboard.
   * @param scoreRank scoreRank or {@code null} for none
   */
  public LeaderboardEntry setScoreRank(java.lang.Long scoreRank) {
    this.scoreRank = scoreRank;
    return this;
  }

  /**
   * Additional information about the score. Values must contain no more than 64 URI-safe characters
   * as defined by section 2.3 of RFC 3986.
   * @return value or {@code null} for none
   */
  public java.lang.String getScoreTag() {
    return scoreTag;
  }

  /**
   * Additional information about the score. Values must contain no more than 64 URI-safe characters
   * as defined by section 2.3 of RFC 3986.
   * @param scoreTag scoreTag or {@code null} for none
   */
  public LeaderboardEntry setScoreTag(java.lang.String scoreTag) {
    this.scoreTag = scoreTag;
    return this;
  }

  /**
   * The numerical value of this score.
   * @return value or {@code null} for none
   */
  public java.lang.Long getScoreValue() {
    return scoreValue;
  }

  /**
   * The numerical value of this score.
   * @param scoreValue scoreValue or {@code null} for none
   */
  public LeaderboardEntry setScoreValue(java.lang.Long scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

  /**
   * The time span of this high score. Possible values are:   - "ALL_TIME" - The score is an all-
   * time high score.  - "WEEKLY" - The score is a weekly high score.  - "DAILY" - The score is a
   * daily high score.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeSpan() {
    return timeSpan;
  }

  /**
   * The time span of this high score. Possible values are:   - "ALL_TIME" - The score is an all-
   * time high score.  - "WEEKLY" - The score is a weekly high score.  - "DAILY" - The score is a
   * daily high score.
   * @param timeSpan timeSpan or {@code null} for none
   */
  public LeaderboardEntry setTimeSpan(java.lang.String timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }

  /**
   * The timestamp at which this score was recorded, in milliseconds since the epoch in UTC.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWriteTimestampMillis() {
    return writeTimestampMillis;
  }

  /**
   * The timestamp at which this score was recorded, in milliseconds since the epoch in UTC.
   * @param writeTimestampMillis writeTimestampMillis or {@code null} for none
   */
  public LeaderboardEntry setWriteTimestampMillis(java.lang.Long writeTimestampMillis) {
    this.writeTimestampMillis = writeTimestampMillis;
    return this;
  }

  @Override
  public LeaderboardEntry set(String fieldName, Object value) {
    return (LeaderboardEntry) super.set(fieldName, value);
  }

  @Override
  public LeaderboardEntry clone() {
    return (LeaderboardEntry) super.clone();
  }

}
