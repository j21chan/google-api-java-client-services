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

package com.google.servicebroker.v1beta1.model;

/**
 * The response for the `ListBindings()` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Broker API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudServicebrokerV1beta1ListBindingsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of bindings in the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudServicebrokerV1beta1Binding> bindings;

  /**
   * Used to communicate description of the response. Usually for non-standard error codes.
   * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * This token allows you to get the next page of results for list requests. If the number of
   * results is larger than `pageSize`, use the `nextPageToken` as a value for the query parameter
   * `pageToken` in the next list request. Subsequent list requests will have their own
   * `nextPageToken` to continue paging through the results
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of bindings in the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudServicebrokerV1beta1Binding> getBindings() {
    return bindings;
  }

  /**
   * The list of bindings in the instance.
   * @param bindings bindings or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1ListBindingsResponse setBindings(java.util.List<GoogleCloudServicebrokerV1beta1Binding> bindings) {
    this.bindings = bindings;
    return this;
  }

  /**
   * Used to communicate description of the response. Usually for non-standard error codes.
   * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Used to communicate description of the response. Usually for non-standard error codes.
   * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
   * @param description description or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1ListBindingsResponse setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * This token allows you to get the next page of results for list requests. If the number of
   * results is larger than `pageSize`, use the `nextPageToken` as a value for the query parameter
   * `pageToken` in the next list request. Subsequent list requests will have their own
   * `nextPageToken` to continue paging through the results
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * This token allows you to get the next page of results for list requests. If the number of
   * results is larger than `pageSize`, use the `nextPageToken` as a value for the query parameter
   * `pageToken` in the next list request. Subsequent list requests will have their own
   * `nextPageToken` to continue paging through the results
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1ListBindingsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudServicebrokerV1beta1ListBindingsResponse set(String fieldName, Object value) {
    return (GoogleCloudServicebrokerV1beta1ListBindingsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudServicebrokerV1beta1ListBindingsResponse clone() {
    return (GoogleCloudServicebrokerV1beta1ListBindingsResponse) super.clone();
  }

}
