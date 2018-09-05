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

package com.google.jobs.v2.model;

/**
 * Output only.
 *
 * Spell check result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpellingCorrection extends com.google.api.client.json.GenericJson {

  /**
   * Indicates if the query was corrected by the spell checker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean corrected;

  /**
   * Correction output consisting of the corrected keyword string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correctedText;

  /**
   * Indicates if the query was corrected by the spell checker.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCorrected() {
    return corrected;
  }

  /**
   * Indicates if the query was corrected by the spell checker.
   * @param corrected corrected or {@code null} for none
   */
  public SpellingCorrection setCorrected(java.lang.Boolean corrected) {
    this.corrected = corrected;
    return this;
  }

  /**
   * Correction output consisting of the corrected keyword string.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrectedText() {
    return correctedText;
  }

  /**
   * Correction output consisting of the corrected keyword string.
   * @param correctedText correctedText or {@code null} for none
   */
  public SpellingCorrection setCorrectedText(java.lang.String correctedText) {
    this.correctedText = correctedText;
    return this;
  }

  @Override
  public SpellingCorrection set(String fieldName, Object value) {
    return (SpellingCorrection) super.set(fieldName, value);
  }

  @Override
  public SpellingCorrection clone() {
    return (SpellingCorrection) super.clone();
  }

}
