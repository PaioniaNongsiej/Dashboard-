package org.nic.Index.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table (name = "regd_dealer")
@Entity
public class regd_dealer  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vat_rc_no;

    private String status_cd;

    private Date log_dt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVat_rc_no() {
		return vat_rc_no;
	}

	public void setVat_rc_no(String vat_rc_no) {
		this.vat_rc_no = vat_rc_no;
	}

	public String getStatus_cd() {
		return status_cd;
	}

	public void setStatus_cd(String status_cd) {
		this.status_cd = status_cd;
	}

	public Date getLog_dt() {
		return log_dt;
	}

	public void setLog_dt(Date log_dt) {
		this.log_dt = log_dt;
	}

	
}
