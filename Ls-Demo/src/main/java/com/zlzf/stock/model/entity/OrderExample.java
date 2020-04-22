package com.zlzf.stock.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("MERCHANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("MERCHANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("MERCHANT_ID =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("MERCHANT_ID <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("MERCHANT_ID >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ID >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("MERCHANT_ID <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ID <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("MERCHANT_ID like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("MERCHANT_ID not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("MERCHANT_ID in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("MERCHANT_ID not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("MERCHANT_ID between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_ID not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdIsNull() {
            addCriterion("MERCHANT_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdIsNotNull() {
            addCriterion("MERCHANT_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdEqualTo(String value) {
            addCriterion("MERCHANT_SEQ_ID =", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdNotEqualTo(String value) {
            addCriterion("MERCHANT_SEQ_ID <>", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdGreaterThan(String value) {
            addCriterion("MERCHANT_SEQ_ID >", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_SEQ_ID >=", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdLessThan(String value) {
            addCriterion("MERCHANT_SEQ_ID <", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_SEQ_ID <=", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdLike(String value) {
            addCriterion("MERCHANT_SEQ_ID like", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdNotLike(String value) {
            addCriterion("MERCHANT_SEQ_ID not like", value, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdIn(List<String> values) {
            addCriterion("MERCHANT_SEQ_ID in", values, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdNotIn(List<String> values) {
            addCriterion("MERCHANT_SEQ_ID not in", values, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdBetween(String value1, String value2) {
            addCriterion("MERCHANT_SEQ_ID between", value1, value2, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andMerchantSeqIdNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_SEQ_ID not between", value1, value2, "merchantSeqId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andUserNameTextIsNull() {
            addCriterion("USER_NAME_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andUserNameTextIsNotNull() {
            addCriterion("USER_NAME_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameTextEqualTo(String value) {
            addCriterion("USER_NAME_TEXT =", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextNotEqualTo(String value) {
            addCriterion("USER_NAME_TEXT <>", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextGreaterThan(String value) {
            addCriterion("USER_NAME_TEXT >", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_TEXT >=", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextLessThan(String value) {
            addCriterion("USER_NAME_TEXT <", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_TEXT <=", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextLike(String value) {
            addCriterion("USER_NAME_TEXT like", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextNotLike(String value) {
            addCriterion("USER_NAME_TEXT not like", value, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextIn(List<String> values) {
            addCriterion("USER_NAME_TEXT in", values, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextNotIn(List<String> values) {
            addCriterion("USER_NAME_TEXT not in", values, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextBetween(String value1, String value2) {
            addCriterion("USER_NAME_TEXT between", value1, value2, "userNameText");
            return (Criteria) this;
        }

        public Criteria andUserNameTextNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_TEXT not between", value1, value2, "userNameText");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("CERT_TYPE like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("CERT_TYPE not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNull() {
            addCriterion("CERT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNotNull() {
            addCriterion("CERT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertIdEqualTo(String value) {
            addCriterion("CERT_ID =", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotEqualTo(String value) {
            addCriterion("CERT_ID <>", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThan(String value) {
            addCriterion("CERT_ID >", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_ID >=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThan(String value) {
            addCriterion("CERT_ID <", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThanOrEqualTo(String value) {
            addCriterion("CERT_ID <=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLike(String value) {
            addCriterion("CERT_ID like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotLike(String value) {
            addCriterion("CERT_ID not like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdIn(List<String> values) {
            addCriterion("CERT_ID in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotIn(List<String> values) {
            addCriterion("CERT_ID not in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdBetween(String value1, String value2) {
            addCriterion("CERT_ID between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotBetween(String value1, String value2) {
            addCriterion("CERT_ID not between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeIsNull() {
            addCriterion("RECHARGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeIsNotNull() {
            addCriterion("RECHARGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeEqualTo(String value) {
            addCriterion("RECHARGE_CODE =", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotEqualTo(String value) {
            addCriterion("RECHARGE_CODE <>", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeGreaterThan(String value) {
            addCriterion("RECHARGE_CODE >", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECHARGE_CODE >=", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeLessThan(String value) {
            addCriterion("RECHARGE_CODE <", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeLessThanOrEqualTo(String value) {
            addCriterion("RECHARGE_CODE <=", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeLike(String value) {
            addCriterion("RECHARGE_CODE like", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotLike(String value) {
            addCriterion("RECHARGE_CODE not like", value, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeIn(List<String> values) {
            addCriterion("RECHARGE_CODE in", values, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotIn(List<String> values) {
            addCriterion("RECHARGE_CODE not in", values, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeBetween(String value1, String value2) {
            addCriterion("RECHARGE_CODE between", value1, value2, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andRechargeCodeNotBetween(String value1, String value2) {
            addCriterion("RECHARGE_CODE not between", value1, value2, "rechargeCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeIsNull() {
            addCriterion("RECEI_BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeIsNotNull() {
            addCriterion("RECEI_BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeEqualTo(String value) {
            addCriterion("RECEI_BANK_CODE =", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeNotEqualTo(String value) {
            addCriterion("RECEI_BANK_CODE <>", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeGreaterThan(String value) {
            addCriterion("RECEI_BANK_CODE >", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEI_BANK_CODE >=", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeLessThan(String value) {
            addCriterion("RECEI_BANK_CODE <", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeLessThanOrEqualTo(String value) {
            addCriterion("RECEI_BANK_CODE <=", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeLike(String value) {
            addCriterion("RECEI_BANK_CODE like", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeNotLike(String value) {
            addCriterion("RECEI_BANK_CODE not like", value, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeIn(List<String> values) {
            addCriterion("RECEI_BANK_CODE in", values, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeNotIn(List<String> values) {
            addCriterion("RECEI_BANK_CODE not in", values, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeBetween(String value1, String value2) {
            addCriterion("RECEI_BANK_CODE between", value1, value2, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andReceiBankCodeNotBetween(String value1, String value2) {
            addCriterion("RECEI_BANK_CODE not between", value1, value2, "receiBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeIsNull() {
            addCriterion("PAYMENT_BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeIsNotNull() {
            addCriterion("PAYMENT_BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeEqualTo(String value) {
            addCriterion("PAYMENT_BANK_CODE =", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeNotEqualTo(String value) {
            addCriterion("PAYMENT_BANK_CODE <>", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeGreaterThan(String value) {
            addCriterion("PAYMENT_BANK_CODE >", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_BANK_CODE >=", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeLessThan(String value) {
            addCriterion("PAYMENT_BANK_CODE <", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_BANK_CODE <=", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeLike(String value) {
            addCriterion("PAYMENT_BANK_CODE like", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeNotLike(String value) {
            addCriterion("PAYMENT_BANK_CODE not like", value, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeIn(List<String> values) {
            addCriterion("PAYMENT_BANK_CODE in", values, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeNotIn(List<String> values) {
            addCriterion("PAYMENT_BANK_CODE not in", values, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeBetween(String value1, String value2) {
            addCriterion("PAYMENT_BANK_CODE between", value1, value2, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andPaymentBankCodeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_BANK_CODE not between", value1, value2, "paymentBankCode");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("CARD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("CARD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("CARD_NAME =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("CARD_NAME <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("CARD_NAME >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NAME >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("CARD_NAME <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("CARD_NAME <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("CARD_NAME like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("CARD_NAME not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("CARD_NAME in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("CARD_NAME not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("CARD_NAME between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("CARD_NAME not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIsNull() {
            addCriterion("ORDER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIsNotNull() {
            addCriterion("ORDER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtEqualTo(Long value) {
            addCriterion("ORDER_AMT =", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotEqualTo(Long value) {
            addCriterion("ORDER_AMT <>", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThan(Long value) {
            addCriterion("ORDER_AMT >", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMT >=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThan(Long value) {
            addCriterion("ORDER_AMT <", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMT <=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIn(List<Long> values) {
            addCriterion("ORDER_AMT in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotIn(List<Long> values) {
            addCriterion("ORDER_AMT not in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMT between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMT not between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("AUDIT_STATUS like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("AUDIT_STATUS not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditMsgIsNull() {
            addCriterion("AUDIT_MSG is null");
            return (Criteria) this;
        }

        public Criteria andAuditMsgIsNotNull() {
            addCriterion("AUDIT_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andAuditMsgEqualTo(String value) {
            addCriterion("AUDIT_MSG =", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotEqualTo(String value) {
            addCriterion("AUDIT_MSG <>", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgGreaterThan(String value) {
            addCriterion("AUDIT_MSG >", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_MSG >=", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgLessThan(String value) {
            addCriterion("AUDIT_MSG <", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_MSG <=", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgLike(String value) {
            addCriterion("AUDIT_MSG like", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotLike(String value) {
            addCriterion("AUDIT_MSG not like", value, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgIn(List<String> values) {
            addCriterion("AUDIT_MSG in", values, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotIn(List<String> values) {
            addCriterion("AUDIT_MSG not in", values, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgBetween(String value1, String value2) {
            addCriterion("AUDIT_MSG between", value1, value2, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andAuditMsgNotBetween(String value1, String value2) {
            addCriterion("AUDIT_MSG not between", value1, value2, "auditMsg");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(String value) {
            addCriterion("ORDER_DATE =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(String value) {
            addCriterion("ORDER_DATE <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(String value) {
            addCriterion("ORDER_DATE >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DATE >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(String value) {
            addCriterion("ORDER_DATE <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DATE <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLike(String value) {
            addCriterion("ORDER_DATE like", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotLike(String value) {
            addCriterion("ORDER_DATE not like", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<String> values) {
            addCriterion("ORDER_DATE in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<String> values) {
            addCriterion("ORDER_DATE not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(String value1, String value2) {
            addCriterion("ORDER_DATE between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_DATE not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andRechargeNoIsNull() {
            addCriterion("RECHARGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andRechargeNoIsNotNull() {
            addCriterion("RECHARGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeNoEqualTo(String value) {
            addCriterion("RECHARGE_NO =", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoNotEqualTo(String value) {
            addCriterion("RECHARGE_NO <>", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoGreaterThan(String value) {
            addCriterion("RECHARGE_NO >", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoGreaterThanOrEqualTo(String value) {
            addCriterion("RECHARGE_NO >=", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoLessThan(String value) {
            addCriterion("RECHARGE_NO <", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoLessThanOrEqualTo(String value) {
            addCriterion("RECHARGE_NO <=", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoLike(String value) {
            addCriterion("RECHARGE_NO like", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoNotLike(String value) {
            addCriterion("RECHARGE_NO not like", value, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoIn(List<String> values) {
            addCriterion("RECHARGE_NO in", values, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoNotIn(List<String> values) {
            addCriterion("RECHARGE_NO not in", values, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoBetween(String value1, String value2) {
            addCriterion("RECHARGE_NO between", value1, value2, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andRechargeNoNotBetween(String value1, String value2) {
            addCriterion("RECHARGE_NO not between", value1, value2, "rechargeNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerIsNull() {
            addCriterion("FIRST_CHECKER is null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerIsNotNull() {
            addCriterion("FIRST_CHECKER is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerEqualTo(String value) {
            addCriterion("FIRST_CHECKER =", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerNotEqualTo(String value) {
            addCriterion("FIRST_CHECKER <>", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerGreaterThan(String value) {
            addCriterion("FIRST_CHECKER >", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_CHECKER >=", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerLessThan(String value) {
            addCriterion("FIRST_CHECKER <", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerLessThanOrEqualTo(String value) {
            addCriterion("FIRST_CHECKER <=", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerLike(String value) {
            addCriterion("FIRST_CHECKER like", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerNotLike(String value) {
            addCriterion("FIRST_CHECKER not like", value, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerIn(List<String> values) {
            addCriterion("FIRST_CHECKER in", values, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerNotIn(List<String> values) {
            addCriterion("FIRST_CHECKER not in", values, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerBetween(String value1, String value2) {
            addCriterion("FIRST_CHECKER between", value1, value2, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFirstCheckerNotBetween(String value1, String value2) {
            addCriterion("FIRST_CHECKER not between", value1, value2, "firstChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerIsNull() {
            addCriterion("FINAL_CHECKER is null");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerIsNotNull() {
            addCriterion("FINAL_CHECKER is not null");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerEqualTo(String value) {
            addCriterion("FINAL_CHECKER =", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerNotEqualTo(String value) {
            addCriterion("FINAL_CHECKER <>", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerGreaterThan(String value) {
            addCriterion("FINAL_CHECKER >", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("FINAL_CHECKER >=", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerLessThan(String value) {
            addCriterion("FINAL_CHECKER <", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerLessThanOrEqualTo(String value) {
            addCriterion("FINAL_CHECKER <=", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerLike(String value) {
            addCriterion("FINAL_CHECKER like", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerNotLike(String value) {
            addCriterion("FINAL_CHECKER not like", value, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerIn(List<String> values) {
            addCriterion("FINAL_CHECKER in", values, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerNotIn(List<String> values) {
            addCriterion("FINAL_CHECKER not in", values, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerBetween(String value1, String value2) {
            addCriterion("FINAL_CHECKER between", value1, value2, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andFinalCheckerNotBetween(String value1, String value2) {
            addCriterion("FINAL_CHECKER not between", value1, value2, "finalChecker");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andIsCallbackIsNull() {
            addCriterion("IS_CALLBACK is null");
            return (Criteria) this;
        }

        public Criteria andIsCallbackIsNotNull() {
            addCriterion("IS_CALLBACK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCallbackEqualTo(String value) {
            addCriterion("IS_CALLBACK =", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackNotEqualTo(String value) {
            addCriterion("IS_CALLBACK <>", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackGreaterThan(String value) {
            addCriterion("IS_CALLBACK >", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CALLBACK >=", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackLessThan(String value) {
            addCriterion("IS_CALLBACK <", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackLessThanOrEqualTo(String value) {
            addCriterion("IS_CALLBACK <=", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackLike(String value) {
            addCriterion("IS_CALLBACK like", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackNotLike(String value) {
            addCriterion("IS_CALLBACK not like", value, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackIn(List<String> values) {
            addCriterion("IS_CALLBACK in", values, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackNotIn(List<String> values) {
            addCriterion("IS_CALLBACK not in", values, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackBetween(String value1, String value2) {
            addCriterion("IS_CALLBACK between", value1, value2, "isCallback");
            return (Criteria) this;
        }

        public Criteria andIsCallbackNotBetween(String value1, String value2) {
            addCriterion("IS_CALLBACK not between", value1, value2, "isCallback");
            return (Criteria) this;
        }

        public Criteria andCallbackDateIsNull() {
            addCriterion("CALLBACK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCallbackDateIsNotNull() {
            addCriterion("CALLBACK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackDateEqualTo(String value) {
            addCriterion("CALLBACK_DATE =", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateNotEqualTo(String value) {
            addCriterion("CALLBACK_DATE <>", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateGreaterThan(String value) {
            addCriterion("CALLBACK_DATE >", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateGreaterThanOrEqualTo(String value) {
            addCriterion("CALLBACK_DATE >=", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateLessThan(String value) {
            addCriterion("CALLBACK_DATE <", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateLessThanOrEqualTo(String value) {
            addCriterion("CALLBACK_DATE <=", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateLike(String value) {
            addCriterion("CALLBACK_DATE like", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateNotLike(String value) {
            addCriterion("CALLBACK_DATE not like", value, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateIn(List<String> values) {
            addCriterion("CALLBACK_DATE in", values, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateNotIn(List<String> values) {
            addCriterion("CALLBACK_DATE not in", values, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateBetween(String value1, String value2) {
            addCriterion("CALLBACK_DATE between", value1, value2, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andCallbackDateNotBetween(String value1, String value2) {
            addCriterion("CALLBACK_DATE not between", value1, value2, "callbackDate");
            return (Criteria) this;
        }

        public Criteria andResvIsNull() {
            addCriterion("RESV is null");
            return (Criteria) this;
        }

        public Criteria andResvIsNotNull() {
            addCriterion("RESV is not null");
            return (Criteria) this;
        }

        public Criteria andResvEqualTo(String value) {
            addCriterion("RESV =", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvNotEqualTo(String value) {
            addCriterion("RESV <>", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvGreaterThan(String value) {
            addCriterion("RESV >", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvGreaterThanOrEqualTo(String value) {
            addCriterion("RESV >=", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvLessThan(String value) {
            addCriterion("RESV <", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvLessThanOrEqualTo(String value) {
            addCriterion("RESV <=", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvLike(String value) {
            addCriterion("RESV like", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvNotLike(String value) {
            addCriterion("RESV not like", value, "resv");
            return (Criteria) this;
        }

        public Criteria andResvIn(List<String> values) {
            addCriterion("RESV in", values, "resv");
            return (Criteria) this;
        }

        public Criteria andResvNotIn(List<String> values) {
            addCriterion("RESV not in", values, "resv");
            return (Criteria) this;
        }

        public Criteria andResvBetween(String value1, String value2) {
            addCriterion("RESV between", value1, value2, "resv");
            return (Criteria) this;
        }

        public Criteria andResvNotBetween(String value1, String value2) {
            addCriterion("RESV not between", value1, value2, "resv");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(String value) {
            addCriterion("PAYMENT_ID =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(String value) {
            addCriterion("PAYMENT_ID <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(String value) {
            addCriterion("PAYMENT_ID >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ID >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(String value) {
            addCriterion("PAYMENT_ID <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ID <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLike(String value) {
            addCriterion("PAYMENT_ID like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotLike(String value) {
            addCriterion("PAYMENT_ID not like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<String> values) {
            addCriterion("PAYMENT_ID in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<String> values) {
            addCriterion("PAYMENT_ID not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_ID between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_ID not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdIsNull() {
            addCriterion("PAYEE_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdIsNotNull() {
            addCriterion("PAYEE_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdEqualTo(String value) {
            addCriterion("PAYEE_CUST_ID =", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdNotEqualTo(String value) {
            addCriterion("PAYEE_CUST_ID <>", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdGreaterThan(String value) {
            addCriterion("PAYEE_CUST_ID >", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE_CUST_ID >=", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdLessThan(String value) {
            addCriterion("PAYEE_CUST_ID <", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdLessThanOrEqualTo(String value) {
            addCriterion("PAYEE_CUST_ID <=", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdLike(String value) {
            addCriterion("PAYEE_CUST_ID like", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdNotLike(String value) {
            addCriterion("PAYEE_CUST_ID not like", value, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdIn(List<String> values) {
            addCriterion("PAYEE_CUST_ID in", values, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdNotIn(List<String> values) {
            addCriterion("PAYEE_CUST_ID not in", values, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdBetween(String value1, String value2) {
            addCriterion("PAYEE_CUST_ID between", value1, value2, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustIdNotBetween(String value1, String value2) {
            addCriterion("PAYEE_CUST_ID not between", value1, value2, "payeeCustId");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameIsNull() {
            addCriterion("PAYEE_CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameIsNotNull() {
            addCriterion("PAYEE_CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameEqualTo(String value) {
            addCriterion("PAYEE_CUST_NAME =", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameNotEqualTo(String value) {
            addCriterion("PAYEE_CUST_NAME <>", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameGreaterThan(String value) {
            addCriterion("PAYEE_CUST_NAME >", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE_CUST_NAME >=", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameLessThan(String value) {
            addCriterion("PAYEE_CUST_NAME <", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameLessThanOrEqualTo(String value) {
            addCriterion("PAYEE_CUST_NAME <=", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameLike(String value) {
            addCriterion("PAYEE_CUST_NAME like", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameNotLike(String value) {
            addCriterion("PAYEE_CUST_NAME not like", value, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameIn(List<String> values) {
            addCriterion("PAYEE_CUST_NAME in", values, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameNotIn(List<String> values) {
            addCriterion("PAYEE_CUST_NAME not in", values, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameBetween(String value1, String value2) {
            addCriterion("PAYEE_CUST_NAME between", value1, value2, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andPayeeCustNameNotBetween(String value1, String value2) {
            addCriterion("PAYEE_CUST_NAME not between", value1, value2, "payeeCustName");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeIsNull() {
            addCriterion("WITHDRAW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeIsNotNull() {
            addCriterion("WITHDRAW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE =", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE <>", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeGreaterThan(String value) {
            addCriterion("WITHDRAW_TYPE >", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE >=", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLessThan(String value) {
            addCriterion("WITHDRAW_TYPE <", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLessThanOrEqualTo(String value) {
            addCriterion("WITHDRAW_TYPE <=", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeLike(String value) {
            addCriterion("WITHDRAW_TYPE like", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotLike(String value) {
            addCriterion("WITHDRAW_TYPE not like", value, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeIn(List<String> values) {
            addCriterion("WITHDRAW_TYPE in", values, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotIn(List<String> values) {
            addCriterion("WITHDRAW_TYPE not in", values, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeBetween(String value1, String value2) {
            addCriterion("WITHDRAW_TYPE between", value1, value2, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andWithdrawTypeNotBetween(String value1, String value2) {
            addCriterion("WITHDRAW_TYPE not between", value1, value2, "withdrawType");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("ORGANIZATION_ID like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("ORGANIZATION_ID not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetIsNull() {
            addCriterion("NOTICE_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetIsNotNull() {
            addCriterion("NOTICE_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetEqualTo(String value) {
            addCriterion("NOTICE_TARGET =", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetNotEqualTo(String value) {
            addCriterion("NOTICE_TARGET <>", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetGreaterThan(String value) {
            addCriterion("NOTICE_TARGET >", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_TARGET >=", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetLessThan(String value) {
            addCriterion("NOTICE_TARGET <", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_TARGET <=", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetLike(String value) {
            addCriterion("NOTICE_TARGET like", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetNotLike(String value) {
            addCriterion("NOTICE_TARGET not like", value, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetIn(List<String> values) {
            addCriterion("NOTICE_TARGET in", values, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetNotIn(List<String> values) {
            addCriterion("NOTICE_TARGET not in", values, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetBetween(String value1, String value2) {
            addCriterion("NOTICE_TARGET between", value1, value2, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andNoticeTargetNotBetween(String value1, String value2) {
            addCriterion("NOTICE_TARGET not between", value1, value2, "noticeTarget");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNull() {
            addCriterion("VALID_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andValidStatusIsNotNull() {
            addCriterion("VALID_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andValidStatusEqualTo(String value) {
            addCriterion("VALID_STATUS =", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotEqualTo(String value) {
            addCriterion("VALID_STATUS <>", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThan(String value) {
            addCriterion("VALID_STATUS >", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_STATUS >=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThan(String value) {
            addCriterion("VALID_STATUS <", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLessThanOrEqualTo(String value) {
            addCriterion("VALID_STATUS <=", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusLike(String value) {
            addCriterion("VALID_STATUS like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotLike(String value) {
            addCriterion("VALID_STATUS not like", value, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusIn(List<String> values) {
            addCriterion("VALID_STATUS in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotIn(List<String> values) {
            addCriterion("VALID_STATUS not in", values, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusBetween(String value1, String value2) {
            addCriterion("VALID_STATUS between", value1, value2, "validStatus");
            return (Criteria) this;
        }

        public Criteria andValidStatusNotBetween(String value1, String value2) {
            addCriterion("VALID_STATUS not between", value1, value2, "validStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIsNull() {
            addCriterion("PROTOCOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIsNotNull() {
            addCriterion("PROTOCOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdEqualTo(String value) {
            addCriterion("PROTOCOL_ID =", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotEqualTo(String value) {
            addCriterion("PROTOCOL_ID <>", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThan(String value) {
            addCriterion("PROTOCOL_ID >", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_ID >=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThan(String value) {
            addCriterion("PROTOCOL_ID <", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_ID <=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLike(String value) {
            addCriterion("PROTOCOL_ID like", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotLike(String value) {
            addCriterion("PROTOCOL_ID not like", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIn(List<String> values) {
            addCriterion("PROTOCOL_ID in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotIn(List<String> values) {
            addCriterion("PROTOCOL_ID not in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdBetween(String value1, String value2) {
            addCriterion("PROTOCOL_ID between", value1, value2, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL_ID not between", value1, value2, "protocolId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdIsNull() {
            addCriterion("CREATE_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdIsNotNull() {
            addCriterion("CREATE_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdEqualTo(String value) {
            addCriterion("CREATE_CUST_ID =", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdNotEqualTo(String value) {
            addCriterion("CREATE_CUST_ID <>", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdGreaterThan(String value) {
            addCriterion("CREATE_CUST_ID >", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_CUST_ID >=", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdLessThan(String value) {
            addCriterion("CREATE_CUST_ID <", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_CUST_ID <=", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdLike(String value) {
            addCriterion("CREATE_CUST_ID like", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdNotLike(String value) {
            addCriterion("CREATE_CUST_ID not like", value, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdIn(List<String> values) {
            addCriterion("CREATE_CUST_ID in", values, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdNotIn(List<String> values) {
            addCriterion("CREATE_CUST_ID not in", values, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdBetween(String value1, String value2) {
            addCriterion("CREATE_CUST_ID between", value1, value2, "createCustId");
            return (Criteria) this;
        }

        public Criteria andCreateCustIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_CUST_ID not between", value1, value2, "createCustId");
            return (Criteria) this;
        }

        public Criteria andFundcertficateIsNull() {
            addCriterion("FUNDCERTFICATE is null");
            return (Criteria) this;
        }

        public Criteria andFundcertficateIsNotNull() {
            addCriterion("FUNDCERTFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andFundcertficateEqualTo(String value) {
            addCriterion("FUNDCERTFICATE =", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateNotEqualTo(String value) {
            addCriterion("FUNDCERTFICATE <>", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateGreaterThan(String value) {
            addCriterion("FUNDCERTFICATE >", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDCERTFICATE >=", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateLessThan(String value) {
            addCriterion("FUNDCERTFICATE <", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateLessThanOrEqualTo(String value) {
            addCriterion("FUNDCERTFICATE <=", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateLike(String value) {
            addCriterion("FUNDCERTFICATE like", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateNotLike(String value) {
            addCriterion("FUNDCERTFICATE not like", value, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateIn(List<String> values) {
            addCriterion("FUNDCERTFICATE in", values, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateNotIn(List<String> values) {
            addCriterion("FUNDCERTFICATE not in", values, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateBetween(String value1, String value2) {
            addCriterion("FUNDCERTFICATE between", value1, value2, "fundcertficate");
            return (Criteria) this;
        }

        public Criteria andFundcertficateNotBetween(String value1, String value2) {
            addCriterion("FUNDCERTFICATE not between", value1, value2, "fundcertficate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}