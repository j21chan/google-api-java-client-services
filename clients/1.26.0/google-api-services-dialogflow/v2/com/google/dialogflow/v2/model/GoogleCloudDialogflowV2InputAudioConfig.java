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

package com.google.dialogflow.v2.model;

/**
 * Instructs the speech recognizer how to process the audio content.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2InputAudioConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. Audio encoding of the audio content to process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioEncoding;

  /**
   * Required. The language of the supplied audio. Dialogflow does not do translations. See
   * [Language Support](https://dialogflow.com/docs/languages) for a list of the currently supported
   * language codes. Note that queries in the same session do not necessarily need to specify the
   * same language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. The collection of phrase hints which are used to boost accuracy of speech
   * recognition. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-
   * text/docs/basics#phrase-hints) for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> phraseHints;

  /**
   * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech
   * API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sampleRateHertz;

  /**
   * Required. Audio encoding of the audio content to process.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioEncoding() {
    return audioEncoding;
  }

  /**
   * Required. Audio encoding of the audio content to process.
   * @param audioEncoding audioEncoding or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setAudioEncoding(java.lang.String audioEncoding) {
    this.audioEncoding = audioEncoding;
    return this;
  }

  /**
   * Required. The language of the supplied audio. Dialogflow does not do translations. See
   * [Language Support](https://dialogflow.com/docs/languages) for a list of the currently supported
   * language codes. Note that queries in the same session do not necessarily need to specify the
   * same language.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Required. The language of the supplied audio. Dialogflow does not do translations. See
   * [Language Support](https://dialogflow.com/docs/languages) for a list of the currently supported
   * language codes. Note that queries in the same session do not necessarily need to specify the
   * same language.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. The collection of phrase hints which are used to boost accuracy of speech
   * recognition. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-
   * text/docs/basics#phrase-hints) for more details.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPhraseHints() {
    return phraseHints;
  }

  /**
   * Optional. The collection of phrase hints which are used to boost accuracy of speech
   * recognition. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-
   * text/docs/basics#phrase-hints) for more details.
   * @param phraseHints phraseHints or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setPhraseHints(java.util.List<java.lang.String> phraseHints) {
    this.phraseHints = phraseHints;
    return this;
  }

  /**
   * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech
   * API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSampleRateHertz() {
    return sampleRateHertz;
  }

  /**
   * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech
   * API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
   * @param sampleRateHertz sampleRateHertz or {@code null} for none
   */
  public GoogleCloudDialogflowV2InputAudioConfig setSampleRateHertz(java.lang.Integer sampleRateHertz) {
    this.sampleRateHertz = sampleRateHertz;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2InputAudioConfig set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2InputAudioConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2InputAudioConfig clone() {
    return (GoogleCloudDialogflowV2InputAudioConfig) super.clone();
  }

}
