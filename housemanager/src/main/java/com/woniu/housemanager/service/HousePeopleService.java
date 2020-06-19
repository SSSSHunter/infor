package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.HousePeopleKey;

import java.util.List;

/**
 * ClassName:HousePeopleService
 * Package:service
 * Description:
 *
 * @Date:2020/6/17 16:18
 * @Author:wang
 */
public interface HousePeopleService {
    void save(HousePeopleKey housePeopleKey);

    List findByhnid(int hnid);
}
