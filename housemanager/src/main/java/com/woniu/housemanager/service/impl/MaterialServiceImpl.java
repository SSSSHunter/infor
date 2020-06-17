package com.woniu.housemanager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.mapper.materialsMapper;
import com.woniu.housemanager.pojo.materials;
import com.woniu.housemanager.pojo.materialsExample;
import com.woniu.housemanager.service.MaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:MaterialServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/11 17:13
 * @Author:wang
 */
@Service
public class MaterialServiceImpl implements MaterialService {
    @Resource
    private materialsMapper materialsMapper;


    @Override
    public PageInfo<materials> findAll(Integer pageNum, Integer pageSize, String key) {
        PageHelper.startPage(pageNum,pageSize);
        materialsExample example = new materialsExample();
        materialsExample.Criteria criteria = example.createCriteria();
        if (key!=null && !key.equals("")) {
            criteria.andMnameLike("%" + key + "%");
        }
        List<materials> list = materialsMapper.selectByExample(example);
        return new PageInfo<>(list);
    }
}
