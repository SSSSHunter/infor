package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.LayerMapper;
import com.woniu.housemanager.pojo.Layer;
import com.woniu.housemanager.pojo.LayerExample;
import com.woniu.housemanager.service.LayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther wangjie
 * @creat2020/06/09/20:03:59
 */
@Service
public class LayerServiceimpl implements LayerService {
    @Resource
    LayerMapper layerMapper;

    @Override
    public List<Layer> select(int louDongid) {
        LayerExample layerExample=new LayerExample();
        LayerExample.Criteria criteria=layerExample.createCriteria();
        criteria.andLoudongidEqualTo(louDongid);
        return  layerMapper.selectByExample(layerExample);
    }

    @Override
    public void save(Layer layer) {
        layerMapper.insertSelective(layer);
    }
}
