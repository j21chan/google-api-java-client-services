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

package com.google.appsactivity.model;

/**
 * A representation of a user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * A boolean which indicates whether the specified User was deleted. If true, name, photo and
   * permission_id will be omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDeleted;

  /**
   * Whether the user is the authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isMe;

  /**
   * The displayable name of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The permission ID associated with this user. Equivalent to the Drive API's permission ID for
   * this user, returned as part of the Drive Permissions resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissionId;

  /**
   * The profile photo of the user. Not present if the user has no profile photo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Photo photo;

  /**
   * A boolean which indicates whether the specified User was deleted. If true, name, photo and
   * permission_id will be omitted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * A boolean which indicates whether the specified User was deleted. If true, name, photo and
   * permission_id will be omitted.
   * @param isDeleted isDeleted or {@code null} for none
   */
  public User setIsDeleted(java.lang.Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Whether the user is the authenticated user.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsMe() {
    return isMe;
  }

  /**
   * Whether the user is the authenticated user.
   * @param isMe isMe or {@code null} for none
   */
  public User setIsMe(java.lang.Boolean isMe) {
    this.isMe = isMe;
    return this;
  }

  /**
   * The displayable name of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The displayable name of the user.
   * @param name name or {@code null} for none
   */
  public User setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The permission ID associated with this user. Equivalent to the Drive API's permission ID for
   * this user, returned as part of the Drive Permissions resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissionId() {
    return permissionId;
  }

  /**
   * The permission ID associated with this user. Equivalent to the Drive API's permission ID for
   * this user, returned as part of the Drive Permissions resource.
   * @param permissionId permissionId or {@code null} for none
   */
  public User setPermissionId(java.lang.String permissionId) {
    this.permissionId = permissionId;
    return this;
  }

  /**
   * The profile photo of the user. Not present if the user has no profile photo.
   * @return value or {@code null} for none
   */
  public Photo getPhoto() {
    return photo;
  }

  /**
   * The profile photo of the user. Not present if the user has no profile photo.
   * @param photo photo or {@code null} for none
   */
  public User setPhoto(Photo photo) {
    this.photo = photo;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
