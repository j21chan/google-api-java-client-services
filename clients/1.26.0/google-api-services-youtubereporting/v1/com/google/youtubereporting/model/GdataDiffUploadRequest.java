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

package com.google.youtubereporting.model;

/**
 * gdata
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GdataDiffUploadRequest extends com.google.api.client.json.GenericJson {

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataCompositeMedia checksumsInfo;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataCompositeMedia objectInfo;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectVersion;

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataCompositeMedia getChecksumsInfo() {
    return checksumsInfo;
  }

  /**
   * gdata
   * @param checksumsInfo checksumsInfo or {@code null} for none
   */
  public GdataDiffUploadRequest setChecksumsInfo(GdataCompositeMedia checksumsInfo) {
    this.checksumsInfo = checksumsInfo;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataCompositeMedia getObjectInfo() {
    return objectInfo;
  }

  /**
   * gdata
   * @param objectInfo objectInfo or {@code null} for none
   */
  public GdataDiffUploadRequest setObjectInfo(GdataCompositeMedia objectInfo) {
    this.objectInfo = objectInfo;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectVersion() {
    return objectVersion;
  }

  /**
   * gdata
   * @param objectVersion objectVersion or {@code null} for none
   */
  public GdataDiffUploadRequest setObjectVersion(java.lang.String objectVersion) {
    this.objectVersion = objectVersion;
    return this;
  }

  @Override
  public GdataDiffUploadRequest set(String fieldName, Object value) {
    return (GdataDiffUploadRequest) super.set(fieldName, value);
  }

  @Override
  public GdataDiffUploadRequest clone() {
    return (GdataDiffUploadRequest) super.clone();
  }

}
