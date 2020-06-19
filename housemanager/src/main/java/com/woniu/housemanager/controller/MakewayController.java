package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.MakeWayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/makeWay")
public class MakewayController {
    @Resource
    private MakeWayService makewayService;
    //获得方式
    @GetMapping("/findAll")
    public List findAll(){
        return makewayService.findAll();
    }

}
