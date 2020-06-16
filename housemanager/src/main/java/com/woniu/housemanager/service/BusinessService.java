package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Bussnessstatus;

import java.util.List;

/**
 * ClassName:BusinessService
 * Package:service
 * Description:
 *
 * @Date:2020/6/11 16:17
 * @Author:wang
 */
public interface BusinessService {
    List<Bussnessstatus> findAll();

    void save(Bussnessstatus bussnessstatus);

    Bussnessstatus findById(String bsid);
}
