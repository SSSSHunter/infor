package com.woniu.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.mapper.BussnessstatusMapper;
import com.woniu.housemanager.pojo.Bussnessstatus;
import com.woniu.housemanager.pojo.BussnessstatusExample;
import com.woniu.housemanager.service.BussnessstatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BussnessstatusServiceImpl implements BussnessstatusService {
    @Resource
    private BussnessstatusMapper bussnessstatusMapper;

    @Override
    public void insert(Bussnessstatus bussnessstatus) {
        bussnessstatusMapper.insert(bussnessstatus);
    }
    //所有的一般抵押登记业务
    @Override
    public List ybdydjfindAll() {
        return bussnessstatusMapper.ybdydjfindAll(null);
    }
    //所有的一般抵押转移登记业务
    @Override
    public List ybdyzydjfindAll() {
        return bussnessstatusMapper.ybdyzydjfindAll(null);
    }
    //所有的一般抵押变更登记业务
    @Override
    public List ybdybgdjfindAll(String acard) {
        return bussnessstatusMapper.ybdybgdjfindAll(acard);
    }
    //所有的一般抵押变更登记业务
    @Override
    public PageInfo<Bussnessstatus> findAll(Integer pageNum, Integer pageSize, String acard) {
        PageHelper.startPage(pageNum,pageSize);
        List<Bussnessstatus> list =bussnessstatusMapper.ybdybgdjfindAll(acard);
        return new PageInfo<>(list);
    }
    //所有的一般抵押登记业务
    @Override
    public PageInfo<Bussnessstatus> ybdydjfindAll( Integer pageNum, Integer pageSize, String acard) {
        PageHelper.startPage(pageNum,pageSize);
        List<Bussnessstatus> list =bussnessstatusMapper.ybdydjfindAll(acard);
        return new PageInfo<>(list);
    }
    //所有的一般抵押转移登记业务
    @Override
    public PageInfo<Bussnessstatus> ybdyzydjfindAll(Integer pageNum, Integer pageSize, String acard) {
        PageHelper.startPage(pageNum,pageSize);
        List<Bussnessstatus> list =bussnessstatusMapper.ybdyzydjfindAll(acard);
        return new PageInfo<Bussnessstatus>(list);
    }
    //所有的一般抵押注销登记业务
    @Override
    public PageInfo<Bussnessstatus> ybdyzxdjfindAll(Integer pageNum, Integer pageSize, String acard) {
        PageHelper.startPage(pageNum,pageSize);
        List<Bussnessstatus> list =bussnessstatusMapper.ybdyzxdjfindAll(acard);
        return new PageInfo<Bussnessstatus>(list);
    }
}
