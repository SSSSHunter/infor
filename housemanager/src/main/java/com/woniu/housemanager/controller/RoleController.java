package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.Role;
import com.woniu.housemanager.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RoleController {
    @Resource
    RoleService roleService;
    @GetMapping("/role/findAll")
    public List<Role> findAll(){
        List<Role> list=roleService.findAll();
        return  list;
    }
    @PostMapping("/role/save")
    public String save(Role role){

        try {
            roleService.save(role);
            return "ok";

        }catch (Exception e){
            e.printStackTrace();
        }finally {
           return  "no";
        }
    }
    @PostMapping("/role/delete")
    public String delete(Role role){

        try {
            roleService.delete(role.getRid());
            return "ok";

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return  "no";
        }
    }
    @PostMapping("/role/update")
    public String update(Role role){

        try {
            roleService.update(role);
            System.out.println("cesh");
            return "ok";

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return  "no";
        }
    }
    @GetMapping("/role/findByRid")
    public Role findRole(Role role){

        try {
            role=roleService.findByRid(role.getRid());


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return  role;
        }
    }
}
