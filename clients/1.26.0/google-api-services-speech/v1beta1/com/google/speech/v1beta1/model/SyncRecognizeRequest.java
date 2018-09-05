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

package com.google.speech.v1beta1.model;

/**
 * The top-level message sent by the client for the `SyncRecognize` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SyncRecognizeRequest extends com.google.api.client.json.GenericJson {

  /**
   * *Required* The audio data to be recognized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RecognitionAudio audio;

  /**
   * *Required* Provides information to the recognizer that specifies how to process the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RecognitionConfig config;

  /**
   * *Required* The audio data to be recognized.
   * @return value or {@code null} for none
   */
  public RecognitionAudio getAudio() {
    return audio;
  }

  /**
   * *Required* The audio data to be recognized.
   * @param audio audio or {@code null} for none
   */
  public SyncRecognizeRequest setAudio(RecognitionAudio audio) {
    this.audio = audio;
    return this;
  }

  /**
   * *Required* Provides information to the recognizer that specifies how to process the request.
   * @return value or {@code null} for none
   */
  public RecognitionConfig getConfig() {
    return config;
  }

  /**
   * *Required* Provides information to the recognizer that specifies how to process the request.
   * @param config config or {@code null} for none
   */
  public SyncRecognizeRequest setConfig(RecognitionConfig config) {
    this.config = config;
    return this;
  }

  @Override
  public SyncRecognizeRequest set(String fieldName, Object value) {
    return (SyncRecognizeRequest) super.set(fieldName, value);
  }

  @Override
  public SyncRecognizeRequest clone() {
    return (SyncRecognizeRequest) super.clone();
  }

}
