package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.UserInfoRoleMapper;
import com.woniu.housemanager.pojo.UserInfoRoleKey;
import com.woniu.housemanager.service.UserInfoRoleKeyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoRoleKeyServiceImpl implements UserInfoRoleKeyService {
    @Resource
    UserInfoRoleMapper userInfoRoleMapper;
    @Override
    public void save(UserInfoRoleKey userInfoRoleKey) {
        userInfoRoleMapper.insert(userInfoRoleKey);
    }
}
