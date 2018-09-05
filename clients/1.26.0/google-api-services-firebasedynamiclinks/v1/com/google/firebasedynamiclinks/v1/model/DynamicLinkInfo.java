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

package com.google.firebasedynamiclinks.v1.model;

/**
 * Information about a Dynamic Link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Dynamic Links API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DynamicLinkInfo extends com.google.api.client.json.GenericJson {

  /**
   * Parameters used for tracking. See all tracking parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnalyticsInfo analyticsInfo;

  /**
   * Android related information. See Android related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AndroidInfo androidInfo;

  /**
   * Desktop related information. See desktop related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DesktopInfo desktopInfo;

  /**
   * E.g. https://maps.app.goo.gl, https://maps.page.link, https://g.co/maps More examples can be
   * found in description of getNormalizedUriPrefix in
   * j/c/g/firebase/dynamiclinks/uri/DdlDomain.java
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domainUriPrefix;

  /**
   * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl [Learn
   * more](https://firebase.google.com/docs/dynamic-links/android/receive) on how to set up Dynamic
   * Link domain associated with your Firebase project.
   *
   * Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dynamicLinkDomain;

  /**
   * iOS related information. See iOS related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IosInfo iosInfo;

  /**
   * The link your app will open, You can specify any URL your app can handle. This link must be a
   * well-formatted URL, be properly URL-encoded, and use the HTTP or HTTPS scheme. See 'link'
   * parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-
   * manually).
   *
   * Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String link;

  /**
   * Information of navigation behavior of a Firebase Dynamic Links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NavigationInfo navigationInfo;

  /**
   * Parameters for social meta tag params. Used to set meta tag data for link previews on social
   * sites.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SocialMetaTagInfo socialMetaTagInfo;

  /**
   * Parameters used for tracking. See all tracking parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @return value or {@code null} for none
   */
  public AnalyticsInfo getAnalyticsInfo() {
    return analyticsInfo;
  }

  /**
   * Parameters used for tracking. See all tracking parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @param analyticsInfo analyticsInfo or {@code null} for none
   */
  public DynamicLinkInfo setAnalyticsInfo(AnalyticsInfo analyticsInfo) {
    this.analyticsInfo = analyticsInfo;
    return this;
  }

  /**
   * Android related information. See Android related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @return value or {@code null} for none
   */
  public AndroidInfo getAndroidInfo() {
    return androidInfo;
  }

  /**
   * Android related information. See Android related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @param androidInfo androidInfo or {@code null} for none
   */
  public DynamicLinkInfo setAndroidInfo(AndroidInfo androidInfo) {
    this.androidInfo = androidInfo;
    return this;
  }

  /**
   * Desktop related information. See desktop related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @return value or {@code null} for none
   */
  public DesktopInfo getDesktopInfo() {
    return desktopInfo;
  }

  /**
   * Desktop related information. See desktop related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @param desktopInfo desktopInfo or {@code null} for none
   */
  public DynamicLinkInfo setDesktopInfo(DesktopInfo desktopInfo) {
    this.desktopInfo = desktopInfo;
    return this;
  }

  /**
   * E.g. https://maps.app.goo.gl, https://maps.page.link, https://g.co/maps More examples can be
   * found in description of getNormalizedUriPrefix in
   * j/c/g/firebase/dynamiclinks/uri/DdlDomain.java
   * @return value or {@code null} for none
   */
  public java.lang.String getDomainUriPrefix() {
    return domainUriPrefix;
  }

  /**
   * E.g. https://maps.app.goo.gl, https://maps.page.link, https://g.co/maps More examples can be
   * found in description of getNormalizedUriPrefix in
   * j/c/g/firebase/dynamiclinks/uri/DdlDomain.java
   * @param domainUriPrefix domainUriPrefix or {@code null} for none
   */
  public DynamicLinkInfo setDomainUriPrefix(java.lang.String domainUriPrefix) {
    this.domainUriPrefix = domainUriPrefix;
    return this;
  }

  /**
   * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl [Learn
   * more](https://firebase.google.com/docs/dynamic-links/android/receive) on how to set up Dynamic
   * Link domain associated with your Firebase project.
   *
   * Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getDynamicLinkDomain() {
    return dynamicLinkDomain;
  }

  /**
   * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl [Learn
   * more](https://firebase.google.com/docs/dynamic-links/android/receive) on how to set up Dynamic
   * Link domain associated with your Firebase project.
   *
   * Required.
   * @param dynamicLinkDomain dynamicLinkDomain or {@code null} for none
   */
  public DynamicLinkInfo setDynamicLinkDomain(java.lang.String dynamicLinkDomain) {
    this.dynamicLinkDomain = dynamicLinkDomain;
    return this;
  }

  /**
   * iOS related information. See iOS related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @return value or {@code null} for none
   */
  public IosInfo getIosInfo() {
    return iosInfo;
  }

  /**
   * iOS related information. See iOS related parameters in the
   * [documentation](https://firebase.google.com/docs/dynamic-links/create-manually).
   * @param iosInfo iosInfo or {@code null} for none
   */
  public DynamicLinkInfo setIosInfo(IosInfo iosInfo) {
    this.iosInfo = iosInfo;
    return this;
  }

  /**
   * The link your app will open, You can specify any URL your app can handle. This link must be a
   * well-formatted URL, be properly URL-encoded, and use the HTTP or HTTPS scheme. See 'link'
   * parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-
   * manually).
   *
   * Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getLink() {
    return link;
  }

  /**
   * The link your app will open, You can specify any URL your app can handle. This link must be a
   * well-formatted URL, be properly URL-encoded, and use the HTTP or HTTPS scheme. See 'link'
   * parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-
   * manually).
   *
   * Required.
   * @param link link or {@code null} for none
   */
  public DynamicLinkInfo setLink(java.lang.String link) {
    this.link = link;
    return this;
  }

  /**
   * Information of navigation behavior of a Firebase Dynamic Links.
   * @return value or {@code null} for none
   */
  public NavigationInfo getNavigationInfo() {
    return navigationInfo;
  }

  /**
   * Information of navigation behavior of a Firebase Dynamic Links.
   * @param navigationInfo navigationInfo or {@code null} for none
   */
  public DynamicLinkInfo setNavigationInfo(NavigationInfo navigationInfo) {
    this.navigationInfo = navigationInfo;
    return this;
  }

  /**
   * Parameters for social meta tag params. Used to set meta tag data for link previews on social
   * sites.
   * @return value or {@code null} for none
   */
  public SocialMetaTagInfo getSocialMetaTagInfo() {
    return socialMetaTagInfo;
  }

  /**
   * Parameters for social meta tag params. Used to set meta tag data for link previews on social
   * sites.
   * @param socialMetaTagInfo socialMetaTagInfo or {@code null} for none
   */
  public DynamicLinkInfo setSocialMetaTagInfo(SocialMetaTagInfo socialMetaTagInfo) {
    this.socialMetaTagInfo = socialMetaTagInfo;
    return this;
  }

  @Override
  public DynamicLinkInfo set(String fieldName, Object value) {
    return (DynamicLinkInfo) super.set(fieldName, value);
  }

  @Override
  public DynamicLinkInfo clone() {
    return (DynamicLinkInfo) super.clone();
  }

}
