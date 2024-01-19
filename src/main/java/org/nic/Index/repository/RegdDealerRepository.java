package org.nic.Index.repository;


import java.util.Date;

import org.nic.Index.dto.RegdDealerSummaryDTO;
import org.nic.Index.model.regd_dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegdDealerRepository extends JpaRepository<regd_dealer, Long> {
//	 @Query("SELECT COUNT(rd.vat_rc_no) FROM regd_dealer rd WHERE rd.status_cd='R'")
//	    int countVatRegistrations();
//	 @Query("SELECT COUNT(rd.vat_rc_no) FROM regd_dealer rd WHERE rd.status_cd='T'")
//	    int countVatTransferred();
//	 @Query("SELECT COUNT(rd.vat_rc_no) FROM regd_dealer rd WHERE rd.status_cd='C'")
//	    int countVatCancelled();
//	 @Query("SELECT min(rd.log_dt) FROM regd_dealer rd ")
//	 	Date minLogDate();
	

	
	@Query("SELECT new org.nic.Index.dto.RegdDealerSummaryDTO(" +
		       "COUNT(rd.vat_rc_no) AS vatRegistered, " +
		       "COUNT(CASE WHEN rd.status_cd = 'T' THEN 1 ELSE NULL END) AS vatTransferred, " +
		       "COUNT(CASE WHEN rd.status_cd = 'C' THEN 1 ELSE NULL END) AS vatCancelled, " +
		       "MIN(rd.log_dt) AS minLogDate) " +
		       "FROM regd_dealer rd")
		RegdDealerSummaryDTO getVatSummary();

	 
}
