package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.LandUse;
import com.woniu.housemanager.pojo.LandUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandUseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int countByExample(LandUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int deleteByExample(LandUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int deleteByPrimaryKey(Integer lsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int insert(LandUse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int insertSelective(LandUse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    List<LandUse> selectByExample(LandUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    LandUse selectByPrimaryKey(Integer lsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByExampleSelective(@Param("record") LandUse record, @Param("example") LandUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByExample(@Param("record") LandUse record, @Param("example") LandUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByPrimaryKeySelective(LandUse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landuse
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByPrimaryKey(LandUse record);
}