package com.woniu.housemanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class LandPropertyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public LandPropertyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
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

        public Criteria andLpidIsNull() {
            addCriterion("lpid is null");
            return (Criteria) this;
        }

        public Criteria andLpidIsNotNull() {
            addCriterion("lpid is not null");
            return (Criteria) this;
        }

        public Criteria andLpidEqualTo(Integer value) {
            addCriterion("lpid =", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidNotEqualTo(Integer value) {
            addCriterion("lpid <>", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidGreaterThan(Integer value) {
            addCriterion("lpid >", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lpid >=", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidLessThan(Integer value) {
            addCriterion("lpid <", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidLessThanOrEqualTo(Integer value) {
            addCriterion("lpid <=", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidIn(List<Integer> values) {
            addCriterion("lpid in", values, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidNotIn(List<Integer> values) {
            addCriterion("lpid not in", values, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidBetween(Integer value1, Integer value2) {
            addCriterion("lpid between", value1, value2, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidNotBetween(Integer value1, Integer value2) {
            addCriterion("lpid not between", value1, value2, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpnameIsNull() {
            addCriterion("lpname is null");
            return (Criteria) this;
        }

        public Criteria andLpnameIsNotNull() {
            addCriterion("lpname is not null");
            return (Criteria) this;
        }

        public Criteria andLpnameEqualTo(String value) {
            addCriterion("lpname =", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameNotEqualTo(String value) {
            addCriterion("lpname <>", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameGreaterThan(String value) {
            addCriterion("lpname >", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameGreaterThanOrEqualTo(String value) {
            addCriterion("lpname >=", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameLessThan(String value) {
            addCriterion("lpname <", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameLessThanOrEqualTo(String value) {
            addCriterion("lpname <=", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameLike(String value) {
            addCriterion("lpname like", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameNotLike(String value) {
            addCriterion("lpname not like", value, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameIn(List<String> values) {
            addCriterion("lpname in", values, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameNotIn(List<String> values) {
            addCriterion("lpname not in", values, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameBetween(String value1, String value2) {
            addCriterion("lpname between", value1, value2, "lpname");
            return (Criteria) this;
        }

        public Criteria andLpnameNotBetween(String value1, String value2) {
            addCriterion("lpname not between", value1, value2, "lpname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table landproperty
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 07 17:07:38 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table landproperty
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
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