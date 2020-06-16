package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.ApplicantMapper;
import com.woniu.housemanager.pojo.Applicant;
import com.woniu.housemanager.service.ApplicantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName:ApplicantServiceImpl
 * Package:impl
 * Description:
 *
 * @Date:2020/6/10 14:21
 * @Author:wang
 */
@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Resource
    private ApplicantMapper applicantMapper;

    @Override
    public void save(Applicant applicant) {
        applicantMapper.insertSelective(applicant);
    }
}
