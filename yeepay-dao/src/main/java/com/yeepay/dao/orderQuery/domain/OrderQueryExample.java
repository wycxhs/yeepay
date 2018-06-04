package com.yeepay.dao.orderQuery.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderQueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public OrderQueryExample() {
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

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(String value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(String value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(String value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(String value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(String value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(String value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLike(String value) {
            addCriterion("pay_amount like", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotLike(String value) {
            addCriterion("pay_amount not like", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<String> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<String> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(String value1, String value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(String value1, String value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeIsNull() {
            addCriterion("customer_fee is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeIsNotNull() {
            addCriterion("customer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeEqualTo(String value) {
            addCriterion("customer_fee =", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeNotEqualTo(String value) {
            addCriterion("customer_fee <>", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeGreaterThan(String value) {
            addCriterion("customer_fee >", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_fee >=", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeLessThan(String value) {
            addCriterion("customer_fee <", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeLessThanOrEqualTo(String value) {
            addCriterion("customer_fee <=", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeLike(String value) {
            addCriterion("customer_fee like", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeNotLike(String value) {
            addCriterion("customer_fee not like", value, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeIn(List<String> values) {
            addCriterion("customer_fee in", values, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeNotIn(List<String> values) {
            addCriterion("customer_fee not in", values, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeBetween(String value1, String value2) {
            addCriterion("customer_fee between", value1, value2, "customerFee");
            return (Criteria) this;
        }

        public Criteria andCustomerFeeNotBetween(String value1, String value2) {
            addCriterion("customer_fee not between", value1, value2, "customerFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeIsNull() {
            addCriterion("mercahnt_fee is null");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeIsNotNull() {
            addCriterion("mercahnt_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeEqualTo(String value) {
            addCriterion("mercahnt_fee =", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeNotEqualTo(String value) {
            addCriterion("mercahnt_fee <>", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeGreaterThan(String value) {
            addCriterion("mercahnt_fee >", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeGreaterThanOrEqualTo(String value) {
            addCriterion("mercahnt_fee >=", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeLessThan(String value) {
            addCriterion("mercahnt_fee <", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeLessThanOrEqualTo(String value) {
            addCriterion("mercahnt_fee <=", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeLike(String value) {
            addCriterion("mercahnt_fee like", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeNotLike(String value) {
            addCriterion("mercahnt_fee not like", value, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeIn(List<String> values) {
            addCriterion("mercahnt_fee in", values, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeNotIn(List<String> values) {
            addCriterion("mercahnt_fee not in", values, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeBetween(String value1, String value2) {
            addCriterion("mercahnt_fee between", value1, value2, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andMercahntFeeNotBetween(String value1, String value2) {
            addCriterion("mercahnt_fee not between", value1, value2, "mercahntFee");
            return (Criteria) this;
        }

        public Criteria andRequestDateIsNull() {
            addCriterion("request_date is null");
            return (Criteria) this;
        }

        public Criteria andRequestDateIsNotNull() {
            addCriterion("request_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDateEqualTo(String value) {
            addCriterion("request_date =", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotEqualTo(String value) {
            addCriterion("request_date <>", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateGreaterThan(String value) {
            addCriterion("request_date >", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateGreaterThanOrEqualTo(String value) {
            addCriterion("request_date >=", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateLessThan(String value) {
            addCriterion("request_date <", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateLessThanOrEqualTo(String value) {
            addCriterion("request_date <=", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateLike(String value) {
            addCriterion("request_date like", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotLike(String value) {
            addCriterion("request_date not like", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateIn(List<String> values) {
            addCriterion("request_date in", values, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotIn(List<String> values) {
            addCriterion("request_date not in", values, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateBetween(String value1, String value2) {
            addCriterion("request_date between", value1, value2, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotBetween(String value1, String value2) {
            addCriterion("request_date not between", value1, value2, "requestDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateIsNull() {
            addCriterion("pay_success_date is null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateIsNotNull() {
            addCriterion("pay_success_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateEqualTo(String value) {
            addCriterion("pay_success_date =", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateNotEqualTo(String value) {
            addCriterion("pay_success_date <>", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateGreaterThan(String value) {
            addCriterion("pay_success_date >", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateGreaterThanOrEqualTo(String value) {
            addCriterion("pay_success_date >=", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateLessThan(String value) {
            addCriterion("pay_success_date <", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateLessThanOrEqualTo(String value) {
            addCriterion("pay_success_date <=", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateLike(String value) {
            addCriterion("pay_success_date like", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateNotLike(String value) {
            addCriterion("pay_success_date not like", value, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateIn(List<String> values) {
            addCriterion("pay_success_date in", values, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateNotIn(List<String> values) {
            addCriterion("pay_success_date not in", values, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateBetween(String value1, String value2) {
            addCriterion("pay_success_date between", value1, value2, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaySuccessDateNotBetween(String value1, String value2) {
            addCriterion("pay_success_date not between", value1, value2, "paySuccessDate");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtIsNull() {
            addCriterion("goods_param_ext is null");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtIsNotNull() {
            addCriterion("goods_param_ext is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtEqualTo(String value) {
            addCriterion("goods_param_ext =", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtNotEqualTo(String value) {
            addCriterion("goods_param_ext <>", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtGreaterThan(String value) {
            addCriterion("goods_param_ext >", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtGreaterThanOrEqualTo(String value) {
            addCriterion("goods_param_ext >=", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtLessThan(String value) {
            addCriterion("goods_param_ext <", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtLessThanOrEqualTo(String value) {
            addCriterion("goods_param_ext <=", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtLike(String value) {
            addCriterion("goods_param_ext like", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtNotLike(String value) {
            addCriterion("goods_param_ext not like", value, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtIn(List<String> values) {
            addCriterion("goods_param_ext in", values, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtNotIn(List<String> values) {
            addCriterion("goods_param_ext not in", values, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtBetween(String value1, String value2) {
            addCriterion("goods_param_ext between", value1, value2, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andGoodsParamExtNotBetween(String value1, String value2) {
            addCriterion("goods_param_ext not between", value1, value2, "goodsParamExt");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andInstCompanyIsNull() {
            addCriterion("inst_company is null");
            return (Criteria) this;
        }

        public Criteria andInstCompanyIsNotNull() {
            addCriterion("inst_company is not null");
            return (Criteria) this;
        }

        public Criteria andInstCompanyEqualTo(String value) {
            addCriterion("inst_company =", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyNotEqualTo(String value) {
            addCriterion("inst_company <>", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyGreaterThan(String value) {
            addCriterion("inst_company >", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("inst_company >=", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyLessThan(String value) {
            addCriterion("inst_company <", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyLessThanOrEqualTo(String value) {
            addCriterion("inst_company <=", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyLike(String value) {
            addCriterion("inst_company like", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyNotLike(String value) {
            addCriterion("inst_company not like", value, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyIn(List<String> values) {
            addCriterion("inst_company in", values, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyNotIn(List<String> values) {
            addCriterion("inst_company not in", values, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyBetween(String value1, String value2) {
            addCriterion("inst_company between", value1, value2, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstCompanyNotBetween(String value1, String value2) {
            addCriterion("inst_company not between", value1, value2, "instCompany");
            return (Criteria) this;
        }

        public Criteria andInstNumberIsNull() {
            addCriterion("inst_number is null");
            return (Criteria) this;
        }

        public Criteria andInstNumberIsNotNull() {
            addCriterion("inst_number is not null");
            return (Criteria) this;
        }

        public Criteria andInstNumberEqualTo(String value) {
            addCriterion("inst_number =", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberNotEqualTo(String value) {
            addCriterion("inst_number <>", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberGreaterThan(String value) {
            addCriterion("inst_number >", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberGreaterThanOrEqualTo(String value) {
            addCriterion("inst_number >=", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberLessThan(String value) {
            addCriterion("inst_number <", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberLessThanOrEqualTo(String value) {
            addCriterion("inst_number <=", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberLike(String value) {
            addCriterion("inst_number like", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberNotLike(String value) {
            addCriterion("inst_number not like", value, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberIn(List<String> values) {
            addCriterion("inst_number in", values, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberNotIn(List<String> values) {
            addCriterion("inst_number not in", values, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberBetween(String value1, String value2) {
            addCriterion("inst_number between", value1, value2, "instNumber");
            return (Criteria) this;
        }

        public Criteria andInstNumberNotBetween(String value1, String value2) {
            addCriterion("inst_number not between", value1, value2, "instNumber");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtIsNull() {
            addCriterion("industry_param_ext is null");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtIsNotNull() {
            addCriterion("industry_param_ext is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtEqualTo(String value) {
            addCriterion("industry_param_ext =", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtNotEqualTo(String value) {
            addCriterion("industry_param_ext <>", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtGreaterThan(String value) {
            addCriterion("industry_param_ext >", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtGreaterThanOrEqualTo(String value) {
            addCriterion("industry_param_ext >=", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtLessThan(String value) {
            addCriterion("industry_param_ext <", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtLessThanOrEqualTo(String value) {
            addCriterion("industry_param_ext <=", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtLike(String value) {
            addCriterion("industry_param_ext like", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtNotLike(String value) {
            addCriterion("industry_param_ext not like", value, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtIn(List<String> values) {
            addCriterion("industry_param_ext in", values, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtNotIn(List<String> values) {
            addCriterion("industry_param_ext not in", values, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtBetween(String value1, String value2) {
            addCriterion("industry_param_ext between", value1, value2, "industryParamExt");
            return (Criteria) this;
        }

        public Criteria andIndustryParamExtNotBetween(String value1, String value2) {
            addCriterion("industry_param_ext not between", value1, value2, "industryParamExt");
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