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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * @OutputOnly The Geo criteria the restriction applies to.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LocationContext extends com.google.api.client.json.GenericJson {

  /**
   * IDs representing the geo location for this context. Please refer to the [geo-
   * table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv) file for
   * different geo criteria IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> geoCriteriaIds;

  /**
   * IDs representing the geo location for this context. Please refer to the [geo-
   * table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv) file for
   * different geo criteria IDs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getGeoCriteriaIds() {
    return geoCriteriaIds;
  }

  /**
   * IDs representing the geo location for this context. Please refer to the [geo-
   * table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv) file for
   * different geo criteria IDs.
   * @param geoCriteriaIds geoCriteriaIds or {@code null} for none
   */
  public LocationContext setGeoCriteriaIds(java.util.List<java.lang.Integer> geoCriteriaIds) {
    this.geoCriteriaIds = geoCriteriaIds;
    return this;
  }

  @Override
  public LocationContext set(String fieldName, Object value) {
    return (LocationContext) super.set(fieldName, value);
  }

  @Override
  public LocationContext clone() {
    return (LocationContext) super.clone();
  }

}
