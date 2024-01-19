package org.nic.Index.web;

import java.util.Date;

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

//    	 int vatRegistered = cardsServices.getVatRegistered();
//    	 int vatTransferred= cardsServices.getVatTransferred();
//    	 int vatCancelled = cardsServices.getVatCancelled();
		int CformCount = cardsServices.getCformCount();
		int CformIssued = cardsServices.getCformIssued();
		Long InvoiceRequest = cardsServices.getInvoiceRequest();
//    	 Date MinDate = cardsServices.getLogDate();
		Date CRequestDate = cardsServices.getRequestDate();
		Date IssuedDate = cardsServices.getIssuedDate();
		Date InvoiceDate = cardsServices.getInvoiceDate();
//         model.addAttribute("vatRegistered", vatRegistered);
		model.addAttribute("CformCount", CformCount);
//         model.addAttribute("vatTransferred", vatTransferred);
//         model.addAttribute("vatCancelled", vatCancelled); 
		model.addAttribute(" CformIssued", CformIssued);
		model.addAttribute("InvoiceRequest", InvoiceRequest);
//         model.addAttribute("MinDate", MinDate);
		model.addAttribute("CRequestDate", CRequestDate);
		model.addAttribute("IssuedDate", IssuedDate);
		model.addAttribute("InvoiceDate", InvoiceDate);

		RegdDealerSummaryDTO vatSummary = cardsServices.getVatSummary();
		System.out.println("vat Summary" + vatSummary.getVatRegistered());
		if (vatSummary != null) {
			model.addAttribute("vatSummary", vatSummary);
		}

		return "index";
	}
}
