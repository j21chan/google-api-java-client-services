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

package com.google.dfareporting.model;

/**
 * Remarketing List Population Rule Term.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListPopulationTerm extends com.google.api.client.json.GenericJson {

  /**
   * Will be true if the term should check if the user is in the list and false if the term should
   * check if the user is not in the list. This field is only relevant when type is set to
   * LIST_MEMBERSHIP_TERM. False by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean contains;

  /**
   * Whether to negate the comparison result of this term during rule evaluation. This field is only
   * relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean negation;

  /**
   * Comparison operator of this term. This field is only relevant when type is left unset or set to
   * CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operator;

  /**
   * ID of the list in question. This field is only relevant when type is set to
   * LIST_MEMBERSHIP_TERM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long remarketingListId;

  /**
   * List population term type determines the applicable fields in this object. If left unset or set
   * to CUSTOM_VARIABLE_TERM, then variableName, variableFriendlyName, operator, value, and negation
   * are applicable. If set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are
   * applicable. If set to REFERRER_TERM then operator, value, and negation are applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Literal to compare the variable to. This field is only relevant when type is left unset or set
   * to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Friendly name of this term's variable. This is a read-only, auto-generated field. This field is
   * only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String variableFriendlyName;

  /**
   * Name of the variable (U1, U2, etc.) being compared in this term. This field is only relevant
   * when type is set to null, CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String variableName;

  /**
   * Will be true if the term should check if the user is in the list and false if the term should
   * check if the user is not in the list. This field is only relevant when type is set to
   * LIST_MEMBERSHIP_TERM. False by default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContains() {
    return contains;
  }

  /**
   * Will be true if the term should check if the user is in the list and false if the term should
   * check if the user is not in the list. This field is only relevant when type is set to
   * LIST_MEMBERSHIP_TERM. False by default.
   * @param contains contains or {@code null} for none
   */
  public ListPopulationTerm setContains(java.lang.Boolean contains) {
    this.contains = contains;
    return this;
  }

  /**
   * Whether to negate the comparison result of this term during rule evaluation. This field is only
   * relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNegation() {
    return negation;
  }

  /**
   * Whether to negate the comparison result of this term during rule evaluation. This field is only
   * relevant when type is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @param negation negation or {@code null} for none
   */
  public ListPopulationTerm setNegation(java.lang.Boolean negation) {
    this.negation = negation;
    return this;
  }

  /**
   * Comparison operator of this term. This field is only relevant when type is left unset or set to
   * CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperator() {
    return operator;
  }

  /**
   * Comparison operator of this term. This field is only relevant when type is left unset or set to
   * CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @param operator operator or {@code null} for none
   */
  public ListPopulationTerm setOperator(java.lang.String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * ID of the list in question. This field is only relevant when type is set to
   * LIST_MEMBERSHIP_TERM.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRemarketingListId() {
    return remarketingListId;
  }

  /**
   * ID of the list in question. This field is only relevant when type is set to
   * LIST_MEMBERSHIP_TERM.
   * @param remarketingListId remarketingListId or {@code null} for none
   */
  public ListPopulationTerm setRemarketingListId(java.lang.Long remarketingListId) {
    this.remarketingListId = remarketingListId;
    return this;
  }

  /**
   * List population term type determines the applicable fields in this object. If left unset or set
   * to CUSTOM_VARIABLE_TERM, then variableName, variableFriendlyName, operator, value, and negation
   * are applicable. If set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are
   * applicable. If set to REFERRER_TERM then operator, value, and negation are applicable.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * List population term type determines the applicable fields in this object. If left unset or set
   * to CUSTOM_VARIABLE_TERM, then variableName, variableFriendlyName, operator, value, and negation
   * are applicable. If set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are
   * applicable. If set to REFERRER_TERM then operator, value, and negation are applicable.
   * @param type type or {@code null} for none
   */
  public ListPopulationTerm setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Literal to compare the variable to. This field is only relevant when type is left unset or set
   * to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Literal to compare the variable to. This field is only relevant when type is left unset or set
   * to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @param value value or {@code null} for none
   */
  public ListPopulationTerm setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Friendly name of this term's variable. This is a read-only, auto-generated field. This field is
   * only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM.
   * @return value or {@code null} for none
   */
  public java.lang.String getVariableFriendlyName() {
    return variableFriendlyName;
  }

  /**
   * Friendly name of this term's variable. This is a read-only, auto-generated field. This field is
   * only relevant when type is left unset or set to CUSTOM_VARIABLE_TERM.
   * @param variableFriendlyName variableFriendlyName or {@code null} for none
   */
  public ListPopulationTerm setVariableFriendlyName(java.lang.String variableFriendlyName) {
    this.variableFriendlyName = variableFriendlyName;
    return this;
  }

  /**
   * Name of the variable (U1, U2, etc.) being compared in this term. This field is only relevant
   * when type is set to null, CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @return value or {@code null} for none
   */
  public java.lang.String getVariableName() {
    return variableName;
  }

  /**
   * Name of the variable (U1, U2, etc.) being compared in this term. This field is only relevant
   * when type is set to null, CUSTOM_VARIABLE_TERM or REFERRER_TERM.
   * @param variableName variableName or {@code null} for none
   */
  public ListPopulationTerm setVariableName(java.lang.String variableName) {
    this.variableName = variableName;
    return this;
  }

  @Override
  public ListPopulationTerm set(String fieldName, Object value) {
    return (ListPopulationTerm) super.set(fieldName, value);
  }

  @Override
  public ListPopulationTerm clone() {
    return (ListPopulationTerm) super.clone();
  }

}
