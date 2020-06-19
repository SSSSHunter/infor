package com.woniu.housemanager.controller;


import com.woniu.housemanager.pojo.Buildinginfo;
import com.woniu.housemanager.pojo.Layer;
import com.woniu.housemanager.pojo.Room;
import com.woniu.housemanager.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/10/22:12:25
 */
@RestController
@RequestMapping("/Theindividualinformation")
public class Theindividualinformation {
    @Resource
    BuildinginfoService buildinginfoService;
    @Resource
    LouDongService louDongService;
    @Resource
    LayerService layerService;
    @Resource
    RoomService roomService;
    @Resource
    HouseStatusService houseStatusService;
    @GetMapping("/list")
    public List list(Integer loudongid){
        System.out.println(loudongid+"第一页面的");
        List<Object> list=new ArrayList<>();
           List<Layer> ll = layerService.select(loudongid);
        for (int i = 0; i < ll.size(); i++) {
            List<Room> roomList=roomService.select(ll.get(i).getLayerid());
            for (int i1 = 0; i1 < roomList.size(); i1++) {
                System.out.println(roomList.get(i1));
                String status=houseStatusService.select(roomList.get(i1).getHsid());
                 roomList.get(i1).setColour(status);
                 roomList.get(i1).setHsname(roomList.get(i1).getRoomcode()+status);
                 roomList.get(i1).setCountlayer(ll.size());
                 roomList.get(i1).setCountRoom(roomList.size());
                 roomList.get(i1).setCurrentlayer(i1+1);
                 list.add(roomList.get(i1));
                System.out.println(roomList+"=============================================");
            }
        }
        return list;
    }
    @GetMapping("/showlistprojectname")
    public List showlist(){
        return buildinginfoService.showlist();
    }
    @GetMapping("/showlistloudongcode")
    public List showlistloudongcode(Integer buildingid){

        return louDongService.findAlllouid(buildingid);
    }
}
