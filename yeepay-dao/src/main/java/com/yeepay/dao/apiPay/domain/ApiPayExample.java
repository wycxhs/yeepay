package com.yeepay.dao.apiPay.domain;

import java.util.ArrayList;
import java.util.List;

public class ApiPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public ApiPayExample() {
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

        public Criteria andPayToolIsNull() {
            addCriterion("pay_tool is null");
            return (Criteria) this;
        }

        public Criteria andPayToolIsNotNull() {
            addCriterion("pay_tool is not null");
            return (Criteria) this;
        }

        public Criteria andPayToolEqualTo(String value) {
            addCriterion("pay_tool =", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolNotEqualTo(String value) {
            addCriterion("pay_tool <>", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolGreaterThan(String value) {
            addCriterion("pay_tool >", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolGreaterThanOrEqualTo(String value) {
            addCriterion("pay_tool >=", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolLessThan(String value) {
            addCriterion("pay_tool <", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolLessThanOrEqualTo(String value) {
            addCriterion("pay_tool <=", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolLike(String value) {
            addCriterion("pay_tool like", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolNotLike(String value) {
            addCriterion("pay_tool not like", value, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolIn(List<String> values) {
            addCriterion("pay_tool in", values, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolNotIn(List<String> values) {
            addCriterion("pay_tool not in", values, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolBetween(String value1, String value2) {
            addCriterion("pay_tool between", value1, value2, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayToolNotBetween(String value1, String value2) {
            addCriterion("pay_tool not between", value1, value2, "payTool");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoIsNull() {
            addCriterion("pay_empower_no is null");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoIsNotNull() {
            addCriterion("pay_empower_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoEqualTo(String value) {
            addCriterion("pay_empower_no =", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoNotEqualTo(String value) {
            addCriterion("pay_empower_no <>", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoGreaterThan(String value) {
            addCriterion("pay_empower_no >", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoGreaterThanOrEqualTo(String value) {
            addCriterion("pay_empower_no >=", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoLessThan(String value) {
            addCriterion("pay_empower_no <", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoLessThanOrEqualTo(String value) {
            addCriterion("pay_empower_no <=", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoLike(String value) {
            addCriterion("pay_empower_no like", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoNotLike(String value) {
            addCriterion("pay_empower_no not like", value, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoIn(List<String> values) {
            addCriterion("pay_empower_no in", values, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoNotIn(List<String> values) {
            addCriterion("pay_empower_no not in", values, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoBetween(String value1, String value2) {
            addCriterion("pay_empower_no between", value1, value2, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andPayEmpowerNoNotBetween(String value1, String value2) {
            addCriterion("pay_empower_no not between", value1, value2, "payEmpowerNo");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdIsNull() {
            addCriterion("merchant_terminal_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdIsNotNull() {
            addCriterion("merchant_terminal_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdEqualTo(String value) {
            addCriterion("merchant_terminal_id =", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdNotEqualTo(String value) {
            addCriterion("merchant_terminal_id <>", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdGreaterThan(String value) {
            addCriterion("merchant_terminal_id >", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_terminal_id >=", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdLessThan(String value) {
            addCriterion("merchant_terminal_id <", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_terminal_id <=", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdLike(String value) {
            addCriterion("merchant_terminal_id like", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdNotLike(String value) {
            addCriterion("merchant_terminal_id not like", value, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdIn(List<String> values) {
            addCriterion("merchant_terminal_id in", values, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdNotIn(List<String> values) {
            addCriterion("merchant_terminal_id not in", values, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdBetween(String value1, String value2) {
            addCriterion("merchant_terminal_id between", value1, value2, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantTerminalIdNotBetween(String value1, String value2) {
            addCriterion("merchant_terminal_id not between", value1, value2, "merchantTerminalId");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoIsNull() {
            addCriterion("merchant_store_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoIsNotNull() {
            addCriterion("merchant_store_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoEqualTo(String value) {
            addCriterion("merchant_store_no =", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoNotEqualTo(String value) {
            addCriterion("merchant_store_no <>", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoGreaterThan(String value) {
            addCriterion("merchant_store_no >", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_store_no >=", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoLessThan(String value) {
            addCriterion("merchant_store_no <", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_store_no <=", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoLike(String value) {
            addCriterion("merchant_store_no like", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoNotLike(String value) {
            addCriterion("merchant_store_no not like", value, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoIn(List<String> values) {
            addCriterion("merchant_store_no in", values, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoNotIn(List<String> values) {
            addCriterion("merchant_store_no not in", values, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoBetween(String value1, String value2) {
            addCriterion("merchant_store_no between", value1, value2, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andMerchantStoreNoNotBetween(String value1, String value2) {
            addCriterion("merchant_store_no not between", value1, value2, "merchantStoreNo");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("user_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("user_ip =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("user_ip <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("user_ip >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_ip >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("user_ip <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("user_ip <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("user_ip like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("user_ip not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("user_ip in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("user_ip not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("user_ip between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("user_ip not between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andResultTypeIsNull() {
            addCriterion("result_type is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNotNull() {
            addCriterion("result_type is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeEqualTo(String value) {
            addCriterion("result_type =", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotEqualTo(String value) {
            addCriterion("result_type <>", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThan(String value) {
            addCriterion("result_type >", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThanOrEqualTo(String value) {
            addCriterion("result_type >=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThan(String value) {
            addCriterion("result_type <", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThanOrEqualTo(String value) {
            addCriterion("result_type <=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLike(String value) {
            addCriterion("result_type like", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotLike(String value) {
            addCriterion("result_type not like", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeIn(List<String> values) {
            addCriterion("result_type in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotIn(List<String> values) {
            addCriterion("result_type not in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeBetween(String value1, String value2) {
            addCriterion("result_type between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotBetween(String value1, String value2) {
            addCriterion("result_type not between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultDataIsNull() {
            addCriterion("result_data is null");
            return (Criteria) this;
        }

        public Criteria andResultDataIsNotNull() {
            addCriterion("result_data is not null");
            return (Criteria) this;
        }

        public Criteria andResultDataEqualTo(String value) {
            addCriterion("result_data =", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataNotEqualTo(String value) {
            addCriterion("result_data <>", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataGreaterThan(String value) {
            addCriterion("result_data >", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataGreaterThanOrEqualTo(String value) {
            addCriterion("result_data >=", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataLessThan(String value) {
            addCriterion("result_data <", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataLessThanOrEqualTo(String value) {
            addCriterion("result_data <=", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataLike(String value) {
            addCriterion("result_data like", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataNotLike(String value) {
            addCriterion("result_data not like", value, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataIn(List<String> values) {
            addCriterion("result_data in", values, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataNotIn(List<String> values) {
            addCriterion("result_data not in", values, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataBetween(String value1, String value2) {
            addCriterion("result_data between", value1, value2, "resultData");
            return (Criteria) this;
        }

        public Criteria andResultDataNotBetween(String value1, String value2) {
            addCriterion("result_data not between", value1, value2, "resultData");
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