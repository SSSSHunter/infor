package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.KaiFaShang;

/**
 * @auther wangjie
 * @creat2020/06/10/19:47:11
 */
public interface KaiFaShangService {


    String select(Integer diid);

    Object list();

    Object condition(String companyname);

    void save(KaiFaShang kaiFaShang);

    Object findone(Integer diid);

    void update(KaiFaShang kaiFaShang);


    Object selectname(String danweimingcheng);
}
