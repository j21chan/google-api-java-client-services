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

package com.google.youtube.model;

/**
 * Model definition for LiveChatPollClosedDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveChatPollClosedDetails extends com.google.api.client.json.GenericJson {

  /**
   * The id of the poll that was closed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pollId;

  /**
   * The id of the poll that was closed.
   * @return value or {@code null} for none
   */
  public java.lang.String getPollId() {
    return pollId;
  }

  /**
   * The id of the poll that was closed.
   * @param pollId pollId or {@code null} for none
   */
  public LiveChatPollClosedDetails setPollId(java.lang.String pollId) {
    this.pollId = pollId;
    return this;
  }

  @Override
  public LiveChatPollClosedDetails set(String fieldName, Object value) {
    return (LiveChatPollClosedDetails) super.set(fieldName, value);
  }

  @Override
  public LiveChatPollClosedDetails clone() {
    return (LiveChatPollClosedDetails) super.clone();
  }

}
