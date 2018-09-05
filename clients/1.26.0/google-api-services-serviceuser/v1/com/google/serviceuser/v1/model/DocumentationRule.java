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

package com.google.serviceuser.v1.model;

/**
 * A documentation rule provides information about individual API elements.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service User API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentationRule extends com.google.api.client.json.GenericJson {

  /**
   * Deprecation description of the selected element(s). It can be provided if an element is marked
   * as `deprecated`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deprecationDescription;

  /**
   * Description of the selected API(s).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The selector is a comma-separated list of patterns. Each pattern is a qualified name of the
   * element which may end in "*", indicating a wildcard. Wildcards are only allowed at the end and
   * for a whole component of the qualified name, i.e. "foo.*" is ok, but not "foo.b*" or
   * "foo.*.bar". To specify a default for all applicable elements, the whole pattern "*" is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * Deprecation description of the selected element(s). It can be provided if an element is marked
   * as `deprecated`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeprecationDescription() {
    return deprecationDescription;
  }

  /**
   * Deprecation description of the selected element(s). It can be provided if an element is marked
   * as `deprecated`.
   * @param deprecationDescription deprecationDescription or {@code null} for none
   */
  public DocumentationRule setDeprecationDescription(java.lang.String deprecationDescription) {
    this.deprecationDescription = deprecationDescription;
    return this;
  }

  /**
   * Description of the selected API(s).
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the selected API(s).
   * @param description description or {@code null} for none
   */
  public DocumentationRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The selector is a comma-separated list of patterns. Each pattern is a qualified name of the
   * element which may end in "*", indicating a wildcard. Wildcards are only allowed at the end and
   * for a whole component of the qualified name, i.e. "foo.*" is ok, but not "foo.b*" or
   * "foo.*.bar". To specify a default for all applicable elements, the whole pattern "*" is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * The selector is a comma-separated list of patterns. Each pattern is a qualified name of the
   * element which may end in "*", indicating a wildcard. Wildcards are only allowed at the end and
   * for a whole component of the qualified name, i.e. "foo.*" is ok, but not "foo.b*" or
   * "foo.*.bar". To specify a default for all applicable elements, the whole pattern "*" is used.
   * @param selector selector or {@code null} for none
   */
  public DocumentationRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public DocumentationRule set(String fieldName, Object value) {
    return (DocumentationRule) super.set(fieldName, value);
  }

  @Override
  public DocumentationRule clone() {
    return (DocumentationRule) super.clone();
  }

}
