package com.woniu.housemanager.service;

import com.github.pagehelper.PageInfo;
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
    PageInfo<Bussnessstatus> findAll(Integer pageNum, Integer pageSize, String key);

    void save(Bussnessstatus bussnessstatus);

    Bussnessstatus findById(String bsid);
}
