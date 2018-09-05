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

package com.google.webmasters.model;

/**
 * Model definition for ApiDimensionFilter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Console API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApiDimensionFilter extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dimension;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expression;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operator;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDimension() {
    return dimension;
  }

  /**
   * @param dimension dimension or {@code null} for none
   */
  public ApiDimensionFilter setDimension(java.lang.String dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExpression() {
    return expression;
  }

  /**
   * @param expression expression or {@code null} for none
   */
  public ApiDimensionFilter setExpression(java.lang.String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOperator() {
    return operator;
  }

  /**
   * @param operator operator or {@code null} for none
   */
  public ApiDimensionFilter setOperator(java.lang.String operator) {
    this.operator = operator;
    return this;
  }

  @Override
  public ApiDimensionFilter set(String fieldName, Object value) {
    return (ApiDimensionFilter) super.set(fieldName, value);
  }

  @Override
  public ApiDimensionFilter clone() {
    return (ApiDimensionFilter) super.clone();
  }

}
