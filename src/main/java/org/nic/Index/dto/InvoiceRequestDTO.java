package org.nic.Index.dto;

import java.util.Date;

public class InvoiceRequestDTO {
	private Long InvoiceRequest;
	private Date InvoiceDate;
	
	public InvoiceRequestDTO(){
		
	}
	public InvoiceRequestDTO(Long invoiceRequest, Date invoiceDate) {
		this.InvoiceRequest = invoiceRequest;
		this.InvoiceDate = invoiceDate;
	}
	public Long getInvoiceRequest() {
		return InvoiceRequest;
	}
	public void setInvoiceRequest(Long invoiceRequest) {
		this.InvoiceRequest = invoiceRequest;
	}
	public Date getInvoiceDate() {
		return InvoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.InvoiceDate = invoiceDate;
	}
	
	
}
