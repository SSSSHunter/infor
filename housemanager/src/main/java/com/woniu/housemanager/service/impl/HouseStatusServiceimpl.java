package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HouseStatusMapper;
import com.woniu.housemanager.pojo.HouseProperty;
import com.woniu.housemanager.pojo.HouseStatus;
import com.woniu.housemanager.service.HouseStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther wangjie
 * @creat2020/06/09/20:08:14
 */
@Service
public class HouseStatusServiceimpl implements HouseStatusService {
    @Resource
    HouseStatusMapper houseStatusMapper;

    @Override
    public String select(Integer hsid) {

        return   houseStatusMapper.selectByPrimaryKey(hsid).getHsname();
    }
}
