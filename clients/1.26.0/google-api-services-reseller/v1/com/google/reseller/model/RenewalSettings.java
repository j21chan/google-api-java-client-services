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

package com.google.reseller.model;

/**
 * JSON template for a subscription renewal settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Enterprise Apps Reseller API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RenewalSettings extends com.google.api.client.json.GenericJson {

  /**
   * Identifies the resource as a subscription renewal setting. Value: subscriptions#renewalSettings
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Renewal settings for the annual commitment plan. For more detailed information, see renewal
   * options in the administrator help center. When renewing a subscription, the renewalType is a
   * required property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String renewalType;

  /**
   * Identifies the resource as a subscription renewal setting. Value: subscriptions#renewalSettings
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a subscription renewal setting. Value: subscriptions#renewalSettings
   * @param kind kind or {@code null} for none
   */
  public RenewalSettings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Renewal settings for the annual commitment plan. For more detailed information, see renewal
   * options in the administrator help center. When renewing a subscription, the renewalType is a
   * required property.
   * @return value or {@code null} for none
   */
  public java.lang.String getRenewalType() {
    return renewalType;
  }

  /**
   * Renewal settings for the annual commitment plan. For more detailed information, see renewal
   * options in the administrator help center. When renewing a subscription, the renewalType is a
   * required property.
   * @param renewalType renewalType or {@code null} for none
   */
  public RenewalSettings setRenewalType(java.lang.String renewalType) {
    this.renewalType = renewalType;
    return this;
  }

  @Override
  public RenewalSettings set(String fieldName, Object value) {
    return (RenewalSettings) super.set(fieldName, value);
  }

  @Override
  public RenewalSettings clone() {
    return (RenewalSettings) super.clone();
  }

}
