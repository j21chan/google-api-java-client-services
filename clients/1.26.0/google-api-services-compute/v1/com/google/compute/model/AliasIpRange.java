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
 * An alias IP range attached to an instance's network interface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AliasIpRange extends com.google.api.client.json.GenericJson {

  /**
   * The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the
   * specified subnetwork and cannot contain IP addresses reserved by system or used by other
   * network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24)
   * or a CIDR format string (e.g. 10.1.2.0/24).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipCidrRange;

  /**
   * Optional subnetwork secondary range name specifying the secondary range from which to allocate
   * the IP CIDR range for this alias IP range. If left unspecified, the primary range of the
   * subnetwork will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetworkRangeName;

  /**
   * The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the
   * specified subnetwork and cannot contain IP addresses reserved by system or used by other
   * network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24)
   * or a CIDR format string (e.g. 10.1.2.0/24).
   * @return value or {@code null} for none
   */
  public java.lang.String getIpCidrRange() {
    return ipCidrRange;
  }

  /**
   * The IP CIDR range represented by this alias IP range. This IP CIDR range must belong to the
   * specified subnetwork and cannot contain IP addresses reserved by system or used by other
   * network interfaces. This range may be a single IP address (e.g. 10.2.3.4), a netmask (e.g. /24)
   * or a CIDR format string (e.g. 10.1.2.0/24).
   * @param ipCidrRange ipCidrRange or {@code null} for none
   */
  public AliasIpRange setIpCidrRange(java.lang.String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
    return this;
  }

  /**
   * Optional subnetwork secondary range name specifying the secondary range from which to allocate
   * the IP CIDR range for this alias IP range. If left unspecified, the primary range of the
   * subnetwork will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetworkRangeName() {
    return subnetworkRangeName;
  }

  /**
   * Optional subnetwork secondary range name specifying the secondary range from which to allocate
   * the IP CIDR range for this alias IP range. If left unspecified, the primary range of the
   * subnetwork will be used.
   * @param subnetworkRangeName subnetworkRangeName or {@code null} for none
   */
  public AliasIpRange setSubnetworkRangeName(java.lang.String subnetworkRangeName) {
    this.subnetworkRangeName = subnetworkRangeName;
    return this;
  }

  @Override
  public AliasIpRange set(String fieldName, Object value) {
    return (AliasIpRange) super.set(fieldName, value);
  }

  @Override
  public AliasIpRange clone() {
    return (AliasIpRange) super.clone();
  }

}
