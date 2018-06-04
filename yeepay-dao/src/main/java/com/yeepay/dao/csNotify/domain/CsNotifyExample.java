package com.yeepay.dao.csNotify.domain;

import java.util.ArrayList;
import java.util.List;

public class CsNotifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public CsNotifyExample() {
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

        public Criteria andCsSuccessDateIsNull() {
            addCriterion("cs_success_date is null");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateIsNotNull() {
            addCriterion("cs_success_date is not null");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateEqualTo(String value) {
            addCriterion("cs_success_date =", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateNotEqualTo(String value) {
            addCriterion("cs_success_date <>", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateGreaterThan(String value) {
            addCriterion("cs_success_date >", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateGreaterThanOrEqualTo(String value) {
            addCriterion("cs_success_date >=", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateLessThan(String value) {
            addCriterion("cs_success_date <", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateLessThanOrEqualTo(String value) {
            addCriterion("cs_success_date <=", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateLike(String value) {
            addCriterion("cs_success_date like", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateNotLike(String value) {
            addCriterion("cs_success_date not like", value, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateIn(List<String> values) {
            addCriterion("cs_success_date in", values, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateNotIn(List<String> values) {
            addCriterion("cs_success_date not in", values, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateBetween(String value1, String value2) {
            addCriterion("cs_success_date between", value1, value2, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andCsSuccessDateNotBetween(String value1, String value2) {
            addCriterion("cs_success_date not between", value1, value2, "csSuccessDate");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeIsNull() {
            addCriterion("merchant_fee is null");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeIsNotNull() {
            addCriterion("merchant_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeEqualTo(String value) {
            addCriterion("merchant_fee =", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeNotEqualTo(String value) {
            addCriterion("merchant_fee <>", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeGreaterThan(String value) {
            addCriterion("merchant_fee >", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_fee >=", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeLessThan(String value) {
            addCriterion("merchant_fee <", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeLessThanOrEqualTo(String value) {
            addCriterion("merchant_fee <=", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeLike(String value) {
            addCriterion("merchant_fee like", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeNotLike(String value) {
            addCriterion("merchant_fee not like", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeIn(List<String> values) {
            addCriterion("merchant_fee in", values, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeNotIn(List<String> values) {
            addCriterion("merchant_fee not in", values, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeBetween(String value1, String value2) {
            addCriterion("merchant_fee between", value1, value2, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeNotBetween(String value1, String value2) {
            addCriterion("merchant_fee not between", value1, value2, "merchantFee");
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