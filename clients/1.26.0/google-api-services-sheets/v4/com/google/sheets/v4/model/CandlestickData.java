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

package com.google.sheets.v4.model;

/**
 * The Candlestick chart data, each containing the low, open, close, and high values for a series.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CandlestickData extends com.google.api.client.json.GenericJson {

  /**
   * The range data (vertical axis) for the close/final value for each candle. This is the top of
   * the candle body.  If greater than the open value the candle will be filled.  Otherwise the
   * candle will be hollow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CandlestickSeries closeSeries;

  /**
   * The range data (vertical axis) for the high/maximum value for each candle. This is the top of
   * the candle's center line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CandlestickSeries highSeries;

  /**
   * The range data (vertical axis) for the low/minimum value for each candle. This is the bottom of
   * the candle's center line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CandlestickSeries lowSeries;

  /**
   * The range data (vertical axis) for the open/initial value for each candle. This is the bottom
   * of the candle body.  If less than the close value the candle will be filled.  Otherwise the
   * candle will be hollow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CandlestickSeries openSeries;

  /**
   * The range data (vertical axis) for the close/final value for each candle. This is the top of
   * the candle body.  If greater than the open value the candle will be filled.  Otherwise the
   * candle will be hollow.
   * @return value or {@code null} for none
   */
  public CandlestickSeries getCloseSeries() {
    return closeSeries;
  }

  /**
   * The range data (vertical axis) for the close/final value for each candle. This is the top of
   * the candle body.  If greater than the open value the candle will be filled.  Otherwise the
   * candle will be hollow.
   * @param closeSeries closeSeries or {@code null} for none
   */
  public CandlestickData setCloseSeries(CandlestickSeries closeSeries) {
    this.closeSeries = closeSeries;
    return this;
  }

  /**
   * The range data (vertical axis) for the high/maximum value for each candle. This is the top of
   * the candle's center line.
   * @return value or {@code null} for none
   */
  public CandlestickSeries getHighSeries() {
    return highSeries;
  }

  /**
   * The range data (vertical axis) for the high/maximum value for each candle. This is the top of
   * the candle's center line.
   * @param highSeries highSeries or {@code null} for none
   */
  public CandlestickData setHighSeries(CandlestickSeries highSeries) {
    this.highSeries = highSeries;
    return this;
  }

  /**
   * The range data (vertical axis) for the low/minimum value for each candle. This is the bottom of
   * the candle's center line.
   * @return value or {@code null} for none
   */
  public CandlestickSeries getLowSeries() {
    return lowSeries;
  }

  /**
   * The range data (vertical axis) for the low/minimum value for each candle. This is the bottom of
   * the candle's center line.
   * @param lowSeries lowSeries or {@code null} for none
   */
  public CandlestickData setLowSeries(CandlestickSeries lowSeries) {
    this.lowSeries = lowSeries;
    return this;
  }

  /**
   * The range data (vertical axis) for the open/initial value for each candle. This is the bottom
   * of the candle body.  If less than the close value the candle will be filled.  Otherwise the
   * candle will be hollow.
   * @return value or {@code null} for none
   */
  public CandlestickSeries getOpenSeries() {
    return openSeries;
  }

  /**
   * The range data (vertical axis) for the open/initial value for each candle. This is the bottom
   * of the candle body.  If less than the close value the candle will be filled.  Otherwise the
   * candle will be hollow.
   * @param openSeries openSeries or {@code null} for none
   */
  public CandlestickData setOpenSeries(CandlestickSeries openSeries) {
    this.openSeries = openSeries;
    return this;
  }

  @Override
  public CandlestickData set(String fieldName, Object value) {
    return (CandlestickData) super.set(fieldName, value);
  }

  @Override
  public CandlestickData clone() {
    return (CandlestickData) super.clone();
  }

}
