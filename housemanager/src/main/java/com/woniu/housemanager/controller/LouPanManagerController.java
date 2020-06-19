package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.Buildinginfo;
import com.woniu.housemanager.pojo.LouPanManager;
import com.woniu.housemanager.service.BuildinginfoService;
import com.woniu.housemanager.service.KaiFaShangService;
import com.woniu.housemanager.service.LoupanMangerService;
import com.woniu.housemanager.service.PresalePermitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 13933
 * @auther wangjie
 * @creat2020/06/10/19:52:39
 */
@RestController
@RequestMapping("/loupangManager")
public class LouPanManagerController {
    @Resource
    KaiFaShangService kaiFaShangService;
    @Resource
    BuildinginfoService buildinginfoService;
    @Resource
    PresalePermitService presalePermitService;
    @Resource
    LoupanMangerService loupanMangerService;

    @GetMapping("/list")
    public List list(){
        List<LouPanManager> louPanManagerList=new ArrayList<>();
        List<LouPanManager> list=loupanMangerService.list();
        for (int i = 0; i < list.size(); i++) {
          LouPanManager louPanManager=list.get(i);
          louPanManager.setProjectname(buildinginfoService.selectByid(louPanManager.getBuildingid()));
          louPanManager.setLoupanmanager(kaiFaShangService.select(louPanManager.getDiid()));
          louPanManager.setPresalepermitcode(presalePermitService.select(louPanManager.getPspid()));
          louPanManagerList.add(louPanManager);
        }
       return louPanManagerList;

    }
}
