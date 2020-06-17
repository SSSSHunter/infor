package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.MortgagesLogoutMapper;
import com.woniu.housemanager.pojo.MortgagesLogout;
import com.woniu.housemanager.service.MortgagesLogoutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MortgagesLogoutServiceImpl implements MortgagesLogoutService {
    @Resource
    private MortgagesLogoutMapper mortgagesLogoutMapper;
    @Override
    public void insert(MortgagesLogout mortgagesLogout) {
        mortgagesLogoutMapper.insert(mortgagesLogout);
    }
}
