package org.nic.Index.service.impl;

import java.util.Date;

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
	
//	public int getVatRegistered() {
//		return regdDealerRepository.countVatRegistrations();
//	}
//	public int getVatTransferred() {
//		return regdDealerRepository.countVatTransferred();
//	}
//	public int getVatCancelled() {
//		return regdDealerRepository.countVatCancelled();
//	}
	
	public RegdDealerSummaryDTO getVatSummary() {
        return regdDealerRepository.getVatSummary();
    }
	public int getCformCount() {
		return cformRequestRepository.CountCform();
	}
	public int getCformIssued() {
		return cformIssuedRepository.CountCformIssue();
		
	}
	public Long getInvoiceRequest() {
		return invoiceRequestRepository.countInvoiceRequest();
	}
//	public Date getLogDate() {
//		return regdDealerRepository.minLogDate();
//	}
	public Date getRequestDate() {
		return cformRequestRepository.MinRequestDt();
	}
	public Date getIssuedDate() {
		return cformIssuedRepository.IssuedDate();
	}
	public Date getInvoiceDate() {
		return invoiceRequestRepository.InvoiceDate();
	}
}
