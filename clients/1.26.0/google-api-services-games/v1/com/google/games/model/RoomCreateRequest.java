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
 * This is a JSON template for a room creation request.
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
public final class RoomCreateRequest extends com.google.api.client.json.GenericJson {

  /**
   * Criteria for auto-matching players into this room.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RoomAutoMatchingCriteria autoMatchingCriteria;

  /**
   * The capabilities that this client supports for realtime communication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> capabilities;

  /**
   * Client address for the player creating the room.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RoomClientAddress clientAddress;

  /**
   * The player IDs to invite to the room.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> invitedPlayerIds;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomCreateRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Network diagnostics for the client creating the room.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkDiagnostics networkDiagnostics;

  /**
   * A randomly generated numeric ID. This number is used at the server to ensure that the request
   * is handled correctly across retries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long requestId;

  /**
   * The variant / mode of the application to be played. This can be any integer value, or left
   * blank. You should use a small number of variants to keep the auto-matching pool as large as
   * possible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer variant;

  /**
   * Criteria for auto-matching players into this room.
   * @return value or {@code null} for none
   */
  public RoomAutoMatchingCriteria getAutoMatchingCriteria() {
    return autoMatchingCriteria;
  }

  /**
   * Criteria for auto-matching players into this room.
   * @param autoMatchingCriteria autoMatchingCriteria or {@code null} for none
   */
  public RoomCreateRequest setAutoMatchingCriteria(RoomAutoMatchingCriteria autoMatchingCriteria) {
    this.autoMatchingCriteria = autoMatchingCriteria;
    return this;
  }

  /**
   * The capabilities that this client supports for realtime communication.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCapabilities() {
    return capabilities;
  }

  /**
   * The capabilities that this client supports for realtime communication.
   * @param capabilities capabilities or {@code null} for none
   */
  public RoomCreateRequest setCapabilities(java.util.List<java.lang.String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Client address for the player creating the room.
   * @return value or {@code null} for none
   */
  public RoomClientAddress getClientAddress() {
    return clientAddress;
  }

  /**
   * Client address for the player creating the room.
   * @param clientAddress clientAddress or {@code null} for none
   */
  public RoomCreateRequest setClientAddress(RoomClientAddress clientAddress) {
    this.clientAddress = clientAddress;
    return this;
  }

  /**
   * The player IDs to invite to the room.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInvitedPlayerIds() {
    return invitedPlayerIds;
  }

  /**
   * The player IDs to invite to the room.
   * @param invitedPlayerIds invitedPlayerIds or {@code null} for none
   */
  public RoomCreateRequest setInvitedPlayerIds(java.util.List<java.lang.String> invitedPlayerIds) {
    this.invitedPlayerIds = invitedPlayerIds;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomCreateRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#roomCreateRequest.
   * @param kind kind or {@code null} for none
   */
  public RoomCreateRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Network diagnostics for the client creating the room.
   * @return value or {@code null} for none
   */
  public NetworkDiagnostics getNetworkDiagnostics() {
    return networkDiagnostics;
  }

  /**
   * Network diagnostics for the client creating the room.
   * @param networkDiagnostics networkDiagnostics or {@code null} for none
   */
  public RoomCreateRequest setNetworkDiagnostics(NetworkDiagnostics networkDiagnostics) {
    this.networkDiagnostics = networkDiagnostics;
    return this;
  }

  /**
   * A randomly generated numeric ID. This number is used at the server to ensure that the request
   * is handled correctly across retries.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRequestId() {
    return requestId;
  }

  /**
   * A randomly generated numeric ID. This number is used at the server to ensure that the request
   * is handled correctly across retries.
   * @param requestId requestId or {@code null} for none
   */
  public RoomCreateRequest setRequestId(java.lang.Long requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The variant / mode of the application to be played. This can be any integer value, or left
   * blank. You should use a small number of variants to keep the auto-matching pool as large as
   * possible.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVariant() {
    return variant;
  }

  /**
   * The variant / mode of the application to be played. This can be any integer value, or left
   * blank. You should use a small number of variants to keep the auto-matching pool as large as
   * possible.
   * @param variant variant or {@code null} for none
   */
  public RoomCreateRequest setVariant(java.lang.Integer variant) {
    this.variant = variant;
    return this;
  }

  @Override
  public RoomCreateRequest set(String fieldName, Object value) {
    return (RoomCreateRequest) super.set(fieldName, value);
  }

  @Override
  public RoomCreateRequest clone() {
    return (RoomCreateRequest) super.clone();
  }

}
