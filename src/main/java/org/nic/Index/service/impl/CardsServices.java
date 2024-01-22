package org.nic.Index.service.impl;

import java.util.Date;

import org.nic.Index.dto.CformIssuedDTO;
import org.nic.Index.dto.CformRequestDTO;
import org.nic.Index.dto.InvoiceRequestDTO;
import org.nic.Index.dto.RegdDealerSummaryDTO;
import org.nic.Index.repository.CformIssuedRepository;
import org.nic.Index.repository.CformRequestRepository;
import org.nic.Index.repository.InvoiceRequestRepository;
import org.nic.Index.repository.RegdDealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardsServices {
	@Autowired
	public RegdDealerRepository regdDealerRepository;
	@Autowired
	public CformRequestRepository cformRequestRepository;
	@Autowired
	public CformIssuedRepository cformIssuedRepository;
	@Autowired
	public InvoiceRequestRepository invoiceRequestRepository;

	public RegdDealerSummaryDTO getVatSummary() {
        return regdDealerRepository.getVatSummary();
    }
	
	public CformIssuedDTO getCformIssuedSummary() {
		return cformIssuedRepository.getCformIssuedSummary();
	}
	
	public CformRequestDTO getCformRequestSummary() {
		return cformRequestRepository.getCformRequestSummary();
	}
	
	public InvoiceRequestDTO getInvoiceRequestSummary() {
		return invoiceRequestRepository.getInvoiceRequestSummary();
	}

}
