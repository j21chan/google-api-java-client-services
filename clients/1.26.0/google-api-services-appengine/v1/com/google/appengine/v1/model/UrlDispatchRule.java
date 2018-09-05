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

package com.google.appengine.v1.model;

/**
 * Rules to match an HTTP request and dispatch that request to a service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlDispatchRule extends com.google.api.client.json.GenericJson {

  /**
   * Domain name to match against. The wildcard "*" is supported if specified before a period:
   * "*.".Defaults to matching all domains: "*".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the
   * path.The sum of the lengths of the domain and path may not exceed 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Resource ID of a service in this application that should serve the matched request. The service
   * must already exist. Example: default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * Domain name to match against. The wildcard "*" is supported if specified before a period:
   * "*.".Defaults to matching all domains: "*".
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Domain name to match against. The wildcard "*" is supported if specified before a period:
   * "*.".Defaults to matching all domains: "*".
   * @param domain domain or {@code null} for none
   */
  public UrlDispatchRule setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the
   * path.The sum of the lengths of the domain and path may not exceed 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the
   * path.The sum of the lengths of the domain and path may not exceed 100 characters.
   * @param path path or {@code null} for none
   */
  public UrlDispatchRule setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Resource ID of a service in this application that should serve the matched request. The service
   * must already exist. Example: default.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Resource ID of a service in this application that should serve the matched request. The service
   * must already exist. Example: default.
   * @param service service or {@code null} for none
   */
  public UrlDispatchRule setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public UrlDispatchRule set(String fieldName, Object value) {
    return (UrlDispatchRule) super.set(fieldName, value);
  }

  @Override
  public UrlDispatchRule clone() {
    return (UrlDispatchRule) super.clone();
  }

}
