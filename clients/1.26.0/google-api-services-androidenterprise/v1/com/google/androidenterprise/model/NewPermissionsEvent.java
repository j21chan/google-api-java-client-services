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

package com.google.androidenterprise.model;

/**
 * An event generated when new permissions are added to an app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NewPermissionsEvent extends com.google.api.client.json.GenericJson {

  /**
   * The set of permissions that the enterprise admin has already approved for this application. Use
   * Permissions.Get on the EMM API to retrieve details about these permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> approvedPermissions;

  /**
   * The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added.
   * This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API
   * to retrieve details about these permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requestedPermissions;

  /**
   * The set of permissions that the enterprise admin has already approved for this application. Use
   * Permissions.Get on the EMM API to retrieve details about these permissions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getApprovedPermissions() {
    return approvedPermissions;
  }

  /**
   * The set of permissions that the enterprise admin has already approved for this application. Use
   * Permissions.Get on the EMM API to retrieve details about these permissions.
   * @param approvedPermissions approvedPermissions or {@code null} for none
   */
  public NewPermissionsEvent setApprovedPermissions(java.util.List<java.lang.String> approvedPermissions) {
    this.approvedPermissions = approvedPermissions;
    return this;
  }

  /**
   * The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added.
   * This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The id of the product (e.g. "app:com.google.android.gm") for which new permissions were added.
   * This field will always be present.
   * @param productId productId or {@code null} for none
   */
  public NewPermissionsEvent setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API
   * to retrieve details about these permissions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequestedPermissions() {
    return requestedPermissions;
  }

  /**
   * The set of permissions that the app is currently requesting. Use Permissions.Get on the EMM API
   * to retrieve details about these permissions.
   * @param requestedPermissions requestedPermissions or {@code null} for none
   */
  public NewPermissionsEvent setRequestedPermissions(java.util.List<java.lang.String> requestedPermissions) {
    this.requestedPermissions = requestedPermissions;
    return this;
  }

  @Override
  public NewPermissionsEvent set(String fieldName, Object value) {
    return (NewPermissionsEvent) super.set(fieldName, value);
  }

  @Override
  public NewPermissionsEvent clone() {
    return (NewPermissionsEvent) super.clone();
  }

}
