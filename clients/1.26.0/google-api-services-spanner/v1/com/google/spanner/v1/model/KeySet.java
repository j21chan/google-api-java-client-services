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

package com.google.spanner.v1.model;

/**
 * `KeySet` defines a collection of Cloud Spanner keys and/or key ranges. All the keys are expected
 * to be in the same table or index. The keys need not be sorted in any particular way.
 *
 * If the same key is specified multiple times in the set (for example if two ranges, two keys, or a
 * key and a range overlap), Cloud Spanner behaves as if the key were only specified once.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KeySet extends com.google.api.client.json.GenericJson {

  /**
   * For convenience `all` can be set to `true` to indicate that this `KeySet` matches all keys in
   * the table or index. Note that any keys specified in `keys` or `ranges` are only yielded once.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean all;

  /**
   * A list of specific keys. Entries in `keys` should have exactly as many elements as there are
   * columns in the primary or index key with which this `KeySet` is used.  Individual key values
   * are encoded as described here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.List<java.lang.Object>> keys;

  /**
   * A list of key ranges. See KeyRange for more information about key range specifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<KeyRange> ranges;

  /**
   * For convenience `all` can be set to `true` to indicate that this `KeySet` matches all keys in
   * the table or index. Note that any keys specified in `keys` or `ranges` are only yielded once.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAll() {
    return all;
  }

  /**
   * For convenience `all` can be set to `true` to indicate that this `KeySet` matches all keys in
   * the table or index. Note that any keys specified in `keys` or `ranges` are only yielded once.
   * @param all all or {@code null} for none
   */
  public KeySet setAll(java.lang.Boolean all) {
    this.all = all;
    return this;
  }

  /**
   * A list of specific keys. Entries in `keys` should have exactly as many elements as there are
   * columns in the primary or index key with which this `KeySet` is used.  Individual key values
   * are encoded as described here.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.List<java.lang.Object>> getKeys() {
    return keys;
  }

  /**
   * A list of specific keys. Entries in `keys` should have exactly as many elements as there are
   * columns in the primary or index key with which this `KeySet` is used.  Individual key values
   * are encoded as described here.
   * @param keys keys or {@code null} for none
   */
  public KeySet setKeys(java.util.List<java.util.List<java.lang.Object>> keys) {
    this.keys = keys;
    return this;
  }

  /**
   * A list of key ranges. See KeyRange for more information about key range specifications.
   * @return value or {@code null} for none
   */
  public java.util.List<KeyRange> getRanges() {
    return ranges;
  }

  /**
   * A list of key ranges. See KeyRange for more information about key range specifications.
   * @param ranges ranges or {@code null} for none
   */
  public KeySet setRanges(java.util.List<KeyRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  @Override
  public KeySet set(String fieldName, Object value) {
    return (KeySet) super.set(fieldName, value);
  }

  @Override
  public KeySet clone() {
    return (KeySet) super.clone();
  }

}
