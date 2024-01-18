package org.nic.Index.repository;

import java.util.Date;

import org.nic.Index.model.cformRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CformRequestRepository extends JpaRepository<cformRequest, Long> {
	 @Query("SELECT COUNT(rc.ack_no) FROM cformRequest rc")
	 	int CountCform();
	 @Query("SELECT min(rc.request_date) FROM cformRequest rc")
	 	Date MinRequestDt();
}
