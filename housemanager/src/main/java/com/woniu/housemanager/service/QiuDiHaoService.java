package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.QiuDiHao;

public interface QiuDiHaoService {
    void insert(QiuDiHao qiuDiHao);

    Integer selectByQiucard(String qiucard);
}
