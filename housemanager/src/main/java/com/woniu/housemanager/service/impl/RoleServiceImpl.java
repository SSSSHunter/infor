package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.RoleMapper;
import com.woniu.housemanager.pojo.Role;
import com.woniu.housemanager.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    RoleMapper roleMapper;
    public List<Role> findAll(){
        return  roleMapper.selectByExample(null);
    }
    public void save(Role role){
        roleMapper.insert(role);
    }

    @Override
    public void delete(Integer rid) {
        roleMapper.deleteByPrimaryKey(rid);
    }

    @Override
    public void update(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public Role findByRid(Integer rid) {
        return roleMapper.selectByPrimaryKey(rid);
    }
}
