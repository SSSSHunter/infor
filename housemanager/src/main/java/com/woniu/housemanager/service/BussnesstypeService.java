package com.woniu.housemanager.service;

import java.util.List;

public interface BussnesstypeService {
    //所有的他项权
    List findAllMortgages();
    //他项权需要的资料
    List findAllMaterials(String bdname);

    List findall();
    //一般抵押所需材料
    List ybdy(String bdname);
}
