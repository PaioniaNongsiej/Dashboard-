package org.nic.Index.repository;

import java.util.Date;

import org.nic.Index.model.cformIssued;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CformIssuedRepository extends JpaRepository<cformIssued, Long> {
	 @Query("SELECT COUNT(rc.final_sl_no) FROM cformIssued rc")
	 	int CountCformIssue();
	 @Query("SELECT min(rc.log_date) FROM cformIssued rc")
	 	Date IssuedDate();
}
