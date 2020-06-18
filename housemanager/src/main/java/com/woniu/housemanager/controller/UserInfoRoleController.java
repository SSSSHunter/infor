package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.UserInfoRoleKey;
import com.woniu.housemanager.service.UserInfoRoleKeyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserInfoRoleController {
    @Resource
    UserInfoRoleKeyService  userInfoRoleKeyService;
    @PostMapping("/userinforole/add")
    public String userRoleAdd(UserInfoRoleKey userInfoRoleKey){
        System.out.println("diaoyongmei");
        userInfoRoleKeyService.addByUserRole(userInfoRoleKey);
        return  "ok";
    }
    @PostMapping("/userinforole/del")
    public String userRoleDel(UserInfoRoleKey userInfoRoleKey){
        userInfoRoleKeyService.delByUserRole(userInfoRoleKey);
        return  "ok";
    }
}
