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
 * Describes properties of a DoubleClick Planning order.
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
public final class Order extends com.google.api.client.json.GenericJson {

  /**
   * Account ID of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Advertiser ID of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * IDs for users that have to approve documents created for this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> approverUserProfileIds;

  /**
   * Buyer invoice ID associated with this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerInvoiceId;

  /**
   * Name of the buyer organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerOrganizationName;

  /**
   * Comments in this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comments;

  /**
   * Contacts for this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderContact> contacts;

  /**
   * ID of this order. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#order".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Information about the most recent modification of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LastModifiedInfo lastModifiedInfo;

  /**
   * Name of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Notes of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notes;

  /**
   * ID of the terms and conditions template used in this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long planningTermId;

  /**
   * Project ID of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectId;

  /**
   * Seller order ID associated with this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sellerOrderId;

  /**
   * Name of the seller organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sellerOrganizationName;

  /**
   * Site IDs this order is associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> siteId;

  /**
   * Free-form site names this order is associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> siteNames;

  /**
   * Subaccount ID of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subaccountId;

  /**
   * Terms and conditions of this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String termsAndConditions;

  /**
   * Account ID of this order.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Account ID of this order.
   * @param accountId accountId or {@code null} for none
   */
  public Order setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Advertiser ID of this order.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Advertiser ID of this order.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public Order setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * IDs for users that have to approve documents created for this order.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getApproverUserProfileIds() {
    return approverUserProfileIds;
  }

  /**
   * IDs for users that have to approve documents created for this order.
   * @param approverUserProfileIds approverUserProfileIds or {@code null} for none
   */
  public Order setApproverUserProfileIds(java.util.List<java.lang.Long> approverUserProfileIds) {
    this.approverUserProfileIds = approverUserProfileIds;
    return this;
  }

  /**
   * Buyer invoice ID associated with this order.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerInvoiceId() {
    return buyerInvoiceId;
  }

  /**
   * Buyer invoice ID associated with this order.
   * @param buyerInvoiceId buyerInvoiceId or {@code null} for none
   */
  public Order setBuyerInvoiceId(java.lang.String buyerInvoiceId) {
    this.buyerInvoiceId = buyerInvoiceId;
    return this;
  }

  /**
   * Name of the buyer organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerOrganizationName() {
    return buyerOrganizationName;
  }

  /**
   * Name of the buyer organization.
   * @param buyerOrganizationName buyerOrganizationName or {@code null} for none
   */
  public Order setBuyerOrganizationName(java.lang.String buyerOrganizationName) {
    this.buyerOrganizationName = buyerOrganizationName;
    return this;
  }

  /**
   * Comments in this order.
   * @return value or {@code null} for none
   */
  public java.lang.String getComments() {
    return comments;
  }

  /**
   * Comments in this order.
   * @param comments comments or {@code null} for none
   */
  public Order setComments(java.lang.String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Contacts for this order.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderContact> getContacts() {
    return contacts;
  }

  /**
   * Contacts for this order.
   * @param contacts contacts or {@code null} for none
   */
  public Order setContacts(java.util.List<OrderContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * ID of this order. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this order. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public Order setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#order".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#order".
   * @param kind kind or {@code null} for none
   */
  public Order setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Information about the most recent modification of this order.
   * @return value or {@code null} for none
   */
  public LastModifiedInfo getLastModifiedInfo() {
    return lastModifiedInfo;
  }

  /**
   * Information about the most recent modification of this order.
   * @param lastModifiedInfo lastModifiedInfo or {@code null} for none
   */
  public Order setLastModifiedInfo(LastModifiedInfo lastModifiedInfo) {
    this.lastModifiedInfo = lastModifiedInfo;
    return this;
  }

  /**
   * Name of this order.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this order.
   * @param name name or {@code null} for none
   */
  public Order setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Notes of this order.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotes() {
    return notes;
  }

  /**
   * Notes of this order.
   * @param notes notes or {@code null} for none
   */
  public Order setNotes(java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * ID of the terms and conditions template used in this order.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPlanningTermId() {
    return planningTermId;
  }

  /**
   * ID of the terms and conditions template used in this order.
   * @param planningTermId planningTermId or {@code null} for none
   */
  public Order setPlanningTermId(java.lang.Long planningTermId) {
    this.planningTermId = planningTermId;
    return this;
  }

  /**
   * Project ID of this order.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectId() {
    return projectId;
  }

  /**
   * Project ID of this order.
   * @param projectId projectId or {@code null} for none
   */
  public Order setProjectId(java.lang.Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Seller order ID associated with this order.
   * @return value or {@code null} for none
   */
  public java.lang.String getSellerOrderId() {
    return sellerOrderId;
  }

  /**
   * Seller order ID associated with this order.
   * @param sellerOrderId sellerOrderId or {@code null} for none
   */
  public Order setSellerOrderId(java.lang.String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
    return this;
  }

  /**
   * Name of the seller organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getSellerOrganizationName() {
    return sellerOrganizationName;
  }

  /**
   * Name of the seller organization.
   * @param sellerOrganizationName sellerOrganizationName or {@code null} for none
   */
  public Order setSellerOrganizationName(java.lang.String sellerOrganizationName) {
    this.sellerOrganizationName = sellerOrganizationName;
    return this;
  }

  /**
   * Site IDs this order is associated with.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getSiteId() {
    return siteId;
  }

  /**
   * Site IDs this order is associated with.
   * @param siteId siteId or {@code null} for none
   */
  public Order setSiteId(java.util.List<java.lang.Long> siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Free-form site names this order is associated with.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSiteNames() {
    return siteNames;
  }

  /**
   * Free-form site names this order is associated with.
   * @param siteNames siteNames or {@code null} for none
   */
  public Order setSiteNames(java.util.List<java.lang.String> siteNames) {
    this.siteNames = siteNames;
    return this;
  }

  /**
   * Subaccount ID of this order.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubaccountId() {
    return subaccountId;
  }

  /**
   * Subaccount ID of this order.
   * @param subaccountId subaccountId or {@code null} for none
   */
  public Order setSubaccountId(java.lang.Long subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

  /**
   * Terms and conditions of this order.
   * @return value or {@code null} for none
   */
  public java.lang.String getTermsAndConditions() {
    return termsAndConditions;
  }

  /**
   * Terms and conditions of this order.
   * @param termsAndConditions termsAndConditions or {@code null} for none
   */
  public Order setTermsAndConditions(java.lang.String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  @Override
  public Order set(String fieldName, Object value) {
    return (Order) super.set(fieldName, value);
  }

  @Override
  public Order clone() {
    return (Order) super.clone();
  }

}
