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

package com.google.deploymentmanager.model;

/**
 * Files that make up the template contents of a template type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API V2Beta Methods.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TemplateContents extends com.google.api.client.json.GenericJson {

  /**
   * Import files referenced by the main template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImportFile> imports;

  static {
    // hack to force ProGuard to consider ImportFile used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ImportFile.class);
  }

  /**
   * Which interpreter (python or jinja) should be used during expansion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interpreter;

  /**
   * The filename of the mainTemplate
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainTemplate;

  /**
   * The contents of the template schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schema;

  /**
   * The contents of the main template file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String template;

  /**
   * Import files referenced by the main template.
   * @return value or {@code null} for none
   */
  public java.util.List<ImportFile> getImports() {
    return imports;
  }

  /**
   * Import files referenced by the main template.
   * @param imports imports or {@code null} for none
   */
  public TemplateContents setImports(java.util.List<ImportFile> imports) {
    this.imports = imports;
    return this;
  }

  /**
   * Which interpreter (python or jinja) should be used during expansion.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterpreter() {
    return interpreter;
  }

  /**
   * Which interpreter (python or jinja) should be used during expansion.
   * @param interpreter interpreter or {@code null} for none
   */
  public TemplateContents setInterpreter(java.lang.String interpreter) {
    this.interpreter = interpreter;
    return this;
  }

  /**
   * The filename of the mainTemplate
   * @return value or {@code null} for none
   */
  public java.lang.String getMainTemplate() {
    return mainTemplate;
  }

  /**
   * The filename of the mainTemplate
   * @param mainTemplate mainTemplate or {@code null} for none
   */
  public TemplateContents setMainTemplate(java.lang.String mainTemplate) {
    this.mainTemplate = mainTemplate;
    return this;
  }

  /**
   * The contents of the template schema.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchema() {
    return schema;
  }

  /**
   * The contents of the template schema.
   * @param schema schema or {@code null} for none
   */
  public TemplateContents setSchema(java.lang.String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * The contents of the main template file.
   * @return value or {@code null} for none
   */
  public java.lang.String getTemplate() {
    return template;
  }

  /**
   * The contents of the main template file.
   * @param template template or {@code null} for none
   */
  public TemplateContents setTemplate(java.lang.String template) {
    this.template = template;
    return this;
  }

  @Override
  public TemplateContents set(String fieldName, Object value) {
    return (TemplateContents) super.set(fieldName, value);
  }

  @Override
  public TemplateContents clone() {
    return (TemplateContents) super.clone();
  }

}
