package com.woniu.housemanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorkerInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public WorkerInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
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
     * This method corresponds to the database table workerinfo
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
     * This method corresponds to the database table workerinfo
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workerinfo
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
     * This class corresponds to the database table workerinfo
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNull() {
            addCriterion("workname is null");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNotNull() {
            addCriterion("workname is not null");
            return (Criteria) this;
        }

        public Criteria andWorknameEqualTo(String value) {
            addCriterion("workname =", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotEqualTo(String value) {
            addCriterion("workname <>", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThan(String value) {
            addCriterion("workname >", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThanOrEqualTo(String value) {
            addCriterion("workname >=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThan(String value) {
            addCriterion("workname <", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThanOrEqualTo(String value) {
            addCriterion("workname <=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLike(String value) {
            addCriterion("workname like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotLike(String value) {
            addCriterion("workname not like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameIn(List<String> values) {
            addCriterion("workname in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotIn(List<String> values) {
            addCriterion("workname not in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameBetween(String value1, String value2) {
            addCriterion("workname between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotBetween(String value1, String value2) {
            addCriterion("workname not between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorksexIsNull() {
            addCriterion("worksex is null");
            return (Criteria) this;
        }

        public Criteria andWorksexIsNotNull() {
            addCriterion("worksex is not null");
            return (Criteria) this;
        }

        public Criteria andWorksexEqualTo(Boolean value) {
            addCriterion("worksex =", value, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexNotEqualTo(Boolean value) {
            addCriterion("worksex <>", value, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexGreaterThan(Boolean value) {
            addCriterion("worksex >", value, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("worksex >=", value, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexLessThan(Boolean value) {
            addCriterion("worksex <", value, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexLessThanOrEqualTo(Boolean value) {
            addCriterion("worksex <=", value, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexIn(List<Boolean> values) {
            addCriterion("worksex in", values, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexNotIn(List<Boolean> values) {
            addCriterion("worksex not in", values, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexBetween(Boolean value1, Boolean value2) {
            addCriterion("worksex between", value1, value2, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorksexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("worksex not between", value1, value2, "worksex");
            return (Criteria) this;
        }

        public Criteria andWorkageIsNull() {
            addCriterion("workage is null");
            return (Criteria) this;
        }

        public Criteria andWorkageIsNotNull() {
            addCriterion("workage is not null");
            return (Criteria) this;
        }

        public Criteria andWorkageEqualTo(Integer value) {
            addCriterion("workage =", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageNotEqualTo(Integer value) {
            addCriterion("workage <>", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageGreaterThan(Integer value) {
            addCriterion("workage >", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageGreaterThanOrEqualTo(Integer value) {
            addCriterion("workage >=", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageLessThan(Integer value) {
            addCriterion("workage <", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageLessThanOrEqualTo(Integer value) {
            addCriterion("workage <=", value, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageIn(List<Integer> values) {
            addCriterion("workage in", values, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageNotIn(List<Integer> values) {
            addCriterion("workage not in", values, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageBetween(Integer value1, Integer value2) {
            addCriterion("workage between", value1, value2, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkageNotBetween(Integer value1, Integer value2) {
            addCriterion("workage not between", value1, value2, "workage");
            return (Criteria) this;
        }

        public Criteria andWorkschoolIsNull() {
            addCriterion("workschool is null");
            return (Criteria) this;
        }

        public Criteria andWorkschoolIsNotNull() {
            addCriterion("workschool is not null");
            return (Criteria) this;
        }

        public Criteria andWorkschoolEqualTo(String value) {
            addCriterion("workschool =", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolNotEqualTo(String value) {
            addCriterion("workschool <>", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolGreaterThan(String value) {
            addCriterion("workschool >", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolGreaterThanOrEqualTo(String value) {
            addCriterion("workschool >=", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolLessThan(String value) {
            addCriterion("workschool <", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolLessThanOrEqualTo(String value) {
            addCriterion("workschool <=", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolLike(String value) {
            addCriterion("workschool like", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolNotLike(String value) {
            addCriterion("workschool not like", value, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolIn(List<String> values) {
            addCriterion("workschool in", values, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolNotIn(List<String> values) {
            addCriterion("workschool not in", values, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolBetween(String value1, String value2) {
            addCriterion("workschool between", value1, value2, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorkschoolNotBetween(String value1, String value2) {
            addCriterion("workschool not between", value1, value2, "workschool");
            return (Criteria) this;
        }

        public Criteria andWorklevelIsNull() {
            addCriterion("worklevel is null");
            return (Criteria) this;
        }

        public Criteria andWorklevelIsNotNull() {
            addCriterion("worklevel is not null");
            return (Criteria) this;
        }

        public Criteria andWorklevelEqualTo(String value) {
            addCriterion("worklevel =", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotEqualTo(String value) {
            addCriterion("worklevel <>", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelGreaterThan(String value) {
            addCriterion("worklevel >", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelGreaterThanOrEqualTo(String value) {
            addCriterion("worklevel >=", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelLessThan(String value) {
            addCriterion("worklevel <", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelLessThanOrEqualTo(String value) {
            addCriterion("worklevel <=", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelLike(String value) {
            addCriterion("worklevel like", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotLike(String value) {
            addCriterion("worklevel not like", value, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelIn(List<String> values) {
            addCriterion("worklevel in", values, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotIn(List<String> values) {
            addCriterion("worklevel not in", values, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelBetween(String value1, String value2) {
            addCriterion("worklevel between", value1, value2, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorklevelNotBetween(String value1, String value2) {
            addCriterion("worklevel not between", value1, value2, "worklevel");
            return (Criteria) this;
        }

        public Criteria andWorkphoneIsNull() {
            addCriterion("workphone is null");
            return (Criteria) this;
        }

        public Criteria andWorkphoneIsNotNull() {
            addCriterion("workphone is not null");
            return (Criteria) this;
        }

        public Criteria andWorkphoneEqualTo(String value) {
            addCriterion("workphone =", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotEqualTo(String value) {
            addCriterion("workphone <>", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneGreaterThan(String value) {
            addCriterion("workphone >", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("workphone >=", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneLessThan(String value) {
            addCriterion("workphone <", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneLessThanOrEqualTo(String value) {
            addCriterion("workphone <=", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneLike(String value) {
            addCriterion("workphone like", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotLike(String value) {
            addCriterion("workphone not like", value, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneIn(List<String> values) {
            addCriterion("workphone in", values, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotIn(List<String> values) {
            addCriterion("workphone not in", values, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneBetween(String value1, String value2) {
            addCriterion("workphone between", value1, value2, "workphone");
            return (Criteria) this;
        }

        public Criteria andWorkphoneNotBetween(String value1, String value2) {
            addCriterion("workphone not between", value1, value2, "workphone");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table workerinfo
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
     * This class corresponds to the database table workerinfo
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