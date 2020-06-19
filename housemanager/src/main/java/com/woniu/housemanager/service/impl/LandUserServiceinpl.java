package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.LandUseMapper;
import com.woniu.housemanager.service.LandUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/08/19:50:01
 */
@Service
public class LandUserServiceinpl implements LandUserService {
    @Resource
    LandUseMapper landUseMapper;

    @Override
    public List LandUserList() {
        return landUseMapper.selectByExample(null);
    }
}
