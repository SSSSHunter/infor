package com.woniu.housemanager.service;

import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.pojo.Bussnessstatus;

import java.util.List;

public interface BussnessstatusService {
    void insert(Bussnessstatus bussnessstatus);
    PageInfo<Bussnessstatus> findAll(Integer pageNum, Integer pageSize, String acard);
    PageInfo<Bussnessstatus> ybdydjfindAll(Integer pageNum, Integer pageSize, String acard);
    PageInfo<Bussnessstatus> ybdyzydjfindAll(Integer pageNum, Integer pageSize, String acard);
    PageInfo<Bussnessstatus> ybdyzxdjfindAll(Integer pageNum, Integer pageSize, String acard);
}
