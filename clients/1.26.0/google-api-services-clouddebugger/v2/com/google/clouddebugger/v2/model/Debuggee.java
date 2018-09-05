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

package com.google.clouddebugger.v2.model;

/**
 * Represents the debugged application. The application may include one or more replicated processes
 * executing the same code. Each of these processes is attached with a debugger agent, carrying out
 * the debugging commands. Agents attached to the same debuggee identify themselves as such by using
 * exactly the same Debuggee message value when registering.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Debugger API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Debuggee extends com.google.api.client.json.GenericJson {

  /**
   * Version ID of the agent. Schema: `domain/language-platform/vmajor.minor` (for example
   * `google.com/java-gcp/v1.1`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentVersion;

  /**
   * Human readable description of the debuggee. Including a human-readable project name,
   * environment name and version information is recommended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * References to the locations and revisions of the source code used in the deployed application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExtendedSourceContext> extSourceContexts;

  static {
    // hack to force ProGuard to consider ExtendedSourceContext used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ExtendedSourceContext.class);
  }

  /**
   * Unique identifier for the debuggee generated by the controller service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * If set to `true`, indicates that the agent should disable itself and detach from the debuggee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDisabled;

  /**
   * If set to `true`, indicates that Controller service does not detect any activity from the
   * debuggee agents and the application is possibly stopped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isInactive;

  /**
   * A set of custom debuggee properties, populated by the agent, to be displayed to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Project the debuggee is associated with. Use project number or id when registering a Google
   * Cloud Platform project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * References to the locations and revisions of the source code used in the deployed application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SourceContext> sourceContexts;

  static {
    // hack to force ProGuard to consider SourceContext used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SourceContext.class);
  }

  /**
   * Human readable message to be displayed to the user about this debuggee. Absence of this field
   * indicates no status. The message can be either informational or an error status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StatusMessage status;

  /**
   * Uniquifier to further distiguish the application. It is possible that different applications
   * might have identical values in the debuggee message, thus, incorrectly identified as a single
   * application by the Controller service. This field adds salt to further distiguish the
   * application. Agents should consider seeding this field with value that identifies the code,
   * binary, configuration and environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uniquifier;

  /**
   * Version ID of the agent. Schema: `domain/language-platform/vmajor.minor` (for example
   * `google.com/java-gcp/v1.1`).
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentVersion() {
    return agentVersion;
  }

  /**
   * Version ID of the agent. Schema: `domain/language-platform/vmajor.minor` (for example
   * `google.com/java-gcp/v1.1`).
   * @param agentVersion agentVersion or {@code null} for none
   */
  public Debuggee setAgentVersion(java.lang.String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * Human readable description of the debuggee. Including a human-readable project name,
   * environment name and version information is recommended.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human readable description of the debuggee. Including a human-readable project name,
   * environment name and version information is recommended.
   * @param description description or {@code null} for none
   */
  public Debuggee setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * References to the locations and revisions of the source code used in the deployed application.
   * @return value or {@code null} for none
   */
  public java.util.List<ExtendedSourceContext> getExtSourceContexts() {
    return extSourceContexts;
  }

  /**
   * References to the locations and revisions of the source code used in the deployed application.
   * @param extSourceContexts extSourceContexts or {@code null} for none
   */
  public Debuggee setExtSourceContexts(java.util.List<ExtendedSourceContext> extSourceContexts) {
    this.extSourceContexts = extSourceContexts;
    return this;
  }

  /**
   * Unique identifier for the debuggee generated by the controller service.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier for the debuggee generated by the controller service.
   * @param id id or {@code null} for none
   */
  public Debuggee setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * If set to `true`, indicates that the agent should disable itself and detach from the debuggee.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDisabled() {
    return isDisabled;
  }

  /**
   * If set to `true`, indicates that the agent should disable itself and detach from the debuggee.
   * @param isDisabled isDisabled or {@code null} for none
   */
  public Debuggee setIsDisabled(java.lang.Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * If set to `true`, indicates that Controller service does not detect any activity from the
   * debuggee agents and the application is possibly stopped.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsInactive() {
    return isInactive;
  }

  /**
   * If set to `true`, indicates that Controller service does not detect any activity from the
   * debuggee agents and the application is possibly stopped.
   * @param isInactive isInactive or {@code null} for none
   */
  public Debuggee setIsInactive(java.lang.Boolean isInactive) {
    this.isInactive = isInactive;
    return this;
  }

  /**
   * A set of custom debuggee properties, populated by the agent, to be displayed to the user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * A set of custom debuggee properties, populated by the agent, to be displayed to the user.
   * @param labels labels or {@code null} for none
   */
  public Debuggee setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Project the debuggee is associated with. Use project number or id when registering a Google
   * Cloud Platform project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * Project the debuggee is associated with. Use project number or id when registering a Google
   * Cloud Platform project.
   * @param project project or {@code null} for none
   */
  public Debuggee setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * References to the locations and revisions of the source code used in the deployed application.
   * @return value or {@code null} for none
   */
  public java.util.List<SourceContext> getSourceContexts() {
    return sourceContexts;
  }

  /**
   * References to the locations and revisions of the source code used in the deployed application.
   * @param sourceContexts sourceContexts or {@code null} for none
   */
  public Debuggee setSourceContexts(java.util.List<SourceContext> sourceContexts) {
    this.sourceContexts = sourceContexts;
    return this;
  }

  /**
   * Human readable message to be displayed to the user about this debuggee. Absence of this field
   * indicates no status. The message can be either informational or an error status.
   * @return value or {@code null} for none
   */
  public StatusMessage getStatus() {
    return status;
  }

  /**
   * Human readable message to be displayed to the user about this debuggee. Absence of this field
   * indicates no status. The message can be either informational or an error status.
   * @param status status or {@code null} for none
   */
  public Debuggee setStatus(StatusMessage status) {
    this.status = status;
    return this;
  }

  /**
   * Uniquifier to further distiguish the application. It is possible that different applications
   * might have identical values in the debuggee message, thus, incorrectly identified as a single
   * application by the Controller service. This field adds salt to further distiguish the
   * application. Agents should consider seeding this field with value that identifies the code,
   * binary, configuration and environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getUniquifier() {
    return uniquifier;
  }

  /**
   * Uniquifier to further distiguish the application. It is possible that different applications
   * might have identical values in the debuggee message, thus, incorrectly identified as a single
   * application by the Controller service. This field adds salt to further distiguish the
   * application. Agents should consider seeding this field with value that identifies the code,
   * binary, configuration and environment.
   * @param uniquifier uniquifier or {@code null} for none
   */
  public Debuggee setUniquifier(java.lang.String uniquifier) {
    this.uniquifier = uniquifier;
    return this;
  }

  @Override
  public Debuggee set(String fieldName, Object value) {
    return (Debuggee) super.set(fieldName, value);
  }

  @Override
  public Debuggee clone() {
    return (Debuggee) super.clone();
  }

}
