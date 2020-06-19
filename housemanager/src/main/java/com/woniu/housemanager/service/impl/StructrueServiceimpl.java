package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.StructrueMapper;
import com.woniu.housemanager.pojo.Structrue;
import com.woniu.housemanager.service.StructrueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/08/19:18:07
 */
@Service
public class StructrueServiceimpl implements StructrueService {
    @Resource
    StructrueMapper structrueMapper;

    @Override
    public List StructureList() {
        return structrueMapper.selectByExample(null);
    }
}
