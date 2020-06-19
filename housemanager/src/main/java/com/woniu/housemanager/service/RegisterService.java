package com.woniu.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.pojo.Register;


/**
 * ClassName:RegisterService
 * Package:service
 * Description:
 *
 * @Date:2020/6/15 15:12
 * @Author:wang
 */
public interface RegisterService {
    PageInfo<Register> findAll(Integer pageNum, Integer pageSize, String key);
}
