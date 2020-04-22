package com.zlzf.stock.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private String id;

    private String merchantId;

    private String merchantSeqId;

    private String custId;

    private String userNameText;

    private String certType;

    private String certId;

    private String rechargeCode;

    private String receiBankCode;

    private String paymentBankCode;

    private String cardName;

    private String cardNo;

    private Long orderAmt;

    private String status;

    private String auditStatus;

    private String auditMsg;

    private String orderDate;

    private String rechargeNo;

    private Date createTime;

    private Date updateTime;

    private String description;

    private String firstChecker;

    private String finalChecker;

    private String checkStatus;

    private String isCallback;

    private String callbackDate;

    private String resv;

    private String businessType;

    private String paymentId;

    private String payeeCustId;

    private String payeeCustName;

    private String tradeType;

    private String withdrawType;

    private String organizationId;

    private String noticeTarget;

    private String userId;

    private String validStatus;

    private String protocolId;

    private String createCustId;

    private String fundcertficate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantSeqId() {
        return merchantSeqId;
    }

    public void setMerchantSeqId(String merchantSeqId) {
        this.merchantSeqId = merchantSeqId == null ? null : merchantSeqId.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getUserNameText() {
        return userNameText;
    }

    public void setUserNameText(String userNameText) {
        this.userNameText = userNameText == null ? null : userNameText.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId == null ? null : certId.trim();
    }

    public String getRechargeCode() {
        return rechargeCode;
    }

    public void setRechargeCode(String rechargeCode) {
        this.rechargeCode = rechargeCode == null ? null : rechargeCode.trim();
    }

    public String getReceiBankCode() {
        return receiBankCode;
    }

    public void setReceiBankCode(String receiBankCode) {
        this.receiBankCode = receiBankCode == null ? null : receiBankCode.trim();
    }

    public String getPaymentBankCode() {
        return paymentBankCode;
    }

    public void setPaymentBankCode(String paymentBankCode) {
        this.paymentBankCode = paymentBankCode == null ? null : paymentBankCode.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Long getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(Long orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getAuditMsg() {
        return auditMsg;
    }

    public void setAuditMsg(String auditMsg) {
        this.auditMsg = auditMsg == null ? null : auditMsg.trim();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate == null ? null : orderDate.trim();
    }

    public String getRechargeNo() {
        return rechargeNo;
    }

    public void setRechargeNo(String rechargeNo) {
        this.rechargeNo = rechargeNo == null ? null : rechargeNo.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFirstChecker() {
        return firstChecker;
    }

    public void setFirstChecker(String firstChecker) {
        this.firstChecker = firstChecker == null ? null : firstChecker.trim();
    }

    public String getFinalChecker() {
        return finalChecker;
    }

    public void setFinalChecker(String finalChecker) {
        this.finalChecker = finalChecker == null ? null : finalChecker.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getIsCallback() {
        return isCallback;
    }

    public void setIsCallback(String isCallback) {
        this.isCallback = isCallback == null ? null : isCallback.trim();
    }

    public String getCallbackDate() {
        return callbackDate;
    }

    public void setCallbackDate(String callbackDate) {
        this.callbackDate = callbackDate == null ? null : callbackDate.trim();
    }

    public String getResv() {
        return resv;
    }

    public void setResv(String resv) {
        this.resv = resv == null ? null : resv.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId == null ? null : paymentId.trim();
    }

    public String getPayeeCustId() {
        return payeeCustId;
    }

    public void setPayeeCustId(String payeeCustId) {
        this.payeeCustId = payeeCustId == null ? null : payeeCustId.trim();
    }

    public String getPayeeCustName() {
        return payeeCustName;
    }

    public void setPayeeCustName(String payeeCustName) {
        this.payeeCustName = payeeCustName == null ? null : payeeCustName.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType == null ? null : withdrawType.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getNoticeTarget() {
        return noticeTarget;
    }

    public void setNoticeTarget(String noticeTarget) {
        this.noticeTarget = noticeTarget == null ? null : noticeTarget.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId == null ? null : protocolId.trim();
    }

    public String getCreateCustId() {
        return createCustId;
    }

    public void setCreateCustId(String createCustId) {
        this.createCustId = createCustId == null ? null : createCustId.trim();
    }

    public String getFundcertficate() {
        return fundcertficate;
    }

    public void setFundcertficate(String fundcertficate) {
        this.fundcertficate = fundcertficate == null ? null : fundcertficate.trim();
    }
}