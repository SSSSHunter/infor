package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.BussnesstypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/**
 * 业务类型
 */
@RestController
@RequestMapping("/mortgages")
public class BussnesstypeController {
    @Resource
    private BussnesstypeService bussnesstypeService;

    //所有的他项权名称
    @GetMapping("/BussnesstypefindAll")
    public List findMortgages(){
        return bussnesstypeService.findAllMortgages();
    }
    //他项权所需材料
    @PostMapping("/MaterialsfindAll")
    public List MaterialsfindAll(String bdname){
        return bussnesstypeService.findAllMaterials(bdname);
    }
    //申请
    @PostMapping("/apply")
    public void apply(String aname,String acard){
        System.out.println(aname);
        System.out.println(acard);
    }
    //所有登记种类
    @GetMapping("/findall")
    public List findall(){
        return bussnesstypeService.findall();
    }
    //一般抵押所需材料
    @PostMapping("/ybdy")
    public List ybdy(String bdname){
        return bussnesstypeService.ybdy(bdname);
    }
}
