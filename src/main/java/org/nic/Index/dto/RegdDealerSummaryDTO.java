package org.nic.Index.dto;

import java.util.Date;

public class RegdDealerSummaryDTO {
	 private int vatRegistered;
	    private int vatTransferred;
	    private int vatCancelled;
	    private Date minLogDate;
	    
		public int getVatRegistered() {
			return vatRegistered;
		}
		public void setVatRegistered(int vatRegistered) {
			this.vatRegistered = vatRegistered;
		}
		public int getVatTransferred() {
			return vatTransferred;
		}
		public void setVatTransferred(int vatTransferred) {
			this.vatTransferred = vatTransferred;
		}
		public int getVatCancelled() {
			return vatCancelled;
		}
		public void setVatCancelled(int vatCancelled) {
			this.vatCancelled = vatCancelled;
		}
		public Date getMinLogDate() {
			return minLogDate;
		}
		public void setMinLogDate(Date minLogDate) {
			this.minLogDate = minLogDate;
		}
	    
	    
}
