package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.PresalePermitMapper;
import com.woniu.housemanager.service.PresalePermitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther wangjie
 * @creat2020/06/10/19:49:29
 */
@Service
public class PresalePermitServiceimpl implements PresalePermitService {
    @Resource
    PresalePermitMapper presalePermitMapper;

    @Override
    public String select(Integer pspid) {
        return  presalePermitMapper.selectByPrimaryKey(pspid).getPresalepermitcode();
    }
}
