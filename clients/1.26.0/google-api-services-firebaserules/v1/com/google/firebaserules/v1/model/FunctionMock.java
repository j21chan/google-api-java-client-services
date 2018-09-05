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

package com.google.firebaserules.v1.model;

/**
 * Mock function definition.
 *
 * Mocks must refer to a function declared by the target service. The type of the function args and
 * result will be inferred at test time. If either the arg or result values are not compatible with
 * function type declaration, the request will be considered invalid.
 *
 * More than one `FunctionMock` may be provided for a given function name so long as the `Arg`
 * matchers are distinct. There may be only one function for a given overload where all `Arg` values
 * are `Arg.any_value`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Rules API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FunctionMock extends com.google.api.client.json.GenericJson {

  /**
   * The list of `Arg` values to match. The order in which the arguments are provided is the order
   * in which they must appear in the function invocation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Arg> args;

  static {
    // hack to force ProGuard to consider Arg used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Arg.class);
  }

  /**
   * The name of the function.
   *
   * The function name must match one provided by a service declaration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String function;

  /**
   * The mock result of the function call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Result result;

  /**
   * The list of `Arg` values to match. The order in which the arguments are provided is the order
   * in which they must appear in the function invocation.
   * @return value or {@code null} for none
   */
  public java.util.List<Arg> getArgs() {
    return args;
  }

  /**
   * The list of `Arg` values to match. The order in which the arguments are provided is the order
   * in which they must appear in the function invocation.
   * @param args args or {@code null} for none
   */
  public FunctionMock setArgs(java.util.List<Arg> args) {
    this.args = args;
    return this;
  }

  /**
   * The name of the function.
   *
   * The function name must match one provided by a service declaration.
   * @return value or {@code null} for none
   */
  public java.lang.String getFunction() {
    return function;
  }

  /**
   * The name of the function.
   *
   * The function name must match one provided by a service declaration.
   * @param function function or {@code null} for none
   */
  public FunctionMock setFunction(java.lang.String function) {
    this.function = function;
    return this;
  }

  /**
   * The mock result of the function call.
   * @return value or {@code null} for none
   */
  public Result getResult() {
    return result;
  }

  /**
   * The mock result of the function call.
   * @param result result or {@code null} for none
   */
  public FunctionMock setResult(Result result) {
    this.result = result;
    return this;
  }

  @Override
  public FunctionMock set(String fieldName, Object value) {
    return (FunctionMock) super.set(fieldName, value);
  }

  @Override
  public FunctionMock clone() {
    return (FunctionMock) super.clone();
  }

}
