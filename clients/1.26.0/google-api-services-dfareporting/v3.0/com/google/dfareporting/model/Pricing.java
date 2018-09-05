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

package com.google.dfareporting.model;

/**
 * Pricing Information
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Pricing extends com.google.api.client.json.GenericJson {

  /**
   * Cap cost type of this inventory item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String capCostType;

  /**
   * End date of this inventory item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * Flights of this inventory item. A flight (a.k.a. pricing period) represents the inventory item
   * pricing information for a specific period of time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Flight> flights;

  static {
    // hack to force ProGuard to consider Flight used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Flight.class);
  }

  /**
   * Group type of this inventory item if it represents a placement group. Is null otherwise. There
   * are two type of placement groups: PLANNING_PLACEMENT_GROUP_TYPE_PACKAGE is a simple group of
   * inventory items that acts as a single pricing point for a group of tags.
   * PLANNING_PLACEMENT_GROUP_TYPE_ROADBLOCK is a group of inventory items that not only acts as a
   * single pricing point, but also assumes that all the tags in it will be served at the same time.
   * A roadblock requires one of its assigned inventory items to be marked as primary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupType;

  /**
   * Pricing type of this inventory item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pricingType;

  /**
   * Start date of this inventory item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * Cap cost type of this inventory item.
   * @return value or {@code null} for none
   */
  public java.lang.String getCapCostType() {
    return capCostType;
  }

  /**
   * Cap cost type of this inventory item.
   * @param capCostType capCostType or {@code null} for none
   */
  public Pricing setCapCostType(java.lang.String capCostType) {
    this.capCostType = capCostType;
    return this;
  }

  /**
   * End date of this inventory item.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * End date of this inventory item.
   * @param endDate endDate or {@code null} for none
   */
  public Pricing setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Flights of this inventory item. A flight (a.k.a. pricing period) represents the inventory item
   * pricing information for a specific period of time.
   * @return value or {@code null} for none
   */
  public java.util.List<Flight> getFlights() {
    return flights;
  }

  /**
   * Flights of this inventory item. A flight (a.k.a. pricing period) represents the inventory item
   * pricing information for a specific period of time.
   * @param flights flights or {@code null} for none
   */
  public Pricing setFlights(java.util.List<Flight> flights) {
    this.flights = flights;
    return this;
  }

  /**
   * Group type of this inventory item if it represents a placement group. Is null otherwise. There
   * are two type of placement groups: PLANNING_PLACEMENT_GROUP_TYPE_PACKAGE is a simple group of
   * inventory items that acts as a single pricing point for a group of tags.
   * PLANNING_PLACEMENT_GROUP_TYPE_ROADBLOCK is a group of inventory items that not only acts as a
   * single pricing point, but also assumes that all the tags in it will be served at the same time.
   * A roadblock requires one of its assigned inventory items to be marked as primary.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupType() {
    return groupType;
  }

  /**
   * Group type of this inventory item if it represents a placement group. Is null otherwise. There
   * are two type of placement groups: PLANNING_PLACEMENT_GROUP_TYPE_PACKAGE is a simple group of
   * inventory items that acts as a single pricing point for a group of tags.
   * PLANNING_PLACEMENT_GROUP_TYPE_ROADBLOCK is a group of inventory items that not only acts as a
   * single pricing point, but also assumes that all the tags in it will be served at the same time.
   * A roadblock requires one of its assigned inventory items to be marked as primary.
   * @param groupType groupType or {@code null} for none
   */
  public Pricing setGroupType(java.lang.String groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Pricing type of this inventory item.
   * @return value or {@code null} for none
   */
  public java.lang.String getPricingType() {
    return pricingType;
  }

  /**
   * Pricing type of this inventory item.
   * @param pricingType pricingType or {@code null} for none
   */
  public Pricing setPricingType(java.lang.String pricingType) {
    this.pricingType = pricingType;
    return this;
  }

  /**
   * Start date of this inventory item.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * Start date of this inventory item.
   * @param startDate startDate or {@code null} for none
   */
  public Pricing setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public Pricing set(String fieldName, Object value) {
    return (Pricing) super.set(fieldName, value);
  }

  @Override
  public Pricing clone() {
    return (Pricing) super.clone();
  }

}
