package org.nic.Index.dto;

import java.util.Date;

public class CformIssuedDTO {
	private Long CformIssued;
	
	private Date IssuedDate;

    public CformIssuedDTO() {
        
    }

    public CformIssuedDTO(Long CformIssued, Date IssuedDate) {
        this.CformIssued = CformIssued;
        this.IssuedDate = IssuedDate;
    }

	public Long getCformIssued() {
		return CformIssued;
	}

	public void setCformIssued(Long cformIssued) {
		this.CformIssued = cformIssued;
	}

	public Date getIssuedDate() {
		return IssuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.IssuedDate = issuedDate;
	}
	
	
}
