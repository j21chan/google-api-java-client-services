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

package com.google.serviceuser.v1.model;

/**
 * Api is a light-weight descriptor for an API Interface.
 *
 * Interfaces are also described as "protocol buffer services" in some contexts, such as by the
 * "service" keyword in a .proto file, but they are different from API Services, which represent a
 * concrete implementation of an interface as opposed to simply a description of methods and
 * bindings. They are also sometimes simply referred to as "APIs" in other contexts, such as the
 * name of this message itself. See https://cloud.google.com/apis/design/glossary for detailed
 * terminology.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service User API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Api extends com.google.api.client.json.GenericJson {

  /**
   * The methods of this interface, in unspecified order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Method> methods;

  /**
   * Included interfaces. See Mixin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Mixin> mixins;

  /**
   * The fully qualified name of this interface, including package name followed by the interface's
   * simple name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Any metadata attached to the interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Option> options;

  /**
   * Source context for the protocol buffer service represented by this message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceContext sourceContext;

  /**
   * The source syntax of the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syntax;

  /**
   * A version string for this interface. If specified, must have the form `major-version.minor-
   * version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire
   * version field is empty, the major version is derived from the package name, as outlined below.
   * If the field is not empty, the version in the package name will be verified to be consistent
   * with what is provided here.
   *
   * The versioning schema uses [semantic versioning](http://semver.org) where the major version
   * number indicates a breaking change and the minor version an additive, non-breaking change. Both
   * version numbers are signals to users what to expect from different versions, and should be
   * carefully chosen based on the product plan.
   *
   * The major version is also reflected in the package name of the interface, which must end in
   * `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero
   * major versions must only be used for experimental, non-GA interfaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The methods of this interface, in unspecified order.
   * @return value or {@code null} for none
   */
  public java.util.List<Method> getMethods() {
    return methods;
  }

  /**
   * The methods of this interface, in unspecified order.
   * @param methods methods or {@code null} for none
   */
  public Api setMethods(java.util.List<Method> methods) {
    this.methods = methods;
    return this;
  }

  /**
   * Included interfaces. See Mixin.
   * @return value or {@code null} for none
   */
  public java.util.List<Mixin> getMixins() {
    return mixins;
  }

  /**
   * Included interfaces. See Mixin.
   * @param mixins mixins or {@code null} for none
   */
  public Api setMixins(java.util.List<Mixin> mixins) {
    this.mixins = mixins;
    return this;
  }

  /**
   * The fully qualified name of this interface, including package name followed by the interface's
   * simple name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The fully qualified name of this interface, including package name followed by the interface's
   * simple name.
   * @param name name or {@code null} for none
   */
  public Api setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Any metadata attached to the interface.
   * @return value or {@code null} for none
   */
  public java.util.List<Option> getOptions() {
    return options;
  }

  /**
   * Any metadata attached to the interface.
   * @param options options or {@code null} for none
   */
  public Api setOptions(java.util.List<Option> options) {
    this.options = options;
    return this;
  }

  /**
   * Source context for the protocol buffer service represented by this message.
   * @return value or {@code null} for none
   */
  public SourceContext getSourceContext() {
    return sourceContext;
  }

  /**
   * Source context for the protocol buffer service represented by this message.
   * @param sourceContext sourceContext or {@code null} for none
   */
  public Api setSourceContext(SourceContext sourceContext) {
    this.sourceContext = sourceContext;
    return this;
  }

  /**
   * The source syntax of the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyntax() {
    return syntax;
  }

  /**
   * The source syntax of the service.
   * @param syntax syntax or {@code null} for none
   */
  public Api setSyntax(java.lang.String syntax) {
    this.syntax = syntax;
    return this;
  }

  /**
   * A version string for this interface. If specified, must have the form `major-version.minor-
   * version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire
   * version field is empty, the major version is derived from the package name, as outlined below.
   * If the field is not empty, the version in the package name will be verified to be consistent
   * with what is provided here.
   *
   * The versioning schema uses [semantic versioning](http://semver.org) where the major version
   * number indicates a breaking change and the minor version an additive, non-breaking change. Both
   * version numbers are signals to users what to expect from different versions, and should be
   * carefully chosen based on the product plan.
   *
   * The major version is also reflected in the package name of the interface, which must end in
   * `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero
   * major versions must only be used for experimental, non-GA interfaces.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * A version string for this interface. If specified, must have the form `major-version.minor-
   * version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire
   * version field is empty, the major version is derived from the package name, as outlined below.
   * If the field is not empty, the version in the package name will be verified to be consistent
   * with what is provided here.
   *
   * The versioning schema uses [semantic versioning](http://semver.org) where the major version
   * number indicates a breaking change and the minor version an additive, non-breaking change. Both
   * version numbers are signals to users what to expect from different versions, and should be
   * carefully chosen based on the product plan.
   *
   * The major version is also reflected in the package name of the interface, which must end in
   * `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero
   * major versions must only be used for experimental, non-GA interfaces.
   * @param version version or {@code null} for none
   */
  public Api setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public Api set(String fieldName, Object value) {
    return (Api) super.set(fieldName, value);
  }

  @Override
  public Api clone() {
    return (Api) super.clone();
  }

}
