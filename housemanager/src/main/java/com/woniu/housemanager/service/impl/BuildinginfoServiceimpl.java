package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.BuildinginfoMapper;
import com.woniu.housemanager.pojo.Buildinginfo;
import com.woniu.housemanager.service.BuildinginfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/10/16:29:37
 */
@Service
public class BuildinginfoServiceimpl implements BuildinginfoService {
    @Resource
    BuildinginfoMapper buildinginfoMapper;

    @Override
    public void save1(Buildinginfo buildinginfo) {
        buildinginfoMapper.insertSelective(buildinginfo);
    }

    @Override
    public Integer selectByid(Buildinginfo buildinginfo1) {
        return buildinginfoMapper.selectByid(buildinginfo1.getProjectname());
    }

    @Override
    public String selectByid(Integer buildingid) {

        return  buildinginfoMapper.selectByPrimaryKey(buildingid).getProjectname();
    }

    @Override
    public List showlist() {
        return buildinginfoMapper.selectByExample(null);
    }
}
