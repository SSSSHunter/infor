package com.woniu.housemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buildinginfo {
    private Integer buildingid;
    private Integer areaid;
    private Integer hpid;
    private  String  companyname;
    private Integer lpid;
    private  String qiucard;
    private Integer purposeid;

    private Integer devisionid;
    private Integer qiuid;

    private Integer structureid;
    private Integer mwid;
    private Integer diid;
    private Integer lsid;
    private Integer loudongid;
    private String projectname;
    private String landcode;
    private String houseaddress;



}