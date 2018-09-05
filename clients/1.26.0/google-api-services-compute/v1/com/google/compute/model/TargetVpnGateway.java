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
 * Represents a Target VPN gateway resource. (== resource_for beta.targetVpnGateways ==) (==
 * resource_for v1.targetVpnGateways ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetVpnGateway extends com.google.api.client.json.GenericJson {

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
   * [Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created using
   * compute.forwardingRules.insert and associated to a VPN gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> forwardingRules;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

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
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   * gateway is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * [Output Only] URL of the region where the target VPN gateway resides. You must specify this
   * field as part of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The status of the VPN gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using
   * compute.vpntunnels.insert method and associated to a VPN gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tunnels;

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
  public TargetVpnGateway setCreationTimestamp(java.lang.String creationTimestamp) {
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
  public TargetVpnGateway setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created using
   * compute.forwardingRules.insert and associated to a VPN gateway.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getForwardingRules() {
    return forwardingRules;
  }

  /**
   * [Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created using
   * compute.forwardingRules.insert and associated to a VPN gateway.
   * @param forwardingRules forwardingRules or {@code null} for none
   */
  public TargetVpnGateway setForwardingRules(java.util.List<java.lang.String> forwardingRules) {
    this.forwardingRules = forwardingRules;
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
  public TargetVpnGateway setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.
   * @param kind kind or {@code null} for none
   */
  public TargetVpnGateway setKind(java.lang.String kind) {
    this.kind = kind;
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
  public TargetVpnGateway setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   * gateway is created.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   * gateway is created.
   * @param network network or {@code null} for none
   */
  public TargetVpnGateway setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * [Output Only] URL of the region where the target VPN gateway resides. You must specify this
   * field as part of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the target VPN gateway resides. You must specify this
   * field as part of the HTTP request URL. It is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public TargetVpnGateway setRegion(java.lang.String region) {
    this.region = region;
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
  public TargetVpnGateway setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The status of the VPN gateway.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the VPN gateway.
   * @param status status or {@code null} for none
   */
  public TargetVpnGateway setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using
   * compute.vpntunnels.insert method and associated to a VPN gateway.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTunnels() {
    return tunnels;
  }

  /**
   * [Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using
   * compute.vpntunnels.insert method and associated to a VPN gateway.
   * @param tunnels tunnels or {@code null} for none
   */
  public TargetVpnGateway setTunnels(java.util.List<java.lang.String> tunnels) {
    this.tunnels = tunnels;
    return this;
  }

  @Override
  public TargetVpnGateway set(String fieldName, Object value) {
    return (TargetVpnGateway) super.set(fieldName, value);
  }

  @Override
  public TargetVpnGateway clone() {
    return (TargetVpnGateway) super.clone();
  }

}
