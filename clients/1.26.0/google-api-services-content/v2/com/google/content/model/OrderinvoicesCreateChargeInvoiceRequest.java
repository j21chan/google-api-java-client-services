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

package com.google.content.model;

/**
 * Model definition for OrderinvoicesCreateChargeInvoiceRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderinvoicesCreateChargeInvoiceRequest extends com.google.api.client.json.GenericJson {

  /**
   * [required] The ID of the invoice.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceId;

  /**
   * [required] Invoice summary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InvoiceSummary invoiceSummary;

  /**
   * [required] Invoice details per line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ShipmentInvoiceLineItemInvoice> lineItemInvoices;

  /**
   * [required] The ID of the operation, unique across all operations for a given order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * [required] ID of the shipment group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shipmentGroupId;

  /**
   * [required] The ID of the invoice.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceId() {
    return invoiceId;
  }

  /**
   * [required] The ID of the invoice.
   * @param invoiceId invoiceId or {@code null} for none
   */
  public OrderinvoicesCreateChargeInvoiceRequest setInvoiceId(java.lang.String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * [required] Invoice summary.
   * @return value or {@code null} for none
   */
  public InvoiceSummary getInvoiceSummary() {
    return invoiceSummary;
  }

  /**
   * [required] Invoice summary.
   * @param invoiceSummary invoiceSummary or {@code null} for none
   */
  public OrderinvoicesCreateChargeInvoiceRequest setInvoiceSummary(InvoiceSummary invoiceSummary) {
    this.invoiceSummary = invoiceSummary;
    return this;
  }

  /**
   * [required] Invoice details per line item.
   * @return value or {@code null} for none
   */
  public java.util.List<ShipmentInvoiceLineItemInvoice> getLineItemInvoices() {
    return lineItemInvoices;
  }

  /**
   * [required] Invoice details per line item.
   * @param lineItemInvoices lineItemInvoices or {@code null} for none
   */
  public OrderinvoicesCreateChargeInvoiceRequest setLineItemInvoices(java.util.List<ShipmentInvoiceLineItemInvoice> lineItemInvoices) {
    this.lineItemInvoices = lineItemInvoices;
    return this;
  }

  /**
   * [required] The ID of the operation, unique across all operations for a given order.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * [required] The ID of the operation, unique across all operations for a given order.
   * @param operationId operationId or {@code null} for none
   */
  public OrderinvoicesCreateChargeInvoiceRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * [required] ID of the shipment group.
   * @return value or {@code null} for none
   */
  public java.lang.String getShipmentGroupId() {
    return shipmentGroupId;
  }

  /**
   * [required] ID of the shipment group.
   * @param shipmentGroupId shipmentGroupId or {@code null} for none
   */
  public OrderinvoicesCreateChargeInvoiceRequest setShipmentGroupId(java.lang.String shipmentGroupId) {
    this.shipmentGroupId = shipmentGroupId;
    return this;
  }

  @Override
  public OrderinvoicesCreateChargeInvoiceRequest set(String fieldName, Object value) {
    return (OrderinvoicesCreateChargeInvoiceRequest) super.set(fieldName, value);
  }

  @Override
  public OrderinvoicesCreateChargeInvoiceRequest clone() {
    return (OrderinvoicesCreateChargeInvoiceRequest) super.clone();
  }

}
