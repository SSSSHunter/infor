package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.MakeWayMapper;
import com.woniu.housemanager.service.MakeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/08/20:19:28
 */
@Service
public class MakeServiceimpl implements MakeService {
    @Resource
    MakeWayMapper makeWayMapper;

    @Override
    public List MakeWay() {
        return makeWayMapper.selectByExample(null);
    }
}
