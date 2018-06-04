package com.yeepay.dao.multiRefundQuery.domain;

import java.util.ArrayList;
import java.util.List;

public class MultiRefundQueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public MultiRefundQueryExample() {
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

        public Criteria andRequestDateBeginIsNull() {
            addCriterion("request_date_begin is null");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginIsNotNull() {
            addCriterion("request_date_begin is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginEqualTo(String value) {
            addCriterion("request_date_begin =", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginNotEqualTo(String value) {
            addCriterion("request_date_begin <>", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginGreaterThan(String value) {
            addCriterion("request_date_begin >", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginGreaterThanOrEqualTo(String value) {
            addCriterion("request_date_begin >=", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginLessThan(String value) {
            addCriterion("request_date_begin <", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginLessThanOrEqualTo(String value) {
            addCriterion("request_date_begin <=", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginLike(String value) {
            addCriterion("request_date_begin like", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginNotLike(String value) {
            addCriterion("request_date_begin not like", value, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginIn(List<String> values) {
            addCriterion("request_date_begin in", values, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginNotIn(List<String> values) {
            addCriterion("request_date_begin not in", values, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginBetween(String value1, String value2) {
            addCriterion("request_date_begin between", value1, value2, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateBeginNotBetween(String value1, String value2) {
            addCriterion("request_date_begin not between", value1, value2, "requestDateBegin");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndIsNull() {
            addCriterion("request_date_end is null");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndIsNotNull() {
            addCriterion("request_date_end is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndEqualTo(String value) {
            addCriterion("request_date_end =", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndNotEqualTo(String value) {
            addCriterion("request_date_end <>", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndGreaterThan(String value) {
            addCriterion("request_date_end >", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndGreaterThanOrEqualTo(String value) {
            addCriterion("request_date_end >=", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndLessThan(String value) {
            addCriterion("request_date_end <", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndLessThanOrEqualTo(String value) {
            addCriterion("request_date_end <=", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndLike(String value) {
            addCriterion("request_date_end like", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndNotLike(String value) {
            addCriterion("request_date_end not like", value, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndIn(List<String> values) {
            addCriterion("request_date_end in", values, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndNotIn(List<String> values) {
            addCriterion("request_date_end not in", values, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndBetween(String value1, String value2) {
            addCriterion("request_date_end between", value1, value2, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andRequestDateEndNotBetween(String value1, String value2) {
            addCriterion("request_date_end not between", value1, value2, "requestDateEnd");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNull() {
            addCriterion("page_no is null");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNotNull() {
            addCriterion("page_no is not null");
            return (Criteria) this;
        }

        public Criteria andPageNoEqualTo(String value) {
            addCriterion("page_no =", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotEqualTo(String value) {
            addCriterion("page_no <>", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThan(String value) {
            addCriterion("page_no >", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThanOrEqualTo(String value) {
            addCriterion("page_no >=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThan(String value) {
            addCriterion("page_no <", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThanOrEqualTo(String value) {
            addCriterion("page_no <=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLike(String value) {
            addCriterion("page_no like", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotLike(String value) {
            addCriterion("page_no not like", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoIn(List<String> values) {
            addCriterion("page_no in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotIn(List<String> values) {
            addCriterion("page_no not in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoBetween(String value1, String value2) {
            addCriterion("page_no between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotBetween(String value1, String value2) {
            addCriterion("page_no not between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageSizeIsNull() {
            addCriterion("page_size is null");
            return (Criteria) this;
        }

        public Criteria andPageSizeIsNotNull() {
            addCriterion("page_size is not null");
            return (Criteria) this;
        }

        public Criteria andPageSizeEqualTo(String value) {
            addCriterion("page_size =", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotEqualTo(String value) {
            addCriterion("page_size <>", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeGreaterThan(String value) {
            addCriterion("page_size >", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeGreaterThanOrEqualTo(String value) {
            addCriterion("page_size >=", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeLessThan(String value) {
            addCriterion("page_size <", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeLessThanOrEqualTo(String value) {
            addCriterion("page_size <=", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeLike(String value) {
            addCriterion("page_size like", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotLike(String value) {
            addCriterion("page_size not like", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeIn(List<String> values) {
            addCriterion("page_size in", values, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotIn(List<String> values) {
            addCriterion("page_size not in", values, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeBetween(String value1, String value2) {
            addCriterion("page_size between", value1, value2, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotBetween(String value1, String value2) {
            addCriterion("page_size not between", value1, value2, "pageSize");
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

        public Criteria andTotalRecordsIsNull() {
            addCriterion("total_records is null");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsIsNotNull() {
            addCriterion("total_records is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsEqualTo(String value) {
            addCriterion("total_records =", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsNotEqualTo(String value) {
            addCriterion("total_records <>", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsGreaterThan(String value) {
            addCriterion("total_records >", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("total_records >=", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsLessThan(String value) {
            addCriterion("total_records <", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsLessThanOrEqualTo(String value) {
            addCriterion("total_records <=", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsLike(String value) {
            addCriterion("total_records like", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsNotLike(String value) {
            addCriterion("total_records not like", value, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsIn(List<String> values) {
            addCriterion("total_records in", values, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsNotIn(List<String> values) {
            addCriterion("total_records not in", values, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsBetween(String value1, String value2) {
            addCriterion("total_records between", value1, value2, "totalRecords");
            return (Criteria) this;
        }

        public Criteria andTotalRecordsNotBetween(String value1, String value2) {
            addCriterion("total_records not between", value1, value2, "totalRecords");
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