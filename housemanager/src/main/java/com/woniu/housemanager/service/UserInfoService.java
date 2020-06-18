package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    UserInfo findByName(String uname);
    List<UserInfo> findAll();
    void save(UserInfo userInfo);
    UserInfo findByUserInfo(UserInfo userInfo);
    void updpwd(UserInfo userInfo);
    UserInfo findByUid(Integer uid);
}
