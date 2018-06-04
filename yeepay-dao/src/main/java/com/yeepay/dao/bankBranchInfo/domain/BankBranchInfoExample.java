package com.yeepay.dao.bankBranchInfo.domain;

import java.util.ArrayList;
import java.util.List;

public class BankBranchInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public BankBranchInfoExample() {
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

        public Criteria andHeadBankCodeIsNull() {
            addCriterion("head_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeIsNotNull() {
            addCriterion("head_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeEqualTo(String value) {
            addCriterion("head_bank_code =", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotEqualTo(String value) {
            addCriterion("head_bank_code <>", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeGreaterThan(String value) {
            addCriterion("head_bank_code >", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("head_bank_code >=", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeLessThan(String value) {
            addCriterion("head_bank_code <", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeLessThanOrEqualTo(String value) {
            addCriterion("head_bank_code <=", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeLike(String value) {
            addCriterion("head_bank_code like", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotLike(String value) {
            addCriterion("head_bank_code not like", value, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeIn(List<String> values) {
            addCriterion("head_bank_code in", values, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotIn(List<String> values) {
            addCriterion("head_bank_code not in", values, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeBetween(String value1, String value2) {
            addCriterion("head_bank_code between", value1, value2, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andHeadBankCodeNotBetween(String value1, String value2) {
            addCriterion("head_bank_code not between", value1, value2, "headBankCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoIsNull() {
            addCriterion("branch_bank_info is null");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoIsNotNull() {
            addCriterion("branch_bank_info is not null");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoEqualTo(String value) {
            addCriterion("branch_bank_info =", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoNotEqualTo(String value) {
            addCriterion("branch_bank_info <>", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoGreaterThan(String value) {
            addCriterion("branch_bank_info >", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoGreaterThanOrEqualTo(String value) {
            addCriterion("branch_bank_info >=", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoLessThan(String value) {
            addCriterion("branch_bank_info <", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoLessThanOrEqualTo(String value) {
            addCriterion("branch_bank_info <=", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoLike(String value) {
            addCriterion("branch_bank_info like", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoNotLike(String value) {
            addCriterion("branch_bank_info not like", value, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoIn(List<String> values) {
            addCriterion("branch_bank_info in", values, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoNotIn(List<String> values) {
            addCriterion("branch_bank_info not in", values, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoBetween(String value1, String value2) {
            addCriterion("branch_bank_info between", value1, value2, "branchBankInfo");
            return (Criteria) this;
        }

        public Criteria andBranchBankInfoNotBetween(String value1, String value2) {
            addCriterion("branch_bank_info not between", value1, value2, "branchBankInfo");
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