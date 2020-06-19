package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.MortgagesTransferMapper;
import com.woniu.housemanager.pojo.MortgagesTransfer;
import com.woniu.housemanager.service.MortgagesTransferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MortgagesTransferImpl implements MortgagesTransferService {
    @Resource
    private MortgagesTransferMapper mortgagesTransferMapper;
    @Override
    public void insert(MortgagesTransfer mortgagesTransfer) {
        mortgagesTransferMapper.insert(mortgagesTransfer);
    }
}
