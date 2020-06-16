package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HousePropertyMapper;
import com.woniu.housemanager.service.HousePropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:HousePropertyServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/8 20:22
 * @Author:wang
 */
@Service
public class HousePropertyServiceImpl implements HousePropertyService {

    @Resource
    private HousePropertyMapper housePropertyMapper;
    @Override
    public List findAll() {
        return housePropertyMapper.selectByExample(null);
    }
}
