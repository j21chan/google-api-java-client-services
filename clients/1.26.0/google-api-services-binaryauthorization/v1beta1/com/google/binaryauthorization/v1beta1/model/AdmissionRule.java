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

package com.google.binaryauthorization.v1beta1.model;

/**
 * An admission rule specifies either that all container images used in a pod creation request must
 * be attested to by one or more attestors, that all pod creations will be allowed, or that all pod
 * creations will be denied.
 *
 * Images matching an admission whitelist pattern are exempted from admission rules and will never
 * block a pod creation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdmissionRule extends com.google.api.client.json.GenericJson {

  /**
   * Required. The action when a pod creation is denied by the admission rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enforcementMode;

  /**
   * Required. How this admission rule will be evaluated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evaluationMode;

  /**
   * Optional. The resource names of the attestors that must attest to a container image, in the
   * format `projects/attestors`. Each attestor must exist before a policy can reference it.  To add
   * an attestor to a policy the principal issuing the policy change request must be able to read
   * the attestor resource.
   *
   * Note: this field must be non-empty when the evaluation_mode field specifies
   * REQUIRE_ATTESTATION, otherwise it must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requireAttestationsBy;

  /**
   * Required. The action when a pod creation is denied by the admission rule.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnforcementMode() {
    return enforcementMode;
  }

  /**
   * Required. The action when a pod creation is denied by the admission rule.
   * @param enforcementMode enforcementMode or {@code null} for none
   */
  public AdmissionRule setEnforcementMode(java.lang.String enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  /**
   * Required. How this admission rule will be evaluated.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvaluationMode() {
    return evaluationMode;
  }

  /**
   * Required. How this admission rule will be evaluated.
   * @param evaluationMode evaluationMode or {@code null} for none
   */
  public AdmissionRule setEvaluationMode(java.lang.String evaluationMode) {
    this.evaluationMode = evaluationMode;
    return this;
  }

  /**
   * Optional. The resource names of the attestors that must attest to a container image, in the
   * format `projects/attestors`. Each attestor must exist before a policy can reference it.  To add
   * an attestor to a policy the principal issuing the policy change request must be able to read
   * the attestor resource.
   *
   * Note: this field must be non-empty when the evaluation_mode field specifies
   * REQUIRE_ATTESTATION, otherwise it must be empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequireAttestationsBy() {
    return requireAttestationsBy;
  }

  /**
   * Optional. The resource names of the attestors that must attest to a container image, in the
   * format `projects/attestors`. Each attestor must exist before a policy can reference it.  To add
   * an attestor to a policy the principal issuing the policy change request must be able to read
   * the attestor resource.
   *
   * Note: this field must be non-empty when the evaluation_mode field specifies
   * REQUIRE_ATTESTATION, otherwise it must be empty.
   * @param requireAttestationsBy requireAttestationsBy or {@code null} for none
   */
  public AdmissionRule setRequireAttestationsBy(java.util.List<java.lang.String> requireAttestationsBy) {
    this.requireAttestationsBy = requireAttestationsBy;
    return this;
  }

  @Override
  public AdmissionRule set(String fieldName, Object value) {
    return (AdmissionRule) super.set(fieldName, value);
  }

  @Override
  public AdmissionRule clone() {
    return (AdmissionRule) super.clone();
  }

}
