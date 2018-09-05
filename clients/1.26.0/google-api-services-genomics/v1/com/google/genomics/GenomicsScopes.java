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

package com.google.genomics;

/**
 * Available OAuth 2.0 scopes for use with the Genomics API.
 *
 * @since 1.4
 */
public class GenomicsScopes {

  /** View and manage your data in Google BigQuery. */
  public static final String BIGQUERY = "https://www.googleapis.com/auth/bigquery";

  /** View and manage your data across Google Cloud Platform services. */
  public static final String CLOUD_PLATFORM = "https://www.googleapis.com/auth/cloud-platform";

  /** Manage your data in Google Cloud Storage. */
  public static final String DEVSTORAGE_READ_WRITE = "https://www.googleapis.com/auth/devstorage.read_write";

  /** View and manage Genomics data. */
  public static final String GENOMICS = "https://www.googleapis.com/auth/genomics";

  /** View Genomics data. */
  public static final String GENOMICS_READONLY = "https://www.googleapis.com/auth/genomics.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(BIGQUERY);
    set.add(CLOUD_PLATFORM);
    set.add(DEVSTORAGE_READ_WRITE);
    set.add(GENOMICS);
    set.add(GENOMICS_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private GenomicsScopes() {
  }
}
