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

package com.google.books.model;

/**
 * Model definition for Discoveryclusters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Discoveryclusters extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Clusters> clusters;

  static {
    // hack to force ProGuard to consider Clusters used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Clusters.class);
  }

  /**
   * Resorce type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalClusters;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Clusters> getClusters() {
    return clusters;
  }

  /**
   * @param clusters clusters or {@code null} for none
   */
  public Discoveryclusters setClusters(java.util.List<Clusters> clusters) {
    this.clusters = clusters;
    return this;
  }

  /**
   * Resorce type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resorce type.
   * @param kind kind or {@code null} for none
   */
  public Discoveryclusters setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalClusters() {
    return totalClusters;
  }

  /**
   * @param totalClusters totalClusters or {@code null} for none
   */
  public Discoveryclusters setTotalClusters(java.lang.Integer totalClusters) {
    this.totalClusters = totalClusters;
    return this;
  }

  @Override
  public Discoveryclusters set(String fieldName, Object value) {
    return (Discoveryclusters) super.set(fieldName, value);
  }

  @Override
  public Discoveryclusters clone() {
    return (Discoveryclusters) super.clone();
  }

  /**
   * Model definition for DiscoveryclustersClusters.
   */
  public static final class Clusters extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key("banner_with_content_container")
    private BannerWithContentContainer bannerWithContentContainer;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String subTitle;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer totalVolumes;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String uid;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Volume> volumes;

    /**
     * @return value or {@code null} for none
     */
    public BannerWithContentContainer getBannerWithContentContainer() {
      return bannerWithContentContainer;
    }

    /**
     * @param bannerWithContentContainer bannerWithContentContainer or {@code null} for none
     */
    public Clusters setBannerWithContentContainer(BannerWithContentContainer bannerWithContentContainer) {
      this.bannerWithContentContainer = bannerWithContentContainer;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSubTitle() {
      return subTitle;
    }

    /**
     * @param subTitle subTitle or {@code null} for none
     */
    public Clusters setSubTitle(java.lang.String subTitle) {
      this.subTitle = subTitle;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle() {
      return title;
    }

    /**
     * @param title title or {@code null} for none
     */
    public Clusters setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getTotalVolumes() {
      return totalVolumes;
    }

    /**
     * @param totalVolumes totalVolumes or {@code null} for none
     */
    public Clusters setTotalVolumes(java.lang.Integer totalVolumes) {
      this.totalVolumes = totalVolumes;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUid() {
      return uid;
    }

    /**
     * @param uid uid or {@code null} for none
     */
    public Clusters setUid(java.lang.String uid) {
      this.uid = uid;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<Volume> getVolumes() {
      return volumes;
    }

    /**
     * @param volumes volumes or {@code null} for none
     */
    public Clusters setVolumes(java.util.List<Volume> volumes) {
      this.volumes = volumes;
      return this;
    }

    @Override
    public Clusters set(String fieldName, Object value) {
      return (Clusters) super.set(fieldName, value);
    }

    @Override
    public Clusters clone() {
      return (Clusters) super.clone();
    }

    /**
     * Model definition for DiscoveryclustersClustersBannerWithContentContainer.
     */
    public static final class BannerWithContentContainer extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String fillColorArgb;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String imageUrl;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String maskColorArgb;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String moreButtonText;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String moreButtonUrl;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String textColorArgb;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getFillColorArgb() {
        return fillColorArgb;
      }

      /**
       * @param fillColorArgb fillColorArgb or {@code null} for none
       */
      public BannerWithContentContainer setFillColorArgb(java.lang.String fillColorArgb) {
        this.fillColorArgb = fillColorArgb;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getImageUrl() {
        return imageUrl;
      }

      /**
       * @param imageUrl imageUrl or {@code null} for none
       */
      public BannerWithContentContainer setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getMaskColorArgb() {
        return maskColorArgb;
      }

      /**
       * @param maskColorArgb maskColorArgb or {@code null} for none
       */
      public BannerWithContentContainer setMaskColorArgb(java.lang.String maskColorArgb) {
        this.maskColorArgb = maskColorArgb;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getMoreButtonText() {
        return moreButtonText;
      }

      /**
       * @param moreButtonText moreButtonText or {@code null} for none
       */
      public BannerWithContentContainer setMoreButtonText(java.lang.String moreButtonText) {
        this.moreButtonText = moreButtonText;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getMoreButtonUrl() {
        return moreButtonUrl;
      }

      /**
       * @param moreButtonUrl moreButtonUrl or {@code null} for none
       */
      public BannerWithContentContainer setMoreButtonUrl(java.lang.String moreButtonUrl) {
        this.moreButtonUrl = moreButtonUrl;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getTextColorArgb() {
        return textColorArgb;
      }

      /**
       * @param textColorArgb textColorArgb or {@code null} for none
       */
      public BannerWithContentContainer setTextColorArgb(java.lang.String textColorArgb) {
        this.textColorArgb = textColorArgb;
        return this;
      }

      @Override
      public BannerWithContentContainer set(String fieldName, Object value) {
        return (BannerWithContentContainer) super.set(fieldName, value);
      }

      @Override
      public BannerWithContentContainer clone() {
        return (BannerWithContentContainer) super.clone();
      }

    }
  }

}
