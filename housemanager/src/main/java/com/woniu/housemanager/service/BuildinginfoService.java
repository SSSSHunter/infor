package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Buildinginfo;

import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/10/16:29:16
 */
public interface BuildinginfoService  {
    void save1(Buildinginfo buildinginfo);

    Integer selectByid(Buildinginfo buildinginfo1);

    String selectByid(Integer buildingid);

    List showlist();
}
