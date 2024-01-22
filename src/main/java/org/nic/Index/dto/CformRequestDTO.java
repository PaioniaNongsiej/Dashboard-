package org.nic.Index.dto;

import java.util.Date;

public class CformRequestDTO {
    private Long CformCount;
    private Date CRequestDate;

    public CformRequestDTO() {
        
    }

    public CformRequestDTO(Long CformCount, Date CRequestDate) {
        this.CformCount = CformCount;
        this.CRequestDate = CRequestDate;
    }

    public Long getCformCount() {
        return CformCount;
    }

    public void setCformCount(Long cformCount) {
        this.CformCount = cformCount; 
    }

    public Date getCRequestDate() {
        return CRequestDate;
    }

    public void setCRequestDate(Date CRequestDate) {
        this.CRequestDate = CRequestDate;
    }
}
