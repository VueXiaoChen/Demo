package com.example.wiki.domain;

import java.util.ArrayList;
import java.util.List;

public class CoursesTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursesTypeExample() {
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

        public Criteria andCoursestypeidIsNull() {
            addCriterion("COURSESTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidIsNotNull() {
            addCriterion("COURSESTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidEqualTo(Long value) {
            addCriterion("COURSESTYPEID =", value, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidNotEqualTo(Long value) {
            addCriterion("COURSESTYPEID <>", value, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidGreaterThan(Long value) {
            addCriterion("COURSESTYPEID >", value, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("COURSESTYPEID >=", value, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidLessThan(Long value) {
            addCriterion("COURSESTYPEID <", value, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidLessThanOrEqualTo(Long value) {
            addCriterion("COURSESTYPEID <=", value, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidIn(List<Long> values) {
            addCriterion("COURSESTYPEID in", values, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidNotIn(List<Long> values) {
            addCriterion("COURSESTYPEID not in", values, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidBetween(Long value1, Long value2) {
            addCriterion("COURSESTYPEID between", value1, value2, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeidNotBetween(Long value1, Long value2) {
            addCriterion("COURSESTYPEID not between", value1, value2, "coursestypeid");
            return (Criteria) this;
        }

        public Criteria andCoursestypeIsNull() {
            addCriterion("COURSESTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCoursestypeIsNotNull() {
            addCriterion("COURSESTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestypeEqualTo(String value) {
            addCriterion("COURSESTYPE =", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeNotEqualTo(String value) {
            addCriterion("COURSESTYPE <>", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeGreaterThan(String value) {
            addCriterion("COURSESTYPE >", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeGreaterThanOrEqualTo(String value) {
            addCriterion("COURSESTYPE >=", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeLessThan(String value) {
            addCriterion("COURSESTYPE <", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeLessThanOrEqualTo(String value) {
            addCriterion("COURSESTYPE <=", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeLike(String value) {
            addCriterion("COURSESTYPE like", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeNotLike(String value) {
            addCriterion("COURSESTYPE not like", value, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeIn(List<String> values) {
            addCriterion("COURSESTYPE in", values, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeNotIn(List<String> values) {
            addCriterion("COURSESTYPE not in", values, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeBetween(String value1, String value2) {
            addCriterion("COURSESTYPE between", value1, value2, "coursestype");
            return (Criteria) this;
        }

        public Criteria andCoursestypeNotBetween(String value1, String value2) {
            addCriterion("COURSESTYPE not between", value1, value2, "coursestype");
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