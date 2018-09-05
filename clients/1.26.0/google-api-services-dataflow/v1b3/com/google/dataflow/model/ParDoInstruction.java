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

package com.google.dataflow.model;

/**
 * An instruction that does a ParDo operation. Takes one main input and zero or more side inputs,
 * and produces zero or more outputs. Runs user code.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ParDoInstruction extends com.google.api.client.json.GenericJson {

  /**
   * The input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstructionInput input;

  /**
   * Information about each of the outputs, if user_fn is a  MultiDoFn.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MultiOutputInfo> multiOutputInfos;

  static {
    // hack to force ProGuard to consider MultiOutputInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MultiOutputInfo.class);
  }

  /**
   * The number of outputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numOutputs;

  /**
   * Zero or more side inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SideInputInfo> sideInputs;

  static {
    // hack to force ProGuard to consider SideInputInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SideInputInfo.class);
  }

  /**
   * The user function to invoke.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> userFn;

  /**
   * The input.
   * @return value or {@code null} for none
   */
  public InstructionInput getInput() {
    return input;
  }

  /**
   * The input.
   * @param input input or {@code null} for none
   */
  public ParDoInstruction setInput(InstructionInput input) {
    this.input = input;
    return this;
  }

  /**
   * Information about each of the outputs, if user_fn is a  MultiDoFn.
   * @return value or {@code null} for none
   */
  public java.util.List<MultiOutputInfo> getMultiOutputInfos() {
    return multiOutputInfos;
  }

  /**
   * Information about each of the outputs, if user_fn is a  MultiDoFn.
   * @param multiOutputInfos multiOutputInfos or {@code null} for none
   */
  public ParDoInstruction setMultiOutputInfos(java.util.List<MultiOutputInfo> multiOutputInfos) {
    this.multiOutputInfos = multiOutputInfos;
    return this;
  }

  /**
   * The number of outputs.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumOutputs() {
    return numOutputs;
  }

  /**
   * The number of outputs.
   * @param numOutputs numOutputs or {@code null} for none
   */
  public ParDoInstruction setNumOutputs(java.lang.Integer numOutputs) {
    this.numOutputs = numOutputs;
    return this;
  }

  /**
   * Zero or more side inputs.
   * @return value or {@code null} for none
   */
  public java.util.List<SideInputInfo> getSideInputs() {
    return sideInputs;
  }

  /**
   * Zero or more side inputs.
   * @param sideInputs sideInputs or {@code null} for none
   */
  public ParDoInstruction setSideInputs(java.util.List<SideInputInfo> sideInputs) {
    this.sideInputs = sideInputs;
    return this;
  }

  /**
   * The user function to invoke.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getUserFn() {
    return userFn;
  }

  /**
   * The user function to invoke.
   * @param userFn userFn or {@code null} for none
   */
  public ParDoInstruction setUserFn(java.util.Map<String, java.lang.Object> userFn) {
    this.userFn = userFn;
    return this;
  }

  @Override
  public ParDoInstruction set(String fieldName, Object value) {
    return (ParDoInstruction) super.set(fieldName, value);
  }

  @Override
  public ParDoInstruction clone() {
    return (ParDoInstruction) super.clone();
  }

}
