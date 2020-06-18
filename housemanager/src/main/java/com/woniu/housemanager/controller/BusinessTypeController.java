package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.Bussnesstype;
import com.woniu.housemanager.service.BusinessTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:BusinessTypeController
 * Package:controller
 * Description:
 *
 * @Date:2020/6/8 16:34
 * @Author:wang
 */
@RestController
@RequestMapping("/businessType")
public class BusinessTypeController {
    @Resource
    private BusinessTypeService businessTypeService;
    @GetMapping("/findAll")
    private List findAll(){
       return businessTypeService.findAll();
    }
    @GetMapping("/findById")
    private Bussnesstype findById(){
        return businessTypeService.findByBtid(1);
    }
}
