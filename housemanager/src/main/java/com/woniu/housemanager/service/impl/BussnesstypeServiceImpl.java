package com.woniu.housemanager.service.impl;

import com.woniu.housemanager.mapper.BunessdetialsMapper;
import com.woniu.housemanager.mapper.BussnesstypeMapper;
import com.woniu.housemanager.mapper.materialsMapper;
import com.woniu.housemanager.pojo.Bunessdetials;
import com.woniu.housemanager.pojo.materials;
import com.woniu.housemanager.service.BussnesstypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BussnesstypeServiceImpl implements BussnesstypeService {
    @Resource
    private BussnesstypeMapper bussnesstypeMapper;
    @Resource
    private BunessdetialsMapper bunessdetialsMapper;
    @Resource
    private materialsMapper materialsMapper;

    //所有的他项权名
    @Override
    public List findAllMortgages() {
        return bunessdetialsMapper.findAllMortgages(2);
    }
    //他项权需要的资料
    @Override
    public List findAllMaterials(String bdname) {
        List<String> mnames = new ArrayList<>();
        List l = bunessdetialsMapper.findAllMaterials(bdname);
        //System.out.println("-------------------------"+l.size());
        for (Object b: l) {
            Integer mid = ((Bunessdetials)b).getMid();
            materials m = materialsMapper.selectByPrimaryKey(mid);
            //System.out.println(m);
                String name = m.getMname();
                //System.out.println("-------------------------"+name);
                mnames.add(m.getMname());
        }
        //System.out.println(mnames);
        return mnames;
    }

    @Override
    public List findall() {
        return bussnesstypeMapper.selectByExample(null);
    }

    @Override
    public List ybdy(String bdname) {
        List<String> mnames = new ArrayList<>();
        List l = bunessdetialsMapper.findAllMaterials(bdname);
        for (Object b: l) {
            Integer mid = ((Bunessdetials)b).getMid();
            materials m = materialsMapper.selectByPrimaryKey(mid);
            String name = m.getMname();
            mnames.add(m.getMname());
        }
        return mnames;
    }
}
