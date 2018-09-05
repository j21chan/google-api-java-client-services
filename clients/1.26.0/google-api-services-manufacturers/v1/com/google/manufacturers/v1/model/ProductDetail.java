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

package com.google.manufacturers.v1.model;

/**
 * A product detail of the product. For more information, see
 * https://support.google.com/manufacturers/answer/6124116#productdetail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Manufacturer Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductDetail extends com.google.api.client.json.GenericJson {

  /**
   * The name of the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributeName;

  /**
   * The value of the attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributeValue;

  /**
   * A short section name that can be reused between multiple product details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sectionName;

  /**
   * The name of the attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributeName() {
    return attributeName;
  }

  /**
   * The name of the attribute.
   * @param attributeName attributeName or {@code null} for none
   */
  public ProductDetail setAttributeName(java.lang.String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * The value of the attribute.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributeValue() {
    return attributeValue;
  }

  /**
   * The value of the attribute.
   * @param attributeValue attributeValue or {@code null} for none
   */
  public ProductDetail setAttributeValue(java.lang.String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * A short section name that can be reused between multiple product details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSectionName() {
    return sectionName;
  }

  /**
   * A short section name that can be reused between multiple product details.
   * @param sectionName sectionName or {@code null} for none
   */
  public ProductDetail setSectionName(java.lang.String sectionName) {
    this.sectionName = sectionName;
    return this;
  }

  @Override
  public ProductDetail set(String fieldName, Object value) {
    return (ProductDetail) super.set(fieldName, value);
  }

  @Override
  public ProductDetail clone() {
    return (ProductDetail) super.clone();
  }

}
