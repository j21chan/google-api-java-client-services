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

package com.google.webmasters.model;

/**
 * List of sites with access level information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Console API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SitesListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Contains permission level information about a Search Console site. For more information, see
   * Permissions in Search Console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WmxSite> siteEntry;

  /**
   * Contains permission level information about a Search Console site. For more information, see
   * Permissions in Search Console.
   * @return value or {@code null} for none
   */
  public java.util.List<WmxSite> getSiteEntry() {
    return siteEntry;
  }

  /**
   * Contains permission level information about a Search Console site. For more information, see
   * Permissions in Search Console.
   * @param siteEntry siteEntry or {@code null} for none
   */
  public SitesListResponse setSiteEntry(java.util.List<WmxSite> siteEntry) {
    this.siteEntry = siteEntry;
    return this;
  }

  @Override
  public SitesListResponse set(String fieldName, Object value) {
    return (SitesListResponse) super.set(fieldName, value);
  }

  @Override
  public SitesListResponse clone() {
    return (SitesListResponse) super.clone();
  }

}
