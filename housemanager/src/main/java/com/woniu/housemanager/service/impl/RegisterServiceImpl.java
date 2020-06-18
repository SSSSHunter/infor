package com.woniu.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.mapper.RegisterMapper;
import com.woniu.housemanager.pojo.Bussnessstatus;
import com.woniu.housemanager.pojo.BussnessstatusExample;
import com.woniu.housemanager.pojo.Register;
import com.woniu.housemanager.pojo.RegisterExample;
import com.woniu.housemanager.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:RegisterServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/15 15:12
 * @Author:wang
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterMapper registerMapper;


    @Override
    public PageInfo<Register> findAll(Integer pageNum, Integer pageSize, String key) {
        PageHelper.startPage(pageNum,pageSize);
        RegisterExample example = new RegisterExample();
        RegisterExample.Criteria criteria = example.createCriteria();
        if (key!=null && !key.equals("")) {
            criteria.andRegistercodeLike("%" + key + "%");
        }
        List<Register> list = registerMapper.selectByExample(example);
        return new PageInfo<>(list);
    }
}
