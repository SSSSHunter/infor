package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.LouDong;

import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/20:16:07
 */
public interface LouDongService {
    void save(LouDong louDong);

    int select(String loudongname);

    LouDong condition(Integer loudongid);

    List findAlllouid(Integer buildingid);
}
