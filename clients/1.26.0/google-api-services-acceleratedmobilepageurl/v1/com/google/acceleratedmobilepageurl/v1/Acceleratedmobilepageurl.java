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

package com.google.acceleratedmobilepageurl.v1;

/**
 * Service definition for Acceleratedmobilepageurl (v1).
 *
 * <p>
 * Retrieves the list of AMP URLs (and equivalent AMP Cache URLs) for a given list of public URL(s).

 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/amp/cache/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AcceleratedmobilepageurlRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Acceleratedmobilepageurl extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.26.0-SNAPSHOT of the Accelerated Mobile Pages (AMP) URL API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://acceleratedmobilepageurl.googleapis.com/";

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
  public Acceleratedmobilepageurl(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Acceleratedmobilepageurl(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the AmpUrls collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Acceleratedmobilepageurl acceleratedmobilepageurl = new Acceleratedmobilepageurl(...);}
   *   {@code Acceleratedmobilepageurl.AmpUrls.List request = acceleratedmobilepageurl.ampUrls().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public AmpUrls ampUrls() {
    return new AmpUrls();
  }

  /**
   * The "ampUrls" collection of methods.
   */
  public class AmpUrls {

    /**
     * Returns AMP URL(s) and equivalent [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
     *
     * Create a request for the method "ampUrls.batchGet".
     *
     * This request holds the parameters needed by the acceleratedmobilepageurl server.  After setting
     * any optional parameters, call the {@link BatchGet#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.acceleratedmobilepageurl.v1.model.BatchGetAmpUrlsRequest}
     * @return the request
     */
    public BatchGet batchGet(com.google.acceleratedmobilepageurl.v1.model.BatchGetAmpUrlsRequest content) throws java.io.IOException {
      BatchGet result = new BatchGet(content);
      initialize(result);
      return result;
    }

    public class BatchGet extends AcceleratedmobilepageurlRequest<com.google.acceleratedmobilepageurl.v1.model.BatchGetAmpUrlsResponse> {

      private static final String REST_PATH = "v1/ampUrls:batchGet";

      /**
       * Returns AMP URL(s) and equivalent [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format).
       *
       * Create a request for the method "ampUrls.batchGet".
       *
       * This request holds the parameters needed by the the acceleratedmobilepageurl server.  After
       * setting any optional parameters, call the {@link BatchGet#execute()} method to invoke the
       * remote operation. <p> {@link
       * BatchGet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.acceleratedmobilepageurl.v1.model.BatchGetAmpUrlsRequest}
       * @since 1.13
       */
      protected BatchGet(com.google.acceleratedmobilepageurl.v1.model.BatchGetAmpUrlsRequest content) {
        super(Acceleratedmobilepageurl.this, "POST", REST_PATH, content, com.google.acceleratedmobilepageurl.v1.model.BatchGetAmpUrlsResponse.class);
      }

      @Override
      public BatchGet set$Xgafv(java.lang.String $Xgafv) {
        return (BatchGet) super.set$Xgafv($Xgafv);
      }

      @Override
      public BatchGet setAccessToken(java.lang.String accessToken) {
        return (BatchGet) super.setAccessToken(accessToken);
      }

      @Override
      public BatchGet setAlt(java.lang.String alt) {
        return (BatchGet) super.setAlt(alt);
      }

      @Override
      public BatchGet setCallback(java.lang.String callback) {
        return (BatchGet) super.setCallback(callback);
      }

      @Override
      public BatchGet setFields(java.lang.String fields) {
        return (BatchGet) super.setFields(fields);
      }

      @Override
      public BatchGet setKey(java.lang.String key) {
        return (BatchGet) super.setKey(key);
      }

      @Override
      public BatchGet setOauthToken(java.lang.String oauthToken) {
        return (BatchGet) super.setOauthToken(oauthToken);
      }

      @Override
      public BatchGet setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (BatchGet) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public BatchGet setQuotaUser(java.lang.String quotaUser) {
        return (BatchGet) super.setQuotaUser(quotaUser);
      }

      @Override
      public BatchGet setUploadType(java.lang.String uploadType) {
        return (BatchGet) super.setUploadType(uploadType);
      }

      @Override
      public BatchGet setUploadProtocol(java.lang.String uploadProtocol) {
        return (BatchGet) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public BatchGet set(String parameterName, Object value) {
        return (BatchGet) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Acceleratedmobilepageurl}.
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

    /** Builds a new instance of {@link Acceleratedmobilepageurl}. */
    @Override
    public Acceleratedmobilepageurl build() {
      return new Acceleratedmobilepageurl(this);
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
     * Set the {@link AcceleratedmobilepageurlRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAcceleratedmobilepageurlRequestInitializer(
        AcceleratedmobilepageurlRequestInitializer acceleratedmobilepageurlRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(acceleratedmobilepageurlRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
