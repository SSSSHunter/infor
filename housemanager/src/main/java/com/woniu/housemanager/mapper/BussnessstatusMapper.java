package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.Bussnessstatus;
import com.woniu.housemanager.pojo.BussnessstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BussnessstatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int countByExample(BussnessstatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByExample(BussnessstatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByPrimaryKey(String bsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insert(Bussnessstatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insertSelective(Bussnessstatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    List<Bussnessstatus> selectByExample(BussnessstatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    Bussnessstatus selectByPrimaryKey(String bsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") Bussnessstatus record, @Param("example") BussnessstatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExample(@Param("record") Bussnessstatus record, @Param("example") BussnessstatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKeySelective(Bussnessstatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bussnessstatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKey(Bussnessstatus record);
}