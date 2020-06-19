package com.woniu.housemanager.controller;

import com.woniu.housemanager.service.HousePeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:HousePeople
 * Package:controller
 * Description:
 *
 * @Date:2020/6/17 16:47
 * @Author:wang
 */
@RestController
@RequestMapping("/housePeople")
public class HousePeople {
    @Resource
    private HousePeopleService housePeopleService;

    @GetMapping("/findByhnid")
    public List findByhnid(int hnid){
        return housePeopleService.findByhnid(hnid);
    }
}
