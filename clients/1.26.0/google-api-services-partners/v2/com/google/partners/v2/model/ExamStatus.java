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

package com.google.partners.v2.model;

/**
 * A user's information on a specific exam.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExamStatus extends com.google.api.client.json.GenericJson {

  /**
   * The type of the exam.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String examType;

  /**
   * Date this exam is due to expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expiration;

  /**
   * The date the user last passed this exam.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastPassed;

  /**
   * Whether this exam has been passed and not expired.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean passed;

  /**
   * The date the user last taken this exam.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String taken;

  /**
   * Whether this exam is in the state of warning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean warning;

  /**
   * The type of the exam.
   * @return value or {@code null} for none
   */
  public java.lang.String getExamType() {
    return examType;
  }

  /**
   * The type of the exam.
   * @param examType examType or {@code null} for none
   */
  public ExamStatus setExamType(java.lang.String examType) {
    this.examType = examType;
    return this;
  }

  /**
   * Date this exam is due to expire.
   * @return value or {@code null} for none
   */
  public String getExpiration() {
    return expiration;
  }

  /**
   * Date this exam is due to expire.
   * @param expiration expiration or {@code null} for none
   */
  public ExamStatus setExpiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * The date the user last passed this exam.
   * @return value or {@code null} for none
   */
  public String getLastPassed() {
    return lastPassed;
  }

  /**
   * The date the user last passed this exam.
   * @param lastPassed lastPassed or {@code null} for none
   */
  public ExamStatus setLastPassed(String lastPassed) {
    this.lastPassed = lastPassed;
    return this;
  }

  /**
   * Whether this exam has been passed and not expired.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPassed() {
    return passed;
  }

  /**
   * Whether this exam has been passed and not expired.
   * @param passed passed or {@code null} for none
   */
  public ExamStatus setPassed(java.lang.Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * The date the user last taken this exam.
   * @return value or {@code null} for none
   */
  public String getTaken() {
    return taken;
  }

  /**
   * The date the user last taken this exam.
   * @param taken taken or {@code null} for none
   */
  public ExamStatus setTaken(String taken) {
    this.taken = taken;
    return this;
  }

  /**
   * Whether this exam is in the state of warning.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWarning() {
    return warning;
  }

  /**
   * Whether this exam is in the state of warning.
   * @param warning warning or {@code null} for none
   */
  public ExamStatus setWarning(java.lang.Boolean warning) {
    this.warning = warning;
    return this;
  }

  @Override
  public ExamStatus set(String fieldName, Object value) {
    return (ExamStatus) super.set(fieldName, value);
  }

  @Override
  public ExamStatus clone() {
    return (ExamStatus) super.clone();
  }

}
