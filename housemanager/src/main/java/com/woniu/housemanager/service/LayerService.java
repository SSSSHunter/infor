package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Layer;

import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/20:03:29
 */
public interface LayerService {
    List<Layer> select(int louDongid);

    void save(Layer layer);
}
