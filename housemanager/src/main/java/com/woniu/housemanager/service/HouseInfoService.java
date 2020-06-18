package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.HouseInfo;
import com.woniu.housemanager.pojo.HouseNumber;

/**
 * ClassName:HouseInfoService
 * Package:service
 * Description:
 *
 * @Date:2020/6/10 15:47
 * @Author:wang
 */
public interface HouseInfoService {
    void save(HouseInfo houseInfo);

    void saveHouseNum(HouseNumber houseNumber);
}
