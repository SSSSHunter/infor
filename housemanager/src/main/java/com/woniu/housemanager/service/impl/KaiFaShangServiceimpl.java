package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.KaiFaShangMapper;
import com.woniu.housemanager.pojo.KaiFaShang;
import com.woniu.housemanager.pojo.KaiFaShangExample;
import com.woniu.housemanager.service.KaiFaShangService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther wangjie
 * @creat2020/06/10/19:47:28
 */
@Service
public class KaiFaShangServiceimpl implements KaiFaShangService {
    @Resource
    KaiFaShangMapper kaiFaShangMapper;

    @Override
    public String select(Integer diid) {

        return kaiFaShangMapper.selectByPrimaryKey(diid).getCompanyboss();
    }

    @Override
    public Object list() {
        return kaiFaShangMapper.selectByExample(null);
    }

    @Override
    public Object condition(String companyname) {
        KaiFaShangExample kaiFaShangExample=new KaiFaShangExample();
        KaiFaShangExample.Criteria criteria = kaiFaShangExample.createCriteria();
        criteria.andCompanynameLike("%"+companyname+"%");
        return kaiFaShangMapper.selectByExample(kaiFaShangExample);
    }

    @Override
    public void save(KaiFaShang kaiFaShang) {
        kaiFaShangMapper.insertSelective(kaiFaShang);
    }

    @Override
    public Object findone(Integer diid) {
        return kaiFaShangMapper.selectByPrimaryKey(diid);
    }

    @Override
    public void update(KaiFaShang kaiFaShang) {
        kaiFaShangMapper.updateByPrimaryKey(kaiFaShang);
    }

    @Override
    public Object selectname(String danweimingcheng) {
        KaiFaShangExample kaiFaShangExample=new KaiFaShangExample();
        KaiFaShangExample.Criteria criteria=kaiFaShangExample.createCriteria();
        criteria.andCompanynameEqualTo(danweimingcheng);
        return kaiFaShangMapper.selectByExample(kaiFaShangExample);
    }
}
