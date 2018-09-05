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

package com.google.storage.model;

/**
 * A bucket.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Bucket extends com.google.api.client.json.GenericJson {

  /**
   * Access controls on the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BucketAccessControl> acl;

  /**
   * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Cors> cors;

  static {
    // hack to force ProGuard to consider Cors used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Cors.class);
  }

  /**
   * Default access controls to apply to new objects when no ACL is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ObjectAccessControl> defaultObjectAcl;

  /**
   * HTTP 1.1 Entity tag for the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID of the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The kind of item this is. For buckets, this is always storage#bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The bucket's lifecycle configuration. See object lifecycle management for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Lifecycle lifecycle;

  /**
   * The location of the bucket. Object data for objects in the bucket resides in physical storage
   * within this region. Typical values are US and EU. Defaults to US. See the developer's guide for
   * the authoritative list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The bucket's logging configuration, which defines the destination bucket and optional name
   * prefix for the current bucket's logs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Logging logging;

  /**
   * The metadata generation of this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long metageneration;

  /**
   * The name of the bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The owner of the bucket. This is always the project team's owner group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Owner owner;

  /**
   * The URI of this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The bucket's storage class. This defines how objects in the bucket are stored and determines
   * the SLA and the cost of storage. Typical values are STANDARD and DURABLE_REDUCED_AVAILABILITY.
   * Defaults to STANDARD. See the developer's guide for the authoritative list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageClass;

  /**
   * Creation time of the bucket in RFC 3339 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime timeCreated;

  /**
   * The bucket's versioning configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Versioning versioning;

  /**
   * The bucket's website configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Website website;

  /**
   * Access controls on the bucket.
   * @return value or {@code null} for none
   */
  public java.util.List<BucketAccessControl> getAcl() {
    return acl;
  }

  /**
   * Access controls on the bucket.
   * @param acl acl or {@code null} for none
   */
  public Bucket setAcl(java.util.List<BucketAccessControl> acl) {
    this.acl = acl;
    return this;
  }

  /**
   * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
   * @return value or {@code null} for none
   */
  public java.util.List<Cors> getCors() {
    return cors;
  }

  /**
   * The bucket's Cross-Origin Resource Sharing (CORS) configuration.
   * @param cors cors or {@code null} for none
   */
  public Bucket setCors(java.util.List<Cors> cors) {
    this.cors = cors;
    return this;
  }

  /**
   * Default access controls to apply to new objects when no ACL is provided.
   * @return value or {@code null} for none
   */
  public java.util.List<ObjectAccessControl> getDefaultObjectAcl() {
    return defaultObjectAcl;
  }

  /**
   * Default access controls to apply to new objects when no ACL is provided.
   * @param defaultObjectAcl defaultObjectAcl or {@code null} for none
   */
  public Bucket setDefaultObjectAcl(java.util.List<ObjectAccessControl> defaultObjectAcl) {
    this.defaultObjectAcl = defaultObjectAcl;
    return this;
  }

  /**
   * HTTP 1.1 Entity tag for the bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * HTTP 1.1 Entity tag for the bucket.
   * @param etag etag or {@code null} for none
   */
  public Bucket setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID of the bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the bucket.
   * @param id id or {@code null} for none
   */
  public Bucket setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The kind of item this is. For buckets, this is always storage#bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For buckets, this is always storage#bucket.
   * @param kind kind or {@code null} for none
   */
  public Bucket setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The bucket's lifecycle configuration. See object lifecycle management for more information.
   * @return value or {@code null} for none
   */
  public Lifecycle getLifecycle() {
    return lifecycle;
  }

  /**
   * The bucket's lifecycle configuration. See object lifecycle management for more information.
   * @param lifecycle lifecycle or {@code null} for none
   */
  public Bucket setLifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * The location of the bucket. Object data for objects in the bucket resides in physical storage
   * within this region. Typical values are US and EU. Defaults to US. See the developer's guide for
   * the authoritative list.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The location of the bucket. Object data for objects in the bucket resides in physical storage
   * within this region. Typical values are US and EU. Defaults to US. See the developer's guide for
   * the authoritative list.
   * @param location location or {@code null} for none
   */
  public Bucket setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The bucket's logging configuration, which defines the destination bucket and optional name
   * prefix for the current bucket's logs.
   * @return value or {@code null} for none
   */
  public Logging getLogging() {
    return logging;
  }

  /**
   * The bucket's logging configuration, which defines the destination bucket and optional name
   * prefix for the current bucket's logs.
   * @param logging logging or {@code null} for none
   */
  public Bucket setLogging(Logging logging) {
    this.logging = logging;
    return this;
  }

  /**
   * The metadata generation of this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMetageneration() {
    return metageneration;
  }

  /**
   * The metadata generation of this bucket.
   * @param metageneration metageneration or {@code null} for none
   */
  public Bucket setMetageneration(java.lang.Long metageneration) {
    this.metageneration = metageneration;
    return this;
  }

  /**
   * The name of the bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the bucket.
   * @param name name or {@code null} for none
   */
  public Bucket setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The owner of the bucket. This is always the project team's owner group.
   * @return value or {@code null} for none
   */
  public Owner getOwner() {
    return owner;
  }

  /**
   * The owner of the bucket. This is always the project team's owner group.
   * @param owner owner or {@code null} for none
   */
  public Bucket setOwner(Owner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The URI of this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The URI of this bucket.
   * @param selfLink selfLink or {@code null} for none
   */
  public Bucket setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The bucket's storage class. This defines how objects in the bucket are stored and determines
   * the SLA and the cost of storage. Typical values are STANDARD and DURABLE_REDUCED_AVAILABILITY.
   * Defaults to STANDARD. See the developer's guide for the authoritative list.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageClass() {
    return storageClass;
  }

  /**
   * The bucket's storage class. This defines how objects in the bucket are stored and determines
   * the SLA and the cost of storage. Typical values are STANDARD and DURABLE_REDUCED_AVAILABILITY.
   * Defaults to STANDARD. See the developer's guide for the authoritative list.
   * @param storageClass storageClass or {@code null} for none
   */
  public Bucket setStorageClass(java.lang.String storageClass) {
    this.storageClass = storageClass;
    return this;
  }

  /**
   * Creation time of the bucket in RFC 3339 format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getTimeCreated() {
    return timeCreated;
  }

  /**
   * Creation time of the bucket in RFC 3339 format.
   * @param timeCreated timeCreated or {@code null} for none
   */
  public Bucket setTimeCreated(com.google.api.client.util.DateTime timeCreated) {
    this.timeCreated = timeCreated;
    return this;
  }

  /**
   * The bucket's versioning configuration.
   * @return value or {@code null} for none
   */
  public Versioning getVersioning() {
    return versioning;
  }

  /**
   * The bucket's versioning configuration.
   * @param versioning versioning or {@code null} for none
   */
  public Bucket setVersioning(Versioning versioning) {
    this.versioning = versioning;
    return this;
  }

  /**
   * The bucket's website configuration.
   * @return value or {@code null} for none
   */
  public Website getWebsite() {
    return website;
  }

  /**
   * The bucket's website configuration.
   * @param website website or {@code null} for none
   */
  public Bucket setWebsite(Website website) {
    this.website = website;
    return this;
  }

  @Override
  public Bucket set(String fieldName, Object value) {
    return (Bucket) super.set(fieldName, value);
  }

  @Override
  public Bucket clone() {
    return (Bucket) super.clone();
  }

  /**
   * Model definition for BucketCors.
   */
  public static final class Cors extends com.google.api.client.json.GenericJson {

    /**
     * The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight
     * responses.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer maxAgeSeconds;

    /**
     * The list of HTTP methods on which to include CORS response headers: GET, OPTIONS, POST, etc.
     * Note, "*" is permitted in the list of methods, and means "any method".
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> method;

    /**
     * The list of Origins eligible to receive CORS response headers. Note: "*" is permitted in the
     * list of origins, and means "any Origin".
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> origin;

    /**
     * The list of HTTP headers other than the simple response headers to give permission for the
     * user-agent to share across domains.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> responseHeader;

    /**
     * The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight
     * responses.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getMaxAgeSeconds() {
      return maxAgeSeconds;
    }

    /**
     * The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight
     * responses.
     * @param maxAgeSeconds maxAgeSeconds or {@code null} for none
     */
    public Cors setMaxAgeSeconds(java.lang.Integer maxAgeSeconds) {
      this.maxAgeSeconds = maxAgeSeconds;
      return this;
    }

    /**
     * The list of HTTP methods on which to include CORS response headers: GET, OPTIONS, POST, etc.
     * Note, "*" is permitted in the list of methods, and means "any method".
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getMethod() {
      return method;
    }

    /**
     * The list of HTTP methods on which to include CORS response headers: GET, OPTIONS, POST, etc.
     * Note, "*" is permitted in the list of methods, and means "any method".
     * @param method method or {@code null} for none
     */
    public Cors setMethod(java.util.List<java.lang.String> method) {
      this.method = method;
      return this;
    }

    /**
     * The list of Origins eligible to receive CORS response headers. Note: "*" is permitted in the
     * list of origins, and means "any Origin".
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getOrigin() {
      return origin;
    }

    /**
     * The list of Origins eligible to receive CORS response headers. Note: "*" is permitted in the
     * list of origins, and means "any Origin".
     * @param origin origin or {@code null} for none
     */
    public Cors setOrigin(java.util.List<java.lang.String> origin) {
      this.origin = origin;
      return this;
    }

    /**
     * The list of HTTP headers other than the simple response headers to give permission for the
     * user-agent to share across domains.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getResponseHeader() {
      return responseHeader;
    }

    /**
     * The list of HTTP headers other than the simple response headers to give permission for the
     * user-agent to share across domains.
     * @param responseHeader responseHeader or {@code null} for none
     */
    public Cors setResponseHeader(java.util.List<java.lang.String> responseHeader) {
      this.responseHeader = responseHeader;
      return this;
    }

    @Override
    public Cors set(String fieldName, Object value) {
      return (Cors) super.set(fieldName, value);
    }

    @Override
    public Cors clone() {
      return (Cors) super.clone();
    }

  }

  /**
   * The bucket's lifecycle configuration. See object lifecycle management for more information.
   */
  public static final class Lifecycle extends com.google.api.client.json.GenericJson {

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under
     * which the action will be taken.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Rule> rule;

    static {
      // hack to force ProGuard to consider Rule used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Rule.class);
    }

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under
     * which the action will be taken.
     * @return value or {@code null} for none
     */
    public java.util.List<Rule> getRule() {
      return rule;
    }

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under
     * which the action will be taken.
     * @param rule rule or {@code null} for none
     */
    public Lifecycle setRule(java.util.List<Rule> rule) {
      this.rule = rule;
      return this;
    }

    @Override
    public Lifecycle set(String fieldName, Object value) {
      return (Lifecycle) super.set(fieldName, value);
    }

    @Override
    public Lifecycle clone() {
      return (Lifecycle) super.clone();
    }

    /**
     * Model definition for BucketLifecycleRule.
     */
    public static final class Rule extends com.google.api.client.json.GenericJson {

      /**
       * The action to take.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private Action action;

      /**
       * The condition(s) under which the action will be taken.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private Condition condition;

      /**
       * The action to take.
       * @return value or {@code null} for none
       */
      public Action getAction() {
        return action;
      }

      /**
       * The action to take.
       * @param action action or {@code null} for none
       */
      public Rule setAction(Action action) {
        this.action = action;
        return this;
      }

      /**
       * The condition(s) under which the action will be taken.
       * @return value or {@code null} for none
       */
      public Condition getCondition() {
        return condition;
      }

      /**
       * The condition(s) under which the action will be taken.
       * @param condition condition or {@code null} for none
       */
      public Rule setCondition(Condition condition) {
        this.condition = condition;
        return this;
      }

      @Override
      public Rule set(String fieldName, Object value) {
        return (Rule) super.set(fieldName, value);
      }

      @Override
      public Rule clone() {
        return (Rule) super.clone();
      }

      /**
       * The action to take.
       */
      public static final class Action extends com.google.api.client.json.GenericJson {

        /**
         * Type of the action. Currently only Delete is supported.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String type;

        /**
         * Type of the action. Currently only Delete is supported.
         * @return value or {@code null} for none
         */
        public java.lang.String getType() {
          return type;
        }

        /**
         * Type of the action. Currently only Delete is supported.
         * @param type type or {@code null} for none
         */
        public Action setType(java.lang.String type) {
          this.type = type;
          return this;
        }

        @Override
        public Action set(String fieldName, Object value) {
          return (Action) super.set(fieldName, value);
        }

        @Override
        public Action clone() {
          return (Action) super.clone();
        }

      }
      /**
       * The condition(s) under which the action will be taken.
       */
      public static final class Condition extends com.google.api.client.json.GenericJson {

        /**
         * Age of an object (in days). This condition is satisfied when an object reaches the specified
         * age.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Integer age;

        /**
         * A date in RFC 3339 format with only the date part, e.g. "2013-01-15". This condition is
         * satisfied when an object is created before midnight of the specified date in UTC.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private com.google.api.client.util.DateTime createdBefore;

        /**
         * Relevant only for versioned objects. If the value is true, this condition matches live objects;
         * if the value is false, it matches archived objects.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Boolean isLive;

        /**
         * Relevant only for versioned objects. If the value is N, this condition is satisfied when there
         * are at least N versions (including the live version) newer than this version of the object.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.Integer numNewerVersions;

        /**
         * Age of an object (in days). This condition is satisfied when an object reaches the specified
         * age.
         * @return value or {@code null} for none
         */
        public java.lang.Integer getAge() {
          return age;
        }

        /**
         * Age of an object (in days). This condition is satisfied when an object reaches the specified
         * age.
         * @param age age or {@code null} for none
         */
        public Condition setAge(java.lang.Integer age) {
          this.age = age;
          return this;
        }

        /**
         * A date in RFC 3339 format with only the date part, e.g. "2013-01-15". This condition is
         * satisfied when an object is created before midnight of the specified date in UTC.
         * @return value or {@code null} for none
         */
        public com.google.api.client.util.DateTime getCreatedBefore() {
          return createdBefore;
        }

        /**
         * A date in RFC 3339 format with only the date part, e.g. "2013-01-15". This condition is
         * satisfied when an object is created before midnight of the specified date in UTC.
         * @param createdBefore createdBefore or {@code null} for none
         */
        public Condition setCreatedBefore(com.google.api.client.util.DateTime createdBefore) {
          this.createdBefore = createdBefore;
          return this;
        }

        /**
         * Relevant only for versioned objects. If the value is true, this condition matches live objects;
         * if the value is false, it matches archived objects.
         * @return value or {@code null} for none
         */
        public java.lang.Boolean getIsLive() {
          return isLive;
        }

        /**
         * Relevant only for versioned objects. If the value is true, this condition matches live objects;
         * if the value is false, it matches archived objects.
         * @param isLive isLive or {@code null} for none
         */
        public Condition setIsLive(java.lang.Boolean isLive) {
          this.isLive = isLive;
          return this;
        }

        /**
         * Relevant only for versioned objects. If the value is N, this condition is satisfied when there
         * are at least N versions (including the live version) newer than this version of the object.
         * @return value or {@code null} for none
         */
        public java.lang.Integer getNumNewerVersions() {
          return numNewerVersions;
        }

        /**
         * Relevant only for versioned objects. If the value is N, this condition is satisfied when there
         * are at least N versions (including the live version) newer than this version of the object.
         * @param numNewerVersions numNewerVersions or {@code null} for none
         */
        public Condition setNumNewerVersions(java.lang.Integer numNewerVersions) {
          this.numNewerVersions = numNewerVersions;
          return this;
        }

        @Override
        public Condition set(String fieldName, Object value) {
          return (Condition) super.set(fieldName, value);
        }

        @Override
        public Condition clone() {
          return (Condition) super.clone();
        }

      }
    }
  }

  /**
   * The bucket's logging configuration, which defines the destination bucket and optional name prefix
   * for the current bucket's logs.
   */
  public static final class Logging extends com.google.api.client.json.GenericJson {

    /**
     * The destination bucket where the current bucket's logs should be placed.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String logBucket;

    /**
     * A prefix for log object names.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String logObjectPrefix;

    /**
     * The destination bucket where the current bucket's logs should be placed.
     * @return value or {@code null} for none
     */
    public java.lang.String getLogBucket() {
      return logBucket;
    }

    /**
     * The destination bucket where the current bucket's logs should be placed.
     * @param logBucket logBucket or {@code null} for none
     */
    public Logging setLogBucket(java.lang.String logBucket) {
      this.logBucket = logBucket;
      return this;
    }

    /**
     * A prefix for log object names.
     * @return value or {@code null} for none
     */
    public java.lang.String getLogObjectPrefix() {
      return logObjectPrefix;
    }

    /**
     * A prefix for log object names.
     * @param logObjectPrefix logObjectPrefix or {@code null} for none
     */
    public Logging setLogObjectPrefix(java.lang.String logObjectPrefix) {
      this.logObjectPrefix = logObjectPrefix;
      return this;
    }

    @Override
    public Logging set(String fieldName, Object value) {
      return (Logging) super.set(fieldName, value);
    }

    @Override
    public Logging clone() {
      return (Logging) super.clone();
    }

  }

  /**
   * The owner of the bucket. This is always the project team's owner group.
   */
  public static final class Owner extends com.google.api.client.json.GenericJson {

    /**
     * The entity, in the form group-groupId.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String entity;

    /**
     * The ID for the entity.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String entityId;

    /**
     * The entity, in the form group-groupId.
     * @return value or {@code null} for none
     */
    public java.lang.String getEntity() {
      return entity;
    }

    /**
     * The entity, in the form group-groupId.
     * @param entity entity or {@code null} for none
     */
    public Owner setEntity(java.lang.String entity) {
      this.entity = entity;
      return this;
    }

    /**
     * The ID for the entity.
     * @return value or {@code null} for none
     */
    public java.lang.String getEntityId() {
      return entityId;
    }

    /**
     * The ID for the entity.
     * @param entityId entityId or {@code null} for none
     */
    public Owner setEntityId(java.lang.String entityId) {
      this.entityId = entityId;
      return this;
    }

    @Override
    public Owner set(String fieldName, Object value) {
      return (Owner) super.set(fieldName, value);
    }

    @Override
    public Owner clone() {
      return (Owner) super.clone();
    }

  }

  /**
   * The bucket's versioning configuration.
   */
  public static final class Versioning extends com.google.api.client.json.GenericJson {

    /**
     * While set to true, versioning is fully enabled for this bucket.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean enabled;

    /**
     * While set to true, versioning is fully enabled for this bucket.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getEnabled() {
      return enabled;
    }

    /**
     * While set to true, versioning is fully enabled for this bucket.
     * @param enabled enabled or {@code null} for none
     */
    public Versioning setEnabled(java.lang.Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    @Override
    public Versioning set(String fieldName, Object value) {
      return (Versioning) super.set(fieldName, value);
    }

    @Override
    public Versioning clone() {
      return (Versioning) super.clone();
    }

  }

  /**
   * The bucket's website configuration.
   */
  public static final class Website extends com.google.api.client.json.GenericJson {

    /**
     * Behaves as the bucket's directory index where missing objects are treated as potential
     * directories.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String mainPageSuffix;

    /**
     * The custom object to return when a requested resource is not found.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String notFoundPage;

    /**
     * Behaves as the bucket's directory index where missing objects are treated as potential
     * directories.
     * @return value or {@code null} for none
     */
    public java.lang.String getMainPageSuffix() {
      return mainPageSuffix;
    }

    /**
     * Behaves as the bucket's directory index where missing objects are treated as potential
     * directories.
     * @param mainPageSuffix mainPageSuffix or {@code null} for none
     */
    public Website setMainPageSuffix(java.lang.String mainPageSuffix) {
      this.mainPageSuffix = mainPageSuffix;
      return this;
    }

    /**
     * The custom object to return when a requested resource is not found.
     * @return value or {@code null} for none
     */
    public java.lang.String getNotFoundPage() {
      return notFoundPage;
    }

    /**
     * The custom object to return when a requested resource is not found.
     * @param notFoundPage notFoundPage or {@code null} for none
     */
    public Website setNotFoundPage(java.lang.String notFoundPage) {
      this.notFoundPage = notFoundPage;
      return this;
    }

    @Override
    public Website set(String fieldName, Object value) {
      return (Website) super.set(fieldName, value);
    }

    @Override
    public Website clone() {
      return (Website) super.clone();
    }

  }
}
