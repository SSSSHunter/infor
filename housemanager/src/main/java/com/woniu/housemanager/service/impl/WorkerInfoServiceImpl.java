package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.WorkerInfoMapper;
import com.woniu.housemanager.pojo.WorkerInfo;
import com.woniu.housemanager.service.WorkerInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkerInfoServiceImpl implements WorkerInfoService {
    @Resource
    WorkerInfoMapper workerInfoMapper;
    @Override
    public void save(WorkerInfo workerInfo) {
        workerInfoMapper.insert(workerInfo);
    }

    @Override
    public List<WorkerInfo> findAll() {
        return workerInfoMapper.selectByExample(null);
    }

    @Override
    public WorkerInfo findByWid(Integer workid) {
        return workerInfoMapper.selectByPrimaryKey(workid);
    }

    @Override
    public void update(WorkerInfo workerInfo) {
        workerInfoMapper.updateByPrimaryKeySelective(workerInfo);
    }


}
