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

package com.google.bigquerydatatransfer.v1.model;

/**
 * A request to determine whether the user has valid credentials. This method is used to limit the
 * number of OAuth popups in the user interface. The user id is inferred from the API call context.
 * If the data source has the Google+ authorization type, this method returns false, as it cannot be
 * determined whether the credentials are already valid merely based on the user id.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Data Transfer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CheckValidCredsRequest extends com.google.api.client.json.GenericJson {

  @Override
  public CheckValidCredsRequest set(String fieldName, Object value) {
    return (CheckValidCredsRequest) super.set(fieldName, value);
  }

  @Override
  public CheckValidCredsRequest clone() {
    return (CheckValidCredsRequest) super.clone();
  }

}
