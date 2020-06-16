package com.woniu.housemanager.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.housemanager.pojo.Role;
import com.woniu.housemanager.pojo.Tree;
import com.woniu.housemanager.service.RoleTreeService;
import com.woniu.housemanager.service.TreeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TreeController {
    @Resource
    TreeService treeService;
    @Resource
    RoleTreeService roleTreeService;
    @GetMapping("tree/getAllTree")
    public List<Tree> getAllTree(Role role) throws JsonProcessingException {
        System.out.println(role.getRid());
        ObjectMapper objectMapper=new ObjectMapper();
        List<Tree> list = null;
        try {
            List<Integer> pids=roleTreeService.findByRid(role.getRid());
            list=treeService.findAll();
            for (Tree tree : list) {
                if (pids.contains(tree.getId())) {
                    tree.setChecked(true);
                }
            }


        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return  list;
    }
    @PostMapping("role/assigntree")
    public String assignTree(String rid,String pids){
        String[] a=pids.split("&");
        Integer[] c= new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] =Integer.parseInt(a[i]);
        }
        roleTreeService.deleteByRid(Integer.parseInt(rid));
        roleTreeService.insertSome(Integer.parseInt(rid),c);
        return "ok";
    }
    @PostMapping("tree/save")
    public String addTree(Tree tree){
        try {
            treeService.save(tree);
        }catch (Exception e){
            e.printStackTrace();
            return  "no";
        }
        return "ok";

    }
    @PostMapping("tree/delete")
    public String delTree(Tree tree){
        try {
            treeService.deleteById(tree.getId());
        }catch (Exception e){
            e.printStackTrace();
            return  "no";
        }
        return "ok";

    }
    @PostMapping("tree/update")
    public String updTree(Tree tree){
        try {
            treeService.updateTree(tree);
        }catch (Exception e){
            e.printStackTrace();
            return  "no";
        }
        return "ok";

    }
    @GetMapping("/tree/getOneTree")
    public Tree findOneTree(Tree tree){
        try {
            tree=treeService.findById(tree.getId());
            System.out.println(tree.getName());
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
        return tree;

    }
}
