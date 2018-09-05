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

package com.google.gamesConfiguration;

/**
 * Available OAuth 2.0 scopes for use with the Google Play Game Services Publishing API.
 *
 * @since 1.4
 */
public class GamesConfigurationScopes {

  /** View and manage your Google Play Developer account. */
  public static final String ANDROIDPUBLISHER = "https://www.googleapis.com/auth/androidpublisher";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(ANDROIDPUBLISHER);
    return java.util.Collections.unmodifiableSet(set);
  }

  private GamesConfigurationScopes() {
  }
}
