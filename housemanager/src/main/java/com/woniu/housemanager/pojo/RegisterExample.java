package com.woniu.housemanager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegisterExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public RegisterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
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
     * This method corresponds to the database table register
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
     * This method corresponds to the database table register
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
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
     * This class corresponds to the database table register
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

        public Criteria andRegistercodeIsNull() {
            addCriterion("registercode is null");
            return (Criteria) this;
        }

        public Criteria andRegistercodeIsNotNull() {
            addCriterion("registercode is not null");
            return (Criteria) this;
        }

        public Criteria andRegistercodeEqualTo(String value) {
            addCriterion("registercode =", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeNotEqualTo(String value) {
            addCriterion("registercode <>", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeGreaterThan(String value) {
            addCriterion("registercode >", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeGreaterThanOrEqualTo(String value) {
            addCriterion("registercode >=", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeLessThan(String value) {
            addCriterion("registercode <", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeLessThanOrEqualTo(String value) {
            addCriterion("registercode <=", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeLike(String value) {
            addCriterion("registercode like", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeNotLike(String value) {
            addCriterion("registercode not like", value, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeIn(List<String> values) {
            addCriterion("registercode in", values, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeNotIn(List<String> values) {
            addCriterion("registercode not in", values, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeBetween(String value1, String value2) {
            addCriterion("registercode between", value1, value2, "registercode");
            return (Criteria) this;
        }

        public Criteria andRegistercodeNotBetween(String value1, String value2) {
            addCriterion("registercode not between", value1, value2, "registercode");
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

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerdate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterionForJDBCDate("registerdate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterionForJDBCDate("registerdate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterionForJDBCDate("registerdate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registerdate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registerdate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registerdate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andQiudihaoIsNull() {
            addCriterion("qiudihao is null");
            return (Criteria) this;
        }

        public Criteria andQiudihaoIsNotNull() {
            addCriterion("qiudihao is not null");
            return (Criteria) this;
        }

        public Criteria andQiudihaoEqualTo(String value) {
            addCriterion("qiudihao =", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoNotEqualTo(String value) {
            addCriterion("qiudihao <>", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoGreaterThan(String value) {
            addCriterion("qiudihao >", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoGreaterThanOrEqualTo(String value) {
            addCriterion("qiudihao >=", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoLessThan(String value) {
            addCriterion("qiudihao <", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoLessThanOrEqualTo(String value) {
            addCriterion("qiudihao <=", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoLike(String value) {
            addCriterion("qiudihao like", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoNotLike(String value) {
            addCriterion("qiudihao not like", value, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoIn(List<String> values) {
            addCriterion("qiudihao in", values, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoNotIn(List<String> values) {
            addCriterion("qiudihao not in", values, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoBetween(String value1, String value2) {
            addCriterion("qiudihao between", value1, value2, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andQiudihaoNotBetween(String value1, String value2) {
            addCriterion("qiudihao not between", value1, value2, "qiudihao");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNull() {
            addCriterion("houseaddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNotNull() {
            addCriterion("houseaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressEqualTo(String value) {
            addCriterion("houseaddress =", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotEqualTo(String value) {
            addCriterion("houseaddress <>", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThan(String value) {
            addCriterion("houseaddress >", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddress >=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThan(String value) {
            addCriterion("houseaddress <", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThanOrEqualTo(String value) {
            addCriterion("houseaddress <=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLike(String value) {
            addCriterion("houseaddress like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotLike(String value) {
            addCriterion("houseaddress not like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIn(List<String> values) {
            addCriterion("houseaddress in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotIn(List<String> values) {
            addCriterion("houseaddress not in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressBetween(String value1, String value2) {
            addCriterion("houseaddress between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotBetween(String value1, String value2) {
            addCriterion("houseaddress not between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleIsNull() {
            addCriterion("commonpeople is null");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleIsNotNull() {
            addCriterion("commonpeople is not null");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleEqualTo(String value) {
            addCriterion("commonpeople =", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleNotEqualTo(String value) {
            addCriterion("commonpeople <>", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleGreaterThan(String value) {
            addCriterion("commonpeople >", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("commonpeople >=", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleLessThan(String value) {
            addCriterion("commonpeople <", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleLessThanOrEqualTo(String value) {
            addCriterion("commonpeople <=", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleLike(String value) {
            addCriterion("commonpeople like", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleNotLike(String value) {
            addCriterion("commonpeople not like", value, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleIn(List<String> values) {
            addCriterion("commonpeople in", values, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleNotIn(List<String> values) {
            addCriterion("commonpeople not in", values, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleBetween(String value1, String value2) {
            addCriterion("commonpeople between", value1, value2, "commonpeople");
            return (Criteria) this;
        }

        public Criteria andCommonpeopleNotBetween(String value1, String value2) {
            addCriterion("commonpeople not between", value1, value2, "commonpeople");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table register
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
     * This class corresponds to the database table register
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