package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.CommercialhousingpresalepermitregistrationMapper;
import com.woniu.housemanager.pojo.Commercialhousingpresalepermitregistration;
import com.woniu.housemanager.service.CcPRegisterServce;
import com.woniu.housemanager.service.KaiFaShangService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @auther wangjie
 * @creat2020/06/16/14:55:53
 */
@Service
public class CcPRegisterServiceimpl implements CcPRegisterServce {
    @Resource
    CommercialhousingpresalepermitregistrationMapper commercialhousingpresalepermitregistrationMapper;
    @Resource
    KaiFaShangService kaiFaShangService;
    @Override
    public void save(Commercialhousingpresalepermitregistration cpm) {
        String Message;
          if((kaiFaShangService.selectname(cpm.getDanweimingcheng()))==null){
             Message="建设单位信息填写有误";
          }

        System.out.println(cpm);
        commercialhousingpresalepermitregistrationMapper.insert(cpm);
    }
}
