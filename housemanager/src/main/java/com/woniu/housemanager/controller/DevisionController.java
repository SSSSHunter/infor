package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.DevisionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 区划
 */
@RestController
@RequestMapping("/devision")
public class DevisionController {

    @Resource
    private DevisionService devisionService;
    //所有的区划
    @GetMapping("/findAll")
    public List findAll(){
        return devisionService.findAll();
    }
}
