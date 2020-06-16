package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.RegisterMapper;
import com.woniu.housemanager.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:RegisterServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/15 15:12
 * @Author:wang
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterMapper registerMapper;

    @Override
    public List findAll() {
        return registerMapper.selectByExample(null);
    }
}
