package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HouseInfoMapper;
import com.woniu.housemanager.mapper.MortgageMapper;
import com.woniu.housemanager.pojo.Mortgage;
import com.woniu.housemanager.pojo.MortgageExample;
import com.woniu.housemanager.service.MortgageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MortgageServiceImpl implements MortgageService {
    @Resource
    private MortgageMapper mortgageMapper;
    @Resource
    private HouseInfoMapper houseInfoMapper;

    @Override
    public void insert(Mortgage mortgage) {
        mortgageMapper.insertSelective(mortgage);
    }

    @Override
    public Mortgage selectBydebt(Integer debt) {
        MortgageExample mortgageExample = new MortgageExample();
        MortgageExample.Criteria criteria = mortgageExample.createCriteria();
        criteria.andDebtEqualTo(debt);
        return mortgageMapper.selectByExample(mortgageExample).get(0);
    }
}
