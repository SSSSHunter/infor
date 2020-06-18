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
            upass=Md5.md5(upass);
            userInfo.setUpass(upass);
            userInfo.setIsdelete(true);
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
    @GetMapping("/userinfo/check")
    public String findUserInfo(UserInfo userInfo){
        userInfo.setUpass(Md5.md5(userInfo.getUpass()));
        userInfo=userInfoService.findByUserInfo(userInfo);
        if (userInfo!=null){
            return "true";
        }
        return "false";

    }
    @PostMapping("/userinfo/check")
    public String UpDatePwd(UserInfo userInfo,String newpass){
        userInfo.setUpass(Md5.md5(userInfo.getUpass()));
        newpass=Md5.md5(newpass);
        userInfo=userInfoService.findByUserInfo(userInfo);
        userInfo.setUpass(newpass);
        userInfoService.updpwd(userInfo);
        return "ok";

    }
    @PostMapping("/userinfo/isdelete")
    public String isDelete(UserInfo userInfo){
        userInfo=userInfoService.findByUid(userInfo.getUid());
        if (userInfo.getIsdelete()){
            userInfo.setIsdelete(false);
        }
        if (!userInfo.getIsdelete()){
            userInfo.setIsdelete(true);
        }

        userInfoService.updpwd(userInfo);
        return "ok";

    }
}
