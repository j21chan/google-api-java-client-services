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

package com.google.civicinfo.model;

/**
 * Model definition for InternalSourceSummaryProto.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InternalSourceSummaryProto extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * @param dataset dataset or {@code null} for none
   */
  public InternalSourceSummaryProto setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * @param provider provider or {@code null} for none
   */
  public InternalSourceSummaryProto setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  @Override
  public InternalSourceSummaryProto set(String fieldName, Object value) {
    return (InternalSourceSummaryProto) super.set(fieldName, value);
  }

  @Override
  public InternalSourceSummaryProto clone() {
    return (InternalSourceSummaryProto) super.clone();
  }

}
