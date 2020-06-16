package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Role;

import java.util.List;

public interface RoleTreeService {
    List<Integer> findByRid(Integer rid);
    void deleteByRid(Integer rid);
    void insertSome(Integer rid,Integer[] pids);
}
