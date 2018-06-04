package com.yeepay.dao.tradeOrder.domain;

import java.util.ArrayList;
import java.util.List;

public class TradeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitLength = -1;

    public TradeOrderExample() {
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

        public Criteria andTimeoutExpressIsNull() {
            addCriterion("timeout_express is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressIsNotNull() {
            addCriterion("timeout_express is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressEqualTo(String value) {
            addCriterion("timeout_express =", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressNotEqualTo(String value) {
            addCriterion("timeout_express <>", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressGreaterThan(String value) {
            addCriterion("timeout_express >", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressGreaterThanOrEqualTo(String value) {
            addCriterion("timeout_express >=", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressLessThan(String value) {
            addCriterion("timeout_express <", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressLessThanOrEqualTo(String value) {
            addCriterion("timeout_express <=", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressLike(String value) {
            addCriterion("timeout_express like", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressNotLike(String value) {
            addCriterion("timeout_express not like", value, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressIn(List<String> values) {
            addCriterion("timeout_express in", values, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressNotIn(List<String> values) {
            addCriterion("timeout_express not in", values, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressBetween(String value1, String value2) {
            addCriterion("timeout_express between", value1, value2, "timeoutExpress");
            return (Criteria) this;
        }

        public Criteria andTimeoutExpressNotBetween(String value1, String value2) {
            addCriterion("timeout_express not between", value1, value2, "timeoutExpress");
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

        public Criteria andRedirectUrlIsNull() {
            addCriterion("redirect_url is null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIsNotNull() {
            addCriterion("redirect_url is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlEqualTo(String value) {
            addCriterion("redirect_url =", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotEqualTo(String value) {
            addCriterion("redirect_url <>", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThan(String value) {
            addCriterion("redirect_url >", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_url >=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThan(String value) {
            addCriterion("redirect_url <", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThanOrEqualTo(String value) {
            addCriterion("redirect_url <=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLike(String value) {
            addCriterion("redirect_url like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotLike(String value) {
            addCriterion("redirect_url not like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIn(List<String> values) {
            addCriterion("redirect_url in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotIn(List<String> values) {
            addCriterion("redirect_url not in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlBetween(String value1, String value2) {
            addCriterion("redirect_url between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotBetween(String value1, String value2) {
            addCriterion("redirect_url not between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
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

        public Criteria andPaymentParamExtIsNull() {
            addCriterion("payment_param_ext is null");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtIsNotNull() {
            addCriterion("payment_param_ext is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtEqualTo(String value) {
            addCriterion("payment_param_ext =", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtNotEqualTo(String value) {
            addCriterion("payment_param_ext <>", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtGreaterThan(String value) {
            addCriterion("payment_param_ext >", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtGreaterThanOrEqualTo(String value) {
            addCriterion("payment_param_ext >=", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtLessThan(String value) {
            addCriterion("payment_param_ext <", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtLessThanOrEqualTo(String value) {
            addCriterion("payment_param_ext <=", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtLike(String value) {
            addCriterion("payment_param_ext like", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtNotLike(String value) {
            addCriterion("payment_param_ext not like", value, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtIn(List<String> values) {
            addCriterion("payment_param_ext in", values, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtNotIn(List<String> values) {
            addCriterion("payment_param_ext not in", values, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtBetween(String value1, String value2) {
            addCriterion("payment_param_ext between", value1, value2, "paymentParamExt");
            return (Criteria) this;
        }

        public Criteria andPaymentParamExtNotBetween(String value1, String value2) {
            addCriterion("payment_param_ext not between", value1, value2, "paymentParamExt");
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

        public Criteria andRiskParamExtIsNull() {
            addCriterion("risk_param_ext is null");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtIsNotNull() {
            addCriterion("risk_param_ext is not null");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtEqualTo(String value) {
            addCriterion("risk_param_ext =", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtNotEqualTo(String value) {
            addCriterion("risk_param_ext <>", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtGreaterThan(String value) {
            addCriterion("risk_param_ext >", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtGreaterThanOrEqualTo(String value) {
            addCriterion("risk_param_ext >=", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtLessThan(String value) {
            addCriterion("risk_param_ext <", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtLessThanOrEqualTo(String value) {
            addCriterion("risk_param_ext <=", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtLike(String value) {
            addCriterion("risk_param_ext like", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtNotLike(String value) {
            addCriterion("risk_param_ext not like", value, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtIn(List<String> values) {
            addCriterion("risk_param_ext in", values, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtNotIn(List<String> values) {
            addCriterion("risk_param_ext not in", values, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtBetween(String value1, String value2) {
            addCriterion("risk_param_ext between", value1, value2, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andRiskParamExtNotBetween(String value1, String value2) {
            addCriterion("risk_param_ext not between", value1, value2, "riskParamExt");
            return (Criteria) this;
        }

        public Criteria andCsUrlIsNull() {
            addCriterion("cs_url is null");
            return (Criteria) this;
        }

        public Criteria andCsUrlIsNotNull() {
            addCriterion("cs_url is not null");
            return (Criteria) this;
        }

        public Criteria andCsUrlEqualTo(String value) {
            addCriterion("cs_url =", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlNotEqualTo(String value) {
            addCriterion("cs_url <>", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlGreaterThan(String value) {
            addCriterion("cs_url >", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cs_url >=", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlLessThan(String value) {
            addCriterion("cs_url <", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlLessThanOrEqualTo(String value) {
            addCriterion("cs_url <=", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlLike(String value) {
            addCriterion("cs_url like", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlNotLike(String value) {
            addCriterion("cs_url not like", value, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlIn(List<String> values) {
            addCriterion("cs_url in", values, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlNotIn(List<String> values) {
            addCriterion("cs_url not in", values, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlBetween(String value1, String value2) {
            addCriterion("cs_url between", value1, value2, "csUrl");
            return (Criteria) this;
        }

        public Criteria andCsUrlNotBetween(String value1, String value2) {
            addCriterion("cs_url not between", value1, value2, "csUrl");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeIsNull() {
            addCriterion("fund_process_type is null");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeIsNotNull() {
            addCriterion("fund_process_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeEqualTo(String value) {
            addCriterion("fund_process_type =", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeNotEqualTo(String value) {
            addCriterion("fund_process_type <>", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeGreaterThan(String value) {
            addCriterion("fund_process_type >", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_process_type >=", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeLessThan(String value) {
            addCriterion("fund_process_type <", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeLessThanOrEqualTo(String value) {
            addCriterion("fund_process_type <=", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeLike(String value) {
            addCriterion("fund_process_type like", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeNotLike(String value) {
            addCriterion("fund_process_type not like", value, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeIn(List<String> values) {
            addCriterion("fund_process_type in", values, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeNotIn(List<String> values) {
            addCriterion("fund_process_type not in", values, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeBetween(String value1, String value2) {
            addCriterion("fund_process_type between", value1, value2, "fundProcessType");
            return (Criteria) this;
        }

        public Criteria andFundProcessTypeNotBetween(String value1, String value2) {
            addCriterion("fund_process_type not between", value1, value2, "fundProcessType");
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

        public Criteria andDivideNotifyUrlIsNull() {
            addCriterion("divide_notify_url is null");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlIsNotNull() {
            addCriterion("divide_notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlEqualTo(String value) {
            addCriterion("divide_notify_url =", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlNotEqualTo(String value) {
            addCriterion("divide_notify_url <>", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlGreaterThan(String value) {
            addCriterion("divide_notify_url >", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("divide_notify_url >=", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlLessThan(String value) {
            addCriterion("divide_notify_url <", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("divide_notify_url <=", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlLike(String value) {
            addCriterion("divide_notify_url like", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlNotLike(String value) {
            addCriterion("divide_notify_url not like", value, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlIn(List<String> values) {
            addCriterion("divide_notify_url in", values, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlNotIn(List<String> values) {
            addCriterion("divide_notify_url not in", values, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlBetween(String value1, String value2) {
            addCriterion("divide_notify_url between", value1, value2, "divideNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andDivideNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("divide_notify_url not between", value1, value2, "divideNotifyUrl");
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