package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.MortgagesChangeMapper;
import com.woniu.housemanager.pojo.MortgagesChange;
import com.woniu.housemanager.service.MortgagesChangeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MortgagesChangeServiceImpl implements MortgagesChangeService {
    @Resource
    private MortgagesChangeMapper mortgagesChangeMapper;

    @Override
    public void insert(MortgagesChange mortgagesChange) {
        mortgagesChangeMapper.insertSelective(mortgagesChange);
    }
}
