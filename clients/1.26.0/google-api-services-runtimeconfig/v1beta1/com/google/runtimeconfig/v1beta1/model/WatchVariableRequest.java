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

package com.google.runtimeconfig.v1beta1.model;

/**
 * Request for the `WatchVariable()` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Runtime Configuration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WatchVariableRequest extends com.google.api.client.json.GenericJson {

  /**
   * If specified, checks the current timestamp of the variable and if the current timestamp is
   * newer than `newerThan` timestamp, the method returns immediately.
   *
   * If not specified or the variable has an older timestamp, the watcher waits for a the value to
   * change before returning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String newerThan;

  /**
   * If specified, checks the current timestamp of the variable and if the current timestamp is
   * newer than `newerThan` timestamp, the method returns immediately.
   *
   * If not specified or the variable has an older timestamp, the watcher waits for a the value to
   * change before returning.
   * @return value or {@code null} for none
   */
  public String getNewerThan() {
    return newerThan;
  }

  /**
   * If specified, checks the current timestamp of the variable and if the current timestamp is
   * newer than `newerThan` timestamp, the method returns immediately.
   *
   * If not specified or the variable has an older timestamp, the watcher waits for a the value to
   * change before returning.
   * @param newerThan newerThan or {@code null} for none
   */
  public WatchVariableRequest setNewerThan(String newerThan) {
    this.newerThan = newerThan;
    return this;
  }

  @Override
  public WatchVariableRequest set(String fieldName, Object value) {
    return (WatchVariableRequest) super.set(fieldName, value);
  }

  @Override
  public WatchVariableRequest clone() {
    return (WatchVariableRequest) super.clone();
  }

}
