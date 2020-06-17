package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Bunessdetials;
import com.woniu.housemanager.pojo.Bussnesstype;

import java.util.List;

/**
 * ClassName:BusinessTypeService
 * Package:service
 * Description:
 *
 * @Date:2020/6/8 16:23
 * @Author:wang
 */
public interface BusinessTypeService {
    List findAll();

    Bussnesstype findByBtid(Integer btid);
}
