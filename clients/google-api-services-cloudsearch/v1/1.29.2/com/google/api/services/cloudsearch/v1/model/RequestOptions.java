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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Shared request options for all RPC methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RequestOptions extends com.google.api.client.json.GenericJson {

  /**
   * Debug options of the request
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DebugOptions debugOptions;

  /**
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations.
   *
   * Set this field using the language set in browser or for the page. In the event that the user's
   * language preference is known, set this field to the known user language.
   *
   * When specified, the documents in search results are biased towards the specified language.
   *
   * The suggest API does not use this parameter. Instead, suggest autocompletes only based on
   * characters in the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Id of the application created using SearchApplicationsService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchApplicationId;

  /**
   * Current user's time zone id, such as "America/Los_Angeles" or "Australia/Sydney". These IDs are
   * defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/) project,
   * and currently available in the file
   * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml). This field is
   * used to correctly interpret date and time queries. If this field is not specified, the default
   * time zone (UTC) is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Debug options of the request
   * @return value or {@code null} for none
   */
  public DebugOptions getDebugOptions() {
    return debugOptions;
  }

  /**
   * Debug options of the request
   * @param debugOptions debugOptions or {@code null} for none
   */
  public RequestOptions setDebugOptions(DebugOptions debugOptions) {
    this.debugOptions = debugOptions;
    return this;
  }

  /**
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations.
   *
   * Set this field using the language set in browser or for the page. In the event that the user's
   * language preference is known, set this field to the known user language.
   *
   * When specified, the documents in search results are biased towards the specified language.
   *
   * The suggest API does not use this parameter. Instead, suggest autocompletes only based on
   * characters in the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations.
   *
   * Set this field using the language set in browser or for the page. In the event that the user's
   * language preference is known, set this field to the known user language.
   *
   * When specified, the documents in search results are biased towards the specified language.
   *
   * The suggest API does not use this parameter. Instead, suggest autocompletes only based on
   * characters in the query.
   * @param languageCode languageCode or {@code null} for none
   */
  public RequestOptions setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Id of the application created using SearchApplicationsService.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchApplicationId() {
    return searchApplicationId;
  }

  /**
   * Id of the application created using SearchApplicationsService.
   * @param searchApplicationId searchApplicationId or {@code null} for none
   */
  public RequestOptions setSearchApplicationId(java.lang.String searchApplicationId) {
    this.searchApplicationId = searchApplicationId;
    return this;
  }

  /**
   * Current user's time zone id, such as "America/Los_Angeles" or "Australia/Sydney". These IDs are
   * defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/) project,
   * and currently available in the file
   * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml). This field is
   * used to correctly interpret date and time queries. If this field is not specified, the default
   * time zone (UTC) is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Current user's time zone id, such as "America/Los_Angeles" or "Australia/Sydney". These IDs are
   * defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/) project,
   * and currently available in the file
   * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml). This field is
   * used to correctly interpret date and time queries. If this field is not specified, the default
   * time zone (UTC) is used.
   * @param timeZone timeZone or {@code null} for none
   */
  public RequestOptions setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public RequestOptions set(String fieldName, Object value) {
    return (RequestOptions) super.set(fieldName, value);
  }

  @Override
  public RequestOptions clone() {
    return (RequestOptions) super.clone();
  }

}
