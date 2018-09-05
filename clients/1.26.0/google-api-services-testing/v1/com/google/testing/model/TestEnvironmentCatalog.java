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

package com.google.testing.model;

/**
 * A description of a test environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestEnvironmentCatalog extends com.google.api.client.json.GenericJson {

  /**
   * Android devices suitable for running Android Instrumentation Tests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidDeviceCatalog androidDeviceCatalog;

  /**
   * Supported network configurations
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkConfigurationCatalog networkConfigurationCatalog;

  /**
   * The software test environment provided by TestExecutionService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProvidedSoftwareCatalog softwareCatalog;

  /**
   * Android devices suitable for running Android Instrumentation Tests.
   * @return value or {@code null} for none
   */
  public AndroidDeviceCatalog getAndroidDeviceCatalog() {
    return androidDeviceCatalog;
  }

  /**
   * Android devices suitable for running Android Instrumentation Tests.
   * @param androidDeviceCatalog androidDeviceCatalog or {@code null} for none
   */
  public TestEnvironmentCatalog setAndroidDeviceCatalog(AndroidDeviceCatalog androidDeviceCatalog) {
    this.androidDeviceCatalog = androidDeviceCatalog;
    return this;
  }

  /**
   * Supported network configurations
   * @return value or {@code null} for none
   */
  public NetworkConfigurationCatalog getNetworkConfigurationCatalog() {
    return networkConfigurationCatalog;
  }

  /**
   * Supported network configurations
   * @param networkConfigurationCatalog networkConfigurationCatalog or {@code null} for none
   */
  public TestEnvironmentCatalog setNetworkConfigurationCatalog(NetworkConfigurationCatalog networkConfigurationCatalog) {
    this.networkConfigurationCatalog = networkConfigurationCatalog;
    return this;
  }

  /**
   * The software test environment provided by TestExecutionService.
   * @return value or {@code null} for none
   */
  public ProvidedSoftwareCatalog getSoftwareCatalog() {
    return softwareCatalog;
  }

  /**
   * The software test environment provided by TestExecutionService.
   * @param softwareCatalog softwareCatalog or {@code null} for none
   */
  public TestEnvironmentCatalog setSoftwareCatalog(ProvidedSoftwareCatalog softwareCatalog) {
    this.softwareCatalog = softwareCatalog;
    return this;
  }

  @Override
  public TestEnvironmentCatalog set(String fieldName, Object value) {
    return (TestEnvironmentCatalog) super.set(fieldName, value);
  }

  @Override
  public TestEnvironmentCatalog clone() {
    return (TestEnvironmentCatalog) super.clone();
  }

}
