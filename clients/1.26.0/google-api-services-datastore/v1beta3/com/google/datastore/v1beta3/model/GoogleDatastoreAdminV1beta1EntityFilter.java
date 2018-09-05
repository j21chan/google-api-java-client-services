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

package com.google.datastore.v1beta3.model;

/**
 * Identifies a subset of entities in a project. This is specified as combinations of kinds and
 * namespaces (either or both of which may be all, as described in the following examples). Example
 * usage:
 *
 * Entire project:   kinds=[], namespace_ids=[]
 *
 * Kinds Foo and Bar in all namespaces:   kinds=['Foo', 'Bar'], namespace_ids=[]
 *
 * Kinds Foo and Bar only in the default namespace:   kinds=['Foo', 'Bar'], namespace_ids=['']
 *
 * Kinds Foo and Bar in both the default and Baz namespaces:   kinds=['Foo', 'Bar'],
 * namespace_ids=['', 'Baz']
 *
 * The entire Baz namespace:   kinds=[], namespace_ids=['Baz']
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1beta1EntityFilter extends com.google.api.client.json.GenericJson {

  /**
   * If empty, then this represents all kinds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> kinds;

  /**
   * An empty list represents all namespaces. This is the preferred usage for projects that don't
   * use namespaces.
   *
   * An empty string element represents the default namespace. This should be used if the project
   * has data in non-default namespaces, but doesn't want to include them. Each namespace in this
   * list must be unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> namespaceIds;

  /**
   * If empty, then this represents all kinds.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getKinds() {
    return kinds;
  }

  /**
   * If empty, then this represents all kinds.
   * @param kinds kinds or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1EntityFilter setKinds(java.util.List<java.lang.String> kinds) {
    this.kinds = kinds;
    return this;
  }

  /**
   * An empty list represents all namespaces. This is the preferred usage for projects that don't
   * use namespaces.
   *
   * An empty string element represents the default namespace. This should be used if the project
   * has data in non-default namespaces, but doesn't want to include them. Each namespace in this
   * list must be unique.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNamespaceIds() {
    return namespaceIds;
  }

  /**
   * An empty list represents all namespaces. This is the preferred usage for projects that don't
   * use namespaces.
   *
   * An empty string element represents the default namespace. This should be used if the project
   * has data in non-default namespaces, but doesn't want to include them. Each namespace in this
   * list must be unique.
   * @param namespaceIds namespaceIds or {@code null} for none
   */
  public GoogleDatastoreAdminV1beta1EntityFilter setNamespaceIds(java.util.List<java.lang.String> namespaceIds) {
    this.namespaceIds = namespaceIds;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1beta1EntityFilter set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1beta1EntityFilter) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1beta1EntityFilter clone() {
    return (GoogleDatastoreAdminV1beta1EntityFilter) super.clone();
  }

}
