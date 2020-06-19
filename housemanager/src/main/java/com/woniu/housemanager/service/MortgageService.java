package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.HouseInfo;
import com.woniu.housemanager.pojo.Mortgage;

/**
 * 一般抵押登记申请
 */
public interface MortgageService {
    void insert(Mortgage mortgage);

    Mortgage selectBydebt(Integer debt);
}
