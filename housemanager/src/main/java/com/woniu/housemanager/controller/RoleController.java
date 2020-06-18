package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.Role;
import com.woniu.housemanager.pojo.UserInfo;
import com.woniu.housemanager.service.RoleService;
import com.woniu.housemanager.service.UserInfoRoleKeyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RoleController {
    @Resource
    RoleService roleService;
    @Resource
    UserInfoRoleKeyService userInfoRoleKeyService;
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
    @GetMapping("/role/findByUid")
    public Map<String,Object> findRoleByUid(Integer uid){
        Map<String ,Object> map=new HashMap<>();
        try {
            System.out.println(uid);
            List<Integer> rids=userInfoRoleKeyService.findByUid(uid);
            List<Role> list=roleService.findByRids(rids);
            List<Role> nlist=roleService.findNoRids(rids);
            map.put("inList",list);
            map.put("noList",nlist);

        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
        return  map;
    }
}
