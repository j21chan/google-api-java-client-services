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

package com.google.dataflow.model;

/**
 * Information about a side input of a DoFn or an input of a SeqDoFn.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SideInputInfo extends com.google.api.client.json.GenericJson {

  /**
   * How to interpret the source element(s) as a side input value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> kind;

  /**
   * The source(s) to read element(s) from to get the value of this side input. If more than one
   * source, then the elements are taken from the sources, in the specified order if order matters.
   * At least one source is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Source> sources;

  /**
   * The id of the tag the user code will access this side input by; this should correspond to the
   * tag of some MultiOutputInfo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * How to interpret the source element(s) as a side input value.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getKind() {
    return kind;
  }

  /**
   * How to interpret the source element(s) as a side input value.
   * @param kind kind or {@code null} for none
   */
  public SideInputInfo setKind(java.util.Map<String, java.lang.Object> kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The source(s) to read element(s) from to get the value of this side input. If more than one
   * source, then the elements are taken from the sources, in the specified order if order matters.
   * At least one source is required.
   * @return value or {@code null} for none
   */
  public java.util.List<Source> getSources() {
    return sources;
  }

  /**
   * The source(s) to read element(s) from to get the value of this side input. If more than one
   * source, then the elements are taken from the sources, in the specified order if order matters.
   * At least one source is required.
   * @param sources sources or {@code null} for none
   */
  public SideInputInfo setSources(java.util.List<Source> sources) {
    this.sources = sources;
    return this;
  }

  /**
   * The id of the tag the user code will access this side input by; this should correspond to the
   * tag of some MultiOutputInfo.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * The id of the tag the user code will access this side input by; this should correspond to the
   * tag of some MultiOutputInfo.
   * @param tag tag or {@code null} for none
   */
  public SideInputInfo setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  @Override
  public SideInputInfo set(String fieldName, Object value) {
    return (SideInputInfo) super.set(fieldName, value);
  }

  @Override
  public SideInputInfo clone() {
    return (SideInputInfo) super.clone();
  }

}
