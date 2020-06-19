package com.woniu.housemanager.tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * ClassName:GenerateCode
 * Package:tools
 * Description:
 *
 * @Date:2020/6/16 15:33
 * @Author:wang
 */
public class GenerateCode {
    /**
     * 生成业务单号
     * @return
     */
    public static String getBsCode(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        return sdf.format(System.currentTimeMillis());
    }

    /**
     * 生成房屋编号
     * @return
     */
    public static String getHouseCode(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        int randomNum = new Random().nextInt(100);
        return sdf.format(new Date()) + randomNum;
    }

    public static void main(String[] args) {
        System.out.println(getHouseCode());
    }
}
