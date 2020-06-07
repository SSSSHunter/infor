package com.woniu.housemanager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BussnessstatusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public BussnessstatusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
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
     * This method corresponds to the database table bussnessstatus
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
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
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
     * This class corresponds to the database table bussnessstatus
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBsidIsNull() {
            addCriterion("bsid is null");
            return (Criteria) this;
        }

        public Criteria andBsidIsNotNull() {
            addCriterion("bsid is not null");
            return (Criteria) this;
        }

        public Criteria andBsidEqualTo(String value) {
            addCriterion("bsid =", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotEqualTo(String value) {
            addCriterion("bsid <>", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThan(String value) {
            addCriterion("bsid >", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThanOrEqualTo(String value) {
            addCriterion("bsid >=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThan(String value) {
            addCriterion("bsid <", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThanOrEqualTo(String value) {
            addCriterion("bsid <=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLike(String value) {
            addCriterion("bsid like", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotLike(String value) {
            addCriterion("bsid not like", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidIn(List<String> values) {
            addCriterion("bsid in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotIn(List<String> values) {
            addCriterion("bsid not in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidBetween(String value1, String value2) {
            addCriterion("bsid between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotBetween(String value1, String value2) {
            addCriterion("bsid not between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andHiidIsNull() {
            addCriterion("hiid is null");
            return (Criteria) this;
        }

        public Criteria andHiidIsNotNull() {
            addCriterion("hiid is not null");
            return (Criteria) this;
        }

        public Criteria andHiidEqualTo(Integer value) {
            addCriterion("hiid =", value, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidNotEqualTo(Integer value) {
            addCriterion("hiid <>", value, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidGreaterThan(Integer value) {
            addCriterion("hiid >", value, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hiid >=", value, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidLessThan(Integer value) {
            addCriterion("hiid <", value, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidLessThanOrEqualTo(Integer value) {
            addCriterion("hiid <=", value, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidIn(List<Integer> values) {
            addCriterion("hiid in", values, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidNotIn(List<Integer> values) {
            addCriterion("hiid not in", values, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidBetween(Integer value1, Integer value2) {
            addCriterion("hiid between", value1, value2, "hiid");
            return (Criteria) this;
        }

        public Criteria andHiidNotBetween(Integer value1, Integer value2) {
            addCriterion("hiid not between", value1, value2, "hiid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNull() {
            addCriterion("mortgageid is null");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNotNull() {
            addCriterion("mortgageid is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageidEqualTo(Integer value) {
            addCriterion("mortgageid =", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotEqualTo(Integer value) {
            addCriterion("mortgageid <>", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThan(Integer value) {
            addCriterion("mortgageid >", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mortgageid >=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThan(Integer value) {
            addCriterion("mortgageid <", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThanOrEqualTo(Integer value) {
            addCriterion("mortgageid <=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIn(List<Integer> values) {
            addCriterion("mortgageid in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotIn(List<Integer> values) {
            addCriterion("mortgageid not in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidBetween(Integer value1, Integer value2) {
            addCriterion("mortgageid between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotBetween(Integer value1, Integer value2) {
            addCriterion("mortgageid not between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workid not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidIsNull() {
            addCriterion("housetransferid is null");
            return (Criteria) this;
        }

        public Criteria andHousetransferidIsNotNull() {
            addCriterion("housetransferid is not null");
            return (Criteria) this;
        }

        public Criteria andHousetransferidEqualTo(Integer value) {
            addCriterion("housetransferid =", value, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidNotEqualTo(Integer value) {
            addCriterion("housetransferid <>", value, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidGreaterThan(Integer value) {
            addCriterion("housetransferid >", value, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidGreaterThanOrEqualTo(Integer value) {
            addCriterion("housetransferid >=", value, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidLessThan(Integer value) {
            addCriterion("housetransferid <", value, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidLessThanOrEqualTo(Integer value) {
            addCriterion("housetransferid <=", value, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidIn(List<Integer> values) {
            addCriterion("housetransferid in", values, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidNotIn(List<Integer> values) {
            addCriterion("housetransferid not in", values, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidBetween(Integer value1, Integer value2) {
            addCriterion("housetransferid between", value1, value2, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andHousetransferidNotBetween(Integer value1, Integer value2) {
            addCriterion("housetransferid not between", value1, value2, "housetransferid");
            return (Criteria) this;
        }

        public Criteria andBsstatusIsNull() {
            addCriterion("bsstatus is null");
            return (Criteria) this;
        }

        public Criteria andBsstatusIsNotNull() {
            addCriterion("bsstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBsstatusEqualTo(String value) {
            addCriterion("bsstatus =", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusNotEqualTo(String value) {
            addCriterion("bsstatus <>", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusGreaterThan(String value) {
            addCriterion("bsstatus >", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("bsstatus >=", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusLessThan(String value) {
            addCriterion("bsstatus <", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusLessThanOrEqualTo(String value) {
            addCriterion("bsstatus <=", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusLike(String value) {
            addCriterion("bsstatus like", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusNotLike(String value) {
            addCriterion("bsstatus not like", value, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusIn(List<String> values) {
            addCriterion("bsstatus in", values, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusNotIn(List<String> values) {
            addCriterion("bsstatus not in", values, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusBetween(String value1, String value2) {
            addCriterion("bsstatus between", value1, value2, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsstatusNotBetween(String value1, String value2) {
            addCriterion("bsstatus not between", value1, value2, "bsstatus");
            return (Criteria) this;
        }

        public Criteria andBsdateIsNull() {
            addCriterion("bsdate is null");
            return (Criteria) this;
        }

        public Criteria andBsdateIsNotNull() {
            addCriterion("bsdate is not null");
            return (Criteria) this;
        }

        public Criteria andBsdateEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate =", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate <>", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateGreaterThan(Date value) {
            addCriterionForJDBCDate("bsdate >", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate >=", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateLessThan(Date value) {
            addCriterionForJDBCDate("bsdate <", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bsdate <=", value, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateIn(List<Date> values) {
            addCriterionForJDBCDate("bsdate in", values, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bsdate not in", values, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bsdate between", value1, value2, "bsdate");
            return (Criteria) this;
        }

        public Criteria andBsdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bsdate not between", value1, value2, "bsdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bussnessstatus
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
     * This class corresponds to the database table bussnessstatus
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