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
 * An user owned drydock note references a Drydock ATTESTATION_AUTHORITY Note created by the user.
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
public final class UserOwnedDrydockNote extends com.google.api.client.json.GenericJson {

  /**
   * Output only. This field will contain the service account email address that this Attestor will
   * use as the principal when querying Container Analysis. Attestor administrators must grant this
   * service account the IAM role needed to read attestations from the note_reference in Container
   * Analysis (`containeranalysis.notes.occurrences.viewer`).
   *
   * This email address is fixed for the lifetime of the Attestor, but callers should not make any
   * other assumptions about the service account email; future versions may use an email based on a
   * different naming pattern.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String delegationServiceAccountEmail;

  /**
   * Required. The Drydock resource name of a ATTESTATION_AUTHORITY Note, created by the user, in
   * the format: `projects/notes` (or the legacy `providers/notes`). This field may not be updated.
   *
   * An attestation by this attestor is stored as a Drydock ATTESTATION_AUTHORITY Occurrence that
   * names a container image and that links to this Note. Drydock is an external dependency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noteReference;

  /**
   * Optional. Public keys that verify attestations signed by this attestor.  This field may be
   * updated.
   *
   * If this field is non-empty, one of the specified public keys must verify that an attestation
   * was signed by this attestor for the image specified in the admission request.
   *
   * If this field is empty, this attestor always returns that no valid attestations exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AttestorPublicKey> publicKeys;

  static {
    // hack to force ProGuard to consider AttestorPublicKey used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AttestorPublicKey.class);
  }

  /**
   * Output only. This field will contain the service account email address that this Attestor will
   * use as the principal when querying Container Analysis. Attestor administrators must grant this
   * service account the IAM role needed to read attestations from the note_reference in Container
   * Analysis (`containeranalysis.notes.occurrences.viewer`).
   *
   * This email address is fixed for the lifetime of the Attestor, but callers should not make any
   * other assumptions about the service account email; future versions may use an email based on a
   * different naming pattern.
   * @return value or {@code null} for none
   */
  public java.lang.String getDelegationServiceAccountEmail() {
    return delegationServiceAccountEmail;
  }

  /**
   * Output only. This field will contain the service account email address that this Attestor will
   * use as the principal when querying Container Analysis. Attestor administrators must grant this
   * service account the IAM role needed to read attestations from the note_reference in Container
   * Analysis (`containeranalysis.notes.occurrences.viewer`).
   *
   * This email address is fixed for the lifetime of the Attestor, but callers should not make any
   * other assumptions about the service account email; future versions may use an email based on a
   * different naming pattern.
   * @param delegationServiceAccountEmail delegationServiceAccountEmail or {@code null} for none
   */
  public UserOwnedDrydockNote setDelegationServiceAccountEmail(java.lang.String delegationServiceAccountEmail) {
    this.delegationServiceAccountEmail = delegationServiceAccountEmail;
    return this;
  }

  /**
   * Required. The Drydock resource name of a ATTESTATION_AUTHORITY Note, created by the user, in
   * the format: `projects/notes` (or the legacy `providers/notes`). This field may not be updated.
   *
   * An attestation by this attestor is stored as a Drydock ATTESTATION_AUTHORITY Occurrence that
   * names a container image and that links to this Note. Drydock is an external dependency.
   * @return value or {@code null} for none
   */
  public java.lang.String getNoteReference() {
    return noteReference;
  }

  /**
   * Required. The Drydock resource name of a ATTESTATION_AUTHORITY Note, created by the user, in
   * the format: `projects/notes` (or the legacy `providers/notes`). This field may not be updated.
   *
   * An attestation by this attestor is stored as a Drydock ATTESTATION_AUTHORITY Occurrence that
   * names a container image and that links to this Note. Drydock is an external dependency.
   * @param noteReference noteReference or {@code null} for none
   */
  public UserOwnedDrydockNote setNoteReference(java.lang.String noteReference) {
    this.noteReference = noteReference;
    return this;
  }

  /**
   * Optional. Public keys that verify attestations signed by this attestor.  This field may be
   * updated.
   *
   * If this field is non-empty, one of the specified public keys must verify that an attestation
   * was signed by this attestor for the image specified in the admission request.
   *
   * If this field is empty, this attestor always returns that no valid attestations exist.
   * @return value or {@code null} for none
   */
  public java.util.List<AttestorPublicKey> getPublicKeys() {
    return publicKeys;
  }

  /**
   * Optional. Public keys that verify attestations signed by this attestor.  This field may be
   * updated.
   *
   * If this field is non-empty, one of the specified public keys must verify that an attestation
   * was signed by this attestor for the image specified in the admission request.
   *
   * If this field is empty, this attestor always returns that no valid attestations exist.
   * @param publicKeys publicKeys or {@code null} for none
   */
  public UserOwnedDrydockNote setPublicKeys(java.util.List<AttestorPublicKey> publicKeys) {
    this.publicKeys = publicKeys;
    return this;
  }

  @Override
  public UserOwnedDrydockNote set(String fieldName, Object value) {
    return (UserOwnedDrydockNote) super.set(fieldName, value);
  }

  @Override
  public UserOwnedDrydockNote clone() {
    return (UserOwnedDrydockNote) super.clone();
  }

}
