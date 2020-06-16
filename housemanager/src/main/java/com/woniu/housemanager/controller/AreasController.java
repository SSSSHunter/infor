package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.Areas;
import com.woniu.housemanager.service.AreasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:AreasController
 * Package:controller
 * Description:
 *
 * @Date:2020/6/8 14:45
 * @Author:wang
 */
@RestController
@RequestMapping("/areas")
public class AreasController {
    @Resource
    private AreasService areasService;

    @GetMapping("/findAll")
    public List<Areas> findAll(){
        return areasService.findAll();
    }
}
