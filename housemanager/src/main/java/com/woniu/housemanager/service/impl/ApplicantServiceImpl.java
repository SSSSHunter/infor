package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.ApplicantMapper;
import com.woniu.housemanager.pojo.Applicant;
import com.woniu.housemanager.service.ApplicantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ApplicantServiceImpl implements ApplicantService {
    @Resource
    private ApplicantMapper applicantMapper;

    @Override
    public void insert(Applicant a) {
        applicantMapper.insert(a);
    }
}
