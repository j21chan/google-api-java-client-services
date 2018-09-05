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

package com.google.dialogflow.v2beta1.model;

/**
 * Instructs the speech synthesizer how to generate the output audio content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1OutputAudioConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Audio encoding of the synthesized audio content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioEncoding;

  /**
   * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the
   * synthesizer will use the default sample rate based on the audio encoding. If this is different
   * from the voice's natural sample rate, then the synthesizer will honor this request by
   * converting to the desired sample rate (which might result in worse audio quality).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sampleRateHertz;

  /**
   * Optional. Configuration of how speech should be synthesized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1SynthesizeSpeechConfig synthesizeSpeechConfig;

  /**
   * Required. Audio encoding of the synthesized audio content.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioEncoding() {
    return audioEncoding;
  }

  /**
   * Required. Audio encoding of the synthesized audio content.
   * @param audioEncoding audioEncoding or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1OutputAudioConfig setAudioEncoding(java.lang.String audioEncoding) {
    this.audioEncoding = audioEncoding;
    return this;
  }

  /**
   * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the
   * synthesizer will use the default sample rate based on the audio encoding. If this is different
   * from the voice's natural sample rate, then the synthesizer will honor this request by
   * converting to the desired sample rate (which might result in worse audio quality).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSampleRateHertz() {
    return sampleRateHertz;
  }

  /**
   * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the
   * synthesizer will use the default sample rate based on the audio encoding. If this is different
   * from the voice's natural sample rate, then the synthesizer will honor this request by
   * converting to the desired sample rate (which might result in worse audio quality).
   * @param sampleRateHertz sampleRateHertz or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1OutputAudioConfig setSampleRateHertz(java.lang.Integer sampleRateHertz) {
    this.sampleRateHertz = sampleRateHertz;
    return this;
  }

  /**
   * Optional. Configuration of how speech should be synthesized.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1SynthesizeSpeechConfig getSynthesizeSpeechConfig() {
    return synthesizeSpeechConfig;
  }

  /**
   * Optional. Configuration of how speech should be synthesized.
   * @param synthesizeSpeechConfig synthesizeSpeechConfig or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1OutputAudioConfig setSynthesizeSpeechConfig(GoogleCloudDialogflowV2beta1SynthesizeSpeechConfig synthesizeSpeechConfig) {
    this.synthesizeSpeechConfig = synthesizeSpeechConfig;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1OutputAudioConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1OutputAudioConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1OutputAudioConfig clone() {
    return (GoogleCloudDialogflowV2beta1OutputAudioConfig) super.clone();
  }

}
