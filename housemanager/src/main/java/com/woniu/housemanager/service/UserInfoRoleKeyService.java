package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.UserInfoRoleKey;

import java.util.List;

public interface UserInfoRoleKeyService {
    void save(UserInfoRoleKey userInfoRoleKey);
    List<Integer> findByUid(Integer uid);
    void addByUserRole(UserInfoRoleKey userInfoRoleKey);
    void delByUserRole(UserInfoRoleKey userInfoRoleKey);
}
