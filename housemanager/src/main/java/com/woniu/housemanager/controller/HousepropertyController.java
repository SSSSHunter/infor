package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.HousePropertyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
/**
 * 房屋性质
 */
@RestController
@RequestMapping("/houseProperty")
public class HousepropertyController {
    @Resource
    private HousePropertyService housePropertyService;
    //所有的房屋性质
    @GetMapping("/findAll")
    public List findAll(){

        //System.out.println(httpServletRequest.getRequestURL());

        return housePropertyService.findAll();
    }
}
