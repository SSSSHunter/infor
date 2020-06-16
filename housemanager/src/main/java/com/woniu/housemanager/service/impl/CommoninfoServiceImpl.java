package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.CommoninfoMapper;
import com.woniu.housemanager.pojo.Commoninfo;
import com.woniu.housemanager.service.CommoninfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName:CommoninfoServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/10 15:54
 * @Author:wang
 */
@Service
public class CommoninfoServiceImpl implements CommoninfoService {
    @Resource
    private CommoninfoMapper commoninfoMapper;

    @Override
    public void save(Commoninfo commoninfo) {
        commoninfoMapper.insertSelective(commoninfo);
    }
}
