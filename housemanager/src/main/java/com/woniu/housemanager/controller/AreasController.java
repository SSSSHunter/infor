package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.AreasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 区
 */
@RestController
@RequestMapping("/areas")
public class AreasController {
    @Resource
    private AreasService areasService;
    //所有的区
    @GetMapping("/findAll")
    public List findAll(){
        return areasService.findAll();
    }
}
