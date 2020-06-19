package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.BussnesstypeMapper;
import com.woniu.housemanager.pojo.Bussnesstype;
import com.woniu.housemanager.service.BusinessTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:BusinessTypeServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/8 16:24
 * @Author:wang
 */
@Service
public class BusinessTypeServiceImpl implements BusinessTypeService {
    @Resource
    private BussnesstypeMapper bussnesstypeMapper;

    @Override
    public List findAll() {
        return bussnesstypeMapper.selectByExample(null);
    }

    @Override
    public Bussnesstype findByBtid(Integer btid) {
        return bussnesstypeMapper.selectByPrimaryKey(btid);
    }
}
