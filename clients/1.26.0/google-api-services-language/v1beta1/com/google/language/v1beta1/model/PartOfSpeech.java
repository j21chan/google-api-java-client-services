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

package com.google.language.v1beta1.model;

/**
 * Represents part of speech information for a token.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartOfSpeech extends com.google.api.client.json.GenericJson {

  /**
   * The grammatical aspect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aspect;

  /**
   * The grammatical case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("case")
  private java.lang.String case__;

  /**
   * The grammatical form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String form;

  /**
   * The grammatical gender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gender;

  /**
   * The grammatical mood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mood;

  /**
   * The grammatical number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String number;

  /**
   * The grammatical person.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String person;

  /**
   * The grammatical properness.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proper;

  /**
   * The grammatical reciprocity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reciprocity;

  /**
   * The part of speech tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * The grammatical tense.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tense;

  /**
   * The grammatical voice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String voice;

  /**
   * The grammatical aspect.
   * @return value or {@code null} for none
   */
  public java.lang.String getAspect() {
    return aspect;
  }

  /**
   * The grammatical aspect.
   * @param aspect aspect or {@code null} for none
   */
  public PartOfSpeech setAspect(java.lang.String aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * The grammatical case.
   * @return value or {@code null} for none
   */
  public java.lang.String getCase() {
    return case__;
  }

  /**
   * The grammatical case.
   * @param case__ case__ or {@code null} for none
   */
  public PartOfSpeech setCase(java.lang.String case__) {
    this.case__ = case__;
    return this;
  }

  /**
   * The grammatical form.
   * @return value or {@code null} for none
   */
  public java.lang.String getForm() {
    return form;
  }

  /**
   * The grammatical form.
   * @param form form or {@code null} for none
   */
  public PartOfSpeech setForm(java.lang.String form) {
    this.form = form;
    return this;
  }

  /**
   * The grammatical gender.
   * @return value or {@code null} for none
   */
  public java.lang.String getGender() {
    return gender;
  }

  /**
   * The grammatical gender.
   * @param gender gender or {@code null} for none
   */
  public PartOfSpeech setGender(java.lang.String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The grammatical mood.
   * @return value or {@code null} for none
   */
  public java.lang.String getMood() {
    return mood;
  }

  /**
   * The grammatical mood.
   * @param mood mood or {@code null} for none
   */
  public PartOfSpeech setMood(java.lang.String mood) {
    this.mood = mood;
    return this;
  }

  /**
   * The grammatical number.
   * @return value or {@code null} for none
   */
  public java.lang.String getNumber() {
    return number;
  }

  /**
   * The grammatical number.
   * @param number number or {@code null} for none
   */
  public PartOfSpeech setNumber(java.lang.String number) {
    this.number = number;
    return this;
  }

  /**
   * The grammatical person.
   * @return value or {@code null} for none
   */
  public java.lang.String getPerson() {
    return person;
  }

  /**
   * The grammatical person.
   * @param person person or {@code null} for none
   */
  public PartOfSpeech setPerson(java.lang.String person) {
    this.person = person;
    return this;
  }

  /**
   * The grammatical properness.
   * @return value or {@code null} for none
   */
  public java.lang.String getProper() {
    return proper;
  }

  /**
   * The grammatical properness.
   * @param proper proper or {@code null} for none
   */
  public PartOfSpeech setProper(java.lang.String proper) {
    this.proper = proper;
    return this;
  }

  /**
   * The grammatical reciprocity.
   * @return value or {@code null} for none
   */
  public java.lang.String getReciprocity() {
    return reciprocity;
  }

  /**
   * The grammatical reciprocity.
   * @param reciprocity reciprocity or {@code null} for none
   */
  public PartOfSpeech setReciprocity(java.lang.String reciprocity) {
    this.reciprocity = reciprocity;
    return this;
  }

  /**
   * The part of speech tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * The part of speech tag.
   * @param tag tag or {@code null} for none
   */
  public PartOfSpeech setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The grammatical tense.
   * @return value or {@code null} for none
   */
  public java.lang.String getTense() {
    return tense;
  }

  /**
   * The grammatical tense.
   * @param tense tense or {@code null} for none
   */
  public PartOfSpeech setTense(java.lang.String tense) {
    this.tense = tense;
    return this;
  }

  /**
   * The grammatical voice.
   * @return value or {@code null} for none
   */
  public java.lang.String getVoice() {
    return voice;
  }

  /**
   * The grammatical voice.
   * @param voice voice or {@code null} for none
   */
  public PartOfSpeech setVoice(java.lang.String voice) {
    this.voice = voice;
    return this;
  }

  @Override
  public PartOfSpeech set(String fieldName, Object value) {
    return (PartOfSpeech) super.set(fieldName, value);
  }

  @Override
  public PartOfSpeech clone() {
    return (PartOfSpeech) super.clone();
  }

}
