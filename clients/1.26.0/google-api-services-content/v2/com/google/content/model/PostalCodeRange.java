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
 * Model definition for PostalCodeRange.
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
public final class PostalCodeRange extends com.google.api.client.json.GenericJson {

  /**
   * A postal code or a pattern of the form prefix* denoting the inclusive lower bound of the range
   * defining the area. Examples values: "94108", "9410*", "9*". Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCodeRangeBegin;

  /**
   * A postal code or a pattern of the form prefix* denoting the inclusive upper bound of the range
   * defining the area. It must have the same length as postalCodeRangeBegin: if
   * postalCodeRangeBegin is a postal code then postalCodeRangeEnd must be a postal code too; if
   * postalCodeRangeBegin is a pattern then postalCodeRangeEnd must be a pattern with the same
   * prefix length. Optional: if not set, then the area is defined as being all the postal codes
   * matching postalCodeRangeBegin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCodeRangeEnd;

  /**
   * A postal code or a pattern of the form prefix* denoting the inclusive lower bound of the range
   * defining the area. Examples values: "94108", "9410*", "9*". Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCodeRangeBegin() {
    return postalCodeRangeBegin;
  }

  /**
   * A postal code or a pattern of the form prefix* denoting the inclusive lower bound of the range
   * defining the area. Examples values: "94108", "9410*", "9*". Required.
   * @param postalCodeRangeBegin postalCodeRangeBegin or {@code null} for none
   */
  public PostalCodeRange setPostalCodeRangeBegin(java.lang.String postalCodeRangeBegin) {
    this.postalCodeRangeBegin = postalCodeRangeBegin;
    return this;
  }

  /**
   * A postal code or a pattern of the form prefix* denoting the inclusive upper bound of the range
   * defining the area. It must have the same length as postalCodeRangeBegin: if
   * postalCodeRangeBegin is a postal code then postalCodeRangeEnd must be a postal code too; if
   * postalCodeRangeBegin is a pattern then postalCodeRangeEnd must be a pattern with the same
   * prefix length. Optional: if not set, then the area is defined as being all the postal codes
   * matching postalCodeRangeBegin.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCodeRangeEnd() {
    return postalCodeRangeEnd;
  }

  /**
   * A postal code or a pattern of the form prefix* denoting the inclusive upper bound of the range
   * defining the area. It must have the same length as postalCodeRangeBegin: if
   * postalCodeRangeBegin is a postal code then postalCodeRangeEnd must be a postal code too; if
   * postalCodeRangeBegin is a pattern then postalCodeRangeEnd must be a pattern with the same
   * prefix length. Optional: if not set, then the area is defined as being all the postal codes
   * matching postalCodeRangeBegin.
   * @param postalCodeRangeEnd postalCodeRangeEnd or {@code null} for none
   */
  public PostalCodeRange setPostalCodeRangeEnd(java.lang.String postalCodeRangeEnd) {
    this.postalCodeRangeEnd = postalCodeRangeEnd;
    return this;
  }

  @Override
  public PostalCodeRange set(String fieldName, Object value) {
    return (PostalCodeRange) super.set(fieldName, value);
  }

  @Override
  public PostalCodeRange clone() {
    return (PostalCodeRange) super.clone();
  }

}
