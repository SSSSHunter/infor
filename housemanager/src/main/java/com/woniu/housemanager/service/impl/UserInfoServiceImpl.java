package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.UserInfoMapper;
import com.woniu.housemanager.pojo.UserInfo;
import com.woniu.housemanager.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    UserInfoMapper userInfoMapper;
    @Override
    public UserInfo findByName(String uname) {
        return userInfoMapper.findByUname(uname);
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectByExample(null);
    }

    @Override
    public void save(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    @Override
    public UserInfo findByUserInfo(UserInfo userInfo) {
        return userInfoMapper.findByUserInfo(userInfo);
    }

    @Override
    public void updpwd(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public UserInfo findByUid(Integer uid) {
        return userInfoMapper.selectByPrimaryKey(uid);
    }
}
