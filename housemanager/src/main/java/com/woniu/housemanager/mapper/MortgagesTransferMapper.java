package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.MortgagesTransfer;
import com.woniu.housemanager.pojo.MortgagesTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MortgagesTransferMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int countByExample(MortgagesTransferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int deleteByExample(MortgagesTransferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int deleteByPrimaryKey(Integer mtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int insert(MortgagesTransfer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int insertSelective(MortgagesTransfer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    List<MortgagesTransfer> selectByExample(MortgagesTransferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    MortgagesTransfer selectByPrimaryKey(Integer mtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int updateByExampleSelective(@Param("record") MortgagesTransfer record, @Param("example") MortgagesTransferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int updateByExample(@Param("record") MortgagesTransfer record, @Param("example") MortgagesTransferExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int updateByPrimaryKeySelective(MortgagesTransfer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mortgagestransfer
     *
     * @mbggenerated Sat Jun 13 14:29:12 CST 2020
     */
    int updateByPrimaryKey(MortgagesTransfer record);
}