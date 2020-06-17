package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.HouseInfo;

public interface HouseInfoService {
    HouseInfo selectByQiuid(Integer qiuid);
    //根据房产证号得到房屋信息
    HouseInfo selectByPropertyrightcode(String propertyrightcode);

    HouseInfo selectByHiid(Integer hiid);

    void save(HouseInfo houseInfo);
}
