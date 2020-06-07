package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.UserInfo;

public interface UserInfoService {
    UserInfo findByName(String uname);
}
