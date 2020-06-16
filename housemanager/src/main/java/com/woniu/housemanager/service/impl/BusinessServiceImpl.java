package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.BussnessstatusMapper;
import com.woniu.housemanager.pojo.Bussnessstatus;
import com.woniu.housemanager.service.BusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:BusinessServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/11 16:18
 * @Author:wang
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Resource
    private BussnessstatusMapper bussnessstatusMapper;

    @Override
    public List<Bussnessstatus> findAll() {
        return bussnessstatusMapper.selectByExample(null);
    }

    @Override
    public void save(Bussnessstatus bussnessstatus) {
        bussnessstatusMapper.insertSelective(bussnessstatus);
    }

    @Override
    public Bussnessstatus findById(String bsid) {
        return bussnessstatusMapper.selectByPrimaryKey(bsid);
    }
}
