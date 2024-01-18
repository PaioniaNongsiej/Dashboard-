package org.nic.Index.repository;

import java.math.BigInteger;
import java.util.Date;

import org.nic.Index.model.InvoiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InvoiceRequestRepository extends JpaRepository<InvoiceRequest, Long> {
	@Query("SELECT count(ic.df_invoice_id) from InvoiceRequest ic")
	long countInvoiceRequest();
	@Query("SELECT min(ic.invoice_date) from InvoiceRequest ic")
	 Date InvoiceDate();
}
