package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.MakewayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/makeWay")
public class MakewayController {
    @Resource
    private MakewayService makewayService;
    //获得方式
    @GetMapping("/findAll")
    public List findAll(){
        return makewayService.findAll();
    }

}
