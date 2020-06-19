package com.woniu.housemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommercialhousingpresalepermitregistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommercialhousingpresalepermitregistrationExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andCcspidIsNull() {
            addCriterion("ccspid is null");
            return (Criteria) this;
        }

        public Criteria andCcspidIsNotNull() {
            addCriterion("ccspid is not null");
            return (Criteria) this;
        }

        public Criteria andCcspidEqualTo(Integer value) {
            addCriterion("ccspid =", value, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidNotEqualTo(Integer value) {
            addCriterion("ccspid <>", value, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidGreaterThan(Integer value) {
            addCriterion("ccspid >", value, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccspid >=", value, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidLessThan(Integer value) {
            addCriterion("ccspid <", value, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidLessThanOrEqualTo(Integer value) {
            addCriterion("ccspid <=", value, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidIn(List<Integer> values) {
            addCriterion("ccspid in", values, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidNotIn(List<Integer> values) {
            addCriterion("ccspid not in", values, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidBetween(Integer value1, Integer value2) {
            addCriterion("ccspid between", value1, value2, "ccspid");
            return (Criteria) this;
        }

        public Criteria andCcspidNotBetween(Integer value1, Integer value2) {
            addCriterion("ccspid not between", value1, value2, "ccspid");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIsNull() {
            addCriterion("danweimingcheng is null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIsNotNull() {
            addCriterion("danweimingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengEqualTo(String value) {
            addCriterion("danweimingcheng =", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotEqualTo(String value) {
            addCriterion("danweimingcheng <>", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThan(String value) {
            addCriterion("danweimingcheng >", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("danweimingcheng >=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThan(String value) {
            addCriterion("danweimingcheng <", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThanOrEqualTo(String value) {
            addCriterion("danweimingcheng <=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLike(String value) {
            addCriterion("danweimingcheng like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotLike(String value) {
            addCriterion("danweimingcheng not like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIn(List<String> values) {
            addCriterion("danweimingcheng in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotIn(List<String> values) {
            addCriterion("danweimingcheng not in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengBetween(String value1, String value2) {
            addCriterion("danweimingcheng between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotBetween(String value1, String value2) {
            addCriterion("danweimingcheng not between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiIsNull() {
            addCriterion("danweidizhi is null");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiIsNotNull() {
            addCriterion("danweidizhi is not null");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiEqualTo(String value) {
            addCriterion("danweidizhi =", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiNotEqualTo(String value) {
            addCriterion("danweidizhi <>", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiGreaterThan(String value) {
            addCriterion("danweidizhi >", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiGreaterThanOrEqualTo(String value) {
            addCriterion("danweidizhi >=", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiLessThan(String value) {
            addCriterion("danweidizhi <", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiLessThanOrEqualTo(String value) {
            addCriterion("danweidizhi <=", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiLike(String value) {
            addCriterion("danweidizhi like", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiNotLike(String value) {
            addCriterion("danweidizhi not like", value, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiIn(List<String> values) {
            addCriterion("danweidizhi in", values, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiNotIn(List<String> values) {
            addCriterion("danweidizhi not in", values, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiBetween(String value1, String value2) {
            addCriterion("danweidizhi between", value1, value2, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andDanweidizhiNotBetween(String value1, String value2) {
            addCriterion("danweidizhi not between", value1, value2, "danweidizhi");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoIsNull() {
            addCriterion("farendaibiao is null");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoIsNotNull() {
            addCriterion("farendaibiao is not null");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoEqualTo(String value) {
            addCriterion("farendaibiao =", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoNotEqualTo(String value) {
            addCriterion("farendaibiao <>", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoGreaterThan(String value) {
            addCriterion("farendaibiao >", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoGreaterThanOrEqualTo(String value) {
            addCriterion("farendaibiao >=", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoLessThan(String value) {
            addCriterion("farendaibiao <", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoLessThanOrEqualTo(String value) {
            addCriterion("farendaibiao <=", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoLike(String value) {
            addCriterion("farendaibiao like", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoNotLike(String value) {
            addCriterion("farendaibiao not like", value, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoIn(List<String> values) {
            addCriterion("farendaibiao in", values, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoNotIn(List<String> values) {
            addCriterion("farendaibiao not in", values, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoBetween(String value1, String value2) {
            addCriterion("farendaibiao between", value1, value2, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andFarendaibiaoNotBetween(String value1, String value2) {
            addCriterion("farendaibiao not between", value1, value2, "farendaibiao");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiIsNull() {
            addCriterion("qiyexinzhi is null");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiIsNotNull() {
            addCriterion("qiyexinzhi is not null");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiEqualTo(String value) {
            addCriterion("qiyexinzhi =", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiNotEqualTo(String value) {
            addCriterion("qiyexinzhi <>", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiGreaterThan(String value) {
            addCriterion("qiyexinzhi >", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiGreaterThanOrEqualTo(String value) {
            addCriterion("qiyexinzhi >=", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiLessThan(String value) {
            addCriterion("qiyexinzhi <", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiLessThanOrEqualTo(String value) {
            addCriterion("qiyexinzhi <=", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiLike(String value) {
            addCriterion("qiyexinzhi like", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiNotLike(String value) {
            addCriterion("qiyexinzhi not like", value, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiIn(List<String> values) {
            addCriterion("qiyexinzhi in", values, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiNotIn(List<String> values) {
            addCriterion("qiyexinzhi not in", values, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiBetween(String value1, String value2) {
            addCriterion("qiyexinzhi between", value1, value2, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andQiyexinzhiNotBetween(String value1, String value2) {
            addCriterion("qiyexinzhi not between", value1, value2, "qiyexinzhi");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiIsNull() {
            addCriterion("zizhidengji is null");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiIsNotNull() {
            addCriterion("zizhidengji is not null");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiEqualTo(String value) {
            addCriterion("zizhidengji =", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiNotEqualTo(String value) {
            addCriterion("zizhidengji <>", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiGreaterThan(String value) {
            addCriterion("zizhidengji >", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiGreaterThanOrEqualTo(String value) {
            addCriterion("zizhidengji >=", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiLessThan(String value) {
            addCriterion("zizhidengji <", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiLessThanOrEqualTo(String value) {
            addCriterion("zizhidengji <=", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiLike(String value) {
            addCriterion("zizhidengji like", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiNotLike(String value) {
            addCriterion("zizhidengji not like", value, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiIn(List<String> values) {
            addCriterion("zizhidengji in", values, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiNotIn(List<String> values) {
            addCriterion("zizhidengji not in", values, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiBetween(String value1, String value2) {
            addCriterion("zizhidengji between", value1, value2, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhidengjiNotBetween(String value1, String value2) {
            addCriterion("zizhidengji not between", value1, value2, "zizhidengji");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiIsNull() {
            addCriterion("zizhiyouxiaoqi is null");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiIsNotNull() {
            addCriterion("zizhiyouxiaoqi is not null");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiEqualTo(Date value) {
            addCriterion("zizhiyouxiaoqi =", value, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiNotEqualTo(Date value) {
            addCriterion("zizhiyouxiaoqi <>", value, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiGreaterThan(Date value) {
            addCriterion("zizhiyouxiaoqi >", value, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiGreaterThanOrEqualTo(Date value) {
            addCriterion("zizhiyouxiaoqi >=", value, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiLessThan(Date value) {
            addCriterion("zizhiyouxiaoqi <", value, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiLessThanOrEqualTo(Date value) {
            addCriterion("zizhiyouxiaoqi <=", value, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiIn(List<Date> values) {
            addCriterion("zizhiyouxiaoqi in", values, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiNotIn(List<Date> values) {
            addCriterion("zizhiyouxiaoqi not in", values, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiBetween(Date value1, Date value2) {
            addCriterion("zizhiyouxiaoqi between", value1, value2, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andZizhiyouxiaoqiNotBetween(Date value1, Date value2) {
            addCriterion("zizhiyouxiaoqi not between", value1, value2, "zizhiyouxiaoqi");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingIsNull() {
            addCriterion("xiangmutuiguanming is null");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingIsNotNull() {
            addCriterion("xiangmutuiguanming is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingEqualTo(String value) {
            addCriterion("xiangmutuiguanming =", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingNotEqualTo(String value) {
            addCriterion("xiangmutuiguanming <>", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingGreaterThan(String value) {
            addCriterion("xiangmutuiguanming >", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingGreaterThanOrEqualTo(String value) {
            addCriterion("xiangmutuiguanming >=", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingLessThan(String value) {
            addCriterion("xiangmutuiguanming <", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingLessThanOrEqualTo(String value) {
            addCriterion("xiangmutuiguanming <=", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingLike(String value) {
            addCriterion("xiangmutuiguanming like", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingNotLike(String value) {
            addCriterion("xiangmutuiguanming not like", value, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingIn(List<String> values) {
            addCriterion("xiangmutuiguanming in", values, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingNotIn(List<String> values) {
            addCriterion("xiangmutuiguanming not in", values, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingBetween(String value1, String value2) {
            addCriterion("xiangmutuiguanming between", value1, value2, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andXiangmutuiguanmingNotBetween(String value1, String value2) {
            addCriterion("xiangmutuiguanming not between", value1, value2, "xiangmutuiguanming");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiIsNull() {
            addCriterion("suoshuquwei is null");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiIsNotNull() {
            addCriterion("suoshuquwei is not null");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiEqualTo(String value) {
            addCriterion("suoshuquwei =", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiNotEqualTo(String value) {
            addCriterion("suoshuquwei <>", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiGreaterThan(String value) {
            addCriterion("suoshuquwei >", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiGreaterThanOrEqualTo(String value) {
            addCriterion("suoshuquwei >=", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiLessThan(String value) {
            addCriterion("suoshuquwei <", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiLessThanOrEqualTo(String value) {
            addCriterion("suoshuquwei <=", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiLike(String value) {
            addCriterion("suoshuquwei like", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiNotLike(String value) {
            addCriterion("suoshuquwei not like", value, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiIn(List<String> values) {
            addCriterion("suoshuquwei in", values, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiNotIn(List<String> values) {
            addCriterion("suoshuquwei not in", values, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiBetween(String value1, String value2) {
            addCriterion("suoshuquwei between", value1, value2, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshuquweiNotBetween(String value1, String value2) {
            addCriterion("suoshuquwei not between", value1, value2, "suoshuquwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiIsNull() {
            addCriterion("suoshufangwei is null");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiIsNotNull() {
            addCriterion("suoshufangwei is not null");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiEqualTo(String value) {
            addCriterion("suoshufangwei =", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiNotEqualTo(String value) {
            addCriterion("suoshufangwei <>", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiGreaterThan(String value) {
            addCriterion("suoshufangwei >", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiGreaterThanOrEqualTo(String value) {
            addCriterion("suoshufangwei >=", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiLessThan(String value) {
            addCriterion("suoshufangwei <", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiLessThanOrEqualTo(String value) {
            addCriterion("suoshufangwei <=", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiLike(String value) {
            addCriterion("suoshufangwei like", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiNotLike(String value) {
            addCriterion("suoshufangwei not like", value, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiIn(List<String> values) {
            addCriterion("suoshufangwei in", values, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiNotIn(List<String> values) {
            addCriterion("suoshufangwei not in", values, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiBetween(String value1, String value2) {
            addCriterion("suoshufangwei between", value1, value2, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andSuoshufangweiNotBetween(String value1, String value2) {
            addCriterion("suoshufangwei not between", value1, value2, "suoshufangwei");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoIsNull() {
            addCriterion("gongchengguihuaxukezhenghao is null");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoIsNotNull() {
            addCriterion("gongchengguihuaxukezhenghao is not null");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoEqualTo(String value) {
            addCriterion("gongchengguihuaxukezhenghao =", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoNotEqualTo(String value) {
            addCriterion("gongchengguihuaxukezhenghao <>", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoGreaterThan(String value) {
            addCriterion("gongchengguihuaxukezhenghao >", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoGreaterThanOrEqualTo(String value) {
            addCriterion("gongchengguihuaxukezhenghao >=", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoLessThan(String value) {
            addCriterion("gongchengguihuaxukezhenghao <", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoLessThanOrEqualTo(String value) {
            addCriterion("gongchengguihuaxukezhenghao <=", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoLike(String value) {
            addCriterion("gongchengguihuaxukezhenghao like", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoNotLike(String value) {
            addCriterion("gongchengguihuaxukezhenghao not like", value, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoIn(List<String> values) {
            addCriterion("gongchengguihuaxukezhenghao in", values, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoNotIn(List<String> values) {
            addCriterion("gongchengguihuaxukezhenghao not in", values, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoBetween(String value1, String value2) {
            addCriterion("gongchengguihuaxukezhenghao between", value1, value2, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengguihuaxukezhenghaoNotBetween(String value1, String value2) {
            addCriterion("gongchengguihuaxukezhenghao not between", value1, value2, "gongchengguihuaxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiIsNull() {
            addCriterion("zongjianzhumianji is null");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiIsNotNull() {
            addCriterion("zongjianzhumianji is not null");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiEqualTo(String value) {
            addCriterion("zongjianzhumianji =", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiNotEqualTo(String value) {
            addCriterion("zongjianzhumianji <>", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiGreaterThan(String value) {
            addCriterion("zongjianzhumianji >", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiGreaterThanOrEqualTo(String value) {
            addCriterion("zongjianzhumianji >=", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiLessThan(String value) {
            addCriterion("zongjianzhumianji <", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiLessThanOrEqualTo(String value) {
            addCriterion("zongjianzhumianji <=", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiLike(String value) {
            addCriterion("zongjianzhumianji like", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiNotLike(String value) {
            addCriterion("zongjianzhumianji not like", value, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiIn(List<String> values) {
            addCriterion("zongjianzhumianji in", values, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiNotIn(List<String> values) {
            addCriterion("zongjianzhumianji not in", values, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiBetween(String value1, String value2) {
            addCriterion("zongjianzhumianji between", value1, value2, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andZongjianzhumianjiNotBetween(String value1, String value2) {
            addCriterion("zongjianzhumianji not between", value1, value2, "zongjianzhumianji");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoIsNull() {
            addCriterion("churanglouhao is null");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoIsNotNull() {
            addCriterion("churanglouhao is not null");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoEqualTo(String value) {
            addCriterion("churanglouhao =", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoNotEqualTo(String value) {
            addCriterion("churanglouhao <>", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoGreaterThan(String value) {
            addCriterion("churanglouhao >", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoGreaterThanOrEqualTo(String value) {
            addCriterion("churanglouhao >=", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoLessThan(String value) {
            addCriterion("churanglouhao <", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoLessThanOrEqualTo(String value) {
            addCriterion("churanglouhao <=", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoLike(String value) {
            addCriterion("churanglouhao like", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoNotLike(String value) {
            addCriterion("churanglouhao not like", value, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoIn(List<String> values) {
            addCriterion("churanglouhao in", values, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoNotIn(List<String> values) {
            addCriterion("churanglouhao not in", values, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoBetween(String value1, String value2) {
            addCriterion("churanglouhao between", value1, value2, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andChuranglouhaoNotBetween(String value1, String value2) {
            addCriterion("churanglouhao not between", value1, value2, "churanglouhao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoIsNull() {
            addCriterion("tudishiyongzhenghao is null");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoIsNotNull() {
            addCriterion("tudishiyongzhenghao is not null");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoEqualTo(String value) {
            addCriterion("tudishiyongzhenghao =", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoNotEqualTo(String value) {
            addCriterion("tudishiyongzhenghao <>", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoGreaterThan(String value) {
            addCriterion("tudishiyongzhenghao >", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoGreaterThanOrEqualTo(String value) {
            addCriterion("tudishiyongzhenghao >=", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoLessThan(String value) {
            addCriterion("tudishiyongzhenghao <", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoLessThanOrEqualTo(String value) {
            addCriterion("tudishiyongzhenghao <=", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoLike(String value) {
            addCriterion("tudishiyongzhenghao like", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoNotLike(String value) {
            addCriterion("tudishiyongzhenghao not like", value, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoIn(List<String> values) {
            addCriterion("tudishiyongzhenghao in", values, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoNotIn(List<String> values) {
            addCriterion("tudishiyongzhenghao not in", values, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoBetween(String value1, String value2) {
            addCriterion("tudishiyongzhenghao between", value1, value2, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andTudishiyongzhenghaoNotBetween(String value1, String value2) {
            addCriterion("tudishiyongzhenghao not between", value1, value2, "tudishiyongzhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoIsNull() {
            addCriterion("shigongxukezhenghao is null");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoIsNotNull() {
            addCriterion("shigongxukezhenghao is not null");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoEqualTo(String value) {
            addCriterion("shigongxukezhenghao =", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoNotEqualTo(String value) {
            addCriterion("shigongxukezhenghao <>", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoGreaterThan(String value) {
            addCriterion("shigongxukezhenghao >", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoGreaterThanOrEqualTo(String value) {
            addCriterion("shigongxukezhenghao >=", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoLessThan(String value) {
            addCriterion("shigongxukezhenghao <", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoLessThanOrEqualTo(String value) {
            addCriterion("shigongxukezhenghao <=", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoLike(String value) {
            addCriterion("shigongxukezhenghao like", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoNotLike(String value) {
            addCriterion("shigongxukezhenghao not like", value, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoIn(List<String> values) {
            addCriterion("shigongxukezhenghao in", values, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoNotIn(List<String> values) {
            addCriterion("shigongxukezhenghao not in", values, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoBetween(String value1, String value2) {
            addCriterion("shigongxukezhenghao between", value1, value2, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andShigongxukezhenghaoNotBetween(String value1, String value2) {
            addCriterion("shigongxukezhenghao not between", value1, value2, "shigongxukezhenghao");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduIsNull() {
            addCriterion("gongchengsigongjindu is null");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduIsNotNull() {
            addCriterion("gongchengsigongjindu is not null");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduEqualTo(String value) {
            addCriterion("gongchengsigongjindu =", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduNotEqualTo(String value) {
            addCriterion("gongchengsigongjindu <>", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduGreaterThan(String value) {
            addCriterion("gongchengsigongjindu >", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduGreaterThanOrEqualTo(String value) {
            addCriterion("gongchengsigongjindu >=", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduLessThan(String value) {
            addCriterion("gongchengsigongjindu <", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduLessThanOrEqualTo(String value) {
            addCriterion("gongchengsigongjindu <=", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduLike(String value) {
            addCriterion("gongchengsigongjindu like", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduNotLike(String value) {
            addCriterion("gongchengsigongjindu not like", value, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduIn(List<String> values) {
            addCriterion("gongchengsigongjindu in", values, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduNotIn(List<String> values) {
            addCriterion("gongchengsigongjindu not in", values, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduBetween(String value1, String value2) {
            addCriterion("gongchengsigongjindu between", value1, value2, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andGongchengsigongjinduNotBetween(String value1, String value2) {
            addCriterion("gongchengsigongjindu not between", value1, value2, "gongchengsigongjindu");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiIsNull() {
            addCriterion("kaigongriqi is null");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiIsNotNull() {
            addCriterion("kaigongriqi is not null");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiEqualTo(String value) {
            addCriterion("kaigongriqi =", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiNotEqualTo(String value) {
            addCriterion("kaigongriqi <>", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiGreaterThan(String value) {
            addCriterion("kaigongriqi >", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiGreaterThanOrEqualTo(String value) {
            addCriterion("kaigongriqi >=", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiLessThan(String value) {
            addCriterion("kaigongriqi <", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiLessThanOrEqualTo(String value) {
            addCriterion("kaigongriqi <=", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiLike(String value) {
            addCriterion("kaigongriqi like", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiNotLike(String value) {
            addCriterion("kaigongriqi not like", value, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiIn(List<String> values) {
            addCriterion("kaigongriqi in", values, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiNotIn(List<String> values) {
            addCriterion("kaigongriqi not in", values, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiBetween(String value1, String value2) {
            addCriterion("kaigongriqi between", value1, value2, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andKaigongriqiNotBetween(String value1, String value2) {
            addCriterion("kaigongriqi not between", value1, value2, "kaigongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiIsNull() {
            addCriterion("jungongriqi is null");
            return (Criteria) this;
        }

        public Criteria andJungongriqiIsNotNull() {
            addCriterion("jungongriqi is not null");
            return (Criteria) this;
        }

        public Criteria andJungongriqiEqualTo(String value) {
            addCriterion("jungongriqi =", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiNotEqualTo(String value) {
            addCriterion("jungongriqi <>", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiGreaterThan(String value) {
            addCriterion("jungongriqi >", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiGreaterThanOrEqualTo(String value) {
            addCriterion("jungongriqi >=", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiLessThan(String value) {
            addCriterion("jungongriqi <", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiLessThanOrEqualTo(String value) {
            addCriterion("jungongriqi <=", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiLike(String value) {
            addCriterion("jungongriqi like", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiNotLike(String value) {
            addCriterion("jungongriqi not like", value, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiIn(List<String> values) {
            addCriterion("jungongriqi in", values, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiNotIn(List<String> values) {
            addCriterion("jungongriqi not in", values, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiBetween(String value1, String value2) {
            addCriterion("jungongriqi between", value1, value2, "jungongriqi");
            return (Criteria) this;
        }

        public Criteria andJungongriqiNotBetween(String value1, String value2) {
            addCriterion("jungongriqi not between", value1, value2, "jungongriqi");
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