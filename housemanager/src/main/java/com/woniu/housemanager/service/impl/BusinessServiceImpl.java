package com.woniu.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.mapper.BussnessstatusMapper;
import com.woniu.housemanager.mapper.materialsMapper;
import com.woniu.housemanager.pojo.Bussnessstatus;
import com.woniu.housemanager.pojo.BussnessstatusExample;
import com.woniu.housemanager.pojo.materials;
import com.woniu.housemanager.pojo.materialsExample;
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
    public PageInfo<Bussnessstatus> findAll(Integer pageNum, Integer pageSize, String key) {
        PageHelper.startPage(pageNum,pageSize);
        BussnessstatusExample example = new BussnessstatusExample();
        BussnessstatusExample.Criteria criteria = example.createCriteria();
        if (key!=null && !key.equals("")) {
            criteria.andBsidLike("%" + key + "%");
        }
        List<Bussnessstatus> list = bussnessstatusMapper.selectByExample(example);
        return new PageInfo<>(list);
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
