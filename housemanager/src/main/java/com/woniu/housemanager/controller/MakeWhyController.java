package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.MakeWhyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.awt.*;
import java.util.List;

/**
 * ClassName:MakeWhyController
 * Package:controller
 * Description:
 *
 * @Date:2020/6/8 20:33
 * @Author:wang
 */
@RestController
@RequestMapping("/makeWhy")
public class MakeWhyController {
    @Resource
    private MakeWhyService makeWhyService;

    @GetMapping("/findAll")
    public List findAll(){
        return makeWhyService.findAll();
    }
}
