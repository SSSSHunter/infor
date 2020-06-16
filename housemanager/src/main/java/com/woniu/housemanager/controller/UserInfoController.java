package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.UserInfo;
import com.woniu.housemanager.pojo.UserInfoRoleKey;
import com.woniu.housemanager.pojo.WorkerInfo;
import com.woniu.housemanager.service.UserInfoRoleKeyService;
import com.woniu.housemanager.service.UserInfoService;
import com.woniu.housemanager.service.WorkerInfoService;
import com.woniu.housemanager.tools.Md5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserInfoController {
    @Resource
    UserInfoService userInfoService;
    @Resource
    WorkerInfoService workerInfoServicel;
    @Resource
    UserInfoRoleKeyService userInfoRoleKeyService;
    @PostMapping("/userinfo/save")
    public  String save( UserInfo userInfo, WorkerInfo workerInfo,UserInfoRoleKey userInfoRoleKey){
        try {
            String upass="123456";
            System.out.println(userInfo.getUname());
            System.out.println(workerInfo.getWorkname());
            upass=Md5.md5(upass);
            userInfo.setUpass(upass);
            userInfoService.save(userInfo);
            System.out.println(userInfo.getUid());
            workerInfo.setUid(userInfo.getUid());
            workerInfoServicel.save(workerInfo);
            userInfoRoleKey.setUid(userInfo.getUid());
            userInfoRoleKeyService.save(userInfoRoleKey);
        }catch(Exception e){
            e.printStackTrace();
            return "no";
        }
            return "yes";
    }
    @GetMapping("/userinfo/findAll")
    public Map<String, List> findAll(){
        Map<String, List> map=new HashMap<>();
        List<UserInfo> list=userInfoService.findAll();
        List<WorkerInfo> wlist=workerInfoServicel.findAll();
        map.put("ulist",list);
        map.put("wlist",wlist);
        return map;

    }
    @GetMapping("/userinfo/findByWid")
    public WorkerInfo findWorkInfoByUid(WorkerInfo workerInfo){
        workerInfo=workerInfoServicel.findByWid(workerInfo.getWorkid());
        return workerInfo;

    }
    @PostMapping("/userinfo/update")
    public String UpDate(WorkerInfo workerInfo){
        workerInfoServicel.update(workerInfo);
        return "ok";

    }
}
