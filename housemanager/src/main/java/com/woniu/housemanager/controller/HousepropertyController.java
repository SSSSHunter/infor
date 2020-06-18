package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.HousePropertyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:HousePropertyController
 * Package:controller
 * Description:
 *房屋性质
 * @Date:2020/6/8 20:25
 * @Author:wang
 */
@RestController
@RequestMapping("/houseProperty")
public class HousePropertyController {
    @Resource
    private HousePropertyService housePropertyService;

    @GetMapping("/findAll")
    public List findAll(){
        return housePropertyService.findAll();
    }
}
