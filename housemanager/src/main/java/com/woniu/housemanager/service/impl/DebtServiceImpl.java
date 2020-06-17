package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.DebtMapper;
import com.woniu.housemanager.pojo.Debt;
import com.woniu.housemanager.pojo.DebtExample;
import com.woniu.housemanager.service.DebtService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DebtServiceImpl implements DebtService {
    @Resource
    private DebtMapper debtMapper;

    @Override
    public void insert(Debt d) {
        debtMapper.insertSelective(d);
    }

    @Override
    public Debt selectBydebtname(String debtname) {
        DebtExample debtExample = new DebtExample();
        DebtExample.Criteria criteria = debtExample.createCriteria();
        criteria.andDebtnameEqualTo(debtname);
        return debtMapper.selectByExample(debtExample).get(0);
    }

    @Override
    public void updateDyqr(Debt debt) {
        debtMapper.updateByPrimaryKey(debt);
    }
}
