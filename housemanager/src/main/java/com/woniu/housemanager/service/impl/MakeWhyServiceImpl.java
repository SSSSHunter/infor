package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.MakeWayMapper;
import com.woniu.housemanager.service.MakeWhyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:MakeWhyServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/8 20:32
 * @Author:wang
 */
@Service
public class MakeWhyServiceImpl implements MakeWhyService {
    @Resource
    private MakeWayMapper makeWayMapper;

    @Override
    public List findAll() {
        return makeWayMapper.selectByExample(null);
    }
}
