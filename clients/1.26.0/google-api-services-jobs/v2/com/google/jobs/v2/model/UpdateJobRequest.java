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

package com.google.jobs.v2.model;

/**
 * Input only.
 *
 * Update job request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateJobRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Please use processing_options. This flag is ignored if processing_options is set.
   *
   * Optional.
   *
   * If set to `true`, the service does not attempt resolve a more precise address for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableStreetAddressResolution;

  /**
   * Required.
   *
   * The Job to be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Job job;

  /**
   * Optional.
   *
   * Options for job processing.
   *
   * UpdateJobRequest.disable_street_address_resolution is ignored if this flag is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobProcessingOptions processingOptions;

  /**
   * Optional but strongly recommended to be provided for the best service experience.
   *
   * If update_job_fields is provided, only the specified fields in job are updated. Otherwise all
   * the fields are updated.
   *
   * A field mask to restrict the fields that are updated. Valid values are:
   *
   * * jobTitle * employmentTypes * description * applicationUrls * applicationEmailList *
   * applicationInstruction * responsibilities * qualifications * educationLevels * level *
   * department * startDate * endDate * compensationInfo * incentives * languageCode * benefits *
   * expireTime * customAttributes * visibility * publishDate * promotionValue * locations * region
   * * expiryDate (deprecated) * filterableCustomFields (deprecated) * unindexedCustomFields
   * (deprecated)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateJobFields;

  /**
   * Deprecated. Please use processing_options. This flag is ignored if processing_options is set.
   *
   * Optional.
   *
   * If set to `true`, the service does not attempt resolve a more precise address for the job.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableStreetAddressResolution() {
    return disableStreetAddressResolution;
  }

  /**
   * Deprecated. Please use processing_options. This flag is ignored if processing_options is set.
   *
   * Optional.
   *
   * If set to `true`, the service does not attempt resolve a more precise address for the job.
   * @param disableStreetAddressResolution disableStreetAddressResolution or {@code null} for none
   */
  public UpdateJobRequest setDisableStreetAddressResolution(java.lang.Boolean disableStreetAddressResolution) {
    this.disableStreetAddressResolution = disableStreetAddressResolution;
    return this;
  }

  /**
   * Required.
   *
   * The Job to be updated.
   * @return value or {@code null} for none
   */
  public Job getJob() {
    return job;
  }

  /**
   * Required.
   *
   * The Job to be updated.
   * @param job job or {@code null} for none
   */
  public UpdateJobRequest setJob(Job job) {
    this.job = job;
    return this;
  }

  /**
   * Optional.
   *
   * Options for job processing.
   *
   * UpdateJobRequest.disable_street_address_resolution is ignored if this flag is set.
   * @return value or {@code null} for none
   */
  public JobProcessingOptions getProcessingOptions() {
    return processingOptions;
  }

  /**
   * Optional.
   *
   * Options for job processing.
   *
   * UpdateJobRequest.disable_street_address_resolution is ignored if this flag is set.
   * @param processingOptions processingOptions or {@code null} for none
   */
  public UpdateJobRequest setProcessingOptions(JobProcessingOptions processingOptions) {
    this.processingOptions = processingOptions;
    return this;
  }

  /**
   * Optional but strongly recommended to be provided for the best service experience.
   *
   * If update_job_fields is provided, only the specified fields in job are updated. Otherwise all
   * the fields are updated.
   *
   * A field mask to restrict the fields that are updated. Valid values are:
   *
   * * jobTitle * employmentTypes * description * applicationUrls * applicationEmailList *
   * applicationInstruction * responsibilities * qualifications * educationLevels * level *
   * department * startDate * endDate * compensationInfo * incentives * languageCode * benefits *
   * expireTime * customAttributes * visibility * publishDate * promotionValue * locations * region
   * * expiryDate (deprecated) * filterableCustomFields (deprecated) * unindexedCustomFields
   * (deprecated)
   * @return value or {@code null} for none
   */
  public String getUpdateJobFields() {
    return updateJobFields;
  }

  /**
   * Optional but strongly recommended to be provided for the best service experience.
   *
   * If update_job_fields is provided, only the specified fields in job are updated. Otherwise all
   * the fields are updated.
   *
   * A field mask to restrict the fields that are updated. Valid values are:
   *
   * * jobTitle * employmentTypes * description * applicationUrls * applicationEmailList *
   * applicationInstruction * responsibilities * qualifications * educationLevels * level *
   * department * startDate * endDate * compensationInfo * incentives * languageCode * benefits *
   * expireTime * customAttributes * visibility * publishDate * promotionValue * locations * region
   * * expiryDate (deprecated) * filterableCustomFields (deprecated) * unindexedCustomFields
   * (deprecated)
   * @param updateJobFields updateJobFields or {@code null} for none
   */
  public UpdateJobRequest setUpdateJobFields(String updateJobFields) {
    this.updateJobFields = updateJobFields;
    return this;
  }

  @Override
  public UpdateJobRequest set(String fieldName, Object value) {
    return (UpdateJobRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateJobRequest clone() {
    return (UpdateJobRequest) super.clone();
  }

}
