package org.nic.Index.repository;


import java.util.Date;

import org.nic.Index.dto.RegdDealerSummaryDTO;
import org.nic.Index.model.regd_dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegdDealerRepository extends JpaRepository<regd_dealer, Long> {
	
	@Query("SELECT new org.nic.Index.dto.RegdDealerSummaryDTO(" +
		       "COUNT(rd.tinNumber) AS vatRegistered, " +
		       "COUNT(CASE WHEN rd.status = 'T' THEN 1 ELSE NULL END) AS vatTransferred, " +
		       "COUNT(CASE WHEN rd.status = 'C' THEN 1 ELSE NULL END) AS vatCancelled, " +
		       "MIN(rd.logDate) AS minLogDate) " +
		       "FROM regd_dealer rd")
		RegdDealerSummaryDTO getVatSummary(); 
}
