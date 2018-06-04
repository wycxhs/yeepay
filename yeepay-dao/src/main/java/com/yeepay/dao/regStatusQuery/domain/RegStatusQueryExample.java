package com.yeepay.dao.regStatusQuery.domain;

import java.util.ArrayList;
import java.util.List;

public class RegStatusQueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public RegStatusQueryExample() {
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

        public Criteria andRequestNoIsNull() {
            addCriterion("request_no is null");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNotNull() {
            addCriterion("request_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequestNoEqualTo(String value) {
            addCriterion("request_no =", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotEqualTo(String value) {
            addCriterion("request_no <>", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThan(String value) {
            addCriterion("request_no >", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThanOrEqualTo(String value) {
            addCriterion("request_no >=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThan(String value) {
            addCriterion("request_no <", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThanOrEqualTo(String value) {
            addCriterion("request_no <=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLike(String value) {
            addCriterion("request_no like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotLike(String value) {
            addCriterion("request_no not like", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoIn(List<String> values) {
            addCriterion("request_no in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotIn(List<String> values) {
            addCriterion("request_no not in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoBetween(String value1, String value2) {
            addCriterion("request_no between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotBetween(String value1, String value2) {
            addCriterion("request_no not between", value1, value2, "requestNo");
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

        public Criteria andReturnCodeIsNull() {
            addCriterion("return_code is null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("return_code is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeEqualTo(String value) {
            addCriterion("return_code =", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotEqualTo(String value) {
            addCriterion("return_code <>", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThan(String value) {
            addCriterion("return_code >", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("return_code >=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThan(String value) {
            addCriterion("return_code <", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("return_code <=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLike(String value) {
            addCriterion("return_code like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotLike(String value) {
            addCriterion("return_code not like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIn(List<String> values) {
            addCriterion("return_code in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotIn(List<String> values) {
            addCriterion("return_code not in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeBetween(String value1, String value2) {
            addCriterion("return_code between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotBetween(String value1, String value2) {
            addCriterion("return_code not between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNull() {
            addCriterion("return_msg is null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNotNull() {
            addCriterion("return_msg is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgEqualTo(String value) {
            addCriterion("return_msg =", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotEqualTo(String value) {
            addCriterion("return_msg <>", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThan(String value) {
            addCriterion("return_msg >", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThanOrEqualTo(String value) {
            addCriterion("return_msg >=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThan(String value) {
            addCriterion("return_msg <", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThanOrEqualTo(String value) {
            addCriterion("return_msg <=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLike(String value) {
            addCriterion("return_msg like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotLike(String value) {
            addCriterion("return_msg not like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIn(List<String> values) {
            addCriterion("return_msg in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotIn(List<String> values) {
            addCriterion("return_msg not in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgBetween(String value1, String value2) {
            addCriterion("return_msg between", value1, value2, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotBetween(String value1, String value2) {
            addCriterion("return_msg not between", value1, value2, "returnMsg");
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

        public Criteria andExternalIdIsNull() {
            addCriterion("external_id is null");
            return (Criteria) this;
        }

        public Criteria andExternalIdIsNotNull() {
            addCriterion("external_id is not null");
            return (Criteria) this;
        }

        public Criteria andExternalIdEqualTo(String value) {
            addCriterion("external_id =", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotEqualTo(String value) {
            addCriterion("external_id <>", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdGreaterThan(String value) {
            addCriterion("external_id >", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdGreaterThanOrEqualTo(String value) {
            addCriterion("external_id >=", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLessThan(String value) {
            addCriterion("external_id <", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLessThanOrEqualTo(String value) {
            addCriterion("external_id <=", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLike(String value) {
            addCriterion("external_id like", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotLike(String value) {
            addCriterion("external_id not like", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdIn(List<String> values) {
            addCriterion("external_id in", values, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotIn(List<String> values) {
            addCriterion("external_id not in", values, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdBetween(String value1, String value2) {
            addCriterion("external_id between", value1, value2, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotBetween(String value1, String value2) {
            addCriterion("external_id not between", value1, value2, "externalId");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusIsNull() {
            addCriterion("mer_net_in_out_status is null");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusIsNotNull() {
            addCriterion("mer_net_in_out_status is not null");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusEqualTo(String value) {
            addCriterion("mer_net_in_out_status =", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusNotEqualTo(String value) {
            addCriterion("mer_net_in_out_status <>", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusGreaterThan(String value) {
            addCriterion("mer_net_in_out_status >", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mer_net_in_out_status >=", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusLessThan(String value) {
            addCriterion("mer_net_in_out_status <", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusLessThanOrEqualTo(String value) {
            addCriterion("mer_net_in_out_status <=", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusLike(String value) {
            addCriterion("mer_net_in_out_status like", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusNotLike(String value) {
            addCriterion("mer_net_in_out_status not like", value, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusIn(List<String> values) {
            addCriterion("mer_net_in_out_status in", values, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusNotIn(List<String> values) {
            addCriterion("mer_net_in_out_status not in", values, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusBetween(String value1, String value2) {
            addCriterion("mer_net_in_out_status between", value1, value2, "merNetInOutStatus");
            return (Criteria) this;
        }

        public Criteria andMerNetInOutStatusNotBetween(String value1, String value2) {
            addCriterion("mer_net_in_out_status not between", value1, value2, "merNetInOutStatus");
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