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

package com.google.tpu.v1.model;

/**
 * Response for ListTensorFlowVersions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud TPU API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTensorFlowVersionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The next page token or empty if none.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The listed nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TensorFlowVersion> tensorflowVersions;

  static {
    // hack to force ProGuard to consider TensorFlowVersion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TensorFlowVersion.class);
  }

  /**
   * The next page token or empty if none.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The next page token or empty if none.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTensorFlowVersionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The listed nodes.
   * @return value or {@code null} for none
   */
  public java.util.List<TensorFlowVersion> getTensorflowVersions() {
    return tensorflowVersions;
  }

  /**
   * The listed nodes.
   * @param tensorflowVersions tensorflowVersions or {@code null} for none
   */
  public ListTensorFlowVersionsResponse setTensorflowVersions(java.util.List<TensorFlowVersion> tensorflowVersions) {
    this.tensorflowVersions = tensorflowVersions;
    return this;
  }

  @Override
  public ListTensorFlowVersionsResponse set(String fieldName, Object value) {
    return (ListTensorFlowVersionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListTensorFlowVersionsResponse clone() {
    return (ListTensorFlowVersionsResponse) super.clone();
  }

}
