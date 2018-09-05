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
 * An abstraction for referring to a genomic position, in relation to some already known reference.
 * For now, represents a genomic position as a reference name, a base number on that reference
 * (0-based), and a determination of forward or reverse strand.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Position extends com.google.api.client.json.GenericJson {

  /**
   * The 0-based offset from the start of the forward strand for that reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long position;

  /**
   * The name of the reference in whatever reference set is being used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceName;

  /**
   * Whether this position is on the reverse strand, as opposed to the forward strand.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reverseStrand;

  /**
   * The 0-based offset from the start of the forward strand for that reference.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPosition() {
    return position;
  }

  /**
   * The 0-based offset from the start of the forward strand for that reference.
   * @param position position or {@code null} for none
   */
  public Position setPosition(java.lang.Long position) {
    this.position = position;
    return this;
  }

  /**
   * The name of the reference in whatever reference set is being used.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceName() {
    return referenceName;
  }

  /**
   * The name of the reference in whatever reference set is being used.
   * @param referenceName referenceName or {@code null} for none
   */
  public Position setReferenceName(java.lang.String referenceName) {
    this.referenceName = referenceName;
    return this;
  }

  /**
   * Whether this position is on the reverse strand, as opposed to the forward strand.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReverseStrand() {
    return reverseStrand;
  }

  /**
   * Whether this position is on the reverse strand, as opposed to the forward strand.
   * @param reverseStrand reverseStrand or {@code null} for none
   */
  public Position setReverseStrand(java.lang.Boolean reverseStrand) {
    this.reverseStrand = reverseStrand;
    return this;
  }

  @Override
  public Position set(String fieldName, Object value) {
    return (Position) super.set(fieldName, value);
  }

  @Override
  public Position clone() {
    return (Position) super.clone();
  }

}
