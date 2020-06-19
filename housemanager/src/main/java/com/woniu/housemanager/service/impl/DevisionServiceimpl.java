package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.DevisionMapper;
import com.woniu.housemanager.pojo.DevisionExample;
import com.woniu.housemanager.service.DevisionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/08/16:52:50
 */
@Service
public class DevisionServiceimpl implements DevisionService {
    @Resource
    DevisionMapper devisionMapper;

    @Override
    public List findAreaByid(Integer areaaid) {
        DevisionExample example=new DevisionExample();
        DevisionExample.Criteria criteria=example.createCriteria();
        criteria.andAreaidEqualTo(areaaid);
        return devisionMapper.selectByExample(example);
    }
}
