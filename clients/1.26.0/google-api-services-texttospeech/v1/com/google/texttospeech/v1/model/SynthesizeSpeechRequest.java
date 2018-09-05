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

package com.google.texttospeech.v1.model;

/**
 * The top-level message sent by the client for the `SynthesizeSpeech` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Text-to-Speech API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SynthesizeSpeechRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The configuration of the synthesized audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AudioConfig audioConfig;

  /**
   * Required. The Synthesizer requires either plain text or SSML as input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SynthesisInput input;

  /**
   * Required. The desired voice of the synthesized audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VoiceSelectionParams voice;

  /**
   * Required. The configuration of the synthesized audio.
   * @return value or {@code null} for none
   */
  public AudioConfig getAudioConfig() {
    return audioConfig;
  }

  /**
   * Required. The configuration of the synthesized audio.
   * @param audioConfig audioConfig or {@code null} for none
   */
  public SynthesizeSpeechRequest setAudioConfig(AudioConfig audioConfig) {
    this.audioConfig = audioConfig;
    return this;
  }

  /**
   * Required. The Synthesizer requires either plain text or SSML as input.
   * @return value or {@code null} for none
   */
  public SynthesisInput getInput() {
    return input;
  }

  /**
   * Required. The Synthesizer requires either plain text or SSML as input.
   * @param input input or {@code null} for none
   */
  public SynthesizeSpeechRequest setInput(SynthesisInput input) {
    this.input = input;
    return this;
  }

  /**
   * Required. The desired voice of the synthesized audio.
   * @return value or {@code null} for none
   */
  public VoiceSelectionParams getVoice() {
    return voice;
  }

  /**
   * Required. The desired voice of the synthesized audio.
   * @param voice voice or {@code null} for none
   */
  public SynthesizeSpeechRequest setVoice(VoiceSelectionParams voice) {
    this.voice = voice;
    return this;
  }

  @Override
  public SynthesizeSpeechRequest set(String fieldName, Object value) {
    return (SynthesizeSpeechRequest) super.set(fieldName, value);
  }

  @Override
  public SynthesizeSpeechRequest clone() {
    return (SynthesizeSpeechRequest) super.clone();
  }

}
