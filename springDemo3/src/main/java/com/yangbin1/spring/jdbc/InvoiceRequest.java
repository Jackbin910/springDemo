package com.yangbin1.spring.jdbc;

import java.math.BigDecimal;
import java.sql.Date;

public class InvoiceRequest {
    public Integer invRequestUuid;
    public String invRequestNum;
    public String requestCompanyCde;
    public String invoiceNo;
    public String status;
    public String ccyCde;
    public BigDecimal amt;
    public Date completeDate;
    public String completeUsr;
    
    public Integer getInvRequestUuid() {
        return invRequestUuid;
    }
    public void setInvRequestUuid(Integer invRequestUuid) {
        this.invRequestUuid = invRequestUuid;
    }
    public String getInvRequestNum() {
        return invRequestNum;
    }
    public void setInvRequestNum(String invRequestNum) {
        this.invRequestNum = invRequestNum;
    }
    public String getRequestCompanyCde() {
        return requestCompanyCde;
    }
    public void setRequestCompanyCde(String requestCompanyCde) {
        this.requestCompanyCde = requestCompanyCde;
    }
    public String getInvoiceNo() {
        return invoiceNo;
    }
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCcyCde() {
        return ccyCde;
    }
    public void setCcyCde(String ccyCde) {
        this.ccyCde = ccyCde;
    }
    public BigDecimal getAmt() {
        return amt;
    }
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }
    public Date getCompleteDate() {
        return completeDate;
    }
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }
    public String getCompleteUsr() {
        return completeUsr;
    }
    public void setCompleteUsr(String completeUsr) {
        this.completeUsr = completeUsr;
    }
    
    @Override
    public String toString() {
        return "InvoiceRequest [invRequestUuid=" + invRequestUuid + ", invRequestNum=" + invRequestNum
                + ", requestCompanyCde=" + requestCompanyCde + ", invoiceNo=" + invoiceNo + ", status=" + status
                + ", ccyCde=" + ccyCde + ", amt=" + amt + ", completeDate=" + completeDate + ", completeUsr="
                + completeUsr + "]";
    }
    
    
}
