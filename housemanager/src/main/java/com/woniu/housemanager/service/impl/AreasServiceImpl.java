package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.AreasMapper;
import com.woniu.housemanager.pojo.Areas;
import com.woniu.housemanager.service.AreasService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:AreasServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/8 14:44
 * @Author:wang
 */
@Service
public class AreasServiceImpl implements AreasService {

    @Resource
    private AreasMapper areasMapper;

    @Override
    public List<Areas> findAll() {
        return areasMapper.selectByExample(null);
    }
}
