package com.example.wiki.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswerPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerPaperExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andPapereidIsNull() {
            addCriterion("PAPEREID is null");
            return (Criteria) this;
        }

        public Criteria andPapereidIsNotNull() {
            addCriterion("PAPEREID is not null");
            return (Criteria) this;
        }

        public Criteria andPapereidEqualTo(Long value) {
            addCriterion("PAPEREID =", value, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidNotEqualTo(Long value) {
            addCriterion("PAPEREID <>", value, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidGreaterThan(Long value) {
            addCriterion("PAPEREID >", value, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidGreaterThanOrEqualTo(Long value) {
            addCriterion("PAPEREID >=", value, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidLessThan(Long value) {
            addCriterion("PAPEREID <", value, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidLessThanOrEqualTo(Long value) {
            addCriterion("PAPEREID <=", value, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidIn(List<Long> values) {
            addCriterion("PAPEREID in", values, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidNotIn(List<Long> values) {
            addCriterion("PAPEREID not in", values, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidBetween(Long value1, Long value2) {
            addCriterion("PAPEREID between", value1, value2, "papereid");
            return (Criteria) this;
        }

        public Criteria andPapereidNotBetween(Long value1, Long value2) {
            addCriterion("PAPEREID not between", value1, value2, "papereid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidIsNull() {
            addCriterion("STQDBNTID is null");
            return (Criteria) this;
        }

        public Criteria andStqdbntidIsNotNull() {
            addCriterion("STQDBNTID is not null");
            return (Criteria) this;
        }

        public Criteria andStqdbntidEqualTo(Long value) {
            addCriterion("STQDBNTID =", value, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidNotEqualTo(Long value) {
            addCriterion("STQDBNTID <>", value, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidGreaterThan(Long value) {
            addCriterion("STQDBNTID >", value, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidGreaterThanOrEqualTo(Long value) {
            addCriterion("STQDBNTID >=", value, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidLessThan(Long value) {
            addCriterion("STQDBNTID <", value, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidLessThanOrEqualTo(Long value) {
            addCriterion("STQDBNTID <=", value, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidIn(List<Long> values) {
            addCriterion("STQDBNTID in", values, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidNotIn(List<Long> values) {
            addCriterion("STQDBNTID not in", values, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidBetween(Long value1, Long value2) {
            addCriterion("STQDBNTID between", value1, value2, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andStqdbntidNotBetween(Long value1, Long value2) {
            addCriterion("STQDBNTID not between", value1, value2, "stqdbntid");
            return (Criteria) this;
        }

        public Criteria andBxamidIsNull() {
            addCriterion("BXAMID is null");
            return (Criteria) this;
        }

        public Criteria andBxamidIsNotNull() {
            addCriterion("BXAMID is not null");
            return (Criteria) this;
        }

        public Criteria andBxamidEqualTo(Long value) {
            addCriterion("BXAMID =", value, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidNotEqualTo(Long value) {
            addCriterion("BXAMID <>", value, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidGreaterThan(Long value) {
            addCriterion("BXAMID >", value, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidGreaterThanOrEqualTo(Long value) {
            addCriterion("BXAMID >=", value, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidLessThan(Long value) {
            addCriterion("BXAMID <", value, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidLessThanOrEqualTo(Long value) {
            addCriterion("BXAMID <=", value, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidIn(List<Long> values) {
            addCriterion("BXAMID in", values, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidNotIn(List<Long> values) {
            addCriterion("BXAMID not in", values, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidBetween(Long value1, Long value2) {
            addCriterion("BXAMID between", value1, value2, "bxamid");
            return (Criteria) this;
        }

        public Criteria andBxamidNotBetween(Long value1, Long value2) {
            addCriterion("BXAMID not between", value1, value2, "bxamid");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNull() {
            addCriterion("TOTALSCORE is null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIsNotNull() {
            addCriterion("TOTALSCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalscoreEqualTo(BigDecimal value) {
            addCriterion("TOTALSCORE =", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotEqualTo(BigDecimal value) {
            addCriterion("TOTALSCORE <>", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThan(BigDecimal value) {
            addCriterion("TOTALSCORE >", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSCORE >=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThan(BigDecimal value) {
            addCriterion("TOTALSCORE <", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSCORE <=", value, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreIn(List<BigDecimal> values) {
            addCriterion("TOTALSCORE in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotIn(List<BigDecimal> values) {
            addCriterion("TOTALSCORE not in", values, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSCORE between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andTotalscoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSCORE not between", value1, value2, "totalscore");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNull() {
            addCriterion("AVAILABILITY is null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNotNull() {
            addCriterion("AVAILABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityEqualTo(String value) {
            addCriterion("AVAILABILITY =", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotEqualTo(String value) {
            addCriterion("AVAILABILITY <>", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThan(String value) {
            addCriterion("AVAILABILITY >", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThanOrEqualTo(String value) {
            addCriterion("AVAILABILITY >=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThan(String value) {
            addCriterion("AVAILABILITY <", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThanOrEqualTo(String value) {
            addCriterion("AVAILABILITY <=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLike(String value) {
            addCriterion("AVAILABILITY like", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotLike(String value) {
            addCriterion("AVAILABILITY not like", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIn(List<String> values) {
            addCriterion("AVAILABILITY in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotIn(List<String> values) {
            addCriterion("AVAILABILITY not in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityBetween(String value1, String value2) {
            addCriterion("AVAILABILITY between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotBetween(String value1, String value2) {
            addCriterion("AVAILABILITY not between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andSubmittiheIsNull() {
            addCriterion("SUBMITTIHE is null");
            return (Criteria) this;
        }

        public Criteria andSubmittiheIsNotNull() {
            addCriterion("SUBMITTIHE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittiheEqualTo(Date value) {
            addCriterion("SUBMITTIHE =", value, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheNotEqualTo(Date value) {
            addCriterion("SUBMITTIHE <>", value, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheGreaterThan(Date value) {
            addCriterion("SUBMITTIHE >", value, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMITTIHE >=", value, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheLessThan(Date value) {
            addCriterion("SUBMITTIHE <", value, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheLessThanOrEqualTo(Date value) {
            addCriterion("SUBMITTIHE <=", value, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheIn(List<Date> values) {
            addCriterion("SUBMITTIHE in", values, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheNotIn(List<Date> values) {
            addCriterion("SUBMITTIHE not in", values, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheBetween(Date value1, Date value2) {
            addCriterion("SUBMITTIHE between", value1, value2, "submittihe");
            return (Criteria) this;
        }

        public Criteria andSubmittiheNotBetween(Date value1, Date value2) {
            addCriterion("SUBMITTIHE not between", value1, value2, "submittihe");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNull() {
            addCriterion("ISFINISH is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNotNull() {
            addCriterion("ISFINISH is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishEqualTo(String value) {
            addCriterion("ISFINISH =", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotEqualTo(String value) {
            addCriterion("ISFINISH <>", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThan(String value) {
            addCriterion("ISFINISH >", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThanOrEqualTo(String value) {
            addCriterion("ISFINISH >=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThan(String value) {
            addCriterion("ISFINISH <", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThanOrEqualTo(String value) {
            addCriterion("ISFINISH <=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLike(String value) {
            addCriterion("ISFINISH like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotLike(String value) {
            addCriterion("ISFINISH not like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishIn(List<String> values) {
            addCriterion("ISFINISH in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotIn(List<String> values) {
            addCriterion("ISFINISH not in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishBetween(String value1, String value2) {
            addCriterion("ISFINISH between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotBetween(String value1, String value2) {
            addCriterion("ISFINISH not between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("URI is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("URI is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("URI =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("URI <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("URI >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("URI >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("URI <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("URI <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("URI like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("URI not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("URI in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("URI not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("URI between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("URI not between", value1, value2, "uri");
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