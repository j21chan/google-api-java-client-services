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

package com.google.script.model;

/**
 * A set of functions. No duplicates are permitted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsScriptTypeFunctionSet extends com.google.api.client.json.GenericJson {

  /**
   * A list of functions composing the set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsScriptTypeFunction> values;

  /**
   * A list of functions composing the set.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsScriptTypeFunction> getValues() {
    return values;
  }

  /**
   * A list of functions composing the set.
   * @param values values or {@code null} for none
   */
  public GoogleAppsScriptTypeFunctionSet setValues(java.util.List<GoogleAppsScriptTypeFunction> values) {
    this.values = values;
    return this;
  }

  @Override
  public GoogleAppsScriptTypeFunctionSet set(String fieldName, Object value) {
    return (GoogleAppsScriptTypeFunctionSet) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsScriptTypeFunctionSet clone() {
    return (GoogleAppsScriptTypeFunctionSet) super.clone();
  }

}
