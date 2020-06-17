package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.WorkerInfo;

import java.util.List;

public interface WorkerInfoService {
    void save(WorkerInfo workerInfo);
    List<WorkerInfo> findAll();
    WorkerInfo findByWid(Integer workid);
    void update(WorkerInfo workerInfo) ;
}
