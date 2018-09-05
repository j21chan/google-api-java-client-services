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

package com.google.tagmanager.model;

/**
 * Represents a Google Tag Manager Macro.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Macro extends com.google.api.client.json.GenericJson {

  /**
   * GTM Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * GTM Container ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerId;

  /**
   * For mobile containers only: A list of rule IDs for disabling conditional macros; the macro is
   * enabled if one of the enabling rules is true while all the disabling rules are false. Treated
   * as an unordered set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> disablingRuleId;

  /**
   * For mobile containers only: A list of rule IDs for enabling conditional macros; the macro is
   * enabled if one of the enabling rules is true while all the disabling rules are false. Treated
   * as an unordered set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enablingRuleId;

  /**
   * The fingerprint of the GTM Macro as computed at storage time. This value is recomputed whenever
   * the macro is modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * The Macro ID uniquely identifies the GTM Macro.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String macroId;

  /**
   * Macro display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * User notes on how to apply this macro in the container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notes;

  /**
   * The macro's parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Parameter> parameter;

  /**
   * Parent folder id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentFolderId;

  /**
   * The end timestamp in milliseconds to schedule a macro.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scheduleEndMs;

  /**
   * The start timestamp in milliseconds to schedule a macro.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scheduleStartMs;

  /**
   * GTM Macro Type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * GTM Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * GTM Account ID.
   * @param accountId accountId or {@code null} for none
   */
  public Macro setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * GTM Container ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerId() {
    return containerId;
  }

  /**
   * GTM Container ID.
   * @param containerId containerId or {@code null} for none
   */
  public Macro setContainerId(java.lang.String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * For mobile containers only: A list of rule IDs for disabling conditional macros; the macro is
   * enabled if one of the enabling rules is true while all the disabling rules are false. Treated
   * as an unordered set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDisablingRuleId() {
    return disablingRuleId;
  }

  /**
   * For mobile containers only: A list of rule IDs for disabling conditional macros; the macro is
   * enabled if one of the enabling rules is true while all the disabling rules are false. Treated
   * as an unordered set.
   * @param disablingRuleId disablingRuleId or {@code null} for none
   */
  public Macro setDisablingRuleId(java.util.List<java.lang.String> disablingRuleId) {
    this.disablingRuleId = disablingRuleId;
    return this;
  }

  /**
   * For mobile containers only: A list of rule IDs for enabling conditional macros; the macro is
   * enabled if one of the enabling rules is true while all the disabling rules are false. Treated
   * as an unordered set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnablingRuleId() {
    return enablingRuleId;
  }

  /**
   * For mobile containers only: A list of rule IDs for enabling conditional macros; the macro is
   * enabled if one of the enabling rules is true while all the disabling rules are false. Treated
   * as an unordered set.
   * @param enablingRuleId enablingRuleId or {@code null} for none
   */
  public Macro setEnablingRuleId(java.util.List<java.lang.String> enablingRuleId) {
    this.enablingRuleId = enablingRuleId;
    return this;
  }

  /**
   * The fingerprint of the GTM Macro as computed at storage time. This value is recomputed whenever
   * the macro is modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The fingerprint of the GTM Macro as computed at storage time. This value is recomputed whenever
   * the macro is modified.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Macro setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * The Macro ID uniquely identifies the GTM Macro.
   * @return value or {@code null} for none
   */
  public java.lang.String getMacroId() {
    return macroId;
  }

  /**
   * The Macro ID uniquely identifies the GTM Macro.
   * @param macroId macroId or {@code null} for none
   */
  public Macro setMacroId(java.lang.String macroId) {
    this.macroId = macroId;
    return this;
  }

  /**
   * Macro display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Macro display name.
   * @param name name or {@code null} for none
   */
  public Macro setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * User notes on how to apply this macro in the container.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotes() {
    return notes;
  }

  /**
   * User notes on how to apply this macro in the container.
   * @param notes notes or {@code null} for none
   */
  public Macro setNotes(java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * The macro's parameters.
   * @return value or {@code null} for none
   */
  public java.util.List<Parameter> getParameter() {
    return parameter;
  }

  /**
   * The macro's parameters.
   * @param parameter parameter or {@code null} for none
   */
  public Macro setParameter(java.util.List<Parameter> parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Parent folder id.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentFolderId() {
    return parentFolderId;
  }

  /**
   * Parent folder id.
   * @param parentFolderId parentFolderId or {@code null} for none
   */
  public Macro setParentFolderId(java.lang.String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

  /**
   * The end timestamp in milliseconds to schedule a macro.
   * @return value or {@code null} for none
   */
  public java.lang.Long getScheduleEndMs() {
    return scheduleEndMs;
  }

  /**
   * The end timestamp in milliseconds to schedule a macro.
   * @param scheduleEndMs scheduleEndMs or {@code null} for none
   */
  public Macro setScheduleEndMs(java.lang.Long scheduleEndMs) {
    this.scheduleEndMs = scheduleEndMs;
    return this;
  }

  /**
   * The start timestamp in milliseconds to schedule a macro.
   * @return value or {@code null} for none
   */
  public java.lang.Long getScheduleStartMs() {
    return scheduleStartMs;
  }

  /**
   * The start timestamp in milliseconds to schedule a macro.
   * @param scheduleStartMs scheduleStartMs or {@code null} for none
   */
  public Macro setScheduleStartMs(java.lang.Long scheduleStartMs) {
    this.scheduleStartMs = scheduleStartMs;
    return this;
  }

  /**
   * GTM Macro Type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * GTM Macro Type.
   * @param type type or {@code null} for none
   */
  public Macro setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Macro set(String fieldName, Object value) {
    return (Macro) super.set(fieldName, value);
  }

  @Override
  public Macro clone() {
    return (Macro) super.clone();
  }

}
