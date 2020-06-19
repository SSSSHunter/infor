package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.Commercialhousingpresalepermitregistration;
import com.woniu.housemanager.service.CcPRegisterServce;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther wangjie
 * @creat2020/06/16/14:54:03
 */
@RestController
@RequestMapping("/shangpinfangyushoudengji")
public class CcPRegisterController {
    @Resource
    CcPRegisterServce ccPRegisterServceimpl;
    @PostMapping("/save")
    public String save(Commercialhousingpresalepermitregistration cpm){
        System.out.println(cpm);
        String Message;
        try{
            ccPRegisterServceimpl.save(cpm);
            Message="录入成功";
        }catch (Exception e){
            Message="录入失败";
        }

      return Message;
    }

}
