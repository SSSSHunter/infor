package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.LouDongMapper;
import com.woniu.housemanager.pojo.LouDong;
import com.woniu.housemanager.pojo.LouDongExample;
import com.woniu.housemanager.service.LouDongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/20:29:07
 */
@Service
public class LouDongServiceimpl implements LouDongService {
    @Resource
    LouDongMapper louDongMapper;

    @Override
    public void save(LouDong louDong) {

        louDongMapper.insert(louDong);
    }

    @Override
    public int select(String loudongname) {
        LouDongExample louDongExample=new LouDongExample();
        LouDongExample.Criteria criteria=louDongExample.createCriteria();
        criteria.andLoudongnameEqualTo(loudongname);

        return louDongMapper.selectByExample(louDongExample).get(0).getBuildingid();
    }

    @Override
    public LouDong condition(Integer loudongid) {

        return louDongMapper.selectByPrimaryKey(loudongid);
    }

    @Override
    public List findAlllouid(Integer buildingid) {
        LouDongExample louDongExample=new LouDongExample();
        LouDongExample.Criteria criteria=louDongExample.createCriteria();
        criteria.andBuildIdEqualTo(buildingid);
        return louDongMapper.selectByExample(louDongExample);
    }
}
