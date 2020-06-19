package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.RoomMapper;
import com.woniu.housemanager.pojo.Room;
import com.woniu.housemanager.pojo.RoomExample;
import com.woniu.housemanager.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/19:58:18
 */
@Service
public class RoomServiceimpl implements RoomService {
    @Resource
    RoomMapper roomMapper;

    @Override
    public List<Room> select(Integer layerid) {
        RoomExample roomExample=new RoomExample();
        RoomExample.Criteria criteria=roomExample.createCriteria();
        criteria.andLayeridEqualTo(layerid);
        return roomMapper.selectByExample(roomExample);
    }

    @Override
    public void save(Room room) {
        roomMapper.insertSelective(room);
    }


}
