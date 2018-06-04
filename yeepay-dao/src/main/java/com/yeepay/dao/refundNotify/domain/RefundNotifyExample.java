package com.yeepay.dao.refundNotify.domain;

import java.util.ArrayList;
import java.util.List;

public class RefundNotifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public RefundNotifyExample() {
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

        public Criteria andRefundRequestIdIsNull() {
            addCriterion("refund_request_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdIsNotNull() {
            addCriterion("refund_request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdEqualTo(String value) {
            addCriterion("refund_request_id =", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdNotEqualTo(String value) {
            addCriterion("refund_request_id <>", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdGreaterThan(String value) {
            addCriterion("refund_request_id >", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("refund_request_id >=", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdLessThan(String value) {
            addCriterion("refund_request_id <", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdLessThanOrEqualTo(String value) {
            addCriterion("refund_request_id <=", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdLike(String value) {
            addCriterion("refund_request_id like", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdNotLike(String value) {
            addCriterion("refund_request_id not like", value, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdIn(List<String> values) {
            addCriterion("refund_request_id in", values, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdNotIn(List<String> values) {
            addCriterion("refund_request_id not in", values, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdBetween(String value1, String value2) {
            addCriterion("refund_request_id between", value1, value2, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andRefundRequestIdNotBetween(String value1, String value2) {
            addCriterion("refund_request_id not between", value1, value2, "refundRequestId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoIsNull() {
            addCriterion("unique_refund_no is null");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoIsNotNull() {
            addCriterion("unique_refund_no is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoEqualTo(String value) {
            addCriterion("unique_refund_no =", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoNotEqualTo(String value) {
            addCriterion("unique_refund_no <>", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoGreaterThan(String value) {
            addCriterion("unique_refund_no >", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("unique_refund_no >=", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoLessThan(String value) {
            addCriterion("unique_refund_no <", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoLessThanOrEqualTo(String value) {
            addCriterion("unique_refund_no <=", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoLike(String value) {
            addCriterion("unique_refund_no like", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoNotLike(String value) {
            addCriterion("unique_refund_no not like", value, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoIn(List<String> values) {
            addCriterion("unique_refund_no in", values, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoNotIn(List<String> values) {
            addCriterion("unique_refund_no not in", values, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoBetween(String value1, String value2) {
            addCriterion("unique_refund_no between", value1, value2, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andUniqueRefundNoNotBetween(String value1, String value2) {
            addCriterion("unique_refund_no not between", value1, value2, "uniqueRefundNo");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(String value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(String value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(String value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(String value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(String value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(String value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLike(String value) {
            addCriterion("refund_amount like", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotLike(String value) {
            addCriterion("refund_amount not like", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<String> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<String> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(String value1, String value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(String value1, String value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateIsNull() {
            addCriterion("refund_request_date is null");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateIsNotNull() {
            addCriterion("refund_request_date is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateEqualTo(String value) {
            addCriterion("refund_request_date =", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateNotEqualTo(String value) {
            addCriterion("refund_request_date <>", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateGreaterThan(String value) {
            addCriterion("refund_request_date >", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateGreaterThanOrEqualTo(String value) {
            addCriterion("refund_request_date >=", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateLessThan(String value) {
            addCriterion("refund_request_date <", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateLessThanOrEqualTo(String value) {
            addCriterion("refund_request_date <=", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateLike(String value) {
            addCriterion("refund_request_date like", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateNotLike(String value) {
            addCriterion("refund_request_date not like", value, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateIn(List<String> values) {
            addCriterion("refund_request_date in", values, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateNotIn(List<String> values) {
            addCriterion("refund_request_date not in", values, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateBetween(String value1, String value2) {
            addCriterion("refund_request_date between", value1, value2, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundRequestDateNotBetween(String value1, String value2) {
            addCriterion("refund_request_date not between", value1, value2, "refundRequestDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateIsNull() {
            addCriterion("refund_success_date is null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateIsNotNull() {
            addCriterion("refund_success_date is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateEqualTo(String value) {
            addCriterion("refund_success_date =", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateNotEqualTo(String value) {
            addCriterion("refund_success_date <>", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateGreaterThan(String value) {
            addCriterion("refund_success_date >", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateGreaterThanOrEqualTo(String value) {
            addCriterion("refund_success_date >=", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateLessThan(String value) {
            addCriterion("refund_success_date <", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateLessThanOrEqualTo(String value) {
            addCriterion("refund_success_date <=", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateLike(String value) {
            addCriterion("refund_success_date like", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateNotLike(String value) {
            addCriterion("refund_success_date not like", value, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateIn(List<String> values) {
            addCriterion("refund_success_date in", values, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateNotIn(List<String> values) {
            addCriterion("refund_success_date not in", values, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateBetween(String value1, String value2) {
            addCriterion("refund_success_date between", value1, value2, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessDateNotBetween(String value1, String value2) {
            addCriterion("refund_success_date not between", value1, value2, "refundSuccessDate");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(String value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(String value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(String value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(String value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(String value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(String value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLike(String value) {
            addCriterion("order_amount like", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotLike(String value) {
            addCriterion("order_amount not like", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<String> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<String> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(String value1, String value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(String value1, String value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountIsNull() {
            addCriterion("residual_amount is null");
            return (Criteria) this;
        }

        public Criteria andResidualAmountIsNotNull() {
            addCriterion("residual_amount is not null");
            return (Criteria) this;
        }

        public Criteria andResidualAmountEqualTo(String value) {
            addCriterion("residual_amount =", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountNotEqualTo(String value) {
            addCriterion("residual_amount <>", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountGreaterThan(String value) {
            addCriterion("residual_amount >", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountGreaterThanOrEqualTo(String value) {
            addCriterion("residual_amount >=", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountLessThan(String value) {
            addCriterion("residual_amount <", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountLessThanOrEqualTo(String value) {
            addCriterion("residual_amount <=", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountLike(String value) {
            addCriterion("residual_amount like", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountNotLike(String value) {
            addCriterion("residual_amount not like", value, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountIn(List<String> values) {
            addCriterion("residual_amount in", values, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountNotIn(List<String> values) {
            addCriterion("residual_amount not in", values, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountBetween(String value1, String value2) {
            addCriterion("residual_amount between", value1, value2, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andResidualAmountNotBetween(String value1, String value2) {
            addCriterion("residual_amount not between", value1, value2, "residualAmount");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNull() {
            addCriterion("error_message is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNotNull() {
            addCriterion("error_message is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageEqualTo(String value) {
            addCriterion("error_message =", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("error_message <>", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("error_message >", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("error_message >=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThan(String value) {
            addCriterion("error_message <", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("error_message <=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLike(String value) {
            addCriterion("error_message like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotLike(String value) {
            addCriterion("error_message not like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIn(List<String> values) {
            addCriterion("error_message in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("error_message not in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("error_message between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("error_message not between", value1, value2, "errorMessage");
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