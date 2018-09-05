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

package com.google.customsearch.model;

/**
 * Model definition for Query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the CustomSearch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Query extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer count;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cr;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cx;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dateRestrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disableCnTwTranslation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exactTerms;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String excludeTerms;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googleHost;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String highRange;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hq;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imgColorType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imgDominantColor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imgSize;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imgType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputEncoding;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkSite;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lowRange;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orTerms;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputEncoding;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relatedSite;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rights;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String safe;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchTerms;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String siteSearch;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String siteSearchFilter;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sort;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startPage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalResults;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * @param count count or {@code null} for none
   */
  public Query setCount(java.lang.Integer count) {
    this.count = count;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCr() {
    return cr;
  }

  /**
   * @param cr cr or {@code null} for none
   */
  public Query setCr(java.lang.String cr) {
    this.cr = cr;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCx() {
    return cx;
  }

  /**
   * @param cx cx or {@code null} for none
   */
  public Query setCx(java.lang.String cx) {
    this.cx = cx;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDateRestrict() {
    return dateRestrict;
  }

  /**
   * @param dateRestrict dateRestrict or {@code null} for none
   */
  public Query setDateRestrict(java.lang.String dateRestrict) {
    this.dateRestrict = dateRestrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisableCnTwTranslation() {
    return disableCnTwTranslation;
  }

  /**
   * @param disableCnTwTranslation disableCnTwTranslation or {@code null} for none
   */
  public Query setDisableCnTwTranslation(java.lang.String disableCnTwTranslation) {
    this.disableCnTwTranslation = disableCnTwTranslation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExactTerms() {
    return exactTerms;
  }

  /**
   * @param exactTerms exactTerms or {@code null} for none
   */
  public Query setExactTerms(java.lang.String exactTerms) {
    this.exactTerms = exactTerms;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExcludeTerms() {
    return excludeTerms;
  }

  /**
   * @param excludeTerms excludeTerms or {@code null} for none
   */
  public Query setExcludeTerms(java.lang.String excludeTerms) {
    this.excludeTerms = excludeTerms;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFileType() {
    return fileType;
  }

  /**
   * @param fileType fileType or {@code null} for none
   */
  public Query setFileType(java.lang.String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * @param filter filter or {@code null} for none
   */
  public Query setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGl() {
    return gl;
  }

  /**
   * @param gl gl or {@code null} for none
   */
  public Query setGl(java.lang.String gl) {
    this.gl = gl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGoogleHost() {
    return googleHost;
  }

  /**
   * @param googleHost googleHost or {@code null} for none
   */
  public Query setGoogleHost(java.lang.String googleHost) {
    this.googleHost = googleHost;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHighRange() {
    return highRange;
  }

  /**
   * @param highRange highRange or {@code null} for none
   */
  public Query setHighRange(java.lang.String highRange) {
    this.highRange = highRange;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHl() {
    return hl;
  }

  /**
   * @param hl hl or {@code null} for none
   */
  public Query setHl(java.lang.String hl) {
    this.hl = hl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHq() {
    return hq;
  }

  /**
   * @param hq hq or {@code null} for none
   */
  public Query setHq(java.lang.String hq) {
    this.hq = hq;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImgColorType() {
    return imgColorType;
  }

  /**
   * @param imgColorType imgColorType or {@code null} for none
   */
  public Query setImgColorType(java.lang.String imgColorType) {
    this.imgColorType = imgColorType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImgDominantColor() {
    return imgDominantColor;
  }

  /**
   * @param imgDominantColor imgDominantColor or {@code null} for none
   */
  public Query setImgDominantColor(java.lang.String imgDominantColor) {
    this.imgDominantColor = imgDominantColor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImgSize() {
    return imgSize;
  }

  /**
   * @param imgSize imgSize or {@code null} for none
   */
  public Query setImgSize(java.lang.String imgSize) {
    this.imgSize = imgSize;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImgType() {
    return imgType;
  }

  /**
   * @param imgType imgType or {@code null} for none
   */
  public Query setImgType(java.lang.String imgType) {
    this.imgType = imgType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInputEncoding() {
    return inputEncoding;
  }

  /**
   * @param inputEncoding inputEncoding or {@code null} for none
   */
  public Query setInputEncoding(java.lang.String inputEncoding) {
    this.inputEncoding = inputEncoding;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * @param language language or {@code null} for none
   */
  public Query setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkSite() {
    return linkSite;
  }

  /**
   * @param linkSite linkSite or {@code null} for none
   */
  public Query setLinkSite(java.lang.String linkSite) {
    this.linkSite = linkSite;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLowRange() {
    return lowRange;
  }

  /**
   * @param lowRange lowRange or {@code null} for none
   */
  public Query setLowRange(java.lang.String lowRange) {
    this.lowRange = lowRange;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOrTerms() {
    return orTerms;
  }

  /**
   * @param orTerms orTerms or {@code null} for none
   */
  public Query setOrTerms(java.lang.String orTerms) {
    this.orTerms = orTerms;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputEncoding() {
    return outputEncoding;
  }

  /**
   * @param outputEncoding outputEncoding or {@code null} for none
   */
  public Query setOutputEncoding(java.lang.String outputEncoding) {
    this.outputEncoding = outputEncoding;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRelatedSite() {
    return relatedSite;
  }

  /**
   * @param relatedSite relatedSite or {@code null} for none
   */
  public Query setRelatedSite(java.lang.String relatedSite) {
    this.relatedSite = relatedSite;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRights() {
    return rights;
  }

  /**
   * @param rights rights or {@code null} for none
   */
  public Query setRights(java.lang.String rights) {
    this.rights = rights;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSafe() {
    return safe;
  }

  /**
   * @param safe safe or {@code null} for none
   */
  public Query setSafe(java.lang.String safe) {
    this.safe = safe;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchTerms() {
    return searchTerms;
  }

  /**
   * @param searchTerms searchTerms or {@code null} for none
   */
  public Query setSearchTerms(java.lang.String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchType() {
    return searchType;
  }

  /**
   * @param searchType searchType or {@code null} for none
   */
  public Query setSearchType(java.lang.String searchType) {
    this.searchType = searchType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSiteSearch() {
    return siteSearch;
  }

  /**
   * @param siteSearch siteSearch or {@code null} for none
   */
  public Query setSiteSearch(java.lang.String siteSearch) {
    this.siteSearch = siteSearch;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSiteSearchFilter() {
    return siteSearchFilter;
  }

  /**
   * @param siteSearchFilter siteSearchFilter or {@code null} for none
   */
  public Query setSiteSearchFilter(java.lang.String siteSearchFilter) {
    this.siteSearchFilter = siteSearchFilter;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSort() {
    return sort;
  }

  /**
   * @param sort sort or {@code null} for none
   */
  public Query setSort(java.lang.String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * @param startIndex startIndex or {@code null} for none
   */
  public Query setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartPage() {
    return startPage;
  }

  /**
   * @param startPage startPage or {@code null} for none
   */
  public Query setStartPage(java.lang.Integer startPage) {
    this.startPage = startPage;
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
  public Query setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalResults() {
    return totalResults;
  }

  /**
   * @param totalResults totalResults or {@code null} for none
   */
  public Query setTotalResults(java.lang.Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  @Override
  public Query set(String fieldName, Object value) {
    return (Query) super.set(fieldName, value);
  }

  @Override
  public Query clone() {
    return (Query) super.clone();
  }

}
