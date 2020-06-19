package com.woniu.housemanager.controller;


import com.woniu.housemanager.pojo.Buildinginfo;
import com.woniu.housemanager.pojo.Layer;
import com.woniu.housemanager.pojo.LouDong;
import com.woniu.housemanager.pojo.Room;
import com.woniu.housemanager.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther wangjie
 * @creat2020/06/08/14:19:17
 */
@RestController
public class DevelopersController {
    @Resource
    RoomService roomService;
    @Resource
    LayerService layerService;
    @Resource
    AreaService areaServiceimpl;
    @Resource
    DevisionService devisionService;
    @Resource
    StructrueService structrueService;
    @Resource
    LandUserService landUserService;
    @Resource
    MakeService makeService;
    @Resource
    HousePropertyService housePropertyService;
    @Resource
    PlanPurposeService planPurposeService;
    @Resource
    LandPropertyService landPropertyService;
    @Resource
    BuildinginfoService buildinginfoService;
    @Resource
    LouDongService louDongService;
    private int num ;
    @GetMapping ("/findAllArea")
        public List findAllArea(){
           List list= areaServiceimpl.findAllArea();
           return list;
        }
        @GetMapping("/findAreaByid")
       public List findAreaByid(Integer areaid){
           return devisionService.findAreaByid(areaid);
        }
        @GetMapping("/StructureList")
       public List StructureList(){
          return structrueService.StructureList();
        }
        @GetMapping("/LandUser")
       public List LandUserList(){
          return landUserService.LandUserList();
        }
        @GetMapping("/MakeWay")
      public List MakeWay(){
        return makeService.MakeWay();
        }
       @GetMapping("/HouseProperty")
     public List HouseProperty(){
        return housePropertyService.HouseProperty();
       }
       @GetMapping("/PlanProperty")
    public List PlanProperty(){
        return planPurposeService.PlanProperty();
       }
       @GetMapping("/LandProperty")
    public List LandProperty(){
        return landPropertyService.LandProperty();
       }
       @PostMapping("/save")
    public List save(String[] loudongname,String[] loudongcode,String[] countlayer,String[]  counthouses,String[]  countarea,String[] info,String  num1){

        List<Object> list=new ArrayList<>();
        int num=0;
        for (int i = 1; i < loudongname.length; i++) {
            LouDong louDong=new LouDong();
            louDong.setLoudongname(loudongname[i]);
            louDong.setLoudongcode(loudongcode[i]);
            louDong.setCountlayer( Integer.parseInt(countlayer[i]));
            louDong.setCounthouses(counthouses[i]);
            louDong.setCountarea(  Long.parseLong(countarea[i]));
            louDong.setInfo(info[i]);
            louDong.setBuildingid(Integer.parseInt(num1));
            louDongService.save(louDong);

            for (Integer integer = 1; integer <= louDong.getCountlayer(); integer++) {
                Layer layer=new Layer();
                layer.setLoudongid(louDong.getLoudongid());
                layer.setLaycode(integer);
                layer.setLayerarea(louDong.getCountarea()/louDong.getCountlayer());
                layer.setLayhouses(Integer.parseInt(louDong.getCounthouses())/louDong.getCountlayer());
                layerService.save(layer);
                Room room=new Room();

                for (Integer i1 = 0; i1 < layer.getLayhouses(); i1++) {
                    room.setLayerid(layer.getLayerid());
                    if(layer.getLayhouses()<10){
                        room.setRoomcode(louDong.getLoudongname()+0+i1);
                    }else{
                        room.setRoomcode(louDong.getLoudongname()+0+i1);
                    }
                    room.setHsid(2);
                    room.setRoomarea(louDong.getCountarea()/Long.parseLong(louDong.getCounthouses()));
                    System.out.println(room);
                    roomService.save(room);

                }


            }


            list.add(louDong);
           }

        return list;
       }
       @PostMapping("/save1")
       public Integer save1(Buildinginfo buildinginfo)  {
           System.out.println(buildinginfo);

           buildinginfoService.save1(buildinginfo);
           num=buildinginfo.getBuildingid();


         return  num;

       }
    public void condition(Integer loudongid){
        if(loudongid==null){
            loudongid=1;
        }

        System.out.println("===================================="+loudongid);
        LouDong louDong=louDongService.condition(loudongid);
        //每层房间数
        int sumroom= Integer.parseInt(louDong.getCounthouses())/louDong.getCountlayer();
        //层数
        int laycecount=louDong.getCountlayer();
        List<Layer> listlayer=layerService.select(loudongid);
        System.out.println(listlayer);
        Room room=new Room();
        for (Layer layer : listlayer) {
            for (int i1 = 0; i1 < laycecount; i1++) {
                for (int i = 1; i < sumroom+1; i++) {
                    if(i<10){
                        room.setRoomcode(louDong.getLoudongname()+0+i);
                    }else{
                        room.setRoomcode(louDong.getLoudongname()+i);
                    }
                    room.setRoomarea(louDong.getCountarea()/Long.parseLong(louDong.getCounthouses()));
                    room.setLayerid(layer.getLayerid());
                    room.setHsid(2);
                    System.out.println(room);
                  roomService.save(room);
                }
            }
        }
    }
}
