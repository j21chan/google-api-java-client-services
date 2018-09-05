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

package com.google.vault.v1.model;

/**
 * Add an account with the permission specified. The role cannot be owner. If an account already has
 * a role in the matter, it will be overwritten.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AddMatterPermissionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Only relevant if send_emails is true. True to CC requestor in the email message. False to not
   * CC requestor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ccMe;

  /**
   * The MatterPermission to add.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MatterPermission matterPermission;

  /**
   * True to send notification email to the added account. False to not send notification email.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sendEmails;

  /**
   * Only relevant if send_emails is true. True to CC requestor in the email message. False to not
   * CC requestor.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCcMe() {
    return ccMe;
  }

  /**
   * Only relevant if send_emails is true. True to CC requestor in the email message. False to not
   * CC requestor.
   * @param ccMe ccMe or {@code null} for none
   */
  public AddMatterPermissionsRequest setCcMe(java.lang.Boolean ccMe) {
    this.ccMe = ccMe;
    return this;
  }

  /**
   * The MatterPermission to add.
   * @return value or {@code null} for none
   */
  public MatterPermission getMatterPermission() {
    return matterPermission;
  }

  /**
   * The MatterPermission to add.
   * @param matterPermission matterPermission or {@code null} for none
   */
  public AddMatterPermissionsRequest setMatterPermission(MatterPermission matterPermission) {
    this.matterPermission = matterPermission;
    return this;
  }

  /**
   * True to send notification email to the added account. False to not send notification email.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSendEmails() {
    return sendEmails;
  }

  /**
   * True to send notification email to the added account. False to not send notification email.
   * @param sendEmails sendEmails or {@code null} for none
   */
  public AddMatterPermissionsRequest setSendEmails(java.lang.Boolean sendEmails) {
    this.sendEmails = sendEmails;
    return this;
  }

  @Override
  public AddMatterPermissionsRequest set(String fieldName, Object value) {
    return (AddMatterPermissionsRequest) super.set(fieldName, value);
  }

  @Override
  public AddMatterPermissionsRequest clone() {
    return (AddMatterPermissionsRequest) super.clone();
  }

}
