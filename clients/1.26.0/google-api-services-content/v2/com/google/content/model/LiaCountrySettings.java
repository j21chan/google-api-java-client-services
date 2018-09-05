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
 * Model definition for LiaCountrySettings.
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
public final class LiaCountrySettings extends com.google.api.client.json.GenericJson {

  /**
   * The settings for the About page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiaAboutPageSettings about;

  /**
   * CLDR country code (e.g. "US").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The status of the "Merchant hosted local storefront" feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hostedLocalStorefrontActive;

  /**
   * LIA inventory verification settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiaInventorySettings inventory;

  /**
   * LIA "On Display To Order" settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiaOnDisplayToOrderSettings onDisplayToOrder;

  /**
   * The POS data provider linked with this country.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LiaPosDataProvider posDataProvider;

  /**
   * The status of the "Store pickup" feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean storePickupActive;

  /**
   * The settings for the About page.
   * @return value or {@code null} for none
   */
  public LiaAboutPageSettings getAbout() {
    return about;
  }

  /**
   * The settings for the About page.
   * @param about about or {@code null} for none
   */
  public LiaCountrySettings setAbout(LiaAboutPageSettings about) {
    this.about = about;
    return this;
  }

  /**
   * CLDR country code (e.g. "US").
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * CLDR country code (e.g. "US").
   * @param country country or {@code null} for none
   */
  public LiaCountrySettings setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * The status of the "Merchant hosted local storefront" feature.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHostedLocalStorefrontActive() {
    return hostedLocalStorefrontActive;
  }

  /**
   * The status of the "Merchant hosted local storefront" feature.
   * @param hostedLocalStorefrontActive hostedLocalStorefrontActive or {@code null} for none
   */
  public LiaCountrySettings setHostedLocalStorefrontActive(java.lang.Boolean hostedLocalStorefrontActive) {
    this.hostedLocalStorefrontActive = hostedLocalStorefrontActive;
    return this;
  }

  /**
   * LIA inventory verification settings.
   * @return value or {@code null} for none
   */
  public LiaInventorySettings getInventory() {
    return inventory;
  }

  /**
   * LIA inventory verification settings.
   * @param inventory inventory or {@code null} for none
   */
  public LiaCountrySettings setInventory(LiaInventorySettings inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * LIA "On Display To Order" settings.
   * @return value or {@code null} for none
   */
  public LiaOnDisplayToOrderSettings getOnDisplayToOrder() {
    return onDisplayToOrder;
  }

  /**
   * LIA "On Display To Order" settings.
   * @param onDisplayToOrder onDisplayToOrder or {@code null} for none
   */
  public LiaCountrySettings setOnDisplayToOrder(LiaOnDisplayToOrderSettings onDisplayToOrder) {
    this.onDisplayToOrder = onDisplayToOrder;
    return this;
  }

  /**
   * The POS data provider linked with this country.
   * @return value or {@code null} for none
   */
  public LiaPosDataProvider getPosDataProvider() {
    return posDataProvider;
  }

  /**
   * The POS data provider linked with this country.
   * @param posDataProvider posDataProvider or {@code null} for none
   */
  public LiaCountrySettings setPosDataProvider(LiaPosDataProvider posDataProvider) {
    this.posDataProvider = posDataProvider;
    return this;
  }

  /**
   * The status of the "Store pickup" feature.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStorePickupActive() {
    return storePickupActive;
  }

  /**
   * The status of the "Store pickup" feature.
   * @param storePickupActive storePickupActive or {@code null} for none
   */
  public LiaCountrySettings setStorePickupActive(java.lang.Boolean storePickupActive) {
    this.storePickupActive = storePickupActive;
    return this;
  }

  @Override
  public LiaCountrySettings set(String fieldName, Object value) {
    return (LiaCountrySettings) super.set(fieldName, value);
  }

  @Override
  public LiaCountrySettings clone() {
    return (LiaCountrySettings) super.clone();
  }

}
