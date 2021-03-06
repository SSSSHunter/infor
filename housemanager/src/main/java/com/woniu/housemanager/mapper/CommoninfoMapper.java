package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.Commoninfo;
import com.woniu.housemanager.pojo.CommoninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoninfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int countByExample(CommoninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByExample(CommoninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByPrimaryKey(Integer commonid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insert(Commoninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insertSelective(Commoninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    List<Commoninfo> selectByExample(CommoninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    Commoninfo selectByPrimaryKey(Integer commonid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") Commoninfo record, @Param("example") CommoninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExample(@Param("record") Commoninfo record, @Param("example") CommoninfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKeySelective(Commoninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commoninfo
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKey(Commoninfo record);
}