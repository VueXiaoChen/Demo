package com.example.wiki.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExamPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamPaperExample() {
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

        public Criteria andPapbreidIsNull() {
            addCriterion("PAPBREID is null");
            return (Criteria) this;
        }

        public Criteria andPapbreidIsNotNull() {
            addCriterion("PAPBREID is not null");
            return (Criteria) this;
        }

        public Criteria andPapbreidEqualTo(Long value) {
            addCriterion("PAPBREID =", value, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidNotEqualTo(Long value) {
            addCriterion("PAPBREID <>", value, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidGreaterThan(Long value) {
            addCriterion("PAPBREID >", value, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidGreaterThanOrEqualTo(Long value) {
            addCriterion("PAPBREID >=", value, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidLessThan(Long value) {
            addCriterion("PAPBREID <", value, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidLessThanOrEqualTo(Long value) {
            addCriterion("PAPBREID <=", value, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidIn(List<Long> values) {
            addCriterion("PAPBREID in", values, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidNotIn(List<Long> values) {
            addCriterion("PAPBREID not in", values, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidBetween(Long value1, Long value2) {
            addCriterion("PAPBREID between", value1, value2, "papbreid");
            return (Criteria) this;
        }

        public Criteria andPapbreidNotBetween(Long value1, Long value2) {
            addCriterion("PAPBREID not between", value1, value2, "papbreid");
            return (Criteria) this;
        }

        public Criteria andExamidIsNull() {
            addCriterion("EXAMID is null");
            return (Criteria) this;
        }

        public Criteria andExamidIsNotNull() {
            addCriterion("EXAMID is not null");
            return (Criteria) this;
        }

        public Criteria andExamidEqualTo(Long value) {
            addCriterion("EXAMID =", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotEqualTo(Long value) {
            addCriterion("EXAMID <>", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThan(Long value) {
            addCriterion("EXAMID >", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThanOrEqualTo(Long value) {
            addCriterion("EXAMID >=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThan(Long value) {
            addCriterion("EXAMID <", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThanOrEqualTo(Long value) {
            addCriterion("EXAMID <=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidIn(List<Long> values) {
            addCriterion("EXAMID in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotIn(List<Long> values) {
            addCriterion("EXAMID not in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidBetween(Long value1, Long value2) {
            addCriterion("EXAMID between", value1, value2, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotBetween(Long value1, Long value2) {
            addCriterion("EXAMID not between", value1, value2, "examid");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("COURSEID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("COURSEID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Long value) {
            addCriterion("COURSEID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Long value) {
            addCriterion("COURSEID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Long value) {
            addCriterion("COURSEID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("COURSEID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Long value) {
            addCriterion("COURSEID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Long value) {
            addCriterion("COURSEID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Long> values) {
            addCriterion("COURSEID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Long> values) {
            addCriterion("COURSEID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Long value1, Long value2) {
            addCriterion("COURSEID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Long value1, Long value2) {
            addCriterion("COURSEID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNull() {
            addCriterion("PUBLISHERID is null");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNotNull() {
            addCriterion("PUBLISHERID is not null");
            return (Criteria) this;
        }

        public Criteria andPublisheridEqualTo(Long value) {
            addCriterion("PUBLISHERID =", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotEqualTo(Long value) {
            addCriterion("PUBLISHERID <>", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThan(Long value) {
            addCriterion("PUBLISHERID >", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThanOrEqualTo(Long value) {
            addCriterion("PUBLISHERID >=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThan(Long value) {
            addCriterion("PUBLISHERID <", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThanOrEqualTo(Long value) {
            addCriterion("PUBLISHERID <=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridIn(List<Long> values) {
            addCriterion("PUBLISHERID in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotIn(List<Long> values) {
            addCriterion("PUBLISHERID not in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridBetween(Long value1, Long value2) {
            addCriterion("PUBLISHERID between", value1, value2, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotBetween(Long value1, Long value2) {
            addCriterion("PUBLISHERID not between", value1, value2, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPapercodeIsNull() {
            addCriterion("PAPERCODE is null");
            return (Criteria) this;
        }

        public Criteria andPapercodeIsNotNull() {
            addCriterion("PAPERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPapercodeEqualTo(String value) {
            addCriterion("PAPERCODE =", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeNotEqualTo(String value) {
            addCriterion("PAPERCODE <>", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeGreaterThan(String value) {
            addCriterion("PAPERCODE >", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAPERCODE >=", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeLessThan(String value) {
            addCriterion("PAPERCODE <", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeLessThanOrEqualTo(String value) {
            addCriterion("PAPERCODE <=", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeLike(String value) {
            addCriterion("PAPERCODE like", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeNotLike(String value) {
            addCriterion("PAPERCODE not like", value, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeIn(List<String> values) {
            addCriterion("PAPERCODE in", values, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeNotIn(List<String> values) {
            addCriterion("PAPERCODE not in", values, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeBetween(String value1, String value2) {
            addCriterion("PAPERCODE between", value1, value2, "papercode");
            return (Criteria) this;
        }

        public Criteria andPapercodeNotBetween(String value1, String value2) {
            addCriterion("PAPERCODE not between", value1, value2, "papercode");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
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

        public Criteria andSubmitstatbIsNull() {
            addCriterion("SUBMITSTATB is null");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbIsNotNull() {
            addCriterion("SUBMITSTATB is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbEqualTo(Short value) {
            addCriterion("SUBMITSTATB =", value, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbNotEqualTo(Short value) {
            addCriterion("SUBMITSTATB <>", value, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbGreaterThan(Short value) {
            addCriterion("SUBMITSTATB >", value, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbGreaterThanOrEqualTo(Short value) {
            addCriterion("SUBMITSTATB >=", value, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbLessThan(Short value) {
            addCriterion("SUBMITSTATB <", value, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbLessThanOrEqualTo(Short value) {
            addCriterion("SUBMITSTATB <=", value, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbIn(List<Short> values) {
            addCriterion("SUBMITSTATB in", values, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbNotIn(List<Short> values) {
            addCriterion("SUBMITSTATB not in", values, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbBetween(Short value1, Short value2) {
            addCriterion("SUBMITSTATB between", value1, value2, "submitstatb");
            return (Criteria) this;
        }

        public Criteria andSubmitstatbNotBetween(Short value1, Short value2) {
            addCriterion("SUBMITSTATB not between", value1, value2, "submitstatb");
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