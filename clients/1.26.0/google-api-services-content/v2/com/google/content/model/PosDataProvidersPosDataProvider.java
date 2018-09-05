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

package com.google.content.model;

/**
 * Model definition for PosDataProvidersPosDataProvider.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PosDataProvidersPosDataProvider extends com.google.api.client.json.GenericJson {

  /**
   * The display name of Pos data Provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The full name of this POS data Provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullName;

  /**
   * The ID of the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger providerId;

  /**
   * The display name of Pos data Provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of Pos data Provider.
   * @param displayName displayName or {@code null} for none
   */
  public PosDataProvidersPosDataProvider setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The full name of this POS data Provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullName() {
    return fullName;
  }

  /**
   * The full name of this POS data Provider.
   * @param fullName fullName or {@code null} for none
   */
  public PosDataProvidersPosDataProvider setFullName(java.lang.String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The ID of the account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getProviderId() {
    return providerId;
  }

  /**
   * The ID of the account.
   * @param providerId providerId or {@code null} for none
   */
  public PosDataProvidersPosDataProvider setProviderId(java.math.BigInteger providerId) {
    this.providerId = providerId;
    return this;
  }

  @Override
  public PosDataProvidersPosDataProvider set(String fieldName, Object value) {
    return (PosDataProvidersPosDataProvider) super.set(fieldName, value);
  }

  @Override
  public PosDataProvidersPosDataProvider clone() {
    return (PosDataProvidersPosDataProvider) super.clone();
  }

}
