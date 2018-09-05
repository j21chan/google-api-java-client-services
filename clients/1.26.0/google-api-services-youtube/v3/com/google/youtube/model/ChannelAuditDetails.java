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

package com.google.youtube.model;

/**
 * The auditDetails object encapsulates channel data that is relevant for YouTube Partners during
 * the audit process.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelAuditDetails extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not the channel respects the community guidelines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean communityGuidelinesGoodStanding;

  /**
   * Whether or not the channel has any unresolved claims.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean contentIdClaimsGoodStanding;

  /**
   * Whether or not the channel has any copyright strikes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean copyrightStrikesGoodStanding;

  /**
   * Describes the general state of the channel. This field will always show if there are any issues
   * whatsoever with the channel. Currently this field represents the result of the logical and
   * operation over the community guidelines good standing, the copyright strikes good standing and
   * the content ID claims good standing, but this may change in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean overallGoodStanding;

  /**
   * Whether or not the channel respects the community guidelines.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCommunityGuidelinesGoodStanding() {
    return communityGuidelinesGoodStanding;
  }

  /**
   * Whether or not the channel respects the community guidelines.
   * @param communityGuidelinesGoodStanding communityGuidelinesGoodStanding or {@code null} for none
   */
  public ChannelAuditDetails setCommunityGuidelinesGoodStanding(java.lang.Boolean communityGuidelinesGoodStanding) {
    this.communityGuidelinesGoodStanding = communityGuidelinesGoodStanding;
    return this;
  }

  /**
   * Whether or not the channel has any unresolved claims.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContentIdClaimsGoodStanding() {
    return contentIdClaimsGoodStanding;
  }

  /**
   * Whether or not the channel has any unresolved claims.
   * @param contentIdClaimsGoodStanding contentIdClaimsGoodStanding or {@code null} for none
   */
  public ChannelAuditDetails setContentIdClaimsGoodStanding(java.lang.Boolean contentIdClaimsGoodStanding) {
    this.contentIdClaimsGoodStanding = contentIdClaimsGoodStanding;
    return this;
  }

  /**
   * Whether or not the channel has any copyright strikes.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCopyrightStrikesGoodStanding() {
    return copyrightStrikesGoodStanding;
  }

  /**
   * Whether or not the channel has any copyright strikes.
   * @param copyrightStrikesGoodStanding copyrightStrikesGoodStanding or {@code null} for none
   */
  public ChannelAuditDetails setCopyrightStrikesGoodStanding(java.lang.Boolean copyrightStrikesGoodStanding) {
    this.copyrightStrikesGoodStanding = copyrightStrikesGoodStanding;
    return this;
  }

  /**
   * Describes the general state of the channel. This field will always show if there are any issues
   * whatsoever with the channel. Currently this field represents the result of the logical and
   * operation over the community guidelines good standing, the copyright strikes good standing and
   * the content ID claims good standing, but this may change in the future.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOverallGoodStanding() {
    return overallGoodStanding;
  }

  /**
   * Describes the general state of the channel. This field will always show if there are any issues
   * whatsoever with the channel. Currently this field represents the result of the logical and
   * operation over the community guidelines good standing, the copyright strikes good standing and
   * the content ID claims good standing, but this may change in the future.
   * @param overallGoodStanding overallGoodStanding or {@code null} for none
   */
  public ChannelAuditDetails setOverallGoodStanding(java.lang.Boolean overallGoodStanding) {
    this.overallGoodStanding = overallGoodStanding;
    return this;
  }

  @Override
  public ChannelAuditDetails set(String fieldName, Object value) {
    return (ChannelAuditDetails) super.set(fieldName, value);
  }

  @Override
  public ChannelAuditDetails clone() {
    return (ChannelAuditDetails) super.clone();
  }

}
