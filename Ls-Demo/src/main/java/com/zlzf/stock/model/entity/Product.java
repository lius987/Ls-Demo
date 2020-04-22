package com.zlzf.stock.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable {
    private String id;

    private String productName;

    private String productAccount;

    private Long amount;

    private String status;

    private Date beginDate;

    private Date endDate;

    private Date createTime;

    private Date updateTime;

    private String businessModel;

    private String speAccName;

    private String openAccBank;

    private String speAccount;

    private BigDecimal repaidAmt;

    private String organizationId;

    private String stockAccount;

    private String issuerAcount;

    private String productCodes;

    private String superviseAgent;

    private String superviseAudit;

    private String superviseReview;

    private String auditor;

    private String auditStatus;

    private Date auditTime;

    private String remarks;

    private String issuerAcountId;

    private BigDecimal settleAmt;

    private BigDecimal cashAmt;

    private BigDecimal todayRepaid;

    private BigDecimal todayCash;

    private String bankAccountName;

    private String issuerEntpid;

    private String stockEntpid;

    private String elIssuerAcount;

    private String elStockAccount;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductAccount() {
        return productAccount;
    }

    public void setProductAccount(String productAccount) {
        this.productAccount = productAccount == null ? null : productAccount.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel == null ? null : businessModel.trim();
    }

    public String getSpeAccName() {
        return speAccName;
    }

    public void setSpeAccName(String speAccName) {
        this.speAccName = speAccName == null ? null : speAccName.trim();
    }

    public String getOpenAccBank() {
        return openAccBank;
    }

    public void setOpenAccBank(String openAccBank) {
        this.openAccBank = openAccBank == null ? null : openAccBank.trim();
    }

    public String getSpeAccount() {
        return speAccount;
    }

    public void setSpeAccount(String speAccount) {
        this.speAccount = speAccount == null ? null : speAccount.trim();
    }

    public BigDecimal getRepaidAmt() {
        return repaidAmt;
    }

    public void setRepaidAmt(BigDecimal repaidAmt) {
        this.repaidAmt = repaidAmt;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getStockAccount() {
        return stockAccount;
    }

    public void setStockAccount(String stockAccount) {
        this.stockAccount = stockAccount == null ? null : stockAccount.trim();
    }

    public String getIssuerAcount() {
        return issuerAcount;
    }

    public void setIssuerAcount(String issuerAcount) {
        this.issuerAcount = issuerAcount == null ? null : issuerAcount.trim();
    }

    public String getProductCodes() {
        return productCodes;
    }

    public void setProductCodes(String productCodes) {
        this.productCodes = productCodes == null ? null : productCodes.trim();
    }

    public String getSuperviseAgent() {
        return superviseAgent;
    }

    public void setSuperviseAgent(String superviseAgent) {
        this.superviseAgent = superviseAgent == null ? null : superviseAgent.trim();
    }

    public String getSuperviseAudit() {
        return superviseAudit;
    }

    public void setSuperviseAudit(String superviseAudit) {
        this.superviseAudit = superviseAudit == null ? null : superviseAudit.trim();
    }

    public String getSuperviseReview() {
        return superviseReview;
    }

    public void setSuperviseReview(String superviseReview) {
        this.superviseReview = superviseReview == null ? null : superviseReview.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getIssuerAcountId() {
        return issuerAcountId;
    }

    public void setIssuerAcountId(String issuerAcountId) {
        this.issuerAcountId = issuerAcountId == null ? null : issuerAcountId.trim();
    }

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public BigDecimal getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(BigDecimal cashAmt) {
        this.cashAmt = cashAmt;
    }

    public BigDecimal getTodayRepaid() {
        return todayRepaid;
    }

    public void setTodayRepaid(BigDecimal todayRepaid) {
        this.todayRepaid = todayRepaid;
    }

    public BigDecimal getTodayCash() {
        return todayCash;
    }

    public void setTodayCash(BigDecimal todayCash) {
        this.todayCash = todayCash;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getIssuerEntpid() {
        return issuerEntpid;
    }

    public void setIssuerEntpid(String issuerEntpid) {
        this.issuerEntpid = issuerEntpid == null ? null : issuerEntpid.trim();
    }

    public String getStockEntpid() {
        return stockEntpid;
    }

    public void setStockEntpid(String stockEntpid) {
        this.stockEntpid = stockEntpid == null ? null : stockEntpid.trim();
    }

    public String getElIssuerAcount() {
        return elIssuerAcount;
    }

    public void setElIssuerAcount(String elIssuerAcount) {
        this.elIssuerAcount = elIssuerAcount == null ? null : elIssuerAcount.trim();
    }

    public String getElStockAccount() {
        return elStockAccount;
    }

    public void setElStockAccount(String elStockAccount) {
        this.elStockAccount = elStockAccount == null ? null : elStockAccount.trim();
    }
}