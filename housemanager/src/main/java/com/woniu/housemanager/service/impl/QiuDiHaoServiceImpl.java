package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.QiuDiHaoMapper;
import com.woniu.housemanager.pojo.QiuDiHao;
import com.woniu.housemanager.pojo.QiuDiHaoExample;
import com.woniu.housemanager.service.QiuDiHaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QiuDiHaoServiceImpl implements QiuDiHaoService {
    @Resource
    private QiuDiHaoMapper qiuDiHaoMapper;

    @Override
    public void insert(QiuDiHao qiuDiHao) {
        qiuDiHaoMapper.insert(qiuDiHao);
    }

    @Override
    public Integer selectByQiucard(String qiucard) {
        QiuDiHaoExample qiuDiHaoExample = new QiuDiHaoExample();
        QiuDiHaoExample.Criteria criteria = qiuDiHaoExample.createCriteria();
        criteria.andQiucardEqualTo(qiucard);
        List<QiuDiHao> l  = qiuDiHaoMapper.selectByExample(qiuDiHaoExample);
        return l.get(0).getQiuid();
    }
}
