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

package com.google.compute.model;

/**
 * VPN tunnel resource. (== resource_for beta.vpnTunnels ==) (== resource_for v1.vpnTunnels ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VpnTunnel extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] Detailed status message for the VPN tunnel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detailedStatus;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * IKE protocol version to use when establishing the VPN tunnel with peer VPN gateway. Acceptable
   * IKE versions are 1 or 2. Default version is 2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ikeVersion;

  /**
   * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Local traffic selector to use when establishing the VPN tunnel with peer VPN gateway. The value
   * should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint.
   * Only IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> localTrafficSelector;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * IP address of the peer VPN gateway. Only IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerIp;

  /**
   * [Output Only] URL of the region where the VPN tunnel resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Remote traffic selectors to use when establishing the VPN tunnel with peer VPN gateway. The
   * value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be
   * disjoint. Only IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> remoteTrafficSelector;

  /**
   * URL of router resource to be used for dynamic routing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String router;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN
   * gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sharedSecret;

  /**
   * Hash of the shared secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sharedSecretHash;

  /**
   * [Output Only] The status of the VPN tunnel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client
   * when the VPN tunnel is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetVpnGateway;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public VpnTunnel setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public VpnTunnel setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] Detailed status message for the VPN tunnel.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailedStatus() {
    return detailedStatus;
  }

  /**
   * [Output Only] Detailed status message for the VPN tunnel.
   * @param detailedStatus detailedStatus or {@code null} for none
   */
  public VpnTunnel setDetailedStatus(java.lang.String detailedStatus) {
    this.detailedStatus = detailedStatus;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public VpnTunnel setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * IKE protocol version to use when establishing the VPN tunnel with peer VPN gateway. Acceptable
   * IKE versions are 1 or 2. Default version is 2.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIkeVersion() {
    return ikeVersion;
  }

  /**
   * IKE protocol version to use when establishing the VPN tunnel with peer VPN gateway. Acceptable
   * IKE versions are 1 or 2. Default version is 2.
   * @param ikeVersion ikeVersion or {@code null} for none
   */
  public VpnTunnel setIkeVersion(java.lang.Integer ikeVersion) {
    this.ikeVersion = ikeVersion;
    return this;
  }

  /**
   * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.
   * @param kind kind or {@code null} for none
   */
  public VpnTunnel setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Local traffic selector to use when establishing the VPN tunnel with peer VPN gateway. The value
   * should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint.
   * Only IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLocalTrafficSelector() {
    return localTrafficSelector;
  }

  /**
   * Local traffic selector to use when establishing the VPN tunnel with peer VPN gateway. The value
   * should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint.
   * Only IPv4 is supported.
   * @param localTrafficSelector localTrafficSelector or {@code null} for none
   */
  public VpnTunnel setLocalTrafficSelector(java.util.List<java.lang.String> localTrafficSelector) {
    this.localTrafficSelector = localTrafficSelector;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public VpnTunnel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * IP address of the peer VPN gateway. Only IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerIp() {
    return peerIp;
  }

  /**
   * IP address of the peer VPN gateway. Only IPv4 is supported.
   * @param peerIp peerIp or {@code null} for none
   */
  public VpnTunnel setPeerIp(java.lang.String peerIp) {
    this.peerIp = peerIp;
    return this;
  }

  /**
   * [Output Only] URL of the region where the VPN tunnel resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the VPN tunnel resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public VpnTunnel setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Remote traffic selectors to use when establishing the VPN tunnel with peer VPN gateway. The
   * value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be
   * disjoint. Only IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRemoteTrafficSelector() {
    return remoteTrafficSelector;
  }

  /**
   * Remote traffic selectors to use when establishing the VPN tunnel with peer VPN gateway. The
   * value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be
   * disjoint. Only IPv4 is supported.
   * @param remoteTrafficSelector remoteTrafficSelector or {@code null} for none
   */
  public VpnTunnel setRemoteTrafficSelector(java.util.List<java.lang.String> remoteTrafficSelector) {
    this.remoteTrafficSelector = remoteTrafficSelector;
    return this;
  }

  /**
   * URL of router resource to be used for dynamic routing.
   * @return value or {@code null} for none
   */
  public java.lang.String getRouter() {
    return router;
  }

  /**
   * URL of router resource to be used for dynamic routing.
   * @param router router or {@code null} for none
   */
  public VpnTunnel setRouter(java.lang.String router) {
    this.router = router;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public VpnTunnel setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN
   * gateway.
   * @return value or {@code null} for none
   */
  public java.lang.String getSharedSecret() {
    return sharedSecret;
  }

  /**
   * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN
   * gateway.
   * @param sharedSecret sharedSecret or {@code null} for none
   */
  public VpnTunnel setSharedSecret(java.lang.String sharedSecret) {
    this.sharedSecret = sharedSecret;
    return this;
  }

  /**
   * Hash of the shared secret.
   * @return value or {@code null} for none
   */
  public java.lang.String getSharedSecretHash() {
    return sharedSecretHash;
  }

  /**
   * Hash of the shared secret.
   * @param sharedSecretHash sharedSecretHash or {@code null} for none
   */
  public VpnTunnel setSharedSecretHash(java.lang.String sharedSecretHash) {
    this.sharedSecretHash = sharedSecretHash;
    return this;
  }

  /**
   * [Output Only] The status of the VPN tunnel.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the VPN tunnel.
   * @param status status or {@code null} for none
   */
  public VpnTunnel setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client
   * when the VPN tunnel is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetVpnGateway() {
    return targetVpnGateway;
  }

  /**
   * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client
   * when the VPN tunnel is created.
   * @param targetVpnGateway targetVpnGateway or {@code null} for none
   */
  public VpnTunnel setTargetVpnGateway(java.lang.String targetVpnGateway) {
    this.targetVpnGateway = targetVpnGateway;
    return this;
  }

  @Override
  public VpnTunnel set(String fieldName, Object value) {
    return (VpnTunnel) super.set(fieldName, value);
  }

  @Override
  public VpnTunnel clone() {
    return (VpnTunnel) super.clone();
  }

}
