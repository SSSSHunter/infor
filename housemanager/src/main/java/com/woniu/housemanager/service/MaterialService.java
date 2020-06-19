package com.woniu.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.pojo.materials;

import java.util.List;


/**
 * ClassName:MaterialService
 * Package:service
 * Description:
 *
 * @Date:2020/6/11 17:11
 * @Author:wang
 */
public interface MaterialService {
    PageInfo<materials> findAll(Integer pageNum, Integer pageSize, String key);
}
