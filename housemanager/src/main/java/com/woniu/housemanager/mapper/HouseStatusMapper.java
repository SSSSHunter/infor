package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.HouseStatus;
import com.woniu.housemanager.pojo.HouseStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int countByExample(HouseStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByExample(HouseStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int deleteByPrimaryKey(Integer hsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insert(HouseStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int insertSelective(HouseStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    List<HouseStatus> selectByExample(HouseStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    HouseStatus selectByPrimaryKey(Integer hsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExampleSelective(@Param("record") HouseStatus record, @Param("example") HouseStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByExample(@Param("record") HouseStatus record, @Param("example") HouseStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKeySelective(HouseStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbggenerated Sun Jun 07 17:07:38 CST 2020
     */
    int updateByPrimaryKey(HouseStatus record);
}