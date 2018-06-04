package com.yeepay.dao.divide.domain;

import java.util.ArrayList;
import java.util.List;

public class DivideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public DivideExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitLength(int limitLength) {
        this.limitLength=limitLength;
    }

    public int getLimitLength() {
        return limitLength;
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoIsNull() {
            addCriterion("parent_merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoIsNotNull() {
            addCriterion("parent_merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoEqualTo(String value) {
            addCriterion("parent_merchant_no =", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotEqualTo(String value) {
            addCriterion("parent_merchant_no <>", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoGreaterThan(String value) {
            addCriterion("parent_merchant_no >", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("parent_merchant_no >=", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoLessThan(String value) {
            addCriterion("parent_merchant_no <", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("parent_merchant_no <=", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoLike(String value) {
            addCriterion("parent_merchant_no like", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotLike(String value) {
            addCriterion("parent_merchant_no not like", value, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoIn(List<String> values) {
            addCriterion("parent_merchant_no in", values, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotIn(List<String> values) {
            addCriterion("parent_merchant_no not in", values, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoBetween(String value1, String value2) {
            addCriterion("parent_merchant_no between", value1, value2, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNoNotBetween(String value1, String value2) {
            addCriterion("parent_merchant_no not between", value1, value2, "parentMerchantNo");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoIsNull() {
            addCriterion("unique_order_no is null");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoIsNotNull() {
            addCriterion("unique_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoEqualTo(String value) {
            addCriterion("unique_order_no =", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoNotEqualTo(String value) {
            addCriterion("unique_order_no <>", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoGreaterThan(String value) {
            addCriterion("unique_order_no >", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("unique_order_no >=", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoLessThan(String value) {
            addCriterion("unique_order_no <", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoLessThanOrEqualTo(String value) {
            addCriterion("unique_order_no <=", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoLike(String value) {
            addCriterion("unique_order_no like", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoNotLike(String value) {
            addCriterion("unique_order_no not like", value, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoIn(List<String> values) {
            addCriterion("unique_order_no in", values, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoNotIn(List<String> values) {
            addCriterion("unique_order_no not in", values, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoBetween(String value1, String value2) {
            addCriterion("unique_order_no between", value1, value2, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andUniqueOrderNoNotBetween(String value1, String value2) {
            addCriterion("unique_order_no not between", value1, value2, "uniqueOrderNo");
            return (Criteria) this;
        }

        public Criteria andHmacIsNull() {
            addCriterion("hmac is null");
            return (Criteria) this;
        }

        public Criteria andHmacIsNotNull() {
            addCriterion("hmac is not null");
            return (Criteria) this;
        }

        public Criteria andHmacEqualTo(String value) {
            addCriterion("hmac =", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacNotEqualTo(String value) {
            addCriterion("hmac <>", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacGreaterThan(String value) {
            addCriterion("hmac >", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacGreaterThanOrEqualTo(String value) {
            addCriterion("hmac >=", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacLessThan(String value) {
            addCriterion("hmac <", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacLessThanOrEqualTo(String value) {
            addCriterion("hmac <=", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacLike(String value) {
            addCriterion("hmac like", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacNotLike(String value) {
            addCriterion("hmac not like", value, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacIn(List<String> values) {
            addCriterion("hmac in", values, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacNotIn(List<String> values) {
            addCriterion("hmac not in", values, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacBetween(String value1, String value2) {
            addCriterion("hmac between", value1, value2, "hmac");
            return (Criteria) this;
        }

        public Criteria andHmacNotBetween(String value1, String value2) {
            addCriterion("hmac not between", value1, value2, "hmac");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdIsNull() {
            addCriterion("divide_request_id is null");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdIsNotNull() {
            addCriterion("divide_request_id is not null");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdEqualTo(String value) {
            addCriterion("divide_request_id =", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdNotEqualTo(String value) {
            addCriterion("divide_request_id <>", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdGreaterThan(String value) {
            addCriterion("divide_request_id >", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("divide_request_id >=", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdLessThan(String value) {
            addCriterion("divide_request_id <", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdLessThanOrEqualTo(String value) {
            addCriterion("divide_request_id <=", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdLike(String value) {
            addCriterion("divide_request_id like", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdNotLike(String value) {
            addCriterion("divide_request_id not like", value, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdIn(List<String> values) {
            addCriterion("divide_request_id in", values, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdNotIn(List<String> values) {
            addCriterion("divide_request_id not in", values, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdBetween(String value1, String value2) {
            addCriterion("divide_request_id between", value1, value2, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideRequestIdNotBetween(String value1, String value2) {
            addCriterion("divide_request_id not between", value1, value2, "divideRequestId");
            return (Criteria) this;
        }

        public Criteria andDivideDetailIsNull() {
            addCriterion("divide_detail is null");
            return (Criteria) this;
        }

        public Criteria andDivideDetailIsNotNull() {
            addCriterion("divide_detail is not null");
            return (Criteria) this;
        }

        public Criteria andDivideDetailEqualTo(String value) {
            addCriterion("divide_detail =", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailNotEqualTo(String value) {
            addCriterion("divide_detail <>", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailGreaterThan(String value) {
            addCriterion("divide_detail >", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailGreaterThanOrEqualTo(String value) {
            addCriterion("divide_detail >=", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailLessThan(String value) {
            addCriterion("divide_detail <", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailLessThanOrEqualTo(String value) {
            addCriterion("divide_detail <=", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailLike(String value) {
            addCriterion("divide_detail like", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailNotLike(String value) {
            addCriterion("divide_detail not like", value, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailIn(List<String> values) {
            addCriterion("divide_detail in", values, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailNotIn(List<String> values) {
            addCriterion("divide_detail not in", values, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailBetween(String value1, String value2) {
            addCriterion("divide_detail between", value1, value2, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andDivideDetailNotBetween(String value1, String value2) {
            addCriterion("divide_detail not between", value1, value2, "divideDetail");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtIsNull() {
            addCriterion("info_param_ext is null");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtIsNotNull() {
            addCriterion("info_param_ext is not null");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtEqualTo(String value) {
            addCriterion("info_param_ext =", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtNotEqualTo(String value) {
            addCriterion("info_param_ext <>", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtGreaterThan(String value) {
            addCriterion("info_param_ext >", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtGreaterThanOrEqualTo(String value) {
            addCriterion("info_param_ext >=", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtLessThan(String value) {
            addCriterion("info_param_ext <", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtLessThanOrEqualTo(String value) {
            addCriterion("info_param_ext <=", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtLike(String value) {
            addCriterion("info_param_ext like", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtNotLike(String value) {
            addCriterion("info_param_ext not like", value, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtIn(List<String> values) {
            addCriterion("info_param_ext in", values, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtNotIn(List<String> values) {
            addCriterion("info_param_ext not in", values, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtBetween(String value1, String value2) {
            addCriterion("info_param_ext between", value1, value2, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andInfoParamExtNotBetween(String value1, String value2) {
            addCriterion("info_param_ext not between", value1, value2, "infoParamExt");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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