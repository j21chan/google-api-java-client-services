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

package com.google.androidpublisher.model;

/**
 * A SubscriptionDeferralInfo contains the data needed to defer a subscription purchase to a future
 * expiry time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubscriptionDeferralInfo extends com.google.api.client.json.GenericJson {

  /**
   * The desired next expiry time to assign to the subscription, in milliseconds since the Epoch.
   * The given time must be later/greater than the current expiry time for the subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long desiredExpiryTimeMillis;

  /**
   * The expected expiry time for the subscription. If the current expiry time for the subscription
   * is not the value specified here, the deferral will not occur.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expectedExpiryTimeMillis;

  /**
   * The desired next expiry time to assign to the subscription, in milliseconds since the Epoch.
   * The given time must be later/greater than the current expiry time for the subscription.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDesiredExpiryTimeMillis() {
    return desiredExpiryTimeMillis;
  }

  /**
   * The desired next expiry time to assign to the subscription, in milliseconds since the Epoch.
   * The given time must be later/greater than the current expiry time for the subscription.
   * @param desiredExpiryTimeMillis desiredExpiryTimeMillis or {@code null} for none
   */
  public SubscriptionDeferralInfo setDesiredExpiryTimeMillis(java.lang.Long desiredExpiryTimeMillis) {
    this.desiredExpiryTimeMillis = desiredExpiryTimeMillis;
    return this;
  }

  /**
   * The expected expiry time for the subscription. If the current expiry time for the subscription
   * is not the value specified here, the deferral will not occur.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpectedExpiryTimeMillis() {
    return expectedExpiryTimeMillis;
  }

  /**
   * The expected expiry time for the subscription. If the current expiry time for the subscription
   * is not the value specified here, the deferral will not occur.
   * @param expectedExpiryTimeMillis expectedExpiryTimeMillis or {@code null} for none
   */
  public SubscriptionDeferralInfo setExpectedExpiryTimeMillis(java.lang.Long expectedExpiryTimeMillis) {
    this.expectedExpiryTimeMillis = expectedExpiryTimeMillis;
    return this;
  }

  @Override
  public SubscriptionDeferralInfo set(String fieldName, Object value) {
    return (SubscriptionDeferralInfo) super.set(fieldName, value);
  }

  @Override
  public SubscriptionDeferralInfo clone() {
    return (SubscriptionDeferralInfo) super.clone();
  }

}
