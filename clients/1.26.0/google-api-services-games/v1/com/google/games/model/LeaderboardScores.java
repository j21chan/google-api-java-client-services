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
 * This is a JSON template for a ListScores response.
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
public final class LeaderboardScores extends com.google.api.client.json.GenericJson {

  /**
   * The scores in the leaderboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LeaderboardEntry> items;

  static {
    // hack to force ProGuard to consider LeaderboardEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LeaderboardEntry.class);
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#leaderboardScores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The pagination token for the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The total number of scores in the leaderboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numScores;

  /**
   * The score of the requesting player on the leaderboard. The player's score may appear both here
   * and in the list of scores above. If you are viewing a public leaderboard and the player is not
   * sharing their gameplay information publicly, the scoreRank and formattedScoreRank values will
   * not be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LeaderboardEntry playerScore;

  /**
   * The pagination token for the previous page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prevPageToken;

  /**
   * The scores in the leaderboard.
   * @return value or {@code null} for none
   */
  public java.util.List<LeaderboardEntry> getItems() {
    return items;
  }

  /**
   * The scores in the leaderboard.
   * @param items items or {@code null} for none
   */
  public LeaderboardScores setItems(java.util.List<LeaderboardEntry> items) {
    this.items = items;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#leaderboardScores.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#leaderboardScores.
   * @param kind kind or {@code null} for none
   */
  public LeaderboardScores setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The pagination token for the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The pagination token for the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public LeaderboardScores setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The total number of scores in the leaderboard.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumScores() {
    return numScores;
  }

  /**
   * The total number of scores in the leaderboard.
   * @param numScores numScores or {@code null} for none
   */
  public LeaderboardScores setNumScores(java.lang.Long numScores) {
    this.numScores = numScores;
    return this;
  }

  /**
   * The score of the requesting player on the leaderboard. The player's score may appear both here
   * and in the list of scores above. If you are viewing a public leaderboard and the player is not
   * sharing their gameplay information publicly, the scoreRank and formattedScoreRank values will
   * not be present.
   * @return value or {@code null} for none
   */
  public LeaderboardEntry getPlayerScore() {
    return playerScore;
  }

  /**
   * The score of the requesting player on the leaderboard. The player's score may appear both here
   * and in the list of scores above. If you are viewing a public leaderboard and the player is not
   * sharing their gameplay information publicly, the scoreRank and formattedScoreRank values will
   * not be present.
   * @param playerScore playerScore or {@code null} for none
   */
  public LeaderboardScores setPlayerScore(LeaderboardEntry playerScore) {
    this.playerScore = playerScore;
    return this;
  }

  /**
   * The pagination token for the previous page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrevPageToken() {
    return prevPageToken;
  }

  /**
   * The pagination token for the previous page of results.
   * @param prevPageToken prevPageToken or {@code null} for none
   */
  public LeaderboardScores setPrevPageToken(java.lang.String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  @Override
  public LeaderboardScores set(String fieldName, Object value) {
    return (LeaderboardScores) super.set(fieldName, value);
  }

  @Override
  public LeaderboardScores clone() {
    return (LeaderboardScores) super.clone();
  }

}
