package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.UserInfoMapper;
import com.woniu.housemanager.pojo.UserInfo;
import com.woniu.housemanager.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    UserInfoMapper userInfoMapper;
    @Override
    public UserInfo findByName(String uname) {
        return userInfoMapper.findByUname(uname);
    }
}
