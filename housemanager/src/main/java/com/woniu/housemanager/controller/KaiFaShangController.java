package com.woniu.housemanager.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.housemanager.pojo.KaiFaShang;
import com.woniu.housemanager.service.KaiFaShangService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * @auther wangjie
 * @creat2020/06/12/15:38:49
 */
@RestController
@RequestMapping("/kaifashang")
public class KaiFaShangController {
    @Resource
    KaiFaShangService kaiFaShangService;
    @GetMapping("/list")
    public Object list(String companyname,Integer diid,Integer number){
        System.out.println(companyname);
        Object list=new Object();
        if(number==null){
            number=1;
        }
        PageHelper.startPage(number,2);
        if(diid!=null){
            list=kaiFaShangService.findone(diid);

        }else if(companyname==null){
            System.out.println("==============================");
           //list= kaiFaShangService.list();
            list = new PageInfo((List) kaiFaShangService.list());
        }else{
           //list= kaiFaShangService.condition(companyname);
            list = new PageInfo((List) kaiFaShangService.condition(companyname));

        }
        System.out.println(list);
        return list;
    }
    @PostMapping("/save")
    public String save(KaiFaShang kaiFaShang){

        String Message;
        try{
            kaiFaShangService.save(kaiFaShang);
            Message="新增成功";
        }catch (Exception e){
            Message="新增失败";
        }
        return Message;

    }
    @PostMapping("/update")
    public String update(KaiFaShang kaiFaShang){
        System.out.println(kaiFaShang);
        String Message;
        try {
            kaiFaShangService.update(kaiFaShang);
            Message="修改成功";
        }catch (Exception e){
            Message="修改失败";
        }
        return  Message;
    }
}
