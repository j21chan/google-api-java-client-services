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

package com.google.people.v1.model;

/**
 * A person's age range.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AgeRangeType extends com.google.api.client.json.GenericJson {

  /**
   * The age range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ageRange;

  /**
   * Metadata about the age range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The age range.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgeRange() {
    return ageRange;
  }

  /**
   * The age range.
   * @param ageRange ageRange or {@code null} for none
   */
  public AgeRangeType setAgeRange(java.lang.String ageRange) {
    this.ageRange = ageRange;
    return this;
  }

  /**
   * Metadata about the age range.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the age range.
   * @param metadata metadata or {@code null} for none
   */
  public AgeRangeType setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public AgeRangeType set(String fieldName, Object value) {
    return (AgeRangeType) super.set(fieldName, value);
  }

  @Override
  public AgeRangeType clone() {
    return (AgeRangeType) super.clone();
  }

}
