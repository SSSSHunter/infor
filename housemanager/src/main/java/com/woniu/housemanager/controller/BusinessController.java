package com.woniu.housemanager.controller;

import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.pojo.Bussnessstatus;
import com.woniu.housemanager.pojo.materials;
import com.woniu.housemanager.service.BusinessService;
import com.woniu.housemanager.service.MaterialService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:BusinessController
 * Package:controller
 * Description:
 *
 * @Date:2020/6/11 16:31
 * @Author:wang
 */
@RestController
@RequestMapping("/businessStatus")
public class BusinessController {
    @Resource
    private BusinessService businessService;
    @Resource
    private MaterialService materialService;

    @GetMapping("/findAll")
    public List findAll(){
        return businessService.findAll();
    }

    @GetMapping("/findById")
    public Bussnessstatus findById(String bsid){
        System.out.println(bsid);
        return businessService.findById(bsid);
    }

    @GetMapping("/mater")
    public PageInfo<materials> mater( Integer pageNum, Integer pageSize, String key){
        System.out.println(pageNum + "---" + pageSize);
        return materialService.findAll(pageNum, pageSize,key);
    }
}
