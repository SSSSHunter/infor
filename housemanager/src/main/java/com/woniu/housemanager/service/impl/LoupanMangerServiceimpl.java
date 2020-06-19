package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.LouPanManagerMapper;
import com.woniu.housemanager.service.LoupanMangerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/10/19:45:04
 */
@Service
public class LoupanMangerServiceimpl implements LoupanMangerService {
    @Resource
    LouPanManagerMapper louPanManagerMapper;
    @Override
    public List list() {
        return louPanManagerMapper.selectByExample(null);
    }
}
