package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.RoleTreeMapper;
import com.woniu.housemanager.pojo.RoleTree;
import com.woniu.housemanager.service.RoleTreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleTreeServiceImpl implements RoleTreeService {
    @Resource
    RoleTreeMapper roleTreeMapper;
    @Override
    public List<Integer> findByRid(Integer rid) {
        List<Integer> list=roleTreeMapper.selectByRid(rid);
        return list;
    }

     @Override
     public void deleteByRid(Integer rid) {
         roleTreeMapper.deleteByRid(rid);
     }

     @Override
     public void insertSome(Integer rid, Integer[] pids) {
         Map<String,Object> map=new HashMap<>();
         map.put("rid",rid);
         map.put("pids",pids);
         roleTreeMapper.insertSome(map);
     }
 }
