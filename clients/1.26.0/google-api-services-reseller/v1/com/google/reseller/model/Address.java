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
 * JSON template for address of a customer.
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
public final class Address extends com.google.api.client.json.GenericJson {

  /**
   * A customer's physical address. An address can be composed of one to three lines. The
   * addressline2 and addressLine3 are optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressLine1;

  /**
   * Line 2 of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressLine2;

  /**
   * Line 3 of the address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressLine3;

  /**
   * The customer contact's name. This is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactName;

  /**
   * For countryCode information, see the ISO 3166 country code elements. Verify that country is
   * approved for resale of Google products. This property is required when creating a new customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * Identifies the resource as a customer address. Value: customers#address
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An example of a locality value is the city of San Francisco.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * The company or company division name. This is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organizationName;

  /**
   * A postalCode example is a postal zip code such as 94043. This property is required when
   * creating a new customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * An example of a region value is CA for the state of California.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * A customer's physical address. An address can be composed of one to three lines. The
   * addressline2 and addressLine3 are optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressLine1() {
    return addressLine1;
  }

  /**
   * A customer's physical address. An address can be composed of one to three lines. The
   * addressline2 and addressLine3 are optional.
   * @param addressLine1 addressLine1 or {@code null} for none
   */
  public Address setAddressLine1(java.lang.String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Line 2 of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressLine2() {
    return addressLine2;
  }

  /**
   * Line 2 of the address.
   * @param addressLine2 addressLine2 or {@code null} for none
   */
  public Address setAddressLine2(java.lang.String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Line 3 of the address.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressLine3() {
    return addressLine3;
  }

  /**
   * Line 3 of the address.
   * @param addressLine3 addressLine3 or {@code null} for none
   */
  public Address setAddressLine3(java.lang.String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  /**
   * The customer contact's name. This is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactName() {
    return contactName;
  }

  /**
   * The customer contact's name. This is required.
   * @param contactName contactName or {@code null} for none
   */
  public Address setContactName(java.lang.String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * For countryCode information, see the ISO 3166 country code elements. Verify that country is
   * approved for resale of Google products. This property is required when creating a new customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * For countryCode information, see the ISO 3166 country code elements. Verify that country is
   * approved for resale of Google products. This property is required when creating a new customer.
   * @param countryCode countryCode or {@code null} for none
   */
  public Address setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Identifies the resource as a customer address. Value: customers#address
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a customer address. Value: customers#address
   * @param kind kind or {@code null} for none
   */
  public Address setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * An example of a locality value is the city of San Francisco.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * An example of a locality value is the city of San Francisco.
   * @param locality locality or {@code null} for none
   */
  public Address setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * The company or company division name. This is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganizationName() {
    return organizationName;
  }

  /**
   * The company or company division name. This is required.
   * @param organizationName organizationName or {@code null} for none
   */
  public Address setOrganizationName(java.lang.String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * A postalCode example is a postal zip code such as 94043. This property is required when
   * creating a new customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * A postalCode example is a postal zip code such as 94043. This property is required when
   * creating a new customer.
   * @param postalCode postalCode or {@code null} for none
   */
  public Address setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * An example of a region value is CA for the state of California.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * An example of a region value is CA for the state of California.
   * @param region region or {@code null} for none
   */
  public Address setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  @Override
  public Address set(String fieldName, Object value) {
    return (Address) super.set(fieldName, value);
  }

  @Override
  public Address clone() {
    return (Address) super.clone();
  }

}
