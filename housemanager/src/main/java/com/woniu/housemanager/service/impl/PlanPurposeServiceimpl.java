package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.PlanPurposeMapper;
import com.woniu.housemanager.service.PlanPurposeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/13:12:19
 * 设计用途
 */
@Service
public class PlanPurposeServiceimpl implements PlanPurposeService {
    @Resource
    PlanPurposeMapper planPurposeMapper;

    @Override
    public List PlanProperty() {
        return planPurposeMapper.selectByExample(null);
    }
}
