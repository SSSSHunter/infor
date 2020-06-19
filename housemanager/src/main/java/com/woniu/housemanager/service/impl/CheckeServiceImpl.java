package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.CheckesMapper;
import com.woniu.housemanager.pojo.Checkes;
import com.woniu.housemanager.service.CheckeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName:CheckeServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/17 19:59
 * @Author:wang
 */
@Service
public class CheckeServiceImpl implements CheckeService {
    @Resource
    private CheckesMapper checkesMapper;

    @Override
    public void save(Checkes checkes) {
        checkesMapper.insertSelective(checkes);
    }
}
