package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.HousePeopleMapper;
import com.woniu.housemanager.pojo.HousePeopleKey;
import com.woniu.housemanager.service.HousePeopleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:HousePeopleServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/17 16:20
 * @Author:wang
 */
@Service
public class HousePeopleServiceImpl implements HousePeopleService {

    @Resource
    private HousePeopleMapper housePeopleMapper;

    @Override
    public void save(HousePeopleKey housePeopleKey) {
        housePeopleMapper.insertSelective(housePeopleKey);
    }

    @Override
    public List findByhnid(int hnid) {
        return housePeopleMapper.findByhnid(hnid);
    }
}
