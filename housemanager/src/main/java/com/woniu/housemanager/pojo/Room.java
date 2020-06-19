package com.woniu.housemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private Integer roomid;
    private Integer layerid;
    private Integer hsid;
    private  String hsname;
    private Long roomarea;
    private String roomcode;
    private Integer countlayer;
    private Integer countRoom;
    private String colour;
    private Integer currentlayer;

}