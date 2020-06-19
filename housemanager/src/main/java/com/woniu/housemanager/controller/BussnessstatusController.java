package com.woniu.housemanager.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.pojo.Bussnessstatus;
import com.woniu.housemanager.service.BussnessstatusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Bussnessstatus")
public class BussnessstatusController {
    @Resource
    private BussnessstatusService bussnessstatusService;

    //所有的一般抵押变更登记业务
    @PostMapping("/ybdybgdjfindAll1")
    public PageInfo<Bussnessstatus> ybdybgdjfindAll1(String acard,Integer pageNum,Integer pageSize){
        return bussnessstatusService.findAll(pageNum, pageSize,acard);
    }
    //所有的一般抵押转移登记业务
    @PostMapping("/ybdyzydjfindAll1")
    public PageInfo<Bussnessstatus> ybdyzydjfindAll1(String acard,Integer pageNum,Integer pageSize){
        return bussnessstatusService.ybdyzydjfindAll(pageNum, pageSize,acard);
    }
    //所有的一般抵押登记业务
    @PostMapping("/ybdydjfindAll1")
    public PageInfo<Bussnessstatus> ybdydjfindAll1(String acard,Integer pageNum,Integer pageSize){
        return bussnessstatusService.ybdydjfindAll(pageNum, pageSize,acard);
    }
    //所有的一般抵押注销业务
    @PostMapping("/ybdyzxfindAll1")
    public PageInfo<Bussnessstatus> ybdyzxfindAll1(String acard,Integer pageNum,Integer pageSize){
        return bussnessstatusService.ybdyzxdjfindAll(pageNum, pageSize,acard);
    }
}
