package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Room;

import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/19:57:48
 */
public interface RoomService {
    List<Room> select(Integer layerid);

    void save(Room room);
}
