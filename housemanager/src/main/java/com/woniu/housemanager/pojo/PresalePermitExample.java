package com.woniu.housemanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class PresalePermitExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public PresalePermitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
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
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
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

        public Criteria andPspidIsNull() {
            addCriterion("pspid is null");
            return (Criteria) this;
        }

        public Criteria andPspidIsNotNull() {
            addCriterion("pspid is not null");
            return (Criteria) this;
        }

        public Criteria andPspidEqualTo(Integer value) {
            addCriterion("pspid =", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotEqualTo(Integer value) {
            addCriterion("pspid <>", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidGreaterThan(Integer value) {
            addCriterion("pspid >", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pspid >=", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLessThan(Integer value) {
            addCriterion("pspid <", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidLessThanOrEqualTo(Integer value) {
            addCriterion("pspid <=", value, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidIn(List<Integer> values) {
            addCriterion("pspid in", values, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotIn(List<Integer> values) {
            addCriterion("pspid not in", values, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidBetween(Integer value1, Integer value2) {
            addCriterion("pspid between", value1, value2, "pspid");
            return (Criteria) this;
        }

        public Criteria andPspidNotBetween(Integer value1, Integer value2) {
            addCriterion("pspid not between", value1, value2, "pspid");
            return (Criteria) this;
        }

        public Criteria andBdidIsNull() {
            addCriterion("bdid is null");
            return (Criteria) this;
        }

        public Criteria andBdidIsNotNull() {
            addCriterion("bdid is not null");
            return (Criteria) this;
        }

        public Criteria andBdidEqualTo(Integer value) {
            addCriterion("bdid =", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotEqualTo(Integer value) {
            addCriterion("bdid <>", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThan(Integer value) {
            addCriterion("bdid >", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdid >=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThan(Integer value) {
            addCriterion("bdid <", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThanOrEqualTo(Integer value) {
            addCriterion("bdid <=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidIn(List<Integer> values) {
            addCriterion("bdid in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotIn(List<Integer> values) {
            addCriterion("bdid not in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidBetween(Integer value1, Integer value2) {
            addCriterion("bdid between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotBetween(Integer value1, Integer value2) {
            addCriterion("bdid not between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBuildingidIsNull() {
            addCriterion("buildingid is null");
            return (Criteria) this;
        }

        public Criteria andBuildingidIsNotNull() {
            addCriterion("buildingid is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingidEqualTo(Integer value) {
            addCriterion("buildingid =", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotEqualTo(Integer value) {
            addCriterion("buildingid <>", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidGreaterThan(Integer value) {
            addCriterion("buildingid >", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("buildingid >=", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidLessThan(Integer value) {
            addCriterion("buildingid <", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidLessThanOrEqualTo(Integer value) {
            addCriterion("buildingid <=", value, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidIn(List<Integer> values) {
            addCriterion("buildingid in", values, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotIn(List<Integer> values) {
            addCriterion("buildingid not in", values, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidBetween(Integer value1, Integer value2) {
            addCriterion("buildingid between", value1, value2, "buildingid");
            return (Criteria) this;
        }

        public Criteria andBuildingidNotBetween(Integer value1, Integer value2) {
            addCriterion("buildingid not between", value1, value2, "buildingid");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNull() {
            addCriterion("checkid is null");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNotNull() {
            addCriterion("checkid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckidEqualTo(Integer value) {
            addCriterion("checkid =", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotEqualTo(Integer value) {
            addCriterion("checkid <>", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThan(Integer value) {
            addCriterion("checkid >", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkid >=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThan(Integer value) {
            addCriterion("checkid <", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThanOrEqualTo(Integer value) {
            addCriterion("checkid <=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidIn(List<Integer> values) {
            addCriterion("checkid in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotIn(List<Integer> values) {
            addCriterion("checkid not in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidBetween(Integer value1, Integer value2) {
            addCriterion("checkid between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkid not between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeIsNull() {
            addCriterion("presalepermitcode is null");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeIsNotNull() {
            addCriterion("presalepermitcode is not null");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeEqualTo(String value) {
            addCriterion("presalepermitcode =", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeNotEqualTo(String value) {
            addCriterion("presalepermitcode <>", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeGreaterThan(String value) {
            addCriterion("presalepermitcode >", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("presalepermitcode >=", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeLessThan(String value) {
            addCriterion("presalepermitcode <", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeLessThanOrEqualTo(String value) {
            addCriterion("presalepermitcode <=", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeLike(String value) {
            addCriterion("presalepermitcode like", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeNotLike(String value) {
            addCriterion("presalepermitcode not like", value, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeIn(List<String> values) {
            addCriterion("presalepermitcode in", values, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeNotIn(List<String> values) {
            addCriterion("presalepermitcode not in", values, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeBetween(String value1, String value2) {
            addCriterion("presalepermitcode between", value1, value2, "presalepermitcode");
            return (Criteria) this;
        }

        public Criteria andPresalepermitcodeNotBetween(String value1, String value2) {
            addCriterion("presalepermitcode not between", value1, value2, "presalepermitcode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table presalepermit
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 07 17:07:39 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table presalepermit
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
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