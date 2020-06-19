package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.Layer;
import com.woniu.housemanager.pojo.LouDong;
import com.woniu.housemanager.pojo.Room;
import com.woniu.housemanager.service.LayerService;
import com.woniu.housemanager.service.LouDongService;
import com.woniu.housemanager.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/11/21:31:05
 */
@RestController
@RequestMapping("/Room")
public class RoomController {

    public Long   roomarea;
    @Resource
    LayerService layerService;
    @Resource
    RoomService roomService;
    @Resource
    LouDongService louDongService;
   //  @GetMapping("/condition")
//     public void condition(Integer loudongid){
//         if(loudongid==null){
//             loudongid=1;
//         }
//         System.out.println("===================================="+loudongid);
//         LouDong louDong=louDongService.condition(loudongid);
//         //每层房间数
//         int sumroom= Integer.parseInt(louDong.getCounthouses())/louDong.getCountlayer();
//         //层数
//         int laycecount=louDong.getCountlayer();
//         List<Layer> listlayer=layerService.select(loudongid);
//                 Room room=new Room();
//         for (Layer layer : listlayer) {
//             for (int i1 = 0; i1 < laycecount; i1++) {
//                 for (int i = 1; i < sumroom+1; i++) {
//                     if(i<10){
//                         room.setRoomcode(louDong.getLoudongname()+0+i);
//                     }else{
//                         room.setRoomcode(louDong.getLoudongname()+i);
//                     }
//                     room.setRoomarea(louDong.getCountarea()/Long.parseLong(louDong.getCounthouses()));
//                     room.setLayerid(layer.getLayerid());
//                     room.setHsid(2);
//                 }
//             }
//         }
//     }
//
//    @PostMapping("/save")
//    public String roomcode(String[] code){
//        Room room=new Room();
////        for (int i = 1; i <=this.count; i++) {
////            for (int i1 = 0; i1< code.length; i1++) {
////                room.setRoomcode(i+code[i1]);
////                room.setLayerid(i);
////                room.setRoomarea(this.roomarea);
////                room.setHsid(3);
////                roomService.save(room);
////            }
////        }





//        return "ok";
//    }
}
