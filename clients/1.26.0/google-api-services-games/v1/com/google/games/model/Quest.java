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
 * This is a JSON template for a Quest resource.
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
public final class Quest extends com.google.api.client.json.GenericJson {

  /**
   * The timestamp at which the user accepted the quest in milliseconds since the epoch in UTC. Only
   * present if the player has accepted the quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long acceptedTimestampMillis;

  /**
   * The ID of the application this quest is part of.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationId;

  /**
   * The banner image URL for the quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bannerUrl;

  /**
   * The description of the quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The timestamp at which the quest ceases to be active in milliseconds since the epoch in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endTimestampMillis;

  /**
   * The icon image URL for the quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * The ID of the quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Indicates whether the banner image being returned is a default image, or is game-provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefaultBannerUrl;

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefaultIconUrl;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string games#quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The timestamp at which the quest was last updated by the user in milliseconds since the epoch
   * in UTC. Only present if the player has accepted the quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastUpdatedTimestampMillis;

  /**
   * The quest milestones.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QuestMilestone> milestones;

  /**
   * The name of the quest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The timestamp at which the user should be notified that the quest will end soon in milliseconds
   * since the epoch in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long notifyTimestampMillis;

  /**
   * The timestamp at which the quest becomes active in milliseconds since the epoch in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startTimestampMillis;

  /**
   * The state of the quest. Possible values are:   - "UPCOMING": The quest is upcoming. The user
   * can see the quest, but cannot accept it until it is open.  - "OPEN": The quest is currently
   * open and may be accepted at this time.  - "ACCEPTED": The user is currently participating in
   * this quest.  - "COMPLETED": The user has completed the quest.  - "FAILED": The quest was
   * attempted but was not completed before the deadline expired.  - "EXPIRED": The quest has
   * expired and was not accepted.  - "DELETED": The quest should be deleted from the local
   * database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The timestamp at which the user accepted the quest in milliseconds since the epoch in UTC. Only
   * present if the player has accepted the quest.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAcceptedTimestampMillis() {
    return acceptedTimestampMillis;
  }

  /**
   * The timestamp at which the user accepted the quest in milliseconds since the epoch in UTC. Only
   * present if the player has accepted the quest.
   * @param acceptedTimestampMillis acceptedTimestampMillis or {@code null} for none
   */
  public Quest setAcceptedTimestampMillis(java.lang.Long acceptedTimestampMillis) {
    this.acceptedTimestampMillis = acceptedTimestampMillis;
    return this;
  }

  /**
   * The ID of the application this quest is part of.
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationId() {
    return applicationId;
  }

  /**
   * The ID of the application this quest is part of.
   * @param applicationId applicationId or {@code null} for none
   */
  public Quest setApplicationId(java.lang.String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The banner image URL for the quest.
   * @return value or {@code null} for none
   */
  public java.lang.String getBannerUrl() {
    return bannerUrl;
  }

  /**
   * The banner image URL for the quest.
   * @param bannerUrl bannerUrl or {@code null} for none
   */
  public Quest setBannerUrl(java.lang.String bannerUrl) {
    this.bannerUrl = bannerUrl;
    return this;
  }

  /**
   * The description of the quest.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the quest.
   * @param description description or {@code null} for none
   */
  public Quest setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The timestamp at which the quest ceases to be active in milliseconds since the epoch in UTC.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndTimestampMillis() {
    return endTimestampMillis;
  }

  /**
   * The timestamp at which the quest ceases to be active in milliseconds since the epoch in UTC.
   * @param endTimestampMillis endTimestampMillis or {@code null} for none
   */
  public Quest setEndTimestampMillis(java.lang.Long endTimestampMillis) {
    this.endTimestampMillis = endTimestampMillis;
    return this;
  }

  /**
   * The icon image URL for the quest.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * The icon image URL for the quest.
   * @param iconUrl iconUrl or {@code null} for none
   */
  public Quest setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The ID of the quest.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the quest.
   * @param id id or {@code null} for none
   */
  public Quest setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Indicates whether the banner image being returned is a default image, or is game-provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefaultBannerUrl() {
    return isDefaultBannerUrl;
  }

  /**
   * Indicates whether the banner image being returned is a default image, or is game-provided.
   * @param isDefaultBannerUrl isDefaultBannerUrl or {@code null} for none
   */
  public Quest setIsDefaultBannerUrl(java.lang.Boolean isDefaultBannerUrl) {
    this.isDefaultBannerUrl = isDefaultBannerUrl;
    return this;
  }

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefaultIconUrl() {
    return isDefaultIconUrl;
  }

  /**
   * Indicates whether the icon image being returned is a default image, or is game-provided.
   * @param isDefaultIconUrl isDefaultIconUrl or {@code null} for none
   */
  public Quest setIsDefaultIconUrl(java.lang.Boolean isDefaultIconUrl) {
    this.isDefaultIconUrl = isDefaultIconUrl;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string games#quest.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string games#quest.
   * @param kind kind or {@code null} for none
   */
  public Quest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The timestamp at which the quest was last updated by the user in milliseconds since the epoch
   * in UTC. Only present if the player has accepted the quest.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastUpdatedTimestampMillis() {
    return lastUpdatedTimestampMillis;
  }

  /**
   * The timestamp at which the quest was last updated by the user in milliseconds since the epoch
   * in UTC. Only present if the player has accepted the quest.
   * @param lastUpdatedTimestampMillis lastUpdatedTimestampMillis or {@code null} for none
   */
  public Quest setLastUpdatedTimestampMillis(java.lang.Long lastUpdatedTimestampMillis) {
    this.lastUpdatedTimestampMillis = lastUpdatedTimestampMillis;
    return this;
  }

  /**
   * The quest milestones.
   * @return value or {@code null} for none
   */
  public java.util.List<QuestMilestone> getMilestones() {
    return milestones;
  }

  /**
   * The quest milestones.
   * @param milestones milestones or {@code null} for none
   */
  public Quest setMilestones(java.util.List<QuestMilestone> milestones) {
    this.milestones = milestones;
    return this;
  }

  /**
   * The name of the quest.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the quest.
   * @param name name or {@code null} for none
   */
  public Quest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The timestamp at which the user should be notified that the quest will end soon in milliseconds
   * since the epoch in UTC.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNotifyTimestampMillis() {
    return notifyTimestampMillis;
  }

  /**
   * The timestamp at which the user should be notified that the quest will end soon in milliseconds
   * since the epoch in UTC.
   * @param notifyTimestampMillis notifyTimestampMillis or {@code null} for none
   */
  public Quest setNotifyTimestampMillis(java.lang.Long notifyTimestampMillis) {
    this.notifyTimestampMillis = notifyTimestampMillis;
    return this;
  }

  /**
   * The timestamp at which the quest becomes active in milliseconds since the epoch in UTC.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartTimestampMillis() {
    return startTimestampMillis;
  }

  /**
   * The timestamp at which the quest becomes active in milliseconds since the epoch in UTC.
   * @param startTimestampMillis startTimestampMillis or {@code null} for none
   */
  public Quest setStartTimestampMillis(java.lang.Long startTimestampMillis) {
    this.startTimestampMillis = startTimestampMillis;
    return this;
  }

  /**
   * The state of the quest. Possible values are:   - "UPCOMING": The quest is upcoming. The user
   * can see the quest, but cannot accept it until it is open.  - "OPEN": The quest is currently
   * open and may be accepted at this time.  - "ACCEPTED": The user is currently participating in
   * this quest.  - "COMPLETED": The user has completed the quest.  - "FAILED": The quest was
   * attempted but was not completed before the deadline expired.  - "EXPIRED": The quest has
   * expired and was not accepted.  - "DELETED": The quest should be deleted from the local
   * database.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the quest. Possible values are:   - "UPCOMING": The quest is upcoming. The user
   * can see the quest, but cannot accept it until it is open.  - "OPEN": The quest is currently
   * open and may be accepted at this time.  - "ACCEPTED": The user is currently participating in
   * this quest.  - "COMPLETED": The user has completed the quest.  - "FAILED": The quest was
   * attempted but was not completed before the deadline expired.  - "EXPIRED": The quest has
   * expired and was not accepted.  - "DELETED": The quest should be deleted from the local
   * database.
   * @param state state or {@code null} for none
   */
  public Quest setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Quest set(String fieldName, Object value) {
    return (Quest) super.set(fieldName, value);
  }

  @Override
  public Quest clone() {
    return (Quest) super.clone();
  }

}
