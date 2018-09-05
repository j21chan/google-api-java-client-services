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

package com.google.storagetransfer.v1.model;

/**
 * AWS access key (see [AWS Security Credentials](http://docs.aws.amazon.com/general/latest/gr/aws-
 * security-credentials.html)).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AwsAccessKey extends com.google.api.client.json.GenericJson {

  /**
   * AWS access key ID. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessKeyId;

  /**
   * AWS secret access key. This field is not returned in RPC responses. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secretAccessKey;

  /**
   * AWS access key ID. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessKeyId() {
    return accessKeyId;
  }

  /**
   * AWS access key ID. Required.
   * @param accessKeyId accessKeyId or {@code null} for none
   */
  public AwsAccessKey setAccessKeyId(java.lang.String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * AWS secret access key. This field is not returned in RPC responses. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretAccessKey() {
    return secretAccessKey;
  }

  /**
   * AWS secret access key. This field is not returned in RPC responses. Required.
   * @param secretAccessKey secretAccessKey or {@code null} for none
   */
  public AwsAccessKey setSecretAccessKey(java.lang.String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  @Override
  public AwsAccessKey set(String fieldName, Object value) {
    return (AwsAccessKey) super.set(fieldName, value);
  }

  @Override
  public AwsAccessKey clone() {
    return (AwsAccessKey) super.clone();
  }

}
