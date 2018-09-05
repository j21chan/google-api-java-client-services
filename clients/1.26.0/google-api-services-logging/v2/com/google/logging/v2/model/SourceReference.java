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

package com.google.logging.v2.model;

/**
 * A reference to a particular snapshot of the source tree used to build and deploy an application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Logging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceReference extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A URI string identifying the repository. Example:
   * "https://github.com/GoogleCloudPlatform/kubernetes.git"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repository;

  /**
   * The canonical and persistent identifier of the deployed revision. Example (git):
   * "0035781c50ec7aa23385dc841529ce8a4b70db1b"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * Optional. A URI string identifying the repository. Example:
   * "https://github.com/GoogleCloudPlatform/kubernetes.git"
   * @return value or {@code null} for none
   */
  public java.lang.String getRepository() {
    return repository;
  }

  /**
   * Optional. A URI string identifying the repository. Example:
   * "https://github.com/GoogleCloudPlatform/kubernetes.git"
   * @param repository repository or {@code null} for none
   */
  public SourceReference setRepository(java.lang.String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * The canonical and persistent identifier of the deployed revision. Example (git):
   * "0035781c50ec7aa23385dc841529ce8a4b70db1b"
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * The canonical and persistent identifier of the deployed revision. Example (git):
   * "0035781c50ec7aa23385dc841529ce8a4b70db1b"
   * @param revisionId revisionId or {@code null} for none
   */
  public SourceReference setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  @Override
  public SourceReference set(String fieldName, Object value) {
    return (SourceReference) super.set(fieldName, value);
  }

  @Override
  public SourceReference clone() {
    return (SourceReference) super.clone();
  }

}
