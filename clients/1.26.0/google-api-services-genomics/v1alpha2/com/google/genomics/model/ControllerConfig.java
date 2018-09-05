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

package com.google.genomics.model;

/**
 * Stores the information that the controller will fetch from the server in order to run. Should
 * only be used by VMs created by the Pipelines Service and not by end users.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ControllerConfig extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cmd;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> disks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsLogPath;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, RepeatedString> gcsSinks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, RepeatedString> gcsSources;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String image;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> vars;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCmd() {
    return cmd;
  }

  /**
   * @param cmd cmd or {@code null} for none
   */
  public ControllerConfig setCmd(java.lang.String cmd) {
    this.cmd = cmd;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDisks() {
    return disks;
  }

  /**
   * @param disks disks or {@code null} for none
   */
  public ControllerConfig setDisks(java.util.Map<String, java.lang.String> disks) {
    this.disks = disks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsLogPath() {
    return gcsLogPath;
  }

  /**
   * @param gcsLogPath gcsLogPath or {@code null} for none
   */
  public ControllerConfig setGcsLogPath(java.lang.String gcsLogPath) {
    this.gcsLogPath = gcsLogPath;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, RepeatedString> getGcsSinks() {
    return gcsSinks;
  }

  /**
   * @param gcsSinks gcsSinks or {@code null} for none
   */
  public ControllerConfig setGcsSinks(java.util.Map<String, RepeatedString> gcsSinks) {
    this.gcsSinks = gcsSinks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, RepeatedString> getGcsSources() {
    return gcsSources;
  }

  /**
   * @param gcsSources gcsSources or {@code null} for none
   */
  public ControllerConfig setGcsSources(java.util.Map<String, RepeatedString> gcsSources) {
    this.gcsSources = gcsSources;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImage() {
    return image;
  }

  /**
   * @param image image or {@code null} for none
   */
  public ControllerConfig setImage(java.lang.String image) {
    this.image = image;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * @param machineType machineType or {@code null} for none
   */
  public ControllerConfig setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getVars() {
    return vars;
  }

  /**
   * @param vars vars or {@code null} for none
   */
  public ControllerConfig setVars(java.util.Map<String, java.lang.String> vars) {
    this.vars = vars;
    return this;
  }

  @Override
  public ControllerConfig set(String fieldName, Object value) {
    return (ControllerConfig) super.set(fieldName, value);
  }

  @Override
  public ControllerConfig clone() {
    return (ControllerConfig) super.clone();
  }

}
