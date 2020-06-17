package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.MakeWayMapper;
import com.woniu.housemanager.service.MakewayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MakewayServiceImpl implements MakewayService {
    @Resource
    private MakeWayMapper makeWayMapper;
    @Override
    public List findAll() {
        return makeWayMapper.selectByExample(null);
    }
}
