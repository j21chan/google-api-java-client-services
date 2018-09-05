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

package com.google.proximitybeacon.v1beta1.model;

/**
 * A subset of beacon information served via the `beaconinfo.getforobserved` method, which you call
 * when users of your app encounter your beacons.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Proximity Beacon API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BeaconInfo extends com.google.api.client.json.GenericJson {

  /**
   * The ID advertised by the beacon.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertisedId advertisedId;

  /**
   * Attachments matching the type(s) requested. May be empty if no attachment types were requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AttachmentInfo> attachments;

  /**
   * The name under which the beacon is registered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String beaconName;

  /**
   * The ID advertised by the beacon.
   * @return value or {@code null} for none
   */
  public AdvertisedId getAdvertisedId() {
    return advertisedId;
  }

  /**
   * The ID advertised by the beacon.
   * @param advertisedId advertisedId or {@code null} for none
   */
  public BeaconInfo setAdvertisedId(AdvertisedId advertisedId) {
    this.advertisedId = advertisedId;
    return this;
  }

  /**
   * Attachments matching the type(s) requested. May be empty if no attachment types were requested.
   * @return value or {@code null} for none
   */
  public java.util.List<AttachmentInfo> getAttachments() {
    return attachments;
  }

  /**
   * Attachments matching the type(s) requested. May be empty if no attachment types were requested.
   * @param attachments attachments or {@code null} for none
   */
  public BeaconInfo setAttachments(java.util.List<AttachmentInfo> attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * The name under which the beacon is registered.
   * @return value or {@code null} for none
   */
  public java.lang.String getBeaconName() {
    return beaconName;
  }

  /**
   * The name under which the beacon is registered.
   * @param beaconName beaconName or {@code null} for none
   */
  public BeaconInfo setBeaconName(java.lang.String beaconName) {
    this.beaconName = beaconName;
    return this;
  }

  @Override
  public BeaconInfo set(String fieldName, Object value) {
    return (BeaconInfo) super.set(fieldName, value);
  }

  @Override
  public BeaconInfo clone() {
    return (BeaconInfo) super.clone();
  }

}
