package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.QiuDiHaoMapper;
import com.woniu.housemanager.pojo.QiuDiHao;
import com.woniu.housemanager.service.QiuDiHaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName:QiuDiHaoServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/10 15:51
 * @Author:wang
 */
@Service
public class QiuDiHaoServiceImpl implements QiuDiHaoService {

    @Resource
    private QiuDiHaoMapper qiuDiHaoMapper;

    @Override
    public void save(QiuDiHao qiuDiHao) {
        qiuDiHaoMapper.insertSelective(qiuDiHao);
    }
}
