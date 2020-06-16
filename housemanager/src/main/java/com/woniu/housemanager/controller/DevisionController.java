package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.DevisionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:DevisionController
 * Package:ontroller
 * Description:
 *
 * @Date:2020/6/9 17:03
 * @Author:wang
 */
@RestController
@RequestMapping("/division")
public class DevisionController {
    @Resource
    private DevisionService devisionService;

    @GetMapping("/findAll")
    public List findAll(){
        return devisionService.findAll();
    }
}
