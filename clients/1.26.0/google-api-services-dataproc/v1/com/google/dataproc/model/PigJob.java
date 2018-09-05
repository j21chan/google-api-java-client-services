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

package com.google.dataproc.model;

/**
 * A Cloud Dataproc job for running Apache Pig (https://pig.apache.org/) queries on YARN.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PigJob extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Whether to continue executing queries if a query fails. The default value is false.
   * Setting to true can be useful when executing independent parallel queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean continueOnFailure;

  /**
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce
   * (MR) tasks. Can contain Pig UDFs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> jarFileUris;

  /**
   * Optional. The runtime log config for job execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LoggingConfig loggingConfig;

  /**
   * Optional. A mapping of property names to values, used to configure Pig. Properties that
   * conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties
   * set in /etc/hadoop/conf-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> properties;

  /**
   * The HCFS URI of the script that contains the Pig queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queryFileUri;

  /**
   * A list of queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueryList queryList;

  /**
   * Optional. Mapping of query variable names to values (equivalent to the Pig command:
   * name=[value]).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> scriptVariables;

  /**
   * Optional. Whether to continue executing queries if a query fails. The default value is false.
   * Setting to true can be useful when executing independent parallel queries.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContinueOnFailure() {
    return continueOnFailure;
  }

  /**
   * Optional. Whether to continue executing queries if a query fails. The default value is false.
   * Setting to true can be useful when executing independent parallel queries.
   * @param continueOnFailure continueOnFailure or {@code null} for none
   */
  public PigJob setContinueOnFailure(java.lang.Boolean continueOnFailure) {
    this.continueOnFailure = continueOnFailure;
    return this;
  }

  /**
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce
   * (MR) tasks. Can contain Pig UDFs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getJarFileUris() {
    return jarFileUris;
  }

  /**
   * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce
   * (MR) tasks. Can contain Pig UDFs.
   * @param jarFileUris jarFileUris or {@code null} for none
   */
  public PigJob setJarFileUris(java.util.List<java.lang.String> jarFileUris) {
    this.jarFileUris = jarFileUris;
    return this;
  }

  /**
   * Optional. The runtime log config for job execution.
   * @return value or {@code null} for none
   */
  public LoggingConfig getLoggingConfig() {
    return loggingConfig;
  }

  /**
   * Optional. The runtime log config for job execution.
   * @param loggingConfig loggingConfig or {@code null} for none
   */
  public PigJob setLoggingConfig(LoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

  /**
   * Optional. A mapping of property names to values, used to configure Pig. Properties that
   * conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties
   * set in /etc/hadoop/conf-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getProperties() {
    return properties;
  }

  /**
   * Optional. A mapping of property names to values, used to configure Pig. Properties that
   * conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties
   * set in /etc/hadoop/conf-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
   * @param properties properties or {@code null} for none
   */
  public PigJob setProperties(java.util.Map<String, java.lang.String> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The HCFS URI of the script that contains the Pig queries.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueryFileUri() {
    return queryFileUri;
  }

  /**
   * The HCFS URI of the script that contains the Pig queries.
   * @param queryFileUri queryFileUri or {@code null} for none
   */
  public PigJob setQueryFileUri(java.lang.String queryFileUri) {
    this.queryFileUri = queryFileUri;
    return this;
  }

  /**
   * A list of queries.
   * @return value or {@code null} for none
   */
  public QueryList getQueryList() {
    return queryList;
  }

  /**
   * A list of queries.
   * @param queryList queryList or {@code null} for none
   */
  public PigJob setQueryList(QueryList queryList) {
    this.queryList = queryList;
    return this;
  }

  /**
   * Optional. Mapping of query variable names to values (equivalent to the Pig command:
   * name=[value]).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getScriptVariables() {
    return scriptVariables;
  }

  /**
   * Optional. Mapping of query variable names to values (equivalent to the Pig command:
   * name=[value]).
   * @param scriptVariables scriptVariables or {@code null} for none
   */
  public PigJob setScriptVariables(java.util.Map<String, java.lang.String> scriptVariables) {
    this.scriptVariables = scriptVariables;
    return this;
  }

  @Override
  public PigJob set(String fieldName, Object value) {
    return (PigJob) super.set(fieldName, value);
  }

  @Override
  public PigJob clone() {
    return (PigJob) super.clone();
  }

}
