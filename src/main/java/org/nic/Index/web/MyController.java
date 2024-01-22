package org.nic.Index.web;

import java.util.Date;

import org.nic.Index.dto.CformIssuedDTO;
import org.nic.Index.dto.CformRequestDTO;
import org.nic.Index.dto.InvoiceRequestDTO;
import org.nic.Index.dto.RegdDealerSummaryDTO;
import org.nic.Index.service.impl.CardsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@Autowired
	public CardsServices cardsServices;

	@GetMapping("/")
	public String showPage(Model model) {

		CformIssuedDTO IssuedSummary = cardsServices.getCformIssuedSummary();
		System.out.println("issued" + IssuedSummary.getIssuedDate());
		if (IssuedSummary != null) {
			model.addAttribute("IssuedSummary", IssuedSummary);
		}

		CformRequestDTO RequestSummary = cardsServices.getCformRequestSummary();
		System.out.println("RequestSummary" + RequestSummary.getCformCount());
		System.out.println("RequestDate" + RequestSummary.getCRequestDate());
		if (RequestSummary != null) {
			model.addAttribute("RequestSummary", RequestSummary);
		}
		
		RegdDealerSummaryDTO vatSummary = cardsServices.getVatSummary();
		System.out.println("vat Summary" + vatSummary.getVatRegistered());
		System.out.println("vat Summary" + vatSummary.getVatCancelled());
		if (vatSummary != null) {
			model.addAttribute("vatSummary", vatSummary);
		}
		
		InvoiceRequestDTO invoiceSummary = cardsServices.getInvoiceRequestSummary();
		if (invoiceSummary != null) {
			model.addAttribute("invoiceSummary", invoiceSummary);
		}
		return "index";
	}
}
