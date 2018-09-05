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

package com.google.analytics;

/**
 * Available OAuth 2.0 scopes for use with the Google Analytics API.
 *
 * @since 1.4
 */
public class AnalyticsScopes {

  /** View and manage your Google Analytics data. */
  public static final String ANALYTICS = "https://www.googleapis.com/auth/analytics";

  /** View your Google Analytics data. */
  public static final String ANALYTICS_READONLY = "https://www.googleapis.com/auth/analytics.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(ANALYTICS);
    set.add(ANALYTICS_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private AnalyticsScopes() {
  }
}
