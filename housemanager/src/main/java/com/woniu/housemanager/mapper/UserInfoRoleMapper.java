package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.UserInfoRoleExample;
import com.woniu.housemanager.pojo.UserInfoRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int countByExample(UserInfoRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int deleteByExample(UserInfoRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int deleteByPrimaryKey(UserInfoRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int insert(UserInfoRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int insertSelective(UserInfoRoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    List<UserInfoRoleKey> selectByExample(UserInfoRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserInfoRoleKey record, @Param("example") UserInfoRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByExample(@Param("record") UserInfoRoleKey record, @Param("example") UserInfoRoleExample example);
    List<Integer> findByUid(Integer uid);
}