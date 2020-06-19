package com.woniu.housemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LouDong {
    private Integer loudongid;
    private String loudongname;
    private String loudongcode;
    private Integer countlayer;
    private String counthouses;
    private Long countarea;
    private String info;
    private Integer buildingid;


}