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

package com.google.compute.model;

/**
 * An instance's serial console output.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SerialPortOutput extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The contents of the console output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contents;

  /**
   * [Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] The position of the next byte of content from the serial console output. Use this
   * value in the next request as the start parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long next;

  /**
   * [Output Only] Server-defined URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The starting byte position of the output that was returned. This should match the start
   * parameter sent with the request. If the serial console output exceeds the size of the buffer,
   * older output will be overwritten by newer content and the start values will be mismatched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long start;

  /**
   * [Output Only] The contents of the console output.
   * @return value or {@code null} for none
   */
  public java.lang.String getContents() {
    return contents;
  }

  /**
   * [Output Only] The contents of the console output.
   * @param contents contents or {@code null} for none
   */
  public SerialPortOutput setContents(java.lang.String contents) {
    this.contents = contents;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#serialPortOutput for serial port output.
   * @param kind kind or {@code null} for none
   */
  public SerialPortOutput setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] The position of the next byte of content from the serial console output. Use this
   * value in the next request as the start parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNext() {
    return next;
  }

  /**
   * [Output Only] The position of the next byte of content from the serial console output. Use this
   * value in the next request as the start parameter.
   * @param next next or {@code null} for none
   */
  public SerialPortOutput setNext(java.lang.Long next) {
    this.next = next;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public SerialPortOutput setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The starting byte position of the output that was returned. This should match the start
   * parameter sent with the request. If the serial console output exceeds the size of the buffer,
   * older output will be overwritten by newer content and the start values will be mismatched.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * The starting byte position of the output that was returned. This should match the start
   * parameter sent with the request. If the serial console output exceeds the size of the buffer,
   * older output will be overwritten by newer content and the start values will be mismatched.
   * @param start start or {@code null} for none
   */
  public SerialPortOutput setStart(java.lang.Long start) {
    this.start = start;
    return this;
  }

  @Override
  public SerialPortOutput set(String fieldName, Object value) {
    return (SerialPortOutput) super.set(fieldName, value);
  }

  @Override
  public SerialPortOutput clone() {
    return (SerialPortOutput) super.clone();
  }

}
