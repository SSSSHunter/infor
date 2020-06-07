package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.HousePeopleExample;
import com.woniu.housemanager.pojo.HousePeopleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousePeopleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int countByExample(HousePeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByExample(HousePeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByPrimaryKey(HousePeopleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insert(HousePeopleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insertSelective(HousePeopleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    List<HousePeopleKey> selectByExample(HousePeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") HousePeopleKey record, @Param("example") HousePeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepeople
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExample(@Param("record") HousePeopleKey record, @Param("example") HousePeopleExample example);
}