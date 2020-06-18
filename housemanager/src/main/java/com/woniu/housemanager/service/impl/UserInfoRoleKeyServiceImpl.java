package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.UserInfoRoleMapper;
import com.woniu.housemanager.pojo.UserInfoRoleKey;
import com.woniu.housemanager.service.UserInfoRoleKeyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoRoleKeyServiceImpl implements UserInfoRoleKeyService {
    @Resource
    UserInfoRoleMapper userInfoRoleMapper;
    @Override
    public void save(UserInfoRoleKey userInfoRoleKey) {
        userInfoRoleMapper.insert(userInfoRoleKey);
    }

    @Override
    public List<Integer> findByUid(Integer uid) {
        List<Integer> list=userInfoRoleMapper.findByUid(uid);
        return list;
    }

    @Override
    public void addByUserRole(UserInfoRoleKey userInfoRoleKey) {
        userInfoRoleMapper.insert(userInfoRoleKey);
    }

    @Override
    public void delByUserRole(UserInfoRoleKey userInfoRoleKey) {
         userInfoRoleMapper.deleteByPrimaryKey(userInfoRoleKey);
    }
}
