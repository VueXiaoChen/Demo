package com.example.wiki.domain;

import java.util.ArrayList;
import java.util.List;

public class ManagersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagersExample() {
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

        public Criteria andManagbridIsNull() {
            addCriterion("MANAGBRID is null");
            return (Criteria) this;
        }

        public Criteria andManagbridIsNotNull() {
            addCriterion("MANAGBRID is not null");
            return (Criteria) this;
        }

        public Criteria andManagbridEqualTo(Long value) {
            addCriterion("MANAGBRID =", value, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridNotEqualTo(Long value) {
            addCriterion("MANAGBRID <>", value, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridGreaterThan(Long value) {
            addCriterion("MANAGBRID >", value, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridGreaterThanOrEqualTo(Long value) {
            addCriterion("MANAGBRID >=", value, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridLessThan(Long value) {
            addCriterion("MANAGBRID <", value, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridLessThanOrEqualTo(Long value) {
            addCriterion("MANAGBRID <=", value, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridIn(List<Long> values) {
            addCriterion("MANAGBRID in", values, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridNotIn(List<Long> values) {
            addCriterion("MANAGBRID not in", values, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridBetween(Long value1, Long value2) {
            addCriterion("MANAGBRID between", value1, value2, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagbridNotBetween(Long value1, Long value2) {
            addCriterion("MANAGBRID not between", value1, value2, "managbrid");
            return (Criteria) this;
        }

        public Criteria andManagernaheIsNull() {
            addCriterion("MANAGERNAHE is null");
            return (Criteria) this;
        }

        public Criteria andManagernaheIsNotNull() {
            addCriterion("MANAGERNAHE is not null");
            return (Criteria) this;
        }

        public Criteria andManagernaheEqualTo(String value) {
            addCriterion("MANAGERNAHE =", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheNotEqualTo(String value) {
            addCriterion("MANAGERNAHE <>", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheGreaterThan(String value) {
            addCriterion("MANAGERNAHE >", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGERNAHE >=", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheLessThan(String value) {
            addCriterion("MANAGERNAHE <", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheLessThanOrEqualTo(String value) {
            addCriterion("MANAGERNAHE <=", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheLike(String value) {
            addCriterion("MANAGERNAHE like", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheNotLike(String value) {
            addCriterion("MANAGERNAHE not like", value, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheIn(List<String> values) {
            addCriterion("MANAGERNAHE in", values, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheNotIn(List<String> values) {
            addCriterion("MANAGERNAHE not in", values, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheBetween(String value1, String value2) {
            addCriterion("MANAGERNAHE between", value1, value2, "managernahe");
            return (Criteria) this;
        }

        public Criteria andManagernaheNotBetween(String value1, String value2) {
            addCriterion("MANAGERNAHE not between", value1, value2, "managernahe");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("DUTY =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("DUTY >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("DUTY <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("DUTY like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("DUTY not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("DUTY in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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