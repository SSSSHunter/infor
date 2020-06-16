package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.DevisionMapper;
import com.woniu.housemanager.service.DevisionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:DevisionServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/9 17:01
 * @Author:wang
 */
@Service
public class DevisionServiceImpl implements DevisionService {

    @Resource
    private DevisionMapper devisionMapper;

    @Override
    public List findAll() {
        return devisionMapper.selectByExample(null);
    }
}
