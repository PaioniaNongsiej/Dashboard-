package org.nic.Index.repository;

import java.util.Date;

import org.nic.Index.dto.CformRequestDTO;
import org.nic.Index.model.cformRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CformRequestRepository extends JpaRepository<cformRequest, Long> {
	 @Query("SELECT new org.nic.Index.dto.CformRequestDTO(" +
		       "COUNT(rd.requestNo) AS CformCount, " +
		       "MIN(rd.requestDt) AS CRequestDate) " +
		       "FROM cformRequest rd")
		CformRequestDTO getCformRequestSummary();
}
