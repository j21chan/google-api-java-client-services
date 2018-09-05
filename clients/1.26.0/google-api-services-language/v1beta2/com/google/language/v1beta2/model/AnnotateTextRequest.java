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

package com.google.language.v1beta2.model;

/**
 * The request message for the text annotation API, which can perform multiple analysis types
 * (sentiment, entities, and syntax) in one call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnnotateTextRequest extends com.google.api.client.json.GenericJson {

  /**
   * Input document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Document document;

  /**
   * The encoding type used by the API to calculate offsets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encodingType;

  /**
   * The enabled features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Features features;

  /**
   * Input document.
   * @return value or {@code null} for none
   */
  public Document getDocument() {
    return document;
  }

  /**
   * Input document.
   * @param document document or {@code null} for none
   */
  public AnnotateTextRequest setDocument(Document document) {
    this.document = document;
    return this;
  }

  /**
   * The encoding type used by the API to calculate offsets.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncodingType() {
    return encodingType;
  }

  /**
   * The encoding type used by the API to calculate offsets.
   * @param encodingType encodingType or {@code null} for none
   */
  public AnnotateTextRequest setEncodingType(java.lang.String encodingType) {
    this.encodingType = encodingType;
    return this;
  }

  /**
   * The enabled features.
   * @return value or {@code null} for none
   */
  public Features getFeatures() {
    return features;
  }

  /**
   * The enabled features.
   * @param features features or {@code null} for none
   */
  public AnnotateTextRequest setFeatures(Features features) {
    this.features = features;
    return this;
  }

  @Override
  public AnnotateTextRequest set(String fieldName, Object value) {
    return (AnnotateTextRequest) super.set(fieldName, value);
  }

  @Override
  public AnnotateTextRequest clone() {
    return (AnnotateTextRequest) super.clone();
  }

}
