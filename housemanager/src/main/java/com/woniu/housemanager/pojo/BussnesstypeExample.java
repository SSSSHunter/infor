package com.woniu.housemanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class BussnesstypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public BussnesstypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
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
     * This method corresponds to the database table bussnesstype
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
     * This method corresponds to the database table bussnesstype
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnesstype
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
     * This class corresponds to the database table bussnesstype
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

        public Criteria andBtidIsNull() {
            addCriterion("btid is null");
            return (Criteria) this;
        }

        public Criteria andBtidIsNotNull() {
            addCriterion("btid is not null");
            return (Criteria) this;
        }

        public Criteria andBtidEqualTo(Integer value) {
            addCriterion("btid =", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotEqualTo(Integer value) {
            addCriterion("btid <>", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThan(Integer value) {
            addCriterion("btid >", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("btid >=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThan(Integer value) {
            addCriterion("btid <", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThanOrEqualTo(Integer value) {
            addCriterion("btid <=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidIn(List<Integer> values) {
            addCriterion("btid in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotIn(List<Integer> values) {
            addCriterion("btid not in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidBetween(Integer value1, Integer value2) {
            addCriterion("btid between", value1, value2, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotBetween(Integer value1, Integer value2) {
            addCriterion("btid not between", value1, value2, "btid");
            return (Criteria) this;
        }

        public Criteria andBtnameIsNull() {
            addCriterion("btname is null");
            return (Criteria) this;
        }

        public Criteria andBtnameIsNotNull() {
            addCriterion("btname is not null");
            return (Criteria) this;
        }

        public Criteria andBtnameEqualTo(String value) {
            addCriterion("btname =", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameNotEqualTo(String value) {
            addCriterion("btname <>", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameGreaterThan(String value) {
            addCriterion("btname >", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameGreaterThanOrEqualTo(String value) {
            addCriterion("btname >=", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameLessThan(String value) {
            addCriterion("btname <", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameLessThanOrEqualTo(String value) {
            addCriterion("btname <=", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameLike(String value) {
            addCriterion("btname like", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameNotLike(String value) {
            addCriterion("btname not like", value, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameIn(List<String> values) {
            addCriterion("btname in", values, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameNotIn(List<String> values) {
            addCriterion("btname not in", values, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameBetween(String value1, String value2) {
            addCriterion("btname between", value1, value2, "btname");
            return (Criteria) this;
        }

        public Criteria andBtnameNotBetween(String value1, String value2) {
            addCriterion("btname not between", value1, value2, "btname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bussnesstype
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
     * This class corresponds to the database table bussnesstype
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