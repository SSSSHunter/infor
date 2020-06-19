package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HousePropertyMapper;
import com.woniu.housemanager.pojo.HouseProperty;
import com.woniu.housemanager.service.HousePropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/09:03:13
 * 房屋性质
 */
@Service
public class HousePropertyServiceimpl implements HousePropertyService {
    @Resource
    HousePropertyMapper housePropertyMapper;

    @Override
    public List HouseProperty() {
        return housePropertyMapper.selectByExample(null);

    }
}
