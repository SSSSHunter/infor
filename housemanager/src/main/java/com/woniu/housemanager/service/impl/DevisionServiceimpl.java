package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.AreasMapper;
import com.woniu.housemanager.mapper.DevisionMapper;
import com.woniu.housemanager.pojo.Areas;
import com.woniu.housemanager.pojo.AreasExample;
import com.woniu.housemanager.pojo.DevisionExample;
import com.woniu.housemanager.service.DevisionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DevisionServiceImpl implements DevisionService {
    @Resource
    private DevisionMapper devisionMapper;
    @Resource
    private AreasMapper areasMapper;

    @Override
    public List findAll() {
        return devisionMapper.selectByExample(null);
    }

    @Override
    public List findAllByarename(String arename) {
        AreasExample example = new AreasExample();
        AreasExample.Criteria criteria =  example.createCriteria();
        criteria.andArenameEqualTo(arename);
        List<Areas> a =  areasMapper.selectByExample(example);
        Integer areaid = a.get(0).getAreaid();
        return devisionMapper.findAllByarename(areaid);
    }

    @Override
    public List findAreaByid(Integer areaaid) {
        DevisionExample example=new DevisionExample();
        DevisionExample.Criteria criteria=example.createCriteria();
        criteria.andAreaidEqualTo(areaaid);
        return devisionMapper.selectByExample(example);
    }
}
