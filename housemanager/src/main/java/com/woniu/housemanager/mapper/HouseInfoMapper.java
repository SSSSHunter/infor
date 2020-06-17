package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.HouseInfo;
import com.woniu.housemanager.pojo.HouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int countByExample(HouseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByExample(HouseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByPrimaryKey(Integer hiid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insert(HouseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insertSelective(HouseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    List<HouseInfo> selectByExample(HouseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    HouseInfo selectByPrimaryKey(Integer hiid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") HouseInfo record, @Param("example") HouseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExample(@Param("record") HouseInfo record, @Param("example") HouseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKeySelective(HouseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houseinfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKey(HouseInfo record);

}