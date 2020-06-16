package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HouseInfoMapper;
import com.woniu.housemanager.pojo.HouseInfo;
import com.woniu.housemanager.service.HouseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName:HouseInfoServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/10 15:48
 * @Author:wang
 */
@Service
public class HouseInfoServiceImpl implements HouseInfoService {

    @Resource
    private HouseInfoMapper houseInfoMapper;
    @Override
    public void save(HouseInfo houseInfo) {
        houseInfoMapper.insertSelective(houseInfo);
    }
}
