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

package com.google.toolresults.model;

/**
 * A test of an Android application that can control an Android component independently of its
 * normal lifecycle.
 *
 * See  for more information on types of Android tests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidInstrumentationTest extends com.google.api.client.json.GenericJson {

  /**
   * The java package for the test to be executed. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String testPackageId;

  /**
   * The InstrumentationTestRunner class. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String testRunnerClass;

  /**
   * Each target must be fully qualified with the package name or class name, in one of these
   * formats: - "package package_name" - "class package_name.class_name" - "class
   * package_name.class_name#method_name"
   *
   * If empty, all targets in the module will be run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> testTargets;

  /**
   * The flag indicates whether Android Test Orchestrator will be used to run test or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useOrchestrator;

  /**
   * The java package for the test to be executed. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getTestPackageId() {
    return testPackageId;
  }

  /**
   * The java package for the test to be executed. Required
   * @param testPackageId testPackageId or {@code null} for none
   */
  public AndroidInstrumentationTest setTestPackageId(java.lang.String testPackageId) {
    this.testPackageId = testPackageId;
    return this;
  }

  /**
   * The InstrumentationTestRunner class. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getTestRunnerClass() {
    return testRunnerClass;
  }

  /**
   * The InstrumentationTestRunner class. Required
   * @param testRunnerClass testRunnerClass or {@code null} for none
   */
  public AndroidInstrumentationTest setTestRunnerClass(java.lang.String testRunnerClass) {
    this.testRunnerClass = testRunnerClass;
    return this;
  }

  /**
   * Each target must be fully qualified with the package name or class name, in one of these
   * formats: - "package package_name" - "class package_name.class_name" - "class
   * package_name.class_name#method_name"
   *
   * If empty, all targets in the module will be run.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTestTargets() {
    return testTargets;
  }

  /**
   * Each target must be fully qualified with the package name or class name, in one of these
   * formats: - "package package_name" - "class package_name.class_name" - "class
   * package_name.class_name#method_name"
   *
   * If empty, all targets in the module will be run.
   * @param testTargets testTargets or {@code null} for none
   */
  public AndroidInstrumentationTest setTestTargets(java.util.List<java.lang.String> testTargets) {
    this.testTargets = testTargets;
    return this;
  }

  /**
   * The flag indicates whether Android Test Orchestrator will be used to run test or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseOrchestrator() {
    return useOrchestrator;
  }

  /**
   * The flag indicates whether Android Test Orchestrator will be used to run test or not.
   * @param useOrchestrator useOrchestrator or {@code null} for none
   */
  public AndroidInstrumentationTest setUseOrchestrator(java.lang.Boolean useOrchestrator) {
    this.useOrchestrator = useOrchestrator;
    return this;
  }

  @Override
  public AndroidInstrumentationTest set(String fieldName, Object value) {
    return (AndroidInstrumentationTest) super.set(fieldName, value);
  }

  @Override
  public AndroidInstrumentationTest clone() {
    return (AndroidInstrumentationTest) super.clone();
  }

}
