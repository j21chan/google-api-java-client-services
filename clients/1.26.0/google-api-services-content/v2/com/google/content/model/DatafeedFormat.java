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

package com.google.content.model;

/**
 * Model definition for DatafeedFormat.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatafeedFormat extends com.google.api.client.json.GenericJson {

  /**
   * Delimiter for the separation of values in a delimiter-separated values feed. If not specified,
   * the delimiter will be auto-detected. Ignored for non-DSV data feeds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String columnDelimiter;

  /**
   * Character encoding scheme of the data feed. If not specified, the encoding will be auto-
   * detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileEncoding;

  /**
   * Specifies how double quotes are interpreted. If not specified, the mode will be auto-detected.
   * Ignored for non-DSV data feeds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quotingMode;

  /**
   * Delimiter for the separation of values in a delimiter-separated values feed. If not specified,
   * the delimiter will be auto-detected. Ignored for non-DSV data feeds.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumnDelimiter() {
    return columnDelimiter;
  }

  /**
   * Delimiter for the separation of values in a delimiter-separated values feed. If not specified,
   * the delimiter will be auto-detected. Ignored for non-DSV data feeds.
   * @param columnDelimiter columnDelimiter or {@code null} for none
   */
  public DatafeedFormat setColumnDelimiter(java.lang.String columnDelimiter) {
    this.columnDelimiter = columnDelimiter;
    return this;
  }

  /**
   * Character encoding scheme of the data feed. If not specified, the encoding will be auto-
   * detected.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileEncoding() {
    return fileEncoding;
  }

  /**
   * Character encoding scheme of the data feed. If not specified, the encoding will be auto-
   * detected.
   * @param fileEncoding fileEncoding or {@code null} for none
   */
  public DatafeedFormat setFileEncoding(java.lang.String fileEncoding) {
    this.fileEncoding = fileEncoding;
    return this;
  }

  /**
   * Specifies how double quotes are interpreted. If not specified, the mode will be auto-detected.
   * Ignored for non-DSV data feeds.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuotingMode() {
    return quotingMode;
  }

  /**
   * Specifies how double quotes are interpreted. If not specified, the mode will be auto-detected.
   * Ignored for non-DSV data feeds.
   * @param quotingMode quotingMode or {@code null} for none
   */
  public DatafeedFormat setQuotingMode(java.lang.String quotingMode) {
    this.quotingMode = quotingMode;
    return this;
  }

  @Override
  public DatafeedFormat set(String fieldName, Object value) {
    return (DatafeedFormat) super.set(fieldName, value);
  }

  @Override
  public DatafeedFormat clone() {
    return (DatafeedFormat) super.clone();
  }

}
