package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.TreeMapper;
import com.woniu.housemanager.pojo.Tree;
import com.woniu.housemanager.service.TreeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service

public class TreeServiceImpl implements TreeService {
    @Resource
    TreeMapper treeMapper;
    @Override
    public List<Tree> findAll() {
        return treeMapper.selectByExample(null);
    }
}
