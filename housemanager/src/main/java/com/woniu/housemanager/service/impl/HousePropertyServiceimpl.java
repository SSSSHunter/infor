package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HousePropertyMapper;
import com.woniu.housemanager.service.HousePropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HousePropertyServiceImpl implements HousePropertyService {
    @Resource
    private HousePropertyMapper housePropertyMapper;

    @Override
    public List HouseProperty() {
      return   housePropertyMapper.selectByExample(null);
    }

    @Override
    public List findAll() {
        return housePropertyMapper.selectByExample(null);
    }
}
