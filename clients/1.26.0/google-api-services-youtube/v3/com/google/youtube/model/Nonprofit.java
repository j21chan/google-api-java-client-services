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

package com.google.youtube.model;

/**
 * Nonprofit information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Nonprofit extends com.google.api.client.json.GenericJson {

  /**
   * Id of the nonprofit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NonprofitId nonprofitId;

  /**
   * Legal name of the nonprofit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nonprofitLegalName;

  /**
   * Id of the nonprofit.
   * @return value or {@code null} for none
   */
  public NonprofitId getNonprofitId() {
    return nonprofitId;
  }

  /**
   * Id of the nonprofit.
   * @param nonprofitId nonprofitId or {@code null} for none
   */
  public Nonprofit setNonprofitId(NonprofitId nonprofitId) {
    this.nonprofitId = nonprofitId;
    return this;
  }

  /**
   * Legal name of the nonprofit.
   * @return value or {@code null} for none
   */
  public java.lang.String getNonprofitLegalName() {
    return nonprofitLegalName;
  }

  /**
   * Legal name of the nonprofit.
   * @param nonprofitLegalName nonprofitLegalName or {@code null} for none
   */
  public Nonprofit setNonprofitLegalName(java.lang.String nonprofitLegalName) {
    this.nonprofitLegalName = nonprofitLegalName;
    return this;
  }

  @Override
  public Nonprofit set(String fieldName, Object value) {
    return (Nonprofit) super.set(fieldName, value);
  }

  @Override
  public Nonprofit clone() {
    return (Nonprofit) super.clone();
  }

}
