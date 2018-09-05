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

package com.google.indexing.v3;

/**
 * Service definition for Indexing (v3).
 *
 * <p>
 * The Indexing API allows developers to share the life cycle of a Web Document with Google.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/search/apis/indexing-api/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link IndexingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Indexing extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.26.0-SNAPSHOT of the Indexing API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://indexing.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Indexing(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Indexing(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the UrlNotifications collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Indexing indexing = new Indexing(...);}
   *   {@code Indexing.UrlNotifications.List request = indexing.urlNotifications().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public UrlNotifications urlNotifications() {
    return new UrlNotifications();
  }

  /**
   * The "urlNotifications" collection of methods.
   */
  public class UrlNotifications {

    /**
     * Gets metadata about a Web Document. This method can _only_ be used to query URLs that were
     * previously seen in successful Indexing API notifications. Includes the latest `UrlNotification`
     * received via this API.
     *
     * Create a request for the method "urlNotifications.getMetadata".
     *
     * This request holds the parameters needed by the indexing server.  After setting any optional
     * parameters, call the {@link GetMetadata#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public GetMetadata getMetadata() throws java.io.IOException {
      GetMetadata result = new GetMetadata();
      initialize(result);
      return result;
    }

    public class GetMetadata extends IndexingRequest<com.google.indexing.v3.model.UrlNotificationMetadata> {

      private static final String REST_PATH = "v3/urlNotifications/metadata";

      /**
       * Gets metadata about a Web Document. This method can _only_ be used to query URLs that were
       * previously seen in successful Indexing API notifications. Includes the latest `UrlNotification`
       * received via this API.
       *
       * Create a request for the method "urlNotifications.getMetadata".
       *
       * This request holds the parameters needed by the the indexing server.  After setting any
       * optional parameters, call the {@link GetMetadata#execute()} method to invoke the remote
       * operation. <p> {@link
       * GetMetadata#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected GetMetadata() {
        super(Indexing.this, "GET", REST_PATH, null, com.google.indexing.v3.model.UrlNotificationMetadata.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetMetadata set$Xgafv(java.lang.String $Xgafv) {
        return (GetMetadata) super.set$Xgafv($Xgafv);
      }

      @Override
      public GetMetadata setAccessToken(java.lang.String accessToken) {
        return (GetMetadata) super.setAccessToken(accessToken);
      }

      @Override
      public GetMetadata setAlt(java.lang.String alt) {
        return (GetMetadata) super.setAlt(alt);
      }

      @Override
      public GetMetadata setCallback(java.lang.String callback) {
        return (GetMetadata) super.setCallback(callback);
      }

      @Override
      public GetMetadata setFields(java.lang.String fields) {
        return (GetMetadata) super.setFields(fields);
      }

      @Override
      public GetMetadata setKey(java.lang.String key) {
        return (GetMetadata) super.setKey(key);
      }

      @Override
      public GetMetadata setOauthToken(java.lang.String oauthToken) {
        return (GetMetadata) super.setOauthToken(oauthToken);
      }

      @Override
      public GetMetadata setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetMetadata) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetMetadata setQuotaUser(java.lang.String quotaUser) {
        return (GetMetadata) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetMetadata setUploadType(java.lang.String uploadType) {
        return (GetMetadata) super.setUploadType(uploadType);
      }

      @Override
      public GetMetadata setUploadProtocol(java.lang.String uploadProtocol) {
        return (GetMetadata) super.setUploadProtocol(uploadProtocol);
      }

      /** URL that is being queried. */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /** URL that is being queried.
       */
      public java.lang.String getUrl() {
        return url;
      }

      /** URL that is being queried. */
      public GetMetadata setUrl(java.lang.String url) {
        this.url = url;
        return this;
      }

      @Override
      public GetMetadata set(String parameterName, Object value) {
        return (GetMetadata) super.set(parameterName, value);
      }
    }
    /**
     * Notifies that a URL has been updated or deleted.
     *
     * Create a request for the method "urlNotifications.publish".
     *
     * This request holds the parameters needed by the indexing server.  After setting any optional
     * parameters, call the {@link Publish#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.indexing.v3.model.UrlNotification}
     * @return the request
     */
    public Publish publish(com.google.indexing.v3.model.UrlNotification content) throws java.io.IOException {
      Publish result = new Publish(content);
      initialize(result);
      return result;
    }

    public class Publish extends IndexingRequest<com.google.indexing.v3.model.PublishUrlNotificationResponse> {

      private static final String REST_PATH = "v3/urlNotifications:publish";

      /**
       * Notifies that a URL has been updated or deleted.
       *
       * Create a request for the method "urlNotifications.publish".
       *
       * This request holds the parameters needed by the the indexing server.  After setting any
       * optional parameters, call the {@link Publish#execute()} method to invoke the remote operation.
       * <p> {@link
       * Publish#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.indexing.v3.model.UrlNotification}
       * @since 1.13
       */
      protected Publish(com.google.indexing.v3.model.UrlNotification content) {
        super(Indexing.this, "POST", REST_PATH, content, com.google.indexing.v3.model.PublishUrlNotificationResponse.class);
      }

      @Override
      public Publish set$Xgafv(java.lang.String $Xgafv) {
        return (Publish) super.set$Xgafv($Xgafv);
      }

      @Override
      public Publish setAccessToken(java.lang.String accessToken) {
        return (Publish) super.setAccessToken(accessToken);
      }

      @Override
      public Publish setAlt(java.lang.String alt) {
        return (Publish) super.setAlt(alt);
      }

      @Override
      public Publish setCallback(java.lang.String callback) {
        return (Publish) super.setCallback(callback);
      }

      @Override
      public Publish setFields(java.lang.String fields) {
        return (Publish) super.setFields(fields);
      }

      @Override
      public Publish setKey(java.lang.String key) {
        return (Publish) super.setKey(key);
      }

      @Override
      public Publish setOauthToken(java.lang.String oauthToken) {
        return (Publish) super.setOauthToken(oauthToken);
      }

      @Override
      public Publish setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Publish) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Publish setQuotaUser(java.lang.String quotaUser) {
        return (Publish) super.setQuotaUser(quotaUser);
      }

      @Override
      public Publish setUploadType(java.lang.String uploadType) {
        return (Publish) super.setUploadType(uploadType);
      }

      @Override
      public Publish setUploadProtocol(java.lang.String uploadProtocol) {
        return (Publish) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Publish set(String parameterName, Object value) {
        return (Publish) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Indexing}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Indexing}. */
    @Override
    public Indexing build() {
      return new Indexing(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link IndexingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setIndexingRequestInitializer(
        IndexingRequestInitializer indexingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(indexingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
