package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.QiuDiHao;
import com.woniu.housemanager.pojo.QiuDiHaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QiuDiHaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int countByExample(QiuDiHaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int deleteByExample(QiuDiHaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int deleteByPrimaryKey(Integer qiuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int insert(QiuDiHao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int insertSelective(QiuDiHao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    List<QiuDiHao> selectByExample(QiuDiHaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    QiuDiHao selectByPrimaryKey(Integer qiuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByExampleSelective(@Param("record") QiuDiHao record, @Param("example") QiuDiHaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByExample(@Param("record") QiuDiHao record, @Param("example") QiuDiHaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByPrimaryKeySelective(QiuDiHao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qiudihao
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    int updateByPrimaryKey(QiuDiHao record);
}