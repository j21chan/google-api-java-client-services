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

package com.google.genomics.model;

/**
 * Model definition for GenomicsEntry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenomicsEntry extends com.google.api.client.json.GenericJson {

  /**
   * The created annotation, if creation was successful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Annotation annotation;

  /**
   * The creation status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * The created annotation, if creation was successful.
   * @return value or {@code null} for none
   */
  public Annotation getAnnotation() {
    return annotation;
  }

  /**
   * The created annotation, if creation was successful.
   * @param annotation annotation or {@code null} for none
   */
  public GenomicsEntry setAnnotation(Annotation annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * The creation status.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * The creation status.
   * @param status status or {@code null} for none
   */
  public GenomicsEntry setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public GenomicsEntry set(String fieldName, Object value) {
    return (GenomicsEntry) super.set(fieldName, value);
  }

  @Override
  public GenomicsEntry clone() {
    return (GenomicsEntry) super.clone();
  }

}
