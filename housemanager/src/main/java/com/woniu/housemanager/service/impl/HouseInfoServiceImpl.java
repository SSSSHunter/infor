package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HouseInfoMapper;
import com.woniu.housemanager.pojo.HouseInfo;
import com.woniu.housemanager.pojo.HouseInfoExample;
import com.woniu.housemanager.service.HouseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseInfoServiceImpl implements HouseInfoService {
    @Resource
    private HouseInfoMapper houseInfoMapper;

    @Override
    public HouseInfo selectByQiuid(Integer qiuid) {
        HouseInfoExample houseInfoExample = new HouseInfoExample();
        HouseInfoExample.Criteria criteria = houseInfoExample.createCriteria();
        criteria.andQiuidEqualTo(qiuid);
        List<HouseInfo> l = houseInfoMapper.selectByExample(houseInfoExample);
        return l.get(0);
    }
    //根据房产证号得到房屋信息
    @Override
    public HouseInfo selectByPropertyrightcode(String propertyrightcode) {
        HouseInfoExample houseInfoExample = new HouseInfoExample();
        HouseInfoExample.Criteria criteria = houseInfoExample.createCriteria();
        criteria.andPropertyrightcodeEqualTo(propertyrightcode);
        List<HouseInfo> l = houseInfoMapper.selectByExample(houseInfoExample);
        return l.get(0);
    }

    @Override
    public HouseInfo selectByHiid(Integer hiid) {
        return houseInfoMapper.selectByPrimaryKey(hiid);
    }

}
