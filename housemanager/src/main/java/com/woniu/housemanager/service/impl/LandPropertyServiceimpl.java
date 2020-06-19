package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.LandPropertyMapper;
import com.woniu.housemanager.service.LandPropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/08/20:54:15
 */
@Service
public class LandPropertyServiceimpl implements LandPropertyService {
   @Resource
    LandPropertyMapper landPropertyMapper;
    @Override
    public List LandProperty() {
        return landPropertyMapper.selectByExample(null);
    }
}
