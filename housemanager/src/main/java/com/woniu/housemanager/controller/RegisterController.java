package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.RegisterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:RegisterController
 * Package:controller
 * Description:
 *
 * @Date:2020/6/15 15:14
 * @Author:wang
 */
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Resource
    private RegisterService registerService;

    @GetMapping("/findAll")
    public List findAll(){
        return registerService.findAll();
    }

}
