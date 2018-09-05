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

package com.google.tagmanager.model;

/**
 * The result of reverting a trigger in a workspace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RevertTriggerResponse extends com.google.api.client.json.GenericJson {

  /**
   * Trigger as it appears in the latest container version since the last workspace synchronization
   * operation. If no trigger is present, that means the trigger was deleted in the latest container
   * version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Trigger trigger;

  /**
   * Trigger as it appears in the latest container version since the last workspace synchronization
   * operation. If no trigger is present, that means the trigger was deleted in the latest container
   * version.
   * @return value or {@code null} for none
   */
  public Trigger getTrigger() {
    return trigger;
  }

  /**
   * Trigger as it appears in the latest container version since the last workspace synchronization
   * operation. If no trigger is present, that means the trigger was deleted in the latest container
   * version.
   * @param trigger trigger or {@code null} for none
   */
  public RevertTriggerResponse setTrigger(Trigger trigger) {
    this.trigger = trigger;
    return this;
  }

  @Override
  public RevertTriggerResponse set(String fieldName, Object value) {
    return (RevertTriggerResponse) super.set(fieldName, value);
  }

  @Override
  public RevertTriggerResponse clone() {
    return (RevertTriggerResponse) super.clone();
  }

}
