package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.AreasMapper;
import com.woniu.housemanager.pojo.Areas;
import com.woniu.housemanager.service.AreaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/08/16:49:55
 */
@Service

public class AreaServiceimpl implements AreaService {
    @Resource
    AreasMapper areasMapper;
    @Override
    public List findAllArea() {
        return areasMapper.selectByExample(null);
    }


}
