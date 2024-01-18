package org.nic.Index.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="df_invoice_online_new")
@Entity
public class InvoiceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long df_invoice_id;
    
    private Date invoice_date;

	public Date getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDf_invoice_id() {
		return df_invoice_id;
	}

	public void setDf_invoice_id(Long df_invoice_id) {
		this.df_invoice_id = df_invoice_id;
	}
    

}
