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

package com.google.vision.v1.model;

/**
 * Set of features pertaining to the image, computed by computer vision methods over safe-search
 * verticals (for example, adult, spoof, medical, violence).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SafeSearchAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Represents the adult content likelihood for the image. Adult content may contain elements such
   * as nudity, pornographic images or cartoons, or sexual activities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adult;

  /**
   * Likelihood that this is a medical image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String medical;

  /**
   * Likelihood that the request image contains racy content. Racy content may include (but is not
   * limited to) skimpy or sheer clothing, strategically covered nudity, lewd or provocative poses,
   * or close-ups of sensitive body areas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String racy;

  /**
   * Spoof likelihood. The likelihood that an modification was made to the image's canonical version
   * to make it appear funny or offensive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spoof;

  /**
   * Likelihood that this image contains violent content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String violence;

  /**
   * Represents the adult content likelihood for the image. Adult content may contain elements such
   * as nudity, pornographic images or cartoons, or sexual activities.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdult() {
    return adult;
  }

  /**
   * Represents the adult content likelihood for the image. Adult content may contain elements such
   * as nudity, pornographic images or cartoons, or sexual activities.
   * @param adult adult or {@code null} for none
   */
  public SafeSearchAnnotation setAdult(java.lang.String adult) {
    this.adult = adult;
    return this;
  }

  /**
   * Likelihood that this is a medical image.
   * @return value or {@code null} for none
   */
  public java.lang.String getMedical() {
    return medical;
  }

  /**
   * Likelihood that this is a medical image.
   * @param medical medical or {@code null} for none
   */
  public SafeSearchAnnotation setMedical(java.lang.String medical) {
    this.medical = medical;
    return this;
  }

  /**
   * Likelihood that the request image contains racy content. Racy content may include (but is not
   * limited to) skimpy or sheer clothing, strategically covered nudity, lewd or provocative poses,
   * or close-ups of sensitive body areas.
   * @return value or {@code null} for none
   */
  public java.lang.String getRacy() {
    return racy;
  }

  /**
   * Likelihood that the request image contains racy content. Racy content may include (but is not
   * limited to) skimpy or sheer clothing, strategically covered nudity, lewd or provocative poses,
   * or close-ups of sensitive body areas.
   * @param racy racy or {@code null} for none
   */
  public SafeSearchAnnotation setRacy(java.lang.String racy) {
    this.racy = racy;
    return this;
  }

  /**
   * Spoof likelihood. The likelihood that an modification was made to the image's canonical version
   * to make it appear funny or offensive.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpoof() {
    return spoof;
  }

  /**
   * Spoof likelihood. The likelihood that an modification was made to the image's canonical version
   * to make it appear funny or offensive.
   * @param spoof spoof or {@code null} for none
   */
  public SafeSearchAnnotation setSpoof(java.lang.String spoof) {
    this.spoof = spoof;
    return this;
  }

  /**
   * Likelihood that this image contains violent content.
   * @return value or {@code null} for none
   */
  public java.lang.String getViolence() {
    return violence;
  }

  /**
   * Likelihood that this image contains violent content.
   * @param violence violence or {@code null} for none
   */
  public SafeSearchAnnotation setViolence(java.lang.String violence) {
    this.violence = violence;
    return this;
  }

  @Override
  public SafeSearchAnnotation set(String fieldName, Object value) {
    return (SafeSearchAnnotation) super.set(fieldName, value);
  }

  @Override
  public SafeSearchAnnotation clone() {
    return (SafeSearchAnnotation) super.clone();
  }

}
