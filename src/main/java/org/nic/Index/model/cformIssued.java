package org.nic.Index.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="df_issue_online")
@Entity
public class cformIssued {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String final_sl_no;
    
    private Date log_date;

	public Date getLog_date() {
		return log_date;
	}

	public void setLog_date(Date log_date) {
		this.log_date = log_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFinal_sl_no() {
		return final_sl_no;
	}

	public void setFinal_sl_no(String final_sl_no) {
		this.final_sl_no = final_sl_no;
	}
}
