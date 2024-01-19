package org.nic.Index.dto;

import java.util.Date;

public class RegdDealerSummaryDTO {
	private Long vatRegistered;
    private Long vatTransferred;
    private Long vatCancelled;
    private Date minLogDate;

    public RegdDealerSummaryDTO() {
        
    }

    public RegdDealerSummaryDTO(Long vatRegistered, Long vatTransferred, Long vatCancelled, Date minLogDate) {
        this.vatRegistered = vatRegistered;
        this.vatTransferred = vatTransferred;
        this.vatCancelled = vatCancelled;
        this.minLogDate = minLogDate;
    }

    public Long getVatRegistered() {
        return vatRegistered;
    }

    public void setVatRegistered(Long vatRegistered) {
        this.vatRegistered = vatRegistered;
    }

    public Long getVatTransferred() {
        return vatTransferred;
    }

    public void setVatTransferred(Long vatTransferred) {
        this.vatTransferred = vatTransferred;
    }

    public Long getVatCancelled() {
        return vatCancelled;
    }

    public void setVatCancelled(Long vatCancelled) {
        this.vatCancelled = vatCancelled;
    }

    public Date getMinLogDate() {
        return minLogDate;
    }

    public void setMinLogDate(Date minLogDate) {
        this.minLogDate = minLogDate;
    }
		
}
