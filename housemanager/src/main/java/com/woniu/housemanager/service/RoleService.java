package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    void save(Role role);
    void delete(Integer rid);
    void update(Role role);
    Role findByRid(Integer rid);
}
