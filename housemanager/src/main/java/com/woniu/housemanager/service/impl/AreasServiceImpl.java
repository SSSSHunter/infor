package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.AreasMapper;
import com.woniu.housemanager.service.AreasService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AreasServiceImpl implements AreasService {
    @Resource
    private AreasMapper areasMapper;
    @Override
    public List findAll() {
        return areasMapper.selectByExample(null);
    }
}
