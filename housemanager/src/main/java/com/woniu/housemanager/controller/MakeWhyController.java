package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.MakewayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    private MakewayService makeWayService;

    @GetMapping("/findAll")
    public List findAll(){
        return makeWayService.findAll();
    }
}
